package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgzi {
    private static final zzgzg zza = new zzgzh();
    private static final zzgzg zzb;

    static {
        zzgzg zzgzgVar;
        try {
            zzgzgVar = (zzgzg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgzgVar = null;
        }
        zzb = zzgzgVar;
    }

    static zzgzg zza() {
        zzgzg zzgzgVar = zzb;
        if (zzgzgVar != null) {
            return zzgzgVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgzg zzb() {
        return zza;
    }
}
