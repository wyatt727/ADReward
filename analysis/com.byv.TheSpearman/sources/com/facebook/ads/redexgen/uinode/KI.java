package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class KI implements InterfaceC0999Qj {
    public int A00;
    public ValueAnimator A01;
    public EnumC0998Qi A02 = EnumC0998Qi.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public KI(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private ValueAnimator A00(int i, int i2, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C1002Qm(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = EnumC0998Qi.A06;
            ValueAnimator valueAnimatorA00 = A00(this.A00, this.A04, this.A05);
            this.A01 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C1001Ql(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        AbstractC0874Lo.A0H(this.A05);
        this.A02 = EnumC0998Qi.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        AbstractC0874Lo.A0L(this.A05);
        if (z) {
            this.A02 = EnumC0998Qi.A04;
            ValueAnimator valueAnimatorA00 = A00(this.A04, this.A00, this.A05);
            this.A01 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C1000Qk(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC0998Qi.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0999Qj
    public final void A3Y(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0999Qj
    public final EnumC0998Qi A82() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0999Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
