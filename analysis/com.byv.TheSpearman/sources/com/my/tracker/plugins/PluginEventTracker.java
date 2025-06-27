package com.my.tracker.plugins;

import com.my.tracker.obfuscated.p;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class PluginEventTracker {
    private static final Executor b = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with root package name */
    private final p f4281a;

    private PluginEventTracker(p pVar) {
        this.f4281a = pVar;
    }

    public static PluginEventTracker newTracker(p pVar) {
        return new PluginEventTracker(pVar);
    }

    public static void onBackground(Runnable runnable) {
        b.execute(runnable);
    }

    public void trackPluginEvent(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        this.f4281a.a(i, bArr, z, z2, runnable);
    }
}
