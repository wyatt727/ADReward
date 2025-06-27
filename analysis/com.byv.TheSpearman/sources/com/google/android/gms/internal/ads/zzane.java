package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzane implements zzano {
    private final zzfn zza;
    private final zzfo zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzaem zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzam zzk;
    private int zzl;
    private long zzm;

    public zzane() {
        this(null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) {
        zzek.zzb(this.zzf);
        while (zzfoVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (true) {
                    if (zzfoVar.zzb() <= 0) {
                        break;
                    }
                    if (this.zzi) {
                        int iZzm = zzfoVar.zzm();
                        if (iZzm == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            zzfo zzfoVar2 = this.zzb;
                            zzfoVar2.zzM()[0] = 11;
                            zzfoVar2.zzM()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        this.zzi = iZzm == 11;
                    } else {
                        this.zzi = zzfoVar.zzm() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzfoVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzq(zzfoVar, iMin);
                int i2 = this.zzh + iMin;
                this.zzh = i2;
                if (i2 == this.zzl) {
                    zzek.zzf(this.zzm != -9223372036854775807L);
                    this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] bArrZzM = this.zzb.zzM();
                int iMin2 = Math.min(zzfoVar.zzb(), 128 - this.zzh);
                zzfoVar.zzG(bArrZzM, this.zzh, iMin2);
                int i3 = this.zzh + iMin2;
                this.zzh = i3;
                if (i3 == 128) {
                    this.zza.zzk(0);
                    zzacd zzacdVarZze = zzace.zze(this.zza);
                    zzam zzamVar = this.zzk;
                    if (zzamVar == null || zzacdVarZze.zzc != zzamVar.zzz || zzacdVarZze.zzb != zzamVar.zzA || !zzfx.zzG(zzacdVarZze.zza, zzamVar.zzm)) {
                        zzak zzakVar = new zzak();
                        zzakVar.zzK(this.zze);
                        zzakVar.zzW(zzacdVarZze.zza);
                        zzakVar.zzy(zzacdVarZze.zzc);
                        zzakVar.zzX(zzacdVarZze.zzb);
                        zzakVar.zzN(this.zzc);
                        zzakVar.zzU(this.zzd);
                        zzakVar.zzR(zzacdVarZze.zzf);
                        if ("audio/ac3".equals(zzacdVarZze.zza)) {
                            zzakVar.zzx(zzacdVarZze.zzf);
                        }
                        zzam zzamVarZzac = zzakVar.zzac();
                        this.zzk = zzamVarZzac;
                        this.zzf.zzl(zzamVarZzac);
                    }
                    this.zzl = zzacdVarZze.zzd;
                    this.zzj = (zzacdVarZze.zze * 1000000) / this.zzk.zzA;
                    this.zzb.zzK(0);
                    this.zzf.zzq(this.zzb, 128);
                    this.zzg = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zze = zzapaVar.zzb();
        this.zzf = zzadiVar.zzw(zzapaVar.zza(), 1);
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
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }

    public zzane(String str, int i) {
        zzfn zzfnVar = new zzfn(new byte[128], 128);
        this.zza = zzfnVar;
        this.zzb = new zzfo(zzfnVar.zza);
        this.zzg = 0;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }
}
