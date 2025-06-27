package com.applovin.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.z4;
import java.util.List;

/* loaded from: classes.dex */
public final class mp extends bk {
    private final yg o;
    private final boolean p;
    private final int q;
    private final int r;
    private final String s;
    private final float t;
    private final int u;

    public mp(List list) {
        super("Tx3gDecoder");
        this.o = new yg();
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.q = bArr[24];
            this.r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.s = "Serif".equals(yp.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.u = i;
            boolean z = (bArr[0] & 32) != 0;
            this.p = z;
            if (z) {
                this.t = yp.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.t = 0.85f;
                return;
            }
        }
        this.q = 0;
        this.r = -1;
        this.s = "sans-serif";
        this.p = false;
        this.t = 0.85f;
        this.u = -1;
    }

    private void a(yg ygVar, SpannableStringBuilder spannableStringBuilder) throws ml {
        int length;
        a(ygVar.a() >= 12);
        int iC = ygVar.C();
        int iC2 = ygVar.C();
        ygVar.g(2);
        int iW = ygVar.w();
        ygVar.g(1);
        int iJ = ygVar.j();
        if (iC2 > spannableStringBuilder.length()) {
            kc.d("Tx3gDecoder", "Truncating styl end (" + iC2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            length = spannableStringBuilder.length();
        } else {
            length = iC2;
        }
        if (iC >= length) {
            kc.d("Tx3gDecoder", "Ignoring styl with start (" + iC + ") >= end (" + length + ").");
            return;
        }
        int i = length;
        b(spannableStringBuilder, iW, this.q, iC, i, 0);
        a(spannableStringBuilder, iJ, this.r, iC, i, 0);
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    private static void a(boolean z) throws ml {
        if (!z) {
            throw new ml("Unexpected subtitle format.");
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    @Override // com.applovin.impl.bk
    protected kl a(byte[] bArr, int i, boolean z) throws ml {
        this.o.a(bArr, i);
        String strA = a(this.o);
        if (strA.isEmpty()) {
            return np.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        b(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.s, 0, spannableStringBuilder.length());
        float fA = this.t;
        while (this.o.a() >= 8) {
            int iD = this.o.d();
            int iJ = this.o.j();
            int iJ2 = this.o.j();
            if (iJ2 == 1937013100) {
                a(this.o.a() >= 2);
                int iC = this.o.C();
                for (int i2 = 0; i2 < iC; i2++) {
                    a(this.o, spannableStringBuilder);
                }
            } else if (iJ2 == 1952608120 && this.p) {
                a(this.o.a() >= 2);
                fA = yp.a(this.o.C() / this.u, 0.0f, 0.95f);
            }
            this.o.f(iD + iJ);
        }
        return new np(new z4.b().a(spannableStringBuilder).a(fA, 0).a(0).a());
    }

    private static String a(yg ygVar) throws ml {
        char cF;
        a(ygVar.a() >= 2);
        int iC = ygVar.C();
        if (iC == 0) {
            return "";
        }
        if (ygVar.a() >= 2 && ((cF = ygVar.f()) == 65279 || cF == 65534)) {
            return ygVar.a(iC, Charsets.UTF_16);
        }
        return ygVar.a(iC, Charsets.UTF_8);
    }
}
