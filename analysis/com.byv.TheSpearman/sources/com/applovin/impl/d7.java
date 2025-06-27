package com.applovin.impl;

import com.applovin.impl.d9;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class d7 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f353a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] c = {64, 112, 128, 192, 224, 256, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int d(byte[] bArr) {
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = 6
            r3 = 7
            r4 = 1
            r5 = 4
            r6 = -2
            if (r1 == r6) goto L4a
            r6 = -1
            if (r1 == r6) goto L32
            r6 = 31
            if (r1 == r6) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r5
            r1 = r1 | r2
            r7 = r7[r3]
            goto L58
        L21:
            r0 = r7[r2]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r5
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r5
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r4
            r0 = r4
            goto L5d
        L4a:
            r1 = r7[r5]
            r1 = r1 & 3
            int r1 = r1 << 12
            r3 = r7[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r5
            r1 = r1 | r3
            r7 = r7[r2]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r5
            r7 = r7 | r1
            int r7 = r7 + r4
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d7.a(byte[]):int");
    }

    private static xg b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new xg(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b2 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b2;
            }
        }
        xg xgVar = new xg(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            xg xgVar2 = new xg(bArrCopyOf);
            while (xgVar2.b() >= 16) {
                xgVar2.d(2);
                xgVar.a(xgVar2.a(14), 14);
            }
        }
        xgVar.a(bArrCopyOf);
        return xgVar;
    }

    private static boolean c(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int iPosition = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition);
        if (b4 != -2) {
            if (b4 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 7);
            } else if (b4 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b2 = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 6);
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b2 = byteBuffer.get(iPosition + 4);
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static d9 a(byte[] bArr, String str, String str2, w6 w6Var) {
        xg xgVarB = b(bArr);
        xgVarB.d(60);
        int i = f353a[xgVarB.a(6)];
        int i2 = b[xgVarB.a(4)];
        int iA = xgVarB.a(5);
        int[] iArr = c;
        int i3 = iA >= iArr.length ? -1 : (iArr[iA] * 1000) / 2;
        xgVarB.d(10);
        return new d9.b().c(str).f("audio/vnd.dts").b(i3).c(i + (xgVarB.a(2) > 0 ? 1 : 0)).n(i2).a(w6Var).e(str2).a();
    }
}
