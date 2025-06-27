package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzog implements zzoh {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Boolean> zzb;
    private static final zzhh<Long> zzc;
    private static final zzhh<Boolean> zzd;

    static {
        zzhp zzhpVarZza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhpVarZza.zza("measurement.consent.stop_reset_on_storage_denied.client", false);
        zzb = zzhpVarZza.zza("measurement.consent.stop_reset_on_storage_denied.service", false);
        zzc = zzhpVarZza.zza("measurement.id.consent.stop_reset_on_storage_denied.service", 0L);
        zzd = zzhpVarZza.zza("measurement.consent.scrub_audience_data_analytics_consent", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzoh
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoh
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoh
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoh
    public final boolean zzd() {
        return zzd.zza().booleanValue();
    }
}
