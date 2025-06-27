package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class PQ extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final RD A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC1310b5 A05;
    public final C1207Yn A06;
    public final J2 A07;
    public final C0866Lg A08;
    public final MC A09;
    public final InterfaceC0895Mj A0A;
    public final RE A0B;

    public abstract void A0z();

    public abstract void A10();

    public abstract void A11();

    public abstract void A12(boolean z);

    public abstract void A13(boolean z);

    public abstract boolean A14();

    public abstract boolean A15();

    public abstract C0966Pc getFullScreenAdStyle();

    public PQ(C1207Yn c1207Yn, InterfaceC0895Mj interfaceC0895Mj, J2 j2, AbstractC1310b5 abstractC1310b5, int i, boolean z, boolean z2, MC mc) {
        super(c1207Yn);
        this.A08 = new C0866Lg();
        this.A00 = false;
        TB tb = new TB(this);
        this.A02 = tb;
        this.A01 = i;
        this.A06 = c1207Yn;
        this.A04 = z;
        this.A03 = z2;
        this.A09 = mc;
        this.A0A = interfaceC0895Mj;
        this.A05 = abstractC1310b5;
        this.A07 = j2;
        RE re = new RE(this, 1, new WeakReference(tb), c1207Yn);
        this.A0B = re;
        re.A0W(abstractC1310b5.A0C());
        re.A0X(abstractC1310b5.A0D());
    }

    public final void A03() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public AbstractC1310b5 getAdDataBundle() {
        return this.A05;
    }

    public RE getAdViewabilityChecker() {
        return this.A0B;
    }

    public C0866Lg getTouchDataRecorder() {
        return this.A08;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
