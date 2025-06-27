package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class Q5 {
    public ViewOnClickListenerC1079Tl A00;
    public final C1C A01;
    public final C1N A02;
    public final C1R A03;
    public final C03821a A04;
    public final C1207Yn A05;
    public final JA A06;
    public static String[] A07 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A0A = (int) (LD.A02 * 4.0f);
    public static final int A08 = (int) (LD.A02 * 72.0f);
    public static final int A09 = (int) (LD.A02 * 8.0f);

    public Q5(C1207Yn c1207Yn, J2 j2, AbstractC1310b5 abstractC1310b5) {
        this.A05 = c1207Yn;
        this.A06 = new JA(abstractC1310b5.A12(), j2);
        this.A01 = abstractC1310b5.A0w();
        this.A02 = abstractC1310b5.A0x().A0E();
        this.A04 = abstractC1310b5.A10();
        this.A03 = abstractC1310b5.A0x().A0G();
    }

    private View A00(ViewOnClickListenerC1079Tl viewOnClickListenerC1079Tl) {
        O9 o9 = new O9(this.A05, this.A01.A01(), true, false, false);
        o9.A03(this.A02.A06(), this.A02.A01(), null, false, true);
        o9.setAlignment(17);
        O3 o3 = new O3(this.A05);
        AbstractC0874Lo.A0M(o3, 0);
        o3.setRadius(50);
        new AsyncTaskC1084Tq(o3, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = A08;
        linearLayout.addView(o3, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A09;
        imageParams.setMargins(0, i2, 0, i2);
        linearLayout.addView(o9, imageParams);
        if (viewOnClickListenerC1079Tl != null) {
            AbstractC0874Lo.A0J(viewOnClickListenerC1079Tl);
            linearLayout.addView(viewOnClickListenerC1079Tl, imageParams);
            if (TextUtils.isEmpty(viewOnClickListenerC1079Tl.getText())) {
                AbstractC0874Lo.A0H(viewOnClickListenerC1079Tl);
            }
        }
        return linearLayout;
    }

    private C0690Eb A01() {
        C0690Eb c0690Eb = new C0690Eb(this.A05);
        c0690Eb.setLayoutManager(new C1233Zo(this.A05, 0, false));
        c0690Eb.setAdapter(new SM(this.A05, this.A03.A01(), A0A, this.A00));
        return c0690Eb;
    }

    private final Q4 A02() {
        if (!this.A03.A01().isEmpty()) {
            return Q4.A04;
        }
        Q4 q4 = Q4.A03;
        String[] strArr = A07;
        if (strArr[3].charAt(8) == strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        A07[4] = "qwlEjiYhEcV8j1J";
        return q4;
    }

    public final Pair<Q4, View> A03(ViewOnClickListenerC1079Tl viewOnClickListenerC1079Tl) {
        View viewA01;
        this.A00 = viewOnClickListenerC1079Tl;
        Q4 q4A02 = A02();
        switch (Q3.A00[q4A02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                ViewOnClickListenerC1079Tl viewOnClickListenerC1079Tl2 = this.A00;
                if (A07[4].length() == 15) {
                    String[] strArr = A07;
                    strArr[3] = "Oe6IO8Uak3tx5GvHWoKp5mKUb4E2rtDt";
                    strArr[7] = "t7tx5cDm578ghKblxCWBuUm65hKnqcQl";
                    viewA01 = A00(viewOnClickListenerC1079Tl2);
                    break;
                } else {
                    throw new RuntimeException();
                }
        }
        JC.A04(viewA01, this.A06, J9.A0S);
        return new Pair<>(q4A02, viewA01);
    }
}
