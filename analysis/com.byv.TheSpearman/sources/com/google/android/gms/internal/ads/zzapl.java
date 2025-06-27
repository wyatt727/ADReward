package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.audio.WavUtil;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzapl {
    public static Pair zza(zzadg zzadgVar) throws IOException {
        zzadgVar.zzj();
        zzapk zzapkVarZzd = zzd(1684108385, zzadgVar, new zzfo(8));
        ((zzact) zzadgVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzadgVar.zzf()), Long.valueOf(zzapkVarZzd.zzb));
    }

    public static zzapj zzb(zzadg zzadgVar) throws IOException {
        byte[] bArr;
        zzfo zzfoVar = new zzfo(16);
        zzapk zzapkVarZzd = zzd(WavUtil.FMT_FOURCC, zzadgVar, zzfoVar);
        zzek.zzf(zzapkVarZzd.zzb >= 16);
        zzact zzactVar = (zzact) zzadgVar;
        zzactVar.zzm(zzfoVar.zzM(), 0, 16, false);
        zzfoVar.zzK(0);
        int iZzk = zzfoVar.zzk();
        int iZzk2 = zzfoVar.zzk();
        int iZzj = zzfoVar.zzj();
        int iZzj2 = zzfoVar.zzj();
        int iZzk3 = zzfoVar.zzk();
        int iZzk4 = zzfoVar.zzk();
        int i = ((int) zzapkVarZzd.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zzactVar.zzm(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzfx.zzf;
        }
        zzactVar.zzo((int) (zzadgVar.zze() - zzadgVar.zzf()), false);
        return new zzapj(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr);
    }

    public static boolean zzc(zzadg zzadgVar) throws IOException {
        zzfo zzfoVar = new zzfo(8);
        int i = zzapk.zza(zzadgVar, zzfoVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzact) zzadgVar).zzm(zzfoVar.zzM(), 0, 4, false);
        zzfoVar.zzK(0);
        int iZzg = zzfoVar.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        zzfe.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }

    private static zzapk zzd(int i, zzadg zzadgVar, zzfo zzfoVar) throws IOException {
        zzapk zzapkVarZza = zzapk.zza(zzadgVar, zzfoVar);
        while (true) {
            int i2 = zzapkVarZza.zza;
            if (i2 == i) {
                return zzapkVarZza;
            }
            zzfe.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zzapkVarZza.zzb + 8;
            if (j > 2147483647L) {
                throw zzcc.zzc("Chunk is too large (~2GB+) to skip; id: " + zzapkVarZza.zza);
            }
            ((zzact) zzadgVar).zzo((int) j, false);
            zzapkVarZza = zzapk.zza(zzadgVar, zzfoVar);
        }
    }
}
