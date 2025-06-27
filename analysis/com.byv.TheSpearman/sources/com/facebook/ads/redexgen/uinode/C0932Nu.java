package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0932Nu extends RelativeLayout {
    public static String[] A06 = {"GfXFZtEZk1NZfob7Kzf1xTq0EESlD7si", "ewzI1iE8tF5Z2B86REyPWWZDw7DKLBH9", "kOyZSgqEibXIKTIW7tLvn8rBuxcmsyDd", "XpDxTY", "v6DhXkGtrQWw75h", "XA27k4WXBENWs2k6KViFhCSGxV0pMN8g", "cLUj8uWE8C4NOcjwK2waVMiWyPuWQVsm", ""};
    public final int A00;
    public final LinearLayout A01;
    public final C1308b3 A02;
    public final C1207Yn A03;
    public final J2 A04;
    public final MC A05;

    public C0932Nu(C1207Yn c1207Yn, C1308b3 c1308b3, J2 j2, MC mc, int i, int i2) {
        super(c1207Yn);
        this.A03 = c1207Yn;
        this.A02 = c1308b3;
        this.A04 = j2;
        this.A05 = mc;
        this.A00 = i;
        LinearLayout linearLayout = new LinearLayout(c1207Yn);
        this.A01 = linearLayout;
        A00();
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i2);
    }

    private void A00() {
        int i = 0;
        while (true) {
            C1308b3 c1308b3 = this.A02;
            if (A06[4].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "6kBjYVyQvbEVjVKJKeawSG2VEKMXDcJL";
            strArr[5] = "aQimcOJmMOk7TFcbK4Cqi1kaRliNN4Qj";
            int i2 = c1308b3.A0s();
            if (i < i2) {
                C1083Tp c1083Tp = new C1083Tp(this.A03, this.A02.A0v(i), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i3 = C1083Tp.A0B;
                int i4 = C1083Tp.A0B;
                int i5 = C1083Tp.A0B;
                int i6 = C1083Tp.A0B;
                layoutParams.setMargins(i3, i4, i5, i6);
                c1083Tp.setLayoutParams(layoutParams);
                this.A01.addView(c1083Tp);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i) {
        if (i != 1) {
            this.A01.setOrientation(0);
            LinearLayout linearLayout = this.A01;
            int i2 = this.A00;
            linearLayout.setPadding(0, i2, 0, (int) (i2 * 0.25d));
            return;
        }
        this.A01.setOrientation(1);
        LinearLayout linearLayout2 = this.A01;
        int i3 = this.A00;
        linearLayout2.setPadding(0, (int) (i3 * 1.5d), 0, i3);
    }
}
