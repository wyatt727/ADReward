package com.applovin.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class wk {

    /* renamed from: a, reason: collision with root package name */
    public final String f1133a;
    public final int b;
    public final Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    private static boolean a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private wk(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1133a = str;
        this.b = i;
        this.c = num;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str.trim());
            if (a(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        kc.d("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static wk a(String str, a aVar) {
        a1.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = aVar.i;
        if (length != i) {
            kc.d("SsaStyle", yp.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f1134a].trim();
            int i2 = aVar.b;
            int iB = i2 != -1 ? b(strArrSplit[i2].trim()) : -1;
            int i3 = aVar.c;
            Integer numD = i3 != -1 ? d(strArrSplit[i3].trim()) : null;
            int i4 = aVar.d;
            float fE = i4 != -1 ? e(strArrSplit[i4].trim()) : -3.4028235E38f;
            int i5 = aVar.e;
            boolean z = i5 != -1 && c(strArrSplit[i5].trim());
            int i6 = aVar.f;
            boolean z2 = i6 != -1 && c(strArrSplit[i6].trim());
            int i7 = aVar.g;
            boolean z3 = i7 != -1 && c(strArrSplit[i7].trim());
            int i8 = aVar.h;
            return new wk(strTrim, iB, numD, fE, z, z2, z3, i8 != -1 && c(strArrSplit[i8].trim()));
        } catch (RuntimeException e) {
            kc.c("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    public static Integer d(String str) throws NumberFormatException {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            a1.a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(pb.a(((j >> 24) & 255) ^ 255), pb.a(j & 255), pb.a((j >> 8) & 255), pb.a((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            kc.c("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float e(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            kc.c("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    private static boolean c(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            kc.c("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1134a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        private a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f1134a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.applovin.impl.wk.a a(java.lang.String r14) {
            /*
                r0 = 7
                java.lang.String r14 = r14.substring(r0)
                java.lang.String r1 = ","
                java.lang.String[] r14 = android.text.TextUtils.split(r14, r1)
                r1 = 0
                r2 = -1
                r3 = r1
                r5 = r2
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
            L16:
                int r4 = r14.length
                if (r3 >= r4) goto La1
                r4 = r14[r3]
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(r4)
                r4.hashCode()
                r4.hashCode()
                int r13 = r4.hashCode()
                switch(r13) {
                    case -1178781136: goto L80;
                    case -1026963764: goto L75;
                    case -192095652: goto L6a;
                    case -70925746: goto L5f;
                    case 3029637: goto L54;
                    case 3373707: goto L49;
                    case 366554320: goto L3e;
                    case 1767875043: goto L33;
                    default: goto L30;
                }
            L30:
                r4 = r2
                goto L8a
            L33:
                java.lang.String r13 = "alignment"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L3c
                goto L30
            L3c:
                r4 = r0
                goto L8a
            L3e:
                java.lang.String r13 = "fontsize"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L47
                goto L30
            L47:
                r4 = 6
                goto L8a
            L49:
                java.lang.String r13 = "name"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L52
                goto L30
            L52:
                r4 = 5
                goto L8a
            L54:
                java.lang.String r13 = "bold"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L5d
                goto L30
            L5d:
                r4 = 4
                goto L8a
            L5f:
                java.lang.String r13 = "primarycolour"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L68
                goto L30
            L68:
                r4 = 3
                goto L8a
            L6a:
                java.lang.String r13 = "strikeout"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L73
                goto L30
            L73:
                r4 = 2
                goto L8a
            L75:
                java.lang.String r13 = "underline"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L7e
                goto L30
            L7e:
                r4 = 1
                goto L8a
            L80:
                java.lang.String r13 = "italic"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L89
                goto L30
            L89:
                r4 = r1
            L8a:
                switch(r4) {
                    case 0: goto L9c;
                    case 1: goto L9a;
                    case 2: goto L98;
                    case 3: goto L96;
                    case 4: goto L94;
                    case 5: goto L92;
                    case 6: goto L90;
                    case 7: goto L8e;
                    default: goto L8d;
                }
            L8d:
                goto L9d
            L8e:
                r6 = r3
                goto L9d
            L90:
                r8 = r3
                goto L9d
            L92:
                r5 = r3
                goto L9d
            L94:
                r9 = r3
                goto L9d
            L96:
                r7 = r3
                goto L9d
            L98:
                r12 = r3
                goto L9d
            L9a:
                r11 = r3
                goto L9d
            L9c:
                r10 = r3
            L9d:
                int r3 = r3 + 1
                goto L16
            La1:
                if (r5 == r2) goto Lab
                com.applovin.impl.wk$a r0 = new com.applovin.impl.wk$a
                int r13 = r14.length
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto Lac
            Lab:
                r0 = 0
            Lac:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.wk.a.a(java.lang.String):com.applovin.impl.wk$a");
        }
    }

    static final class b {
        private static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern d = Pattern.compile(yp.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern e = Pattern.compile(yp.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f1135a;
        public final PointF b;

        private static int a(String str) {
            Matcher matcher = f.matcher(str);
            if (matcher.find()) {
                return wk.b((String) a1.a((Object) matcher.group(1)));
            }
            return -1;
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = d.matcher(str);
            Matcher matcher2 = e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    kc.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) a1.a((Object) strGroup)).trim()), Float.parseFloat(((String) a1.a((Object) strGroup2)).trim()));
        }

        public static String d(String str) {
            return c.matcher(str).replaceAll("");
        }

        private b(int i, PointF pointF) {
            this.f1135a = i;
            this.b = pointF;
        }

        public static b b(String str) {
            Matcher matcher = c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) a1.a((Object) matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i, pointF);
        }
    }
}
