package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanh implements zzano {
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

    public zzanh() {
        this(null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) {
        zzek.zzb(this.zzf);
        while (zzfoVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (zzfoVar.zzb() > 0) {
                    if (this.zzi) {
                        int iZzm = zzfoVar.zzm();
                        this.zzi = iZzm == 172;
                        if (iZzm != 64) {
                            if (iZzm == 65) {
                                iZzm = 65;
                            }
                        }
                        this.zzg = 1;
                        zzfo zzfoVar2 = this.zzb;
                        zzfoVar2.zzM()[0] = -84;
                        zzfoVar2.zzM()[1] = iZzm == 65 ? (byte) 65 : (byte) 64;
                        this.zzh = 2;
                    } else {
                        this.zzi = zzfoVar.zzm() == 172;
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
                int iMin2 = Math.min(zzfoVar.zzb(), 16 - this.zzh);
                zzfoVar.zzG(bArrZzM, this.zzh, iMin2);
                int i3 = this.zzh + iMin2;
                this.zzh = i3;
                if (i3 == 16) {
                    this.zza.zzk(0);
                    zzacg zzacgVarZza = zzach.zza(this.zza);
                    zzam zzamVar = this.zzk;
                    if (zzamVar == null || zzamVar.zzz != 2 || zzacgVarZza.zza != zzamVar.zzA || !MimeTypes.AUDIO_AC4.equals(zzamVar.zzm)) {
                        zzak zzakVar = new zzak();
                        zzakVar.zzK(this.zze);
                        zzakVar.zzW(MimeTypes.AUDIO_AC4);
                        zzakVar.zzy(2);
                        zzakVar.zzX(zzacgVarZza.zza);
                        zzakVar.zzN(this.zzc);
                        zzakVar.zzU(this.zzd);
                        zzam zzamVarZzac = zzakVar.zzac();
                        this.zzk = zzamVarZzac;
                        this.zzf.zzl(zzamVarZzac);
                    }
                    this.zzl = zzacgVarZza.zzb;
                    this.zzj = (zzacgVarZza.zzc * 1000000) / this.zzk.zzA;
                    this.zzb.zzK(0);
                    this.zzf.zzq(this.zzb, 16);
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

    public zzanh(String str, int i) {
        zzfn zzfnVar = new zzfn(new byte[16], 16);
        this.zza = zzfnVar;
        this.zzb = new zzfo(zzfnVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }
}
