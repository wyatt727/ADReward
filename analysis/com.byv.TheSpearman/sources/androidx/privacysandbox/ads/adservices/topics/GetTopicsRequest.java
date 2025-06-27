package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.adid.AdId$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetTopicsRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "", "adsSdkName", "", "shouldRecordObservation", "", "(Ljava/lang/String;Z)V", "getAdsSdkName", "()Ljava/lang/String;", "()Z", "equals", "other", "hashCode", "", "toString", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetTopicsRequest {
    private final String adsSdkName;
    private final boolean shouldRecordObservation;

    /* JADX WARN: Multi-variable type inference failed */
    public GetTopicsRequest() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public GetTopicsRequest(String adsSdkName, boolean z) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.adsSdkName = adsSdkName;
        this.shouldRecordObservation = z;
    }

    public /* synthetic */ GetTopicsRequest(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    /* renamed from: shouldRecordObservation, reason: from getter */
    public final boolean getShouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) other;
        return Intrinsics.areEqual(this.adsSdkName, getTopicsRequest.adsSdkName) && this.shouldRecordObservation == getTopicsRequest.shouldRecordObservation;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + AdId$$ExternalSyntheticBackport0.m(this.shouldRecordObservation);
    }

    /* compiled from: GetTopicsRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest$Builder;", "", "()V", "adsSdkName", "", "shouldRecordObservation", "", "build", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "setAdsSdkName", "setShouldRecordObservation", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private String adsSdkName = "";
        private boolean shouldRecordObservation = true;

        public final Builder setAdsSdkName(String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            this.adsSdkName = adsSdkName;
            return this;
        }

        public final Builder setShouldRecordObservation(boolean shouldRecordObservation) {
            this.shouldRecordObservation = shouldRecordObservation;
            return this;
        }

        public final GetTopicsRequest build() {
            if (!(this.adsSdkName.length() > 0)) {
                throw new IllegalStateException("adsSdkName must be set".toString());
            }
            return new GetTopicsRequest(this.adsSdkName, this.shouldRecordObservation);
        }
    }
}
