package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PiecemealSerialExecutor.java */
/* loaded from: classes2.dex */
public class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f1441a;
    private ExecutorService b = com.bykv.vk.openvk.preload.geckox.b.a();

    private i() {
    }

    public static i a() {
        if (f1441a == null) {
            synchronized (i.class) {
                if (f1441a == null) {
                    f1441a = new i();
                }
            }
        }
        return f1441a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.b.execute(runnable);
    }
}
