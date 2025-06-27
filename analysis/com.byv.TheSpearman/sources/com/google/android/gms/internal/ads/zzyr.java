package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzyr extends zzyt implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzyr(int i, zzcz zzczVar, int i2, zzyl zzylVar, int i3, String str) {
        int iZzc;
        super(i, zzczVar, i2);
        int i4 = 0;
        this.zzf = zzyx.zzo(i3, false);
        int i5 = this.zzd.zze;
        int i6 = zzylVar.zzy;
        this.zzg = 1 == (i5 & 1);
        this.zzh = (i5 & 2) != 0;
        zzfzn zzfznVarZzn = zzylVar.zzw.isEmpty() ? zzfzn.zzn("") : zzylVar.zzw;
        int i7 = 0;
        while (true) {
            if (i7 >= zzfznVarZzn.size()) {
                i7 = Integer.MAX_VALUE;
                iZzc = 0;
                break;
            }
            zzam zzamVar = this.zzd;
            String str2 = (String) zzfznVarZzn.get(i7);
            boolean z = zzylVar.zzz;
            iZzc = zzyx.zzc(zzamVar, str2, false);
            if (iZzc > 0) {
                break;
            } else {
                i7++;
            }
        }
        this.zzi = i7;
        this.zzj = iZzc;
        int iZzb = zzyx.zzb(this.zzd.zzf, zzylVar.zzx);
        this.zzk = iZzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int iZzc2 = zzyx.zzc(this.zzd, str, zzyx.zzh(str) == null);
        this.zzl = iZzc2;
        boolean z2 = iZzc > 0 || (zzylVar.zzw.isEmpty() && iZzb > 0) || this.zzg || (this.zzh && iZzc2 > 0);
        if (zzyx.zzo(i3, zzylVar.zzT) && z2) {
            i4 = 1;
        }
        this.zze = i4;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyr zzyrVar) {
        zzfzc zzfzcVarZzb = zzfzc.zzk().zze(this.zzf, zzyrVar.zzf).zzd(Integer.valueOf(this.zzi), Integer.valueOf(zzyrVar.zzi), zzgay.zzc().zza()).zzb(this.zzj, zzyrVar.zzj).zzb(this.zzk, zzyrVar.zzk).zze(this.zzg, zzyrVar.zzg).zzd(Boolean.valueOf(this.zzh), Boolean.valueOf(zzyrVar.zzh), this.zzj == 0 ? zzgay.zzc() : zzgay.zzc().zza()).zzb(this.zzl, zzyrVar.zzl);
        if (this.zzk == 0) {
            zzfzcVarZzb = zzfzcVarZzb.zzf(this.zzm, zzyrVar.zzm);
        }
        return zzfzcVarZzb.zza();
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
