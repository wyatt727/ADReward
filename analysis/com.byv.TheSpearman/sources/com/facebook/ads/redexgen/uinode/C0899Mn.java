package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0899Mn extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C2S A02;
    public final C1207Yn A03;
    public final InterfaceC0902Mq A04;
    public final boolean A05;

    static {
        int i = (int) (LD.A02 * 16.0f);
        A09 = i;
        A0A = (int) (LD.A02 * 8.0f);
        A0D = (int) (LD.A02 * 44.0f);
        int i2 = (int) (LD.A02 * 10.0f);
        A08 = i2;
        A07 = i - i2;
        A0E = (int) (LD.A02 * 75.0f);
        A0B = (int) (LD.A02 * 25.0f);
        A0F = (int) (LD.A02 * 45.0f);
        A0C = (int) (LD.A02 * 15.0f);
        A06 = (int) (LD.A02 * 16.0f);
    }

    public C0899Mn(C0898Mm c0898Mm) {
        super(c0898Mm.A0C);
        C1207Yn c1207Yn = c0898Mm.A0C;
        this.A03 = c1207Yn;
        this.A02 = C2T.A00(c1207Yn.A01());
        this.A04 = c0898Mm.A02;
        this.A01 = c0898Mm.A0B ? A0E : A0F;
        this.A00 = c0898Mm.A0B ? A0B : A0C;
        this.A05 = c0898Mm.A07;
        setFocusable(true);
        View viewA01 = A01(c0898Mm);
        View viewA00 = A00(c0898Mm);
        View footerView = getFooterView();
        AbstractC0874Lo.A0K(viewA01);
        AbstractC0874Lo.A0K(viewA00);
        AbstractC0874Lo.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, viewA01.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i = A09;
        layoutParams.setMargins(i, 0, i, i);
        addView(viewA01, footerParams);
        addView(viewA00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(c0898Mm.A08 ? 0 : 8);
    }

    public /* synthetic */ C0899Mn(C0898Mm c0898Mm, ViewOnClickListenerC0896Mk viewOnClickListenerC0896Mk) {
        this(c0898Mm);
    }

    private View A00(C0898Mm c0898Mm) {
        ImageView imageView = new ImageView(getContext());
        int i = this.A00;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(AbstractC0883Lx.A01(c0898Mm.A01));
        imageView.setColorFilter(-1);
        int i2 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c0898Mm.A00);
        AbstractC0874Lo.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i3 = A09;
        layoutParams.setMargins(i3, 0, i3, i3);
        TextView textView = new TextView(getContext());
        AbstractC0874Lo.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(c0898Mm.A06);
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i3, 0, i3, i3);
        TextView textView2 = new TextView(getContext());
        AbstractC0874Lo.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(c0898Mm.A05);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i3, 0, i3, i3);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        if (c0898Mm.A09) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(c0898Mm.A04)) {
                O3 o3 = new O3(this.A03);
                int i4 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i4, i4);
                subtitleParams.setMargins(0, 0, A0A, 0);
                o3.setFullCircleCorners(true);
                new AsyncTaskC1084Tq(o3, this.A03).A05(i4, i4).A07(c0898Mm.A04);
                linearLayout2.addView(o3, subtitleParams);
            }
            C0904Ms c0904Ms = new C0904Ms(this.A03);
            c0904Ms.setData(c0898Mm.A03, EnumC0882Lw.CHECKMARK);
            c0904Ms.setSelected(true);
            linearLayout2.addView(c0904Ms, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C0898Mm c0898Mm) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c0898Mm.A0A) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(AbstractC0883Lx.A01(EnumC0882Lw.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC0896Mk(this));
            int i2 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A07;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(AbstractC0883Lx.A01(EnumC0882Lw.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        AbstractC0874Lo.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i2 = A0A;
        managePrefsText.setPadding(i2, i2, i2, i2);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0897Ml(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
