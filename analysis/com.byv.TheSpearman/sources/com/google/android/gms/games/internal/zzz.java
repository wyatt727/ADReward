package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.GmsLogger;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzz {
    private static final GmsLogger zzer = new GmsLogger("Games");

    public static void i(String str, String str2, Throwable th) {
        zzer.i(zzh(str), str2, th);
    }

    public static void w(String str, String str2) {
        zzer.w(zzh(str), str2);
    }

    public static void w(String str, String str2, Throwable th) {
        zzer.w(zzh(str), str2, th);
    }

    public static void e(String str, String str2) {
        zzer.e(zzh(str), str2);
    }

    public static void e(String str, String str2, Throwable th) {
        zzer.e(zzh(str), str2, th);
    }

    private static String zzh(String str) {
        return String.format("%s[%s]", "PlayGamesServices", str);
    }
}
