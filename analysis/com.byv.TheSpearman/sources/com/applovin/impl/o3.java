package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class o3 {
    static StringBuilder a(int i) {
        n3.a(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    static boolean a(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
