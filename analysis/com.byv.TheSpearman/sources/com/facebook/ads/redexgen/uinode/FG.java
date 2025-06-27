package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FG extends AbstractC1291am {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 112);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public FG(C1207Yn c1207Yn, C04021u c04021u) {
        super(c1207Yn, c04021u);
    }

    private C1283ae A00(Runnable runnable) {
        return new C1283ae(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final void A0M() {
        AbstractC1314b9 abstractC1314b9 = (AbstractC1314b9) this.A01;
        abstractC1314b9.A00(this.A07.A00);
        abstractC1314b9.A01(this.A07.A01);
        abstractC1314b9.A0I();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1291am
    public final void A0O(InterfaceC03710p interfaceC03710p, C8S c8s, C8Q c8q, C04031v c04031v) {
        FY fy = (FY) interfaceC03710p;
        C1284af c1284af = new C1284af(this, c04031v, fy);
        if (C0796Ih.A27(this.A0B)) {
            A0F().postDelayed(c1284af, c8s.A05().A05());
        }
        C1207Yn c1207Yn = this.A0B;
        C1283ae c1283aeA00 = A00(c1284af);
        boolean z = this.A07.A06;
        String str = this.A07.A04;
        C04021u c04021u = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        fy.A0J(c1207Yn, c1283aeA00, c04031v, z, str, c04021u.A05);
    }

    public final void A0X(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A7e() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC1314b9 rewardedVideoAdapter = (AbstractC1314b9) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
