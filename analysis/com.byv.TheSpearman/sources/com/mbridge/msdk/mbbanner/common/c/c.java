package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;

/* compiled from: BannerShowManager.java */
/* loaded from: classes4.dex */
public final class c extends d {
    public c(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.b.c cVar, String str, String str2, boolean z, k kVar) {
        super(mBBannerView, cVar, str, str2, z, kVar);
    }

    @Override // com.mbridge.msdk.mbbanner.common.c.d
    public final void a(CampaignEx campaignEx, boolean z, String str) {
        if (this.d) {
            if (this.f == null) {
                this.f = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.e);
            }
            this.f.a(new NativeListener.TrackingExListener() { // from class: com.mbridge.msdk.mbbanner.common.c.c.1
                @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                public final void onDismissLoading(Campaign campaign) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                public final void onDownloadFinish(Campaign campaign) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                public final void onDownloadProgress(int i) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                public final void onDownloadStart(Campaign campaign) {
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                public final boolean onInterceptDefaultLoadingDialog() {
                    return false;
                }

                @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                public final void onShowLoading(Campaign campaign) {
                }

                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onStartRedirection(Campaign campaign, String str2) {
                    ah.b(campaign, c.this.c);
                }

                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onFinishRedirection(Campaign campaign, String str2) {
                    ah.a(campaign, c.this.c);
                }

                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onRedirectionFailed(Campaign campaign, String str2) {
                    ah.a(campaign, c.this.c);
                }

                @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
                public final void onLeaveApp() {
                    if (c.this.f3054a != null) {
                        c.this.f3054a.b();
                    }
                }
            });
            campaignEx.setCampaignUnitId(this.e);
            this.f.a(campaignEx);
            if (!this.b.isReportClick()) {
                this.b.setReportClick(true);
                Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().l() != null) {
                    com.mbridge.msdk.click.a.a(contextC, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
                }
            }
            if (this.f3054a != null) {
                this.f3054a.a();
            }
        }
    }
}
