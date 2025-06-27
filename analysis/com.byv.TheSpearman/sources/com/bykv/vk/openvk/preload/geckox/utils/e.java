package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: IOSerialExecutor.java */
/* loaded from: classes2.dex */
public class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f1438a;
    private ExecutorService b = com.bykv.vk.openvk.preload.geckox.b.a();

    private e() {
    }

    public static e a() {
        if (f1438a == null) {
            synchronized (e.class) {
                if (f1438a == null) {
                    f1438a = new e();
                }
            }
        }
        return f1438a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.b.execute(runnable);
    }
}
