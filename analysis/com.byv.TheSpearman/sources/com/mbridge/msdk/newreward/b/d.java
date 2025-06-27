package com.mbridge.msdk.newreward.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.a.f;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.Iterator;

/* compiled from: RewardVideoController.java */
/* loaded from: classes4.dex */
public final class d extends a implements RewardVideoListener, c {
    RewardVideoListener d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private int i;

    public d(int i, String str, String str2, boolean z) {
        super(i, str, str2, z);
        this.e = 2;
        this.f = false;
        if (i == 287) {
            this.e = com.mbridge.msdk.foundation.same.a.W;
        } else {
            this.e = com.mbridge.msdk.foundation.same.a.V;
        }
    }

    @Override // com.mbridge.msdk.newreward.b.a
    final void a() {
        this.b.a(this.f3298a, this.c);
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(boolean z, String str) {
        f fVar = new f(this.f3298a);
        e eVar = new e(z, this.c.e(), str, this.c.c(), this.c.f());
        eVar.d(this.c.d());
        eVar.d(this.e);
        eVar.c(com.mbridge.msdk.foundation.controller.c.m().k());
        eVar.c(this.c.f() ? 2 : 1);
        eVar.e(com.mbridge.msdk.newreward.function.h.b.a(str));
        eVar.b(this.f);
        eVar.a(this.g, this.h, this.i);
        this.b.a(eVar, fVar);
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(String str) {
        this.b.c();
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final boolean b() {
        return this.b.d();
    }

    public final String c() {
        e eVarB;
        com.mbridge.msdk.newreward.function.f.a aVarX;
        com.mbridge.msdk.newreward.function.d.a.b bVarB;
        if (this.b == null || (eVarB = this.b.b()) == null || (aVarX = eVarB.x()) == null || (bVarB = aVarX.b()) == null) {
            return "";
        }
        String strD = bVarB.d();
        return TextUtils.isEmpty(strD) ? "" : strD;
    }

    public final String d() {
        e eVarB;
        com.mbridge.msdk.newreward.function.f.a aVarX;
        com.mbridge.msdk.newreward.function.d.a.b bVarB;
        return (this.b == null || (eVarB = this.b.b()) == null || (aVarX = eVarB.x()) == null || (bVarB = aVarX.b()) == null) ? "" : com.mbridge.msdk.foundation.same.c.a(bVarB.C());
    }

    public final void a(int i) {
        this.e = i;
        if (this.b != null) {
            Iterator<e> it = this.b.a().iterator();
            while (it.hasNext()) {
                it.next().d(i);
            }
        }
    }

    public final void a(int i, int i2, int i3) {
        this.g = i;
        this.h = i2;
        if (i2 == com.mbridge.msdk.foundation.same.a.J) {
            this.i = i3 < 0 ? 5 : i3;
        }
        if (i2 == com.mbridge.msdk.foundation.same.a.I) {
            this.i = i3 < 0 ? 80 : i3;
        }
        com.mbridge.msdk.newreward.function.h.a.a(this.c.c(), i, i2, i3);
    }

    public final void a(boolean z) {
        this.f = z;
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(RewardVideoListener rewardVideoListener) {
        this.d = rewardVideoListener;
        this.b.a(this);
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z, int i) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdCloseWithIVReward(mBridgeIds, z, i);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        try {
            ((MBridgeDailyPlayModel) this.f3298a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).insertDailyCap();
        } catch (Exception e) {
            ad.b("RewardVideoController", "updateDailyShowCap error:" + e.getMessage());
        }
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdShow(mBridgeIds);
        }
    }
}
