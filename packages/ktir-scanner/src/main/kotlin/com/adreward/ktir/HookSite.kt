package com.adreward.ktir

/**
 * Represents a discovered hook site in the code.
 */
data class HookSite(
    val className: String,
    val methodName: String,
    val desc: String,
    val kotlinSig: String
)

/**
 * Map of hook family names to lists of hook sites.
 */
typealias ComponentMap = Map<String, List<HookSite>> 