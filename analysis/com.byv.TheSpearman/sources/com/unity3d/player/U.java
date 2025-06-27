package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.UnityPlayer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
class U {

    /* renamed from: a, reason: collision with root package name */
    private UnityPlayer f4357a;
    private a c;
    private Context b = null;
    private final Semaphore d = new Semaphore(0);
    private final Lock e = new ReentrantLock();
    private M f = null;
    private int g = 2;
    private boolean h = false;
    private boolean i = false;

    public interface a {
    }

    U(UnityPlayer unityPlayer) {
        this.f4357a = null;
        this.f4357a = unityPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        M m = this.f;
        if (m != null) {
            this.f4357a.removeViewFromPlayer(m);
            this.i = false;
            this.f.destroyPlayer();
            this.f = null;
            a aVar = this.c;
            if (aVar != null) {
                ((UnityPlayer.n) aVar).a();
            }
        }
    }

    public boolean a(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, a aVar) {
        this.e.lock();
        this.c = aVar;
        this.b = context;
        this.d.drainPermits();
        this.g = 2;
        runOnUiThread(new P(this, str, i, i2, i3, z, j, j2));
        boolean z2 = false;
        try {
            this.e.unlock();
            this.d.acquire();
            this.e.lock();
            if (this.g != 2) {
                z2 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new Q(this));
        runOnUiThread((!z2 || this.g == 3) ? new T(this) : new S(this));
        this.e.unlock();
        return z2;
    }

    public void b() {
        this.e.lock();
        M m = this.f;
        if (m != null) {
            m.updateVideoLayout();
        }
        this.e.unlock();
    }

    public void c() {
        this.e.lock();
        M m = this.f;
        if (m != null) {
            if (this.g == 0) {
                m.cancelOnPrepare();
            } else if (this.i) {
                boolean zA = m.a();
                this.h = zA;
                if (!zA) {
                    this.f.pause();
                }
            }
        }
        this.e.unlock();
    }

    public void d() {
        this.e.lock();
        M m = this.f;
        if (m != null && this.i && !this.h) {
            m.start();
        }
        this.e.unlock();
    }

    protected void runOnUiThread(Runnable runnable) {
        Context context = this.b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            AbstractC1536u.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
