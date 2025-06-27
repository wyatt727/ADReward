package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajo {
    public final zzaem zza;
    public zzake zzd;
    public zzajk zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzakd zzb = new zzakd();
    public final zzfo zzc = new zzfo();
    private final zzfo zzj = new zzfo(1);
    private final zzfo zzk = new zzfo();

    public zzajo(zzaem zzaemVar, zzake zzakeVar, zzajk zzajkVar) {
        this.zza = zzaemVar;
        this.zzd = zzakeVar;
        this.zze = zzajkVar;
        zzh(zzakeVar, zzajkVar);
    }

    public final int zza() {
        int i = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzfo zzfoVar;
        zzakc zzakcVarZzf = zzf();
        if (zzakcVarZzf == null) {
            return 0;
        }
        int i3 = zzakcVarZzf.zzd;
        if (i3 != 0) {
            zzfoVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzakcVarZzf.zze;
            int i4 = zzfx.zza;
            zzfo zzfoVar2 = this.zzk;
            int length = bArr.length;
            zzfoVar2.zzI(bArr, length);
            zzfoVar = this.zzk;
            i3 = length;
        }
        boolean zZzb = this.zzb.zzb(this.zzf);
        boolean z = zZzb || i2 != 0;
        zzfo zzfoVar3 = this.zzj;
        zzfoVar3.zzM()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzfoVar3.zzK(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfoVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzb) {
            this.zzc.zzH(8);
            zzfo zzfoVar4 = this.zzc;
            byte[] bArrZzM = zzfoVar4.zzM();
            bArrZzM[0] = 0;
            bArrZzM[1] = 1;
            bArrZzM[2] = 0;
            bArrZzM[3] = (byte) i2;
            bArrZzM[4] = (byte) ((i >> 24) & 255);
            bArrZzM[5] = (byte) ((i >> 16) & 255);
            bArrZzM[6] = (byte) ((i >> 8) & 255);
            bArrZzM[7] = (byte) (i & 255);
            this.zza.zzr(zzfoVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        zzfo zzfoVar5 = this.zzb.zzn;
        int iZzq = zzfoVar5.zzq();
        zzfoVar5.zzL(-2);
        int i6 = (iZzq * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzH(i6);
            byte[] bArrZzM2 = this.zzc.zzM();
            zzfoVar5.zzG(bArrZzM2, 0, i6);
            int i7 = (((bArrZzM2[2] & 255) << 8) | (bArrZzM2[3] & 255)) + i2;
            bArrZzM2[2] = (byte) ((i7 >> 8) & 255);
            bArrZzM2[3] = (byte) (i7 & 255);
            zzfoVar5 = this.zzc;
        }
        this.zza.zzr(zzfoVar5, i6, 1);
        return i5 + i6;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzakd zzakdVar = this.zzb;
        return zzakdVar.zzi[this.zzf];
    }

    public final zzakc zzf() {
        if (!this.zzl) {
            return null;
        }
        zzajk zzajkVar = this.zzb.zza;
        int i = zzfx.zza;
        int i2 = zzajkVar.zza;
        zzakc zzakcVarZza = this.zzb.zzm;
        if (zzakcVarZza == null) {
            zzakcVarZza = this.zzd.zza.zza(i2);
        }
        if (zzakcVarZza == null || !zzakcVarZza.zza) {
            return null;
        }
        return zzakcVarZza;
    }

    public final void zzh(zzake zzakeVar, zzajk zzajkVar) {
        this.zzd = zzakeVar;
        this.zze = zzajkVar;
        this.zza.zzl(zzakeVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzakd zzakdVar = this.zzb;
        zzakdVar.zzd = 0;
        zzakdVar.zzp = 0L;
        zzakdVar.zzq = false;
        zzakdVar.zzk = false;
        zzakdVar.zzo = false;
        zzakdVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
