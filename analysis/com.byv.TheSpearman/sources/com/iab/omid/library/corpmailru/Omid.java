package com.iab.omid.library.corpmailru;

import android.content.Context;

/* loaded from: classes4.dex */
public final class Omid {
    private static b INSTANCE = new b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.a();
    }

    public static boolean isActive() {
        return INSTANCE.b();
    }
}
