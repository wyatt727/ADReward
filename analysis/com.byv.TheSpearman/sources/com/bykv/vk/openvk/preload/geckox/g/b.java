package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelectChannelVersionLock.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f1414a = new HashMap();
    private static ReentrantLock b = new ReentrantLock();
    private String c;
    private FileLock d;

    private b(String str, FileLock fileLock) {
        this.c = str;
        this.d = fileLock;
    }

    public static b a(String str) throws Exception {
        b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f1414a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e) {
            b.unlock();
            throw e;
        }
    }

    public final void a() {
        try {
            this.d.a();
            this.d.b();
            Lock lock = f1414a.get(this.c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            b.unlock();
        }
    }
}
