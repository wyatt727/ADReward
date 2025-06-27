package com.json.mediationsdk;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.mediationsdk.s;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/ironsource/mediationsdk/b;", "", "Lcom/ironsource/mediationsdk/s$d;", "a", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "d", "sdkState", "isRetryForMoreThan15Secs", "isDemandOnlyInitRequested", "isAdUnitInitRequested", "", "toString", "", "hashCode", "other", "equals", "Lcom/ironsource/mediationsdk/s$d;", "e", "()Lcom/ironsource/mediationsdk/s$d;", "Z", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "()Z", "g", "f", "<init>", "(Lcom/ironsource/mediationsdk/s$d;ZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.mediationsdk.b, reason: from toString */
/* loaded from: classes4.dex */
final /* data */ class AdUnitInitStateInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s.d sdkState;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isRetryForMoreThan15Secs;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isDemandOnlyInitRequested;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isAdUnitInitRequested;

    public AdUnitInitStateInfo(s.d sdkState, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        this.sdkState = sdkState;
        this.isRetryForMoreThan15Secs = z;
        this.isDemandOnlyInitRequested = z2;
        this.isAdUnitInitRequested = z3;
    }

    public static /* synthetic */ AdUnitInitStateInfo a(AdUnitInitStateInfo adUnitInitStateInfo, s.d dVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = adUnitInitStateInfo.sdkState;
        }
        if ((i & 2) != 0) {
            z = adUnitInitStateInfo.isRetryForMoreThan15Secs;
        }
        if ((i & 4) != 0) {
            z2 = adUnitInitStateInfo.isDemandOnlyInitRequested;
        }
        if ((i & 8) != 0) {
            z3 = adUnitInitStateInfo.isAdUnitInitRequested;
        }
        return adUnitInitStateInfo.a(dVar, z, z2, z3);
    }

    public final AdUnitInitStateInfo a(s.d sdkState, boolean isRetryForMoreThan15Secs, boolean isDemandOnlyInitRequested, boolean isAdUnitInitRequested) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        return new AdUnitInitStateInfo(sdkState, isRetryForMoreThan15Secs, isDemandOnlyInitRequested, isAdUnitInitRequested);
    }

    /* renamed from: a, reason: from getter */
    public final s.d getSdkState() {
        return this.sdkState;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsRetryForMoreThan15Secs() {
        return this.isRetryForMoreThan15Secs;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsDemandOnlyInitRequested() {
        return this.isDemandOnlyInitRequested;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsAdUnitInitRequested() {
        return this.isAdUnitInitRequested;
    }

    public final s.d e() {
        return this.sdkState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdUnitInitStateInfo)) {
            return false;
        }
        AdUnitInitStateInfo adUnitInitStateInfo = (AdUnitInitStateInfo) other;
        return this.sdkState == adUnitInitStateInfo.sdkState && this.isRetryForMoreThan15Secs == adUnitInitStateInfo.isRetryForMoreThan15Secs && this.isDemandOnlyInitRequested == adUnitInitStateInfo.isDemandOnlyInitRequested && this.isAdUnitInitRequested == adUnitInitStateInfo.isAdUnitInitRequested;
    }

    public final boolean f() {
        return this.isAdUnitInitRequested;
    }

    public final boolean g() {
        return this.isDemandOnlyInitRequested;
    }

    public final boolean h() {
        return this.isRetryForMoreThan15Secs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.sdkState.hashCode() * 31;
        boolean z = this.isRetryForMoreThan15Secs;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.isDemandOnlyInitRequested;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isAdUnitInitRequested;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.sdkState + ", isRetryForMoreThan15Secs=" + this.isRetryForMoreThan15Secs + ", isDemandOnlyInitRequested=" + this.isDemandOnlyInitRequested + ", isAdUnitInitRequested=" + this.isAdUnitInitRequested + ')';
    }
}
