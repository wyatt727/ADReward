package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.ej;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes.dex */
final class ff implements hj {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f429a;
    private final long[] b;
    private final long c;

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return -1L;
    }

    public static ff a(long j, ef efVar, long j2) {
        int length = efVar.f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += efVar.c + efVar.f[i3];
            j3 += efVar.d + efVar.g[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new ff(jArr, jArr2, j2);
    }

    private ff(long[] jArr, long[] jArr2, long j) {
        this.f429a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? r2.a(jArr2[jArr2.length - 1]) : j;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j) {
        Pair pairA = a(r2.b(yp.b(j, 0L, this.c)), this.b, this.f429a);
        return new ej.a(new gj(r2.a(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue()));
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.hj
    public long a(long j) {
        return r2.a(((Long) a(j, this.f429a, this.b).second).longValue());
    }

    private static Pair a(long j, long[] jArr, long[] jArr2) {
        int iB = yp.b(jArr, j, true, true);
        long j2 = jArr[iB];
        long j3 = jArr2[iB];
        int i = iB + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
