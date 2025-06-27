package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzhin {
    public static zzhin zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzhii(cls.getSimpleName()) : new zzhik(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
