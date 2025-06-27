package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/t8;", "", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, td.b, td.i1, "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.t8, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class IronSourceAdvId {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String advId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String advIdType;

    public IronSourceAdvId(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.advId = advId;
        this.advIdType = advIdType;
    }

    public static /* synthetic */ IronSourceAdvId a(IronSourceAdvId ironSourceAdvId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ironSourceAdvId.advId;
        }
        if ((i & 2) != 0) {
            str2 = ironSourceAdvId.advIdType;
        }
        return ironSourceAdvId.a(str, str2);
    }

    public final IronSourceAdvId a(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new IronSourceAdvId(advId, advIdType);
    }

    /* renamed from: a, reason: from getter */
    public final String getAdvId() {
        return this.advId;
    }

    /* renamed from: b, reason: from getter */
    public final String getAdvIdType() {
        return this.advIdType;
    }

    public final String c() {
        return this.advId;
    }

    public final String d() {
        return this.advIdType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IronSourceAdvId)) {
            return false;
        }
        IronSourceAdvId ironSourceAdvId = (IronSourceAdvId) other;
        return Intrinsics.areEqual(this.advId, ironSourceAdvId.advId) && Intrinsics.areEqual(this.advIdType, ironSourceAdvId.advIdType);
    }

    public int hashCode() {
        return (this.advId.hashCode() * 31) + this.advIdType.hashCode();
    }

    public String toString() {
        return "IronSourceAdvId(advId=" + this.advId + ", advIdType=" + this.advIdType + ')';
    }
}
