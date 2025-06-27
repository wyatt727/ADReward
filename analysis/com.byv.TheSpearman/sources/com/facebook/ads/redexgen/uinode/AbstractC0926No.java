package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.No, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0926No extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", ""};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final C1207Yn A03;
    public final ViewOnClickListenerC1079Tl A04;
    public final O3 A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {9, 12, 12, 13, 28, 9, 17, 20, 27};
        if (A07[1].length() != 25) {
            throw new RuntimeException();
        }
        A07[2] = "W8PIFEgMaUlhByfzvyeLgAFdtcDk8ZOz";
        A06 = bArr;
    }

    public abstract void A0A(int i);

    public abstract View getExpandableLayout();

    public abstract void setTitleMaxLines(int i);

    static {
        A01();
        A08 = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC0926No(C1207Yn c1207Yn, int i, C1P c1p, boolean z, String str, J2 j2, MC mc, RE re, C0866Lg c0866Lg, C1U c1u) {
        super(c1207Yn);
        AbstractC0874Lo.A0K(this);
        this.A03 = c1207Yn;
        this.A00 = i;
        O3 o3 = new O3(c1207Yn);
        this.A05 = o3;
        AbstractC0874Lo.A0M(o3, 0);
        AbstractC0874Lo.A0K(o3);
        ViewOnClickListenerC1079Tl viewOnClickListenerC1079Tl = new ViewOnClickListenerC1079Tl(c1207Yn, str, c1p, z, j2, mc, re, c0866Lg, c1u);
        this.A04 = viewOnClickListenerC1079Tl;
        AbstractC0874Lo.A0G(1001, viewOnClickListenerC1079Tl);
        this.A01 = OI.A03(viewOnClickListenerC1079Tl, A00(0, 9, 119));
        RelativeLayout relativeLayout = new RelativeLayout(c1207Yn);
        this.A02 = relativeLayout;
        relativeLayout.setLayoutParams(A08);
        AbstractC0874Lo.A0K(relativeLayout);
    }

    public void A09() {
        this.A05.setOnClickListener(this.A01);
    }

    public final ViewOnClickListenerC1079Tl getCTAButton() {
        return this.A04;
    }

    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C1N c1n, C1Q c1q, String str, String str2, InterfaceC0928Nq interfaceC0928Nq) {
        this.A04.setCta(c1q, str, new HashMap(), interfaceC0928Nq);
        AsyncTaskC1084Tq asyncTaskC1084Tq = new AsyncTaskC1084Tq(this.A05, this.A03);
        int i = this.A00;
        asyncTaskC1084Tq.A05(i, i).A07(str2);
    }
}
