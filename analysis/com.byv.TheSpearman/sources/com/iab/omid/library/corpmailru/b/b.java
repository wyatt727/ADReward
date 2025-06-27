package com.iab.omid.library.corpmailru.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static b f1522a = new b();
    private boolean b;
    private boolean c;
    private a d;

    public interface a {
        void a(boolean z);
    }

    private b() {
    }

    public static b a() {
        return f1522a;
    }

    private void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (this.b) {
                e();
                a aVar = this.d;
                if (aVar != null) {
                    aVar.a(!z);
                }
            }
        }
    }

    private void e() {
        boolean z = !this.c;
        Iterator<com.iab.omid.library.corpmailru.adsession.a> it = com.iab.omid.library.corpmailru.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z);
        }
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void b() {
        this.b = true;
        this.c = false;
        e();
    }

    public void c() {
        this.b = false;
        this.c = false;
        this.d = null;
    }

    public ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View viewD;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = d().importance != 100;
            boolean z2 = true;
            for (com.iab.omid.library.corpmailru.adsession.a aVar : com.iab.omid.library.corpmailru.b.a.a().c()) {
                if (aVar.e() && (viewD = aVar.d()) != null && viewD.hasWindowFocus()) {
                    z2 = false;
                }
            }
            a(z && z2);
        }
    }
}
