package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqz implements zzqw {
    private static final zzhh<Boolean> zza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzqw
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqw
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
