package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0887Mb extends LinearLayout {
    public static String[] A07 = {"RdKbZKE5ShqjtspsYuId0BpVT", "jFs6Ox2yxsj", "", "O0DGVMIkWcl", "ZjYxtVw01iwSMNXN0b17Jtyc9gHU9Z2d", "b1LSaO6GQJOSELIr8C99", "", "wukZGaaSm"};
    public static final int A08 = (int) (LD.A02 * 15.0f);
    public static final int A09 = (int) (LD.A02 * 10.0f);
    public static final int A0A = (int) (LD.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final C1207Yn A05;
    public final C0931Nt A06;

    public C0887Mb(C1207Yn c1207Yn, int i) {
        super(c1207Yn);
        this.A01 = false;
        this.A05 = c1207Yn;
        ImageView imageView = new ImageView(c1207Yn);
        this.A02 = imageView;
        int i2 = A09;
        imageView.setPadding(i2, i2, i2, i2);
        C0931Nt c0931Nt = new C0931Nt(c1207Yn);
        this.A06 = c0931Nt;
        c0931Nt.setProgress(0.0f);
        c0931Nt.setPadding(i2, i2, i2, i2);
        this.A04 = new TextView(c1207Yn);
        setOrientation(0);
        this.A03 = new LinearLayout(c1207Yn);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i = A0A;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        AbstractC0874Lo.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams2);
        this.A03.addView(this.A06, layoutParams2);
        addView(this.A03, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A04, actionTextLayoutParams);
    }

    private void A01() {
        int i;
        C0931Nt c0931Nt = this.A06;
        int i2 = this.A00;
        int i3 = 8;
        if (i2 == 2 || i2 == 6) {
            i = this.A01 ? 4 : 0;
        } else {
            i = 8;
        }
        c0931Nt.setVisibility(i);
        ImageView imageView = this.A02;
        int i4 = this.A00;
        if (i4 == 5) {
            i3 = 4;
        } else if (i4 != 2 && i4 != 6) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
    }

    public final void A02(C1P c1p, boolean z, boolean z2) {
        int iA04 = c1p.A04(z);
        C0931Nt c0931Nt = this.A06;
        int accentColor = AbstractC04232p.A01(iA04, 77);
        c0931Nt.A02(accentColor, iA04, 110);
        this.A02.setColorFilter(iA04);
        if (z2) {
            TextView textView = this.A04;
            int accentColor2 = AbstractC04232p.A01(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A04.setTextColor(iA04);
    }

    public final boolean A03() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A04() {
        int i = this.A00;
        return (i == 2 || i == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A06.setProgressWithAnimation(f);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public void setProgressImage(EnumC0882Lw enumC0882Lw) {
        this.A06.setImage(enumC0882Lw);
    }

    public void setProgressImmediate(float f) {
        this.A06.clearAnimation();
        this.A06.setProgress(f);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i) {
        EnumC0882Lw enumC0882Lw;
        this.A05.A0E().ADK(i);
        this.A00 = i;
        A01();
        setVisibility(0);
        if (Build.VERSION.SDK_INT >= 16) {
            this.A02.setImageAlpha(255);
        }
        ImageView imageView = this.A02;
        int i2 = A09;
        imageView.setPadding(i2, i2, i2, i2);
        switch (i) {
            case 0:
                enumC0882Lw = EnumC0882Lw.CROSS;
                break;
            case 1:
                enumC0882Lw = EnumC0882Lw.SKIP_ARROW;
                break;
            case 2:
            default:
                enumC0882Lw = EnumC0882Lw.CROSS;
                break;
            case 3:
                enumC0882Lw = EnumC0882Lw.MINIMIZE_ARROW;
                break;
            case 4:
                enumC0882Lw = EnumC0882Lw.CROSS;
                this.A02.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                enumC0882Lw = EnumC0882Lw.CROSS;
                break;
            case 6:
                enumC0882Lw = EnumC0882Lw.CROSS;
                break;
            case 7:
                enumC0882Lw = EnumC0882Lw.CROSS;
                if (Build.VERSION.SDK_INT >= 16) {
                    this.A02.setImageAlpha(110);
                }
                ImageView imageView2 = this.A02;
                if (A07[4].charAt(13) == 'C') {
                    throw new RuntimeException();
                }
                String[] strArr = A07;
                strArr[6] = "";
                strArr[2] = "";
                int i3 = A08;
                imageView2.setPadding(i3, i3, i3, i3);
                break;
        }
        this.A02.setImageBitmap(AbstractC0883Lx.A01(enumC0882Lw));
        if (i == 1) {
            AbstractC0874Lo.A0G(1005, this.A02);
        } else {
            AbstractC0874Lo.A0G(1002, this.A02);
        }
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A04.setVisibility(z ? 0 : 4);
    }
}
