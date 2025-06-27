package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpp implements zzpm {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;

    static {
        zzhp zzhpVarZza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhpVarZza.zza("measurement.item_scoped_custom_parameters.client", true);
        zzb = zzhpVarZza.zza("measurement.item_scoped_custom_parameters.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
