package com.mbridge.msdk.video.module.a.a;

import android.os.Handler;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Timer;

/* compiled from: VideoViewDefaultListener.java */
/* loaded from: classes4.dex */
public final class m extends o {
    private MBridgeVideoView l;
    private MBridgeContainerView m;
    private int n;
    private Timer o;
    private Handler p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private MBridgeVideoView.a v;

    public m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i, int i2, com.mbridge.msdk.video.module.a.a aVar2, int i3, boolean z, int i4) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i3, z);
        this.p = new Handler();
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = 1;
        this.l = mBridgeVideoView;
        this.m = mBridgeContainerView;
        this.u = i;
        this.n = i2;
        this.t = i4;
        if (mBridgeVideoView != null) {
            this.q = mBridgeVideoView.getVideoSkipTime() == 0;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f3755a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02f2  */
    @Override // com.mbridge.msdk.video.module.a.a.o, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.a.a.m.a(int, java.lang.Object):void");
    }

    private void i() {
        try {
            Timer timer = this.o;
            if (timer != null) {
                timer.cancel();
                this.o = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void j() {
        if (this.b == null || this.b.getDynamicTempCode() != 5) {
            return;
        }
        CampaignEx campaignEx = null;
        MBridgeVideoView mBridgeVideoView = this.l;
        if (mBridgeVideoView != null && mBridgeVideoView.mCampOrderViewData != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < this.l.mCampOrderViewData.size()) {
                    if (this.l.mCampOrderViewData.get(i2) != null && this.l.mCampOrderViewData.get(i2).getId() == this.b.getId()) {
                        i = i2 - 1;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (i >= 0 && this.l.mCampOrderViewData.get(i) != null) {
                campaignEx = this.l.mCampOrderViewData.get(i);
            }
        }
        if (campaignEx != null) {
            MBridgeVideoView mBridgeVideoView2 = this.l;
            if (mBridgeVideoView2 != null) {
                mBridgeVideoView2.setCampaign(campaignEx);
            }
            MBridgeContainerView mBridgeContainerView = this.m;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setCampaign(campaignEx);
            }
            a(campaignEx);
        }
    }
}
