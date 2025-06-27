package com.pgl.ssdk.ces;

import android.content.Context;

/* loaded from: classes4.dex */
public final class a {
    public static native Object meta(int i, Context context, Object obj);

    public static Object njss(int i, Object obj) {
        try {
            f fVarE = f.e();
            if (fVarE != null) {
                return fVarE.a(i, obj);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
