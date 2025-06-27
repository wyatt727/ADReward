package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9P extends UL {
    public static byte[] A0F;
    public static String[] A0G = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC1310b5 A03;
    public C05126c A04;
    public C04513r A05;
    public O2 A06;
    public C1043Sb A07;
    public RD A08;
    public RE A09;
    public String A0A;
    public List<C0979Pp> A0B;
    public boolean A0C;
    public final C1207Yn A0D;
    public final C0866Lg A0E;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0G;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0B() {
        A0F = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114, 117, 98, 112, 102, 117, 99, 98, 99, 81, 110, 99, 98, 104, 70, 99, 67, 102, 115, 102, 69, 114, 105, 99, 107, 98};
    }

    static {
        A0B();
        A0H = (int) (LD.A02 * 48.0f);
        A0I = (int) (LD.A02 * 8.0f);
        A0J = (int) (LD.A02 * 8.0f);
        A0L = (int) (LD.A02 * 56.0f);
        A0K = (int) (LD.A02 * 12.0f);
    }

    public C9P(C1207Yn c1207Yn, J2 j2, C05126c c05126c, MC mc, FS fs) {
        super(c1207Yn, j2, mc, fs);
        this.A0E = new C0866Lg();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new Q7(c1207Yn, new U8(), super.A0A.A0T(), mc);
        this.A04 = c05126c;
        this.A0D = c1207Yn;
    }

    public C9P(C1207Yn c1207Yn, J2 j2, C05126c c05126c, MC mc, FU fu) {
        super(c1207Yn, j2, mc, fu);
        this.A0E = new C0866Lg();
        this.A0C = false;
        this.A04 = c05126c;
        this.A0D = c1207Yn;
    }

    private AbstractC1310b5 A00(Intent intent) {
        if (super.A07) {
            return (AbstractC1310b5) intent.getSerializableExtra(A09(14, 25, 77));
        }
        return (AbstractC1310b5) intent.getSerializableExtra(A09(0, 14, 93));
    }

    private final void A0C() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C04513r c04513r = this.A05;
        if (c04513r != null) {
            c04513r.removeAllViews();
            this.A05.A1Q();
            this.A05 = null;
        }
        O2 o2 = this.A06;
        if (o2 != null) {
            o2.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0D(int r25, android.os.Bundle r26) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C9P.A0D(int, android.os.Bundle):void");
    }

    private void A0E(AbstractC1310b5 abstractC1310b5) {
        this.A03 = abstractC1310b5;
        this.A0A = abstractC1310b5.A12();
        this.A00 = this.A03.A0C();
        this.A01 = this.A03.A0D();
        List<C1G> listA14 = this.A03.A14();
        List<AdInfo> adInfoList = new ArrayList<>(listA14.size());
        this.A0B = adInfoList;
        int i = 0;
        while (true) {
            int size = listA14.size();
            String[] strArr = A0G;
            String str = strArr[5];
            String str2 = strArr[4];
            int i2 = str.charAt(16);
            if (i2 == str2.charAt(16)) {
                throw new RuntimeException();
            }
            A0G[3] = "1AHb04hcylshFNuVFPVd0IA840Fx90m0";
            if (i < size) {
                C1G c1g = listA14.get(i);
                List<C0979Pp> list = this.A0B;
                int i3 = listA14.size();
                list.add(new C0979Pp(i, i3, c1g));
                i++;
            } else {
                return;
            }
        }
    }

    private void A0F(C1043Sb c1043Sb) throws IllegalStateException {
        new C0691Ec().A0G(this.A05);
        c1043Sb.A0Y(new SR(this));
        this.A06 = new O2(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.UL
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) throws IllegalStateException {
        AbstractC1310b5 dataBundle = A00(intent);
        A0V(c5v);
        A0E(dataBundle);
        A0D(c5v.A0J().getResources().getConfiguration().orientation, bundle);
        c5v.A0N(new SQ(this, c5v));
        AbstractC1310b5 dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A0x().A0D().A03();
        if (super.A07) {
            AbstractC1310b5 dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A0x().A0D().A02();
        }
        if (unskippableSec > 0) {
            A0T(unskippableSec);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.UL, com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z) {
        super.ACW(z);
        C1043Sb c1043Sb = this.A07;
        if (c1043Sb != null) {
            c1043Sb.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.UL, com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z) {
        super.ACu(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
        C1043Sb c1043Sb = this.A07;
        if (c1043Sb != null) {
            c1043Sb.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.UL
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws IllegalStateException {
        Bundle bundle = new Bundle();
        AFT(bundle);
        A0C();
        A0D(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.uinode.UL, com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() {
        super.onDestroy();
        if (C0796Ih.A1W(this.A0D)) {
            this.A0D.A0A().AGk(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.A9X(this.A0A, new C0920Ni().A03(this.A09).A02(this.A0E).A05());
        }
        A0C();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
