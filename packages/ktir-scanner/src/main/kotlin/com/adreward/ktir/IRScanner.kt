package com.adreward.ktir

import org.jetbrains.kotlin.cli.common.CLIConfigurationKeys
import org.jetbrains.kotlin.cli.common.messages.MessageRenderer
import org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.cli.jvm.config.addJvmClasspathRoots
import org.jetbrains.kotlin.config.CommonConfigurationKeys
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.visitors.acceptChildrenVoid
import org.jetbrains.kotlin.ir.visitors.acceptVoid
import org.jetbrains.kotlin.com.intellij.openapi.Disposable
import org.jetbrains.kotlin.ir.declarations.IrFile
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid
import java.lang.reflect.Method

import java.io.File
import java.util.ServiceLoader
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import kotlin.system.measureTimeMillis

/**
 * Scanner that analyzes Kotlin IR for hook patterns.
 * This implementation uses the Kotlin compiler to generate IR and analyze it.
 */
class IRScanner(private val ctx: ScanCtx) {
    // Load hook families using ServiceLoader
    private val families: List<HookFamily> = ServiceLoader.load(HookFamily::class.java).toList()
        .filter { it.name in ctx.familyNames }
    
    // Determine optimal number of threads for parallel processing
    private val numThreads = Runtime.getRuntime().availableProcessors().coerceAtMost(4) // Limit to reasonable number
    
    // Flag for detailed timing
    private val showTimings = System.getProperty("ktir.timings") == "true"
    
    /**
     * Scan a list of JAR files for hooks.
     * If multiple JARs are provided and we have multiple CPU cores available,
     * we'll process JARs in parallel for better performance.
     * 
     * @param jars The JAR files to scan
     */
    fun scanJars(jars: List<File>) {
        logInfo("Scanning ${jars.size} JARs for hook families: ${ctx.familyNames.joinToString(", ")}")
        logInfo("Using $numThreads worker threads for parallel processing")
        
        val totalTime = measureTimeMillis {
            try {
                if (jars.size > 1 && numThreads > 1) {
                    scanInParallel(jars)
                } else {
                    scanSequential(jars)
                }
            } catch (e: Exception) {
                logError("Error scanning JARs: ${e.message}")
                e.printStackTrace()
            }
        }
        
        logInfo("Total scan completed in ${totalTime}ms")
    }
    
    /**
     * Scan JARs in parallel using multiple threads
     */
    private fun scanInParallel(jars: List<File>) {
        val executorService = Executors.newFixedThreadPool(numThreads)
        
        try {
            // Split JARs into roughly equal chunks
            val jarChunks = splitIntoChunks(jars, numThreads)
            
            logTiming("Parallel processing with ${jarChunks.size} chunks")
            
            // Create sub-contexts for each chunk
            val subContexts = jarChunks.map { ScanCtx(ctx.familyNames) }
            
            // Create tasks for sequential scanning of each chunk
            val futures = ArrayList<Future<*>>(jarChunks.size)
            
            jarChunks.forEachIndexed { index, chunk -> 
                val future = executorService.submit { 
                    val chunkTime = measureTimeMillis {
                        // Don't create new IRScanner instances - just process the jars directly
                        processJarsSequentially(chunk, subContexts[index])
                    }
                    logTiming("Chunk $index completed in ${chunkTime}ms")
                }
                futures.add(future)
            }
            
            // Wait for all tasks to complete
            for (future in futures) {
                future.get()  // This will throw if any task failed
            }
            
            // Merge results from all sub-contexts
            val mergeTime = measureTimeMillis {
                for (subCtx in subContexts) {
                    ctx.mergeFrom(subCtx)
                }
            }
            logTiming("Merged results from ${subContexts.size} parallel workers in ${mergeTime}ms")
            
        } finally {
            executorService.shutdown()
            executorService.awaitTermination(5, TimeUnit.MINUTES)
        }
    }
    
    /**
     * Process a list of JAR files sequentially with a shared configuration
     */
    private fun processJarsSequentially(jars: List<File>, context: ScanCtx) {
        try {
            // Create a configuration for all JARs at once
            val configuration = CompilerConfiguration().apply {
                put(CommonConfigurationKeys.MODULE_NAME, "ktir-scan")
                put(CLIConfigurationKeys.MESSAGE_COLLECTOR_KEY, 
                    PrintingMessageCollector(System.out, MessageRenderer.PLAIN_FULL_PATHS, false))
                addJvmClasspathRoots(jars + listOf(File(System.getProperty("java.class.path"))))
            }
            
            // Create a Kotlin core environment
            val env = KotlinCoreEnvironment.createForProduction(
                Disposable { }, configuration, EnvironmentConfigFiles.JVM_CONFIG_FILES)
            
            // Generate IR module
            val irGenerationTime = measureTimeMillis {
                try {
                    logTiming("Starting IR generation phase")
                    
                    // Use reflection to access the public KotlinToJVMBytecodeCompiler API
                    // This avoids direct dependencies on compiler-internal classes
                    val compilerClass = Class.forName("org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler")
                    
                    // Phase 1: Analysis
                    val phaseTime1 = measureTimeMillis {
                        logTiming("Analysis phase started")
                        // analyzeAndGenerateIr is a public API
                        val analyzeMethod = compilerClass.getDeclaredMethod(
                            "analyzeAndGenerateIr",
                            KotlinCoreEnvironment::class.java,
                            Boolean::class.java
                        )
                        analyzeMethod.isAccessible = true
                        logTiming("Analysis phase completed")
                    }
                    logTiming("Analysis completed in ${phaseTime1}ms")
                    
                    // Phase 2: Generate IR
                    val phaseTime2 = measureTimeMillis {
                        logTiming("IR generation phase started")
                        val irMethod = compilerClass.getDeclaredMethod(
                            "analyzeAndGenerateIr",
                            KotlinCoreEnvironment::class.java,
                            Boolean::class.java
                        )
                        irMethod.isAccessible = true
                        
                        // The method returns a state object containing the IR module
                        val analysisResult = irMethod.invoke(null, env, false)
                        
                        // Use reflection to extract the IrModuleFragment from the result
                        val stateClass = analysisResult.javaClass
                        val getModuleMethod = findGetModuleMethod(stateClass)
                        getModuleMethod.isAccessible = true
                        val irModule = getModuleMethod.invoke(analysisResult) as IrModuleFragment
                        
                        logTiming("IR generation phase completed")
                        
                        // Process each file in the IR module
                        logInfo("Traversing IR module with ${irModule.files.size} files")
                        
                        val traversalTime = measureTimeMillis {
                            logTiming("IR traversal phase started")
                            // Use explicit Iterator to avoid ambiguity
                            val iterator = irModule.files.iterator()
                            while (iterator.hasNext()) {
                                processIrFile(iterator.next(), context)
                            }
                            logTiming("IR traversal phase completed")
                        }
                        logTiming("IR traversal completed in ${traversalTime}ms")
                    }
                    logTiming("IR generation completed in ${phaseTime2}ms")
                    
                } catch (e: Exception) {
                    logError("Error generating IR: ${e.message}")
                    e.printStackTrace()
                }
            }
            logTiming("Total IR processing completed in ${irGenerationTime}ms")
            
        } catch (e: Exception) {
            logError("Error scanning JARs: ${e.message}")
            e.printStackTrace()
        }
    }
    
    /**
     * Find the method to get the IR module from the analysis result
     */
    private fun findGetModuleMethod(stateClass: Class<*>): Method {
        // Try common method names used in Kotlin compiler for getting the module
        val methodNames = listOf("getModuleDescriptor", "getIrModule", "getIrModuleFragment")
        
        for (methodName in methodNames) {
            try {
                return stateClass.getDeclaredMethod(methodName)
            } catch (e: NoSuchMethodException) {
                // Try next method
            }
        }
        
        // If method not found by name, look for a method returning IrModuleFragment
        return stateClass.declaredMethods.find { 
            it.returnType.name == "org.jetbrains.kotlin.ir.declarations.IrModuleFragment"
        } ?: throw RuntimeException("Could not find method to extract IR module")
    }
    
    /**
     * Scan JARs sequentially
     */
    private fun scanSequential(jars: List<File>) {
        processJarsSequentially(jars, ctx)
    }
    
    /**
     * Split a list into roughly equal chunks
     */
    private fun <T> splitIntoChunks(list: List<T>, numChunks: Int): List<List<T>> {
        val result = ArrayList<List<T>>(numChunks)
        val size = list.size
        val chunkSize = size / numChunks + if (size % numChunks > 0) 1 else 0
        
        var i = 0
        while (i < size) {
            val end = (i + chunkSize).coerceAtMost(size)
            result.add(list.subList(i, end))
            i = end
        }
        
        return result
    }
    
    /**
     * Scan a single JAR file for hooks.
     * @param jar The JAR file to scan
     */
    fun scanJar(jar: File) {
        scanJars(listOf(jar))
    }
    
    /**
     * Process an IR file and extract hook methods
     */
    private fun processIrFile(file: IrFile, context: ScanCtx = ctx) {
        file.acceptVoid(object : IrElementVisitorVoid {
            override fun visitFunction(declaration: IrFunction) {
                // Check if this function matches any hook family
                families.forEach { family ->
                    if (family.matcher(declaration)) {
                        context.addHit(family.name, declaration)
                    }
                }
                
                // Continue traversing the IR tree
                declaration.acceptChildrenVoid(this)
            }
        })
    }

    /**
     * Log info message (with optional timing)
     */
    private fun logInfo(message: String) {
        println(message)
    }
    
    /**
     * Log timing message (only if timing is enabled)
     */
    private fun logTiming(message: String) {
        if (showTimings) {
            println("[TIMING] $message")
        }
    }
    
    /**
     * Log error message
     */
    private fun logError(message: String) {
        System.err.println(message)
    }
} 