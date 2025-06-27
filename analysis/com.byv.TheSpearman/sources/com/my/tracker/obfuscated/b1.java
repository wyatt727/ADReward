package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f4216a;

    public static String a(Context context) {
        String strJ = f4216a;
        if (strJ == null) {
            synchronized (b1.class) {
                strJ = f4216a;
                if (strJ == null) {
                    strJ = r0.a(context).j();
                    if (TextUtils.isEmpty(strJ)) {
                        strJ = UUID.randomUUID().toString();
                        r0.a(context).k(strJ);
                        f4216a = strJ;
                    }
                }
            }
        }
        return strJ;
    }
}
