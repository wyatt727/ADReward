package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqu implements zzqv {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Long> zzc;

    static {
        zzhp zzhpVarZza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhpVarZza.zza("measurement.tcf.client", true);
        zzb = zzhpVarZza.zza("measurement.tcf.service", true);
        zzc = zzhpVarZza.zza("measurement.id.tcf.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqv
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqv
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqv
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
