package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class SI extends LinearLayout implements QB {
    public final NativeBannerAd A00;
    public final C1207Yn A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (LD.A02 * 42.0f);
    public static final int A03 = (int) (LD.A02 * 48.0f);
    public static final int A05 = (int) (LD.A02 * 54.0f);
    public static final int A07 = (int) (LD.A02 * 4.0f);
    public static final int A06 = (int) (LD.A02 * 8.0f);

    public SI(C1207Yn c1207Yn, NativeBannerAd nativeBannerAd, JR jr, JS js, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams ctaButtonParams;
        ViewGroup.LayoutParams layoutParams;
        super(c1207Yn);
        ArrayList<View> arrayList = new ArrayList<>();
        this.A02 = arrayList;
        this.A00 = nativeBannerAd;
        this.A01 = c1207Yn;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(js);
        O4 o4 = new O4(c1207Yn);
        o4.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams2.gravity = 16;
        o4.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(o4, layoutParams2);
        Q8 q8 = new Q8(c1207Yn, nativeBannerAd, js, jr, adOptionsView);
        int i = A06;
        q8.setPadding(i, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(q8, layoutParams3);
        if (js != JS.A0A) {
            setPadding(i, i, i, i);
            setOrientation(1);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, i);
        } else {
            int i2 = A07;
            setPadding(i2, i2, i2, i2);
            setOrientation(0);
            ctaButtonParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, i2, 0);
        }
        ctaButtonParams.weight = 1.0f;
        addView(linearLayout, ctaButtonParams);
        TextView textView = new TextView(getContext());
        int i3 = A07;
        textView.setPadding(i, i3, i, i3);
        jr.A05(textView);
        textView.setText(nativeBannerAd.getAdCallToAction());
        addView(textView, layoutParams);
        arrayList.add(mediaView);
        arrayList.add(textView);
    }

    public static int A00(JS js) {
        switch (Q9.A00[js.ordinal()]) {
            case 1:
                return A04;
            case 2:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.QB
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.QB
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.QB
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
