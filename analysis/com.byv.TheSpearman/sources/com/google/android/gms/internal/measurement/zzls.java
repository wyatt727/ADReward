package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzls {
    private static final zzlq zza = zzc();
    private static final zzlq zzb = new zzlp();

    static zzlq zza() {
        return zza;
    }

    static zzlq zzb() {
        return zzb;
    }

    private static zzlq zzc() {
        try {
            return (zzlq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
