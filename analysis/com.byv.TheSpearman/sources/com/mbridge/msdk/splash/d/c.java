package com.mbridge.msdk.splash.d;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.splash.c.e;
import com.mbridge.msdk.splash.c.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* compiled from: SplashProvider.java */
/* loaded from: classes4.dex */
public final class c {
    private static String b = "SplashProvider";
    private boolean A;
    private CampaignEx B;
    private MBSplashPopView C;
    private String c;
    private String d;
    private MBridgeIds e;
    private long g;
    private e h;
    private f i;
    private b j;
    private MBSplashShowListener k;
    private d l;
    private MBSplashView m;
    private ViewGroup n;
    private View o;
    private k p;
    private boolean q;
    private ViewGroup r;
    private j s;
    private boolean t;
    private Activity z;
    private int f = 5;
    private int u = 1;
    private int v = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
    private int w = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
    private Object x = new Object();
    private Object y = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3507a = false;
    private boolean D = false;

    public final void a(ViewGroup viewGroup) {
        this.r = viewGroup;
    }

    public final boolean a() {
        return this.q;
    }

    public final void a(boolean z) {
        this.q = z;
    }

    public final void a(int i) {
        this.u = i;
    }

    public c(Activity activity, String str, String str2) {
        this.d = TextUtils.isEmpty(str) ? "" : str;
        this.c = str2;
        this.e = new MBridgeIds(str, str2);
        this.z = activity;
        if (this.i == null) {
            if (activity != null) {
                this.i = new f(activity, this.d, this.c);
            } else {
                this.i = new f(com.mbridge.msdk.foundation.controller.c.m().c(), this.d, this.c);
            }
        }
        if (this.m == null) {
            if (activity != null) {
                this.m = new MBSplashView(activity);
            } else {
                this.m = new MBSplashView(com.mbridge.msdk.foundation.controller.c.m().c());
            }
        }
        if (this.s == null) {
            this.s = new j();
        }
        this.s.a(com.mbridge.msdk.foundation.controller.c.m().c(), com.mbridge.msdk.foundation.controller.c.m().k(), com.mbridge.msdk.foundation.controller.c.m().b(), this.c);
    }

    public final void a(long j) {
        this.g = j;
    }

    public final long b() {
        return this.g;
    }

    public final boolean c() {
        return this.t;
    }

    public final void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.j == null) {
            this.j = new b(this, this.e);
        }
        this.j.a(mBSplashLoadListener);
    }

    public final void a(MBSplashShowListener mBSplashShowListener) {
        this.k = mBSplashShowListener;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.j != null) {
                this.j.a(new com.mbridge.msdk.foundation.c.b(880035), 1);
                return;
            }
            return;
        }
        a(str, 1);
    }

    public final void b(String str) {
        a(str, 1);
    }

    public final void a(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.j != null) {
                this.j.a(new com.mbridge.msdk.foundation.c.b(880036), 1);
                return;
            }
            return;
        }
        a(str, viewGroupA);
    }

    public final void a(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.j != null) {
                this.j.a(new com.mbridge.msdk.foundation.c.b(880035), 1);
                return;
            }
            return;
        }
        b(str, viewGroup);
    }

    public final void b(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.j != null) {
                this.j.a(new com.mbridge.msdk.foundation.c.b(880036), 1);
                return;
            }
            return;
        }
        b(str, viewGroupA);
    }

    public final void b(String str, ViewGroup viewGroup) {
        this.n = viewGroup;
        MBSplashView mBSplashView = this.m;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public final boolean c(String str) {
        return com.mbridge.msdk.splash.c.d.a(this.m, this.d, this.c, str, this.t, this.f, false, true) != null;
    }

    public final void b(boolean z) {
        this.t = z;
    }

    public final void b(int i) {
        this.f = i;
    }

    public final int d() {
        return this.f;
    }

    public final void a(int i, int i2) {
        b(i2, i);
    }

    public final String e() {
        if (!this.f3507a) {
            e eVar = this.h;
            return eVar != null ? eVar.a() : "";
        }
        f fVar = this.i;
        return fVar != null ? fVar.a() : "";
    }

    public final String f() {
        if (!this.f3507a) {
            e eVar = this.h;
            return eVar != null ? eVar.b() : "";
        }
        f fVar = this.i;
        return fVar != null ? fVar.b() : "";
    }

    public final void c(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            MBSplashShowListener mBSplashShowListener = this.k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.e, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, viewGroupA);
    }

    public final void c(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.e, "token is null or empty");
                return;
            }
            return;
        }
        d(str, viewGroup);
    }

    public final void d(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            MBSplashShowListener mBSplashShowListener = this.k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.e, "activity is except,please check it");
                return;
            }
            return;
        }
        d(str, viewGroupA);
    }

    public final void d(String str, ViewGroup viewGroup) {
        this.n = viewGroup;
        MBSplashView mBSplashView = this.m;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExA = com.mbridge.msdk.splash.c.d.a(this.m, this.d, this.c, str, this.t, this.f, true, false);
        if (campaignExA != null) {
            if (this.p == null) {
                this.p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.c);
            }
            d dVar = new d(this, this.k, campaignExA);
            this.l = dVar;
            if (this.v == 0 || this.w == 0) {
                dVar.a(this.e, "width or height is 0  or width or height is too small");
                return;
            }
            int i = this.f;
            if (i < 2 || i > 10) {
                dVar.a(this.e, "countDownTime must in 2 - 10 ,but now is " + this.f);
                return;
            }
            a(campaignExA, this.p.r(), false);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.k;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.e, "campaignEx is vali");
        }
    }

    final void a(CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx != null && z) {
            if (this.p == null) {
                this.p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.c);
            }
            this.l = new d(this, this.k, campaignEx);
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup == null) {
            d dVar = this.l;
            if (dVar != null) {
                dVar.a(this.e, "container is null");
                return;
            }
            return;
        }
        if (this.i == null) {
            this.i = new f(viewGroup.getContext(), this.d, this.c);
        }
        this.B = campaignEx;
        b(campaignEx, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final CampaignEx campaignEx, final int i, final boolean z) {
        if (!com.mbridge.msdk.splash.c.d.a(this.m, campaignEx)) {
            if (i > 0) {
                this.i.o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.d.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.b(campaignEx, i - 1, z);
                    }
                }, 1L);
                return;
            }
            d dVar = this.l;
            if (dVar != null) {
                dVar.a(this.e, "campaignEx is not ready");
                return;
            }
            return;
        }
        d(true);
        ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.n.setLayoutParams(layoutParams);
        this.n.removeAllViews();
        this.i.a(this.f);
        this.i.a(this.r);
        this.i.a(this.l);
        ad.b(b, "start show process");
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ar.a(this.m);
            this.n.addView(this.m);
        }
        this.i.a(this.t);
        this.i.a(campaignEx, this.m);
    }

    private void a(String str, int i) {
        synchronized (this.x) {
            if (this.q) {
                if (this.j != null) {
                    this.j.a(new com.mbridge.msdk.foundation.c.b(880016, "current unit is loading"), i);
                    this.q = true;
                }
                return;
            }
            this.q = true;
            int i2 = this.f;
            if (i2 < 2 || i2 > 10) {
                if (this.j != null) {
                    com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880037);
                    bVar.a("countDownTime must in 2 - 10");
                    this.j.a(bVar, i);
                    return;
                }
                return;
            }
            if (this.v == 0 || this.w == 0) {
                if (this.j != null) {
                    this.j.a(new com.mbridge.msdk.foundation.c.b(880028), i);
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
                if (this.j != null) {
                    this.j.a(new com.mbridge.msdk.foundation.c.b(880029), i);
                    return;
                }
                return;
            }
            this.m.clearResState();
            this.p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.c);
            if (this.h == null) {
                this.h = new e(this.d, this.c, this.g * 1000);
            }
            b bVar2 = this.j;
            if (bVar2 != null) {
                bVar2.a(str);
                this.h.a(this.j);
            }
            this.m.resetLoadState();
            this.h.a(this.f);
            this.h.a(this.m);
            this.h.a(this.p);
            this.h.a(this.v, this.w);
            this.h.a(this.t);
            this.h.b(this.u);
            this.h.a(str, i);
        }
    }

    public final void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.o = view;
        if (view != null) {
            b(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.m;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public final void c(boolean z) {
        this.A = z;
    }

    public final ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.m().c(), new BaseSplashPopView.a(this.d, this.c, zoomOutTypeEnum.getIndex(), this.B), this.l);
        this.C = mBSplashPopView;
        return mBSplashPopView;
    }

    public final void g() {
        this.D = true;
        MBSplashPopView mBSplashPopView = this.C;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public final void h() {
        this.D = false;
        MBSplashShowListener mBSplashShowListener = this.k;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.d, this.c));
        }
        MBSplashPopView mBSplashPopView = this.C;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    private void b(int i, int i2) {
        int i3 = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
        int iG = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
        int i4 = this.u;
        if (i4 == 1) {
            if (iG >= i2 * 4) {
                this.w = iG - i2;
                this.v = i3;
                return;
            } else {
                this.w = 0;
                this.v = 0;
                return;
            }
        }
        if (i4 == 2) {
            if (i3 >= i * 4) {
                this.v = i3 - i;
                this.w = iG;
            } else {
                this.w = 0;
                this.v = 0;
            }
        }
    }

    public final void i() {
        f fVar = this.i;
        if (fVar != null) {
            fVar.c();
        }
        MBSplashPopView mBSplashPopView = this.C;
        if (mBSplashPopView == null || !this.D) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public final void d(boolean z) {
        MBSplashView mBSplashView = this.m;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z);
        }
    }

    private ViewGroup a(Activity activity) {
        Throwable th;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            ad.d(b, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Throwable th2) {
            th = th2;
            viewGroup = null;
        }
        try {
            try {
                return (ViewGroup) viewGroup.getChildAt(0);
            } catch (Exception e) {
                e.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
            return viewGroup;
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        try {
            MBSplashView mBSplashView = this.m;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i, i2, i3, i4);
            }
        } catch (Throwable th) {
            ad.b(b, th.getMessage());
        }
    }

    public final void j() {
        f fVar = this.i;
        if (fVar != null) {
            fVar.d();
        }
        MBSplashPopView mBSplashPopView = this.C;
        if (mBSplashPopView == null || !this.D) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public final void k() {
        this.B = null;
        if (this.k != null) {
            this.k = null;
        }
        if (this.j != null) {
            this.j = null;
        }
        if (this.l != null) {
            this.l = null;
        }
        e eVar = this.h;
        if (eVar != null) {
            eVar.c();
        }
        f fVar = this.i;
        if (fVar != null) {
            fVar.e();
        }
        if (this.z != null) {
            this.z = null;
        }
    }
}
