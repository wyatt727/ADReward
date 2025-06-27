package com.applovin.impl.sdk;

import com.applovin.impl.kn;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sm;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f980a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k kVar) {
        if (f980a) {
            return;
        }
        kVar.B().a(o.b.INTEGRATION_ERROR, "no_ads_loaded");
    }

    public static void b(final k kVar) {
        Long l = (Long) kVar.a(qe.H7);
        if (l.longValue() <= 0) {
            return;
        }
        kVar.l0().a(new kn(kVar, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.sdk.r$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                r.a(kVar);
            }
        }), sm.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static void a() {
        f980a = true;
    }
}
