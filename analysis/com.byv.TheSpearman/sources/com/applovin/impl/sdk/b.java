package com.applovin.impl.sdk;

import com.applovin.impl.h8;
import com.applovin.impl.ho;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final k f920a;
    private final WeakReference b;
    private final WeakReference c;
    private ho d;

    public static b a(h8 h8Var, a.InterfaceC0042a interfaceC0042a, k kVar) {
        b bVar = new b(h8Var, interfaceC0042a, kVar);
        bVar.a(h8Var.getTimeToLiveMillis());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f920a.f().a(this);
    }

    public void d() {
        a();
        h8 h8VarB = b();
        if (h8VarB == null) {
            return;
        }
        h8VarB.setExpired();
        a.InterfaceC0042a interfaceC0042a = (a.InterfaceC0042a) this.c.get();
        if (interfaceC0042a == null) {
            return;
        }
        interfaceC0042a.onAdExpired(h8VarB);
    }

    public void a(long j) {
        a();
        if (((Boolean) this.f920a.a(oj.o1)).booleanValue() || !this.f920a.f0().isApplicationPaused()) {
            this.d = ho.a(j, this.f920a, new Runnable() { // from class: com.applovin.impl.sdk.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
        }
    }

    public void a() {
        ho hoVar = this.d;
        if (hoVar != null) {
            hoVar.a();
            this.d = null;
        }
    }

    private b(h8 h8Var, a.InterfaceC0042a interfaceC0042a, k kVar) {
        this.b = new WeakReference(h8Var);
        this.c = new WeakReference(interfaceC0042a);
        this.f920a = kVar;
    }

    public h8 b() {
        return (h8) this.b.get();
    }
}
