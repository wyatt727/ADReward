package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class SH extends FrameLayout implements QB {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final QC A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"LrUXeZd5oXG5wJ7", "S6ePTdxfK6c7yhvbHMQjZqIgQsLDz3QO", "YqVXoEdDoNpK3nL0El5", "Exhg7LXIw6HgSAmcccR052cOKtX3WF", "LN", "59F20xOEewuTmZzPatOKMeF6XI6ZvB1j", "IRBrDKvf2o0dBHWjf99N02m12yrR0Bg7", "KZ90h8EmVWfLUNKv0pT"};
    public static final int A0E = (int) (LD.A02 * 6.0f);
    public static final int A0D = (int) (LD.A02 * 8.0f);
    public static final int A0C = (int) (LD.A02 * 12.0f);
    public static final int A0A = (int) (LD.A02 * 350.0f);
    public static final int A09 = (int) (LD.A02 * 250.0f);
    public static final int A0B = (int) (LD.A02 * 175.0f);

    public SH(C1207Yn c1207Yn, NativeAd nativeAd, JR jr, JS js, O3 o3, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1207Yn);
        ArrayList<View> arrayList = new ArrayList<>();
        this.A07 = arrayList;
        this.A05 = nativeAd;
        this.A04 = mediaView;
        QC qc = new QC(c1207Yn, nativeAd, jr, o3, adOptionsView);
        this.A06 = qc;
        int i = A0C;
        qc.setPadding(i, i, i, A0E);
        addView(qc, new FrameLayout.LayoutParams(-1, -2));
        if (js == JS.A09 || js == JS.A0B) {
            A07(jr);
        }
        addView(mediaView, new FrameLayout.LayoutParams(-1, -2));
        if (js != JS.A0B || nativeAd.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(jr);
            A04(jr);
            A05(jr);
        }
        arrayList.add(o3);
        arrayList.add(mediaView);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00() {
        /*
            r8 = this;
            android.widget.TextView r0 = r8.A03
            r3 = 0
            if (r0 == 0) goto L8f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8f
            android.widget.TextView r0 = r8.A03
            int r7 = r0.getMeasuredHeight()
        L11:
            android.widget.TextView r4 = r8.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.SH.A08
            r0 = 1
            r1 = r1[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L97
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.SH.A08
            java.lang.String r1 = "SrhbzBCrZmwJCsE1GN19GBhRpshhKBl4"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "lZXGEU0s5y97LRskCQS4IC0Q6rEMlB8o"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L8d
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L8d
            android.widget.TextView r0 = r8.A02
            int r6 = r0.getMeasuredHeight()
        L3b:
            android.widget.TextView r0 = r8.A00
            if (r0 == 0) goto L8b
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8b
            android.widget.TextView r0 = r8.A00
            int r5 = r0.getMeasuredHeight()
        L4b:
            android.widget.TextView r4 = r8.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.SH.A08
            r0 = 1
            r1 = r1[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L91
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.SH.A08
            java.lang.String r1 = "nRuc5lutSXPKh9f7kKzdW2kIhLu3nB9m"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "FuxAmHJZMOFMUG38wB3yXnFuBZuRMBRE"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L7b
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L7b
            android.widget.TextView r0 = r8.A01
            int r3 = r0.getMeasuredHeight()
            int r0 = com.facebook.ads.redexgen.uinode.SH.A0C
            int r3 = r3 + r0
            int r0 = com.facebook.ads.redexgen.uinode.SH.A0D
            int r3 = r3 + r0
        L7b:
            int r1 = r8.getMeasuredHeight()
            com.facebook.ads.redexgen.X.QC r0 = r8.A06
            int r0 = r0.getMeasuredHeight()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r1 = r1 - r6
            int r1 = r1 - r5
            int r1 = r1 - r3
            return r1
        L8b:
            r5 = 0
            goto L4b
        L8d:
            r6 = 0
            goto L3b
        L8f:
            r7 = 0
            goto L11
        L91:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L97:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.SH.A00():int");
    }

    private void A01() {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setLines(1);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setLines(1);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            textView3.setLines(1);
        }
    }

    private void A02(int i) {
        AbstractC0874Lo.A0N(this.A04, i > A0B ? 0 : 8);
        AbstractC0874Lo.A0N(this.A03, i > A0A ? 0 : 8);
        AbstractC0874Lo.A0N(this.A00, i <= A09 ? 8 : 0);
    }

    public static void A03(int i, int i2, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int iA04 = AbstractC0874Lo.A04(textView, i2);
                textView.setLines(iA04 + 1);
                textView.measure(i, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * iA04), 1073741824));
                i2 -= textView.getLineHeight() * iA04;
            }
        }
    }

    private void A04(JR jr) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A00 = textView;
            jr.A06(textView);
            this.A00.setText(this.A05.getAdBodyText());
            TextView textView2 = this.A00;
            int i = A0C;
            textView2.setPadding(i, 0, i, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(JR jr) {
        if (this.A05.hasCallToAction()) {
            TextView textView = new TextView(getContext());
            this.A01 = textView;
            AbstractC0874Lo.A0K(textView);
            jr.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView2 = this.A01;
            int i = A0D;
            textView2.setPadding(i, i, i, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(i, 0, i, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(JR jr) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A02 = textView;
            jr.A07(textView);
            this.A02.setText(this.A05.getAdHeadline());
            TextView textView2 = this.A02;
            int i = A0C;
            textView2.setPadding(i, A0D, i, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(JR jr) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A03 = textView;
            jr.A06(textView);
            this.A03.setText(this.A05.getAdLinkDescription());
            TextView textView2 = this.A03;
            int i = A0C;
            textView2.setPadding(i, 0, i, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.QB
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.QB
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        QC qc = this.A06;
        int top = qc.getMeasuredHeight();
        qc.layout(i, i2, i3, top + i2);
        int top2 = this.A06.getMeasuredHeight();
        int i5 = i2 + top2;
        TextView textView = this.A03;
        if (textView != null) {
            int top3 = textView.getVisibility();
            if (top3 == 0) {
                int measuredHeight = this.A03.getMeasuredHeight();
                int top4 = i5 + measuredHeight;
                this.A03.layout(i, i5, i3, top4);
                i5 += measuredHeight;
            }
        }
        MediaView mediaView = this.A04;
        int top5 = mediaView.getMeasuredHeight();
        mediaView.layout(i, i5, i3, top5 + i5);
        int top6 = this.A04.getMeasuredHeight();
        int i6 = i5 + top6;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            int top7 = textView2.getMeasuredHeight();
            textView2.layout(i, i6, i3, top7 + i6);
            int top8 = this.A02.getMeasuredHeight();
            i6 += top8;
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            int top9 = textView3.getVisibility();
            if (top9 == 0) {
                TextView textView4 = this.A00;
                if (A08[1].charAt(0) == 'k') {
                    throw new RuntimeException();
                }
                A08[3] = "gjv6mmFqHT0";
                int top10 = textView4.getMeasuredHeight();
                textView4.layout(i, i6, i3, top10 + i6);
            }
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            int i7 = A0C;
            int top11 = textView5.getMeasuredHeight();
            textView5.layout(i + i7, (i4 - top11) - i7, i3 - i7, i4 - i7);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int emptySpace;
        A02(View.MeasureSpec.getSize(i2));
        A01();
        super.onMeasure(i, i2);
        int requiredHeight = A00();
        int emptySpace2 = this.A04.getMediaWidth();
        if (emptySpace2 == 0) {
            emptySpace = requiredHeight;
        } else {
            int emptySpace3 = this.A04.getMediaHeight();
            if (emptySpace3 == 0 || ((ZH) this.A04.getMediaViewApi()).A0N()) {
                emptySpace = requiredHeight;
            } else {
                int emptySpace4 = this.A04.getMediaHeight();
                float f = emptySpace4;
                int emptySpace5 = this.A04.getMediaWidth();
                float aspectRatio = f / emptySpace5;
                int emptySpace6 = this.A04.getMeasuredWidth();
                emptySpace = Math.min((int) (emptySpace6 * aspectRatio), requiredHeight);
            }
        }
        MediaView mediaView = this.A04;
        int mediaViewHeight = View.MeasureSpec.makeMeasureSpec(emptySpace, 1073741824);
        mediaView.measure(i, mediaViewHeight);
        if (emptySpace < requiredHeight) {
            A03(i, requiredHeight - emptySpace, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.QB
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
