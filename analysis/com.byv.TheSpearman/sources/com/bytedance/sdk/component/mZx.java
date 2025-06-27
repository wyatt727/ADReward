package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: TTPropHelper.java */
/* loaded from: classes2.dex */
public class mZx {
    private static boolean EYQ = false;
    private static ArrayMap<String, File> MxO;
    private static ExecutorService pi;
    private static ArrayMap<File, mZx> tsL;
    private final File HX;
    private int IPb;
    private volatile boolean Kbd;
    private Properties Pm;
    private long QQ;
    private final Object Td;
    private long VwS;
    private final Object mZx;
    private final File tp;

    static /* synthetic */ int HX(mZx mzx) {
        int i = mzx.IPb;
        mzx.IPb = i - 1;
        return i;
    }

    static /* synthetic */ long IPb(mZx mzx) {
        long j = mzx.VwS;
        mzx.VwS = 1 + j;
        return j;
    }

    static /* synthetic */ int Kbd(mZx mzx) {
        int i = mzx.IPb;
        mzx.IPb = i + 1;
        return i;
    }

    /* compiled from: TTPropHelper.java */
    public static class EYQ {
        public static void EYQ(ExecutorService executorService) {
            ExecutorService unused = mZx.pi = executorService;
        }
    }

    public static mZx EYQ(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (mZx.class) {
            if (MxO == null) {
                MxO = new ArrayMap<>();
            }
            File file = MxO.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                MxO.put(str, file);
            }
            if (tsL == null) {
                tsL = new ArrayMap<>();
            }
            mZx mzx = tsL.get(file);
            if (mzx != null) {
                return mzx;
            }
            mZx mzx2 = new mZx(file);
            tsL.put(file, mzx2);
            return mzx2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.sdk.component.mZx$1] */
    private mZx(File file) {
        Object obj = new Object();
        this.mZx = obj;
        this.Td = new Object();
        this.Pm = new Properties();
        this.Kbd = false;
        this.IPb = 0;
        this.HX = file;
        this.tp = EYQ(file);
        synchronized (obj) {
            this.Kbd = false;
        }
        ExecutorService executorService = pi;
        if (executorService == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.mZx.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    mZx.this.EYQ();
                }
            }.start();
        } else {
            executorService.execute(new Runnable() { // from class: com.bytedance.sdk.component.mZx.2
                @Override // java.lang.Runnable
                public void run() {
                    mZx.this.EYQ();
                }
            });
        }
    }

    static File EYQ(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ad -> B:69:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.mZx.EYQ():void");
    }

    private void Pm() throws InterruptedException {
        while (!this.Kbd) {
            try {
                this.mZx.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public String EYQ(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.mZx) {
            Pm();
            property = this.Pm.getProperty(str, str2);
        }
        return property;
    }

    public int EYQ(String str, int i) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        synchronized (this.mZx) {
            try {
                try {
                    Pm();
                    i2 = Integer.parseInt(this.Pm.getProperty(str, String.valueOf(i)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public long EYQ(String str, long j) {
        long j2;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        synchronized (this.mZx) {
            try {
                try {
                    Pm();
                    j2 = Long.parseLong(this.Pm.getProperty(str, String.valueOf(j)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public float EYQ(String str, float f) {
        float f2;
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        synchronized (this.mZx) {
            try {
                try {
                    Pm();
                    f2 = Float.parseFloat(this.Pm.getProperty(str, String.valueOf(f)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2;
    }

    public boolean EYQ(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        synchronized (this.mZx) {
            try {
                try {
                    Pm();
                    z2 = Boolean.parseBoolean(this.Pm.getProperty(str, String.valueOf(z)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public boolean EYQ(String str) {
        boolean zContainsKey;
        synchronized (this.mZx) {
            try {
                try {
                    Pm();
                    zContainsKey = this.Pm.containsKey(str);
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }

    public Td mZx() {
        return new Td();
    }

    /* compiled from: TTPropHelper.java */
    /* renamed from: com.bytedance.sdk.component.mZx$mZx, reason: collision with other inner class name */
    private static class C0100mZx {
        final long EYQ;
        boolean Kbd;
        volatile boolean Pm;
        final CountDownLatch Td;
        final Properties mZx;

        private C0100mZx(long j, Properties properties) {
            this.Td = new CountDownLatch(1);
            this.Pm = false;
            this.Kbd = false;
            this.EYQ = j;
            this.mZx = properties;
        }

        void EYQ(boolean z, boolean z2) {
            this.Kbd = z;
            this.Pm = z2;
            this.Td.countDown();
        }
    }

    /* compiled from: TTPropHelper.java */
    public class Td implements SharedPreferences.Editor {
        private final Object mZx = new Object();
        private final Map<String, Object> Td = new HashMap();
        private boolean Pm = false;

        public Td() {
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return EYQ(str, (Set<String>) set);
        }

        public Td EYQ(String str, Set<String> set) {
            synchronized (this.mZx) {
                this.Td.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Td putInt(String str, int i) {
            synchronized (this.mZx) {
                this.Td.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Td putLong(String str, long j) {
            synchronized (this.mZx) {
                this.Td.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Td putFloat(String str, float f) {
            synchronized (this.mZx) {
                this.Td.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Td putString(String str, String str2) {
            synchronized (this.mZx) {
                this.Td.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Td putBoolean(String str, boolean z) {
            synchronized (this.mZx) {
                this.Td.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Td remove(String str) {
            synchronized (this.mZx) {
                this.Td.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Td clear() {
            synchronized (this.mZx) {
                this.Pm = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = mZx.EYQ ? System.currentTimeMillis() : 0L;
            C0100mZx c0100mZxMZx = mZx();
            mZx.this.EYQ(c0100mZxMZx, true);
            try {
                c0100mZxMZx.Td.await();
                if (mZx.EYQ) {
                    Log.d("TTPropHelper", mZx.this.HX.getName() + ":" + c0100mZxMZx.EYQ + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                return c0100mZxMZx.Pm;
            } catch (InterruptedException unused) {
                if (!mZx.EYQ) {
                    return false;
                }
                Log.d("TTPropHelper", mZx.this.HX.getName() + ":" + c0100mZxMZx.EYQ + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return false;
            } catch (Throwable th) {
                if (mZx.EYQ) {
                    Log.d("TTPropHelper", mZx.this.HX.getName() + ":" + c0100mZxMZx.EYQ + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            mZx.this.EYQ(mZx(), false);
        }

        private C0100mZx mZx() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (mZx.this.mZx) {
                if (mZx.this.IPb > 0) {
                    Properties properties2 = new Properties();
                    properties2.putAll(mZx.this.Pm);
                    mZx.this.Pm = properties2;
                }
                properties = mZx.this.Pm;
                mZx.Kbd(mZx.this);
                synchronized (this.mZx) {
                    boolean z2 = false;
                    if (this.Pm) {
                        if (properties.isEmpty()) {
                            z = false;
                        } else {
                            properties.clear();
                            z = true;
                        }
                        this.Pm = false;
                        z2 = z;
                    }
                    for (Map.Entry<String, Object> entry : this.Td.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == this || value == null) {
                            if (properties.containsKey(key)) {
                                properties.remove(key);
                                z2 = true;
                            }
                        } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                            properties.put(key, String.valueOf(value));
                            z2 = true;
                        }
                    }
                    this.Td.clear();
                    if (z2) {
                        mZx.IPb(mZx.this);
                    }
                    j = mZx.this.VwS;
                }
            }
            return new C0100mZx(j, properties);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final C0100mZx c0100mZx, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.mZx.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (mZx.this.Td) {
                    try {
                        mZx.this.mZx(c0100mZx, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (mZx.this.mZx) {
                    mZx.HX(mZx.this);
                }
            }
        };
        if (z) {
            synchronized (this.mZx) {
                z2 = this.IPb == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.Td.EYQ(runnable, true ^ z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123 A[Catch: all -> 0x0196, TryCatch #6 {all -> 0x0196, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011f, B:78:0x0123, B:80:0x012a, B:82:0x0133, B:84:0x013b, B:86:0x0147, B:96:0x0194, B:97:0x0195, B:75:0x011e, B:55:0x00e8, B:56:0x00ee, B:74:0x0117, B:94:0x0192, B:93:0x0189, B:70:0x0111, B:51:0x00e2, B:89:0x0183), top: B:116:0x0090, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133 A[Catch: all -> 0x0196, TryCatch #6 {all -> 0x0196, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011f, B:78:0x0123, B:80:0x012a, B:82:0x0133, B:84:0x013b, B:86:0x0147, B:96:0x0194, B:97:0x0195, B:75:0x011e, B:55:0x00e8, B:56:0x00ee, B:74:0x0117, B:94:0x0192, B:93:0x0189, B:70:0x0111, B:51:0x00e2, B:89:0x0183), top: B:116:0x0090, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #6 {all -> 0x0196, blocks: (B:39:0x0090, B:40:0x0092, B:76:0x011f, B:78:0x0123, B:80:0x012a, B:82:0x0133, B:84:0x013b, B:86:0x0147, B:96:0x0194, B:97:0x0195, B:75:0x011e, B:55:0x00e8, B:56:0x00ee, B:74:0x0117, B:94:0x0192, B:93:0x0189, B:70:0x0111, B:51:0x00e2, B:89:0x0183), top: B:116:0x0090, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mZx(com.bytedance.sdk.component.mZx.C0100mZx r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.mZx.mZx(com.bytedance.sdk.component.mZx$mZx, boolean):void");
    }
}
