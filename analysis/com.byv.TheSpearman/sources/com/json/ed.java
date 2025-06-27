package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.model.NetworkSettings;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/ironsource/ed;", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "networkSettings", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", "a", "", "Ljava/lang/String;", "mAdNetworkName", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Z", "mIsBiddingNetwork", "c", "Ljava/lang/Boolean;", "mUseTestAds", "adNetworkName", "isBiddingNetwork", "useTestAds", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ed {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String mAdNetworkName;

    /* renamed from: b, reason: from kotlin metadata */
    private final boolean mIsBiddingNetwork;

    /* renamed from: c, reason: from kotlin metadata */
    private final Boolean mUseTestAds;

    public ed(String str, boolean z, Boolean bool) {
        this.mAdNetworkName = str;
        this.mIsBiddingNetwork = z;
        this.mUseTestAds = bool;
    }

    public /* synthetic */ ed(String str, boolean z, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool);
    }

    public final boolean a() {
        return Intrinsics.areEqual(this.mUseTestAds, Boolean.TRUE);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.mAdNetworkName;
        if (str == null || str.length() == 0) {
            return true;
        }
        gd gdVar = gd.f1795a;
        return Intrinsics.areEqual(gdVar.a(networkSettings), this.mAdNetworkName) && gdVar.a(networkSettings, adUnit) == this.mIsBiddingNetwork;
    }
}
