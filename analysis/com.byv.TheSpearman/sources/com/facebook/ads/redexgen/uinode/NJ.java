package com.facebook.ads.redexgen.uinode;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class NJ extends LinearLayout {
    public static byte[] A0E;
    public static String[] A0F = {"knq4crm7fvqQP", "POuWJNR6FFtqsTvB6KeDXgsqVDDrfXB5", "10LYd3PkBnL3JTlwXO74lkb8laVhyfxM", "yGvyB2PsIdOlgSHN7xWAdIyeKrkcUuSJ", "30OsfDGqNeLBXhmKwxFpv8WuoKRgKdOB", "v4mwmIuaROl", "LuFvPWZsJ2RrZ", "py7QobRXpH9AZVstdVJJOkEIejHuBaN9"};
    public static final int A0G;
    public static final int A0H;
    public static final Uri A0I;
    public static final View.OnTouchListener A0J;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public NI A05;
    public NP A06;
    public String A07;
    public boolean A08;
    public final float A09;
    public final WebView A0A;
    public final C1207Yn A0B;
    public final NT A0C;
    public final boolean A0D;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 39);
            String[] strArr = A0F;
            if (strArr[3].charAt(13) == strArr[1].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "2vQcPj1ELj1bu";
            strArr2[0] = "7aOELiI6quiDs";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{80, 115, 113, 121, 27, 52, 55, 43, Base64.padSymbol, 39, 14, 19, 22, 0, 19, 5, 14, 49, 36, 47, 97, 47, 32, 53, 40, 55, 36, 97, 35, 51, 46, 54, 50, 36, 51, 5, 6, 11, 17, 16, 94, 6, 8, 5, 10, 15, 18, 29, 23, 1, 28, 26, 23, 93, 26, 29, 7, 22, 29, 7, 93, 18, 16, 7, 26, 28, 29, 93, 37, 58, 54, 36, 27, 23, 21, 86, 25, 22, 28, 10, 23, 17, 28, 86, 27, 16, 10, 23, 21, 29, 80, 76, 76, 72, 2, 23, 23, 79, 79, 79, 22, 94, 89, 91, 93, 90, 87, 87, 83, 22, 91, 87, 85};
    }

    static {
        A0A();
        A0G = Color.rgb(224, 224, 224);
        A0I = AbstractC0858Ky.A00(A06(90, 23, 31));
        A0J = new ND();
        A0H = Color.argb(34, 0, 0, 0);
    }

    public NJ(C1207Yn c1207Yn, WebView webView) {
        this(c1207Yn, webView, false);
    }

    public NJ(C1207Yn c1207Yn, WebView webView, boolean z) {
        super(c1207Yn);
        this.A09 = getResources().getDisplayMetrics().density;
        this.A0C = new U3(this);
        this.A0A = webView;
        this.A0B = c1207Yn;
        this.A08 = AbstractC0797Ii.A06(c1207Yn);
        this.A0D = z;
        A08();
    }

    private void A08() {
        int buttonSizePx;
        int i = (int) (this.A09 * 50.0f);
        AbstractC0874Lo.A0M(this, -1);
        setGravity(16);
        ImageView imageView = new ImageView(this.A0B);
        this.A01 = imageView;
        imageView.setContentDescription(A06(4, 5, 127));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(AbstractC0883Lx.A01(EnumC0882Lw.BROWSER_CLOSE));
        ImageView imageView2 = this.A01;
        View.OnTouchListener onTouchListener = A0J;
        imageView2.setOnTouchListener(onTouchListener);
        this.A01.setOnClickListener(new NE(this));
        addView(this.A01, layoutParams);
        if (this.A08 && !C0796Ih.A2N(this.A0B)) {
            ImageView imageView3 = new ImageView(this.A0B);
            this.A00 = imageView3;
            imageView3.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 53));
            ViewGroup.LayoutParams backButtonParams = new LinearLayout.LayoutParams(i, i);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(AbstractC0883Lx.A01(EnumC0882Lw.BACK_ARROW));
            this.A00.setOnTouchListener(onTouchListener);
            this.A00.setOnClickListener(new NF(this));
            addView(this.A00, backButtonParams);
        }
        this.A06 = new NP(this.A0B);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        if (this.A08 || C0796Ih.A2N(this.A0B)) {
            buttonSizePx = 1056964608;
        } else {
            buttonSizePx = 1065353216;
        }
        layoutParams2.weight = buttonSizePx;
        this.A06.setGravity(17);
        if (C0796Ih.A2N(this.A0B) && !this.A0D) {
            LinearLayout linearLayout = new LinearLayout(this.A0B);
            this.A04 = linearLayout;
            linearLayout.setOrientation(1);
            LinearLayout linearLayout2 = this.A04;
            float f = this.A09;
            int buttonSizePx2 = (int) (f * 2.0f);
            linearLayout2.setPadding(0, (int) (f * 2.0f), 0, buttonSizePx2);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            ImageView imageView4 = new ImageView(this.A0B);
            imageView4.setScaleType(ImageView.ScaleType.CENTER);
            imageView4.setImageBitmap(AbstractC0883Lx.A01(EnumC0882Lw.HANDLER));
            float f2 = this.A09;
            int buttonSizePx3 = (int) (f2 * 4.0f);
            imageView4.setPadding(0, (int) (f2 * 4.0f), 0, buttonSizePx3);
            this.A04.addView(imageView4, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A06, titleViewsParams);
        } else {
            addView(this.A06, layoutParams2);
        }
        if (this.A08 && !C0796Ih.A2N(this.A0B)) {
            ImageView imageView5 = new ImageView(this.A0B);
            this.A02 = imageView5;
            imageView5.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 70));
            ViewGroup.LayoutParams titleViewsParams2 = new LinearLayout.LayoutParams(i, i);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(AbstractC0883Lx.A02(EnumC0882Lw.BACK_ARROW));
            this.A02.setOnTouchListener(onTouchListener);
            this.A02.setOnClickListener(new NG(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new ImageView(this.A0B);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i, i);
        this.A03.setContentDescription(A06(16, 19, 102));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(onTouchListener);
        this.A03.setOnClickListener(new NH(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Yn r0 = r6.A0B
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            r5 = 0
            r4 = 0
            if (r3 == 0) goto L2e
            r2 = 46
            r1 = 26
            r0 = 84
            java.lang.String r2 = A06(r2, r1, r0)
            android.net.Uri r0 = com.facebook.ads.redexgen.uinode.NJ.A0I
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r2 = r3.queryIntentActivities(r1, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5b
            android.widget.ImageView r1 = r6.A03
            r0 = 8
            r1.setVisibility(r0)
        L2e:
            com.facebook.ads.redexgen.X.Yn r0 = r6.A0B
            boolean r0 = com.facebook.ads.redexgen.uinode.C0796Ih.A2N(r0)
            if (r0 == 0) goto L41
            android.widget.ImageView r0 = r6.A03
            r0.setVisibility(r4)
            com.facebook.ads.redexgen.X.Lw r0 = com.facebook.ads.redexgen.uinode.EnumC0882Lw.BROWSER_LAUNCH_NATIVE
            android.graphics.Bitmap r5 = com.facebook.ads.redexgen.uinode.AbstractC0883Lx.A01(r0)
        L41:
            android.widget.ImageView r3 = r6.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.NJ.A0F
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L94
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5b:
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L8d
            java.lang.Object r0 = r2.get(r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r2.get(r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r3 = r0.packageName
            r2 = 72
            r1 = 18
            r0 = 95
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L8d
            com.facebook.ads.redexgen.X.Lw r0 = com.facebook.ads.redexgen.uinode.EnumC0882Lw.BROWSER_LAUNCH_CHROME
            android.graphics.Bitmap r5 = com.facebook.ads.redexgen.uinode.AbstractC0883Lx.A01(r0)
            goto L2e
        L8d:
            com.facebook.ads.redexgen.X.Lw r0 = com.facebook.ads.redexgen.uinode.EnumC0882Lw.BROWSER_LAUNCH_NATIVE
            android.graphics.Bitmap r5 = com.facebook.ads.redexgen.uinode.AbstractC0883Lx.A01(r0)
            goto L2e
        L94:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.NJ.A0F
            java.lang.String r1 = "Ik1lUxwfUY0m3mLxiVim5pYdTJeAjco4"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "FSuRgMaNDMwOoFjkuIBtKYf6vflm3uDf"
            r0 = 1
            r2[r0] = r1
            r3.setImageBitmap(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.NJ.A09():void");
    }

    public NT getBrowserNavigationListener() {
        return this.A0C;
    }

    public void setListener(NI ni) {
        this.A05 = ni;
    }

    public void setTitle(String str) {
        this.A06.setTitle(str);
    }

    public void setUrl(String str) throws SecurityException {
        this.A07 = str;
        if (TextUtils.isEmpty(str) || A06(35, 11, 67).equals(this.A07)) {
            this.A06.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0G, PorterDuff.Mode.SRC_IN));
        } else {
            this.A06.setSubtitle(this.A07);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }
}
