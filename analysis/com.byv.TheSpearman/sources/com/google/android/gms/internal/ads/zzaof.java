package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaof implements zzapb {
    private final zzano zza;
    private final zzfn zzb = new zzfn(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfv zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaof(zzano zzanoVar) {
        this.zza = zzanoVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzfo zzfoVar, byte[] bArr, int i) {
        int iMin = Math.min(zzfoVar.zzb(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfoVar.zzL(iMin);
        } else {
            zzfoVar.zzG(bArr, this.zzd, iMin);
        }
        int i2 = this.zzd + iMin;
        this.zzd = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.google.android.gms.internal.ads.zzfn] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.google.android.gms.internal.ads.zzano] */
    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfo zzfoVar, int i) throws zzcc {
        int i2;
        boolean z;
        int i3;
        int i4;
        long jZzb;
        int i5;
        zzek.zzb(this.zze);
        int i6 = -1;
        int i7 = 2;
        ?? r6 = 0;
        int i8 = 1;
        if ((i & 1) != 0) {
            int i9 = this.zzc;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    int i10 = this.zzj;
                    if (i10 != -1) {
                        zzfe.zzf("PesReader", "Unexpected start indicator: expected " + i10 + " more bytes");
                    }
                    this.zza.zzc(zzfoVar.zze() == 0);
                } else {
                    zzfe.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i11 = i;
        while (zzfoVar.zzb() > 0) {
            int i12 = this.zzc;
            if (i12 == 0) {
                i2 = i7;
                z = r6;
                i3 = i8;
                zzfoVar.zzL(zzfoVar.zzb());
            } else if (i12 != i8) {
                if (i12 != i7) {
                    int iZzb = zzfoVar.zzb();
                    int i13 = this.zzj;
                    int i14 = i13 == i6 ? r6 : iZzb - i13;
                    if (i14 > 0) {
                        iZzb -= i14;
                        zzfoVar.zzJ(zzfoVar.zzd() + iZzb);
                    }
                    this.zza.zza(zzfoVar);
                    int i15 = this.zzj;
                    if (i15 != i6) {
                        int i16 = i15 - iZzb;
                        this.zzj = i16;
                        if (i16 == 0) {
                            this.zza.zzc(r6);
                            zzd(i8);
                        }
                    }
                } else {
                    if (zze(zzfoVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfoVar, null, this.zzi)) {
                        this.zzb.zzk(r6);
                        if (this.zzf) {
                            this.zzb.zzm(4);
                            long jZzd = this.zzb.zzd(3);
                            this.zzb.zzm(i8);
                            int iZzd = this.zzb.zzd(15) << 15;
                            this.zzb.zzm(i8);
                            long jZzd2 = this.zzb.zzd(15);
                            this.zzb.zzm(i8);
                            if (this.zzh || !this.zzg) {
                                i5 = iZzd;
                            } else {
                                this.zzb.zzm(4);
                                this.zzb.zzm(i8);
                                int iZzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzm(i8);
                                long jZzd3 = this.zzb.zzd(15);
                                this.zzb.zzm(i8);
                                i5 = iZzd;
                                this.zze.zzb((this.zzb.zzd(3) << 30) | iZzd2 | jZzd3);
                                this.zzh = true;
                            }
                            jZzb = this.zze.zzb((jZzd << 30) | i5 | jZzd2);
                        } else {
                            jZzb = -9223372036854775807L;
                        }
                        i11 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(jZzb, i11);
                        zzd(3);
                        i6 = -1;
                        i7 = 2;
                        r6 = 0;
                        i8 = 1;
                    }
                }
                i2 = i7;
                z = r6;
                i3 = i8;
            } else if (zze(zzfoVar, this.zzb.zza, 9)) {
                z = false;
                this.zzb.zzk(0);
                int iZzd3 = this.zzb.zzd(24);
                i3 = 1;
                if (iZzd3 != 1) {
                    zzfe.zzf("PesReader", "Unexpected start code prefix: " + iZzd3);
                    i6 = -1;
                    this.zzj = -1;
                    i4 = 0;
                    i2 = 2;
                } else {
                    this.zzb.zzm(8);
                    zzfn zzfnVar = this.zzb;
                    int iZzd4 = zzfnVar.zzd(16);
                    zzfnVar.zzm(5);
                    this.zzk = this.zzb.zzo();
                    i2 = 2;
                    this.zzb.zzm(2);
                    this.zzf = this.zzb.zzo();
                    this.zzg = this.zzb.zzo();
                    this.zzb.zzm(6);
                    int iZzd5 = this.zzb.zzd(8);
                    this.zzi = iZzd5;
                    if (iZzd4 == 0) {
                        this.zzj = -1;
                        i6 = -1;
                    } else {
                        int i17 = (iZzd4 - 3) - iZzd5;
                        this.zzj = i17;
                        if (i17 < 0) {
                            zzfe.zzf("PesReader", "Found negative packet payload size: " + i17);
                            i6 = -1;
                            this.zzj = -1;
                        } else {
                            i6 = -1;
                        }
                    }
                    i4 = 2;
                }
                zzd(i4);
            } else {
                i6 = -1;
                z = false;
                i3 = 1;
                i2 = 2;
            }
            i8 = i3;
            r6 = z;
            i7 = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
        this.zze = zzfvVar;
        this.zza.zzb(zzadiVar, zzapaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
