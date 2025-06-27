package com.google.android.gms.internal.ads;

import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzam {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    private int zzao;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzby zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzae zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzt zzy;
    public final int zzz;
    private static final zzam zzH = new zzam(new zzak());
    private static final String zzI = Integer.toString(0, 36);
    private static final String zzJ = Integer.toString(1, 36);
    private static final String zzK = Integer.toString(2, 36);
    private static final String zzL = Integer.toString(3, 36);
    private static final String zzM = Integer.toString(4, 36);
    private static final String zzN = Integer.toString(5, 36);
    private static final String zzO = Integer.toString(6, 36);
    private static final String zzP = Integer.toString(7, 36);
    private static final String zzQ = Integer.toString(8, 36);
    private static final String zzR = Integer.toString(9, 36);
    private static final String zzS = Integer.toString(10, 36);
    private static final String zzT = Integer.toString(11, 36);
    private static final String zzU = Integer.toString(12, 36);
    private static final String zzV = Integer.toString(13, 36);
    private static final String zzW = Integer.toString(14, 36);
    private static final String zzX = Integer.toString(15, 36);
    private static final String zzY = Integer.toString(16, 36);
    private static final String zzZ = Integer.toString(17, 36);
    private static final String zzaa = Integer.toString(18, 36);
    private static final String zzab = Integer.toString(19, 36);
    private static final String zzac = Integer.toString(20, 36);
    private static final String zzad = Integer.toString(21, 36);
    private static final String zzae = Integer.toString(22, 36);
    private static final String zzaf = Integer.toString(23, 36);
    private static final String zzag = Integer.toString(24, 36);
    private static final String zzah = Integer.toString(25, 36);
    private static final String zzai = Integer.toString(26, 36);
    private static final String zzaj = Integer.toString(27, 36);
    private static final String zzak = Integer.toString(28, 36);
    private static final String zzal = Integer.toString(29, 36);
    private static final String zzam = Integer.toString(30, 36);
    private static final String zzan = Integer.toString(31, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzai
    };

    private zzam(zzak zzakVar) {
        this.zzb = zzakVar.zza;
        this.zzc = zzakVar.zzb;
        this.zzd = zzfx.zzD(zzakVar.zzc);
        this.zze = zzakVar.zzd;
        this.zzf = zzakVar.zze;
        int i = zzakVar.zzf;
        this.zzg = i;
        int i2 = zzakVar.zzg;
        this.zzh = i2;
        this.zzi = i2 != -1 ? i2 : i;
        this.zzj = zzakVar.zzh;
        this.zzk = zzakVar.zzi;
        this.zzl = zzakVar.zzj;
        this.zzm = zzakVar.zzk;
        this.zzn = zzakVar.zzl;
        this.zzo = zzakVar.zzm == null ? Collections.emptyList() : zzakVar.zzm;
        zzae zzaeVar = zzakVar.zzn;
        this.zzp = zzaeVar;
        this.zzq = zzakVar.zzo;
        this.zzr = zzakVar.zzp;
        this.zzs = zzakVar.zzq;
        this.zzt = zzakVar.zzr;
        this.zzu = zzakVar.zzs == -1 ? 0 : zzakVar.zzs;
        this.zzv = zzakVar.zzt == -1.0f ? 1.0f : zzakVar.zzt;
        this.zzw = zzakVar.zzu;
        this.zzx = zzakVar.zzv;
        this.zzy = zzakVar.zzw;
        this.zzz = zzakVar.zzx;
        this.zzA = zzakVar.zzy;
        this.zzB = zzakVar.zzz;
        this.zzC = zzakVar.zzA == -1 ? 0 : zzakVar.zzA;
        this.zzD = zzakVar.zzB != -1 ? zzakVar.zzB : 0;
        this.zzE = zzakVar.zzC;
        this.zzF = zzakVar.zzD;
        this.zzG = (zzakVar.zzE != 0 || zzaeVar == null) ? zzakVar.zzE : 1;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzam zzamVar = (zzam) obj;
            int i2 = this.zzao;
            if ((i2 == 0 || (i = zzamVar.zzao) == 0 || i2 == i) && this.zze == zzamVar.zze && this.zzf == zzamVar.zzf && this.zzg == zzamVar.zzg && this.zzh == zzamVar.zzh && this.zzn == zzamVar.zzn && this.zzq == zzamVar.zzq && this.zzr == zzamVar.zzr && this.zzs == zzamVar.zzs && this.zzu == zzamVar.zzu && this.zzx == zzamVar.zzx && this.zzz == zzamVar.zzz && this.zzA == zzamVar.zzA && this.zzB == zzamVar.zzB && this.zzC == zzamVar.zzC && this.zzD == zzamVar.zzD && this.zzE == zzamVar.zzE && this.zzG == zzamVar.zzG && Float.compare(this.zzt, zzamVar.zzt) == 0 && Float.compare(this.zzv, zzamVar.zzv) == 0 && zzfx.zzG(this.zzb, zzamVar.zzb) && zzfx.zzG(this.zzc, zzamVar.zzc) && zzfx.zzG(this.zzj, zzamVar.zzj) && zzfx.zzG(this.zzl, zzamVar.zzl) && zzfx.zzG(this.zzm, zzamVar.zzm) && zzfx.zzG(this.zzd, zzamVar.zzd) && Arrays.equals(this.zzw, zzamVar.zzw) && zzfx.zzG(this.zzk, zzamVar.zzk) && zzfx.zzG(this.zzy, zzamVar.zzy) && zzfx.zzG(this.zzp, zzamVar.zzp) && zzd(zzamVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzl + ", " + this.zzm + ", " + this.zzj + ", " + this.zzi + ", " + this.zzd + ", [" + this.zzr + ", " + this.zzs + ", " + this.zzt + ", " + String.valueOf(this.zzy) + "], [" + this.zzz + ", " + this.zzA + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzak zzb() {
        return new zzak(this, null);
    }

    public final zzam zzc(int i) {
        zzak zzakVar = new zzak(this, null);
        zzakVar.zzC(i);
        return new zzam(zzakVar);
    }

    public final boolean zzd(zzam zzamVar) {
        if (this.zzo.size() != zzamVar.zzo.size()) {
            return false;
        }
        for (int i = 0; i < this.zzo.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzamVar.zzo.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.zzao;
        if (i != 0) {
            return i;
        }
        String str = this.zzb;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str3 = this.zzd;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int i3 = (i2 * 31) + iHashCode2;
        int i4 = this.zze;
        int i5 = this.zzf;
        int i6 = this.zzg;
        int i7 = this.zzh;
        String str4 = this.zzj;
        int iHashCode4 = ((((((((((((i3 * 31) + iHashCode3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzby zzbyVar = this.zzk;
        int iHashCode5 = (iHashCode4 + (zzbyVar == null ? 0 : zzbyVar.hashCode())) * 31;
        String str5 = this.zzl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((iHashCode6 + (this.zzm != null ? r2.hashCode() : 0)) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) - 1) * 31) - 1) * 31) + this.zzG;
        this.zzao = iHashCode7;
        return iHashCode7;
    }
}
