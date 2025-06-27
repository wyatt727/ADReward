package com.applovin.impl;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class d8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f354a = "ExoPlayerLib/2.15.1 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.1";
    private static final HashSet b = new HashSet();
    private static String c = "goog.exo.core";

    public static synchronized String a() {
        return c;
    }

    public static synchronized void a(String str) {
        if (b.add(str)) {
            c += ", " + str;
        }
    }
}
