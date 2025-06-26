package com.adreward.ktir.families

import com.adreward.ktir.HookFamily
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.types.getClass
import org.jetbrains.kotlin.name.FqName

/**
 * Hook family implementation for AppLovin MAX reward hooks.
 * Looks for reward callbacks in the AppLovin MAX SDK, including:
 * - onRewardedVideoCompleted (legacy)
 * - onAdVideoCompleted (modern)
 * - onUserRewarded
 * - didRewardUser
 */
class AppLovinIR : HookFamily {
    override val name = "applovin"
    
    // Key FQNs for AppLovin SDK listeners and reward classes
    private val maxRewardedAdListenerClass = FqName("com.applovin.mediation.ads.MaxRewardedAdListener")
    private val maxAdListenerClass = FqName("com.applovin.mediation.MaxAdListener")
    private val maxRewardClass = FqName("com.applovin.mediation.MaxReward")
    private val maxAdClass = FqName("com.applovin.mediation.MaxAd")
    
    override fun matcher(declaration: IrFunction): Boolean {
        val methodName = declaration.name.toString()
        val parentClass = declaration.parent.toString()
        
        // Check for specific reward callback methods
        if (methodName == "onRewardedVideoCompleted" || 
            methodName == "onAdVideoCompleted" ||
            methodName == "onUserRewarded" ||
            methodName == "didRewardUser") {
            
            // Check if it's part of one of the AppLovin listener interfaces
            if (parentClass.contains(maxRewardedAdListenerClass.asString()) ||
                parentClass.contains(maxAdListenerClass.asString()) ||
                parentClass.contains("Reward")) {
                return true
            }
            
            // Check if any parameter is of MaxReward or MaxAd type
            return declaration.valueParameters.any { 
                val paramClass = it.type.getClass()
                paramClass != null && (
                    paramClass.toString().contains(maxRewardClass.asString()) ||
                    paramClass.toString().contains(maxAdClass.asString())
                )
            }
        }
        
        // Also check for methods with "Reward" in name that take or return MaxReward
        if (methodName.contains("reward", ignoreCase = true)) {
            // Check if return type is MaxReward
            val returnClass = declaration.returnType.getClass()
            if (returnClass != null && returnClass.toString().contains(maxRewardClass.asString())) {
                return true
            }
            
            // Check if any parameter is MaxReward
            return declaration.valueParameters.any { 
                val paramClass = it.type.getClass()
                paramClass != null && paramClass.toString().contains(maxRewardClass.asString())
            }
        }
        
        return false
    }
} 