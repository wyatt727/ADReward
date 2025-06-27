package com.bytedance.sdk.component.mZx.EYQ.mZx;

import com.json.t2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: ByteString.java */
/* loaded from: classes2.dex */
public class Pm implements Serializable, Comparable<Pm> {
    transient String IPb;
    transient int Kbd;
    final byte[] Pm;
    static final char[] EYQ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset mZx = Charset.forName(C.UTF8_NAME);
    public static final Pm Td = EYQ(new byte[0]);

    Pm(byte[] bArr) {
        this.Pm = bArr;
    }

    public static Pm EYQ(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new Pm((byte[]) bArr.clone());
    }

    public String EYQ() {
        String str = this.IPb;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.Pm, mZx);
        this.IPb = str2;
        return str2;
    }

    public String mZx() {
        byte[] bArr = this.Pm;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = EYQ;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public Pm EYQ(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.Pm;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.Pm.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new Pm(bArr2);
    }

    public byte EYQ(int i) {
        return this.Pm[i];
    }

    public int Td() {
        return this.Pm.length;
    }

    public byte[] Pm() {
        return (byte[]) this.Pm.clone();
    }

    public boolean EYQ(int i, Pm pm, int i2, int i3) {
        return pm.EYQ(i2, this.Pm, i, i3);
    }

    public boolean EYQ(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.Pm;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && HX.EYQ(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Pm) {
            Pm pm = (Pm) obj;
            int iTd = pm.Td();
            byte[] bArr = this.Pm;
            if (iTd == bArr.length && pm.EYQ(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.Kbd;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.Pm);
        this.Kbd = iHashCode;
        return iHashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public int compareTo(Pm pm) {
        int iTd = Td();
        int iTd2 = pm.Td();
        int iMin = Math.min(iTd, iTd2);
        for (int i = 0; i < iMin; i++) {
            int iEYQ = EYQ(i) & 255;
            int iEYQ2 = pm.EYQ(i) & 255;
            if (iEYQ != iEYQ2) {
                return iEYQ < iEYQ2 ? -1 : 1;
            }
        }
        if (iTd == iTd2) {
            return 0;
        }
        return iTd < iTd2 ? -1 : 1;
    }

    public String toString() {
        if (this.Pm.length == 0) {
            return "[size=0]";
        }
        String strEYQ = EYQ();
        int iEYQ = EYQ(strEYQ, 64);
        if (iEYQ == -1) {
            if (this.Pm.length <= 64) {
                return "[hex=" + mZx() + t2.i.e;
            }
            return "[size=" + this.Pm.length + " hex=" + EYQ(0, 64).mZx() + "…]";
        }
        String strReplace = strEYQ.substring(0, iEYQ).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iEYQ >= strEYQ.length()) {
            return "[text=" + strReplace + t2.i.e;
        }
        return "[size=" + this.Pm.length + " text=" + strReplace + "…]";
    }

    static int EYQ(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
