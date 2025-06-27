package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public abstract class gi implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final m2.a f461a = new m2.a() { // from class: com.applovin.impl.gi$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return gi.a(bundle);
        }
    };

    gi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static gi a(Bundle bundle) {
        int i = bundle.getInt(a(0), -1);
        if (i == 0) {
            return (gi) ja.d.a(bundle);
        }
        if (i == 1) {
            return (gi) dh.c.a(bundle);
        }
        if (i == 2) {
            return (gi) zk.d.a(bundle);
        }
        if (i != 3) {
            throw new IllegalArgumentException("Encountered unknown rating type: " + i);
        }
        return (gi) Cdo.d.a(bundle);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
