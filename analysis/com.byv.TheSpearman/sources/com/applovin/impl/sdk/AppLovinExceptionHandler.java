package com.applovin.impl.sdk;

import android.os.Process;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.json.t2;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final AppLovinExceptionHandler d = new AppLovinExceptionHandler();

    /* renamed from: a, reason: collision with root package name */
    private final Set f901a = new HashSet(2);
    private final AtomicBoolean b = new AtomicBoolean();
    private Thread.UncaughtExceptionHandler c;

    public static AppLovinExceptionHandler shared() {
        return d;
    }

    public void addSdk(k kVar) {
        if (this.f901a.contains(kVar)) {
            return;
        }
        this.f901a.add(kVar);
    }

    public void enable() {
        if (this.b.compareAndSet(false, true)) {
            this.c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        long jLongValue = 500;
        for (k kVar : this.f901a) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            kVar.B().a(o.b.CRASH, CollectionUtils.map("top_main_method", th.toString()));
            kVar.C().trackEventSynchronously(t2.h.f0);
            jLongValue = ((Long) kVar.a(oj.w3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
