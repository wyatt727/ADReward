package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzpv implements zzps {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Double> zzb;
    private static final zzhh<Long> zzc;
    private static final zzhh<Long> zzd;
    private static final zzhh<String> zze;

    @Override // com.google.android.gms.internal.measurement.zzps
    public final double zza() {
        return zzb.zza().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final long zzb() {
        return zzc.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final long zzc() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final String zzd() {
        return zze.zza();
    }

    static {
        zzhp zzhpVarZza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhpVarZza.zza("measurement.test.boolean_flag", false);
        zzb = zzhpVarZza.zza("measurement.test.double_flag", -3.0d);
        zzc = zzhpVarZza.zza("measurement.test.int_flag", -2L);
        zzd = zzhpVarZza.zza("measurement.test.long_flag", -1L);
        zze = zzhpVarZza.zza("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final boolean zze() {
        return zza.zza().booleanValue();
    }
}
