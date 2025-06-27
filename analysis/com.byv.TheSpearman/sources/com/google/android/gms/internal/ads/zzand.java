package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzand implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzanc
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzand.zza;
            return new zzadf[]{new zzand()};
        }
    };
    private final zzane zzb = new zzane(null, 0);
    private final zzfo zzc = new zzfo(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        int iZza = zzadgVar.zza(this.zzc.zzM(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(iZza);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
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
        this.zzb.zzb(zzadiVar, new zzapa(Integer.MIN_VALUE, 0, 1));
        zzadiVar.zzD();
        zzadiVar.zzO(new zzaee(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzact zzactVar;
        zzfo zzfoVar = new zzfo(10);
        int i = 0;
        while (true) {
            zzactVar = (zzact) zzadgVar;
            zzactVar.zzm(zzfoVar.zzM(), 0, 10, false);
            zzfoVar.zzK(0);
            if (zzfoVar.zzo() != 4801587) {
                break;
            }
            zzfoVar.zzL(3);
            int iZzl = zzfoVar.zzl();
            i += iZzl + 10;
            zzactVar.zzl(iZzl, false);
        }
        zzadgVar.zzj();
        zzactVar.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzactVar.zzm(zzfoVar.zzM(), 0, 6, false);
            zzfoVar.zzK(0);
            if (zzfoVar.zzq() != 2935) {
                zzadgVar.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzactVar.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iZzb = zzace.zzb(zzfoVar.zzM());
                if (iZzb == -1) {
                    return false;
                }
                zzactVar.zzl(iZzb - 6, false);
            }
        }
    }
}
