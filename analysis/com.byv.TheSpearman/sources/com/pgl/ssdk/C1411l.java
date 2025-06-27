package com.pgl.ssdk;

/* renamed from: com.pgl.ssdk.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1411l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4317a;
    private final Object b;

    public C1411l(Object obj, Object obj2) {
        this.f4317a = obj;
        this.b = obj2;
    }

    public Object a() {
        return this.f4317a;
    }

    public Object b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1411l.class != obj.getClass()) {
            return false;
        }
        C1411l c1411l = (C1411l) obj;
        Object obj2 = this.f4317a;
        if (obj2 == null) {
            if (c1411l.f4317a != null) {
                return false;
            }
        } else if (!obj2.equals(c1411l.f4317a)) {
            return false;
        }
        Object obj3 = this.b;
        Object obj4 = c1411l.b;
        if (obj3 == null) {
            if (obj4 != null) {
                return false;
            }
        } else if (!obj3.equals(obj4)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.f4317a;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 31) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
