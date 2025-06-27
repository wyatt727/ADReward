package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class cg {
    public static Object[] b(Object[] objArr, int i) {
        return jh.a(objArr, i);
    }

    static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    static Object[] a(Object... objArr) {
        return a(objArr, objArr.length);
    }

    static Object[] a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }
}
