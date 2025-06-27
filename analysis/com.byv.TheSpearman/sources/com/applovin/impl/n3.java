package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* loaded from: classes.dex */
abstract class n3 {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    static void a(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }
}
