package com.json;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* loaded from: classes4.dex */
public class a extends Thread {
    private static final int l = 1;
    private static final com.json.b m = new C0233a();
    private static final j8 n = new b();
    private final int d;

    /* renamed from: a, reason: collision with root package name */
    private com.json.b f1686a = m;
    private j8 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0233a implements com.json.b {
        C0233a() {
        }

        @Override // com.json.b
        public void a() {
        }

        @Override // com.json.b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    class b implements j8 {
        b() {
        }

        @Override // com.json.j8
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.h = (aVar.h + 1) % Integer.MAX_VALUE;
        }
    }

    public a(int i) {
        this.d = i;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }

    public int a() {
        return this.j;
    }

    public a a(com.json.b bVar) {
        if (bVar == null) {
            bVar = m;
        }
        this.f1686a = bVar;
        return this;
    }

    public a a(j8 j8Var) {
        if (j8Var == null) {
            j8Var = n;
        }
        this.b = j8Var;
        return this;
    }

    public a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public a a(boolean z) {
        this.g = z;
        return this;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public a b(boolean z) {
        this.f = z;
        return this;
    }

    public a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.j < this.i) {
            int i2 = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.f1686a.a();
                    String str = e3.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new u4(e3.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
                }
            } catch (InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.f1686a.b();
        }
    }
}
