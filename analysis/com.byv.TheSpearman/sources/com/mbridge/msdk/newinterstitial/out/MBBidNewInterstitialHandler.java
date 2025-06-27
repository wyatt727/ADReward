package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.b.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBBidNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f3242a;
    private String b;
    private String c;
    private String d;
    private String e;
    private a f;
    private String g;
    private d h;
    private NewInterstitialListener j;
    private int p;
    private int q;
    private int r;
    private boolean i = false;
    private int k = 2;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String strE = ai.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            ai.b(str2, strE);
        }
        this.f3242a = str;
        this.g = str2;
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        this.f3242a = str;
        this.g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f == null) {
                a aVar = new a();
                this.f = aVar;
                aVar.a(true);
                this.f.b(true);
                this.f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidNewInterstitialHandler", th.getMessage(), th);
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
        boolean zA = b.a().a("new_bridge_new_interstitial_video");
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
        if (this.f != null) {
            this.f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.g, true, 2));
        }
    }

    private void a() {
        if (this.f == null) {
            a(this.f3242a, this.g);
        }
        if (this.m) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.j, this.g, true));
            }
            this.m = false;
        }
        if (this.n) {
            a aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.a(this.c, this.b, this.d, this.e);
            }
            this.n = false;
        }
        a aVar3 = this.f;
        if (aVar3 != null) {
            aVar3.a(this.k);
            this.f.a(this.p, this.r, this.q);
        }
    }

    private void b() {
        if (this.h == null) {
            b(this.f3242a, this.g);
        }
        if (this.l) {
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.j));
            }
            this.l = false;
        }
        if (this.o) {
            MBridgeGlobalCommon.setAlertDialogText(this.g, this.c, this.b, this.d, this.e);
            this.o = false;
        }
        d dVar2 = this.h;
        if (dVar2 != null) {
            dVar2.a(this.k);
            this.h.a(this.p, this.r, this.q);
        }
    }

    public void loadFormSelfFilling() {
        boolean zA = b.a().a("new_bridge_new_interstitial_video");
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
        if (this.f != null) {
            this.f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.g, true, 1));
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
        a aVar = this.f;
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
        a aVar = this.f;
        return aVar != null ? aVar.a() : "";
    }

    public String getCreativeIdWithUnitId() {
        if (this.i) {
            d dVar = this.h;
            return dVar != null ? dVar.d() : "";
        }
        a aVar = this.f;
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
        if (this.f != null) {
            this.f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.g, false, -1));
        }
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.j = newInterstitialListener;
        this.l = true;
        this.m = true;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.j = newInterstitialListener;
        this.l = true;
        this.m = true;
    }

    public void clearVideoCache() {
        if (this.i) {
            return;
        }
        try {
            if (this.f != null) {
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
        a aVar = this.f;
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
        this.c = str;
        this.b = str2;
        this.d = str3;
        this.e = str4;
        this.n = true;
        this.o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.g, jSONObject);
    }
}
