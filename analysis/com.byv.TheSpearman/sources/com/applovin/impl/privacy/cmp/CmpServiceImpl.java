package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.g4;
import com.applovin.impl.k3;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.d {

    /* renamed from: a, reason: collision with root package name */
    private final k f795a;
    private final k3 b;
    private com.applovin.impl.privacy.cmp.a c = b();
    private d d;
    private e e;

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f796a;
        final /* synthetic */ Activity b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        class C0037a implements e {
            C0037a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f796a.onCompleted(appLovinCmpError);
            }
        }

        a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f796a = onCompletedListener;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f796a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.b, new C0037a());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f798a;

        b(Activity activity) {
            this.f798a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.c.a(this.f798a, CmpServiceImpl.this.b, CmpServiceImpl.this);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f799a;

        c(Activity activity) {
            this.f799a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.c.b(this.f799a, CmpServiceImpl.this.b, CmpServiceImpl.this);
        }
    }

    public interface d {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.f795a = kVar;
        this.b = new k3(kVar.t().f());
    }

    private void c() {
        if (hasSupportedCmp()) {
            this.c.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.c != null;
    }

    public void loadCmp(Activity activity, d dVar) {
        if (!hasSupportedCmp()) {
            dVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
            return;
        }
        this.d = dVar;
        b bVar = new b(activity);
        if (this.c.d()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        a();
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        a(cmpErrorImpl);
        a();
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowLoaded(Bundle bundle) {
        a((AppLovinCmpError) null);
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        a();
    }

    public void showCmp(Activity activity, e eVar) {
        c cVar = new c(activity);
        this.e = eVar;
        if (this.c.e()) {
            AppLovinSdkUtils.runOnUiThread(cVar);
        } else {
            cVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f795a.L();
        if (t.a()) {
            this.f795a.L().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            c();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    public String toString() {
        return "[CmpService]";
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        e eVar = this.e;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.e = null;
    }

    private com.applovin.impl.privacy.cmp.a b() {
        if (zp.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f795a);
        }
        if (!this.f795a.t().k() || this.f795a.t().e() != g4.a.UNIFIED) {
            return null;
        }
        t.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(appLovinCmpError);
        this.d = null;
    }

    private void a() {
        com.applovin.impl.privacy.cmp.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
