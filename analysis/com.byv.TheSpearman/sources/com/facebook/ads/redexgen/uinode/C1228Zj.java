package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1228Zj implements C4B {
    public static byte[] A01;
    public static String[] A02 = {"m0v39bkLL0n2S0xNgN89hz2dGOcTpwho", "Je1TSnUfgjz87J45b10M9zAxXIUpZahJ", "5NPz60Ycb2xlrnlJbjQuqitLPDDjbzHA", "GN4TkK3T6zCNiBjoupvxTPY", "uEyRXI1LEgEguUOEBvXDLSZ", "uM6injuc1j2LJ4wHPsuMaMxVec9yzmkB", "WB5Y9xOLXhFok7BjZ8qu5ygjzkxXvdjS", "QTx8NC78KyDJtqbkFzNokRxLjqTFyIiz"};
    public final /* synthetic */ C0690Eb A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-39, -9, 2, 2, -5, -6, -74, -9, 10, 10, -9, -7, -2, -74, 5, 4, -74, -9, -74, -7, -2, -1, 2, -6, -74, 13, -2, -1, -7, -2, -74, -1, 9, -74, 4, 5, 10, -74, -6, -5, 10, -9, -7, -2, -5, -6, -48, -74, -75, -77, -66, -66, -73, -74, 114, -74, -73, -58, -77, -75, -70, 114, -63, -64, 114, -77, -64, 114, -77, -66, -60, -73, -77, -74, -53, 114, -74, -73, -58, -77, -75, -70, -73, -74, 114, -75, -70, -69, -66, -74, 114};
    }

    static {
        A01();
    }

    public C1228Zj(C0690Eb c0690Eb) {
        this.A00 = c0690Eb;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final void A3e(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass56 anonymousClass56A0F = C0690Eb.A0F(view);
        if (anonymousClass56A0F != null) {
            if (anonymousClass56A0F.A0c() || anonymousClass56A0F.A0f()) {
                anonymousClass56A0F.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 113) + anonymousClass56A0F + this.A00.A1H());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final void A57(int i) {
        AnonymousClass56 anonymousClass56A0F;
        View view = A6M(i);
        if (view != null && (anonymousClass56A0F = C0690Eb.A0F(view)) != null) {
            if (!anonymousClass56A0F.A0c() || anonymousClass56A0F.A0f()) {
                anonymousClass56A0F.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 45) + anonymousClass56A0F + this.A00.A1H());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final View A6M(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final int A6N() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final AnonymousClass56 A6Q(View view) {
        return C0690Eb.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final int A8n(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final void ABQ(View view) {
        AnonymousClass56 anonymousClass56A0F = C0690Eb.A0F(view);
        if (anonymousClass56A0F != null) {
            anonymousClass56A0F.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final void ABx(View view) {
        AnonymousClass56 anonymousClass56A0F = C0690Eb.A0F(view);
        if (anonymousClass56A0F != null) {
            anonymousClass56A0F.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final void AF6() {
        int iA6N = A6N();
        for (int i = 0; i < iA6N; i++) {
            View viewA6M = A6M(i);
            this.A00.A1e(viewA6M);
            viewA6M.clearAnimation();
        }
        this.A00.removeAllViews();
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[4];
        int length = str.length();
        int count = str2.length();
        if (length != count) {
            throw new RuntimeException();
        }
        A02[2] = "YVtNrV2twtC96zFGqk3M5li58NeZhLji";
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final void AFA(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1e(childAt);
            childAt.clearAnimation();
        }
        C0690Eb c0690Eb = this.A00;
        if (A02[2].charAt(25) == 'R') {
            throw new RuntimeException();
        }
        A02[2] = "BurwQQkBxJzMJJK1acCycPqXpvrCcXzS";
        c0690Eb.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4B
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1d(view);
    }
}
