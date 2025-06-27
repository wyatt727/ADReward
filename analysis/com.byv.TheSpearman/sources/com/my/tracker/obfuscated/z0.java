package com.my.tracker.obfuscated;

import android.util.Log;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f4274a = false;

    public static void a(String str) {
        if (f4274a) {
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            Log.d("[myTracker]", str);
        }
    }

    public static void a(String str, Throwable th) {
        if (f4274a) {
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            Log.d("[myTracker]", str, th);
        }
    }

    public static void a(boolean z) {
        f4274a = z;
    }

    public static boolean a() {
        return f4274a;
    }

    public static void b(String str) {
        if (f4274a) {
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            Log.e("[myTracker]", str);
        }
    }

    public static void b(String str, Throwable th) {
        if (f4274a) {
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            Log.e("[myTracker]", str, th);
        }
    }

    public static void c(String str) {
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        Log.i("[myTracker]", str);
    }
}
