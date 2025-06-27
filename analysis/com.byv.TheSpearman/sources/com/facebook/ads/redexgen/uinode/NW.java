package com.facebook.ads.redexgen.uinode;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class NW extends RelativeLayout {
    public static MC A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public ZY A00;
    public C1207Yn A01;
    public AnonymousClass38 A02;
    public C1093Tz A03;
    public O2 A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, 22, 19, 25, 23, 9, 16, -60, -14, 5, 24, 13, 26, 9, -60, 26, 13, 9, 27, -60, 5, 8, 9, 20, 24, 9, 22, -60, 13, 23, 18, -53, 24, -60, 7, 22, 9, 5, 24, 9, 8, -60, 20, 22, 19, 20, 9, 22, 16, 29, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        int i = (int) (LD.A02 * 8.0f);
        A09 = i;
        A08 = i * 10;
        A0A = (int) (LD.A02 * 15.0f);
        A05 = new C1092Ty();
    }

    public NW(C1207Yn c1207Yn) throws IllegalStateException {
        super(c1207Yn);
        this.A01 = c1207Yn;
        AnonymousClass38 anonymousClass38 = new AnonymousClass38(c1207Yn);
        this.A02 = anonymousClass38;
        AbstractC0874Lo.A0K(anonymousClass38);
        C0691Ec c0691Ec = new C0691Ec();
        this.A00 = c0691Ec;
        c0691Ec.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C0979Pp> A01(AbstractC1310b5 abstractC1310b5) {
        if (abstractC1310b5 == null) {
            return new ArrayList<>();
        }
        List<C1G> listA14 = abstractC1310b5.A14();
        ArrayList<C0979Pp> arrayList = new ArrayList<>(listA14.size());
        for (int i = 0; i < listA14.size(); i++) {
            arrayList.add(new C0979Pp(i, listA14.size(), listA14.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(V2 v2, int i) {
        ArrayList<C0979Pp> arrayListA01 = A01(v2.A0z());
        this.A02.setCardsInfo(arrayListA01);
        C1093Tz c1093Tz = new C1093Tz(this.A01, arrayListA01, v2.A0z(), this.A01.A01().A09(), v2, A05, v2.A0z().A12(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A03 = c1093Tz;
        this.A02.setAdapter(c1093Tz);
        this.A03.A0F(i - A08, 16, 0);
        this.A03.A06();
        setupDotsLayout(v2, arrayListA01);
    }

    public final void A06(RE re) {
        C1093Tz c1093Tz = this.A03;
        if (c1093Tz != null) {
            c1093Tz.A0G(re);
        } else {
            this.A01.A07().A9a(A00(51, 7, 29), C8A.A1v, new C8B(A00(0, 51, 45)));
        }
        this.A02.A1y(re);
    }

    public static MC getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1093Tz c1093Tz;
        if (z && (c1093Tz = this.A03) != null) {
            c1093Tz.A0F((i3 - i) - A08, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        O2 o2 = this.A04;
        if (o2 != null) {
            o2.A00(i);
        }
    }

    private void setupDotsLayout(V2 v2, ArrayList<C0979Pp> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C1091Tx(this));
        O2 o2 = new O2(this.A01, v2.A0z().A0w().A01(), arrayList.size());
        this.A04 = o2;
        AbstractC0874Lo.A0K(o2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
