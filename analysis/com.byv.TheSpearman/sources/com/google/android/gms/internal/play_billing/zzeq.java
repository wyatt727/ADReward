package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzeq {
    private static final zzep zza;
    private static final zzep zzb;

    static {
        zzep zzepVar;
        try {
            zzepVar = (zzep) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzepVar = null;
        }
        zza = zzepVar;
        zzb = new zzep();
    }

    static zzep zza() {
        return zza;
    }

    static zzep zzb() {
        return zzb;
    }
}
