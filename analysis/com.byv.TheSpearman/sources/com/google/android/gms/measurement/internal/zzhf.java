package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhf implements com.google.android.gms.internal.measurement.zzv {
    private final /* synthetic */ zzgz zza;

    zzhf(zzgz zzgzVar) {
        this.zza = zzgzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z, boolean z2) throws IllegalStateException {
        int i = zzhh.zza[zzsVar.ordinal()];
        zzgb zzgbVarZzn = i != 1 ? i != 2 ? i != 3 ? i != 4 ? this.zza.zzj().zzn() : this.zza.zzj().zzp() : z ? this.zza.zzj().zzw() : !z2 ? this.zza.zzj().zzv() : this.zza.zzj().zzu() : z ? this.zza.zzj().zzm() : !z2 ? this.zza.zzj().zzh() : this.zza.zzj().zzg() : this.zza.zzj().zzc();
        int size = list.size();
        if (size == 1) {
            zzgbVarZzn.zza(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgbVarZzn.zza(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgbVarZzn.zza(str);
        } else {
            zzgbVarZzn.zza(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
