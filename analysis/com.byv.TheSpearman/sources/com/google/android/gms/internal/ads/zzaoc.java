package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaoc implements zzano {
    private final zzfo zza;
    private final zzadz zzb;
    private final String zzc;
    private final int zzd;
    private zzaem zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzaoc() {
        this(null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) {
        zzek.zzb(this.zze);
        while (zzfoVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                byte[] bArrZzM = zzfoVar.zzM();
                int iZzd = zzfoVar.zzd();
                int iZze = zzfoVar.zze();
                while (true) {
                    if (iZzd >= iZze) {
                        zzfoVar.zzK(iZze);
                        break;
                    }
                    int i2 = iZzd + 1;
                    byte b = bArrZzM[iZzd];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzj && (b & 224) == 224;
                    this.zzj = z;
                    if (z2) {
                        zzfoVar.zzK(i2);
                        this.zzj = false;
                        this.zza.zzM()[1] = bArrZzM[iZzd];
                        this.zzh = 2;
                        this.zzg = 1;
                        break;
                    }
                    iZzd = i2;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzfoVar.zzb(), this.zzl - this.zzh);
                this.zze.zzq(zzfoVar, iMin);
                int i3 = this.zzh + iMin;
                this.zzh = i3;
                if (i3 >= this.zzl) {
                    zzek.zzf(this.zzm != -9223372036854775807L);
                    this.zze.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzk;
                    this.zzh = 0;
                    this.zzg = 0;
                }
            } else {
                int iMin2 = Math.min(zzfoVar.zzb(), 4 - this.zzh);
                zzfoVar.zzG(this.zza.zzM(), this.zzh, iMin2);
                int i4 = this.zzh + iMin2;
                this.zzh = i4;
                if (i4 >= 4) {
                    this.zza.zzK(0);
                    if (this.zzb.zza(this.zza.zzg())) {
                        this.zzl = this.zzb.zzc;
                        if (!this.zzi) {
                            this.zzk = (r0.zzg * 1000000) / r0.zzd;
                            zzak zzakVar = new zzak();
                            zzakVar.zzK(this.zzf);
                            zzakVar.zzW(this.zzb.zzb);
                            zzakVar.zzO(4096);
                            zzakVar.zzy(this.zzb.zze);
                            zzakVar.zzX(this.zzb.zzd);
                            zzakVar.zzN(this.zzc);
                            zzakVar.zzU(this.zzd);
                            this.zze.zzl(zzakVar.zzac());
                            this.zzi = true;
                        }
                        this.zza.zzK(0);
                        this.zze.zzq(this.zza, 4);
                        this.zzg = 2;
                    } else {
                        this.zzh = 0;
                        this.zzg = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zzf = zzapaVar.zzb();
        this.zze = zzadiVar.zzw(zzapaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }

    public zzaoc(String str, int i) {
        this.zzg = 0;
        zzfo zzfoVar = new zzfo(4);
        this.zza = zzfoVar;
        zzfoVar.zzM()[0] = -1;
        this.zzb = new zzadz();
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }
}
