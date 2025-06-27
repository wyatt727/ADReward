package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.c4;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class j implements AppLovinWebViewActivity.EventListener, i.a {
    private static final AtomicBoolean h = new AtomicBoolean();
    private static WeakReference i;

    /* renamed from: a, reason: collision with root package name */
    private final k f932a;
    private final t b;
    private AppLovinUserService.OnConsentDialogDismissListener c;
    private i d;
    private WeakReference e;
    private com.applovin.impl.p f;
    private AtomicBoolean g = new AtomicBoolean();

    class a extends com.applovin.impl.p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            j.this.e = new WeakReference(activity);
        }
    }

    class b extends com.applovin.impl.p {
        b() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                if (!j.this.f() || j.i.get() != activity) {
                    AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                    WeakReference unused = j.i = new WeakReference(appLovinWebViewActivity);
                    appLovinWebViewActivity.loadUrl((String) j.this.f932a.a(oj.h0), j.this);
                }
                j.h.set(false);
            }
        }
    }

    j(k kVar) {
        this.e = new WeakReference(null);
        this.f932a = kVar;
        this.b = kVar.L();
        if (kVar.H() != null) {
            this.e = new WeakReference(kVar.H());
        }
        k.a(k.k()).a(new a());
        this.d = new i(this, kVar);
    }

    private void e() {
        this.f932a.e().b(this.f);
        if (f()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) i.get();
            i = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.c;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.c = null;
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.i.a
    public void a() {
    }

    public void b(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(j);
            }
        });
    }

    boolean f() {
        WeakReference weakReference = i;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void g() {
        if (this.g.getAndSet(true)) {
            return;
        }
        final String str = (String) this.f932a.a(oj.h0);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, k.k());
            e();
        } else if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, k.k());
            a(((Boolean) this.f932a.a(oj.k0)).booleanValue(), ((Long) this.f932a.a(oj.p0)).longValue());
        } else if ("closed".equalsIgnoreCase(str)) {
            a(((Boolean) this.f932a.a(oj.l0)).booleanValue(), ((Long) this.f932a.a(oj.q0)).longValue());
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            a(((Boolean) this.f932a.a(oj.m0)).booleanValue(), ((Long) this.f932a.a(oj.r0)).longValue());
        }
    }

    @Override // com.applovin.impl.sdk.i.a
    public void b() {
        final Activity activity = (Activity) this.e.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(activity);
                }
            }, ((Long) this.f932a.a(oj.j0)).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        WebView webViewA = zp.a(k.k(), "preloading consent dialog", true);
        if (webViewA == null) {
            return;
        }
        webViewA.loadUrl(str);
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(onConsentDialogDismissListener, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener, Activity activity) {
        if (!a(this.f932a) || h.getAndSet(true)) {
            if (onConsentDialogDismissListener != null) {
                onConsentDialogDismissListener.onDismiss();
                return;
            }
            return;
        }
        this.e = new WeakReference(activity);
        this.c = onConsentDialogDismissListener;
        this.f = new b();
        this.f932a.e().a(this.f);
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f932a.d0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) this.f932a.a(oj.i0));
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j) {
        if (t.a()) {
            this.b.a("ConsentDialogManager", "Scheduling repeating consent alert");
        }
        this.d.a(j, this.f932a, this);
    }

    private void a(boolean z, long j) {
        e();
        if (z) {
            b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
    }

    private boolean a(k kVar) {
        if (f()) {
            t.h("AppLovinSdk", "Consent dialog already showing");
            return false;
        }
        if (!c4.a(k.k())) {
            t.h("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        }
        if (!((Boolean) kVar.a(oj.g0)).booleanValue()) {
            if (t.a()) {
                this.b.b("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        }
        if (StringUtils.isValidString((String) kVar.a(oj.h0))) {
            return true;
        }
        if (t.a()) {
            this.b.b("ConsentDialogManager", "AdServer returned empty consent dialog URL");
        }
        return false;
    }
}
