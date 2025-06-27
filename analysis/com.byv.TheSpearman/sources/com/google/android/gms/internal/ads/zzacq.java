package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzacq {
    public static void zza(long j, zzfo zzfoVar, zzaem[] zzaemVarArr) {
        int iZzg;
        while (true) {
            if (zzfoVar.zzb() <= 1) {
                return;
            }
            int iZzc = zzc(zzfoVar);
            int iZzc2 = zzc(zzfoVar);
            int iZzd = zzfoVar.zzd() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzfoVar.zzb()) {
                zzfe.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzd = zzfoVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzm = zzfoVar.zzm();
                int iZzq = zzfoVar.zzq();
                if (iZzq == 49) {
                    iZzg = zzfoVar.zzg();
                    iZzq = 49;
                } else {
                    iZzg = 0;
                }
                int iZzm2 = zzfoVar.zzm();
                if (iZzq == 47) {
                    zzfoVar.zzL(1);
                    iZzq = 47;
                }
                boolean z = iZzm == 181 && (iZzq == 49 || iZzq == 47) && iZzm2 == 3;
                if (iZzq == 49) {
                    z &= iZzg == 1195456820;
                }
                if (z) {
                    zzb(j, zzfoVar, zzaemVarArr);
                }
            }
            zzfoVar.zzK(iZzd);
        }
    }

    public static void zzb(long j, zzfo zzfoVar, zzaem[] zzaemVarArr) {
        int iZzm = zzfoVar.zzm();
        if ((iZzm & 64) != 0) {
            int i = iZzm & 31;
            zzfoVar.zzL(1);
            int iZzd = zzfoVar.zzd();
            for (zzaem zzaemVar : zzaemVarArr) {
                int i2 = i * 3;
                zzfoVar.zzK(iZzd);
                zzaemVar.zzq(zzfoVar, i2);
                zzek.zzf(j != -9223372036854775807L);
                zzaemVar.zzs(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzfo zzfoVar) {
        int i = 0;
        while (zzfoVar.zzb() != 0) {
            int iZzm = zzfoVar.zzm();
            i += iZzm;
            if (iZzm != 255) {
                return i;
            }
        }
        return -1;
    }
}
