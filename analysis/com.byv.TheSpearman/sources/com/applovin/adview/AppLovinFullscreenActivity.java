package com.applovin.adview;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.oj;
import com.applovin.impl.qj;
import com.applovin.impl.r;
import com.applovin.impl.r6;
import com.applovin.impl.s;
import com.applovin.impl.s9;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.json.t2;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements r6 {
    public static ob parentInterstitialWrapper;

    /* renamed from: a, reason: collision with root package name */
    private k f163a;
    private n9 b;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private com.applovin.impl.adview.activity.a d;
    private b f;
    private boolean g;

    private static class b implements OnBackInvokedCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f165a;

        protected b(Runnable runnable) {
            this.f165a = runnable;
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            this.f165a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.u();
        }
        if (zp.e(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // com.applovin.impl.r6
    public void dismiss() {
        if (x3.l() && this.f != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f);
            this.f = null;
        }
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.f();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            t.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss();
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            t.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            ob obVar = parentInterstitialWrapper;
            if (obVar != null && obVar.f() != null) {
                ob.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", null, this);
            }
            finish();
            return;
        }
        k kVarA = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).a();
        this.f163a = kVarA;
        this.g = ((Boolean) kVarA.a(oj.I2)).booleanValue();
        viewFindViewById.setFitsSystemWindows(true);
        r.a(this.g, this);
        if (x3.l() && ((Boolean) this.f163a.a(oj.X5)).booleanValue()) {
            this.f = new b(new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f);
        }
        a();
        ob obVar2 = parentInterstitialWrapper;
        if (obVar2 != null) {
            n9.a(obVar2.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.g(), this.f163a, this, new a());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f163a);
        this.d = aVar;
        bindService(intent, aVar, 1);
        if (x3.j()) {
            String str = this.f163a.g0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        k kVar = this.f163a;
        if (kVar != null && ((Boolean) kVar.a(oj.s2)).booleanValue()) {
            this.f163a.i0().b(qj.M);
            this.f163a.i0().b(qj.N);
        }
        com.applovin.impl.adview.activity.a aVar = this.d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        n9 n9Var = this.b;
        if (n9Var != null) {
            if (n9Var.B()) {
                parentInterstitialWrapper.i();
            }
            if (!this.b.k()) {
                this.b.f();
            }
            this.b.v();
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.w();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        n9 n9Var;
        try {
            super.onResume();
            if (this.c.get() || (n9Var = this.b) == null) {
                return;
            }
            n9Var.x();
        } catch (IllegalArgumentException e) {
            this.f163a.L();
            if (t.a()) {
                this.f163a.L().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            this.f163a.B().a("AppLovinFullscreenActivity", t2.h.u0, e);
            dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        n9 n9Var = this.b;
        if (n9Var != null) {
            n9Var.y();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.b != null) {
            if (!this.c.getAndSet(false) || (this.b instanceof s9)) {
                this.b.c(z);
            }
            if (z) {
                r.a(this.g, this);
            }
        }
        super.onWindowFocusChanged(z);
    }

    private void a() throws JSONException {
        ob obVar;
        if (!((Boolean) this.f163a.a(oj.s2)).booleanValue() || (obVar = parentInterstitialWrapper) == null || obVar.f() == null) {
            return;
        }
        List listG = parentInterstitialWrapper.f().g();
        if (CollectionUtils.isEmpty(listG)) {
            return;
        }
        s sVar = (s) listG.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", sVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", sVar.a());
        this.f163a.i0().b(qj.N, jSONObject.toString());
        this.f163a.i0().b(qj.M, Long.valueOf(System.currentTimeMillis()));
    }

    class a implements n9.d {
        a() {
        }

        @Override // com.applovin.impl.n9.d
        public void a(n9 n9Var) {
            AppLovinFullscreenActivity.this.b = n9Var;
            n9Var.A();
        }

        @Override // com.applovin.impl.n9.d
        public void a(String str, Throwable th) {
            ob.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
        }
    }

    public void setPresenter(n9 n9Var) {
        this.b = n9Var;
    }
}
