package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.RendererCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzye extends zzyt implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzyl zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzye(int i, zzcz zzczVar, int i2, zzyl zzylVar, int i3, boolean z, zzfws zzfwsVar, int i4) {
        int i5;
        int iZzc;
        int iZzc2;
        boolean z2;
        super(i, zzczVar, i2);
        this.zzh = zzylVar;
        int i6 = 1;
        int i7 = true != zzylVar.zzR ? 16 : 24;
        boolean z3 = zzylVar.zzN;
        this.zzg = zzyx.zzh(this.zzd.zzd);
        this.zzi = zzyx.zzo(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= zzylVar.zzq.size()) {
                iZzc = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc = zzyx.zzc(this.zzd, (String) zzylVar.zzq.get(i8), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzk = i8;
        this.zzj = iZzc;
        int i9 = this.zzd.zzf;
        int i10 = zzylVar.zzr;
        this.zzl = zzyx.zzb(i9, 0);
        zzam zzamVar = this.zzd;
        int i11 = zzamVar.zzf;
        this.zzm = i11 == 0 || (i11 & 1) != 0;
        this.zzp = 1 == (zzamVar.zze & 1);
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        if (zzamVar.zzi != -1) {
            int i12 = zzylVar.zzt;
        }
        if (zzamVar.zzz != -1) {
            int i13 = zzylVar.zzs;
        }
        this.zzf = zzfwsVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = zzfx.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = zzfx.zzD(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= strArrSplit.length) {
                iZzc2 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc2 = zzyx.zzc(this.zzd, strArrSplit[i15], false);
                if (iZzc2 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzn = i15;
        this.zzo = iZzc2;
        int i16 = 0;
        while (true) {
            if (i16 >= zzylVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzylVar.zzu.get(i16))) {
                i5 = i16;
                break;
            }
            i16++;
        }
        this.zzt = i5;
        this.zzu = (i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 128;
        this.zzv = (i3 & 64) == 64;
        zzyl zzylVar2 = this.zzh;
        if (zzyx.zzo(i3, zzylVar2.zzT) && ((z2 = this.zzf) || zzylVar2.zzM)) {
            zzde zzdeVar = zzylVar2.zzv;
            if (zzyx.zzo(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z4 = zzylVar2.zzC;
                boolean z5 = zzylVar2.zzB;
                if ((zzylVar2.zzV || !z) && (i7 & i3) != 0) {
                    i6 = 2;
                }
            }
        } else {
            i6 = 0;
        }
        this.zze = i6;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzye zzyeVar) {
        zzgay zzgayVarZza = (this.zzf && this.zzi) ? zzyx.zzb : zzyx.zzb.zza();
        zzfzc zzfzcVarZzd = zzfzc.zzk().zze(this.zzi, zzyeVar.zzi).zzd(Integer.valueOf(this.zzk), Integer.valueOf(zzyeVar.zzk), zzgay.zzc().zza()).zzb(this.zzj, zzyeVar.zzj).zzb(this.zzl, zzyeVar.zzl).zze(this.zzp, zzyeVar.zzp).zze(this.zzm, zzyeVar.zzm).zzd(Integer.valueOf(this.zzn), Integer.valueOf(zzyeVar.zzn), zzgay.zzc().zza()).zzb(this.zzo, zzyeVar.zzo).zze(this.zzf, zzyeVar.zzf).zzd(Integer.valueOf(this.zzt), Integer.valueOf(zzyeVar.zzt), zzgay.zzc().zza());
        boolean z = this.zzh.zzB;
        zzfzc zzfzcVarZzd2 = zzfzcVarZzd.zze(this.zzu, zzyeVar.zzu).zze(this.zzv, zzyeVar.zzv).zzd(Integer.valueOf(this.zzq), Integer.valueOf(zzyeVar.zzq), zzgayVarZza).zzd(Integer.valueOf(this.zzr), Integer.valueOf(zzyeVar.zzr), zzgayVarZza);
        if (zzfx.zzG(this.zzg, zzyeVar.zzg)) {
            zzfzcVarZzd2 = zzfzcVarZzd2.zzd(Integer.valueOf(this.zzs), Integer.valueOf(zzyeVar.zzs), zzgayVarZza);
        }
        return zzfzcVarZzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final /* bridge */ /* synthetic */ boolean zzc(zzyt zzytVar) {
        String str;
        zzye zzyeVar = (zzye) zzytVar;
        boolean z = this.zzh.zzP;
        zzam zzamVar = this.zzd;
        int i = zzamVar.zzz;
        if (i == -1) {
            return false;
        }
        zzam zzamVar2 = zzyeVar.zzd;
        if (i != zzamVar2.zzz || (str = zzamVar.zzm) == null || !TextUtils.equals(str, zzamVar2.zzm)) {
            return false;
        }
        zzyl zzylVar = this.zzh;
        boolean z2 = zzylVar.zzO;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzyeVar.zzd.zzA) {
            return false;
        }
        boolean z3 = zzylVar.zzQ;
        return this.zzu == zzyeVar.zzu && this.zzv == zzyeVar.zzv;
    }
}
