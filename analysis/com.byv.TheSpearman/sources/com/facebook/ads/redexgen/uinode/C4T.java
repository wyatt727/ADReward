package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4T {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AnonymousClass56> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i = 0; i < size; i++) {
            View view = this.A08.get(i).A0H;
            C04744p c04744p = (C04744p) view.getLayoutParams();
            if (!c04744p.A02()) {
                int i2 = this.A01;
                int size2 = c04744p.A00();
                if (i2 == size2) {
                    A02(view);
                    return view;
                }
            }
        }
        return null;
    }

    private final View A01(View view) {
        int size = this.A08.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = this.A08.get(i2).A0H;
            C04744p c04744p = (C04744p) view3.getLayoutParams();
            if (view3 != view && !c04744p.A02()) {
                int iA00 = c04744p.A00();
                int size2 = this.A01;
                int i3 = iA00 - size2;
                int size3 = this.A03;
                int i4 = i3 * size3;
                if (i4 >= 0 && i4 < i) {
                    view2 = view3;
                    i = i4;
                    if (i4 == 0) {
                        break;
                    }
                }
            }
        }
        return view2;
    }

    private final void A02(View view) {
        View closest = A01(view);
        if (closest == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C04744p) closest.getLayoutParams()).A00();
        }
    }

    public final View A03(C04804w c04804w) {
        if (this.A08 != null) {
            return A00();
        }
        View viewA0G = c04804w.A0G(this.A01);
        this.A01 += this.A03;
        return viewA0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(AnonymousClass53 anonymousClass53) {
        int i = this.A01;
        return i >= 0 && i < anonymousClass53.A03();
    }
}
