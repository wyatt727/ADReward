package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.math.RoundingMode;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzapf implements zzapg {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, Opcodes.D2L, 157, Opcodes.LRETURN, Opcodes.ARRAYLENGTH, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzadi zzc;
    private final zzaem zzd;
    private final zzapj zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfo zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzapf(zzadi zzadiVar, zzaem zzaemVar, zzapj zzapjVar) throws zzcc {
        this.zzc = zzadiVar;
        this.zzd = zzaemVar;
        this.zze = zzapjVar;
        int iMax = Math.max(1, zzapjVar.zzc / 10);
        this.zzi = iMax;
        zzfo zzfoVar = new zzfo(zzapjVar.zzf);
        zzfoVar.zzk();
        int iZzk = zzfoVar.zzk();
        this.zzf = iZzk;
        int i = zzapjVar.zzb;
        int i2 = (((zzapjVar.zzd - (i * 4)) * 8) / (zzapjVar.zze * i)) + 1;
        if (iZzk != i2) {
            throw zzcc.zza("Expected frames per block: " + i2 + "; got: " + iZzk, null);
        }
        int i3 = zzfx.zza;
        int i4 = ((iMax + iZzk) - 1) / iZzk;
        this.zzg = new byte[zzapjVar.zzd * i4];
        this.zzh = new zzfo(i4 * (iZzk + iZzk) * i);
        int i5 = ((zzapjVar.zzc * zzapjVar.zzd) * 8) / iZzk;
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/raw");
        zzakVar.zzx(i5);
        zzakVar.zzR(i5);
        zzakVar.zzO((iMax + iMax) * i);
        zzakVar.zzy(zzapjVar.zzb);
        zzakVar.zzX(zzapjVar.zzc);
        zzakVar.zzQ(2);
        this.zzj = zzakVar.zzac();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long jZzt = this.zzl + zzfx.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int iZze = zze(i);
        this.zzd.zzs(jZzt, 1, iZze, this.zzm - iZze, null);
        this.zzn += i;
        this.zzm -= iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(int i, long j) {
        this.zzc.zzO(new zzapm(this.zze, this.zzf, i, j));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzapg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadg r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapf.zzc(com.google.android.gms.internal.ads.zzadg, long):boolean");
    }
}
