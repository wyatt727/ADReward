package com.json;

import java.util.Date;

/* loaded from: classes4.dex */
public class e4 {

    /* renamed from: a, reason: collision with root package name */
    private long f1749a = new Date().getTime();

    public static long a(e4 e4Var) {
        if (e4Var == null) {
            return 0L;
        }
        return new Date().getTime() - e4Var.f1749a;
    }
}
