package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1043Sb extends AbstractC04784t {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    public InterfaceC0953Op A02;
    public RE A04;
    public List<C0979Pp> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1233Zo A0C;
    public final AnonymousClass51 A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC0957Ot A0F = new C1046Se(this);
    public InterfaceC0955Or A03 = new C1045Sd(this);
    public final InterfaceC0956Os A0E = new C1044Sc(this);

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, 29, 4, 7, 16, 17, 18, 29, 20, 7, 2, 3, 13, 29, 14, -1, 16, -1, 11, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public C1043Sb(C04513r c04513r, int i, List<C0979Pp> list, RE re, Bundle bundle) {
        this.A0C = c04513r.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = re;
        this.A0D = new C1232Zn(c04513r.getContext());
        this.A0B = c04513r.getContext();
        c04513r.A1f(this);
        A0D(bundle);
    }

    private TS A03(int i, int i2) {
        return A04(i, i2, true);
    }

    private TS A04(int i, int i2, boolean z) {
        TS ts = null;
        while (i <= i2) {
            TS ts2 = (TS) this.A0C.A1m(i);
            if (ts2 == null || ts2.A17()) {
                return null;
            }
            boolean zA0a = A0a(ts2);
            int i3 = A0I[2].length();
            if (i3 != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (ts == null && ts2.A18() && zA0a && !this.A0G.contains(Integer.valueOf(i)) && (!z || A0I(ts2, this.A0A))) {
                ts = ts2;
            }
            if (ts2.A18() && !zA0a) {
                A0C(i, false);
            }
            i++;
        }
        return ts;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        TS tsA03 = A03(lastVisibleItem, firstVisibleItem);
        if (tsA03 != null) {
            tsA03.A15();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA23 = this.A0C.A23();
        if (iA23 != -1) {
            int curPos = this.A05.size();
            if (iA23 < curPos - 1) {
                int curPos2 = iA23 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        TS tsA04 = A04(i + 1, this.A0C.A25(), false);
        if (tsA04 != null) {
            tsA04.A15();
            A0U(((Integer) tsA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(OL ol, int i) {
        int allowedAreaMaxX;
        int furthestX;
        if (i != 2) {
            allowedAreaMaxX = (int) (((ol.getWidth() + LD.A03.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i2 = LD.A03.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            allowedAreaMaxX = i2 - 1;
        }
        if (i == 2) {
            furthestX = 1;
        } else {
            int i3 = LD.A03.widthPixels;
            int allowedAreaMinX = ol.getWidth();
            furthestX = (int) (((i3 - allowedAreaMinX) * 0.7f) / 2.0f);
        }
        float x = ol.getX();
        int allowedAreaMinX2 = ol.getWidth();
        return ((int) (x + ((float) allowedAreaMinX2))) <= allowedAreaMaxX && ol.getX() >= ((float) furthestX);
    }

    private boolean A0J(TS ts) {
        if (!this.A08 || !ts.A18()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04784t
    public void A0L(C0690Eb c0690Eb, int i) {
        super.A0L(c0690Eb, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04784t
    public void A0M(C0690Eb c0690Eb, int i, int i2) {
        super.A0M(c0690Eb, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i);
    }

    public final InterfaceC0955Or A0N() {
        return this.A03;
    }

    public final InterfaceC0956Os A0O() {
        return this.A0E;
    }

    public final InterfaceC0957Ot A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int i = this.A0C.A25();
        for (int iA24 = this.A0C.A24(); iA24 <= i && iA24 >= 0; iA24++) {
            TS ts = (TS) this.A0C.A1m(iA24);
            if (ts != null && ts.A17()) {
                this.A01 = iA24;
                ts.A14();
                return;
            }
        }
    }

    public final void A0R() {
        TS ts = (TS) this.A0C.A1m(this.A01);
        if (ts != null && this.A01 >= 0) {
            ts.A15();
        }
    }

    public final void A0S(int i) {
        TS ts = (TS) this.A0C.A1m(i);
        if (ts == null || A0a(ts)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0Z(ts, false);
    }

    public final void A0T(int i) {
        List<C0979Pp> list;
        TS ts = (TS) this.A0C.A1m(i);
        if (ts == null) {
            return;
        }
        if (A0a(ts)) {
            A0Z(ts, true);
        }
        if (A0J(ts) && (list = this.A05) != null) {
            this.A0F.setVolume(list.get(((Integer) ts.getTag(-1593835536)).intValue()).A03().A0D().A09() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i) {
        this.A0D.A0A(i);
        this.A0C.A1L(this.A0D);
    }

    public final void A0V(int i, int i2, int i3) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A23();
        if (recomputeFrom == -1) {
            recomputeFrom = i3 < 0 ? i : i2;
        }
        this.A02.AGp(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC0953Op interfaceC0953Op) {
        this.A02 = interfaceC0953Op;
    }

    public void A0Z(TS ts, boolean z) {
        if (A0H()) {
            A0X(ts, z);
        }
        if (z) {
            return;
        }
        boolean zA17 = ts.A17();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (zA17) {
            ts.A14();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
