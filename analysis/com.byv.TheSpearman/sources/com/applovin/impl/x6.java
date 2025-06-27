package com.applovin.impl;

import com.applovin.impl.y6;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface x6 {
    void a(y6.a aVar);

    boolean a(String str);

    int b();

    void b(y6.a aVar);

    boolean c();

    Map d();

    UUID e();

    x4 f();

    a getError();

    /* renamed from: com.applovin.impl.x6$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void a(x6 x6Var, x6 x6Var2) {
            if (x6Var == x6Var2) {
                return;
            }
            if (x6Var2 != null) {
                x6Var2.b(null);
            }
            if (x6Var != null) {
                x6Var.a((y6.a) null);
            }
        }
    }

    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f1159a;

        public a(Throwable th, int i) {
            super(th);
            this.f1159a = i;
        }
    }
}
