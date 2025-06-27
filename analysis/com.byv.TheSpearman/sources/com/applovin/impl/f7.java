package com.applovin.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* loaded from: classes.dex */
public final class f7 extends Surface {
    private static int d;
    private static boolean f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f414a;
    private final b b;
    private boolean c;

    public static synchronized boolean b(Context context) {
        if (!f) {
            d = a(context);
            f = true;
        }
        return d != 0;
    }

    private f7(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = bVar;
        this.f414a = z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.b) {
            if (!this.c) {
                this.b.a();
                this.c = true;
            }
        }
    }

    private static int a(Context context) {
        if (z9.a(context)) {
            return z9.c() ? 1 : 2;
        }
        return 0;
    }

    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private l7 f415a;
        private Handler b;
        private Error c;
        private RuntimeException d;
        private f7 f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public f7 a(int i) {
            boolean z;
            start();
            this.b = new Handler(getLooper(), this);
            this.f415a = new l7(this.b);
            synchronized (this) {
                z = false;
                this.b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f == null && this.d == null && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.d;
            if (runtimeException == null) {
                Error error = this.c;
                if (error == null) {
                    return (f7) a1.a(this.f);
                }
                throw error;
            }
            throw runtimeException;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    kc.a("DummySurface", "Failed to initialize dummy surface", e);
                    this.c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    kc.a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        private void b(int i) {
            a1.a(this.f415a);
            this.f415a.a(i);
            this.f = new f7(this, this.f415a.c(), i != 0);
        }

        public void a() {
            a1.a(this.b);
            this.b.sendEmptyMessage(2);
        }

        private void b() {
            a1.a(this.f415a);
            this.f415a.d();
        }
    }

    public static f7 a(Context context, boolean z) {
        a1.b(!z || b(context));
        return new b().a(z ? d : 0);
    }
}
