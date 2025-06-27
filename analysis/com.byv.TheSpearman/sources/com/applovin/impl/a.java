package com.applovin.impl;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f232a = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};
    private static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f233a;
        public final int b;
        public final String c;

        private b(int i, int i2, String str) {
            this.f233a = i;
            this.b = i2;
            this.c = str;
        }
    }

    private static int b(xg xgVar) throws ah {
        int iA = xgVar.a(4);
        if (iA == 15) {
            return xgVar.a(24);
        }
        if (iA < 13) {
            return f232a[iA];
        }
        throw ah.a(null, null);
    }

    private static int a(xg xgVar) {
        int iA = xgVar.a(5);
        return iA == 31 ? xgVar.a(6) + 32 : iA;
    }

    public static b a(xg xgVar, boolean z) throws ah {
        int iA = a(xgVar);
        int iB = b(xgVar);
        int iA2 = xgVar.a(4);
        String str = "mp4a.40." + iA;
        if (iA == 5 || iA == 29) {
            iB = b(xgVar);
            iA = a(xgVar);
            if (iA == 22) {
                iA2 = xgVar.a(4);
            }
        }
        if (z) {
            if (iA != 6 && iA != 7 && iA != 17 && iA != 1 && iA != 2 && iA != 3 && iA != 4) {
                switch (iA) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ah.a("Unsupported audio object type: " + iA);
                }
            }
            a(xgVar, iA, iA2);
            switch (iA) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iA3 = xgVar.a(2);
                    if (iA3 == 2 || iA3 == 3) {
                        throw ah.a("Unsupported epConfig: " + iA3);
                    }
            }
        }
        int i = b[iA2];
        if (i != -1) {
            return new b(iB, i, str);
        }
        throw ah.a(null, null);
    }

    private static void a(xg xgVar, int i, int i2) {
        if (xgVar.f()) {
            kc.d("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xgVar.f()) {
            xgVar.d(14);
        }
        boolean zF = xgVar.f();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            xgVar.d(3);
        }
        if (zF) {
            if (i == 22) {
                xgVar.d(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                xgVar.d(3);
            }
            xgVar.d(1);
        }
    }

    public static b a(byte[] bArr) {
        return a(new xg(bArr), false);
    }
}
