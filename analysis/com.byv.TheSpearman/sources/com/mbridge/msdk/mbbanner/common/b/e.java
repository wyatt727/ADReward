package com.mbridge.msdk.mbbanner.common.b;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: DownloadBannerUrlListener.java */
/* loaded from: classes4.dex */
public class e implements H5DownLoadManager.IH5SourceDownloadListener {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3042a = "e";
    private com.mbridge.msdk.mbbanner.common.c.b b;
    private String c;
    private CampaignEx d;

    public e(com.mbridge.msdk.mbbanner.common.c.b bVar, String str, CampaignEx campaignEx) {
        this.b = bVar;
        this.c = str;
        this.d = campaignEx;
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
    public void onSuccess(String str, String str2, boolean z) {
        ad.c(f3042a, "DownloadBannerUrlListener HTML SUCCESS:" + str);
        com.mbridge.msdk.mbbanner.common.c.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, 3, str, true, this.d);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
    public void onFailed(String str, String str2) {
        ad.c(f3042a, "DownloadBannerUrlListener HTML FAIL:" + str);
        com.mbridge.msdk.mbbanner.common.c.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, 3, str, false, this.d);
        }
    }
}
