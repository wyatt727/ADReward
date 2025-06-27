package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p3 implements m2 {
    public static final m2.a g = new m2.a() { // from class: com.applovin.impl.p3$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return p3.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f772a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int f;

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p3 a(Bundle bundle) {
        return new p3(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public p3(int i, int i2, int i3, byte[] bArr) {
        this.f772a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p3.class != obj.getClass()) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return this.f772a == p3Var.f772a && this.b == p3Var.b && this.c == p3Var.c && Arrays.equals(this.d, p3Var.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f772a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = ((((((this.f772a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.f;
    }

    private static String c(int i) {
        return Integer.toString(i, 36);
    }
}
