package com.applovin.impl;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes.dex */
abstract class jp {
    private static hp b(hp hpVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(hpVar);
        while (!arrayDeque.isEmpty()) {
            hp hpVar2 = (hp) arrayDeque.pop();
            kp kpVarA = a(hpVar2.f, hpVar2.c(), map);
            if (kpVarA != null && kpVarA.i() == 3) {
                return hpVar2;
            }
            for (int iA = hpVar2.a() - 1; iA >= 0; iA--) {
                arrayDeque.push(hpVar2.a(iA));
            }
        }
        return null;
    }

    public static void a(Spannable spannable, int i, int i2, kp kpVar, hp hpVar, Map map, int i3) {
        hp hpVarB;
        kp kpVarA;
        int i4;
        if (kpVar.k() != -1) {
            spannable.setSpan(new StyleSpan(kpVar.k()), i, i2, 33);
        }
        if (kpVar.q()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (kpVar.r()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (kpVar.p()) {
            mk.a(spannable, new ForegroundColorSpan(kpVar.b()), i, i2, 33);
        }
        if (kpVar.o()) {
            mk.a(spannable, new BackgroundColorSpan(kpVar.a()), i, i2, 33);
        }
        if (kpVar.c() != null) {
            mk.a(spannable, new TypefaceSpan(kpVar.c()), i, i2, 33);
        }
        if (kpVar.n() != null) {
            yn ynVar = (yn) a1.a(kpVar.n());
            int i5 = ynVar.f1213a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = ynVar.b;
            }
            int i6 = ynVar.c;
            if (i6 == -2) {
                i6 = 1;
            }
            mk.a(spannable, new zn(i5, i4, i6), i, i2, 33);
        }
        int i7 = kpVar.i();
        if (i7 == 2) {
            hp hpVarA = a(hpVar, map);
            if (hpVarA != null && (hpVarB = b(hpVarA, map)) != null) {
                if (hpVarB.a() == 1 && hpVarB.a(0).b != null) {
                    String str = (String) yp.a((Object) hpVarB.a(0).b);
                    kp kpVarA2 = a(hpVarB.f, hpVarB.c(), map);
                    int iH = kpVarA2 != null ? kpVarA2.h() : -1;
                    if (iH == -1 && (kpVarA = a(hpVarA.f, hpVarA.c(), map)) != null) {
                        iH = kpVarA.h();
                    }
                    spannable.setSpan(new ui(str, iH), i, i2, 33);
                } else {
                    kc.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (i7 == 3 || i7 == 4) {
            spannable.setSpan(new m6(), i, i2, 33);
        }
        if (kpVar.m()) {
            mk.a(spannable, new la(), i, i2, 33);
        }
        int iE = kpVar.e();
        if (iE == 1) {
            mk.a(spannable, new AbsoluteSizeSpan((int) kpVar.d(), true), i, i2, 33);
        } else if (iE == 2) {
            mk.a(spannable, new RelativeSizeSpan(kpVar.d()), i, i2, 33);
        } else {
            if (iE != 3) {
                return;
            }
            mk.a(spannable, new RelativeSizeSpan(kpVar.d() / 100.0f), i, i2, 33);
        }
    }

    static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static hp a(hp hpVar, Map map) {
        while (hpVar != null) {
            kp kpVarA = a(hpVar.f, hpVar.c(), map);
            if (kpVarA != null && kpVarA.i() == 1) {
                return hpVar;
            }
            hpVar = hpVar.j;
        }
        return null;
    }

    public static kp a(kp kpVar, String[] strArr, Map map) {
        int i = 0;
        if (kpVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (kp) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                kp kpVar2 = new kp();
                int length = strArr.length;
                while (i < length) {
                    kpVar2.a((kp) map.get(strArr[i]));
                    i++;
                }
                return kpVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return kpVar.a((kp) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    kpVar.a((kp) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return kpVar;
    }
}
