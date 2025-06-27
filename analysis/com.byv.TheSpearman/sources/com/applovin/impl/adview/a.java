package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.aa;
import com.applovin.impl.adview.k;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.ca;
import com.applovin.impl.e0;
import com.applovin.impl.g0;
import com.applovin.impl.ig;
import com.applovin.impl.kg;
import com.applovin.impl.kn;
import com.applovin.impl.lb;
import com.applovin.impl.lc;
import com.applovin.impl.oj;
import com.applovin.impl.qb;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.impl.ur;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber {
    private static final AtomicReference G = new AtomicReference();
    private volatile AppLovinAdLoadListener B;
    private volatile AppLovinAdDisplayListener C;
    private volatile AppLovinAdViewEventListener D;
    private volatile AppLovinAdClickListener E;

    /* renamed from: a, reason: collision with root package name */
    private Context f243a;
    private ViewGroup b;
    private com.applovin.impl.sdk.k c;
    private AppLovinAdServiceImpl d;
    private t f;
    private AppLovinCommunicator g;
    private b h;
    private AppLovinAdSize j;
    private String k;
    private CustomTabsSession l;
    private com.applovin.impl.adview.c m;
    private e n;
    private com.applovin.impl.adview.b o;
    private k p;
    private Runnable q;
    private Runnable r;
    private final Map i = Collections.synchronizedMap(new HashMap());
    private volatile com.applovin.impl.sdk.ad.b s = null;
    private volatile AppLovinAd t = null;
    private f u = null;
    private f v = null;
    private final AtomicReference w = new AtomicReference();
    private final AtomicBoolean x = new AtomicBoolean();
    private volatile boolean y = false;
    private volatile boolean z = false;
    private volatile boolean A = false;
    private volatile g0 F = null;

    public interface b {
        void a(a aVar);
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.o != null) {
                a.this.o.setVisibility(8);
            }
        }
    }

    private class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        class C0021a implements k.a {
            C0021a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.o.addView(a.this.p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void onFailure() {
                t unused = a.this.f;
                if (t.a()) {
                    a.this.f.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.s != null) {
                if (a.this.o == null) {
                    t.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    bc.a(a.this.D, a.this.s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    return;
                }
                a.this.w();
                t unused = a.this.f;
                if (t.a()) {
                    a.this.f.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.s.getAdIdNumber() + "...");
                }
                a.b(a.this.o, a.this.s.getSize());
                if (a.this.p != null) {
                    ar.c(a.this.p);
                    a.this.p = null;
                }
                ca caVar = new ca(a.this.i, a.this.c);
                if (caVar.c()) {
                    a.this.p = new k(caVar, a.this.f243a);
                    a.this.p.a(new C0021a());
                }
                a.this.o.setAdHtmlLoaded(false);
                a.this.o.a(a.this.s);
                if (a.this.s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.z) {
                    return;
                }
                a.this.s.setHasShown(true);
            }
        }
    }

    static class e implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final a f247a;

        e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f247a = aVar;
        }

        private a a() {
            return this.f247a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                t.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i);
            }
        }
    }

    private void F() {
        com.applovin.impl.adview.b bVar;
        if (this.f != null && t.a() && t.a()) {
            this.f.a("AppLovinAdView", "Destroying...");
        }
        if (!((Boolean) this.c.a(oj.G1)).booleanValue() || (bVar = this.o) == null) {
            ur.b(this.o);
        } else {
            ur.a(bVar);
            f().a(this.o, new qb.b() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda6
                @Override // com.applovin.impl.qb.b
                public final void a(Object obj) {
                    ur.b((b) obj);
                }
            });
        }
        this.o = null;
        this.l = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.D = null;
        this.z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.applovin.impl.adview.b o() {
        return new com.applovin.impl.adview.b(this.c, this.f243a.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.o.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.b == null || (bVar = this.o) == null || bVar.getParent() != null) {
            return;
        }
        this.b.addView(this.o);
        b(this.o, this.s.getSize());
        if (this.s.isOpenMeasurementEnabled()) {
            this.s.getAdEventTracker().a((View) this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.o != null && this.u != null) {
            a();
        }
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (this.u != null) {
            if (t.a()) {
                this.f.a("AppLovinAdView", "Detaching expanded ad: " + this.u.b());
            }
            this.v = this.u;
            this.u = null;
            a(this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.v;
        if (fVar == null && this.u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.v.dismiss();
            this.v = null;
        } else {
            aVarB = this.u.b();
            this.u.dismiss();
            this.u = null;
        }
        bc.a(this.D, aVarB, (AppLovinAdView) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        g().loadUrl("chrome://crash");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        com.applovin.impl.sdk.ad.b bVar = this.s;
        lc lcVar = new lc();
        lcVar.a().a(bVar).a(k());
        if (!zp.a(bVar.getSize())) {
            lcVar.a().a("Fullscreen Ad Properties").b(bVar);
        }
        lcVar.a(this.c);
        lcVar.a();
        if (t.a()) {
            this.f.a("AppLovinAdView", lcVar.toString());
        }
    }

    public void A() {
        if (e0.a(this.o)) {
            this.c.F().c(aa.r);
        }
    }

    public void B() {
        if (this.y) {
            bc.b(this.C, this.s);
            if (this.s != null && this.s.isOpenMeasurementEnabled() && zp.a(this.s.getSize())) {
                this.s.getAdEventTracker().f();
            }
            if (this.o == null || this.u == null) {
                if (t.a()) {
                    this.f.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                }
            } else {
                if (t.a()) {
                    this.f.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            }
        }
    }

    public void C() {
        this.A = true;
    }

    public void D() {
        this.A = false;
    }

    public void E() {
        if (!this.y || this.z) {
            return;
        }
        this.z = true;
    }

    public void G() {
        if (this.y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    public AppLovinAdView k() {
        return (AppLovinAdView) this.b;
    }

    public com.applovin.impl.sdk.k l() {
        return this.c;
    }

    public AppLovinAdSize m() {
        return this.j;
    }

    public String n() {
        return this.k;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.u();
                }
            });
        }
    }

    public void v() {
        if (this.c == null || this.n == null || this.f243a == null || !this.y) {
            t.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.d.loadNextAd(this.k, this.j, this.n);
        }
    }

    public void x() {
        if ((this.f243a instanceof r6) && this.s != null && this.s.R() == b.EnumC0043b.DISMISS) {
            ((r6) this.f243a).dismiss();
        }
    }

    public void y() {
        if (this.u != null || this.v != null) {
            a();
            return;
        }
        if (t.a()) {
            this.f.a("AppLovinAdView", "Ad: " + this.s + " closed.");
        }
        a(this.r);
        bc.b(this.C, this.s);
        this.s = null;
    }

    public void z() {
        if (t.a()) {
            this.f.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = label.equals(appLovinAdSize2.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        int iApplyDimension2 = appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel()) ? -1 : appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.s();
            }
        });
    }

    private void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.t();
            }
        });
    }

    public static qb f() {
        AtomicReference atomicReference = G;
        Object dVar = atomicReference.get();
        if (dVar == null) {
            synchronized (atomicReference) {
                dVar = atomicReference.get();
                if (dVar == null) {
                    dVar = new qb.d();
                    atomicReference.set(dVar);
                }
            }
        }
        if (dVar == atomicReference) {
            dVar = null;
        }
        return (qb) dVar;
    }

    public AppLovinAdViewEventListener e() {
        return this.D;
    }

    public com.applovin.impl.adview.b g() {
        return this.o;
    }

    public com.applovin.impl.sdk.ad.b i() {
        return this.s;
    }

    public CustomTabsSession j() {
        return this.l;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.s.getAdEventTracker().c(webView);
        k kVar = this.p;
        if (kVar != null && kVar.a()) {
            ig adEventTracker = this.s.getAdEventTracker();
            k kVar2 = this.p;
            adEventTracker.b(webView, Collections.singletonList(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.s.getAdEventTracker().a((View) webView);
        }
        this.s.getAdEventTracker().h();
        this.s.getAdEventTracker().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.u == null && (this.s instanceof com.applovin.impl.sdk.ad.a) && this.o != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.s;
            Context context = this.f243a;
            Activity activityA = context instanceof Activity ? (Activity) context : ar.a(this.o, this.c);
            if (activityA != null && !activityA.isFinishing()) {
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.o);
                }
                f fVar = new f(aVar, this.o, activityA, this.c);
                this.u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f$0.a(dialogInterface);
                    }
                });
                this.u.show();
                bc.c(this.D, this.s, (AppLovinAdView) this.b);
                if (this.s.isOpenMeasurementEnabled()) {
                    this.s.getAdEventTracker().a((View) this.u.c());
                    return;
                }
                return;
            }
            t.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriJ = aVar.j();
            if (uriJ != null) {
                this.d.trackAndLaunchClick(aVar, k(), this, uriJ, motionEvent, this.A, null);
            }
            this.o.a("javascript:al_onFailedExpand();");
        }
    }

    void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.z) {
                c(appLovinAd);
            } else {
                this.w.set(appLovinAd);
                if (t.a()) {
                    this.f.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(appLovinAd);
                }
            });
            return;
        }
        if (t.a()) {
            this.f.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public g0 h() {
        return this.F;
    }

    public void a(g0 g0Var) {
        this.F = g0Var;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.B = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.C = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.D = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.E = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.c = kVar;
            this.d = kVar.i();
            this.f = kVar.L();
            this.g = AppLovinCommunicator.getInstance(context);
            this.j = appLovinAdSize;
            this.k = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f243a = context;
            this.b = appLovinAdView;
            this.m = new com.applovin.impl.adview.c(this, kVar);
            this.r = new c();
            this.q = new d();
            this.n = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (!this.z) {
            a(this.r);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i);
            }
        });
    }

    protected void a(AppLovinAdSize appLovinAdSize) {
        try {
            if (((Boolean) this.c.a(oj.G1)).booleanValue()) {
                this.o = (com.applovin.impl.adview.b) f().a(new qb.a() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda5
                    @Override // com.applovin.impl.qb.a
                    public final Object a() {
                        return this.f$0.o();
                    }
                });
            } else {
                this.o = new com.applovin.impl.adview.b(this.c, this.f243a);
            }
            this.o.a(this.m);
            this.o.setBackgroundColor(0);
            this.o.setWillNotCacheDrawing(false);
            this.b.setBackgroundColor(0);
            this.b.addView(this.o);
            b(this.o, appLovinAdSize);
            if (!this.y) {
                a(this.r);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.p();
                }
            });
            this.y = true;
        } catch (Throwable th) {
            t.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.c.B().a("AppLovinAdView", "initAdWebView", th);
            this.x.set(true);
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            t.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = e0.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (e0.b(attributeSet)) {
                v();
            }
        }
    }

    public void a(String str, Object obj) {
        this.i.put(str, obj);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            zp.b(appLovinAd, this.c);
            if (this.y) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) zp.a(appLovinAd, this.c);
                if (bVar == null) {
                    t.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    bc.a(this.C, "Unable to retrieve the loaded ad");
                    return;
                }
                if (bVar == this.s) {
                    t.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.c.a(oj.Y1)).booleanValue()) {
                        if (this.C instanceof lb) {
                            bc.a(this.C, "Attempting to show ad again");
                            return;
                        }
                        throw new IllegalStateException("Attempting to show ad again");
                    }
                    return;
                }
                if (t.a()) {
                    this.f.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                bc.b(this.C, this.s);
                if (this.s != null && this.s.isOpenMeasurementEnabled()) {
                    this.s.getAdEventTracker().f();
                }
                this.w.set(null);
                this.t = null;
                this.s = bVar;
                if (this.s.A0()) {
                    this.l = this.c.w().a(this);
                    this.c.w().b(this.s.A(), this.l);
                }
                if (!this.z && zp.a(this.j)) {
                    this.c.i().trackImpression(bVar);
                }
                if (this.u != null) {
                    c();
                }
                a(this.q);
                return;
            }
            t.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    public void a(final WebView webView, String str) {
        if (this.s == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((Boolean) this.c.a(oj.m6)).booleanValue() || (str != null && str.startsWith(this.s.h()))) {
            try {
                if (this.s != this.t) {
                    this.t = this.s;
                    this.o.setAdHtmlLoaded(true);
                    if (this.C != null) {
                        this.c.v().d(this.s);
                        bc.a(this.C, this.s);
                        this.o.a("javascript:al_onAdViewRendered();");
                    }
                    if ((this.s instanceof com.applovin.impl.sdk.ad.a) && this.s.isOpenMeasurementEnabled()) {
                        this.c.l0().a(new kn(this.c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.b(webView);
                            }
                        }), sm.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                t.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.k kVar = this.c;
                if (kVar != null) {
                    kVar.B().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    public void a(final MotionEvent motionEvent) {
        a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.q();
            }
        });
    }

    void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (appLovinAdView != null) {
            this.d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent, this.A, bundle);
        } else if (t.a()) {
            this.f.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        bc.a(this.E, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.x.compareAndSet(true, false)) {
            a(this.j);
        }
        try {
            if (this.B != null) {
                this.B.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            t.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.k kVar = this.c;
            if (kVar != null) {
                kVar.B().a("AppLovinAdView", "notifyAdLoaded", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        try {
            if (this.B != null) {
                this.B.failedToReceiveAd(i);
            }
        } catch (Throwable th) {
            t.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.k kVar = this.c;
            if (kVar != null) {
                kVar.B().a("AppLovinAdView", "notifyAdLoadFailed", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.h = bVar;
    }
}
