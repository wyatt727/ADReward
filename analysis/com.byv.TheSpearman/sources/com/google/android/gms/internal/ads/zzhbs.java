package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbs {
    private static final zzhbr zza;
    private static final zzhbr zzb;

    static {
        zzhbr zzhbrVar;
        try {
            zzhbrVar = (zzhbr) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhbrVar = null;
        }
        zza = zzhbrVar;
        zzb = new zzhbr();
    }

    static zzhbr zza() {
        return zza;
    }

    static zzhbr zzb() {
        return zzb;
    }
}
