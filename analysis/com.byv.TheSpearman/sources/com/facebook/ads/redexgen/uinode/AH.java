package com.facebook.ads.redexgen.uinode;

import android.util.Pair;

/* loaded from: assets/audience_network.dex */
public abstract class AH {
    public static String[] A00 = {"PM7DSx0y0lrec1UT4WPnkT9xVE7xO4Q3", "BEgdeY8scYjWDgLVGs4ZUut3Hirr2MX3", "ZAPPhI63uMybzXuqxrZ5dKdt3S18BPE9", "MM2rXOZDxF7k2VlV9Dcr24aSmfbMyxXV", "eywYp4IUfN7s09w4sjk3CdaIEMxiykZ2", "eISkZjTp9yJ8vcJJgc2cD29HnvZjEHrc", "bxIeMq2jLgGDMU", "MX4WpiU2EnoJ87vmil9r758WOfjNIsLN"};
    public static final AH A01 = new Y3();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract AF A0A(int i, AF af, boolean z);

    public abstract AG A0D(int i, AG ag, boolean z, long j);

    public int A02(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A06(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                if (i == A06(z)) {
                    return A05(z);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A03(int i, AF af, AG ag, int i2, boolean z) {
        int i3 = A09(i, af).A00;
        int windowIndex = A0B(i3, ag).A01;
        if (windowIndex == i) {
            int iA02 = A02(i3, i2, z);
            if (A00[1].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A00[5] = "vHlQRfGLACzPc9SqhGGMQS9yx8mDrtQw";
            if (iA02 == -1) {
                return -1;
            }
            AG agA0B = A0B(iA02, ag);
            int nextWindowIndex = A00[6].length();
            if (nextWindowIndex == 14) {
                A00[5] = "g3EvwHO3x67yk3ScCmOHXM9FC4inpbOU";
                int windowIndex2 = agA0B.A00;
                return windowIndex2;
            }
            String[] strArr = A00;
            strArr[4] = "oJT8BcC7iC9ashzghnGVZpN5rOviRVye";
            strArr[3] = "BXJ5tQfk704SS2XTm0iOlKfvNFhc4WVf";
            int windowIndex3 = agA0B.A00;
            return windowIndex3;
        }
        int windowIndex4 = i + 1;
        return windowIndex4;
    }

    public int A05(boolean z) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(AG ag, AF af, int i, long j) {
        return A08(ag, af, i, j, 0L);
    }

    public final Pair<Integer, Long> A08(AG ag, AF af, int i, long j, long j2) {
        AbstractC0763Ha.A00(i, 0, A01());
        A0D(i, ag, false, j2);
        if (j == -9223372036854775807L) {
            j = ag.A01();
            if (A00[5].charAt(22) != '9') {
                throw new RuntimeException();
            }
            A00[0] = "jYNh2aRlntxjcST03zipQODHWrcZ3Q9N";
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = ag.A00;
        long jA03 = ag.A03() + j;
        long jA07 = A09(i2, af).A07();
        while (jA07 != -9223372036854775807L && jA03 >= jA07) {
            int i3 = ag.A01;
            if (A00[1].charAt(27) == 'r') {
                String[] strArr = A00;
                strArr[7] = "IuvzXoPM3cIs3JU7ThgGmV6LQ39mYtz4";
                strArr[2] = "DGRaGmTIVAXEwTC12jYPgBDTgoVWDlIc";
                if (i2 >= i3) {
                    break;
                }
                jA03 -= jA07;
                i2++;
                jA07 = A09(i2, af).A07();
            } else {
                throw new RuntimeException();
            }
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(jA03));
    }

    public final AF A09(int i, AF af) {
        return A0A(i, af, false);
    }

    public final AG A0B(int i, AG ag) {
        return A0C(i, ag, false);
    }

    public final AG A0C(int i, AG ag, boolean z) {
        return A0D(i, ag, z, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i, AF af, AG ag, int i2, boolean z) {
        return A03(i, af, ag, i2, z) == -1;
    }
}
