package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class IA {
    public static String[] A07 = {"5DRquCQGg5fv0P6nja7IsOodPXBGhUeG", "CLJKgVN4XJask5diLy7MGSBxba0Pch5a", "wHftqcE0jDwIdOqBDBC3mNx0B5SBQznZ", "ol9v552kFRhJ1T6A32CtEuz", "A1CuUzQu9jwyUqSqJ17msfwDUTn6GREa", "TbNgrGyLzvQfDvkF0WCoqwQu2K", "lR0XC8VxWttqZJTwOmQs4gh4fjIE6f", "2mBuumTUpjmiSXNoBcdi8fBRoWPOanRf"};
    public static final Comparator<I9> A08 = new I7();
    public static final Comparator<I9> A09 = new I8();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final I9[] A06 = new I9[5];
    public final ArrayList<I9> A05 = new ArrayList<>();
    public int A00 = -1;

    public IA(int i) {
        this.A04 = i;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A02(float f) {
        A01();
        float f2 = this.A03 * f;
        int i = 0;
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            I9 i9 = this.A05.get(i2);
            i += i9.A02;
            float desiredWeight = i;
            if (desiredWeight >= f2) {
                float desiredWeight2 = i9.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<I9> arrayList = this.A05;
        int size = arrayList.size();
        int accumulatedWeight = A07[3].length();
        if (accumulatedWeight == 12) {
            throw new RuntimeException();
        }
        A07[3] = "XkLaJBoD11zWycQ";
        float desiredWeight3 = arrayList.get(size - 1).A00;
        return desiredWeight3;
    }

    public final void A03(int i, float f) {
        I9 oldestSample;
        A00();
        int i2 = this.A02;
        if (i2 > 0) {
            I9[] i9Arr = this.A06;
            int i3 = i2 - 1;
            this.A02 = i3;
            oldestSample = i9Arr[i3];
        } else {
            oldestSample = new I9(null);
        }
        int i4 = this.A01;
        this.A01 = i4 + 1;
        oldestSample.A01 = i4;
        oldestSample.A02 = i;
        oldestSample.A00 = f;
        this.A05.add(oldestSample);
        this.A03 += i;
        while (true) {
            int i5 = this.A03;
            int i6 = this.A04;
            if (i5 > i6) {
                int excessWeight = i5 - i6;
                I9 i9 = this.A05.get(0);
                if (i9.A02 <= excessWeight) {
                    int i7 = this.A03;
                    int i8 = i9.A02;
                    if (A07[5].length() != 26) {
                        throw new RuntimeException();
                    }
                    A07[6] = "uvvU8EqEwFGMOcNu2z1EziqDegtCkn";
                    this.A03 = i7 - i8;
                    this.A05.remove(0);
                    int excessWeight2 = this.A02;
                    if (excessWeight2 < 5) {
                        I9[] i9Arr2 = this.A06;
                        this.A02 = excessWeight2 + 1;
                        i9Arr2[excessWeight2] = i9;
                    }
                } else {
                    i9.A02 -= excessWeight;
                    this.A03 -= excessWeight;
                }
            } else {
                return;
            }
        }
    }
}
