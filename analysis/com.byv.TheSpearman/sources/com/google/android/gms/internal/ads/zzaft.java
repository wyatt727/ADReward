package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaft extends zzafs {
    private final zzfo zzb;
    private final zzfo zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaft(zzaem zzaemVar) {
        super(zzaemVar);
        this.zzb = new zzfo(zzgl.zza);
        this.zzc = new zzfo(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zza(zzfo zzfoVar) throws zzafr {
        int iZzm = zzfoVar.zzm();
        int i = iZzm >> 4;
        int i2 = iZzm & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzafr("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zzb(zzfo zzfoVar, long j) throws zzcc {
        int i;
        int iZzm = zzfoVar.zzm();
        long jZzh = zzfoVar.zzh();
        if (iZzm == 0) {
            if (!this.zze) {
                zzfo zzfoVar2 = new zzfo(new byte[zzfoVar.zzb()]);
                zzfoVar.zzG(zzfoVar2.zzM(), 0, zzfoVar.zzb());
                zzaci zzaciVarZza = zzaci.zza(zzfoVar2);
                this.zzd = zzaciVarZza.zzb;
                zzak zzakVar = new zzak();
                zzakVar.zzW("video/avc");
                zzakVar.zzz(zzaciVarZza.zzk);
                zzakVar.zzab(zzaciVarZza.zzc);
                zzakVar.zzI(zzaciVarZza.zzd);
                zzakVar.zzS(zzaciVarZza.zzj);
                zzakVar.zzL(zzaciVarZza.zza);
                this.zza.zzl(zzakVar.zzac());
                this.zze = true;
                return false;
            }
        } else if (iZzm == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] bArrZzM = this.zzc.zzM();
            bArrZzM[0] = 0;
            bArrZzM[1] = 0;
            bArrZzM[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzfoVar.zzb() > 0) {
                zzfoVar.zzG(this.zzc.zzM(), i3, this.zzd);
                this.zzc.zzK(0);
                zzfo zzfoVar3 = this.zzc;
                zzfo zzfoVar4 = this.zzb;
                int iZzp = zzfoVar3.zzp();
                zzfoVar4.zzK(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzfoVar, iZzp);
                i4 = i4 + 4 + iZzp;
            }
            this.zza.zzs(j + (jZzh * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
