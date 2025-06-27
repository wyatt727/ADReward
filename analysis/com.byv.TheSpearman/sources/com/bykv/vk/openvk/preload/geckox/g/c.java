package com.bykv.vk.openvk.preload.geckox.g;

import android.os.Process;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: UsingLock.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Pair<FileLock, AtomicLong>> f1415a = new HashMap();

    public static void a(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f1415a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair == null) {
                Pair<FileLock, AtomicLong> pair2 = new Pair<>(FileLock.a(str, Process.myPid()), new AtomicLong(0L));
                map.put(str, pair2);
                pair = pair2;
            }
            ((AtomicLong) pair.second).incrementAndGet();
        }
    }

    public static void b(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f1415a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair == null) {
                throw new RuntimeException("using.lock illegal state");
            }
            long jDecrementAndGet = ((AtomicLong) pair.second).decrementAndGet();
            if (jDecrementAndGet < 0) {
                throw new RuntimeException("using.lock count illegal");
            }
            if (jDecrementAndGet == 0) {
                ((FileLock) pair.first).a();
                map.remove(str);
            }
        }
    }

    public static void c(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f1415a;
        synchronized (map) {
            FileLock fileLockB = FileLock.b(str);
            if (fileLockB == null) {
                return;
            }
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair != null && ((AtomicLong) pair.second).get() != 0) {
                fileLockB.a();
                FileLock.a(str, Process.myPid());
                return;
            }
            File parentFile = new File(str).getParentFile();
            final File file = new File(parentFile.getAbsolutePath() + "--pending-delete");
            if (parentFile.renameTo(file)) {
                fileLockB.a();
                fileLockB.b();
                e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.g.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
                    }
                });
            }
        }
    }
}
