package com.json;

import com.json.lifecycle.b;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class v9 implements j9 {
    private Timer b;
    private long e;
    private Runnable f;

    /* renamed from: a, reason: collision with root package name */
    private String f2373a = "INTERNAL";
    private boolean c = false;
    private Long d = null;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            v9.this.f.run();
        }
    }

    public v9(long j, Runnable runnable, boolean z) {
        this.e = j;
        this.f = runnable;
        if (z) {
            g();
        }
    }

    private void f() {
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
    }

    private void h() {
        if (this.b == null) {
            Timer timer = new Timer();
            this.b = timer;
            timer.schedule(new a(), this.e);
            Calendar.getInstance().setTimeInMillis(this.d.longValue());
        }
    }

    @Override // com.json.j9
    public void a() {
    }

    @Override // com.json.j9
    public void b() {
        if (this.b != null) {
            f();
        }
    }

    @Override // com.json.j9
    public void c() {
        Long l;
        if (this.b == null && (l = this.d) != null) {
            long jLongValue = l.longValue() - System.currentTimeMillis();
            this.e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f.run();
            }
        }
    }

    @Override // com.json.j9
    public void d() {
    }

    public void e() {
        f();
        this.c = false;
        this.d = null;
        b.d().b(this);
    }

    public void g() {
        if (this.c) {
            return;
        }
        this.c = true;
        b.d().a(this);
        this.d = Long.valueOf(System.currentTimeMillis() + this.e);
        if (b.d().e()) {
            return;
        }
        h();
    }
}
