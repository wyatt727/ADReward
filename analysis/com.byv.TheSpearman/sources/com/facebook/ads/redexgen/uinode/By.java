package com.facebook.ads.redexgen.uinode;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class By {
    public static byte[] A07;
    public static String[] A08 = {"FJwhSbR0Dqb1wEJXVBdpfUEyE2PwmXT5", "QXyUQtNV4ztNvs", "u680PItdmSCtrwUArgQMKOt5dGhFKyFy", "M6QX6bpZXsa0EpVfLqUIYL0ok3oIyD", "4ddrBoC1HSiu89JLzfXMV59B74qIm2xJ", "MUUz2dKYtP7sZF6Tuk5kEGRgHEx452fJ", "i1sqGOju2LE8Q92QQNgFTaNu0rUo1z4f", "5HWyWxmgcaxBLo1LpD3PpaOIjtbRMHJC"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr = A08;
            if (strArr[6].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "mZfo4fIlXHQscYR0BkWPKUfaL8c0bByk";
            strArr2[2] = "AkiufmiMzZJvhyS77AiglOXb5e3YRP2V";
            bArrCopyOfRange[i4] = (byte) (i5 - 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-64, -44, -61, -56, -50, -114, -52, -49, -60, -58, 29, 49, 32, 37, 43, -21, 41, 44, 33, 35, -23, 8, -19, 50, 70, 53, 58, 64, 0, 62, 65, 54, 56, -2, 29, 3};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A04(int i, By by) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = A0E[i5];
        if (i2 == 2) {
            i9 /= 2;
        } else if (i2 == 0) {
            i9 /= 4;
        }
        int i10 = (i >>> 9) & 1;
        if (i3 == 3) {
            i6 = i2 == 3 ? A09[i4 - 1] : A0D[i4 - 1];
            i8 = (((i6 * 12000) / i9) + i10) * 4;
            i7 = RendererCapabilities.MODE_SUPPORT_MASK;
        } else {
            if (i2 == 3) {
                i6 = i3 == 2 ? A0A[i4 - 1] : A0B[i4 - 1];
                i7 = 1152;
                i8 = ((144000 * i6) / i9) + i10;
            } else {
                i6 = A0C[i4 - 1];
                i7 = i3 == 1 ? 576 : 1152;
                i8 = (((i3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i6) / i9) + i10;
            }
        }
        by.A03(i2, A0F[3 - i3], i8, i9, ((i >> 6) & 3) == 3 ? 1 : 2, i6 * 1000, i7);
        return true;
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, 94), A01(23, 13, 115), A01(0, 10, 1)};
        A0E = new int[]{44100, OpusUtil.SAMPLE_RATE, 32000};
        A09 = new int[]{32, 64, 96, 128, Opcodes.IF_ICMPNE, 192, 224, 256, 288, 320, 352, RendererCapabilities.MODE_SUPPORT_MASK, TypedValues.CycleType.TYPE_PATH_ROTATE, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, Opcodes.D2F, Opcodes.IF_ICMPNE, Opcodes.ARETURN, 192, 224, 256};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, 192, 224, 256, 320, RendererCapabilities.MODE_SUPPORT_MASK};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, 192, 224, 256, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.D2F, Opcodes.IF_ICMPNE};
    }

    public static int A00(int i) {
        int i2;
        int layer;
        int padding;
        int i3;
        int i4;
        int version;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (layer = (i >>> 17) & 3) == 0 || (padding = (i >>> 12) & 15) == 0 || padding == 15 || (i3 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i5 = A0E[i3];
        if (i2 == 2) {
            i5 /= 2;
        } else if (i2 == 0) {
            i5 /= 4;
        }
        int i6 = (i >>> 9) & 1;
        String[] strArr = A08;
        String str = strArr[5];
        String str2 = strArr[4];
        int iCharAt = str.charAt(20);
        int version2 = str2.charAt(20);
        if (iCharAt == version2) {
            throw new RuntimeException();
        }
        A08[0] = "wCPzQVRdLc9fuoZbbzdyTQMs65DUcW8k";
        if (layer == 3) {
            if (i2 == 3) {
                int version3 = padding - 1;
                version = A09[version3];
            } else {
                int version4 = padding - 1;
                version = A0D[version4];
            }
            return (((version * 12000) / i5) + i6) * 4;
        }
        if (i2 == 3) {
            if (layer == 2) {
                int version5 = padding - 1;
                i4 = A0A[version5];
            } else {
                int version6 = padding - 1;
                i4 = A0B[version6];
            }
        } else {
            int version7 = padding - 1;
            i4 = A0C[version7];
        }
        if (i2 == 3) {
            int version8 = 144000 * i4;
            return (version8 / i5) + i6;
        }
        int version9 = layer == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000;
        return ((version9 * i4) / i5) + i6;
    }

    private void A03(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A04 = i6;
    }
}
