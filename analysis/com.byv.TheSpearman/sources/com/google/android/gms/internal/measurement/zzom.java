package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzom implements zzon {
    private static final zzhh<Boolean> zza;
    private static final zzhh<Long> zzb;

    static {
        zzhp zzhpVarZza = new zzhp(zzhi.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhpVarZza.zza("measurement.disable_npa_for_dasher_and_unicorn", false);
        zzb = zzhpVarZza.zza("measurement.id.disable_npa_for_dasher_and_unicorn.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
