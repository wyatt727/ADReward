package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1232Zn extends AnonymousClass51 {
    public static byte[] A06;
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final int A03(View view, int i) {
        AbstractC04734o abstractC04734oA08 = A08();
        if (abstractC04734oA08 == null || !abstractC04734oA08.A21()) {
            return 0;
        }
        C04744p c04744p = (C04744p) view.getLayoutParams();
        return A0N(abstractC04734oA08.A0o(view) - c04744p.topMargin, abstractC04734oA08.A0j(view) + c04744p.bottomMargin, abstractC04734oA08.A0g(), abstractC04734oA08.A0X() - abstractC04734oA08.A0d(), i);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{41, 12, 11, 0, 4, 23, 54, 8, 10, 10, 17, 13, 54, 6, 23, 10, 9, 9, 0, 23, 21, 35, 57, 108, Utf8.REPLACEMENT_BYTE, 36, 35, 57, 32, 40, 108, 35, 58, 41, 62, 62, 37, 40, 41, 108, 47, 35, 33, 60, 57, 56, 41, 31, 47, 62, 35, 32, 32, 26, 41, 47, 56, 35, 62, 10, 35, 62, 28, 35, Utf8.REPLACEMENT_BYTE, 37, 56, 37, 35, 34, 108, 59, 36, 41, 34, 108, 56, 36, 41, 108, 0, 45, 53, 35, 57, 56, 1, 45, 34, 45, 43, 41, 62, 108, 40, 35, 41, Utf8.REPLACEMENT_BYTE, 108, 34, 35, 56, 108, 37, 33, 60, 32, 41, 33, 41, 34, 56, 108, 42, 55, 56, 41, 121, 41, 43, 60, Utf8.REPLACEMENT_BYTE, 60, 43, 60, 55, 58, 60, 121, 42, 49, 54, 44, 53, Base64.padSymbol, 121, 59, 60, 121, 54, 55, 60, 121, 54, Utf8.REPLACEMENT_BYTE, 121, 45, 49, 60, 121, 58, 54, 55, 42, 45, 56, 55, 45, 42, 121, Base64.padSymbol, 60, Utf8.REPLACEMENT_BYTE, 48, 55, 60, Base64.padSymbol, 121, 48, 55, 121, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, 117, 121, 42, 45, 56, 43, 45, 48, 55, 62, 121, 46, 48, 45, 49, 121, 10, 23, 24, 9, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public int A0O(View view, int i) {
        AbstractC04734o abstractC04734oA08 = A08();
        if (abstractC04734oA08 == null || !abstractC04734oA08.A20()) {
            return 0;
        }
        C04744p c04744p = (C04744p) view.getLayoutParams();
        return A0N(abstractC04734oA08.A0k(view) - c04744p.leftMargin, abstractC04734oA08.A0n(view) + c04744p.rightMargin, abstractC04734oA08.A0e(), abstractC04734oA08.A0h() - abstractC04734oA08.A0f(), i);
    }

    public C1232Zn(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i, int i2) {
        int before = i - i2;
        if (i * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(C04834z c04834z) {
        PointF pointFA0P = A0P(A07());
        if (pointFA0P == null || (pointFA0P.x == 0.0f && pointFA0P.y == 0.0f)) {
            c04834z.A03(A07());
            A09();
            return;
        }
        A0B(pointFA0P);
        this.A02 = pointFA0P;
        this.A00 = (int) (pointFA0P.x * 10000.0f);
        this.A01 = (int) (pointFA0P.y * 10000.0f);
        int time = (int) (A0L(10000) * 1.2f);
        c04834z.A04((int) (this.A00 * 1.2f), (int) (this.A01 * 1.2f), time, this.A05);
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass51
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass51
    public final void A0H(int i, int i2, AnonymousClass53 anonymousClass53, C04834z c04834z) {
        if (A06() == 0) {
            A09();
            return;
        }
        this.A00 = A01(this.A00, i);
        int iA01 = A01(this.A01, i2);
        this.A01 = iA01;
        if (this.A00 == 0 && iA01 == 0) {
            A07(c04834z);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass51
    public void A0I(View view, AnonymousClass53 anonymousClass53, C04834z c04834z) {
        int iA0O = A0O(view, A0K());
        int dx = A00();
        int iA03 = A03(view, dx);
        int dy = iA0O * iA0O;
        int dx2 = iA03 * iA03;
        int time = A0M((int) Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -iA0O;
            int dy2 = -iA03;
            c04834z.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i) {
        return (int) Math.ceil(Math.abs(i) * this.A03);
    }

    public final int A0M(int i) {
        return (int) Math.ceil(A0L(i) / 0.3356d);
    }

    public final int A0N(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException(A04(113, 93, 122));
        }
    }

    public PointF A0P(int i) {
        Object objA08 = A08();
        if (objA08 instanceof AnonymousClass50) {
            return ((AnonymousClass50) objA08).A4O(i);
        }
        Log.w(A04(0, 20, 70), A04(20, 93, 111) + AnonymousClass50.class.getCanonicalName());
        return null;
    }
}
