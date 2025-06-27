package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfwr {
    public static int zza(int i, int i2, String str) {
        String strZzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZzb = zzfxg.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            strZzb = zzfxg.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzl(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static Object zzc(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(@CheckForNull Object obj, String str, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfxg.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(zzfxg.zzb(str, Long.valueOf(j)));
        }
    }

    public static void zzh(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(zzfxg.zzb(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void zzi(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzl(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzl(i2, i3, "end index") : zzfxg.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void zzj(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzk(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzl(int i, int i2, String str) {
        if (i < 0) {
            return zzfxg.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzfxg.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
