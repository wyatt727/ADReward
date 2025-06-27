package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgqu implements zzggh {
    private final zzgos zza;
    private final zzgrt zzb;
    private final zzgrt zzc;

    /* synthetic */ zzgqu(zzgos zzgosVar, zzgqt zzgqtVar) {
        zzgrt zzgrtVarZza;
        this.zza = zzgosVar;
        if (zzgosVar.zzg()) {
            zzgru zzgruVarZzb = zzgnp.zza().zzb();
            zzgrz zzgrzVarZza = zzgnh.zza(zzgosVar);
            this.zzb = zzgruVarZzb.zza(zzgrzVarZza, "mac", "compute");
            zzgrtVarZza = zzgruVarZzb.zza(zzgrzVarZza, "mac", "verify");
        } else {
            zzgrtVarZza = zzgnh.zza;
            this.zzb = zzgrtVarZza;
        }
        this.zzc = zzgrtVarZza;
    }
}
