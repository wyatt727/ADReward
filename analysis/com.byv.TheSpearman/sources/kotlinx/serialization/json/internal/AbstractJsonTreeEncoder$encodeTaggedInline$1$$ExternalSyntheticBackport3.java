package kotlinx.serialization.json.internal;

import kotlin.UByte$$ExternalSyntheticBackport4;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class AbstractJsonTreeEncoder$encodeTaggedInline$1$$ExternalSyntheticBackport3 {
    public static /* synthetic */ String m(long j, int i) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= iNumberOfTrailingZeros;
            } while (j != 0);
        } else {
            long jM = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : UByte$$ExternalSyntheticBackport4.m(j, i);
            long j2 = i;
            i2 = 63;
            cArr[63] = Character.forDigit((int) (j - (jM * j2)), i);
            while (jM > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (jM % j2), i);
                jM /= j2;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }
}
