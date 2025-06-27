package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ChannelUpdateLock.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f1413a = new HashMap();
    private FileLock b;
    private String c;

    private a(String str, FileLock fileLock) {
        this.c = str;
        this.b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f1413a;
        synchronized (map) {
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            if (!reentrantLock.tryLock()) {
                return null;
            }
            try {
                FileLock fileLockC = FileLock.c(str);
                if (fileLockC == null) {
                    reentrantLock.unlock();
                    return null;
                }
                return new a(str, fileLockC);
            } catch (Exception e) {
                reentrantLock.lock();
                com.bykv.vk.openvk.preload.geckox.utils.b.a(new RuntimeException(e));
                return null;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f1413a;
        synchronized (map) {
            try {
                this.b.a();
                this.b.b();
                map.get(this.c).unlock();
            } catch (Throwable th) {
                f1413a.get(this.c).unlock();
                throw th;
            }
        }
    }
}
