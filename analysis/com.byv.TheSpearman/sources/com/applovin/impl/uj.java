package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class uj {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f1069a;
    private final Map b = new HashMap();
    private final Object c = new Object();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1070a;

        static {
            int[] iArr = new int[b.values().length];
            f1070a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1070a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1070a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    public uj(com.applovin.impl.sdk.k kVar) {
        this.f1069a = kVar;
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final vj f1072a;
        private final long b;
        private final long c;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.c > this.b;
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            vj vjVarC = c();
            vj vjVarC2 = cVar.c();
            return vjVarC != null ? vjVarC.equals(vjVarC2) : vjVarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            vj vjVarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (vjVarC == null ? 43 : vjVarC.hashCode());
        }

        public vj c() {
            return this.f1072a;
        }

        private c(vj vjVar, long j) {
            this.f1072a = vjVar;
            this.b = j;
            this.c = SystemClock.elapsedRealtime();
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public long b() {
            return this.b;
        }

        /* synthetic */ c(vj vjVar, long j, a aVar) {
            this(vjVar, j);
        }

        public long a() {
            return this.c;
        }
    }

    public vj b(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        String strA = a(wjVar, str, maxAdFormat);
        synchronized (this.c) {
            c cVar = (c) this.b.get(strA);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.b.remove(strA);
                return null;
            }
            this.f1069a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f1069a.L().a("SignalCacheManager", "Returning cached signal for: " + wjVar);
            }
            return cVar.f1072a;
        }
    }

    private String a(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        String strC = wjVar.c();
        int i = a.f1070a[wjVar.s().ordinal()];
        if (i == 1) {
            return strC + "_" + maxAdFormat.getLabel();
        }
        if (i != 2) {
            return strC;
        }
        return strC + "_" + str;
    }

    public void a(vj vjVar, wj wjVar, String str, MaxAdFormat maxAdFormat) {
        if (vjVar == null) {
            return;
        }
        long jT = wjVar.t();
        if (jT <= 0) {
            return;
        }
        this.f1069a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f1069a.L().a("SignalCacheManager", "Caching signal for: " + wjVar);
        }
        String strA = a(wjVar, str, maxAdFormat);
        c cVar = new c(vjVar, jT, null);
        synchronized (this.c) {
            this.b.put(strA, cVar);
        }
    }
}
