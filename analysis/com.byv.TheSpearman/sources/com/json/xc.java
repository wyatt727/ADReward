package com.json;

import android.os.Handler;
import android.os.HandlerThread;
import com.json.mediationsdk.logger.d;

/* loaded from: classes4.dex */
public class xc extends Thread {
    private static xc b;

    /* renamed from: a, reason: collision with root package name */
    private a f2442a;

    private class a extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f2443a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new d());
        }

        Handler a() {
            return this.f2443a;
        }

        void b() {
            this.f2443a = new Handler(getLooper());
        }
    }

    private xc() {
        a aVar = new a(getClass().getSimpleName());
        this.f2442a = aVar;
        aVar.start();
        this.f2442a.b();
    }

    public static synchronized xc a() {
        if (b == null) {
            b = new xc();
        }
        return b;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f2442a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
