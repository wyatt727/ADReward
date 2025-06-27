package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: ActivityLifecycleListener.java */
/* loaded from: classes2.dex */
public class EYQ implements Application.ActivityLifecycleCallbacks {
    public static boolean EYQ = false;
    public static long Td;
    public static long mZx;
    private volatile WeakReference<Activity> pi;
    private final AtomicBoolean Pm = new AtomicBoolean(false);
    private final RunnableC0137EYQ Kbd = new RunnableC0137EYQ();
    private final Pm IPb = new Pm();
    private final Td VwS = new Td();
    private final mZx QQ = new mZx();
    private int HX = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.EYQ>> tp = new CopyOnWriteArrayList<>();
    private HandlerThread MxO = null;
    private Handler tsL = null;
    private final LinkedList<Activity> nWX = new LinkedList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public EYQ() {
        Td();
    }

    private void Td() {
        HandlerThread handlerThread = new HandlerThread("lifecycle", 10);
        this.MxO = handlerThread;
        handlerThread.start();
        this.tsL = new Handler(this.MxO.getLooper());
    }

    private void EYQ(Runnable runnable) {
        if (!this.MxO.isAlive()) {
            Td();
        }
        this.tsL.postDelayed(runnable, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.nWX.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.HX++;
        this.tsL.removeCallbacks(this.QQ);
        if (this.Pm.get()) {
            EYQ(this.QQ);
        }
        this.Pm.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        EYQ(this.IPb);
        if (!EYQ) {
            mZx = System.currentTimeMillis();
            EYQ = true;
        }
        this.pi = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.HX - 1;
        this.HX = i;
        if (i < 0) {
            this.HX = 0;
        }
        if (ApmHelper.isIsInit()) {
            EYQ(this.VwS);
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.EYQ$EYQ, reason: collision with other inner class name */
    static class RunnableC0137EYQ implements Runnable {
        RunnableC0137EYQ() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xt.Td(new com.bytedance.sdk.component.VwS.QQ("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.EYQ.EYQ.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    class Pm implements Runnable {
        Pm() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.pi.mZx().removeMessages(1001);
            if (com.bytedance.sdk.openadsdk.core.hu.EYQ() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.IPb.EYQ.mZx();
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    class Td implements Runnable {
        Td() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerMZx = com.bytedance.sdk.openadsdk.core.pi.mZx();
                Message messageObtain = Message.obtain(handlerMZx, EYQ.this.Kbd);
                messageObtain.what = 1001;
                handlerMZx.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    private static class mZx implements Runnable {
        private mZx() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().zzY().EYQ() || !com.bytedance.sdk.component.utils.hu.QQ(com.bytedance.sdk.openadsdk.core.hu.EYQ())) {
                return;
            }
            com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ(com.bytedance.sdk.openadsdk.core.MxO.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.HX <= 0) {
            this.Pm.set(true);
        }
        if (EYQ()) {
            EYQ = false;
            com.bytedance.sdk.openadsdk.core.pi.mZx.set(false);
            Td = System.currentTimeMillis();
            EYQ(this.QQ);
        }
        EYQ(new Kbd(mZx, Td, EYQ()));
    }

    /* compiled from: ActivityLifecycleListener.java */
    public class Kbd implements Runnable {
        private boolean Pm;
        private long Td;
        private long mZx;

        public Kbd(long j, long j2, boolean z) {
            this.mZx = 0L;
            this.Td = 0L;
            this.Pm = false;
            this.mZx = j;
            this.Td = j2;
            this.Pm = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.Pm) {
                com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ(this.mZx / 1000, this.Td / 1000);
            }
            EYQ.this.Pm();
        }
    }

    public void EYQ(com.bytedance.sdk.component.adexpress.EYQ eyq) {
        this.tp.add(new WeakReference<>(eyq));
    }

    public boolean mZx(com.bytedance.sdk.component.adexpress.EYQ eyq) {
        return this.tp.remove(new WeakReference(eyq));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.tp != null && this.tp.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.EYQ>> it = this.tp.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.EYQ> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().EYQ(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.pi != null && this.pi.get() == activity) {
            this.pi = null;
        }
        this.nWX.remove(activity);
    }

    public boolean EYQ() {
        return this.Pm.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        com.bytedance.sdk.openadsdk.mZx.EYQ.EYQ.EYQ();
    }

    public boolean EYQ(boolean z) {
        Activity activity;
        Window window;
        return (this.pi == null || (activity = this.pi.get()) == null || (window = activity.getWindow()) == null) ? z : window.getDecorView().hasWindowFocus();
    }

    public Activity mZx() {
        if (this.nWX.isEmpty()) {
            return null;
        }
        return this.nWX.getFirst();
    }
}
