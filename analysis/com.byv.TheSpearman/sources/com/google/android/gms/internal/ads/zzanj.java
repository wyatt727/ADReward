package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanj implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzani
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzanj.zza;
            return new zzadf[]{new zzanj(0)};
        }
    };
    private final zzank zzb;
    private final zzfo zzc;
    private final zzfo zzd;
    private final zzfn zze;
    private zzadi zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzanj() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        zzek.zzb(this.zzf);
        int iZza = zzadgVar.zza(this.zzc.zzM(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzO(new zzaee(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(iZza);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzf = zzadiVar;
        this.zzb.zzb(zzadiVar, new zzapa(Integer.MIN_VALUE, 0, 1));
        zzadiVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzact zzactVar;
        int i = 0;
        while (true) {
            zzactVar = (zzact) zzadgVar;
            zzactVar.zzm(this.zzd.zzM(), 0, 10, false);
            this.zzd.zzK(0);
            if (this.zzd.zzo() != 4801587) {
                break;
            }
            this.zzd.zzL(3);
            int iZzl = this.zzd.zzl();
            i += iZzl + 10;
            zzactVar.zzl(iZzl, false);
        }
        zzadgVar.zzj();
        zzactVar.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzactVar.zzm(this.zzd.zzM(), 0, 2, false);
            this.zzd.zzK(0);
            if (zzank.zzf(this.zzd.zzq())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzactVar.zzm(this.zzd.zzM(), 0, 4, false);
                this.zze.zzk(14);
                int iZzd = this.zze.zzd(13);
                if (iZzd <= 6) {
                    i4++;
                    zzadgVar.zzj();
                    zzactVar.zzl(i4, false);
                } else {
                    zzactVar.zzl(iZzd - 6, false);
                    i3 += iZzd;
                }
            } else {
                i4++;
                zzadgVar.zzj();
                zzactVar.zzl(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    public zzanj(int i) {
        this.zzb = new zzank(true, null, 0);
        this.zzc = new zzfo(2048);
        this.zzh = -1L;
        zzfo zzfoVar = new zzfo(10);
        this.zzd = zzfoVar;
        byte[] bArrZzM = zzfoVar.zzM();
        this.zze = new zzfn(bArrZzM, bArrZzM.length);
    }
}
