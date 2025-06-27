package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBBidInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private a f3032a;
    private String b;
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

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String strE = ai.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            ai.b(str2, strE);
        }
        this.b = str2;
        this.c = str;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.b = str2;
        this.c = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f3032a == null) {
                a aVar = new a();
                this.f3032a = aVar;
                aVar.a(true);
                this.f3032a.b(true);
                this.f3032a.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.h = new d(287, str, str2, true);
        }
    }

    public void loadFromBid(String str) {
        boolean zA = b.a().a("new_bridge_reward_video");
        this.i = zA;
        if (zA) {
            b();
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f3032a != null) {
            this.f3032a.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.b, true, 2));
        }
    }

    private void a() {
        if (this.f3032a == null) {
            a(this.c, this.b);
        }
        if (this.m) {
            a aVar = this.f3032a;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.interstitialvideo.a.a(this.j, this.b, true));
            }
            this.m = false;
        }
        if (this.n) {
            a aVar2 = this.f3032a;
            if (aVar2 != null) {
                aVar2.a(this.d, this.e, this.f, this.g);
            }
            this.n = false;
        }
        a aVar3 = this.f3032a;
        if (aVar3 != null) {
            aVar3.a(this.p, this.r, this.q);
            this.f3032a.a(this.k);
        }
    }

    private void b() {
        if (this.h == null) {
            b(this.c, this.b);
        }
        if (this.l) {
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(new InterstitialVideoListenerWrapper(this.j));
            }
            this.l = false;
        }
        if (this.o) {
            MBridgeGlobalCommon.setAlertDialogText(this.b, this.d, this.e, this.f, this.g);
            this.o = false;
        }
        d dVar2 = this.h;
        if (dVar2 != null) {
            dVar2.a(this.p, this.r, this.q);
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
        if (this.f3032a != null) {
            this.f3032a.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.b, true, 1));
        }
    }

    public boolean isBidReady() {
        if (this.i) {
            d dVar = this.h;
            if (dVar != null) {
                return dVar.b();
            }
            return false;
        }
        a aVar = this.f3032a;
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
        a aVar = this.f3032a;
        return aVar != null ? aVar.a() : "";
    }

    public String getCreativeIdWithUnitId() {
        if (this.i) {
            d dVar = this.h;
            return dVar != null ? dVar.d() : "";
        }
        a aVar = this.f3032a;
        return aVar != null ? aVar.d() : "";
    }

    public void showFromBid() {
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
        if (this.f3032a != null) {
            this.f3032a.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.b, false, -1));
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
            if (this.f3032a != null) {
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
        a aVar = this.f3032a;
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
