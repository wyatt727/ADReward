package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes.dex */
public final class g extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f1343a;

    public g(String str) {
        this.f1343a = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f1343a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f1343a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f1343a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f1343a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f1343a).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f1343a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f1343a);
    }

    public final String toString() {
        return this.f1343a;
    }

    public final int hashCode() {
        return this.f1343a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f1343a;
        String str2 = ((g) obj).f1343a;
        return str == str2 || str.equals(str2);
    }
}
