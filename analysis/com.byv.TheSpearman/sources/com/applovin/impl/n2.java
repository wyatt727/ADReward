package com.applovin.impl;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.impl.ab;
import com.applovin.impl.m2;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n2 {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) yp.a(n2.class.getClassLoader()));
        }
    }

    public static List a(m2.a aVar, List list, List list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static SparseArray a(m2.a aVar, SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray sparseArray3 = new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray3.put(sparseArray.keyAt(i), aVar.a((Bundle) sparseArray.valueAt(i)));
        }
        return sparseArray3;
    }

    public static m2 a(m2.a aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.a(bundle);
    }

    public static ab a(m2.a aVar, List list) {
        ab.a aVarF = ab.f();
        for (int i = 0; i < list.size(); i++) {
            aVarF.b(aVar.a((Bundle) a1.a((Bundle) list.get(i))));
        }
        return aVarF.a();
    }
}
