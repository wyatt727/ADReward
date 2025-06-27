package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class BQ extends C1043Sb {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public BQ(C04513r c04513r, int i, List<C0979Pp> list, RE re, Bundle bundle) {
        super(c04513r, i, list, re, bundle);
        c04513r.A1f(this);
        this.A03 = new U0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int iA23 = this.A0C.A23();
        if (this.A05 == null || iA23 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (iA23 < curPos - 1) {
            int curPos2 = iA23 + 1;
            A0U(curPos2);
        }
    }

    private void A01(int i) {
        int visibleItem = this.A0C.A24();
        int lastVisibleItem = this.A0C.A25();
        int firstVisibleItem = this.A0C.A23();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1043Sb, com.facebook.ads.redexgen.uinode.AbstractC04784t
    public final void A0L(C0690Eb c0690Eb, int i) {
    }

    @Override // com.facebook.ads.redexgen.uinode.C1043Sb, com.facebook.ads.redexgen.uinode.AbstractC04784t
    public final void A0M(C0690Eb c0690Eb, int i, int i2) {
        if (this.A0C.A23() != -1) {
            TS ts = (TS) this.A0C.A1m(this.A0C.A23());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (ts != null && ts.A18() && !ts.A17()) {
                ts.A15();
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C1043Sb
    public final void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1043Sb
    public final void A0Z(TS ts, boolean z) {
        A0X(ts, z);
        if (!z && ts.A17()) {
            ts.A14();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C1043Sb
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final RE A0b() {
        return this.A04;
    }

    public final void A0c(RE re) {
        this.A04 = re;
    }

    public final void A0d(List<C0979Pp> list) {
        this.A05 = list;
    }
}
