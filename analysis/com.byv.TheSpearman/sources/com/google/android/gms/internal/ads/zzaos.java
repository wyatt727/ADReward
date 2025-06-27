package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaos {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfv zza = new zzfv(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfo zzb = new zzfo();

    zzaos(int i) {
    }

    private final int zze(zzadg zzadgVar) {
        byte[] bArr = zzfx.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzadgVar.zzj();
        return 0;
    }

    public final int zza(zzadg zzadgVar, zzaec zzaecVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzadgVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzadgVar.zzd();
            int iMin = (int) Math.min(112800L, jZzd);
            long j2 = jZzd - iMin;
            if (zzadgVar.zzf() == j2) {
                this.zzb.zzH(iMin);
                zzadgVar.zzj();
                ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, iMin, false);
                zzfo zzfoVar = this.zzb;
                int iZzd = zzfoVar.zzd();
                int iZze = zzfoVar.zze();
                int i2 = iZze - 188;
                while (true) {
                    if (i2 < iZzd) {
                        break;
                    }
                    byte[] bArrZzM = zzfoVar.zzM();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < iZzd || i5 >= iZze || bArrZzM[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long jZzb = zzapc.zzb(zzfoVar, i2, i);
                                if (jZzb != -9223372036854775807L) {
                                    j = jZzb;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzaecVar.zza = j2;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzadgVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzadgVar);
                    return 0;
                }
                zzfv zzfvVar = this.zza;
                this.zzh = zzfvVar.zzc(this.zzg) - zzfvVar.zzb(j3);
                zze(zzadgVar);
                return 0;
            }
            int iMin2 = (int) Math.min(112800L, zzadgVar.zzd());
            if (zzadgVar.zzf() == 0) {
                this.zzb.zzH(iMin2);
                zzadgVar.zzj();
                ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, iMin2, false);
                zzfo zzfoVar2 = this.zzb;
                int iZzd2 = zzfoVar2.zzd();
                int iZze2 = zzfoVar2.zze();
                while (true) {
                    if (iZzd2 >= iZze2) {
                        break;
                    }
                    if (zzfoVar2.zzM()[iZzd2] == 71) {
                        long jZzb2 = zzapc.zzb(zzfoVar2, iZzd2, i);
                        if (jZzb2 != -9223372036854775807L) {
                            j = jZzb2;
                            break;
                        }
                    }
                    iZzd2++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzaecVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfv zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
