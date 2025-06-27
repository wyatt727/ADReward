package com.facebook.ads.redexgen.uinode;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Oo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0952Oo extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1079Tl A02;
    public static final int A05 = (int) (LD.A02 * 36.0f);
    public static final int A06 = (int) (LD.A02 * 36.0f);
    public static final int A03 = (int) (LD.A02 * 23.0f);
    public static final int A04 = (int) (LD.A02 * 3.0f);
    public static final int A07 = (int) (LD.A02 * 4.0f);

    public C0952Oo(C1207Yn c1207Yn, AbstractC1310b5 abstractC1310b5, J2 j2, MC mc, RE re, C0866Lg c0866Lg, C1P c1p, InterfaceC0928Nq interfaceC0928Nq) {
        super(c1207Yn);
        this.A00 = c1p.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c1207Yn);
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(c1207Yn, abstractC1310b5.A0x().A0F().A04());
        ViewOnClickListenerC1079Tl viewOnClickListenerC1079Tl = new ViewOnClickListenerC1079Tl(c1207Yn, abstractC1310b5.A0L(), null, j2, mc, re, c0866Lg, abstractC1310b5.A0y());
        this.A02 = viewOnClickListenerC1079Tl;
        viewOnClickListenerC1079Tl.setCta(abstractC1310b5.A0x().A0F(), abstractC1310b5.A12(), new HashMap(), interfaceC0928Nq);
        viewOnClickListenerC1079Tl.setIsInAppBrowser(true);
        addView(viewOnClickListenerC1079Tl, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(C1207Yn c1207Yn, View view) {
        ImageView imageView = new ImageView(c1207Yn);
        imageView.setImageBitmap(AbstractC0883Lx.A01(EnumC0882Lw.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i = A03;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A04;
        imageView.setPadding(i2, i2, i2, i2);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1207Yn c1207Yn, String str) {
        Button button = new Button(c1207Yn);
        AbstractC0874Lo.A0K(button);
        int i = A06;
        button.setPadding(i, 0, i, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC0874Lo.A0O(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1207Yn, button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1310b5 abstractC1310b5, MB mb) {
        this.A02.A0A(abstractC1310b5, mb);
    }
}
