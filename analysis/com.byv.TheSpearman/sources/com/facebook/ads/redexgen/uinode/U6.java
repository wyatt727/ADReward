package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class U6 extends AbstractC0900Mo {
    public static final int A03 = (int) (LD.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2S A01;
    public final C1207Yn A02;

    public U6(C1207Yn c1207Yn, J2 j2, String str, C03821a c03821a, MD md, MC mc) {
        super(c1207Yn, j2, str, c03821a, md, mc);
        this.A02 = c1207Yn;
        this.A01 = C2T.A00(c1207Yn.A01());
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A00 = relativeLayout;
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC0874Lo.A0M(relativeLayout, -1728053248);
        relativeLayout.setOnClickListener(new ViewOnClickListenerC0905Mt(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            AbstractC0874Lo.A0V(this, transitionSet);
            return;
        }
        AbstractC0874Lo.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0900Mo
    public final void A0L() {
        C2W c2wA0A = this.A01.A0A();
        N3 n3 = new N3(this.A02);
        n3.setInfo(EnumC0882Lw.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        n3.setOnClickListener(new ViewOnClickListenerC0906Mu(this));
        C2W c2wA0B = this.A01.A0B();
        N3 n32 = new N3(this.A02);
        n32.setInfo(EnumC0882Lw.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        n32.setOnClickListener(new ViewOnClickListenerC0907Mv(this));
        N3 n33 = new N3(this.A02);
        n33.setInfo(EnumC0882Lw.AD_CHOICES_ICON, this.A01.A0M(), "");
        n33.setOnClickListener(new ViewOnClickListenerC0908Mw(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i = A03;
        linearLayout.setPadding(i * 2, i, i * 2, i);
        AbstractC0874Lo.A0M(linearLayout, -1);
        if (!c2wA0A.A05().isEmpty()) {
            linearLayout.addView(n3, layoutParams);
        }
        if (!c2wA0B.A05().isEmpty()) {
            linearLayout.addView(n32, layoutParams);
        }
        linearLayout.addView(n33, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0900Mo
    public final void A0M() {
        AbstractC0874Lo.A0I(this);
        this.A00.removeAllViews();
        AbstractC0874Lo.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0900Mo
    public final void A0N(C2W c2w, C2U c2u) {
        String strA0E;
        int i;
        if (c2u == C2U.A04) {
            return;
        }
        boolean z = c2u == C2U.A05;
        C0898Mm c0898Mm = new C0898Mm(this.A02, this.A0B);
        if (z) {
            strA0E = this.A01.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C0898Mm c0898MmA0E = c0898Mm.A0I(strA0E).A0H(this.A01.A0D()).A0F(c2w.A04()).A0E(z ? EnumC0882Lw.REPORT_AD : EnumC0882Lw.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C0899Mn adHiddenView = c0898MmA0E.A0D(i).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        AbstractC0874Lo.A0M(adHiddenView, -1);
        AbstractC0874Lo.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0900Mo
    public final void A0O(C2W c2w, C2U c2u) {
        String strA0H;
        boolean z = c2u == C2U.A05;
        C1207Yn c1207Yn = this.A02;
        InterfaceC0902Mq interfaceC0902Mq = this.A0B;
        if (z) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        N6 n6 = new N6(c1207Yn, c2w, interfaceC0902Mq, strA0H, z ? EnumC0882Lw.REPORT_AD : EnumC0882Lw.HIDE_AD);
        n6.setClickable(true);
        AbstractC0874Lo.A0M(n6, -1);
        int i = A03;
        n6.setPadding(i * 2, i, i * 2, i);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(n6, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0900Mo
    public final boolean A0P() {
        return false;
    }
}
