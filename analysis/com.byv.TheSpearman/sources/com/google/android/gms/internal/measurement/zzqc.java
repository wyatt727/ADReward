package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzqc implements zzqd {
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
    private static final zzhh<Boolean> zzk;
    private static final zzhh<Boolean> zzl;
    private static final zzhh<Boolean> zzm;
    private static final zzhh<Boolean> zzn;

    static {
        zzhp zzhpVarZza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhpVarZza.zza("measurement.redaction.app_instance_id", true);
        zzb = zzhpVarZza.zza("measurement.redaction.client_ephemeral_aiid_generation", true);
        zzc = zzhpVarZza.zza("measurement.redaction.config_redacted_fields", true);
        zzd = zzhpVarZza.zza("measurement.redaction.device_info", true);
        zze = zzhpVarZza.zza("measurement.redaction.e_tag", true);
        zzf = zzhpVarZza.zza("measurement.redaction.enhanced_uid", true);
        zzg = zzhpVarZza.zza("measurement.redaction.populate_ephemeral_app_instance_id", true);
        zzh = zzhpVarZza.zza("measurement.redaction.google_signals", true);
        zzi = zzhpVarZza.zza("measurement.redaction.no_aiid_in_config_request", true);
        zzj = zzhpVarZza.zza("measurement.redaction.retain_major_os_version", true);
        zzk = zzhpVarZza.zza("measurement.redaction.scion_payload_generator", true);
        zzl = zzhpVarZza.zza("measurement.redaction.upload_redacted_fields", true);
        zzm = zzhpVarZza.zza("measurement.redaction.upload_subdomain_override", true);
        zzn = zzhpVarZza.zza("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqd
    public final boolean zza() {
        return zzj.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqd
    public final boolean zzb() {
        return zzk.zza().booleanValue();
    }
}
