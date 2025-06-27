package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrf {
    private final zzdt[] zza;
    private final zzrz zzb;
    private final zzdw zzc;

    public zzrf(zzdt... zzdtVarArr) {
        zzrz zzrzVar = new zzrz();
        zzdw zzdwVar = new zzdw();
        zzdt[] zzdtVarArr2 = {zzrzVar, zzdwVar};
        this.zza = zzdtVarArr2;
        System.arraycopy(zzdtVarArr, 0, zzdtVarArr2, 0, 0);
        this.zzb = zzrzVar;
        this.zzc = zzdwVar;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzcg zzc(zzcg zzcgVar) {
        this.zzc.zzk(zzcgVar.zzc);
        this.zzc.zzj(zzcgVar.zzd);
        return zzcgVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzdt[] zze() {
        return this.zza;
    }
}
