package com.applovin.impl;

/* loaded from: classes.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1086a;
    public final int b;
    public final String c;

    public static v6 a(yg ygVar) {
        String str;
        ygVar.g(2);
        int iW = ygVar.w();
        int i = iW >> 1;
        int iW2 = ((ygVar.w() >> 3) & 31) | ((iW & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iW2 >= 10 ? "." : ".0");
        sb.append(iW2);
        return new v6(i, iW2, sb.toString());
    }

    private v6(int i, int i2, String str) {
        this.f1086a = i;
        this.b = i2;
        this.c = str;
    }
}
