package kotlin.collections;

import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UArraySorting.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m1518partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM1138getw2LRezQ = UByteArray.m1138getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM1138getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m1138getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m1138getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM1138getw2LRezQ2 = UByteArray.m1138getw2LRezQ(bArr, i);
                UByteArray.m1143setVurrAj0(bArr, i, UByteArray.m1138getw2LRezQ(bArr, i2));
                UByteArray.m1143setVurrAj0(bArr, i2, bM1138getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m1522quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM1518partition4UcCI2c = m1518partition4UcCI2c(bArr, i, i2);
        int i3 = iM1518partition4UcCI2c - 1;
        if (i < i3) {
            m1522quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM1518partition4UcCI2c < i2) {
            m1522quickSort4UcCI2c(bArr, iM1518partition4UcCI2c, i2);
        }
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m1519partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM1401getMh2AYeg = UShortArray.m1401getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM1401getMh2AYeg = UShortArray.m1401getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM1401getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM1401getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m1401getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM1401getMh2AYeg2 = UShortArray.m1401getMh2AYeg(sArr, i);
                UShortArray.m1406set01HTLdE(sArr, i, UShortArray.m1401getMh2AYeg(sArr, i2));
                UShortArray.m1406set01HTLdE(sArr, i2, sM1401getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m1523quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM1519partitionAa5vz7o = m1519partitionAa5vz7o(sArr, i, i2);
        int i3 = iM1519partitionAa5vz7o - 1;
        if (i < i3) {
            m1523quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM1519partitionAa5vz7o < i2) {
            m1523quickSortAa5vz7o(sArr, iM1519partitionAa5vz7o, i2);
        }
    }

    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m1520partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM1217getpVg5ArA = UIntArray.m1217getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(UIntArray.m1217getpVg5ArA(iArr, i) ^ Integer.MIN_VALUE, iM1217getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(UIntArray.m1217getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, iM1217getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM1217getpVg5ArA2 = UIntArray.m1217getpVg5ArA(iArr, i);
                UIntArray.m1222setVXSXFK8(iArr, i, UIntArray.m1217getpVg5ArA(iArr, i2));
                UIntArray.m1222setVXSXFK8(iArr, i2, iM1217getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m1524quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM1520partitionoBK06Vg = m1520partitionoBK06Vg(iArr, i, i2);
        int i3 = iM1520partitionoBK06Vg - 1;
        if (i < i3) {
            m1524quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM1520partitionoBK06Vg < i2) {
            m1524quickSortoBK06Vg(iArr, iM1520partitionoBK06Vg, i2);
        }
    }

    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m1517partitionnroSd4(long[] jArr, int i, int i2) {
        long jM1296getsVKNKU = ULongArray.m1296getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(ULongArray.m1296getsVKNKU(jArr, i) ^ Long.MIN_VALUE, jM1296getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(ULongArray.m1296getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, jM1296getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM1296getsVKNKU2 = ULongArray.m1296getsVKNKU(jArr, i);
                ULongArray.m1301setk8EXiF4(jArr, i, ULongArray.m1296getsVKNKU(jArr, i2));
                ULongArray.m1301setk8EXiF4(jArr, i2, jM1296getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m1521quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM1517partitionnroSd4 = m1517partitionnroSd4(jArr, i, i2);
        int i3 = iM1517partitionnroSd4 - 1;
        if (i < i3) {
            m1521quickSortnroSd4(jArr, i, i3);
        }
        if (iM1517partitionnroSd4 < i2) {
            m1521quickSortnroSd4(jArr, iM1517partitionnroSd4, i2);
        }
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m1526sortArray4UcCI2c(byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1522quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m1527sortArrayAa5vz7o(short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1523quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m1528sortArrayoBK06Vg(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1524quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m1525sortArraynroSd4(long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1521quickSortnroSd4(array, i, i2 - 1);
    }
}
