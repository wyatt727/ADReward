package com.adreward.ktir

import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.declarations.IrClass
import org.jetbrains.kotlin.ir.util.render
import org.jetbrains.kotlin.ir.util.parentAsClass
import org.jetbrains.kotlin.ir.types.getClass
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.ir.types.IrType

/**
 * Scanning context that accumulates results during the IR analysis.
 */
class ScanCtx(val familyNames: List<String>) {
    internal val _results: MutableMap<String, MutableSet<HookSite>> = mutableMapOf()
    
    /**
     * The accumulated results of the scan.
     */
    val results: ComponentMap
        get() = _results.mapValues { it.value.toList() }
    
    /**
     * Add a hook site to the results from an IR function.
     * @param familyName The name of the hook family
     * @param declaration The IR function that was matched
     */
    fun addHit(familyName: String, declaration: IrFunction) {
        try {
            // Get class name from parent
            val parent = declaration.parent
            val className = when {
                parent is IrClass -> parent.name.toString()
                else -> parent.toString().substringAfterLast('.').substringBefore('.')
            }
            
            val methodName = declaration.name.toString()
            
            // Build proper JVM descriptor
            val jvmDesc = buildJvmDescriptor(declaration)
            
            // Build Kotlin signature
            val kotlinSig = buildKotlinSignature(declaration)
            
            val hookSite = HookSite(className, methodName, jvmDesc, kotlinSig)
            
            _results.getOrPut(familyName) { mutableSetOf() }.add(hookSite)
        } catch (e: Exception) {
            println("Error adding hit for ${declaration.name}: ${e.message}")
        }
    }
    
    /**
     * Build a JVM descriptor string for a function.
     * Format: (paramTypes)returnType in JVM internal format
     */
    private fun buildJvmDescriptor(function: IrFunction): String {
        // Convert parameter types to JVM type signatures
        val paramsSig = function.valueParameters.joinToString("") { param ->
            typeToJvmSignature(param.type)
        }
        
        // Convert return type to JVM type signature
        val returnSig = typeToJvmSignature(function.returnType)
        
        return "($paramsSig)$returnSig"
    }
    
    /**
     * Convert an IR type to JVM signature
     */
    private fun typeToJvmSignature(type: IrType): String {
        // Handle arrays - they have special descriptor format
        if (type.toString().endsWith("Array")) {
            val arrayElement = type.toString().removeSuffix("Array")
            val elementSig = when (arrayElement) {
                "kotlin.Int" -> "I"
                "kotlin.Long" -> "J"
                "kotlin.Short" -> "S"
                "kotlin.Byte" -> "B"
                "kotlin.Char" -> "C"
                "kotlin.Boolean" -> "Z"
                "kotlin.Float" -> "F"
                "kotlin.Double" -> "D"
                else -> "Ljava/lang/Object;"
            }
            return "[" + elementSig
        }
        
        // Try to resolve class from type
        val typeClass = type.getClass()
        if (typeClass != null) {
            // For class types, use JVM internal name format (with slashes)
            val fqName = typeClass.toString()
            
            // Generic type erasure - JVM descriptors use erased types
            val rawType = fqName.substringBefore("<")
            return "L" + rawType.replace('.', '/') + ";"
        }
        
        // Handle primitive types
        return when (type.toString()) {
            "kotlin.Int" -> "I"
            "kotlin.Long" -> "J"
            "kotlin.Short" -> "S"
            "kotlin.Byte" -> "B"
            "kotlin.Char" -> "C"
            "kotlin.Boolean" -> "Z"
            "kotlin.Float" -> "F"
            "kotlin.Double" -> "D"
            "kotlin.Unit", "kotlin.Nothing" -> "V"
            else -> {
                // For unknown/unresolved types, try to extract JVM descriptor from the type rendering
                val typeName = type.render()
                if (typeName.contains("/")) {
                    // Already in JVM format
                    "L$typeName;"
                } else {
                    // Try to convert the type name to JVM format
                    "L" + typeName.replace('.', '/') + ";"
                }
            }
        }
    }
    
    /**
     * Build a Kotlin-style signature for a function.
     * Format: className.methodName
     */
    private fun buildKotlinSignature(function: IrFunction): String {
        val className = when (val parent = function.parent) {
            is IrClass -> parent.name.toString()
            else -> parent.toString().substringAfterLast('.').substringBefore('.')
        }
        
        return "$className.${function.name}"
    }
    
    /**
     * Merge results from another ScanCtx (used for parallel scanning)
     */
    fun mergeFrom(other: ScanCtx) {
        other.results.forEach { (family, sites) ->
            val targetSet = _results.getOrPut(family) { mutableSetOf() }
            targetSet.addAll(sites)
        }
    }
} 