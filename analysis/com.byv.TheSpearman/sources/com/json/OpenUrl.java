package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/gb;", "", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "url", "packageName", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.gb, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class OpenUrl {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String packageName;

    public OpenUrl(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.packageName = str;
    }

    public /* synthetic */ OpenUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ OpenUrl a(OpenUrl openUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openUrl.url;
        }
        if ((i & 2) != 0) {
            str2 = openUrl.packageName;
        }
        return openUrl.a(str, str2);
    }

    public final OpenUrl a(String url, String packageName) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new OpenUrl(url, packageName);
    }

    /* renamed from: a, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: b, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public final String c() {
        return this.packageName;
    }

    public final String d() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenUrl)) {
            return false;
        }
        OpenUrl openUrl = (OpenUrl) other;
        return Intrinsics.areEqual(this.url, openUrl.url) && Intrinsics.areEqual(this.packageName, openUrl.packageName);
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.packageName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OpenUrl(url=" + this.url + ", packageName=" + this.packageName + ')';
    }
}
