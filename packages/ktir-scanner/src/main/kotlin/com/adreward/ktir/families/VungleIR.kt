package com.adreward.ktir.families

import com.adreward.ktir.HookFamily
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.types.getClass
import org.jetbrains.kotlin.name.FqName

/**
 * Hook family implementation for Vungle reward hooks.
 * Looks for reward callbacks in the Vungle SDK, supporting both legacy and modern APIs:
 * - PlayAdCallback#onAdRewarded
 * - RewardedAdCallback#onAdRewarded
 * - FullScreenAdListener#onAdEnd(wasSuccessfulView)
 */
class VungleIR : HookFamily {
    override val name = "vungle"
    
    // Key FQNs for Vungle SDK listener interfaces and reward classes
    private val vunglePlayAdCallbackClass = FqName("com.vungle.warren.PlayAdCallback")
    private val vungleAdListenerClass = FqName("com.vungle.warren.AdListener")
    private val vungleRewardListenerClass = FqName("com.vungle.warren.RewardListener")
    
    // Modern Vungle SDK classes
    private val vungleRewardedAdCallbackClass = FqName("com.vungle.warren.RewardedAdCallback")
    private val vungleFullScreenAdListenerClass = FqName("com.vungle.warren.FullScreenAdListener")
    
    override fun matcher(declaration: IrFunction): Boolean {
        val methodName = declaration.name.toString()
        val parentClass = declaration.parent.toString()
        
        // Check for specific reward-related methods in Vungle SDK
        if (methodName == "onAdRewarded" || 
            methodName == "onRewardedAdCompleted" || 
            methodName == "onComplete" ||
            methodName == "onSuccess") {
            
            // Check if it's part of one of the Vungle listener interfaces
            if (parentClass.contains(vunglePlayAdCallbackClass.asString()) ||
                parentClass.contains(vungleAdListenerClass.asString()) ||
                parentClass.contains(vungleRewardListenerClass.asString()) ||
                parentClass.contains(vungleRewardedAdCallbackClass.asString())) {
                return true
            }
            
            // Check if the class name contains Vungle-related terms
            if (parentClass.contains("vungle", ignoreCase = true) ||
                parentClass.contains("reward", ignoreCase = true) && 
                parentClass.contains("listener", ignoreCase = true)) {
                return true
            }
        }
        
        // Check for onAdEnd with wasSuccessfulView boolean parameter (modern API)
        if (methodName == "onAdEnd") {
            if (parentClass.contains(vungleFullScreenAdListenerClass.asString()) ||
                parentClass.contains("vungle", ignoreCase = true)) {
                
                // Check for boolean parameter (wasSuccessfulView)
                if (declaration.valueParameters.size >= 1) {
                    val firstParamType = declaration.valueParameters[0].type.toString()
                    if (firstParamType.contains("kotlin.Boolean") || firstParamType.contains("java.lang.Boolean")) {
                        return true
                    }
                }
            }
        }
        
        // Also check for methods with "reward" in the name in Vungle-related classes
        if ((methodName.contains("reward", ignoreCase = true) ||
             methodName.contains("earn", ignoreCase = true)) &&
            (parentClass.contains("vungle", ignoreCase = true) ||
             parentClass.contains("reward", ignoreCase = true))) {
            return true
        }
        
        return false
    }
} 