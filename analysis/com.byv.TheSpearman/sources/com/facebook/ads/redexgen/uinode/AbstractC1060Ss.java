package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1060Ss extends FrameLayout implements MD {
    public static String[] A0D = {"2Xyaln6pEv", "U0a3JqFqqkDVhXbmlhDLXicSxteMexx", "xzpI97Jg3aS17fwtqg1jZWsfReheMZxV", "0HUxaz9ggnFIA", "Uunhkc3", "kqN9", "fWeU9xYsODnan54TmlbSL1hNy6Lef7fu", "qbKhPFfRzVPGu"};
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC1310b5 A01;
    public final C05126c A02;
    public final C1207Yn A03;
    public final J2 A04;
    public final JA A05;
    public final C0866Lg A06;
    public final MB A07;
    public final MC A08;
    public final InterfaceC0895Mj A09;
    public final RE A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC0861Lb A0B;
    public final RD A0C;

    public abstract void A0Q();

    public abstract void A0S(C5V c5v);

    public abstract boolean A0T();

    public AbstractC1060Ss(C1207Yn c1207Yn, InterfaceC0895Mj interfaceC0895Mj, J2 j2, AbstractC1310b5 abstractC1310b5, C05126c c05126c, MC mc) {
        super(c1207Yn);
        C1064Sw c1064Sw = new C1064Sw(this);
        this.A0C = c1064Sw;
        this.A06 = new C0866Lg();
        this.A00 = false;
        this.A03 = c1207Yn;
        this.A09 = interfaceC0895Mj;
        this.A04 = j2;
        this.A01 = abstractC1310b5;
        this.A02 = c05126c;
        this.A08 = mc;
        this.A05 = new JA(abstractC1310b5.A12(), j2);
        RE re = new RE(this, 1, new WeakReference(c1064Sw), c1207Yn);
        this.A0A = re;
        re.A0W(abstractC1310b5.A0C());
        re.A0X(abstractC1310b5.A0D());
        this.A07 = A0N();
        ViewOnSystemUiVisibilityChangeListenerC0861Lb viewOnSystemUiVisibilityChangeListenerC0861Lb = new ViewOnSystemUiVisibilityChangeListenerC0861Lb(this);
        this.A0B = viewOnSystemUiVisibilityChangeListenerC0861Lb;
        viewOnSystemUiVisibilityChangeListenerC0861Lb.A05(EnumC0860La.A03);
    }

    private FullScreenAdToolbar A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0r());
        fullScreenAdToolbar.setFullscreen(true);
        int iA03 = this.A01.A0x().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A10(), this.A01.A12(), iA03, this.A01.A11());
        fullScreenAdToolbar.A06(this.A01.A0w().A01(), ViewOnClickListenerC1079Tl.A08(this.A01));
        if (iA03 < 0) {
            C1G c1gA0x = this.A01.A0x();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 31) {
                throw new RuntimeException();
            }
            A0D[5] = "3phQ";
            if (c1gA0x.A0M()) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new C1061St(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0x().A0P()) {
            C0970Pg c0970PgA0B = new C0968Pe(this.A03, this.A01.A0x().A0E(), this.A01.A10()).A08(this.A01.A0w().A01()).A0B();
            JC.A04(c0970PgA0B, this.A05, J9.A0U);
            addView(c0970PgA0B, A0E);
            c0970PgA0B.A04(new C1062Su(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i, KT kt) {
        new L9(i, new C1063Sv(this, i, kt)).A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        this.A08.A3U(this, A0E);
        A0S(c5v);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public String getCurrentClientToken() {
        return this.A01.A12();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() throws JSONException {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A12())) {
            this.A04.A9X(this.A01.A12(), new C0920Ni().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(MC mc) {
    }

    public void setUpFullscreenMode(boolean z) {
        EnumC0860La enumC0860La;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            enumC0860La = EnumC0860La.A04;
        } else {
            enumC0860La = EnumC0860La.A03;
        }
        this.A0B.A05(enumC0860La);
    }
}
