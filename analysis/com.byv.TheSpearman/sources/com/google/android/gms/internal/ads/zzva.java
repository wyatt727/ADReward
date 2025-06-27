package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzva extends zzuv {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzva(zzcx zzcxVar, Object obj, Object obj2) {
        super(zzcxVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzva zzq(zzbp zzbpVar) {
        return new zzva(new zzvb(zzbpVar), zzcw.zza, zzd);
    }

    public static zzva zzr(zzcx zzcxVar, Object obj, Object obj2) {
        return new zzva(zzcxVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzcx
    public final int zza(Object obj) {
        Object obj2;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return this.zzc.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzcx
    public final zzcu zzd(int i, zzcu zzcuVar, boolean z) {
        this.zzc.zzd(i, zzcuVar, z);
        if (zzfx.zzG(zzcuVar.zzc, this.zzf) && z) {
            zzcuVar.zzc = zzd;
        }
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzcx
    public final zzcw zze(int i, zzcw zzcwVar, long j) {
        this.zzc.zze(i, zzcwVar, j);
        if (zzfx.zzG(zzcwVar.zzc, this.zze)) {
            zzcwVar.zzc = zzcw.zza;
        }
        return zzcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzcx
    public final Object zzf(int i) {
        Object objZzf = this.zzc.zzf(i);
        return zzfx.zzG(objZzf, this.zzf) ? zzd : objZzf;
    }

    public final zzva zzp(zzcx zzcxVar) {
        return new zzva(zzcxVar, this.zze, this.zzf);
    }
}
