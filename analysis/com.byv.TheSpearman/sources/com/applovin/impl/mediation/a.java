package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.de;
import com.applovin.impl.p;
import com.applovin.impl.q;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;

/* loaded from: classes.dex */
public class a extends p {

    /* renamed from: a, reason: collision with root package name */
    private final q f664a;
    private final t b;
    private final String c = zp.l(k.k());
    private InterfaceC0031a d;
    private de e;
    private boolean f;
    private int g;
    private boolean h;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0031a {
        void b(de deVar);
    }

    a(k kVar) {
        this.b = kVar.L();
        this.f664a = kVar.e();
    }

    public void a(boolean z) {
        this.f = z;
    }

    @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.c) && (this.e.q0() || this.f)) {
            if (t.a()) {
                this.b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.d != null) {
                if (t.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.d.b(this.e);
            }
            a();
            return;
        }
        if (!this.h) {
            this.h = true;
        }
        this.g++;
        if (t.a()) {
            this.b.a("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.g);
        }
    }

    @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.h) {
            this.g--;
            if (t.a()) {
                this.b.a("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.g);
            }
            if (this.g <= 0) {
                if (t.a()) {
                    this.b.a("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.d != null) {
                    if (t.a()) {
                        this.b.a("AdActivityObserver", "Invoking callback...");
                    }
                    this.d.b(this.e);
                }
                a();
            }
        }
    }

    public void a(de deVar, InterfaceC0031a interfaceC0031a) {
        if (t.a()) {
            this.b.a("AdActivityObserver", "Starting for ad " + deVar.getAdUnitId() + "...");
        }
        a();
        this.d = interfaceC0031a;
        this.e = deVar;
        this.f664a.a(this);
    }

    public void a() {
        if (t.a()) {
            this.b.a("AdActivityObserver", "Cancelling...");
        }
        this.f664a.b(this);
        this.d = null;
        this.e = null;
        this.g = 0;
        this.h = false;
    }
}
