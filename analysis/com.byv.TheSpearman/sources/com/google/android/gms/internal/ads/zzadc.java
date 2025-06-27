package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadc {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, OpusUtil.SAMPLE_RATE, 96000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        zzfn zzfnVarZzg = zzg(bArr);
        zzfnVarZzg.zzm(42);
        return zzfnVarZzg.zzd(true != zzfnVarZzg.zzo() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzfn zzfnVarZzg = zzg(bArr);
        zzfnVarZzg.zzm(32);
        return zzf(zzfnVarZzg, zzj, true) + 1;
    }

    public static zzam zzc(byte[] bArr, String str, String str2, int i, zzae zzaeVar) {
        zzfn zzfnVarZzg = zzg(bArr);
        zzfnVarZzg.zzm(60);
        int i2 = zzb[zzfnVarZzg.zzd(6)];
        int i3 = zzc[zzfnVarZzg.zzd(4)];
        int iZzd = zzfnVarZzg.zzd(5);
        int i4 = iZzd >= 29 ? -1 : (zzd[iZzd] * 1000) / 2;
        zzfnVarZzg.zzm(10);
        int i5 = i2 + (zzfnVarZzg.zzd(2) > 0 ? 1 : 0);
        zzak zzakVar = new zzak();
        zzakVar.zzK(str);
        zzakVar.zzW("audio/vnd.dts");
        zzakVar.zzx(i4);
        zzakVar.zzy(i5);
        zzakVar.zzX(i3);
        zzakVar.zzE(null);
        zzakVar.zzN(str2);
        zzakVar.zzU(i);
        return zzakVar.zzac();
    }

    public static zzadb zzd(byte[] bArr) throws zzcc {
        int iZzd;
        int i;
        int iZzd2;
        long jZzt;
        int i2;
        zzfn zzfnVarZzg = zzg(bArr);
        zzfnVarZzg.zzm(40);
        int iZzd3 = zzfnVarZzg.zzd(2);
        boolean zZzo = zzfnVarZzg.zzo();
        int i3 = true != zZzo ? 16 : 20;
        zzfnVarZzg.zzm(true != zZzo ? 8 : 12);
        int iZzd4 = zzfnVarZzg.zzd(i3) + 1;
        boolean zZzo2 = zzfnVarZzg.zzo();
        int i4 = 0;
        if (zZzo2) {
            iZzd = zzfnVarZzg.zzd(2);
            int iZzd5 = zzfnVarZzg.zzd(3) + 1;
            if (zzfnVarZzg.zzo()) {
                zzfnVarZzg.zzm(36);
            }
            int iZzd6 = zzfnVarZzg.zzd(3) + 1;
            int iZzd7 = zzfnVarZzg.zzd(3) + 1;
            if (iZzd6 != 1 || iZzd7 != 1) {
                throw zzcc.zzc("Multiple audio presentations or assets not supported");
            }
            int i5 = iZzd3 + 1;
            int iZzd8 = zzfnVarZzg.zzd(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                if (((iZzd8 >> i6) & 1) == 1) {
                    zzfnVarZzg.zzm(8);
                }
            }
            int i7 = iZzd5 * 512;
            if (zzfnVarZzg.zzo()) {
                zzfnVarZzg.zzm(2);
                int iZzd9 = (zzfnVarZzg.zzd(2) + 1) << 2;
                int iZzd10 = zzfnVarZzg.zzd(2) + 1;
                while (i4 < iZzd10) {
                    zzfnVarZzg.zzm(iZzd9);
                    i4++;
                }
            }
            i4 = i7;
        } else {
            iZzd = -1;
        }
        zzfnVarZzg.zzm(i3);
        zzfnVarZzg.zzm(12);
        if (zZzo2) {
            if (zzfnVarZzg.zzo()) {
                zzfnVarZzg.zzm(4);
            }
            if (zzfnVarZzg.zzo()) {
                zzfnVarZzg.zzm(24);
            }
            if (zzfnVarZzg.zzo()) {
                zzfnVarZzg.zzn(zzfnVarZzg.zzd(10) + 1);
            }
            zzfnVarZzg.zzm(5);
            int i8 = zze[zzfnVarZzg.zzd(4)];
            iZzd2 = zzfnVarZzg.zzd(8) + 1;
            i = i8;
        } else {
            i = -2147483647;
            iZzd2 = -1;
        }
        if (zZzo2) {
            if (iZzd == 0) {
                i2 = 32000;
            } else if (iZzd == 1) {
                i2 = 44100;
            } else {
                if (iZzd != 2) {
                    throw zzcc.zza("Unsupported reference clock code in DTS HD header: " + iZzd, null);
                }
                i2 = OpusUtil.SAMPLE_RATE;
            }
            jZzt = zzfx.zzt(i4, 1000000L, i2, RoundingMode.FLOOR);
        } else {
            jZzt = -9223372036854775807L;
        }
        return new zzadb("audio/vnd.dts.hd;profile=lbr", iZzd2, i, iZzd4, jZzt, 0, null);
    }

    public static zzadb zze(byte[] bArr, AtomicInteger atomicInteger) throws zzcc {
        long jZzt;
        int iZzd;
        int i;
        int i2;
        zzfn zzfnVarZzg = zzg(bArr);
        int iZzd2 = zzfnVarZzg.zzd(32);
        int iZzf = zzf(zzfnVarZzg, zzf, true) + 1;
        char c = iZzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c == 0) {
            jZzt = -9223372036854775807L;
            iZzd = C.RATE_UNSET_INT;
        } else {
            if (!zzfnVarZzg.zzo()) {
                throw zzcc.zzc("Only supports full channel mask-based audio presentation");
            }
            int i3 = iZzf - 2;
            if ((((char) (bArr[i3] << 8)) | (bArr[iZzf - 1] & 255)) != zzfx.zzd(bArr, 0, i3, 65535)) {
                throw zzcc.zza("CRC check failed", null);
            }
            int iZzd3 = zzfnVarZzg.zzd(2);
            if (iZzd3 == 0) {
                i = 512;
            } else if (iZzd3 == 1) {
                i = 480;
            } else {
                if (iZzd3 != 2) {
                    throw zzcc.zza("Unsupported base duration index in DTS UHD header: " + iZzd3, null);
                }
                i = RendererCapabilities.MODE_SUPPORT_MASK;
            }
            int iZzd4 = zzfnVarZzg.zzd(3) + 1;
            int iZzd5 = zzfnVarZzg.zzd(2);
            if (iZzd5 == 0) {
                i2 = 32000;
            } else if (iZzd5 == 1) {
                i2 = 44100;
            } else {
                if (iZzd5 != 2) {
                    throw zzcc.zza("Unsupported clock rate index in DTS UHD header: " + iZzd5, null);
                }
                i2 = OpusUtil.SAMPLE_RATE;
            }
            if (zzfnVarZzg.zzo()) {
                zzfnVarZzg.zzm(36);
            }
            iZzd = (1 << zzfnVarZzg.zzd(2)) * i2;
            jZzt = zzfx.zzt(i * iZzd4, 1000000L, i2, RoundingMode.FLOOR);
        }
        int i4 = iZzd;
        long j = jZzt;
        int iZzf2 = 0;
        for (char c2 = 0; c2 < c; c2 = 1) {
            iZzf2 += zzf(zzfnVarZzg, zzg, true);
        }
        for (char c3 = 0; c3 <= 0; c3 = 1) {
            if (c != 0) {
                atomicInteger.set(zzf(zzfnVarZzg, zzh, true));
            }
            iZzf2 += atomicInteger.get() != 0 ? zzf(zzfnVarZzg, zzi, true) : 0;
        }
        return new zzadb(MimeTypes.AUDIO_DTS_X, 2, i4, iZzf + iZzf2, j, 0, null);
    }

    private static int zzf(zzfn zzfnVar, int[] iArr, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && zzfnVar.zzo(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + zzfnVar.zzd(iArr[i]);
    }

    private static zzfn zzg(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new zzfn(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        int length = bArrCopyOf.length;
        zzfn zzfnVar = new zzfn(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzfn zzfnVar2 = new zzfn(bArrCopyOf, length);
            while (zzfnVar2.zza() >= 16) {
                zzfnVar2.zzm(2);
                zzfnVar.zzf(zzfnVar2.zzd(14), 14);
            }
        }
        zzfnVar.zzj(bArrCopyOf, bArrCopyOf.length);
        return zzfnVar;
    }
}
