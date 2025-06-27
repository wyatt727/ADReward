package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzjm {
    private static final zzjk<?> zza = new zzjj();
    private static final zzjk<?> zzb = zzc();

    static zzjk<?> zza() {
        zzjk<?> zzjkVar = zzb;
        if (zzjkVar != null) {
            return zzjkVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzjk<?> zzb() {
        return zza;
    }

    private static zzjk<?> zzc() {
        try {
            return (zzjk) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
