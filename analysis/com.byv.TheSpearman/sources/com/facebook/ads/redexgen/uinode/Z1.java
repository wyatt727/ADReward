package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class Z1 {
    public static byte[] A02;
    public static final String A03;
    public final AnonymousClass66 A00;
    public final C05126c A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, 69, 56, Utf8.REPLACEMENT_BYTE, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, 13, -13, -8, 70, 25, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, Utf8.REPLACEMENT_BYTE, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = Z1.class.getSimpleName();
    }

    public Z1(AnonymousClass66 anonymousClass66, C1206Ym c1206Ym) {
        this.A00 = anonymousClass66;
        anonymousClass66.A3P(new Z3(this));
        this.A01 = new C05126c(c1206Ym);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A62().size()));
        }
        for (AnonymousClass69 anonymousClass69 : this.A00.A62()) {
            switch (AnonymousClass65.A00[anonymousClass69.A8D().ordinal()]) {
                case 1:
                    A04(anonymousClass69.getUrl());
                    break;
                case 2:
                    A06(anonymousClass69.getUrl());
                    break;
                case 3:
                    A05(anonymousClass69.getUrl());
                    break;
            }
        }
        this.A01.A0W(new Z2(this), new C6V(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C05106a c05106a = new C05106a(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c05106a.A01 = A00(117, 8, 90);
        this.A01.A0b(c05106a);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C6Y c6y = new C6Y(str, A00(81, 36, 11), A00(125, 7, 46));
        c6y.A04 = true;
        c6y.A02 = A00(117, 8, 90);
        this.A01.A0X(c6y);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C6Y c6y = new C6Y(str, A00(81, 36, 11), A00(125, 7, 46));
        c6y.A04 = false;
        c6y.A02 = A00(117, 8, 90);
        this.A01.A0a(c6y);
    }
}
