package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class NP extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"c3XyMVVK2ZPeOt0e4CLBNBDbK", "DsCUYZfHfFO6YC0ZUz1", "eLhkJXERmPgt", "", "", "5cC1cV814bBflaO82eB2FX5nm", "", "kS5kSd3yRJfI"};
    public Drawable A00;
    public TextView A01;
    public TextView A02;
    public final C1207Yn A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {7, 27, 27, 31, 28};
        if (A05[4].length() != 0) {
            throw new RuntimeException();
        }
        A05[1] = "lhzBP3Bo4mEfv1CoOUdrfuIGeogVZlJ";
        A04 = bArr;
    }

    static {
        A02();
    }

    public NP(C1207Yn c1207Yn) {
        super(c1207Yn);
        this.A03 = c1207Yn;
        A01();
    }

    private void A01() {
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.A02 = new TextView(getContext());
        LinearLayout.LayoutParams titleTextViewParams = new LinearLayout.LayoutParams(-1, -2);
        this.A02.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.A02.setTextSize(2, 20.0f);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setSingleLine(true);
        this.A02.setVisibility(8);
        this.A02.setGravity(17);
        addView(this.A02, titleTextViewParams);
        this.A01 = new TextView(getContext());
        LinearLayout.LayoutParams titleTextViewParams2 = new LinearLayout.LayoutParams(-2, -2);
        this.A01.setAlpha(0.5f);
        this.A01.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.A01.setTextSize(2, 15.0f);
        float density = 5.0f * f;
        this.A01.setCompoundDrawablePadding((int) density);
        this.A01.setEllipsize(TextUtils.TruncateAt.END);
        this.A01.setSingleLine(true);
        this.A01.setVisibility(8);
        this.A01.setGravity(17);
        addView(this.A01, titleTextViewParams2);
        if (C0796Ih.A2N(this.A03)) {
            this.A02.setVisibility(4);
            this.A01.setVisibility(4);
        }
    }

    private Drawable getPadlockDrawable() {
        if (this.A00 == null) {
            this.A00 = AbstractC0883Lx.A03(this.A03, EnumC0882Lw.BROWSER_PADLOCK);
        }
        return this.A00;
    }

    public void setSubtitle(String str) throws SecurityException {
        if (TextUtils.isEmpty(str)) {
            this.A01.setText((CharSequence) null);
            this.A01.setVisibility(4);
        } else {
            Uri uriA00 = AbstractC0858Ky.A00(str);
            this.A01.setText(uriA00.getHost());
            this.A01.setCompoundDrawablesRelativeWithIntrinsicBounds(A00(0, 5, 24).equals(uriA00.getScheme()) ? getPadlockDrawable() : null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.A01.setVisibility(0);
        }
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A02.setText((CharSequence) null);
            String[] strArr = A05;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A05[4] = "";
            this.A02.setVisibility(4);
            return;
        }
        this.A02.setText(str);
        this.A02.setVisibility(0);
    }
}
