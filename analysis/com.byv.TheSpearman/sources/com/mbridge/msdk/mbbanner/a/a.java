package com.mbridge.msdk.mbbanner.a;

import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aq;
import com.mbridge.msdk.mbbanner.common.a.b;
import com.mbridge.msdk.mbbanner.common.c.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: BannerController.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f3034a = "BannerController";
    private String b;
    private String c;
    private MBridgeIds d;
    private boolean e;
    private int f;
    private MBBannerView g;
    private int h;
    private int i;
    private int j;
    private BannerAdListener l;
    private CampaignUnit m;
    private c n;
    private k o;
    private j p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int k = -1;
    private com.mbridge.msdk.mbbanner.common.b.c v = new com.mbridge.msdk.mbbanner.common.b.c() { // from class: com.mbridge.msdk.mbbanner.a.a.1
        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(List<CampaignEx> list) {
            if (a.this.l != null) {
                a.this.l.onLoadSuccessed(a.this.d);
            }
            ad.b(a.f3034a, "onShowSuccessed:");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(CampaignEx campaignEx) {
            a.this.d();
            if (a.this.l != null) {
                a.this.l.onLogImpression(a.this.d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(String str) {
            a.this.b(str);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a() {
            if (a.this.l != null) {
                a.this.l.onClick(a.this.d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void b() {
            if (a.this.l != null) {
                a.this.l.onLeaveApp(a.this.d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void c() {
            if (a.this.l != null) {
                a.this.l.showFullScreen(a.this.d);
                a.this.u = true;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, a.this.c, a.this.b, null, null);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void d() {
            if (a.this.l != null) {
                a.this.l.closeFullScreen(a.this.d);
                a.this.u = false;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, a.this.c, a.this.b, new b(a.this.i + "x" + a.this.h, a.this.j * 1000), a.this.w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void e() {
            if (a.this.l != null) {
                a.this.l.onCloseBanner(a.this.d);
            }
        }
    };
    private com.mbridge.msdk.mbbanner.common.b.b w = new com.mbridge.msdk.mbbanner.common.b.b() { // from class: com.mbridge.msdk.mbbanner.a.a.2
        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, CampaignUnit campaignUnit, boolean z) {
            a.this.m = campaignUnit;
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            String str;
            CampaignEx campaignExC;
            boolean zE;
            str = "";
            if (bVar != null) {
                String strB = bVar.b();
                str = TextUtils.isEmpty(strB) ? "" : strB;
                campaignExC = bVar.c();
                zE = bVar.e();
            } else {
                campaignExC = null;
                zE = false;
            }
            if (a.this.l != null) {
                a.this.l.onLoadFailed(a.this.d, str);
            }
            a.this.d();
            try {
                com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.b, zE, campaignExC);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, boolean z) {
            if (a.this.m != null) {
                try {
                    com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), a.this.m.getAds(), a.this.b, z);
                } catch (Exception unused) {
                }
            }
            if (a.this.g != null) {
                a.this.t = true;
                a.this.i();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void b(com.mbridge.msdk.foundation.c.b bVar) {
            String str;
            if (a.this.l != null) {
                a.this.l.onLoadFailed(a.this.d, "banner res load failed");
            }
            a.this.d();
            boolean zE = false;
            CampaignEx campaignExC = null;
            str = "";
            if (bVar != null) {
                String strB = bVar.b();
                str = TextUtils.isEmpty(strB) ? "" : strB;
                zE = bVar.e();
                campaignExC = bVar.c();
            }
            com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.b, zE, campaignExC);
        }
    };

    private int b(int i) {
        if (i <= 0) {
            return i;
        }
        if (i < 10) {
            return 10;
        }
        return i > 180 ? Opcodes.GETFIELD : i;
    }

    public final String a() {
        CampaignUnit campaignUnit = this.m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.m.getRequestId();
    }

    public final String b() {
        CampaignUnit campaignUnit = this.m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.a(campaignUnit.getAds()) : "";
    }

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.g = mBBannerView;
        if (bannerSize != null) {
            this.h = bannerSize.getHeight();
            this.i = bannerSize.getWidth();
        }
        this.b = str2;
        this.c = TextUtils.isEmpty(str) ? "" : str;
        this.d = new MBridgeIds(this.c, this.b);
        String strK = com.mbridge.msdk.foundation.controller.c.m().k();
        String strB = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.p == null) {
            this.p = new j();
        }
        this.p.a(com.mbridge.msdk.foundation.controller.c.m().c(), strK, strB, this.b);
        h();
    }

    public final void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.h = bannerSize.getHeight();
            this.i = bannerSize.getWidth();
        }
    }

    public final void a(int i) {
        int iB = b(i);
        this.k = iB;
        this.j = iB;
    }

    public final void a(boolean z) {
        this.e = z;
        this.f = z ? 1 : 2;
    }

    private void h() {
        k kVarD = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.b);
        this.o = kVarD;
        if (kVarD == null) {
            this.o = k.d(this.b);
        }
        if (this.k == -1) {
            this.j = b(this.o.q());
        }
        if (this.f == 0) {
            boolean z = this.o.f() == 1;
            this.e = z;
            c cVar = this.n;
            if (cVar != null) {
                cVar.a(z);
            }
        }
    }

    public final void a(String str) {
        if (this.h < 1 || this.i < 1) {
            BannerAdListener bannerAdListener = this.l;
            if (bannerAdListener != null) {
                bannerAdListener.onLoadFailed(this.d, "banner load failed because params are exception");
                return;
            }
            return;
        }
        boolean zA = false;
        try {
            zA = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
        } catch (Exception unused) {
        }
        if (!zA) {
            BannerAdListener bannerAdListener2 = this.l;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onLoadFailed(this.d, "banner load failed because WebView is not available");
                return;
            }
            return;
        }
        b bVar = new b(this.i + "x" + this.h, this.j * 1000);
        bVar.a(str);
        bVar.b(this.c);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(this.c, this.b, bVar, this.w);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(1, this.c, this.b, bVar, this.w);
    }

    public final void a(BannerAdListener bannerAdListener) {
        this.l = bannerAdListener;
    }

    public final void c() {
        this.s = true;
        if (this.l != null) {
            this.l = null;
        }
        if (this.w != null) {
            this.w = null;
        }
        if (this.v != null) {
            this.v = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.c, this.b, null, null);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(this.b);
        com.mbridge.msdk.mbbanner.common.c.a.a().b();
        c cVar = this.n;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.s || !this.t) {
            return;
        }
        MBBannerView mBBannerView = this.g;
        if (this.m != null) {
            if (this.n == null) {
                this.n = new c(mBBannerView, this.v, this.c, this.b, this.e, this.o);
            }
            this.n.b(this.q);
            this.n.c(this.r);
            this.n.a(this.e, this.f);
            this.n.a(this.m);
        } else {
            b("banner show failed because campain is exception");
        }
        this.t = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        BannerAdListener bannerAdListener = this.l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.d, str);
        }
        ad.b(f3034a, "showFailed:" + str);
        d();
    }

    public final void d() {
        if (this.s) {
            return;
        }
        j();
        h();
        b bVar = new b(this.i + "x" + this.h, this.j * 1000);
        bVar.b(this.c);
        bVar.a(true);
        com.mbridge.msdk.mbbanner.common.c.a.a().b(this.c, this.b, bVar, this.w);
    }

    public final void b(boolean z) {
        this.q = z;
        k();
        i();
    }

    public final void c(boolean z) {
        this.r = z;
        k();
    }

    private void j() {
        MBBannerView mBBannerView = this.g;
        if (mBBannerView != null) {
            if (this.q && this.r && !this.u && !aq.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.c, this.b, new b(this.i + "x" + this.h, this.j * 1000), this.w);
            } else {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, this.c, this.b, null, null);
            }
            if (this.q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.c, this.b, null, null);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.b);
        }
    }

    private void k() {
        j();
        c cVar = this.n;
        if (cVar != null) {
            cVar.b(this.q);
            this.n.c(this.r);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.a(i, i2, i3, i4);
        }
    }

    public final void e() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.c, this.b, new b(this.i + "x" + this.h, this.j * 1000), this.w);
    }

    public final void f() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.c, this.b, new b(this.i + "x" + this.h, this.j * 1000), this.w);
    }
}
