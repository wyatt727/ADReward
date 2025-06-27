package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzyf extends zzyt implements Comparable {
    private final int zze;
    private final int zzf;

    public zzyf(int i, zzcz zzczVar, int i2, zzyl zzylVar, int i3) {
        super(i, zzczVar, i2);
        this.zze = zzyx.zzo(i3, zzylVar.zzT) ? 1 : 0;
        this.zzf = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyf zzyfVar) {
        return Integer.compare(this.zzf, zzyfVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final /* bridge */ /* synthetic */ boolean zzc(zzyt zzytVar) {
        return false;
    }
}
