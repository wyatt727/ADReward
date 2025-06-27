package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class T {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f4300a;

    public static SharedPreferences a(Context context) {
        if (f4300a == null) {
            f4300a = context.getSharedPreferences("ss_config", 0);
        }
        return f4300a;
    }
}
