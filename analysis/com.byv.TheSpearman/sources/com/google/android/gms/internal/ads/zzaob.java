package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaob implements zzano {
    private final String zza;
    private final int zzb;
    private final zzfo zzc;
    private final zzfn zzd;
    private zzaem zze;
    private String zzf;
    private zzam zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private String zzv;

    public zzaob(String str, int i) {
        this.zza = str;
        this.zzb = i;
        zzfo zzfoVar = new zzfo(1024);
        this.zzc = zzfoVar;
        byte[] bArrZzM = zzfoVar.zzM();
        this.zzd = new zzfn(bArrZzM, bArrZzM.length);
        this.zzl = -9223372036854775807L;
    }

    private final int zzf(zzfn zzfnVar) throws zzcc {
        int iZza = zzfnVar.zza();
        zzaca zzacaVarZzb = zzacb.zzb(zzfnVar, true);
        this.zzv = zzacaVarZzb.zzc;
        this.zzs = zzacaVarZzb.zza;
        this.zzu = zzacaVarZzb.zzb;
        return iZza - zzfnVar.zza();
    }

    private static long zzg(zzfn zzfnVar) {
        return zzfnVar.zzd((zzfnVar.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) throws zzcc {
        int i;
        int i2;
        int iZzd;
        boolean zZzo;
        zzek.zzb(this.zze);
        while (zzfoVar.zzb() > 0) {
            int i3 = this.zzh;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iZzm = zzfoVar.zzm();
                    if ((iZzm & 224) == 224) {
                        this.zzk = iZzm;
                        this.zzh = 2;
                    } else if (iZzm != 86) {
                        this.zzh = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(zzfoVar.zzb(), this.zzj - this.zzi);
                    zzfoVar.zzG(this.zzd.zza, this.zzi, iMin);
                    int i4 = this.zzi + iMin;
                    this.zzi = i4;
                    if (i4 == this.zzj) {
                        this.zzd.zzk(0);
                        zzfn zzfnVar = this.zzd;
                        if (zzfnVar.zzo()) {
                            if (this.zzm) {
                            }
                            this.zzh = 0;
                        } else {
                            this.zzm = true;
                            int iZzd2 = zzfnVar.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = zzfnVar.zzd(1);
                                i2 = 1;
                            } else {
                                i2 = iZzd2;
                                iZzd = 0;
                            }
                            this.zzn = iZzd;
                            if (iZzd != 0) {
                                throw zzcc.zza(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzfnVar);
                                i2 = 1;
                            }
                            if (!zzfnVar.zzo()) {
                                throw zzcc.zza(null, null);
                            }
                            this.zzo = zzfnVar.zzd(6);
                            int iZzd3 = zzfnVar.zzd(4);
                            int iZzd4 = zzfnVar.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw zzcc.zza(null, null);
                            }
                            if (i2 == 0) {
                                int iZzc = zzfnVar.zzc();
                                int iZzf = zzf(zzfnVar);
                                zzfnVar.zzk(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzfnVar.zzg(bArr, 0, iZzf);
                                zzak zzakVar = new zzak();
                                zzakVar.zzK(this.zzf);
                                zzakVar.zzW("audio/mp4a-latm");
                                zzakVar.zzz(this.zzv);
                                zzakVar.zzy(this.zzu);
                                zzakVar.zzX(this.zzs);
                                zzakVar.zzL(Collections.singletonList(bArr));
                                zzakVar.zzN(this.zza);
                                zzakVar.zzU(this.zzb);
                                zzam zzamVarZzac = zzakVar.zzac();
                                if (!zzamVarZzac.equals(this.zzg)) {
                                    this.zzg = zzamVarZzac;
                                    this.zzt = 1024000000 / zzamVarZzac.zzA;
                                    this.zze.zzl(zzamVarZzac);
                                }
                            } else {
                                zzfnVar.zzm(((int) zzg(zzfnVar)) - zzf(zzfnVar));
                            }
                            int iZzd5 = zzfnVar.zzd(3);
                            this.zzp = iZzd5;
                            if (iZzd5 == 0) {
                                zzfnVar.zzm(8);
                            } else if (iZzd5 == 1) {
                                zzfnVar.zzm(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                zzfnVar.zzm(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzfnVar.zzm(1);
                            }
                            boolean zZzo2 = zzfnVar.zzo();
                            this.zzq = zZzo2;
                            this.zzr = 0L;
                            if (zZzo2) {
                                if (i2 != 1) {
                                    do {
                                        zZzo = zzfnVar.zzo();
                                        this.zzr = (this.zzr << 8) + zzfnVar.zzd(8);
                                    } while (zZzo);
                                } else {
                                    this.zzr = zzg(zzfnVar);
                                }
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(8);
                            }
                        }
                        if (this.zzn != 0) {
                            throw zzcc.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzcc.zza(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzcc.zza(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iZzd6 = zzfnVar.zzd(8);
                            i = i5 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iZzc2 = zzfnVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzc.zzK(iZzc2 >> 3);
                        } else {
                            zzfnVar.zzg(this.zzc.zzM(), 0, i * 8);
                            this.zzc.zzK(0);
                        }
                        this.zze.zzq(this.zzc, i);
                        zzek.zzf(this.zzl != -9223372036854775807L);
                        this.zze.zzs(this.zzl, 1, i, 0, null);
                        this.zzl += this.zzt;
                        if (this.zzq) {
                            zzfnVar.zzm((int) this.zzr);
                        }
                        this.zzh = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzm2 = ((this.zzk & (-225)) << 8) | zzfoVar.zzm();
                    this.zzj = iZzm2;
                    zzfo zzfoVar2 = this.zzc;
                    if (iZzm2 > zzfoVar2.zzM().length) {
                        zzfoVar2.zzH(iZzm2);
                        zzfn zzfnVar2 = this.zzd;
                        byte[] bArrZzM = this.zzc.zzM();
                        zzfnVar2.zzj(bArrZzM, bArrZzM.length);
                    }
                    this.zzi = 0;
                    this.zzh = 3;
                }
            } else if (zzfoVar.zzm() == 86) {
                this.zzh = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zze = zzadiVar.zzw(zzapaVar.zza(), 1);
        this.zzf = zzapaVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = false;
    }
}
