package com.applovin.impl;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class gl extends bk {
    private static final Pattern q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern r = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder o;
    private final ArrayList p;

    public gl() {
        super("SubripDecoder");
        this.o = new StringBuilder();
        this.p = new ArrayList();
    }

    private static long a(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) a1.a((Object) matcher.group(i + 2))) * 60000) + (Long.parseLong((String) a1.a((Object) matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    static float b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private String a(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = r.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // com.applovin.impl.bk
    protected kl a(byte[] bArr, int i, boolean z) throws NumberFormatException {
        ArrayList arrayList = new ArrayList();
        mc mcVar = new mc();
        yg ygVar = new yg(bArr, i);
        while (true) {
            String strL = ygVar.l();
            int i2 = 0;
            if (strL == null) {
                break;
            }
            if (strL.length() != 0) {
                try {
                    Integer.parseInt(strL);
                    String strL2 = ygVar.l();
                    if (strL2 == null) {
                        kc.d("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = q.matcher(strL2);
                    if (matcher.matches()) {
                        mcVar.a(a(matcher, 1));
                        mcVar.a(a(matcher, 6));
                        this.o.setLength(0);
                        this.p.clear();
                        for (String strL3 = ygVar.l(); !TextUtils.isEmpty(strL3); strL3 = ygVar.l()) {
                            if (this.o.length() > 0) {
                                this.o.append("<br>");
                            }
                            this.o.append(a(strL3, this.p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.o.toString());
                        String str = null;
                        while (true) {
                            if (i2 >= this.p.size()) {
                                break;
                            }
                            String str2 = (String) this.p.get(i2);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(a(spannedFromHtml, str));
                        arrayList.add(z4.s);
                    } else {
                        kc.d("SubripDecoder", "Skipping invalid timing: " + strL2);
                    }
                } catch (NumberFormatException unused) {
                    kc.d("SubripDecoder", "Skipping invalid index: " + strL);
                }
            }
        }
        return new hl((z4[]) arrayList.toArray(new z4[0]), mcVar.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.applovin.impl.z4 a(android.text.Spanned r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gl.a(android.text.Spanned, java.lang.String):com.applovin.impl.z4");
    }
}
