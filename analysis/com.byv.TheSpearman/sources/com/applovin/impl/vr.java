package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class vr {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final yg f1106a = new yg();
    private final StringBuilder b = new StringBuilder();

    public List c(yg ygVar) {
        this.b.setLength(0);
        int iD = ygVar.d();
        e(ygVar);
        this.f1106a.a(ygVar.c(), ygVar.d());
        this.f1106a.f(iD);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strD = d(this.f1106a, this.b);
            if (strD == null || !"{".equals(b(this.f1106a, this.b))) {
                return arrayList;
            }
            wr wrVar = new wr();
            a(wrVar, strD);
            String str = null;
            boolean z = false;
            while (!z) {
                int iD2 = this.f1106a.d();
                String strB = b(this.f1106a, this.b);
                boolean z2 = strB == null || "}".equals(strB);
                if (!z2) {
                    this.f1106a.f(iD2);
                    a(this.f1106a, wrVar, this.b);
                }
                str = strB;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(wrVar);
            }
        }
    }

    private static String c(yg ygVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iD = ygVar.d();
            String strB = b(ygVar, sb);
            if (strB == null) {
                return null;
            }
            if (!"}".equals(strB) && !";".equals(strB)) {
                sb2.append(strB);
            } else {
                ygVar.f(iD);
                z = true;
            }
        }
        return sb2.toString();
    }

    private static String d(yg ygVar, StringBuilder sb) {
        f(ygVar);
        if (ygVar.a() < 5 || !"::cue".equals(ygVar.c(5))) {
            return null;
        }
        int iD = ygVar.d();
        String strB = b(ygVar, sb);
        if (strB == null) {
            return null;
        }
        if ("{".equals(strB)) {
            ygVar.f(iD);
            return "";
        }
        String strD = "(".equals(strB) ? d(ygVar) : null;
        if (")".equals(b(ygVar, sb))) {
            return strD;
        }
        return null;
    }

    static void f(yg ygVar) {
        while (true) {
            for (boolean z = true; ygVar.a() > 0 && z; z = false) {
                if (b(ygVar) || a(ygVar)) {
                    break;
                }
            }
            return;
        }
    }

    private static boolean b(yg ygVar) {
        char cA = a(ygVar, ygVar.d());
        if (cA != '\t' && cA != '\n' && cA != '\f' && cA != '\r' && cA != ' ') {
            return false;
        }
        ygVar.g(1);
        return true;
    }

    static void e(yg ygVar) {
        while (!TextUtils.isEmpty(ygVar.l())) {
        }
    }

    private static boolean a(yg ygVar) {
        int iD = ygVar.d();
        int iE = ygVar.e();
        byte[] bArrC = ygVar.c();
        int i = iD + 2;
        if (i > iE) {
            return false;
        }
        int i2 = iD + 1;
        if (bArrC[iD] != 47 || bArrC[i2] != 42) {
            return false;
        }
        while (true) {
            int i3 = i + 1;
            if (i3 < iE) {
                if (((char) bArrC[i]) == '*' && ((char) bArrC[i3]) == '/') {
                    i += 2;
                    iE = i;
                } else {
                    i = i3;
                }
            } else {
                ygVar.g(iE - ygVar.d());
                return true;
            }
        }
    }

    private static String d(yg ygVar) {
        int iD = ygVar.d();
        int iE = ygVar.e();
        boolean z = false;
        while (iD < iE && !z) {
            int i = iD + 1;
            z = ((char) ygVar.c()[iD]) == ')';
            iD = i;
        }
        return ygVar.c((iD - 1) - ygVar.d()).trim();
    }

    static String b(yg ygVar, StringBuilder sb) {
        f(ygVar);
        if (ygVar.a() == 0) {
            return null;
        }
        String strA = a(ygVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) ygVar.w());
    }

    private static String a(yg ygVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iD = ygVar.d();
        int iE = ygVar.e();
        while (iD < iE && !z) {
            char c2 = (char) ygVar.c()[iD];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                iD++;
                sb.append(c2);
            }
        }
        ygVar.g(iD - ygVar.d());
        return sb.toString();
    }

    private static void a(yg ygVar, wr wrVar, StringBuilder sb) {
        f(ygVar);
        String strA = a(ygVar, sb);
        if (!"".equals(strA) && ":".equals(b(ygVar, sb))) {
            f(ygVar);
            String strC = c(ygVar, sb);
            if (strC == null || "".equals(strC)) {
                return;
            }
            int iD = ygVar.d();
            String strB = b(ygVar, sb);
            if (!";".equals(strB)) {
                if (!"}".equals(strB)) {
                    return;
                } else {
                    ygVar.f(iD);
                }
            }
            if ("color".equals(strA)) {
                wrVar.b(q3.a(strC));
                return;
            }
            if ("background-color".equals(strA)) {
                wrVar.a(q3.a(strC));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strA)) {
                if ("over".equals(strC)) {
                    wrVar.d(1);
                    return;
                } else {
                    if ("under".equals(strC)) {
                        wrVar.d(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strA)) {
                if (!TtmlNode.COMBINE_ALL.equals(strC) && !strC.startsWith("digits")) {
                    z = false;
                }
                wrVar.b(z);
                return;
            }
            if ("text-decoration".equals(strA)) {
                if ("underline".equals(strC)) {
                    wrVar.d(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strA)) {
                wrVar.a(strC);
                return;
            }
            if ("font-weight".equals(strA)) {
                if ("bold".equals(strC)) {
                    wrVar.a(true);
                }
            } else if ("font-style".equals(strA)) {
                if ("italic".equals(strC)) {
                    wrVar.c(true);
                }
            } else if ("font-size".equals(strA)) {
                a(strC, wrVar);
            }
        }
    }

    private static char a(yg ygVar, int i) {
        return (char) ygVar.c()[i];
    }

    private static void a(String str, wr wrVar) {
        Matcher matcher = d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            kc.d("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) a1.a((Object) matcher.group(2));
        str2.hashCode();
        str2.hashCode();
        switch (str2) {
            case "%":
                wrVar.c(3);
                break;
            case "em":
                wrVar.c(2);
                break;
            case "px":
                wrVar.c(1);
                break;
            default:
                throw new IllegalStateException();
        }
        wrVar.a(Float.parseFloat((String) a1.a((Object) matcher.group(1))));
    }

    private void a(wr wrVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                wrVar.d((String) a1.a((Object) matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrA = yp.a(str, "\\.");
        String str2 = strArrA[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            wrVar.c(str2.substring(0, iIndexOf2));
            wrVar.b(str2.substring(iIndexOf2 + 1));
        } else {
            wrVar.c(str2);
        }
        if (strArrA.length > 1) {
            wrVar.a((String[]) yp.a(strArrA, 1, strArrA.length));
        }
    }
}
