package com.adreward.ktir.families

import com.adreward.ktir.HookFamily
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.types.getClass
import org.jetbrains.kotlin.name.FqName

/**
 * Hook family implementation for Google Play Billing reward hooks.
 * Focuses on detecting in-app purchase verification methods and purchase
 * completion callbacks that might be used for virtual currency rewards.
 */
class GooglePlayBillingIR : HookFamily {
    override val name = "billing"
    
    // Key FQNs for Google Play Billing SDK classes
    private val purchasesUpdatedListenerClass = FqName("com.android.billingclient.api.PurchasesUpdatedListener")
    private val billingClientClass = FqName("com.android.billingclient.api.BillingClient")
    private val purchaseClass = FqName("com.android.billingclient.api.Purchase")
    private val purchaseResultClass = FqName("com.android.billingclient.api.BillingResult")
    
    override fun matcher(declaration: IrFunction): Boolean {
        val methodName = declaration.name.toString()
        val parentClass = declaration.parent.toString()
        
        // Check for specific purchase callback methods
        if (methodName == "onPurchasesUpdated") {
            // Check if it's part of the PurchasesUpdatedListener interface
            if (parentClass.contains(purchasesUpdatedListenerClass.asString()) ||
                parentClass.contains("PurchaseListener")) {
                return true
            }
            
            // Check if it has BillingResult and List<Purchase> parameters
            val hasBillingResultParam = declaration.valueParameters.any { 
                val paramClass = it.type.getClass()
                paramClass != null && paramClass.toString().contains(purchaseResultClass.asString())
            }
            
            val hasPurchaseListParam = declaration.valueParameters.any { 
                val paramType = it.type.toString()
                paramType.contains("java.util.List") && paramType.contains(purchaseClass.asString())
            }
            
            if (hasBillingResultParam && hasPurchaseListParam) {
                return true
            }
        }
        
        // Check for purchase verification methods
        if ((methodName == "verifyPurchase" || 
             methodName == "validatePurchase" ||
             methodName == "processPurchase" ||
             methodName.contains("purchase", ignoreCase = true) && 
             methodName.contains("verify", ignoreCase = true))) {
            return true
        }
        
        // Check for methods that might handle purchase-based virtual currency rewards
        if ((methodName.contains("handlePurchase") || 
             methodName.contains("onPurchaseComplete") ||
             methodName.contains("processPurchase")) &&
            (methodName.contains("coin", ignoreCase = true) ||
             methodName.contains("currency", ignoreCase = true) ||
             methodName.contains("reward", ignoreCase = true) ||
             methodName.contains("gem", ignoreCase = true))) {
            return true
        }
        
        // Check for Purchase parameter in methods with reward-like names
        val hasPurchaseParam = declaration.valueParameters.any { 
            val paramClass = it.type.getClass()
            paramClass != null && paramClass.toString().contains(purchaseClass.asString())
        }
        
        return hasPurchaseParam && (
            methodName.contains("grant", ignoreCase = true) ||
            methodName.contains("reward", ignoreCase = true) ||
            methodName.contains("add", ignoreCase = true) && 
            (methodName.contains("coin", ignoreCase = true) || 
             methodName.contains("currency", ignoreCase = true))
        )
    }
} 