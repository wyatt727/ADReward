package com.adreward.ktir.families

import com.adreward.ktir.HookFamily
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.types.getClass
import org.jetbrains.kotlin.name.FqName

/**
 * Hook family implementation for IronSource reward hooks.
 * Looks for reward callbacks in the IronSource SDK, supporting both:
 * - Legacy API: onRewardedVideoAdRewarded method with Placement parameter
 * - Modern LevelPlay API: onAdRewarded method with LevelPlayReward and LevelPlayAdInfo parameters
 */
class IronSourceIR : HookFamily {
    override val name = "ironsource"
    
    // Legacy IronSource SDK classes
    private val rewardedVideoListenerClass = FqName("com.ironsource.mediationsdk.sdk.RewardedVideoListener")
    private val placementClass = FqName("com.ironsource.mediationsdk.model.Placement")
    
    // Modern LevelPlay API classes
    private val levelPlayRewardListenerClass = FqName("com.ironsource.mediationsdk.sdk.LevelPlayRewardListener")
    private val levelPlayRewardedAdListenerClass = FqName("com.ironsource.mediationsdk.sdk.LevelPlayRewardedAdListener")
    private val levelPlayRewardClass = FqName("com.ironsource.mediationsdk.model.LevelPlayReward")
    private val levelPlayAdInfoClass = FqName("com.ironsource.mediationsdk.adunit.adapter.utility.LevelPlayAdInfo")
    
    override fun matcher(declaration: IrFunction): Boolean {
        val methodName = declaration.name.toString()
        val parentClass = declaration.parent.toString()
        
        // Check for legacy onRewardedVideoAdRewarded method
        if (methodName == "onRewardedVideoAdRewarded") {
            // Check if the function is part of one of the IronSource listener interfaces
            if (parentClass.contains(rewardedVideoListenerClass.asString())) {
                return true
            }
            
            // Check if any parameter is of type Placement
            return declaration.valueParameters.any { 
                val paramClass = it.type.getClass()
                paramClass != null && paramClass.toString().contains(placementClass.asString())
            }
        }
        
        // Check for modern LevelPlay onAdRewarded method
        if (methodName == "onAdRewarded") {
            // Check if the function is part of one of the LevelPlay listener interfaces
            if (parentClass.contains(levelPlayRewardListenerClass.asString()) || 
                parentClass.contains(levelPlayRewardedAdListenerClass.asString())) {
                return true
            }
            
            // Check if parameters include LevelPlayReward and/or LevelPlayAdInfo
            val hasLevelPlayParams = declaration.valueParameters.any { 
                val paramClass = it.type.getClass()
                paramClass != null && (
                    paramClass.toString().contains(levelPlayRewardClass.asString()) ||
                    paramClass.toString().contains(levelPlayAdInfoClass.asString())
                )
            }
            
            if (hasLevelPlayParams) {
                return true
            }
        }
        
        // Also check for other known reward methods
        if (methodName.contains("RewardedVideo") && 
            methodName.contains("Rewarded")) {
            return true
        }
        
        // Check if the method has to do with interacting with placements
        return declaration.valueParameters.any { 
            val paramClass = it.type.getClass()
            paramClass != null && (
                paramClass.toString().contains(placementClass.asString()) ||
                paramClass.toString().contains(levelPlayRewardClass.asString())
            )
        } && (
            methodName.contains("reward", ignoreCase = true) ||
            methodName.contains("placement", ignoreCase = true)
        )
    }
} 