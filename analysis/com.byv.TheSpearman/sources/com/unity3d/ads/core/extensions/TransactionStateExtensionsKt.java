package com.unity3d.ads.core.extensions;

import gateway.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;

/* compiled from: TransactionStateExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"fromPurchaseState", "Lgateway/v1/TransactionEventRequestOuterClass$TransactionState;", "state", "", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionStateExtensionsKt {
    public static final TransactionEventRequestOuterClass.TransactionState fromPurchaseState(int i) {
        if (i == 0) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PURCHASED;
        }
        if (i == 1) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_UNSPECIFIED;
        }
        if (i == 2) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PENDING;
        }
        return TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED;
    }
}
