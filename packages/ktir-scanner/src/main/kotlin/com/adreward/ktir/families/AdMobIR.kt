package com.adreward.ktir.families

import com.adreward.ktir.HookFamily
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.types.isSubtypeOfClass
import org.jetbrains.kotlin.ir.types.getClass
import org.jetbrains.kotlin.ir.util.hasAnnotation
import org.jetbrains.kotlin.ir.util.render
import org.jetbrains.kotlin.name.FqName

/**
 * Hook family implementation for AdMob reward hooks.
 */
class AdMobIR : HookFamily {
    override val name = "admob"
    
    private val rewardItemClass = FqName("com.google.android.gms.ads.rewarded.RewardItem")
    private val listenerInterface = FqName("com.google.android.gms.ads.rewarded.OnUserEarnedRewardListener")
    
    override fun matcher(declaration: IrFunction): Boolean {
        val methodName = declaration.name.toString()
        val parentClass = declaration.parent.toString()
        
        // Check if function is part of OnUserEarnedRewardListener interface
        if (parentClass.contains(listenerInterface.asString()) && methodName == "onUserEarnedReward") {
            return true
        }
        
        // Check if function returns a RewardItem
        val returnTypeClass = declaration.returnType.getClass()
        if (returnTypeClass != null && 
            returnTypeClass.toString().contains(rewardItemClass.asString())) {
            return true
        }
        
        // Check if function has RewardItem parameter
        val hasRewardItemParam = declaration.valueParameters.any { 
            val paramClass = it.type.getClass()
            paramClass != null && 
            paramClass.toString().contains(rewardItemClass.asString())
        }
        
        // Check if function name contains EarnedReward
        val nameContainsReward = methodName.contains("EarnedReward", ignoreCase = true)
        
        return hasRewardItemParam && nameContainsReward
    }
} 