package com.vungle.ads;

import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.t2;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VungleError.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vungle/ads/InvalidAdStateError;", "Lcom/vungle/ads/VungleError;", IronSourceConstants.EVENTS_ERROR_CODE, "", "loggableReason", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "errorMessage", "", t2.k, "creativeId", "eventId", "(ILcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InvalidAdStateError extends VungleError {
    public InvalidAdStateError() {
        this(0, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ InvalidAdStateError(int i, Sdk.SDKError.Reason reason, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? VungleError.INVALID_AD_STATE : i, (i2 & 2) != 0 ? null : reason, (i2 & 4) != 0 ? "Ad state is invalid" : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAdStateError(int i, Sdk.SDKError.Reason reason, String errorMessage, String str, String str2, String str3) {
        super(Integer.valueOf(i), reason, errorMessage, str, str2, str3, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
