package com.json.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.j9;
import com.json.k9;
import com.json.lifecycle.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static b j = new b();
    private static AtomicBoolean k = new AtomicBoolean(false);
    static final long l = 700;

    /* renamed from: a, reason: collision with root package name */
    private String f1880a = "IronsourceLifecycleManager";
    private int b = 0;
    private int c = 0;
    private boolean d = true;
    private boolean e = true;
    private k9 f = k9.NONE;
    private List<j9> g = new CopyOnWriteArrayList();
    private Runnable h = new a();
    private a.InterfaceC0235a i = new f();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a();
            b.this.b();
        }
    }

    /* renamed from: com.ironsource.lifecycle.b$b, reason: collision with other inner class name */
    class RunnableC0236b implements Runnable {
        RunnableC0236b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = b.this.g.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).c();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = b.this.g.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).a();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = b.this.g.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).d();
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = b.this.g.iterator();
            while (it.hasNext()) {
                ((j9) it.next()).b();
            }
        }
    }

    class f implements a.InterfaceC0235a {
        f() {
        }

        @Override // com.json.lifecycle.a.InterfaceC0235a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.json.lifecycle.a.InterfaceC0235a
        public void b(Activity activity) {
        }

        @Override // com.json.lifecycle.a.InterfaceC0235a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.c == 0) {
            this.d = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new d());
            this.f = k9.PAUSED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.b == 0 && this.d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new e());
            this.e = true;
            this.f = k9.STOPPED;
        }
    }

    public static b d() {
        return j;
    }

    void a(Activity activity) {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.h, 700L);
        }
    }

    void a(Context context) {
        Application application;
        if (!k.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(j9 j9Var) {
        if (!IronsourceLifecycleProvider.a() || j9Var == null || this.g.contains(j9Var)) {
            return;
        }
        this.g.add(j9Var);
    }

    void b(Activity activity) {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.h);
                return;
            }
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new c());
            this.d = false;
            this.f = k9.RESUMED;
        }
    }

    public void b(j9 j9Var) {
        if (this.g.contains(j9Var)) {
            this.g.remove(j9Var);
        }
    }

    public k9 c() {
        return this.f;
    }

    void c(Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.e) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new RunnableC0236b());
            this.e = false;
            this.f = k9.STARTED;
        }
    }

    void d(Activity activity) {
        this.b--;
        b();
    }

    public boolean e() {
        return this.f == k9.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.json.lifecycle.a.b(activity);
        com.json.lifecycle.a aVarA = com.json.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.i);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }
}
