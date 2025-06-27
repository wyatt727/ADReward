package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class UD extends RelativeLayout implements MD {
    public static byte[] A0X;
    public static String[] A0Y = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final RelativeLayout.LayoutParams A0i;
    public View A00;
    public RelativeLayout A01;
    public RelativeLayout A02;
    public Toast A03;
    public C5V A04;
    public L9 A05;
    public ViewOnClickListenerC1079Tl A06;
    public Q0 A07;
    public Q7 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final AbstractC1310b5 A0F;
    public final C03841c A0G;
    public final C5T A0H;
    public final C1207Yn A0I;
    public final J2 A0J;
    public final JA A0K;
    public final L9 A0L;
    public final ViewOnSystemUiVisibilityChangeListenerC0861Lb A0M;
    public final MC A0N;
    public final InterfaceC0895Mj A0O;
    public final O0 A0P;
    public final O1 A0Q;
    public final Q5 A0R;
    public final AtomicBoolean A0S;
    public final AtomicBoolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final MB A0W;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0N() {
        A0X = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, 13, 10, 4, 12, 0, 16, 19, 10, 8, 10, 15, -77, -68, -71, -77, -69, -81, -61, -65, -59, -62, -77, -75, -11, -6, 0, -15, -2, -1, 0, -11, 0, -11, -19, -8, -55, -68, -49, -60, -47, -64, -70, -66, -57, -60, -66, -58, -43, -47, -58, -56, -54, -46, -54, -45, -39, -65, -78, -60, -82, -65, -79, -78, -79, -84, -61, -74, -79, -78, -68, -80, -98, -101, -81, -94, -98, -80, -104, -100, -91, -94, -100, -92};
    }

    static {
        A0N();
        A0g = (int) (LD.A02 * 64.0f);
        A0b = (int) (LD.A02 * 16.0f);
        A0h = (int) (LD.A02 * 12.0f);
        A0Z = (int) (LD.A02 * 10.0f);
        A0i = new RelativeLayout.LayoutParams(-1, -1);
        A0c = (int) (LD.A02 * 48.0f);
        A0d = (int) (LD.A02 * 16.0f);
        A0f = (int) (LD.A02 * 14.0f);
        A0e = AbstractC04232p.A01(-1, 77);
        A0a = (int) (LD.A02 * 8.0f);
    }

    public UD(C1207Yn c1207Yn, J2 j2, MC mc, AbstractC1310b5 abstractC1310b5, String str, InterfaceC0895Mj interfaceC0895Mj) {
        int iA07;
        super(c1207Yn);
        this.A0H = new UK(this);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A0T = atomicBoolean;
        this.A0S = new AtomicBoolean(false);
        this.A0C = false;
        this.A0E = true;
        this.A0A = false;
        this.A09 = false;
        this.A0I = c1207Yn;
        this.A0N = mc;
        this.A0J = j2;
        this.A0F = abstractC1310b5;
        C03841c c03841cA06 = abstractC1310b5.A0x().A0D().A06();
        this.A0G = c03841cA06;
        this.A0K = new JA(abstractC1310b5.A12(), j2);
        this.A0O = interfaceC0895Mj;
        this.A08 = new Q7(c1207Yn, interfaceC0895Mj, str, mc);
        this.A0B = abstractC1310b5.A0x().A0M() && abstractC1310b5.A0x().A0D().A02() > 0;
        boolean zA0A = abstractC1310b5.A0x().A0D().A0A();
        this.A0V = zA0A;
        if (c03841cA06 == null) {
            mc.A43(interfaceC0895Mj.A6y());
            mc.A43(interfaceC0895Mj.A6u());
        }
        if (this.A0B && zA0A) {
            iA07 = abstractC1310b5.A0x().A0D().A02();
        } else {
            iA07 = c03841cA06.A07();
        }
        atomicBoolean.set(!c03841cA06.A0I());
        UK uk = null;
        this.A0L = new L9(iA07, new UF(this, uk));
        this.A0U = C0796Ih.A0j(c1207Yn);
        FullScreenAdToolbar fullScreenAdToolbarA07 = A07();
        this.A0W = fullScreenAdToolbarA07;
        this.A0R = new Q5(c1207Yn, j2, abstractC1310b5);
        OA.A00(c1207Yn, this, abstractC1310b5.A0x().A0D().A07());
        ViewOnSystemUiVisibilityChangeListenerC0861Lb viewOnSystemUiVisibilityChangeListenerC0861Lb = new ViewOnSystemUiVisibilityChangeListenerC0861Lb(this);
        this.A0M = viewOnSystemUiVisibilityChangeListenerC0861Lb;
        viewOnSystemUiVisibilityChangeListenerC0861Lb.A05(EnumC0860La.A03);
        if (C0796Ih.A1q(c1207Yn)) {
            fullScreenAdToolbarA07.setProgressSpinnerInvisible(true);
        }
        HashMap map = new HashMap();
        map.put(A0D(56, 9, 61), interfaceC0895Mj.A7f());
        this.A07 = new Q0(c1207Yn, abstractC1310b5, c03841cA06, j2, new UE(this, uk), map);
        A0K();
        mc.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
        A0H();
        UJ uj = new UJ(this);
        this.A0P = uj;
        this.A0Q = new O1(c1207Yn, fullScreenAdToolbarA07, abstractC1310b5, (SA) null, mc, uj, this.A06, this.A01, this.A07);
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0I, this.A0N, this.A0K, 0, this.A0F.A0r());
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A06(this.A0F.A0w().A01(), ViewOnClickListenerC1079Tl.A08(this.A0F));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0F.A10(), this.A0F.A12(), this.A0G.A07(), this.A0F.A11());
        fullScreenAdToolbar.setToolbarListener(new UG(this));
        return fullScreenAdToolbar;
    }

    private ViewOnClickListenerC1079Tl A09() {
        Q0 q0 = this.A07;
        if (q0 == null || q0.getViewabilityChecker() == null || this.A07.getTouchDataRecorder() == null) {
            return null;
        }
        ViewOnClickListenerC1079Tl button = new ViewOnClickListenerC1079Tl(this.A0I, this.A0O.A6R(), this.A0F.A0w().A01(), this.A0J, this.A0N, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0F.A0y());
        AbstractC0874Lo.A0K(button);
        button.setText(this.A0F.A0x().A0F().A04());
        button.setTextSize(14.0f);
        button.setIncludeFontPadding(false);
        int i = A0Z;
        button.setPadding(i, i, i, i);
        button.setOnClickListener(new MS(this));
        return button;
    }

    private O9 A0B() {
        O9 o9 = new O9(this.A0I, this.A0F.A0w().A01(), true, 16, 14, 0);
        o9.A03(this.A0F.A0x().A0E().A06(), this.A0F.A0x().A0E().A05(), null, false, true);
        TextView descriptionTv = o9.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = o9.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return o9;
    }

    private void A0G() {
        int i = A0c;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        O3 o3 = new O3(this.A0I);
        AbstractC0874Lo.A0M(o3, 0);
        AbstractC0874Lo.A0K(o3);
        new AsyncTaskC1084Tq(o3, this.A0I).A05(i, i).A07(this.A0F.A10().A01());
        TextView textView = new TextView(this.A0I);
        AbstractC0874Lo.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0F.A0w().A01().A06(true));
        textView.setText(this.A0F.A0x().A0E().A06());
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        O5 o5 = new O5(this.A0I, A0f, 5, A0e, -1);
        o5.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0I);
        textView2.setTextColor(this.A0F.A0w().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        int i2 = A0a;
        starRatingContainerParams.leftMargin = i2;
        LinearLayout linearLayout = new LinearLayout(this.A0I);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, A0d);
        layoutParams3.topMargin = i2 / 2;
        layoutParams3.addRule(3, textView.getId());
        linearLayout.addView(o5, layoutParams2);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = i2;
        layoutParams4.addRule(1, o3.getId());
        layoutParams4.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams3);
        relativeLayout.addView(textView);
        RelativeLayout relativeLayout2 = this.A02;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
            RelativeLayout relativeLayout3 = this.A02;
            if (A0Y[4].length() != 18) {
                throw new RuntimeException();
            }
            A0Y[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout3.addView(relativeLayout, layoutParams4);
            this.A02.addView(o3, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0F.A0x().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        o5.setRating(Float.parseFloat(this.A0F.A0x().A0E().A03()));
        if (this.A0F.A0x().A0E().A02() == null) {
            return;
        }
        textView2.setText(A0D(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0F.A0x().A0E().A02())) + A0D(1, 1, 78));
    }

    private void A0H() {
        if (this.A0G.A0I()) {
            A0J();
        } else {
            A0M();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0M.A05(EnumC0860La.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0D = true;
        if (this.A0F.A0x().A0M()) {
            this.A08.A05();
            this.A0N.A44(this.A0O.A5s(), new C9H(0, 0));
        }
    }

    private void A0J() {
        C0970Pg c0970PgA0B = new C0968Pe(this.A0I, this.A0F.A0x().A0E(), this.A0F.A10()).A08(this.A0F.A0w().A01()).A0A(this.A0G.A0G()).A09(this.A0G.A0D()).A07(2000).A0B();
        JC.A04(c0970PgA0B, this.A0K, J9.A0U);
        addView(c0970PgA0B, A0i);
        c0970PgA0B.A04(new UI(this));
    }

    private void A0K() {
        this.A06 = A09();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A01 = relativeLayout;
        AbstractC0874Lo.A0K(relativeLayout);
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        int i = A0b;
        int i2 = A0h;
        iconAndMetaDataContainerParams.setMargins(i, i2, i, i2);
        iconAndMetaDataContainerParams.addRule(12);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        this.A02 = relativeLayout2;
        AbstractC0874Lo.A0K(relativeLayout2);
        if (this.A0U) {
            A0G();
        } else {
            RelativeLayout relativeLayout3 = this.A02;
            O9 o9A0B = A0B();
            RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout3.addView(o9A0B, appMetadataLayoutParams);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, i, 0);
        this.A01.addView(this.A02, layoutParams);
        ViewOnClickListenerC1079Tl viewOnClickListenerC1079Tl = this.A06;
        if (viewOnClickListenerC1079Tl != null) {
            layoutParams.addRule(0, viewOnClickListenerC1079Tl.getId());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(11);
            layoutParams2.addRule(6, this.A02.getId());
            layoutParams2.addRule(8, this.A02.getId());
            this.A01.addView(this.A06, layoutParams2);
        }
        AbstractC0874Lo.A0K(this.A0W);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-1, -2);
        adWebViewParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.setMargins(i, 0, i, 0);
        layoutParams3.addRule(3, this.A0W.getId());
        layoutParams3.addRule(2, this.A01.getId());
        this.A0W.setVisibility(4);
        this.A07.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0W, adWebViewParams);
        addView(this.A07, layoutParams3);
        addView(this.A01, iconAndMetaDataContainerParams);
        if (this.A0G.A0J()) {
            this.A07.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        new JA(this.A0F.A12(), this.A0J).A04(J9.A0r, null);
        this.A0S.set(true);
        AbstractC0874Lo.A0T(this);
        AbstractC0874Lo.A0H(this.A07);
        AbstractC0874Lo.A0a(this.A0Q, this.A00, this.A07);
        AbstractC0874Lo.A0L(this.A0W);
        AbstractC0874Lo.A0L(this.A06);
        Pair<Q4, View> pairA03 = this.A0R.A03(this.A06);
        this.A00 = (View) pairA03.second;
        switch (MT.A00[((Q4) pairA03.first).ordinal()]) {
            case 1:
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, this.A0W.getToolbarHeight(), 0, 0);
                AbstractC0874Lo.A0L(this.A01);
                RelativeLayout relativeLayout = this.A01;
                if (relativeLayout != null) {
                    int id = relativeLayout.getId();
                    if (A0Y[5].charAt(2) == 'm') {
                        throw new RuntimeException();
                    }
                    A0Y[0] = "6k4i0rLafWNu6HrnPvo1bAEbeaagXJGg";
                    layoutParams.addRule(2, id);
                }
                addView(this.A00, layoutParams);
                return;
            case 2:
                RelativeLayout relativeLayout2 = this.A01;
                if (relativeLayout2 != null) {
                    AbstractC0874Lo.A0a(relativeLayout2);
                }
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        AbstractC0874Lo.A0T(this);
        if (!this.A0G.A0J()) {
            Q0 q0 = this.A07;
            if (A0Y[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            q0.A0B();
        }
        this.A0W.setVisibility(0);
        this.A07.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        if (this.A06 != null && this.A0F.A0u() > 0 && this.A05 == null) {
            L9 l9 = new L9(this.A0F.A0u(), new UH(this));
            this.A05 = l9;
            l9.A07();
        }
        this.A0L.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(int i) {
        String strValueOf = String.valueOf(i);
        Toast toast = this.A03;
        String strA0C = this.A0G.A0C();
        String progress = A0D(2, 6, 31);
        AbstractC0874Lo.A0Y(toast, strA0C.replace(progress, strValueOf), 49, 0, A0g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U(boolean z, String str) {
        this.A0A = true;
        HashMap map = new HashMap();
        map.put(A0D(8, 12, 121), z ? A0D(79, 13, 17) : A0D(44, 12, 51));
        map.put(A0D(20, 12, 40), str);
        new C0929Nr(this.A0I, this.A0O.A6R(), this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0J, this.A0F.A0y(), this.A0N).A07(this.A0F.A12(), this.A0F.A0x().A0F().A05(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0V() {
        if (!this.A0F.A0P().equals(A0D(65, 14, 37))) {
            if (this.A0F.A0P().equals(A0D(32, 12, 100))) {
                AbstractC1310b5 abstractC1310b5 = this.A0F;
                if (A0Y[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0Y[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (abstractC1310b5.A0x().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0W() {
        return this.A0V && !this.A0C && !this.A0E && this.A0G.A07() < this.A0F.A0x().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        this.A04 = c5v;
        c5v.A0N(this.A0H);
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z) {
        this.A0L.A06();
        this.A09 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z) {
        if (this.A0V && this.A0E) {
            return;
        }
        boolean z2 = this.A0C;
        if (A0Y[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0Y[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z2 && this.A0T.get() && !this.A0L.A05()) {
            this.A0L.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public String getCurrentClientToken() {
        return this.A0F.A12();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() {
        this.A0M.A03();
        C5V c5v = this.A04;
        if (c5v != null) {
            c5v.A0O(this.A0H);
        }
        if (this.A07 != null) {
            AbstractC1310b5 abstractC1310b5 = this.A0F;
            if (A0Y[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0Y[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(abstractC1310b5.A12())) {
                this.A0J.A9X(this.A0F.A12(), new C0920Ni().A03(this.A07.getViewabilityChecker()).A02(this.A07.getTouchDataRecorder()).A05());
            }
            this.A07.A0C();
        }
        this.A0L.A06();
        this.A0W.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            ACu(false);
        } else {
            ACW(false);
        }
    }

    public void setListener(MC mc) {
    }

    public void setServerSideRewardHandler(Q7 q7) {
        this.A08 = q7;
    }
}
