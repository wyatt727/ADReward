package com.adreward.ktir

import com.google.gson.GsonBuilder
import java.io.File
import kotlin.system.exitProcess
import kotlin.system.measureTimeMillis

/**
 * Main entry point for the ktir-scanner application.
 */
fun main(args: Array<String>) {
    if (args.size < 3) {
        println("Usage: ktir-scanner <out.json> <hooks…> -- <jars…>")
        println("Example: ktir-scanner output.json admob unity -- app.jar lib1.jar lib2.jar")
        exitProcess(1)
    }
    
    val split = args.indexOf("--")
    if (split == -1) {
        println("Error: Missing separator '--' between hooks and jars")
        exitProcess(1)
    }
    
    val outFile = File(args[0])
    val families = args.slice(1 until split)
    val jars = args.slice(split + 1 until args.size).map(::File)
    
    println("Output file: ${outFile.absolutePath}")
    println("Hook families: $families")
    println("JARs to scan: ${jars.map { it.name }}")
    
    if (jars.isEmpty()) {
        println("Error: No JAR files specified")
        exitProcess(1)
    }
    
    // Check if all JAR files exist
    val validJars = jars.filter { jar ->
        if (!jar.exists()) {
            println("Warning: JAR file not found: ${jar.absolutePath}")
            false
        } else true
    }
    
    // Create scan context
    val ctx = ScanCtx(families)
    
    // Create scanner
    val scanner = IRScanner(ctx)
    
    // Scan all JARs at once 
    val totalTime = measureTimeMillis {
        // Process all JARs at once for better performance and context
        scanner.scanJars(validJars)
    }
    
    // Write results to JSON
    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(ctx.results)
    outFile.writeText(json)
    
    println("Scan completed in ${totalTime}ms")
    println("Results written to ${outFile.absolutePath}")
    
    // Print summary of results
    ctx.results.forEach { (family, hooks) ->
        println("$family: ${hooks.size} hooks found")
    }
} 