package com.bytedance.adsdk.lottie;

import com.json.t2;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* compiled from: LruCache.java */
/* loaded from: classes2.dex */
public class pi<K, V> {
    private final LinkedHashMap<K, V> EYQ;
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

    public pi(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.Td = i;
        this.EYQ = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V EYQ(K k) {
        V vPut;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.EYQ.get(k);
            if (v != null) {
                this.VwS++;
                return v;
            }
            this.QQ++;
            V vMZx = mZx(k);
            if (vMZx == null) {
                return null;
            }
            synchronized (this) {
                this.Kbd++;
                vPut = this.EYQ.put(k, vMZx);
                if (vPut != null) {
                    this.EYQ.put(k, vPut);
                } else {
                    this.mZx += Td(k, vMZx);
                }
            }
            if (vPut != null) {
                return vPut;
            }
            EYQ(this.Td);
            return vMZx;
        }
    }

    public final V EYQ(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.Pm++;
            this.mZx += Td(k, v);
            vPut = this.EYQ.put(k, v);
            if (vPut != null) {
                this.mZx -= Td(k, vPut);
            }
        }
        EYQ(this.Td);
        return vPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
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
            int r0 = r3.mZx     // Catch: java.lang.Throwable -> L6d
            if (r0 < 0) goto L4e
            java.util.LinkedHashMap<K, V> r0 = r3.EYQ     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L11
            int r0 = r3.mZx     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L4e
        L11:
            int r0 = r3.mZx     // Catch: java.lang.Throwable -> L6d
            if (r0 <= r4) goto L4c
            java.util.LinkedHashMap<K, V> r0 = r3.EYQ     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L1e
            goto L4c
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r3.EYQ     // Catch: java.lang.Throwable -> L6d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap<K, V> r2 = r3.EYQ     // Catch: java.lang.Throwable -> L6d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6d
            int r2 = r3.mZx     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.Td(r1, r0)     // Catch: java.lang.Throwable -> L6d
            int r2 = r2 - r0
            r3.mZx = r2     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.IPb     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 + 1
            r3.IPb = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            goto L0
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            return
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6d
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r4     // Catch: java.lang.Throwable -> L6d
        L6d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.pi.EYQ(int):void");
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
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.Td), Integer.valueOf(this.VwS), Integer.valueOf(this.QQ), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
