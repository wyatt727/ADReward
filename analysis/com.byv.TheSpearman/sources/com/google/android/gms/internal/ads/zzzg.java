package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzzg {
    public final int zza;
    public final zzmi[] zzb;
    public final zzyz[] zzc;
    public final zzdk zzd;
    public final Object zze;

    public zzzg(zzmi[] zzmiVarArr, zzyz[] zzyzVarArr, zzdk zzdkVar, Object obj) {
        this.zzb = zzmiVarArr;
        this.zzc = (zzyz[]) zzyzVarArr.clone();
        this.zzd = zzdkVar;
        this.zze = obj;
        this.zza = zzmiVarArr.length;
    }

    public final boolean zza(zzzg zzzgVar, int i) {
        return zzzgVar != null && zzfx.zzG(this.zzb[i], zzzgVar.zzb[i]) && zzfx.zzG(this.zzc[i], zzzgVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
