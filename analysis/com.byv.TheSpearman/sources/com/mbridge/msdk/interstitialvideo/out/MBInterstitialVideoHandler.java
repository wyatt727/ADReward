package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f3033a;
    private a b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private d h;
    private InterstitialVideoListener j;
    private int p;
    private int q;
    private int r;
    private boolean i = false;
    private int k = 2;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String strE = ai.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            ai.b(str2, strE);
        }
        this.f3033a = str;
        this.c = str2;
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        this.c = str2;
        this.f3033a = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.b == null) {
                a aVar = new a();
                this.b = aVar;
                aVar.a(true);
                this.b.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void load() {
        boolean zA = b.a().a("new_bridge_reward_video");
        this.i = zA;
        if (zA) {
            b();
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.b != null) {
            this.b.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.c, true, 2));
        }
    }

    private void a() {
        if (this.b == null) {
            a(this.f3033a, this.c);
        }
        if (this.m) {
            this.b.a(new com.mbridge.msdk.interstitialvideo.a.a(this.j, this.c, false));
            this.m = false;
        }
        if (this.n) {
            this.b.a(this.d, this.e, this.f, this.g);
            this.n = false;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.p, this.r, this.q);
            this.b.a(this.k);
        }
    }

    private void b() {
        if (this.h == null) {
            b(this.f3033a, this.c);
        }
        if (this.l) {
            this.h.a(new InterstitialVideoListenerWrapper(this.j));
            this.l = false;
        }
        if (this.o) {
            MBridgeGlobalCommon.setAlertDialogText(this.c, this.d, this.e, this.f, this.g);
            this.o = false;
        }
        d dVar = this.h;
        if (dVar != null) {
            dVar.a(this.p, this.r, this.q);
            this.h.a(this.k);
        }
    }

    public void loadFormSelfFilling() {
        boolean zA = b.a().a("new_bridge_reward_video");
        this.i = zA;
        if (zA) {
            b();
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.b != null) {
            this.b.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.c, true, 1));
        }
    }

    public boolean isReady() {
        if (this.i) {
            d dVar = this.h;
            if (dVar != null) {
                return dVar.b();
            }
            return false;
        }
        a aVar = this.b;
        if (aVar != null) {
            return aVar.d(true);
        }
        return false;
    }

    public String getRequestId() {
        if (this.i) {
            d dVar = this.h;
            return dVar != null ? dVar.c() : "";
        }
        a aVar = this.b;
        return aVar != null ? aVar.a() : "";
    }

    public String getCreativeIdWithUnitId() {
        if (this.i) {
            d dVar = this.h;
            return dVar != null ? dVar.d() : "";
        }
        a aVar = this.b;
        return aVar != null ? aVar.d() : "";
    }

    public void show() {
        if (this.i) {
            b();
            d dVar = this.h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.b != null) {
            this.b.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.c, false, -1));
        }
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.j = interstitialVideoListener;
        this.m = true;
        this.l = true;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.j = interstitialVideoListener;
        this.m = true;
        this.l = true;
    }

    public void clearVideoCache() {
        if (this.i) {
            return;
        }
        try {
            if (this.b != null) {
                ab.b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playVideoMute(int i) {
        this.k = i;
        if (this.i) {
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(i);
                return;
            }
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public void setIVRewardEnable(int i, int i2) {
        this.p = i;
        this.q = i2;
        this.r = com.mbridge.msdk.foundation.same.a.J;
    }

    public void setIVRewardEnable(int i, double d) {
        this.p = i;
        this.q = (int) (d * 100.0d);
        this.r = com.mbridge.msdk.foundation.same.a.I;
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.n = true;
        this.o = true;
    }
}
