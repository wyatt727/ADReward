package com.facebook.ads.redexgen.uinode;

import com.google.firebase.FirebaseError;
import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class XY implements CC {
    public static String[] A01 = {"cA81LRwoTzcve7g2gal3SHsO5RpkStuT", "HY7LDrqVa1CzvC", "zY79826fIu21GjmhijN8oURrhAN", "4NGXPp5NfQjrc3", "ovBDT1slbTWNCc5DYQuZuX28cbmG3x7K", "z33Wt0yG1C", "O7hCLPdtydyuzpHeSDPli", "jT4PoZwvtmuWxxhbTxLAMWdZ0blfztoL"};
    public final /* synthetic */ XX A00;

    public XY(XX xx) {
        this.A00 = xx;
    }

    public /* synthetic */ XY(XX xx, XZ xz) {
        this(xx);
    }

    @Override // com.facebook.ads.redexgen.uinode.CC
    public final void A42(int i, int i2, InterfaceC0646Bt interfaceC0646Bt) throws InterruptedException, IOException {
        this.A00.A0K(i, i2, interfaceC0646Bt);
    }

    @Override // com.facebook.ads.redexgen.uinode.CC
    public final void A5X(int i) throws C05969v {
        this.A00.A0I(i);
    }

    @Override // com.facebook.ads.redexgen.uinode.CC
    public final void A5j(int i, double d) throws C05969v {
        this.A00.A0J(i, d);
    }

    @Override // com.facebook.ads.redexgen.uinode.CC
    public final int A6s(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.PUTSTATIC /* 179 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.NEW /* 187 */:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                String[] strArr = A01;
                if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                    return 1;
                }
                A01[5] = "4ZA2yiGdfT";
                return 1;
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case Opcodes.PUTFIELD /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A01;
                strArr3[3] = "A0F96KoNVxfWhV";
                strArr3[1] = "rSsOYvpjEgBieI";
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.CC
    public final void A8t(int i, long j) throws C05969v {
        this.A00.A0L(i, j);
    }

    @Override // com.facebook.ads.redexgen.uinode.CC
    public final boolean A96(int i) {
        if (i != 357149030) {
            String[] strArr = A01;
            if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "Ilmt4jALIzqx0lfXFDaP1";
            strArr2[2] = "tghZobaFhWpPPaOkqTUwEke2jaY";
            if (i != 524531317 && i != 475249515 && i != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.CC
    public final void AGU(int i, long j, long j2) throws C05969v {
        this.A00.A0M(i, j, j2);
    }

    @Override // com.facebook.ads.redexgen.uinode.CC
    public final void AGc(int i, String str) throws C05969v {
        this.A00.A0N(i, str);
    }
}
