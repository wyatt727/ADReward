package com.applovin.impl;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class as {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f280a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(yg ygVar) {
        String strL = ygVar.l();
        return strL != null && strL.startsWith("WEBVTT");
    }

    public static long b(String str) {
        String[] strArrB = yp.b(str, "\\.");
        long j = 0;
        for (String str2 : yp.a(strArrB[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrB.length == 2) {
            j2 += Long.parseLong(strArrB[1]);
        }
        return j2 * 1000;
    }

    public static void b(yg ygVar) throws ah {
        int iD = ygVar.d();
        if (a(ygVar)) {
            return;
        }
        ygVar.f(iD);
        throw ah.a("Expected WEBVTT. Got " + ygVar.l(), null);
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
