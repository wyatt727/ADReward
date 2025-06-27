package com.facebook.ads.redexgen.uinode;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0734Fv {
    public static byte[] A0M;
    public static String[] A0N = {"bEAjJCvVtkePzUcw9rvynCWhWZ7YtTC", "sFv5If9m5Sphdt63zNjPhUbGsirLMRkb", "dm26J1OSzusJji0dpgrnr09k5LC689lq", "Nx5OZNPL7zWyatFSZAWV1dERcLRuFkfb", "8nXEVS4hfg5ng3YQnnC7NT8u0hAmIJYk", "i1gAYPXKkwHe1sE5BOr5igG8IxAvgiYs", "Y1prefJax7dGS9GUqUH50jWlMMgJtsPr", "K9Y4TfEKpnP3QqzXtNTgN9rOyJLVMPLw"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final int[] A0X;
    public static final boolean[] A0Y;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<SpannableString> A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0M = new byte[]{81, 106, 97, 124, 116, 97, 103, 112, 97, 96, 36, 110, 113, 119, 112, 109, 98, 109, 103, 101, 112, 109, 107, 106, 36, 114, 101, 104, 113, 97, 62, 36};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final WJ A05() {
        Layout.Alignment alignment;
        float f;
        float f2;
        if (A0H()) {
            if (A0N[3].charAt(10) != 'W') {
                throw new RuntimeException();
            }
            A0N[6] = "XXMrNDw86HMhGPknailYt8C4YmEezPlD";
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < this.A0L.size(); i++) {
            spannableStringBuilder.append((CharSequence) this.A0L.get(i));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A02());
        switch (this.A07) {
            case 0:
            case 3:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
            case 1:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                if (A0N[3].charAt(10) != 'W') {
                    A0N[1] = "GUzkX8UKOS2SBWNLmpbuPvYZfRUrk3bC";
                    break;
                } else {
                    A0N[1] = "qTQORRfF62rpJvlAVACWybIcEIDyrroZ";
                    break;
                }
            case 2:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                throw new IllegalArgumentException(A03(0, 32, 89) + this.A07);
        }
        if (this.A0H) {
            f = this.A05 / 99.0f;
            f2 = this.A0D / 99.0f;
        } else {
            f = this.A05 / 209.0f;
            f2 = this.A0D / 74.0f;
        }
        float f3 = (f * 0.9f) + 0.05f;
        float f4 = (0.9f * f2) + 0.05f;
        int i2 = this.A00;
        int i3 = i2 % 3 == 0 ? 0 : i2 % 3 == 1 ? 1 : 2;
        int i4 = i2 / 3 == 0 ? 0 : i2 / 3 == 1 ? 1 : 2;
        int i5 = this.A0E;
        return new WJ(spannableStringBuilder, alignment, f4, 0, i3, f3, i4, Float.MIN_VALUE, i5 != A0O, i5, this.A09);
    }

    static {
        A04();
        A0P = A01(2, 2, 2, 0);
        int iA01 = A01(0, 0, 0, 0);
        A0O = iA01;
        int iA012 = A01(0, 0, 0, 3);
        A0Q = iA012;
        A0V = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0W = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0X = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0Y = new boolean[]{false, false, false, true, true, true, false};
        A0U = new int[]{iA01, iA012, iA01, iA01, iA012, iA01, iA01};
        A0T = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0S = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0R = new int[]{iA01, iA01, iA01, iA01, iA01, iA012, iA012};
    }

    public C0734Fv() {
        A08();
    }

    public static int A00(int i, int i2, int i3) {
        return A01(i, i2, i3, 0);
    }

    public static int A01(int i, int i2, int i3, int i4) {
        int i5;
        AbstractC0763Ha.A00(i, 0, 4);
        AbstractC0763Ha.A00(i2, 0, 4);
        AbstractC0763Ha.A00(i3, 0, 4);
        AbstractC0763Ha.A00(i4, 0, 4);
        switch (i4) {
            case 0:
            case 1:
                i5 = 255;
                break;
            case 2:
                i5 = 127;
                break;
            case 3:
                i5 = 0;
                break;
            default:
                i5 = 255;
                break;
        }
        int alpha = i > 1 ? 255 : 0;
        return Color.argb(i5, alpha, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
    }

    private final SpannableString A02() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            int i = this.A04;
            int length2 = A0N[0].length();
            if (length2 != 31) {
                throw new RuntimeException();
            }
            A0N[4] = "UcnYu1PwHAGC3vbuX83YmC5zO9IPxpwr";
            if (i != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A0K.delete(length2, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        int i = A0O;
        this.A0E = i;
        this.A03 = A0P;
        this.A01 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(char r7) {
        /*
            r6 = this;
            r0 = 10
            if (r7 != r0) goto L66
            java.util.List<android.text.SpannableString> r1 = r6.A0L
            android.text.SpannableString r0 = r6.A02()
            r1.add(r0)
            android.text.SpannableStringBuilder r0 = r6.A0K
            r0.clear()
            int r0 = r6.A06
            r1 = -1
            r4 = 0
            if (r0 == r1) goto L1a
            r6.A06 = r4
        L1a:
            int r0 = r6.A0C
            if (r0 == r1) goto L20
            r6.A0C = r4
        L20:
            int r0 = r6.A04
            if (r0 == r1) goto L26
            r6.A04 = r4
        L26:
            int r0 = r6.A02
            if (r0 == r1) goto L2c
            r6.A02 = r4
        L2c:
            boolean r0 = r6.A0I
            if (r0 == 0) goto L56
            java.util.List<android.text.SpannableString> r0 = r6.A0L
            int r5 = r0.size()
            int r3 = r6.A0B
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0734Fv.A0N
            r0 = 3
            r1 = r1[r0]
            r0 = 10
            char r1 = r1.charAt(r0)
            r0 = 87
            if (r1 == r0) goto L4d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0734Fv.A0N
            java.lang.String r1 = "z94yFfaTy8Odmt8n2fLZMjDbCxUThPz"
            r0 = 0
            r2[r0] = r1
            if (r5 >= r3) goto L60
        L56:
            java.util.List<android.text.SpannableString> r0 = r6.A0L
            int r1 = r0.size()
            r0 = 15
            if (r1 < r0) goto L6b
        L60:
            java.util.List<android.text.SpannableString> r0 = r6.A0L
            r0.remove(r4)
            goto L2c
        L66:
            android.text.SpannableStringBuilder r0 = r6.A0K
            r0.append(r7)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0734Fv.A09(char):void");
    }

    public final void A0A(int i, int i2) {
        if (this.A0A != i) {
            A09('\n');
        }
        this.A0A = i;
    }

    public final void A0B(int i, int i2, int i3) {
        if (this.A04 != -1 && this.A03 != i) {
            this.A0K.setSpan(new ForegroundColorSpan(this.A03), this.A04, this.A0K.length(), 33);
        }
        if (i != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i;
        }
        if (this.A02 != -1 && this.A01 != i2) {
            this.A0K.setSpan(new BackgroundColorSpan(this.A01), this.A02, this.A0K.length(), 33);
        }
        if (i2 != A0O) {
            this.A02 = this.A0K.length();
            this.A01 = i2;
        }
    }

    public final void A0C(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
        if (this.A06 != -1) {
            if (!z) {
                this.A0K.setSpan(new StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z) {
            this.A06 = this.A0K.length();
        }
        int i6 = this.A0C;
        if (A0N[3].charAt(10) != 'W') {
            throw new RuntimeException();
        }
        A0N[3] = "GaQXCBjIxpWixMOvnA1JS7CVs7IBjZSt";
        if (i6 != -1) {
            if (!z2) {
                this.A0K.setSpan(new UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        this.A0C = this.A0K.length();
    }

    public final void A0D(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        this.A0E = i;
        this.A07 = i6;
    }

    public final void A0E(boolean z) {
        this.A0J = z;
    }

    public final void A0F(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A0G = true;
        this.A0J = z;
        this.A0I = z2;
        this.A09 = i;
        this.A0H = z4;
        this.A0D = i2;
        this.A05 = i3;
        this.A00 = i6;
        if (this.A0B != i4 + 1) {
            int i9 = i4 + 1;
            if (A0N[1].charAt(10) == 's') {
                throw new RuntimeException();
            }
            A0N[5] = "GL1AptVbsbHBPnQiC9PDsuTMTdKpKMZ4";
            this.A0B = i9;
            while (true) {
                if ((!z2 || this.A0L.size() < this.A0B) && this.A0L.size() < 15) {
                    break;
                } else {
                    this.A0L.remove(0);
                }
            }
        }
        if (i7 != 0 && this.A0F != i7) {
            this.A0F = i7;
            int i10 = i7 - 1;
            A0D(A0U[i10], A0Q, A0Y[i10], 0, A0W[i10], A0X[i10], A0V[i10]);
        }
        if (i8 != 0 && this.A08 != i8) {
            this.A08 = i8;
            int i11 = i8 - 1;
            A0C(0, 1, 1, false, false, A0S[i11], A0T[i11]);
            A0B(A0P, A0R[i11], A0O);
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        return !A0G() || (this.A0L.isEmpty() && this.A0K.length() == 0);
    }

    public final boolean A0I() {
        return this.A0J;
    }
}
