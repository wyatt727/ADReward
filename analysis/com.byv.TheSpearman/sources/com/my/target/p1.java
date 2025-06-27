package com.my.target;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class p1 {
    public static boolean a(String str, Context context) {
        int iCheckCallingOrSelfPermission;
        try {
            iCheckCallingOrSelfPermission = context.checkCallingOrSelfPermission(str);
        } catch (Throwable th) {
            ba.a("FPDataProvider: Unable to check " + str + " permission! Unexpected throwable in Context.checkCallingOrSelfPermission() method - " + th.getMessage());
            iCheckCallingOrSelfPermission = -1;
        }
        return iCheckCallingOrSelfPermission == 0;
    }
}
