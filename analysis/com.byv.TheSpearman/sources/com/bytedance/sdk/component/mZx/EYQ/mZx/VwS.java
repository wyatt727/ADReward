package com.bytedance.sdk.component.mZx.EYQ.mZx;

import java.util.Arrays;

/* compiled from: SegmentedByteString.java */
/* loaded from: classes2.dex */
final class VwS extends Pm {
    final transient int[] QQ;
    final transient byte[][] VwS;

    VwS(EYQ eyq, int i) {
        super(null);
        HX.EYQ(eyq.mZx, 0L, i);
        Kbd kbd = eyq.EYQ;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (kbd.Td == kbd.mZx) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += kbd.Td - kbd.mZx;
            i4++;
            kbd = kbd.IPb;
        }
        this.VwS = new byte[i4][];
        this.QQ = new int[i4 * 2];
        Kbd kbd2 = eyq.EYQ;
        int i5 = 0;
        while (i2 < i) {
            this.VwS[i5] = kbd2.EYQ;
            i2 += kbd2.Td - kbd2.mZx;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.QQ;
            iArr[i5] = i2;
            iArr[this.VwS.length + i5] = kbd2.mZx;
            kbd2.Pm = true;
            i5++;
            kbd2 = kbd2.IPb;
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public String EYQ() {
        return Kbd().EYQ();
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public String mZx() {
        return Kbd().mZx();
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public Pm EYQ(int i, int i2) {
        return Kbd().EYQ(i, i2);
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public byte EYQ(int i) {
        HX.EYQ(this.QQ[this.VwS.length - 1], i, 1L);
        int iMZx = mZx(i);
        int i2 = iMZx == 0 ? 0 : this.QQ[iMZx - 1];
        int[] iArr = this.QQ;
        byte[][] bArr = this.VwS;
        return bArr[iMZx][(i - i2) + iArr[bArr.length + iMZx]];
    }

    private int mZx(int i) {
        int iBinarySearch = Arrays.binarySearch(this.QQ, 0, this.VwS.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public int Td() {
        return this.QQ[this.VwS.length - 1];
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public byte[] Pm() {
        int[] iArr = this.QQ;
        byte[][] bArr = this.VwS;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.QQ;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.VwS[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public boolean EYQ(int i, Pm pm, int i2, int i3) {
        if (i < 0 || i > Td() - i3) {
            return false;
        }
        int iMZx = mZx(i);
        while (i3 > 0) {
            int i4 = iMZx == 0 ? 0 : this.QQ[iMZx - 1];
            int iMin = Math.min(i3, ((this.QQ[iMZx] - i4) + i4) - i);
            int[] iArr = this.QQ;
            byte[][] bArr = this.VwS;
            if (!pm.EYQ(i2, bArr[iMZx], (i - i4) + iArr[bArr.length + iMZx], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iMZx++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public boolean EYQ(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > Td() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iMZx = mZx(i);
        while (i3 > 0) {
            int i4 = iMZx == 0 ? 0 : this.QQ[iMZx - 1];
            int iMin = Math.min(i3, ((this.QQ[iMZx] - i4) + i4) - i);
            int[] iArr = this.QQ;
            byte[][] bArr2 = this.VwS;
            if (!HX.EYQ(bArr2[iMZx], (i - i4) + iArr[bArr2.length + iMZx], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iMZx++;
        }
        return true;
    }

    private Pm Kbd() {
        return new Pm(Pm());
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Pm) {
            Pm pm = (Pm) obj;
            if (pm.Td() == Td() && EYQ(0, pm, 0, Td())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public int hashCode() {
        int i = this.Kbd;
        if (i != 0) {
            return i;
        }
        int length = this.VwS.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.VwS[i2];
            int[] iArr = this.QQ;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.Kbd = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx.Pm
    public String toString() {
        return Kbd().toString();
    }
}
