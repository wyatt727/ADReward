package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzads {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzadr zzk;
    private final zzby zzl;

    private zzads(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, zzadr zzadrVar, zzby zzbyVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzadrVar;
        this.zzl = zzbyVar;
    }

    public zzads(byte[] bArr, int i) {
        zzfn zzfnVar = new zzfn(bArr, bArr.length);
        zzfnVar.zzk(i * 8);
        this.zza = zzfnVar.zzd(16);
        this.zzb = zzfnVar.zzd(16);
        this.zzc = zzfnVar.zzd(24);
        this.zzd = zzfnVar.zzd(24);
        int iZzd = zzfnVar.zzd(20);
        this.zze = iZzd;
        this.zzf = zzi(iZzd);
        this.zzg = zzfnVar.zzd(3) + 1;
        int iZzd2 = zzfnVar.zzd(5) + 1;
        this.zzh = iZzd2;
        this.zzi = zzh(iZzd2);
        int iZzd3 = zzfnVar.zzd(4);
        int iZzd4 = zzfnVar.zzd(32);
        int i2 = zzfx.zza;
        this.zzj = ((iZzd3 & 4294967295L) << 32) | (iZzd4 & 4294967295L);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.zze;
    }

    public final long zzb(long j) {
        return Math.max(0L, Math.min((j * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzam zzc(byte[] bArr, zzby zzbyVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzby zzbyVarZzd = zzd(zzbyVar);
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/flac");
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzakVar.zzO(i);
        zzakVar.zzy(this.zzg);
        zzakVar.zzX(this.zze);
        zzakVar.zzQ(zzfx.zzl(this.zzh));
        zzakVar.zzL(Collections.singletonList(bArr));
        zzakVar.zzP(zzbyVarZzd);
        return zzakVar.zzac();
    }

    public final zzby zzd(zzby zzbyVar) {
        zzby zzbyVar2 = this.zzl;
        return zzbyVar2 == null ? zzbyVar : zzbyVar2.zzd(zzbyVar);
    }

    public final zzads zze(List list) {
        return new zzads(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzby(list)));
    }

    public final zzads zzf(zzadr zzadrVar) {
        return new zzads(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadrVar, this.zzl);
    }

    public final zzads zzg(List list) {
        return new zzads(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaes.zzb(list)));
    }
}
