package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzox implements zzou {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Boolean> zzc;
    private static final zzhh<Boolean> zzd;
    private static final zzhh<Boolean> zze;
    private static final zzhh<Boolean> zzf;
    private static final zzhh<Long> zzg;

    static {
        zzhp zzhpVarZza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhpVarZza.zza("measurement.client.ad_id_consent_fix", true);
        zzb = zzhpVarZza.zza("measurement.service.consent.aiid_reset_fix", false);
        zzc = zzhpVarZza.zza("measurement.service.consent.aiid_reset_fix2", true);
        zzd = zzhpVarZza.zza("measurement.service.consent.app_start_fix", true);
        zze = zzhpVarZza.zza("measurement.service.consent.params_on_fx", false);
        zzf = zzhpVarZza.zza("measurement.service.consent.pfo_on_fx", true);
        zzg = zzhpVarZza.zza("measurement.id.service.consent.params_on_fx", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zza() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zzb() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zzc() {
        return zzd.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zzd() {
        return zze.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zze() {
        return zzf.zza().booleanValue();
    }
}
