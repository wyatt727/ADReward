package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class ZY extends AbstractC04764r {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public C0690Eb A00;
    public Scroller A01;
    public final AbstractC04784t A02 = new ZZ(this);

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, 15, 16, -3, 10, -1, 1, -68, 11, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 15, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(AbstractC04734o abstractC04734o, int i, int i2);

    public abstract View A0D(AbstractC04734o abstractC04734o);

    @Deprecated
    public abstract C1232Zn A0E(AbstractC04734o abstractC04734o);

    public abstract int[] A0H(AbstractC04734o abstractC04734o, View view);

    static {
        A09();
    }

    private final C1232Zn A05(AbstractC04734o abstractC04734o) {
        return A0E(abstractC04734o);
    }

    private void A07() {
        this.A00.A1g(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1f(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 103));
    }

    private boolean A0A(AbstractC04734o abstractC04734o, int i, int i2) {
        C1232Zn c1232ZnA05;
        if (!(abstractC04734o instanceof AnonymousClass50) || (c1232ZnA05 = A05(abstractC04734o)) == null) {
            return false;
        }
        int iA0C = A0C(abstractC04734o, i, i2);
        String[] strArr = A04;
        if (strArr[0].charAt(25) == strArr[7].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
        strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
        if (iA0C == -1) {
            return false;
        }
        c1232ZnA05.A0A(iA0C);
        abstractC04734o.A1L(c1232ZnA05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04764r
    public final boolean A0B(int i, int i2) {
        AbstractC04734o layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i2);
    }

    public final void A0F() {
        AbstractC04734o layoutManager;
        View viewA0D;
        C0690Eb c0690Eb = this.A00;
        if (c0690Eb == null || (layoutManager = c0690Eb.getLayoutManager()) == null || (viewA0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] iArrA0H = A0H(layoutManager, viewA0D);
        if (iArrA0H[0] != 0 || iArrA0H[1] != 0) {
            this.A00.A1c(iArrA0H[0], iArrA0H[1]);
        }
    }

    public final void A0G(C0690Eb c0690Eb) throws IllegalStateException {
        C0690Eb c0690Eb2 = this.A00;
        if (c0690Eb2 == c0690Eb) {
            return;
        }
        if (c0690Eb2 != null) {
            A07();
        }
        this.A00 = c0690Eb;
        if (c0690Eb != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
