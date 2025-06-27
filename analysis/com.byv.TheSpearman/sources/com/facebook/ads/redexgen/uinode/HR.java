package com.facebook.ads.redexgen.uinode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class HR {
    public static byte[] A05;
    public static String[] A06 = {"j9EfDvchdu1KqySqOAnBSG3JWHZdS12U", "q23SQ5AypNqS8oaKOX4z", "zGl30nZzPzoLIdVG6oXXe73jwI6SvYzS", "XO0PMOb8qpQh9emdWW7Vnqfuo5cp8yJy", "hg0Ynef21ksm7drJYvbGXc6C6VdsLqYq", "sq8Z8cDX36Rb5yN4ZHuInHWL1DTNPmF7", "lpBmIRRiri9NKyd9o68rlNPCbyzvIw2I", "eicGPlwUgu"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C1126Vh A00 = C1126Vh.A04;
    public final TreeSet<C1124Vf> A04 = new TreeSet<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A06[6].charAt(21) != 'N') {
                throw new RuntimeException();
            }
            A06[6] = "ipIPz5SC6v0GmkIAozZhwN70MrudeMSU";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
            i4++;
        }
    }

    public static void A02() {
        byte[] bArr = {-79, -9, -14, -6, -3, -10, -11, -65, -77, 7, 2, -77, 42, Base64.padSymbol, 70, 57, 69, 65, 70, Utf8.REPLACEMENT_BYTE, -8, 71, 62, -8};
        String[] strArr = A06;
        if (strArr[4].charAt(2) != strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A06[5] = "8leR2nWms8A7PmFgrtQ6nLfJYqb68GHr";
        A05 = bArr;
    }

    static {
        A02();
    }

    public HR(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static HR A00(int i, DataInputStream dataInputStream) throws IOException {
        HR hr = new HR(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long j = dataInputStream.readLong();
            HW hw = new HW();
            HV.A05(hw, j);
            hr.A0F(hw);
        } else {
            hr.A00 = C1126Vh.A00(dataInputStream);
        }
        return hr;
    }

    public final int A03(int i) {
        int result = this.A02;
        int i2 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long jA00 = HV.A00(this.A00);
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j, long j2) {
        C1124Vf c1124VfA06 = A06(j);
        if (c1124VfA06.A01()) {
            return -Math.min(c1124VfA06.A02() ? Long.MAX_VALUE : c1124VfA06.A01, j2);
        }
        long j3 = j + j2;
        long jMax = c1124VfA06.A02 + c1124VfA06.A01;
        if (jMax < j3) {
            TreeSet<C1124Vf> treeSet = this.A04;
            if (A06[1].length() != 20) {
                throw new RuntimeException();
            }
            A06[1] = "RgZ5bXDLk5KqdLdfFSHI";
            for (C1124Vf c1124Vf : treeSet.tailSet(c1124VfA06, false)) {
                if (c1124Vf.A02 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, c1124Vf.A02 + c1124Vf.A01);
                if (jMax >= j3) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final C1126Vh A05() {
        return this.A00;
    }

    public final C1124Vf A06(long j) {
        C1124Vf c1124VfA01 = C1124Vf.A01(this.A03, j);
        C1124Vf c1124VfFloor = this.A04.floor(c1124VfA01);
        if (c1124VfFloor != null && c1124VfFloor.A02 + c1124VfFloor.A01 > j) {
            return c1124VfFloor;
        }
        TreeSet<C1124Vf> treeSet = this.A04;
        String[] strArr = A06;
        if (strArr[2].charAt(22) != strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A06[6] = "nd2bgBSeUAsM9albd5et6NmdTACtd3AP";
        C1124Vf lookupSpan = treeSet.ceiling(c1124VfA01);
        if (lookupSpan == null) {
            return C1124Vf.A02(this.A03, j);
        }
        return C1124Vf.A03(this.A03, j, lookupSpan.A02 - j);
    }

    public final C1124Vf A07(C1124Vf c1124Vf) throws HI {
        AbstractC0763Ha.A04(this.A04.remove(c1124Vf));
        C1124Vf c1124VfA08 = c1124Vf.A08(this.A02);
        if (c1124Vf.A03.renameTo(c1124VfA08.A03)) {
            this.A04.add(c1124VfA08);
            return c1124VfA08;
        }
        throw new HI(A01(12, 12, 116) + c1124Vf.A03 + A01(8, 4, 47) + c1124VfA08.A03 + A01(0, 8, 45));
    }

    public final TreeSet<C1124Vf> A08() {
        return this.A04;
    }

    public final void A09(C1124Vf c1124Vf) {
        this.A04.add(c1124Vf);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(HO ho) {
        if (this.A04.remove(ho)) {
            ho.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(HW hw) {
        C1126Vh c1126Vh = this.A00;
        C1126Vh oldMetadata = this.A00.A08(hw);
        this.A00 = oldMetadata;
        return !oldMetadata.equals(c1126Vh);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HR hr = (HR) obj;
        if (this.A02 == hr.A02 && this.A03.equals(hr.A03) && this.A04.equals(hr.A04) && this.A00.equals(hr.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i = result * 31;
        int result2 = this.A04.hashCode();
        return i + result2;
    }
}
