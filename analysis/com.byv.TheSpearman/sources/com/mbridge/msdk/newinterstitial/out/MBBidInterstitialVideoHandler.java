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
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f3241a;
    private String b;
    private String c;
    private String d;
    private String e;
    private a f;
    private d g;
    private NewInterstitialListener i;
    public String mUnitId;
    private int o;
    private int p;
    private int q;
    private boolean h = false;
    private int j = 2;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String strE = ai.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            ai.b(str2, strE);
        }
        this.mUnitId = str2;
        this.f3241a = str;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.mUnitId = str2;
        this.f3241a = str;
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
            ad.a("MBBidInterstitialVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.g == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.g = new d(287, str, str2, true);
        }
    }

    public void loadFromBid(String str) {
        boolean zA = b.a().a("new_bridge_new_interstitial_video");
        this.h = zA;
        if (zA) {
            c();
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f != null) {
            this.f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 2));
        }
    }

    private void a() {
        if (this.f == null) {
            a(this.f3241a, this.mUnitId);
        }
        b();
    }

    private void b() {
        if (this.l) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.i));
            }
            this.l = false;
        }
        if (this.m) {
            a aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.a(this.c, this.b, this.d, this.e);
            }
            this.m = false;
        }
        a aVar3 = this.f;
        if (aVar3 != null) {
            aVar3.a(this.o, this.q, this.p);
            this.f.a(this.j);
        }
    }

    private void c() {
        if (this.g == null) {
            b(this.f3241a, this.mUnitId);
        }
        d();
    }

    private void d() {
        if (this.k) {
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.i));
            }
            this.k = false;
        }
        if (this.n) {
            MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, this.c, this.b, this.d, this.e);
            this.n = false;
        }
        d dVar2 = this.g;
        if (dVar2 != null) {
            dVar2.a(this.o, this.q, this.p);
            this.g.a(this.j);
        }
    }

    public void loadFormSelfFilling() {
        boolean zA = b.a().a("new_bridge_new_interstitial_video");
        this.h = zA;
        if (zA) {
            c();
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f != null) {
            this.f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 1));
        }
    }

    public boolean isBidReady() {
        if (this.h) {
            d dVar = this.g;
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
        if (this.h) {
            d dVar = this.g;
            return dVar != null ? dVar.c() : "";
        }
        a aVar = this.f;
        return aVar != null ? aVar.a() : "";
    }

    public String getCreativeIdWithUnitId() {
        if (this.h) {
            d dVar = this.g;
            return dVar != null ? dVar.d() : "";
        }
        a aVar = this.f;
        return aVar != null ? aVar.d() : "";
    }

    public void showFromBid() {
        if (this.h) {
            c();
            d dVar = this.g;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f != null) {
            this.f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, false, -1));
        }
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.i = newInterstitialListener;
        this.k = true;
        this.l = true;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.i = newInterstitialListener;
        this.k = true;
        this.l = true;
    }

    public void clearVideoCache() {
        if (this.h) {
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
        this.j = i;
        if (this.h) {
            d dVar = this.g;
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
        this.o = i;
        this.p = i2;
        this.q = com.mbridge.msdk.foundation.same.a.J;
    }

    public void setIVRewardEnable(int i, double d) {
        this.o = i;
        this.p = (int) (d * 100.0d);
        this.q = com.mbridge.msdk.foundation.same.a.I;
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.c = str;
        this.b = str2;
        this.d = str3;
        this.e = str4;
        this.n = true;
        this.m = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.mUnitId, jSONObject);
    }
}
