package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1056So extends FrameLayout implements MD {
    public static byte[] A0L;
    public static String[] A0M = {"n8b1XAz0kHAkpiWEmzC3t1pF5U", "eWK394xXCAUBfgpESuKIG56NqbrNFWJq", "5CdOn8t3diym6HDjOq5Y6uNvOx4lt5g3", "HN0pIlpAYl374dQUYji0gU", "nPJn2NzIeBIJ0ob92wkGV5", "7vv965TmOe", "OL6PAd", "N5PSCRASy1"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public C0932Nu A03;
    public PQ A04;
    public Q7 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1308b3 A0A;
    public final C5T A0B;
    public final C05126c A0C;
    public final C1207Yn A0D;
    public final J2 A0E;
    public final JA A0F;
    public final ViewOnSystemUiVisibilityChangeListenerC0861Lb A0G;
    public final MC A0H;
    public final FullScreenAdToolbar A0I;
    public final InterfaceC0895Mj A0J;
    public final ArrayList<C0966Pc> A0K;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.uinode.PQ A08(boolean r26, int r27) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1056So.A08(boolean, int):com.facebook.ads.redexgen.X.PQ");
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0L = new byte[]{113, -64, -73, 113, -62, -27, -95};
        String[] strArr = A0M;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[2] = "BvaU1dA3vF4hXYIjQV5InfWnSlZ4OmYy";
    }

    static {
        A0D();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1056So(C1207Yn c1207Yn, InterfaceC0895Mj interfaceC0895Mj, J2 j2, C1308b3 c1308b3, C05126c c05126c, MC mc) {
        super(c1207Yn);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new C1059Sr(this);
        this.A0D = c1207Yn;
        this.A0J = interfaceC0895Mj;
        this.A0E = j2;
        this.A0A = c1308b3;
        this.A0C = c05126c;
        this.A0H = mc;
        this.A0F = new JA(c1308b3.A0v(0).A12(), j2);
        ViewOnSystemUiVisibilityChangeListenerC0861Lb viewOnSystemUiVisibilityChangeListenerC0861Lb = new ViewOnSystemUiVisibilityChangeListenerC0861Lb(this);
        this.A0G = viewOnSystemUiVisibilityChangeListenerC0861Lb;
        viewOnSystemUiVisibilityChangeListenerC0861Lb.A05(EnumC0860La.A03);
        this.A05 = new Q7(c1207Yn, interfaceC0895Mj, c1308b3.A0T(), mc);
        FullScreenAdToolbar fullScreenAdToolbarA05 = A05();
        this.A0I = fullScreenAdToolbarA05;
        addView(fullScreenAdToolbarA05, new FrameLayout.LayoutParams(-1, fullScreenAdToolbarA05.getToolbarHeight()));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1056So.A00():int");
    }

    private int A01(int i) {
        if (this.A0A.A14() && i < this.A0A.A0z().size() && i >= 0) {
            return this.A0A.A0z().get(i).intValue();
        }
        return this.A0A.A0G();
    }

    public static /* synthetic */ int A02(C1056So c1056So, int i) {
        int i2 = c1056So.A01 + i;
        c1056So.A01 = i2;
        return i2;
    }

    private FullScreenAdToolbar A05() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new C1057Sp(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        int iA00 = A00();
        if (iA00 != 0) {
            this.A0D.A0E().A4G(iA00);
        }
    }

    private void A0B() {
        int i = this.A00;
        if (i > 0 && !TextUtils.isEmpty(this.A0A.A0v(i - 1).A12())) {
            J2 j2 = this.A0E;
            String strA12 = this.A0A.A0v(this.A00 - 1).A12();
            C0920Ni c0920Ni = new C0920Ni();
            PQ pq = this.A04;
            C0920Ni c0920NiA03 = c0920Ni.A03(pq != null ? pq.getAdViewabilityChecker() : null);
            PQ pq2 = this.A04;
            j2.A9X(strA12, c0920NiA03.A02(pq2 != null ? pq2.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0C() {
        this.A0D.A0E().A4E();
        this.A07 = true;
        this.A03 = new C0932Nu(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        C0966Pc c0966Pc = null;
        Iterator<C0966Pc> it = this.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0M[1].charAt(22) == '6') {
                String[] strArr = A0M;
                strArr[7] = "ZPnrdglx3i";
                strArr[5] = "Z92DtyKnO3";
                if (!zHasNext) {
                    break;
                }
                C0966Pc next = it.next();
                if (next.A00 == C0966Pc.A06) {
                    c0966Pc = next;
                    break;
                }
            } else {
                throw new RuntimeException();
            }
        }
        if (c0966Pc != null) {
            A0I(this.A03, c0966Pc);
        } else if (!this.A0K.isEmpty()) {
            A0I(this.A03, this.A0K.get(0));
        }
        A0Q(true);
        this.A0I.setOnlyPageDetails(null);
        PQ pq = this.A04;
        if (pq != null) {
            AbstractC0874Lo.A0J(pq);
            this.A04.A0z();
            this.A04 = null;
        }
        AbstractC0874Lo.A0J(this.A03);
        AbstractC0874Lo.A0G(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0E() {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0G.A05(EnumC0860La.A04);
    }

    private synchronized void A0F() {
        this.A0H.A43(this.A0J.A5s());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(float f) {
        float seenCurrentPosMS;
        float fA01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A14() ? 0 : this.A01) + f;
        if (fA01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / fA01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A14()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            this.A09 = true;
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(int i) {
        this.A0D.A0E().A4B(i);
        this.A09 = true;
        A0F();
        A0B();
        this.A0H.A43(this.A0J.A6u());
    }

    private void A0I(ViewGroup viewGroup, C0966Pc c0966Pc) {
        if (c0966Pc.A00 == C0966Pc.A06 && c0966Pc.A03 != null) {
            OA.A00(this.A0D, viewGroup, c0966Pc.A03);
        } else {
            AbstractC0874Lo.A0M(viewGroup, c0966Pc.A01);
        }
        this.A0I.setFullscreen(c0966Pc.A05);
        this.A0I.A06(c0966Pc.A02, c0966Pc.A04);
    }

    private void A0J(AbstractC1310b5 abstractC1310b5) {
        if (A0V(abstractC1310b5)) {
            int i = this.A02;
            if (A0M[2].charAt(7) != '3') {
                throw new RuntimeException();
            }
            A0M[2] = "vyv5r133RkdgG8M1gH7WIgZDBjsgq9Je";
            if (i == 2) {
                this.A0I.setOnlyPageDetails(abstractC1310b5.A10());
                return;
            }
        }
        this.A0I.setOnlyPageDetails(null);
    }

    private final void A0K(C5V c5v) {
        c5v.A0N(this.A0B);
        int i = c5v.A0J().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0R(this.A0A.A11(), i);
        A0E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(boolean z) {
        boolean z2 = (!A0T() || A0S() || A0U()) ? false : true;
        boolean zA0S = A0S();
        if (A0M[1].charAt(22) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[7] = "fhNsXNJVUA";
        strArr[5] = "wXa0tVX5fv";
        if (!zA0S && !z2) {
            this.A09 = true;
            if (z) {
                this.A0I.setToolbarActionMessage(A09(0, 0, 66));
            }
            this.A0I.setToolbarActionMode(0);
            return;
        }
        this.A0I.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(boolean z, int i) {
        PQ pq = this.A04;
        if (pq != null) {
            pq.A0z();
            PQ pq2 = this.A04;
            if (A0M[1].charAt(22) != '6') {
                throw new RuntimeException();
            }
            A0M[2] = "W3TlfOl3oEXDpQnuuCTH10eCcUmU4b3A";
            pq2.removeAllViews();
            AbstractC0874Lo.A0J(this.A04);
        }
        if (!A0S()) {
            this.A09 = true;
            if (A0T()) {
                A0C();
                return;
            } else {
                A0H(1);
                return;
            }
        }
        if (this.A0A.A14()) {
            this.A09 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        boolean isLoaded = this.A0D.A00().A8x(this.A0A.A0v(this.A00).A12(), this.A0A.A0w());
        if (!isLoaded) {
            this.A0D.A0E().A4C();
            A0H(2);
            return;
        }
        PQ pqA08 = A08(z, i);
        this.A04 = pqA08;
        setupToolbarForAd(pqA08);
        addView(this.A04, 0, A0N);
        this.A00++;
        this.A04.A11();
    }

    private boolean A0S() {
        return this.A00 < this.A0A.A0s();
    }

    private boolean A0T() {
        return this.A0A.A0r() == 2;
    }

    private final boolean A0U() {
        return this.A07;
    }

    public static boolean A0V(AbstractC1310b5 abstractC1310b5) {
        return TextUtils.isEmpty(abstractC1310b5.A0x().A0D().A08());
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        this.A0H.A3U(this, A0N);
        A0K(c5v);
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z) {
        PQ pq = this.A04;
        if (pq != null) {
            pq.A12(z);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z) {
        PQ pq = this.A04;
        if (pq != null) {
            pq.A13(z);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    public PQ getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        PQ pq = this.A04;
        if (pq != null) {
            pq.onConfigurationChanged(configuration);
        }
        PQ pq2 = this.A04;
        if (pq2 instanceof T8) {
            A0I(pq2, pq2.getFullScreenAdStyle());
            A0J(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() {
        PQ pq = this.A04;
        if (pq != null) {
            pq.A0z();
            this.A04 = null;
        }
        this.A0D.A00().A4H(this.A0A.A0w());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(MC mc) {
    }

    public void setServerSideRewardHandler(Q7 q7) {
        this.A05 = q7;
    }

    private void setupToolbarForAd(PQ pq) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        AbstractC1310b5 abstractC1310b5A0v = this.A0A.A0v(this.A00);
        this.A0I.A09(this.A0D, abstractC1310b5A0v.A0r());
        this.A0I.A08(abstractC1310b5A0v.A10(), abstractC1310b5A0v.A12(), A01(this.A00));
        C0966Pc fullScreenAdStyle = pq.getFullScreenAdStyle();
        A0I(pq, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A09(4, 3, 90) + (this.A00 + 1) + A09(0, 4, 42) + this.A0A.A0s());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
        A0J(abstractC1310b5A0v);
    }
}
