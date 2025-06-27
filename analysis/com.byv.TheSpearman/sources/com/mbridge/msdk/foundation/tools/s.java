package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* compiled from: LimitExecutor.java */
/* loaded from: classes4.dex */
public final class s implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f2996a;
    private Runnable b;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.f2996a == null) {
            this.f2996a = a(runnable);
            q.a().execute(this.f2996a);
        } else if (this.b == null) {
            this.b = a(runnable);
        }
    }

    private Runnable a(final Runnable runnable) {
        return new Runnable() { // from class: com.mbridge.msdk.foundation.tools.s.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("LimitExecutor", e.getMessage());
                        }
                    }
                } finally {
                    s.this.a();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.b;
        this.f2996a = runnable;
        this.b = null;
        if (runnable != null) {
            q.a().execute(this.f2996a);
        }
    }
}
