package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbh {
    private static final zzhbg zza;
    private static final zzhbg zzb;

    static {
        zzhbg zzhbgVar;
        try {
            zzhbgVar = (zzhbg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhbgVar = null;
        }
        zza = zzhbgVar;
        zzb = new zzhbg();
    }

    static zzhbg zza() {
        return zza;
    }

    static zzhbg zzb() {
        return zzb;
    }
}
