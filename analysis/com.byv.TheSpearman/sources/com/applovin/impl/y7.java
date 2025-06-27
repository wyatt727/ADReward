package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.m2;
import java.io.IOException;

/* loaded from: classes.dex */
public final class y7 extends kh {
    public static final m2.a l = new m2.a() { // from class: com.applovin.impl.y7$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return y7.m246$r8$lambda$63Q5ywKvpqNrbs0Z0YkGY6zODk(bundle);
        }
    };
    public final int d;
    public final String f;
    public final int g;
    public final d9 h;
    public final int i;
    public final td j;
    final boolean k;

    /* renamed from: $r8$lambda$63Q5ywKvpqNrbs0Z0YkGY6zO-Dk, reason: not valid java name */
    public static /* synthetic */ y7 m246$r8$lambda$63Q5ywKvpqNrbs0Z0YkGY6zODk(Bundle bundle) {
        return new y7(bundle);
    }

    public static y7 a(Throwable th, String str, int i, d9 d9Var, int i2, boolean z, int i3) {
        return new y7(1, th, null, i3, str, i, d9Var, d9Var == null ? 4 : i2, z);
    }

    private y7(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static y7 a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    private y7(int i, Throwable th, String str, int i2, String str2, int i3, d9 d9Var, int i4, boolean z) {
        this(a(i, str, str2, i3, d9Var, i4), th, i2, i, str2, i3, d9Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    private y7(Bundle bundle) {
        super(bundle);
        this.d = bundle.getInt(kh.b(1001), 2);
        this.f = bundle.getString(kh.b(1002));
        this.g = bundle.getInt(kh.b(1003), -1);
        this.h = (d9) n2.a(d9.I, bundle.getBundle(kh.b(1004)));
        this.i = bundle.getInt(kh.b(1005), 4);
        this.k = bundle.getBoolean(kh.b(1006), false);
        this.j = null;
    }

    private static String a(int i, String str, String str2, int i2, d9 d9Var, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + d9Var + ", format_supported=" + r2.b(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public static y7 a(IOException iOException, int i) {
        return new y7(0, iOException, i);
    }

    public static y7 a(RuntimeException runtimeException, int i) {
        return new y7(2, runtimeException, i);
    }

    y7 a(td tdVar) {
        return new y7((String) yp.a((Object) getMessage()), getCause(), this.f602a, this.d, this.f, this.g, this.h, this.i, tdVar, this.b, this.k);
    }

    private y7(String str, Throwable th, int i, int i2, String str2, int i3, d9 d9Var, int i4, td tdVar, long j, boolean z) {
        super(str, th, i, j);
        a1.a(!z || i2 == 1);
        a1.a(th != null || i2 == 3);
        this.d = i2;
        this.f = str2;
        this.g = i3;
        this.h = d9Var;
        this.i = i4;
        this.j = tdVar;
        this.k = z;
    }
}
