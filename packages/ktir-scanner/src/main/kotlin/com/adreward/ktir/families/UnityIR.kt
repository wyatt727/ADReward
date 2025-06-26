package com.adreward.ktir.families

import com.adreward.ktir.HookFamily
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.types.getClass
import org.jetbrains.kotlin.name.FqName

/**
 * Hook family implementation for Unity Ads reward hooks.
 * Supports both legacy (SDK 3.x) and modern (SDK 4.x+) Unity Ads callbacks.
 */
class UnityIR : HookFamily {
    override val name = "unity"
    
    // Legacy Unity Ads SDK (3.x and below)
    private val legacyListenerInterface = FqName("com.unity3d.ads.IUnityAdsListener")
    private val finishStateClass = FqName("com.unity3d.ads.UnityAds.FinishState")
    
    // Modern Unity Ads SDK (4.x+)
    private val showListenerInterface = FqName("com.unity3d.ads.IUnityAdsShowListener")
    private val showCompletionStateClass = FqName("com.unity3d.ads.UnityAds.ShowCompletionState")
    
    override fun matcher(declaration: IrFunction): Boolean {
        val methodName = declaration.name.toString()
        val parentClass = declaration.parent.toString()
        
        // Check for legacy callback: onUnityAdsFinish
        if (methodName == "onUnityAdsFinish") {
            // Check if function has a string parameter (placement ID) and a FinishState parameter
            if (declaration.valueParameters.size != 2) {
                return false
            }
            
            // Check if second parameter is FinishState
            val param2Type = declaration.valueParameters[1].type.getClass()
            return param2Type != null && param2Type.toString().contains(finishStateClass.asString())
        }
        
        // Check for modern callback: onUnityAdsShowComplete
        if (methodName == "onUnityAdsShowComplete") {
            // Check if function has a string parameter (placement ID) and a ShowCompletionState parameter
            if (declaration.valueParameters.size != 2) {
                return false
            }
            
            // Check if second parameter is ShowCompletionState
            val param2Type = declaration.valueParameters[1].type.getClass()
            return param2Type != null && param2Type.toString().contains(showCompletionStateClass.asString())
        }
        
        return false
    }
} 