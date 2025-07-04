package com.unity.purchasing.common;

import java.util.List;

/* loaded from: classes4.dex */
public interface IStoreCallback {
    void OnProductsRetrieved(List<ProductDescription> list);

    void OnPurchaseFailed(PurchaseFailureDescription purchaseFailureDescription);

    void OnPurchaseSucceeded(String str, String str2, String str3);

    void OnSetupFailed(InitializationFailureReason initializationFailureReason);
}
