package com.mbridge.msdk.splash.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* compiled from: SplashLoadListenerImpl.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f3506a;
    private c b;
    private String c;
    private String d;
    private MBridgeIds e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.b = cVar;
        this.e = mBridgeIds;
        if (mBridgeIds != null) {
            this.c = mBridgeIds.getUnitId();
        }
    }

    public final void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f3506a = mBSplashLoadListener;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(CampaignEx campaignEx, int i) {
        c cVar;
        c cVar2 = this.b;
        if (cVar2 == null || !cVar2.a() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f3506a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.e, i);
            this.f3506a.isSupportZoomOut(this.e, campaignEx.getFlb() == 1);
        }
        this.b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        k.a(com.mbridge.msdk.foundation.controller.c.m().c(), arrayList, this.c, campaignEx.isBidCampaign());
        if (i != 2 || (cVar = this.b) == null) {
            return;
        }
        cVar.a(campaignEx, 0, true);
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar, int i) {
        c cVar = this.b;
        if (cVar == null || !cVar.a()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strB = bVar.b();
            if (!TextUtils.isEmpty(strB)) {
                str = strB;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f3506a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.e, str, i);
        }
        this.b.a(false);
        k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, this.c, !TextUtils.isEmpty(this.d), bVar != null ? bVar.c() : null);
    }
}
