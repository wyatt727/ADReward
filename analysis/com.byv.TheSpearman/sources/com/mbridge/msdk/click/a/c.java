package com.mbridge.msdk.click.a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: WaitRetryLruMemoryCache.java */
/* loaded from: classes4.dex */
public final class c implements com.mbridge.msdk.foundation.same.a.c<String, b> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f2524a;
    private final int b;
    private int c;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = i;
        this.f2524a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final b b(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            b bVar = this.f2524a.get(str);
            if (bVar != null) {
                return bVar;
            }
            return null;
        }
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final boolean a(String str, b bVar) {
        if (str == null || bVar == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.c++;
            if (this.f2524a.put(str, bVar) != null) {
                this.c--;
            }
        }
        a(this.b);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.c     // Catch: java.lang.Throwable -> L6c
            if (r0 < 0) goto L4d
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f2524a     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L11
            int r0 = r2.c     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L4d
        L11:
            int r0 = r2.c     // Catch: java.lang.Throwable -> L6c
            if (r0 <= r3) goto L4b
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f2524a     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L1e
            goto L4b
        L1e:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f2524a     // Catch: java.lang.Throwable -> L6c
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L32
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            goto L4c
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6c
            com.mbridge.msdk.click.a.b r0 = (com.mbridge.msdk.click.a.b) r0     // Catch: java.lang.Throwable -> L6c
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f2524a     // Catch: java.lang.Throwable -> L49
            r0.remove(r1)     // Catch: java.lang.Throwable -> L49
            int r0 = r2.c     // Catch: java.lang.Throwable -> L49
            int r0 = r0 + (-1)
            r2.c = r0     // Catch: java.lang.Throwable -> L49
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            goto L0
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
        L4c:
            return
        L4d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6c
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            throw r3     // Catch: java.lang.Throwable -> L6c
        L6c:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.c.a(int):void");
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void a(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            if (this.f2524a.remove(str) != null) {
                this.c--;
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f2524a.keySet());
        }
        return hashSet;
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final void b() {
        a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }
}
