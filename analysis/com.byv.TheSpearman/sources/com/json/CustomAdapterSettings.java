package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ironsource/f3;", "", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "d", "customNetworkAdapterName", "customRewardedVideoAdapterName", "customInterstitialAdapterName", "customBannerAdapterName", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "f", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.f3, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class CustomAdapterSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customNetworkAdapterName;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String customRewardedVideoAdapterName;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final String customInterstitialAdapterName;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    private final String customBannerAdapterName;

    public CustomAdapterSettings() {
        this(null, null, null, null, 15, null);
    }

    public CustomAdapterSettings(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.customNetworkAdapterName = customNetworkAdapterName;
        this.customRewardedVideoAdapterName = customRewardedVideoAdapterName;
        this.customInterstitialAdapterName = customInterstitialAdapterName;
        this.customBannerAdapterName = customBannerAdapterName;
    }

    public /* synthetic */ CustomAdapterSettings(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ CustomAdapterSettings a(CustomAdapterSettings customAdapterSettings, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customAdapterSettings.customNetworkAdapterName;
        }
        if ((i & 2) != 0) {
            str2 = customAdapterSettings.customRewardedVideoAdapterName;
        }
        if ((i & 4) != 0) {
            str3 = customAdapterSettings.customInterstitialAdapterName;
        }
        if ((i & 8) != 0) {
            str4 = customAdapterSettings.customBannerAdapterName;
        }
        return customAdapterSettings.a(str, str2, str3, str4);
    }

    public final CustomAdapterSettings a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new CustomAdapterSettings(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomNetworkAdapterName() {
        return this.customNetworkAdapterName;
    }

    /* renamed from: b, reason: from getter */
    public final String getCustomRewardedVideoAdapterName() {
        return this.customRewardedVideoAdapterName;
    }

    /* renamed from: c, reason: from getter */
    public final String getCustomInterstitialAdapterName() {
        return this.customInterstitialAdapterName;
    }

    /* renamed from: d, reason: from getter */
    public final String getCustomBannerAdapterName() {
        return this.customBannerAdapterName;
    }

    public final String e() {
        return this.customBannerAdapterName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAdapterSettings)) {
            return false;
        }
        CustomAdapterSettings customAdapterSettings = (CustomAdapterSettings) other;
        return Intrinsics.areEqual(this.customNetworkAdapterName, customAdapterSettings.customNetworkAdapterName) && Intrinsics.areEqual(this.customRewardedVideoAdapterName, customAdapterSettings.customRewardedVideoAdapterName) && Intrinsics.areEqual(this.customInterstitialAdapterName, customAdapterSettings.customInterstitialAdapterName) && Intrinsics.areEqual(this.customBannerAdapterName, customAdapterSettings.customBannerAdapterName);
    }

    public final String f() {
        return this.customInterstitialAdapterName;
    }

    public final String g() {
        return this.customNetworkAdapterName;
    }

    public final String h() {
        return this.customRewardedVideoAdapterName;
    }

    public int hashCode() {
        return (((((this.customNetworkAdapterName.hashCode() * 31) + this.customRewardedVideoAdapterName.hashCode()) * 31) + this.customInterstitialAdapterName.hashCode()) * 31) + this.customBannerAdapterName.hashCode();
    }

    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.customNetworkAdapterName + ", customRewardedVideoAdapterName=" + this.customRewardedVideoAdapterName + ", customInterstitialAdapterName=" + this.customInterstitialAdapterName + ", customBannerAdapterName=" + this.customBannerAdapterName + ')';
    }
}
