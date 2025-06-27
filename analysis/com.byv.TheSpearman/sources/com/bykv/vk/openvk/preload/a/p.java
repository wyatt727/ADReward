package com.bykv.vk.openvk.preload.a;

import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes.dex */
public final class p extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1370a;

    public p(Boolean bool) {
        this.f1370a = com.bykv.vk.openvk.preload.a.b.a.a(bool);
    }

    public p(Number number) {
        this.f1370a = com.bykv.vk.openvk.preload.a.b.a.a(number);
    }

    public p(String str) {
        this.f1370a = com.bykv.vk.openvk.preload.a.b.a.a(str);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final Number a() {
        Object obj = this.f1370a;
        return obj instanceof String ? new com.bykv.vk.openvk.preload.a.b.g((String) obj) : (Number) obj;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.f1370a == null) {
            return 31;
        }
        if (a(this)) {
            jDoubleToLongBits = a().longValue();
        } else {
            Object obj = this.f1370a;
            if (obj instanceof Number) {
                jDoubleToLongBits = Double.doubleToLongBits(a().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f1370a == null) {
            return pVar.f1370a == null;
        }
        if (a(this) && a(pVar)) {
            return a().longValue() == pVar.a().longValue();
        }
        Object obj2 = this.f1370a;
        if ((obj2 instanceof Number) && (pVar.f1370a instanceof Number)) {
            double dDoubleValue = a().doubleValue();
            double dDoubleValue2 = pVar.a().doubleValue();
            return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
        }
        return obj2.equals(pVar.f1370a);
    }

    private static boolean a(p pVar) {
        Object obj = pVar.f1370a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean f() {
        Object obj = this.f1370a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final String b() {
        Object obj = this.f1370a;
        if (obj instanceof Number) {
            return a().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final double c() {
        return this.f1370a instanceof Number ? a().doubleValue() : Double.parseDouble(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final long d() {
        return this.f1370a instanceof Number ? a().longValue() : Long.parseLong(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final int e() {
        return this.f1370a instanceof Number ? a().intValue() : Integer.parseInt(b());
    }
}
