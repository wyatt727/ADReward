package com.adreward.ktir.families

import com.adreward.ktir.HookFamily
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.types.getClass
import org.jetbrains.kotlin.name.FqName

/**
 * Hook family implementation for Facebook (Meta) Audience Network reward hooks.
 * Focuses on detecting reward callbacks in the Facebook Audience Network SDK,
 * supporting both legacy and modern APIs:
 * - Legacy: RewardedVideoAdListener#onRewardedVideoCompleted
 * - Modern: RewardedAdListener#onRewardedAdCompleted
 */
class FacebookAudienceNetworkIR : HookFamily {
    override val name = "facebook"
    
    // Legacy Facebook Audience Network SDK classes
    private val rewardedVideoAdListenerClass = FqName("com.facebook.ads.RewardedVideoAdListener")
    private val rewardedVideoAdExtendedListenerClass = FqName("com.facebook.ads.RewardedVideoAdExtendedListener")
    private val rewardDataClass = FqName("com.facebook.ads.RewardData")
    
    // Modern Facebook Audience Network SDK classes
    private val rewardedAdListenerClass = FqName("com.facebook.ads.RewardedAdListener")
    
    override fun matcher(declaration: IrFunction): Boolean {
        val methodName = declaration.name.toString()
        val parentClass = declaration.parent.toString()
        
        // Check for primary reward methods in both legacy and modern APIs
        if (methodName == "onRewardedVideoCompleted" || 
            methodName == "onRewardedVideoClosed" ||
            methodName == "onRewardedAdCompleted" ||
            methodName == "onRewardedAdClosed") {
            
            // Check if parent class is one of the Facebook listener interfaces
            if (parentClass.contains(rewardedVideoAdListenerClass.asString()) ||
                parentClass.contains(rewardedVideoAdExtendedListenerClass.asString()) ||
                parentClass.contains(rewardedAdListenerClass.asString()) ||
                parentClass.contains("facebook", ignoreCase = true) && 
                parentClass.contains("reward", ignoreCase = true)) {
                return true
            }
        }
        
        // Check for methods that handle RewardData
        val hasRewardDataParam = declaration.valueParameters.any {
            val paramClass = it.type.getClass()
            paramClass != null && paramClass.toString().contains(rewardDataClass.asString())
        }
        
        if (hasRewardDataParam) {
            return true
        }
        
        // Check for other known Facebook reward methods
        if (methodName.contains("reward", ignoreCase = true) && 
            (parentClass.contains("facebook", ignoreCase = true) || 
             parentClass.contains("fb", ignoreCase = true))) {
            return true
        }
        
        // Look for methods in classes implementing the rewarded video listeners
        return methodName == "onLoggingImpression" && 
               (parentClass.contains("RewardedVideoAd", ignoreCase = true) ||
                parentClass.contains("RewardedAd", ignoreCase = true) ||
                parentClass.contains(rewardedVideoAdListenerClass.asString()) ||
                parentClass.contains(rewardedAdListenerClass.asString()));
    }
} 