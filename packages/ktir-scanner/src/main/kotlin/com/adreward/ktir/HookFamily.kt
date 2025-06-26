package com.adreward.ktir

import org.jetbrains.kotlin.ir.declarations.IrFunction

/**
 * Interface for hook family definitions.
 * Each implementation represents a different ad SDK or reward mechanism.
 */
interface HookFamily {
    /**
     * Name of the hook family (e.g., "admob", "unity")
     */
    val name: String

    /**
     * Determines if a function belongs to this hook family by analyzing its IR.
     * 
     * @param declaration The IR function declaration to analyze
     * @return true if the function is part of this hook family
     */
    fun matcher(declaration: IrFunction): Boolean
} 