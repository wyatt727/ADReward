package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafn extends zzafs {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafn(zzaem zzaemVar) {
        super(zzaemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zza(zzfo zzfoVar) throws zzafr {
        if (this.zzc) {
            zzfoVar.zzL(1);
        } else {
            int iZzm = zzfoVar.zzm();
            int i = iZzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(iZzm >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzW("audio/mpeg");
                zzakVar.zzy(1);
                zzakVar.zzX(i2);
                this.zza.zzl(zzakVar.zzac());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzak zzakVar2 = new zzak();
                zzakVar2.zzW(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzakVar2.zzy(1);
                zzakVar2.zzX(8000);
                this.zza.zzl(zzakVar2.zzac());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzafr("Audio format not supported: " + i);
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zzb(zzfo zzfoVar, long j) throws zzcc {
        if (this.zze == 2) {
            int iZzb = zzfoVar.zzb();
            this.zza.zzq(zzfoVar, iZzb);
            this.zza.zzs(j, 1, iZzb, 0, null);
            return true;
        }
        int iZzm = zzfoVar.zzm();
        if (iZzm != 0 || this.zzd) {
            if (this.zze == 10 && iZzm != 1) {
                return false;
            }
            int iZzb2 = zzfoVar.zzb();
            this.zza.zzq(zzfoVar, iZzb2);
            this.zza.zzs(j, 1, iZzb2, 0, null);
            return true;
        }
        int iZzb3 = zzfoVar.zzb();
        byte[] bArr = new byte[iZzb3];
        zzfoVar.zzG(bArr, 0, iZzb3);
        zzaca zzacaVarZza = zzacb.zza(bArr);
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/mp4a-latm");
        zzakVar.zzz(zzacaVarZza.zzc);
        zzakVar.zzy(zzacaVarZza.zzb);
        zzakVar.zzX(zzacaVarZza.zza);
        zzakVar.zzL(Collections.singletonList(bArr));
        this.zza.zzl(zzakVar.zzac());
        this.zzd = true;
        return false;
    }
}
