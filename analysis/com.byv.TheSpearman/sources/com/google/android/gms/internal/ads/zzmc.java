package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzmc extends zzuv {
    private final zzcw zzd;

    zzmc(zzmd zzmdVar, zzcx zzcxVar) {
        super(zzcxVar);
        this.zzd = new zzcw();
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzcx
    public final zzcu zzd(int i, zzcu zzcuVar, boolean z) {
        zzcu zzcuVarZzd = this.zzc.zzd(i, zzcuVar, z);
        if (this.zzc.zze(zzcuVarZzd.zzd, this.zzd, 0L).zzb()) {
            Object obj = zzcuVar.zzb;
            Object obj2 = zzcuVar.zzc;
            int i2 = zzcuVar.zzd;
            long j = zzcuVar.zze;
            long j2 = zzcuVar.zzf;
            zzcuVarZzd.zzl(obj, obj2, i2, j, 0L, zzd.zza, true);
        } else {
            zzcuVarZzd.zzg = true;
        }
        return zzcuVarZzd;
    }
}
