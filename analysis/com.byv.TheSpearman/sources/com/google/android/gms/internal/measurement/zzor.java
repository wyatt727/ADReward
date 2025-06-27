package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzor implements zzoo {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Boolean> zzc;
    private static final zzhh<Boolean> zzd;
    private static final zzhh<Boolean> zze;
    private static final zzhh<Boolean> zzf;
    private static final zzhh<Boolean> zzg;
    private static final zzhh<Boolean> zzh;
    private static final zzhh<Boolean> zzi;
    private static final zzhh<Boolean> zzj;
    private static final zzhh<Long> zzk;

    static {
        zzhp zzhpVarZza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhpVarZza.zza("measurement.dma_consent.client", true);
        zzb = zzhpVarZza.zza("measurement.dma_consent.client_bow_check2", true);
        zzc = zzhpVarZza.zza("measurement.dma_consent.separate_service_calls_fix", false);
        zzd = zzhpVarZza.zza("measurement.dma_consent.service", true);
        zze = zzhpVarZza.zza("measurement.dma_consent.service_database_update_fix", true);
        zzf = zzhpVarZza.zza("measurement.dma_consent.service_dcu_event", true);
        zzg = zzhpVarZza.zza("measurement.dma_consent.service_dcu_event2", true);
        zzh = zzhpVarZza.zza("measurement.dma_consent.service_npa_remote_default", true);
        zzi = zzhpVarZza.zza("measurement.dma_consent.service_split_batch_on_consent", true);
        zzj = zzhpVarZza.zza("measurement.dma_consent.set_consent_inline_on_worker", false);
        zzk = zzhpVarZza.zza("measurement.id.dma_consent.separate_service_calls_fix", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zza() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zzb() {
        return zze.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zzc() {
        return zzg.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zzd() {
        return zzj.zza().booleanValue();
    }
}
