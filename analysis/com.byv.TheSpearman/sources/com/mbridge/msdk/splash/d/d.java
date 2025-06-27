package com.mbridge.msdk.splash.d;

import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;

/* compiled from: SplashShowListenerImpl.java */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private MBSplashShowListener f3509a;
    private CampaignEx b;
    private c c;

    public d(c cVar, MBSplashShowListener mBSplashShowListener, CampaignEx campaignEx) {
        this.c = cVar;
        this.f3509a = mBSplashShowListener;
        this.b = campaignEx;
    }

    public final void a(MBridgeIds mBridgeIds) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.f3507a = true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("load_to=");
        stringBuffer.append(this.c.b());
        stringBuffer.append(t2.i.c);
        stringBuffer.append("allow_skip=");
        stringBuffer.append(this.c.c() ? 1 : 0);
        stringBuffer.append(t2.i.c);
        stringBuffer.append("countdown=");
        stringBuffer.append(this.c.d());
        stringBuffer.append(t2.i.c);
        k.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, mBridgeIds.getUnitId(), stringBuffer.toString());
        MBSplashShowListener mBSplashShowListener = this.f3509a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowSuccessed(mBridgeIds);
        }
    }

    public final void a(MBridgeIds mBridgeIds, String str) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.f3507a = false;
        }
        k.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, mBridgeIds.getUnitId(), str);
        MBSplashShowListener mBSplashShowListener = this.f3509a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(mBridgeIds, str);
        }
    }

    public final void b(MBridgeIds mBridgeIds) {
        MBSplashShowListener mBSplashShowListener = this.f3509a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdClicked(mBridgeIds);
        }
    }

    public final void a(MBridgeIds mBridgeIds, int i) {
        MBSplashShowListener mBSplashShowListener = this.f3509a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onDismiss(mBridgeIds, i);
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.f3507a = false;
        }
        if (i == 6 || i == 4 || i == 5) {
            CampaignEx campaignEx = this.b;
            String unitId = mBridgeIds.getUnitId();
            com.mbridge.msdk.splash.a.c cVarA = null;
            if (campaignEx != null) {
                try {
                    cVarA = com.mbridge.msdk.splash.a.c.a().b(unitId).d(campaignEx.getRequestId()).g(campaignEx.getRequestIdNotice()).c(campaignEx.getId()).e(campaignEx.getCreativeId() + "").a(campaignEx.isBidCampaign());
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.splash.e.a.a(cVarA, unitId, i);
        }
    }

    public final void a(MBridgeIds mBridgeIds, long j) {
        MBSplashShowListener mBSplashShowListener = this.f3509a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onAdTick(mBridgeIds, j);
        }
    }

    public final void a(MBridgeIds mBridgeIds, int i, int i2, int i3) {
        MBSplashShowListener mBSplashShowListener = this.f3509a;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayStart(mBridgeIds);
        }
        try {
            k.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, mBridgeIds.getUnitId(), "flb_size=" + i2 + "x" + i + "&flb_type=" + i3 + t2.i.c);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
