package com.applovin.impl.mediation;

import com.applovin.impl.de;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.w1;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final k f677a;
    private final t b;
    private final a c;
    private w1 d;

    public interface a {
        void a(de deVar);
    }

    c(k kVar, a aVar) {
        this.f677a = kVar;
        this.b = kVar.L();
        this.c = aVar;
    }

    public void a(final de deVar, long j) {
        if (t.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.d = w1.a(j, this.f677a, new Runnable() { // from class: com.applovin.impl.mediation.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(deVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(de deVar) {
        if (t.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.c.a(deVar);
    }

    public void a() {
        if (t.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.a();
            this.d = null;
        }
    }
}
