package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzcs {
    private static final zzcq zza = new zzcr();
    private static final zzcq zzb;

    static {
        zzcq zzcqVar;
        try {
            zzcqVar = (zzcq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzcqVar = null;
        }
        zzb = zzcqVar;
    }

    static zzcq zza() {
        zzcq zzcqVar = zzb;
        if (zzcqVar != null) {
            return zzcqVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzcq zzb() {
        return zza;
    }
}
