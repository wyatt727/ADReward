package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.webkit.JavascriptInterface;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class OC {
    public static byte[] A03;
    public final View.OnClickListener A00;
    public final View A01;

    @Nullable
    public final OB A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-70, -60, -41, -58, -53, -92, -47, -57, -84, -47, -42, -41, -60, -49, -49, -25, -34, -13, -34, -16, -32, -17, -26, -19, -15, -73, -13, -34, -17, -99, -32, -23, -26, -32, -24, -58, -21, -15, -30, -17, -32, -30, -19, -15, -30, -31, -99, -70, -99, -29, -34, -23, -16, -30, -72, -29, -14, -21, -32, -15, -26, -20, -21, -99, -26, -21, -15, -64, -23, -24, -91, -34, -21, -32, -27, -20, -17, -16, -90, -99, -8, -29, -20, -17, -91, -13, -34, -17, -99, -26, -99, -70, -99, -83, -72, -99, -26, -99, -71, -99, -34, -21, -32, -27, -20, -17, -16, -85, -23, -30, -21, -28, -15, -27, -72, -99, -26, -88, -88, -90, -99, -8, -13, -34, -17, -99, -34, -21, -32, -27, -20, -17, -99, -70, -99, -34, -21, -32, -27, -20, -17, -16, -40, -26, -38, -72, -34, -21, -32, -27, -20, -17, -85, -17, -30, -22, -20, -13, -30, -66, -15, -15, -17, -26, -33, -14, -15, -30, -91, -92, -25, -16, -34, -32, -15, -26, -20, -21, -92, -90, -72, -99, -99, -99, -99, -99, -99, -34, -21, -32, -27, -20, -17, -85, -20, -21, -32, -23, -26, -32, -24, -99, -70, -99, -29, -14, -21, -32, -15, -26, -20, -21, -91, -90, -99, -8, -44, -34, -15, -32, -27, -66, -21, -31, -58, -21, -16, -15, -34, -23, -23, -85, -20, -21, -64, -23, -26, -32, -24, -91, -90, -72, -6, -72, -32, -23, -26, -32, -24, -58, -21, -15, -30, -17, -32, -30, -19, -15, -30, -31, -99, -70, -99, -15, -17, -14, -30, -72, -99, -6, -99, -6, -99, -13, -34, -17, -99, -26, -21, -15, -64, -15, -34, -58, -31, -16, -99, -70, -99, -40, -92, -58, -29, -62, -32, -14, -30, -92, -87, -99, -92, -45, -29, -51, -19, -24, -31, -86, -55, -28, -33, -16, -48, -30, -99, -45, -29, -51, -19, -24, -31, -86, -55, -28, -33, -16, -48, -30, -86, -52, -44, -43, -62, -43, -30, -86, -24, -75, -50, -19, -57, -92, -38, -72, -29, -20, -17, -91, -13, -34, -17, -99, -26, -99, -70, -99, -83, -72, -99, -26, -99, -71, -99, -26, -21, -15, -64, -15, -34, -58, -31, -16, -85, -23, -30, -21, -28, -15, -27, -72, -99, -26, -88, -88, -90, -99, -8, -99, -26, -21, -15, -64, -23, -24, -91, -31, -20, -32, -14, -22, -30, -21, -15, -85, -28, -30, -15, -62, -23, -30, -22, -30, -21, -15, -16, -65, -10, -64, -23, -34, -16, -16, -53, -34, -22, -30, -91, -26, -21, -15, -64, -15, -34, -58, -31, -16, -40, -26, -38, -90, -90, -72, -6, -99, -26, -29, -99, -91, -98, -32, -23, -26, -32, -24, -58, -21, -15, -30, -17, -32, -30, -19, -15, -30, -31, -99, -93, -93, -99, -15, -10, -19, -30, -20, -29, -99, -44, -34, -15, -32, -27, -66, -21, -31, -58, -21, -16, -15, -34, -23, -23, -85, -20, -21, -64, -23, -26, -32, -24, -58, -21, -15, -30, -17, -32, -30, -19, -15, -61, -34, -26, -23, -30, -31, -99, -98, -70, -70, -99, -97, -14, -21, -31, -30, -29, -26, -21, -30, -31, -97, -90, -99, -8, -44, -34, -15, -32, -27, -66, -21, -31, -58, -21, -16, -15, -34, -23, -23, -85, -20, -21, -64, -23, -26, -32, -24, -58, -21, -15, -30, -17, -32, -30, -19, -15, -61, -34, -26, -23, -30, -31, -91, -90, -72, -6};
    }

    public OC(View.OnClickListener onClickListener, View view, @Nullable OB ob) {
        this.A00 = onClickListener;
        this.A01 = view;
        this.A02 = ob;
    }

    public static String A00() {
        return A02(15, 560, 77);
    }

    public static String A01() {
        return A02(0, 15, 51);
    }

    @JavascriptInterface
    public void onClick() {
        this.A00.onClick(this.A01);
    }

    @JavascriptInterface
    public void onClickInterceptFailed() {
        OB ob = this.A02;
        if (ob != null) {
            ob.AB5();
        }
    }
}
