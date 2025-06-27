package androidx.privacysandbox.ads.adservices.adid;

import com.json.sdk.controller.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdId.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdId;", "", f.b.c, "", "isLimitAdTrackingEnabled", "", "(Ljava/lang/String;Z)V", "getAdId", "()Ljava/lang/String;", "()Z", "equals", "other", "hashCode", "", "toString", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AdId {
    private final String adId;
    private final boolean isLimitAdTrackingEnabled;

    public AdId(String adId, boolean z) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.adId = adId;
        this.isLimitAdTrackingEnabled = z;
    }

    public /* synthetic */ AdId(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final String getAdId() {
        return this.adId;
    }

    /* renamed from: isLimitAdTrackingEnabled, reason: from getter */
    public final boolean getIsLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) other;
        return Intrinsics.areEqual(this.adId, adId.adId) && this.isLimitAdTrackingEnabled == adId.isLimitAdTrackingEnabled;
    }

    public int hashCode() {
        return (this.adId.hashCode() * 31) + AdId$$ExternalSyntheticBackport0.m(this.isLimitAdTrackingEnabled);
    }

    public String toString() {
        return "AdId: adId=" + this.adId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled;
    }
}
