package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ironsource/hb;", "", "", "a", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "isImmersive", "flags", "", "toString", "hashCode", "other", "equals", "Z", "d", "()Z", "I", "c", "()I", "<init>", "(ZI)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.hb, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class OpenUrlConfigurations {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isImmersive;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final int flags;

    /* JADX WARN: Multi-variable type inference failed */
    public OpenUrlConfigurations() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public OpenUrlConfigurations(boolean z, int i) {
        this.isImmersive = z;
        this.flags = i;
    }

    public /* synthetic */ OpenUrlConfigurations(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 805306368 : i);
    }

    public static /* synthetic */ OpenUrlConfigurations a(OpenUrlConfigurations openUrlConfigurations, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = openUrlConfigurations.isImmersive;
        }
        if ((i2 & 2) != 0) {
            i = openUrlConfigurations.flags;
        }
        return openUrlConfigurations.a(z, i);
    }

    public final OpenUrlConfigurations a(boolean isImmersive, int flags) {
        return new OpenUrlConfigurations(isImmersive, flags);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsImmersive() {
        return this.isImmersive;
    }

    /* renamed from: b, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    public final int c() {
        return this.flags;
    }

    public final boolean d() {
        return this.isImmersive;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenUrlConfigurations)) {
            return false;
        }
        OpenUrlConfigurations openUrlConfigurations = (OpenUrlConfigurations) other;
        return this.isImmersive == openUrlConfigurations.isImmersive && this.flags == openUrlConfigurations.flags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isImmersive;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.flags;
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.isImmersive + ", flags=" + this.flags + ')';
    }
}
