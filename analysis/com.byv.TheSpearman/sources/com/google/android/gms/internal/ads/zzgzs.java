package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgzs implements zzgzj {
    final zzhaa zza;
    final int zzb;
    final zzhdn zzc;
    final boolean zzd;
    final boolean zze;

    zzgzs(zzhaa zzhaaVar, int i, zzhdn zzhdnVar, boolean z, boolean z2) {
        this.zza = zzhaaVar;
        this.zzb = i;
        this.zzc = zzhdnVar;
        this.zzd = z;
        this.zze = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzb - ((zzgzs) obj).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final zzhbk zzb(zzhbk zzhbkVar, zzhbl zzhblVar) {
        ((zzgzp) zzhbkVar).zzbj((zzgzv) zzhblVar);
        return zzhbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final zzhbq zzc(zzhbq zzhbqVar, zzhbq zzhbqVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final zzhdn zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final zzhdo zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final boolean zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final boolean zzg() {
        return this.zzd;
    }
}
