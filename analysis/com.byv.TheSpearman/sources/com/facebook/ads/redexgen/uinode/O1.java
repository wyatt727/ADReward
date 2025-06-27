package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;

/* loaded from: assets/audience_network.dex */
public final class O1 extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    public MB A00;
    public final AbstractC1310b5 A01;
    public final C1207Yn A02;
    public final MC A03;
    public final O0 A04;
    public final SA A05;
    public final View[] A06;

    public O1(OP op, AbstractC1310b5 abstractC1310b5, SA sa, KP kp, AbstractC0926No abstractC0926No, MC mc, O0 o0) {
        this(op, abstractC1310b5, sa, mc, o0, kp, abstractC0926No);
    }

    public O1(OP op, AbstractC1310b5 abstractC1310b5, SA sa, MC mc, O0 o0, View... viewArr) {
        this(op.A05(), op.A08(), abstractC1310b5, sa, mc, o0, viewArr);
    }

    public O1(C1207Yn c1207Yn, MB mb, AbstractC1310b5 abstractC1310b5, SA sa, MC mc, O0 o0, View... viewArr) {
        super(c1207Yn);
        this.A02 = c1207Yn;
        this.A00 = mb;
        this.A01 = abstractC1310b5;
        this.A06 = viewArr;
        this.A03 = mc;
        this.A05 = sa;
        this.A04 = o0;
        A03();
    }

    private void A03() {
        String title;
        RewardData rewardDataA0J = this.A01.A0J();
        if (rewardDataA0J == null) {
            title = this.A01.A0z().A05();
        } else {
            title = this.A01.A0z().A06(rewardDataA0J.getCurrency(), rewardDataA0J.getQuantity());
        }
        MQ mq = new MQ(this.A02, -1, ViewCompat.MEASURED_STATE_MASK, title, null, this.A01.A0z().A04(), this.A01.A0z().A03(), AbstractC0883Lx.A01(EnumC0882Lw.REWARD_ICON));
        mq.A02.setOnClickListener(new ViewOnClickListenerC0936Ny(this));
        mq.A01.setOnClickListener(new ViewOnClickListenerC0937Nz(this));
        addView(mq, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        SA sa = this.A05;
        if (sa != null) {
            sa.A0a(QH.A07);
        }
        this.A04.AAh();
        if (!this.A01.A0x().A0O()) {
            this.A01.A15(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        SA sa = this.A05;
        if (sa != null && !sa.A0j()) {
            this.A05.A0f(false, false, 11);
            AbstractC0874Lo.A0N(this.A05, 4);
        }
        MB mb = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (mb != null) {
            AbstractC0874Lo.A0H(mb);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            AbstractC0874Lo.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ACC();
    }
}
