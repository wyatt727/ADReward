package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzyw extends zzyt {
    private final boolean zze;
    private final zzyl zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzyw(int r5, com.google.android.gms.internal.ads.zzcz r6, int r7, com.google.android.gms.internal.ads.zzyl r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyw.<init>(int, com.google.android.gms.internal.ads.zzcz, int, com.google.android.gms.internal.ads.zzyl, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzyw zzywVar, zzyw zzywVar2) {
        zzgay zzgayVarZza = (zzywVar.zze && zzywVar.zzh) ? zzyx.zzb : zzyx.zzb.zza();
        zzfzc zzfzcVarZzk = zzfzc.zzk();
        boolean z = zzywVar.zzf.zzB;
        return zzfzcVarZzk.zzd(Integer.valueOf(zzywVar.zzk), Integer.valueOf(zzywVar2.zzk), zzgayVarZza).zzd(Integer.valueOf(zzywVar.zzj), Integer.valueOf(zzywVar2.zzj), zzgayVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzyw zzywVar, zzyw zzywVar2) {
        zzfzc zzfzcVarZzd = zzfzc.zzk().zze(zzywVar.zzh, zzywVar2.zzh).zzb(zzywVar.zzm, zzywVar2.zzm).zze(zzywVar.zzn, zzywVar2.zzn).zze(zzywVar.zzi, zzywVar2.zzi).zze(zzywVar.zze, zzywVar2.zze).zze(zzywVar.zzg, zzywVar2.zzg).zzd(Integer.valueOf(zzywVar.zzl), Integer.valueOf(zzywVar2.zzl), zzgay.zzc().zza());
        boolean z = zzywVar.zzp;
        zzfzc zzfzcVarZze = zzfzcVarZzd.zze(z, zzywVar2.zzp);
        boolean z2 = zzywVar.zzq;
        zzfzc zzfzcVarZze2 = zzfzcVarZze.zze(z2, zzywVar2.zzq);
        if (z && z2) {
            zzfzcVarZze2 = zzfzcVarZze2.zzb(zzywVar.zzr, zzywVar2.zzr);
        }
        return zzfzcVarZze2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final /* bridge */ /* synthetic */ boolean zzc(zzyt zzytVar) {
        zzyw zzywVar = (zzyw) zzytVar;
        if (!zzfx.zzG(this.zzd.zzm, zzywVar.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzL;
        return this.zzp == zzywVar.zzp && this.zzq == zzywVar.zzq;
    }
}
