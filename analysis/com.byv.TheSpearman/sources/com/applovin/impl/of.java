package com.applovin.impl;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public abstract class of {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f757a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] b = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] c = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] d = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] e = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] f = {32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] g = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f758a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public boolean a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            if (!of.c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f758a = i2;
            this.b = of.f757a[3 - i3];
            int i7 = of.b[i5];
            this.d = i7;
            if (i2 == 2) {
                this.d = i7 / 2;
            } else if (i2 == 0) {
                this.d = i7 / 4;
            }
            int i8 = (i >>> 9) & 1;
            this.g = of.b(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i6 = of.c[i4 - 1];
                } else {
                    i6 = of.d[i4 - 1];
                }
                this.f = i6;
                this.c = (((i6 * 12) / this.d) + i8) * 4;
            } else {
                int i9 = Opcodes.D2F;
                if (i2 == 3) {
                    int i10 = i3 == 2 ? of.e[i4 - 1] : of.f[i4 - 1];
                    this.f = i10;
                    this.c = ((i10 * Opcodes.D2F) / this.d) + i8;
                } else {
                    int i11 = of.g[i4 - 1];
                    this.f = i11;
                    if (i3 == 1) {
                        i9 = 72;
                    }
                    this.c = ((i9 * i11) / this.d) + i8;
                }
            }
            this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? e[i4 - 1] : f[i4 - 1];
        } else {
            i6 = g[i4 - 1];
        }
        int i9 = Opcodes.D2F;
        if (i2 == 3) {
            return ((i6 * Opcodes.D2F) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }

    public static int d(int i) {
        int i2;
        int i3;
        if (!c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return b(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return RendererCapabilities.MODE_SUPPORT_MASK;
        }
        throw new IllegalArgumentException();
    }
}
