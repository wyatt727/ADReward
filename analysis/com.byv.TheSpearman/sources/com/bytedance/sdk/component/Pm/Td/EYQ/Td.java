package com.bytedance.sdk.component.Pm.Td.EYQ;

import com.json.t2;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: SoftLruCache.java */
/* loaded from: classes2.dex */
public class Td<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> EYQ;
    private int IPb;
    private int Kbd;
    private int Pm;
    private int QQ;
    private int Td;
    private int VwS;
    private int mZx;

    protected int mZx(K k, V v) {
        return 1;
    }

    protected V mZx(K k) {
        return null;
    }

    public Td(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.Td = i;
        this.EYQ = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V EYQ(K k) {
        V v;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            SoftReference<V> softReference = this.EYQ.get(k);
            if (softReference != null) {
                v = softReference.get();
                if (v != null) {
                    this.VwS++;
                    return v;
                }
                this.EYQ.remove(k);
            } else {
                v = null;
            }
            this.QQ++;
            V vMZx = mZx(k);
            if (vMZx == null) {
                return null;
            }
            synchronized (this) {
                this.Kbd++;
                SoftReference<V> softReferencePut = this.EYQ.put(k, new SoftReference<>(vMZx));
                if (softReferencePut != null) {
                    v = softReferencePut.get();
                }
                if (v != null) {
                    this.EYQ.put(k, softReferencePut);
                } else {
                    this.mZx += Td(k, vMZx);
                }
            }
            if (v != null) {
                return v;
            }
            EYQ(this.Td);
            return vMZx;
        }
    }

    public final V EYQ(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V v2 = null;
        synchronized (this) {
            this.Pm++;
            this.mZx += Td(k, v);
            SoftReference<V> softReferencePut = this.EYQ.put(k, new SoftReference<>(v));
            if (softReferencePut != null && (v2 = softReferencePut.get()) != null) {
                this.mZx -= Td(k, v2);
            }
        }
        EYQ(this.Td);
        return v2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.mZx + ", maxSize: " + r4);
        r3.mZx = 0;
        r3.EYQ.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.mZx     // Catch: java.lang.Throwable -> L79
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.EYQ     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            int r0 = r3.mZx     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            goto L52
        L12:
            int r0 = r3.mZx     // Catch: java.lang.Throwable -> L79
            if (r0 > r4) goto L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L18:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.EYQ     // Catch: java.lang.Throwable -> L79
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L79
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L2c:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L79
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.EYQ     // Catch: java.lang.Throwable -> L79
            r2.remove(r1)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L79
            int r2 = r3.mZx     // Catch: java.lang.Throwable -> L79
            int r0 = r3.Td(r1, r0)     // Catch: java.lang.Throwable -> L79
            int r2 = r2 - r0
            r3.mZx = r2     // Catch: java.lang.Throwable -> L79
        L4a:
            int r0 = r3.IPb     // Catch: java.lang.Throwable -> L79
            int r0 = r0 + 1
            r3.IPb = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            goto L0
        L52:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L79
            int r2 = r3.mZx     // Catch: java.lang.Throwable -> L79
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            r1.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L79
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r3.mZx = r4     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.EYQ     // Catch: java.lang.Throwable -> L79
            r4.clear()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Pm.Td.EYQ.Td.EYQ(int):void");
    }

    private int Td(K k, V v) {
        int iMZx = mZx(k, v);
        if (iMZx >= 0) {
            return iMZx;
        }
        throw new IllegalStateException("Negative size: " + k + t2.i.b + v);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.VwS;
        i2 = this.QQ + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.Td), Integer.valueOf(this.VwS), Integer.valueOf(this.QQ), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
