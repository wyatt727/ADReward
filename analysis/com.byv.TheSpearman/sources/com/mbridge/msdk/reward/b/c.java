package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RewardVideoControllerInitTask.java */
/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3449a;
    private final String b;

    public c(Context context, String str) {
        this.f3449a = context;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA;
        if (this.f3449a == null || TextUtils.isEmpty(this.b)) {
            return;
        }
        try {
            com.mbridge.msdk.reward.c.a.a(this.f3449a, this.b);
            ab.a();
            ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES));
            ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML));
            com.mbridge.msdk.videocommon.d.b.a().c(this.b);
            if (af.a().a("c_d_v_w_i", false) || TextUtils.isEmpty(this.b) || (copyOnWriteArrayListA = com.mbridge.msdk.videocommon.a.a.a().a(this.b, 1)) == null || copyOnWriteArrayListA.size() <= 0) {
                return;
            }
            com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f3449a, this.b, copyOnWriteArrayListA, 94, (com.mbridge.msdk.videocommon.listener.a) null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoControllerInitTask", "initRewardVideoController task ", e);
            }
        }
    }
}
