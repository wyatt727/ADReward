package com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd;
import com.bykv.vk.openvk.component.video.EYQ.mZx.Pm;
import com.bytedance.sdk.component.VwS.IPb;
import com.bytedance.sdk.component.VwS.QQ;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public class Td extends com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ {
    public final File EYQ;
    private final mZx HX;
    private final Set<EYQ> IPb;
    private final ReentrantReadWriteLock.WriteLock Kbd;
    private final Handler MxO;
    private final ReentrantReadWriteLock.ReadLock Pm;
    private volatile float QQ;
    private final ReentrantReadWriteLock Td;
    private volatile long VwS;
    private final LinkedHashMap<String, File> mZx = new LinkedHashMap<>(0, 0.75f, true);
    private final Runnable tp;

    /* compiled from: DiskLruCache.java */
    public interface EYQ {
        void EYQ(String str);

        void EYQ(Set<String> set);
    }

    public void EYQ(EYQ eyq) {
        if (eyq != null) {
            this.IPb.add(eyq);
        }
    }

    public Td(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.Td = reentrantReadWriteLock;
        this.Pm = reentrantReadWriteLock.readLock();
        this.Kbd = reentrantReadWriteLock.writeLock();
        this.IPb = Collections.newSetFromMap(new ConcurrentHashMap());
        this.VwS = 104857600L;
        this.QQ = 0.5f;
        this.HX = new mZx();
        this.tp = new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td.1
            @Override // java.lang.Runnable
            public void run() {
                IPb.mZx(new QQ("cleanupCmd", 1) { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Td.this.mZx(Td.this.VwS);
                    }
                });
            }
        };
        this.MxO = new Handler(Looper.getMainLooper());
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            if (file == null) {
                str = " dir null";
            } else {
                str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
            }
            throw new IOException("dir error!  ".concat(String.valueOf(str)));
        }
        this.EYQ = file;
        IPb.mZx(new QQ("DiskLruCache", 5) { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td.2
            @Override // java.lang.Runnable
            public void run() {
                Td.this.mZx();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx() {
        this.Kbd.lock();
        try {
            File[] fileArrListFiles = this.EYQ.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                final HashMap map = new HashMap(fileArrListFiles.length);
                ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                for (File file : fileArrListFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        map.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td.3
                    @Override // java.util.Comparator
                    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        long jLongValue = ((Long) map.get(file2)).longValue() - ((Long) map.get(file3)).longValue();
                        if (jLongValue < 0) {
                            return -1;
                        }
                        return jLongValue > 0 ? 1 : 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.mZx.put(EYQ(file2), file2);
                }
            }
            this.Kbd.unlock();
            Td();
        } catch (Throwable th) {
            this.Kbd.unlock();
            throw th;
        }
    }

    public void EYQ(long j) {
        this.VwS = j;
        Td();
    }

    private void Td() {
        this.MxO.removeCallbacks(this.tp);
        this.MxO.postDelayed(this.tp, 10000L);
    }

    public void EYQ() {
        Pm.Td().Pm();
        Context contextEYQ = Kbd.EYQ();
        if (contextEYQ != null) {
            com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td.EYQ(contextEYQ).EYQ(0);
        }
        this.MxO.removeCallbacks(this.tp);
        IPb.mZx(new QQ("clear", 1) { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td.4
            @Override // java.lang.Runnable
            public void run() {
                Td.this.mZx(0L);
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ
    public void EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.HX.EYQ(str);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ
    public void mZx(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.HX.mZx(str);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ
    public File Td(String str) {
        this.Pm.lock();
        File file = this.mZx.get(str);
        this.Pm.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.EYQ, str);
        this.Kbd.lock();
        this.mZx.put(str, file2);
        this.Kbd.unlock();
        Iterator<EYQ> it = this.IPb.iterator();
        while (it.hasNext()) {
            it.next().EYQ(str);
        }
        Td();
        return file2;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ
    public File Pm(String str) {
        if (!this.Pm.tryLock()) {
            return null;
        }
        File file = this.mZx.get(str);
        this.Pm.unlock();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(long j) {
        HashSet hashSet;
        final HashSet hashSet2 = new HashSet();
        this.Kbd.lock();
        long length = 0;
        try {
            Iterator<Map.Entry<String, File>> it = this.mZx.entrySet().iterator();
            while (it.hasNext()) {
                length += it.next().getValue().length();
            }
        } catch (Throwable unused) {
            hashSet = null;
        }
        if (length > j) {
            long j2 = (long) (j * this.QQ);
            hashSet = new HashSet();
            try {
                for (Map.Entry<String, File> entry : this.mZx.entrySet()) {
                    File value = entry.getValue();
                    if (value != null && value.exists()) {
                        if (!this.HX.Td(EYQ(value))) {
                            long length2 = value.length();
                            File file = new File(value.getAbsolutePath() + "-tmp");
                            if (value.renameTo(file)) {
                                hashSet2.add(file);
                                length -= length2;
                                hashSet.add(entry.getKey());
                            }
                        }
                    } else {
                        hashSet.add(entry.getKey());
                    }
                    if (length <= j2) {
                        break;
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    this.mZx.remove((String) it2.next());
                }
            } catch (Throwable unused2) {
            }
            this.Kbd.unlock();
            Iterator<EYQ> it3 = this.IPb.iterator();
            while (it3.hasNext()) {
                it3.next().EYQ(hashSet);
            }
            IPb.mZx(new QQ("trimSize", 1) { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td.5
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((File) it4.next()).delete();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            });
            return;
        }
        this.Kbd.unlock();
    }

    private String EYQ(File file) {
        return file.getName();
    }

    /* compiled from: DiskLruCache.java */
    private static final class mZx {
        private final Map<String, Integer> EYQ;

        private mZx() {
            this.EYQ = new HashMap();
        }

        synchronized void EYQ(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.EYQ.get(str);
                if (num == null) {
                    this.EYQ.put(str, 1);
                    return;
                }
                this.EYQ.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }

        synchronized void mZx(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.EYQ.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.EYQ.remove(str);
                    return;
                }
                this.EYQ.put(str, Integer.valueOf(num.intValue() - 1));
            }
        }

        synchronized boolean Td(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.EYQ.containsKey(str);
        }
    }
}
