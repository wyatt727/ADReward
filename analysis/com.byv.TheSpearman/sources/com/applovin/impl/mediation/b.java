package com.applovin.impl.mediation;

import com.applovin.impl.bc;
import com.applovin.impl.de;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b implements a.InterfaceC0031a, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f676a;
    private final a b;
    private final c c;

    public b(k kVar) {
        this.f676a = kVar;
        this.b = new a(kVar);
        this.c = new c(kVar, this);
    }

    public void e(de deVar) {
        long jG0 = deVar.g0();
        if (jG0 >= 0) {
            this.c.a(deVar, jG0);
        }
        boolean z = Boolean.parseBoolean(this.f676a.g0().getExtraParameters().get("should_schedule_ad_hidden_on_ad_destroy"));
        if (deVar.p0() || deVar.q0() || z) {
            this.b.a(z);
            this.b.a(deVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(de deVar) {
        c(deVar);
    }

    public void a() {
        this.c.a();
        this.b.a();
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0031a
    public void b(final de deVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(deVar);
            }
        }, deVar.f0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(de deVar) {
        if (deVar != null && deVar.v().compareAndSet(false, true)) {
            bc.e(deVar.z().c(), deVar);
        }
    }
}
