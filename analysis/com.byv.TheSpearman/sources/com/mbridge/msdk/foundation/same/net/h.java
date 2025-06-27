package com.mbridge.msdk.foundation.same.net;

import android.os.Process;
import com.mbridge.msdk.foundation.same.net.stack.OkHttpStack;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: NetworkDispatcher.java */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2893a = "h";
    private c b;
    private g c;
    private com.mbridge.msdk.foundation.same.net.stack.b d;

    public h(c cVar) {
        a();
        this.c = new com.mbridge.msdk.foundation.same.net.f.a(this.d, cVar);
        this.b = cVar;
    }

    private void a() {
        try {
            if (com.mbridge.msdk.f.c.b()) {
                this.d = new com.mbridge.msdk.foundation.same.net.stack.a();
                return;
            }
        } catch (Throwable th) {
            ad.b(f2893a, th.getMessage());
        }
        this.d = new OkHttpStack();
    }

    public h(c cVar, com.mbridge.msdk.foundation.same.net.stack.b bVar) {
        if (bVar == null) {
            a();
        } else {
            this.d = bVar;
        }
        this.c = new com.mbridge.msdk.foundation.same.net.f.a(this.d, cVar);
        this.b = cVar;
    }

    public final void a(i iVar) {
        Process.setThreadPriority(10);
        try {
            this.b.d(iVar);
            if (iVar.q()) {
                iVar.a("network-discard-cancelled");
                this.b.a(iVar);
                this.b.b(iVar);
            } else {
                this.b.c(iVar);
                this.b.a((i<?>) iVar, iVar.a(this.c.a(iVar)));
            }
        } catch (com.mbridge.msdk.foundation.same.net.b.a e) {
            this.b.a((i<?>) iVar, e);
        } catch (Exception e2) {
            ad.b(f2893a, "Unhandled exception " + e2.getMessage());
            this.b.a((i<?>) iVar, new com.mbridge.msdk.foundation.same.net.b.a(4, null));
        }
    }
}
