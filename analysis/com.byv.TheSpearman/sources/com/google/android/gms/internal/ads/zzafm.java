package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzafm implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzafl
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzafm.zza;
            return new zzadf[]{new zzafm(0)};
        }
    };
    private final byte[] zzb;
    private final zzfo zzc;
    private final zzadn zzd;
    private zzadi zze;
    private zzaem zzf;
    private int zzg;
    private zzby zzh;
    private zzads zzi;
    private int zzj;
    private int zzk;
    private zzafk zzl;
    private int zzm;
    private long zzn;

    public zzafm() {
        this(0);
    }

    private final long zza(zzfo zzfoVar, boolean z) {
        boolean zZzc;
        Objects.requireNonNull(this.zzi);
        int iZzd = zzfoVar.zzd();
        while (iZzd <= zzfoVar.zze() - 16) {
            zzfoVar.zzK(iZzd);
            if (zzado.zzc(zzfoVar, this.zzi, this.zzk, this.zzd)) {
                zzfoVar.zzK(iZzd);
                return this.zzd.zza;
            }
            iZzd++;
        }
        if (!z) {
            zzfoVar.zzK(iZzd);
            return -1L;
        }
        while (iZzd <= zzfoVar.zze() - this.zzj) {
            zzfoVar.zzK(iZzd);
            try {
                zZzc = zzado.zzc(zzfoVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzfoVar.zzd() <= zzfoVar.zze() && zZzc) {
                zzfoVar.zzK(iZzd);
                return this.zzd.zza;
            }
            iZzd++;
        }
        zzfoVar.zzK(zzfoVar.zze());
        return -1L;
    }

    private final void zzg() {
        long j = this.zzn * 1000000;
        zzads zzadsVar = this.zzi;
        int i = zzfx.zza;
        this.zzf.zzs(j / zzadsVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zze = zzadiVar;
        this.zzf = zzadiVar.zzw(0, 1);
        zzadiVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzadp.zza(zzadgVar, false);
        zzfo zzfoVar = new zzfo(4);
        ((zzact) zzadgVar).zzm(zzfoVar.zzM(), 0, 4, false);
        return zzfoVar.zzu() == 1716281667;
    }

    public zzafm(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzfo(new byte[32768], 0);
        this.zzd = new zzadn();
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzafk zzafkVar = this.zzl;
            if (zzafkVar != null) {
                zzafkVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzH(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        boolean zZzo;
        zzaef zzaeeVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzadgVar.zzj();
            long jZze = zzadgVar.zze();
            zzby zzbyVarZza = zzadp.zza(zzadgVar, true);
            ((zzact) zzadgVar).zzo((int) (zzadgVar.zze() - jZze), false);
            this.zzh = zzbyVarZza;
            this.zzg = 1;
            return 0;
        }
        if (i == 1) {
            ((zzact) zzadgVar).zzm(this.zzb, 0, 42, false);
            zzadgVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i == 2) {
            zzfo zzfoVar = new zzfo(4);
            ((zzact) zzadgVar).zzn(zzfoVar.zzM(), 0, 4, false);
            if (zzfoVar.zzu() != 1716281667) {
                throw zzcc.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i == 3) {
            zzads zzadsVarZze = this.zzi;
            do {
                zzadgVar.zzj();
                zzfn zzfnVar = new zzfn(new byte[4], 4);
                zzact zzactVar = (zzact) zzadgVar;
                zzactVar.zzm(zzfnVar.zza, 0, 4, false);
                zZzo = zzfnVar.zzo();
                int iZzd = zzfnVar.zzd(7);
                int iZzd2 = zzfnVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzactVar.zzn(bArr, 0, 38, false);
                    zzadsVarZze = new zzads(bArr, 4);
                } else {
                    if (zzadsVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzfo zzfoVar2 = new zzfo(iZzd2);
                        zzactVar.zzn(zzfoVar2.zzM(), 0, iZzd2, false);
                        zzadsVarZze = zzadsVarZze.zzf(zzadp.zzb(zzfoVar2));
                    } else if (iZzd == 4) {
                        zzfo zzfoVar3 = new zzfo(iZzd2);
                        zzactVar.zzn(zzfoVar3.zzM(), 0, iZzd2, false);
                        zzfoVar3.zzL(4);
                        zzadsVarZze = zzadsVarZze.zzg(Arrays.asList(zzaes.zzc(zzfoVar3, false, false).zzb));
                    } else if (iZzd == 6) {
                        zzfo zzfoVar4 = new zzfo(iZzd2);
                        zzactVar.zzn(zzfoVar4.zzM(), 0, iZzd2, false);
                        zzfoVar4.zzL(4);
                        zzadsVarZze = zzadsVarZze.zze(zzfzn.zzn(zzagi.zzb(zzfoVar4)));
                    } else {
                        zzactVar.zzo(iZzd2, false);
                    }
                }
                int i2 = zzfx.zza;
                this.zzi = zzadsVarZze;
            } while (!zZzo);
            Objects.requireNonNull(zzadsVarZze);
            this.zzj = Math.max(zzadsVarZze.zzc, 6);
            this.zzf.zzl(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i == 4) {
            zzadgVar.zzj();
            zzfo zzfoVar5 = new zzfo(2);
            ((zzact) zzadgVar).zzm(zzfoVar5.zzM(), 0, 2, false);
            int iZzq = zzfoVar5.zzq();
            if ((iZzq >> 2) != 16382) {
                zzadgVar.zzj();
                throw zzcc.zza("First frame does not start with sync code.", null);
            }
            zzadgVar.zzj();
            this.zzk = iZzq;
            zzadi zzadiVar = this.zze;
            int i3 = zzfx.zza;
            long jZzf = zzadgVar.zzf();
            long jZzd = zzadgVar.zzd();
            zzads zzadsVar = this.zzi;
            Objects.requireNonNull(zzadsVar);
            if (zzadsVar.zzk != null) {
                zzaeeVar = new zzadq(zzadsVar, jZzf);
            } else if (jZzd == -1 || zzadsVar.zzj <= 0) {
                zzaeeVar = new zzaee(zzadsVar.zza(), 0L);
            } else {
                zzafk zzafkVar = new zzafk(zzadsVar, this.zzk, jZzf, jZzd);
                this.zzl = zzafkVar;
                zzaeeVar = zzafkVar.zzb();
            }
            zzadiVar.zzO(zzaeeVar);
            this.zzg = 5;
            return 0;
        }
        Objects.requireNonNull(this.zzf);
        zzads zzadsVar2 = this.zzi;
        Objects.requireNonNull(zzadsVar2);
        zzafk zzafkVar2 = this.zzl;
        if (zzafkVar2 != null && zzafkVar2.zze()) {
            return zzafkVar2.zza(zzadgVar, zzaecVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzado.zzb(zzadgVar, zzadsVar2);
            return 0;
        }
        zzfo zzfoVar6 = this.zzc;
        int iZze = zzfoVar6.zze();
        if (iZze < 32768) {
            int iZza = zzadgVar.zza(zzfoVar6.zzM(), iZze, 32768 - iZze);
            z = iZza == -1;
            if (!z) {
                this.zzc.zzJ(iZze + iZza);
            } else if (this.zzc.zzb() == 0) {
                zzg();
                return -1;
            }
        } else {
            z = false;
        }
        zzfo zzfoVar7 = this.zzc;
        int iZzd3 = zzfoVar7.zzd();
        int i4 = this.zzm;
        int i5 = this.zzj;
        if (i4 < i5) {
            zzfoVar7.zzL(Math.min(i5 - i4, zzfoVar7.zzb()));
        }
        long jZza = zza(this.zzc, z);
        zzfo zzfoVar8 = this.zzc;
        int iZzd4 = zzfoVar8.zzd() - iZzd3;
        zzfoVar8.zzK(iZzd3);
        zzaek.zzb(this.zzf, this.zzc, iZzd4);
        this.zzm += iZzd4;
        if (jZza != -1) {
            zzg();
            this.zzm = 0;
            this.zzn = jZza;
        }
        zzfo zzfoVar9 = this.zzc;
        if (zzfoVar9.zzb() >= 16) {
            return 0;
        }
        int iZzb = zzfoVar9.zzb();
        System.arraycopy(zzfoVar9.zzM(), zzfoVar9.zzd(), zzfoVar9.zzM(), 0, iZzb);
        this.zzc.zzK(0);
        this.zzc.zzJ(iZzb);
        return 0;
    }
}
