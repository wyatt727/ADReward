package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class W {

    /* renamed from: a, reason: collision with root package name */
    private final Z f4302a;
    private X b;

    private W() {
        this.f4302a = Z.a(2);
    }

    public static W a() {
        return V.f4301a;
    }

    public X a(String str) {
        X x = (X) this.f4302a.a();
        if (x != null) {
            x.f4303a = new WeakReference(null);
            x.a(str);
            return x;
        }
        if (!M.b().a()) {
            try {
                HandlerThread handlerThread = new HandlerThread(str);
                handlerThread.start();
                return new X(handlerThread, null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public X b() {
        if (this.b == null) {
            synchronized (W.class) {
                if (this.b == null) {
                    this.b = a("ssdk_net_handler");
                }
            }
        }
        return this.b;
    }

    public X c() {
        if (this.b == null) {
            synchronized (W.class) {
                if (this.b == null) {
                    this.b = a("ssdk_handler");
                }
            }
        }
        return this.b;
    }
}
