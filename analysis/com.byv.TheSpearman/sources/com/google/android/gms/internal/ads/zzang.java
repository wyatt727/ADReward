package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzang implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzanf
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzang.zza;
            return new zzadf[]{new zzang()};
        }
    };
    private final zzanh zzb = new zzanh(null, 0);
    private final zzfo zzc = new zzfo(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        int iZza = zzadgVar.zza(this.zzc.zzM(), 0, 16384);
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
        int i;
        zzfo zzfoVar = new zzfo(10);
        int i2 = 0;
        while (true) {
            zzactVar = (zzact) zzadgVar;
            zzactVar.zzm(zzfoVar.zzM(), 0, 10, false);
            zzfoVar.zzK(0);
            if (zzfoVar.zzo() != 4801587) {
                break;
            }
            zzfoVar.zzL(3);
            int iZzl = zzfoVar.zzl();
            i2 += iZzl + 10;
            zzactVar.zzl(iZzl, false);
        }
        zzadgVar.zzj();
        zzactVar.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzactVar.zzm(zzfoVar.zzM(), 0, 7, false);
            zzfoVar.zzK(0);
            int iZzq = zzfoVar.zzq();
            if (iZzq == 44096 || iZzq == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArrZzM = zzfoVar.zzM();
                int i6 = zzach.zza;
                if (bArrZzM.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((bArrZzM[2] & 255) << 8) | (bArrZzM[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((bArrZzM[4] & 255) << 16) | ((bArrZzM[5] & 255) << 8) | (bArrZzM[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iZzq == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzactVar.zzl(i - 7, false);
            } else {
                zzadgVar.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzactVar.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
