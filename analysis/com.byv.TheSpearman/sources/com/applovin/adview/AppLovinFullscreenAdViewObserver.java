package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.k;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final k f166a;
    private final AtomicBoolean b = new AtomicBoolean(true);
    private n9 c;
    private ob d;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        ob obVar = this.d;
        if (obVar != null) {
            obVar.a();
            this.d = null;
        }
        n9 n9Var = this.c;
        if (n9Var != null) {
            n9Var.f();
            this.c.v();
            this.c = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        n9 n9Var = this.c;
        if (n9Var != null) {
            n9Var.w();
            this.c.z();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        n9 n9Var;
        if (this.b.getAndSet(false) || (n9Var = this.c) == null) {
            return;
        }
        n9Var.x();
        this.c.a(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        n9 n9Var = this.c;
        if (n9Var != null) {
            n9Var.y();
        }
    }

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, ob obVar, k kVar) {
        this.d = obVar;
        this.f166a = kVar;
        lifecycle.addObserver(this);
    }

    public void setPresenter(n9 n9Var) {
        this.c = n9Var;
    }
}
