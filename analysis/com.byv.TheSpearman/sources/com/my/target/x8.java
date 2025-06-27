package com.my.target;

import android.content.Context;

/* loaded from: classes4.dex */
public class x8 {

    /* renamed from: a, reason: collision with root package name */
    public static int f4183a;

    static {
        if (d5.a()) {
            f4183a |= 2;
        }
        if (b()) {
            f4183a |= 1;
        }
    }

    public static int a() {
        return f4183a;
    }

    public static void a(boolean z) {
        f4183a = z ? f4183a | 16 : f4183a & (-17);
    }

    public static void b(final Context context) {
        c0.c(new Runnable() { // from class: com.my.target.x8$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                s7.a(context).b(x8.f4183a);
            }
        });
    }

    public static void b(boolean z) {
        f4183a = z ? f4183a | 32 : f4183a & (-33);
    }

    public static boolean b() {
        try {
            try {
                Class.forName("com.unity3d.player.UnityPlayerActivity");
                return true;
            } catch (Throwable unused) {
                return false;
            }
        } catch (Throwable unused2) {
            Runtime.getRuntime().loadLibrary("unity");
            return true;
        }
    }

    public static void c() {
        f4183a |= 8;
    }

    public static void d() {
        f4183a |= 4;
    }

    public static void e() {
        f4183a |= 64;
    }

    public static void f() {
        f4183a |= 128;
    }

    public static void g() {
        f4183a &= -3;
    }
}
