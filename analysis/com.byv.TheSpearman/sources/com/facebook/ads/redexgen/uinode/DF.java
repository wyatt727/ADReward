package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.google.android.exoplayer2.audio.WavUtil;
import java.io.IOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract class DF {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1153Wl A00(InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        AbstractC0763Ha.A01(interfaceC0646Bt);
        C0788Hz c0788Hz = new C0788Hz(16);
        if (DE.A00(interfaceC0646Bt, c0788Hz).A00 != IF.A08(A01(111, 4, 112))) {
            return null;
        }
        int iA02 = 0;
        interfaceC0646Bt.ADv(c0788Hz.A00, 0, 4);
        c0788Hz.A0Y(0);
        int iA08 = c0788Hz.A08();
        int iA082 = IF.A08(A01(Opcodes.MONITOREXIT, 4, 13));
        String strA01 = A01(Opcodes.IFNONNULL, 15, 13);
        if (iA08 != iA082) {
            Log.e(strA01, A01(115, 25, 27) + iA08);
            return null;
        }
        DE deA00 = DE.A00(interfaceC0646Bt, c0788Hz);
        while (deA00.A00 != IF.A08(A01(218, 4, 32))) {
            interfaceC0646Bt.A3W((int) deA00.A01);
            deA00 = DE.A00(interfaceC0646Bt, c0788Hz);
        }
        AbstractC0763Ha.A04(deA00.A01 >= 16);
        interfaceC0646Bt.ADv(c0788Hz.A00, 0, 16);
        c0788Hz.A0Y(0);
        int iA0C = c0788Hz.A0C();
        int iA0C2 = c0788Hz.A0C();
        int iA0B = c0788Hz.A0B();
        int iA0B2 = c0788Hz.A0B();
        int iA0C3 = c0788Hz.A0C();
        int iA0C4 = c0788Hz.A0C();
        int i = (iA0C2 * iA0C4) / 8;
        if (iA0C3 != i) {
            throw new C05969v(A01(57, 26, 48) + i + A01(10, 7, 62) + iA0C3);
        }
        switch (iA0C) {
            case 1:
            case WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE /* 65534 */:
                iA02 = IF.A02(iA0C4);
                break;
            case 3:
                if (iA0C4 == 32) {
                    iA02 = 4;
                    break;
                }
                break;
            default:
                Log.e(strA01, A01(Opcodes.IF_ACMPNE, 29, 30) + iA0C);
                return null;
        }
        if (iA02 == 0) {
            Log.e(strA01, A01(140, 26, 101) + iA0C4 + A01(0, 10, 35) + iA0C);
            return null;
        }
        interfaceC0646Bt.A3W(((int) deA00.A01) - 16);
        return new C1153Wl(iA0C2, iA0B, iA0B2, iA0C3, iA0C4, iA02);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{39, 97, 104, 117, 39, 115, 126, 119, 98, 39, 33, 58, 125, 117, 110, 32, 58, 123, 80, 77, 86, 83, 24, 81, 75, 24, 76, 87, 87, 24, 84, 89, 74, 95, 93, 24, 16, 70, 10, Byte.MAX_VALUE, 122, 19, 17, 24, 76, 87, 24, 75, 83, 81, 72, 3, 24, 81, 92, 2, 24, 81, 108, 100, 113, 119, 96, 113, 112, 52, 118, 120, 123, 119, Byte.MAX_VALUE, 52, 117, 120, 125, 115, 122, 121, 113, 122, 96, 46, 52, 103, 73, 64, 65, 92, 71, 64, 73, 14, 91, 64, 69, 64, 65, 89, 64, 14, 121, 111, 120, 14, 77, 70, 91, 64, 69, 20, 14, 6, 29, 18, 18, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, 31, 109, 118, 121, 121, 31, 89, 80, 77, 82, 94, 75, 5, 31, 20, 47, 50, 52, 49, 49, 46, 51, 53, 36, 37, 97, 22, 0, 23, 97, 35, 40, 53, 97, 37, 36, 49, 53, 41, 97, 111, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 26, 109, 123, 108, 26, 92, 85, 72, 87, 91, 78, 26, 78, 67, 74, 95, 0, 26, 126, 104, Byte.MAX_VALUE, 108, 126, 72, 95, 97, 76, 72, 77, 76, 91, 123, 76, 72, 77, 76, 91, 10, 15, 26, 15, 98, 105, 112, 36};
    }

    public static void A03(InterfaceC0646Bt interfaceC0646Bt, C1153Wl c1153Wl) throws InterruptedException, IOException {
        AbstractC0763Ha.A01(interfaceC0646Bt);
        AbstractC0763Ha.A01(c1153Wl);
        interfaceC0646Bt.AFM();
        C0788Hz c0788Hz = new C0788Hz(8);
        DE deA00 = DE.A00(interfaceC0646Bt, c0788Hz);
        while (deA00.A00 != IF.A08(A01(214, 4, 74))) {
            Log.w(A01(Opcodes.IFNONNULL, 15, 13), A01(83, 28, 10) + deA00.A00);
            long j = deA00.A01 + 8;
            if (deA00.A00 == IF.A08(A01(111, 4, 112))) {
                j = 12;
            }
            if (j <= 2147483647L) {
                interfaceC0646Bt.AGP((int) j);
                deA00 = DE.A00(interfaceC0646Bt, c0788Hz);
            } else {
                throw new C05969v(A01(17, 40, 28) + deA00.A00);
            }
        }
        interfaceC0646Bt.AGP(8);
        c1153Wl.A06(interfaceC0646Bt.A7i(), deA00.A01);
    }
}
