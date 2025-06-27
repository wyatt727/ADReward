package com.applovin.impl;

import android.text.Layout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class gp extends bk {
    private static final Pattern p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern v = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b w = new b(30.0f, 1, 1);
    private static final a x = new a(32, 15);
    private final XmlPullParserFactory o;

    private static float c(String str) {
        Matcher matcher = s.matcher(str);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) a1.a((Object) matcher.group(1)))));
        } catch (NumberFormatException e) {
            kc.c("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    public gp() throws XmlPullParserException {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static String[] d(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : yp.a(strTrim, "\\s+");
    }

    private static kp a(kp kpVar) {
        return kpVar == null ? new kp() : kpVar;
    }

    private static Layout.Alignment b(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    @Override // com.applovin.impl.bk
    protected kl a(byte[] bArr, int i, boolean z) throws XmlPullParserException, ml, NumberFormatException, IOException {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new ip(""));
            c cVarB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarA = w;
            a aVarA = x;
            int i2 = 0;
            lp lpVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                hp hpVar = (hp) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarA = a(xmlPullParserNewPullParser);
                            aVarA = a(xmlPullParserNewPullParser, x);
                            cVarB = b(xmlPullParserNewPullParser);
                        }
                        c cVar = cVarB;
                        b bVar2 = bVarA;
                        a aVar = aVarA;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                a(xmlPullParserNewPullParser, map, aVar, cVar, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    hp hpVarA = a(xmlPullParserNewPullParser, hpVar, map2, bVar);
                                    arrayDeque.push(hpVarA);
                                    if (hpVar != null) {
                                        hpVar.a(hpVarA);
                                    }
                                } catch (ml e) {
                                    kc.c("TtmlDecoder", "Suppressing parser error", e);
                                }
                            }
                            bVarA = bVar;
                            cVarB = cVar;
                            aVarA = aVar;
                        } else {
                            kc.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            bVar = bVar2;
                        }
                        bVarA = bVar;
                        cVarB = cVar;
                        aVarA = aVar;
                        i2++;
                    } else if (eventType == 4) {
                        ((hp) a1.a(hpVar)).a(hp.a(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            lpVar = new lp((hp) a1.a((hp) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (lpVar != null) {
                return lpVar;
            }
            throw new ml("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new ml("Unable to decode source", e3);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f469a;
        final int b;
        final int c;

        b(float f, int i, int i2) {
            this.f469a = f;
            this.b = i;
            this.c = i2;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int f468a;
        final int b;

        a(int i, int i2) {
            this.f468a = i;
            this.b = i2;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f470a;
        final int b;

        c(int i, int i2) {
            this.f470a = i;
            this.b = i2;
        }
    }

    private static c b(XmlPullParser xmlPullParser) {
        String strA = hs.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = u.matcher(strA);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new c(Integer.parseInt((String) a1.a((Object) matcher.group(1))), Integer.parseInt((String) a1.a((Object) matcher.group(2))));
        } catch (NumberFormatException unused) {
            kc.d("TtmlDecoder", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    private static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) throws ml, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = v.matcher(attributeValue);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int i = Integer.parseInt((String) a1.a((Object) matcher.group(1)));
            int i2 = Integer.parseInt((String) a1.a((Object) matcher.group(2)));
            if (i != 0 && i2 != 0) {
                return new a(i, i2);
            }
            throw new ml("Invalid cell resolution " + i + " " + i2);
        } catch (NumberFormatException unused) {
            kc.d("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void a(String str, kp kpVar) throws ml {
        Matcher matcher;
        String str2;
        String[] strArrA = yp.a(str, "\\s+");
        if (strArrA.length == 1) {
            matcher = r.matcher(str);
        } else if (strArrA.length == 2) {
            matcher = r.matcher(strArrA[1]);
            kc.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new ml("Invalid number of entries for fontSize: " + strArrA.length + ".");
        }
        if (matcher.matches()) {
            str2 = (String) a1.a((Object) matcher.group(3));
            str2.hashCode();
            str2.hashCode();
            switch (str2) {
                case "%":
                    kpVar.c(3);
                    break;
                case "em":
                    kpVar.c(2);
                    break;
                case "px":
                    kpVar.c(1);
                    break;
                default:
                    throw new ml("Invalid unit for fontSize: '" + str2 + "'.");
            }
            kpVar.a(Float.parseFloat((String) a1.a((Object) matcher.group(1))));
            return;
        }
        throw new ml("Invalid expression for fontSize: '" + str + "'.");
    }

    private static b a(XmlPullParser xmlPullParser) throws ml, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (yp.a(attributeValue2, " ").length == 2) {
                f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new ml("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = w;
        int i2 = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new b(i * f, i2, i3);
    }

    private static Map a(XmlPullParser xmlPullParser, Map map, a aVar, c cVar, Map map2, Map map3) throws XmlPullParserException, IOException, NumberFormatException {
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, "style")) {
                String strA = hs.a(xmlPullParser, "style");
                kp kpVarA = a(xmlPullParser, new kp());
                if (strA != null) {
                    for (String str : d(strA)) {
                        kpVarA.a((kp) map.get(str));
                    }
                }
                String strF = kpVarA.f();
                if (strF != null) {
                    map.put(strF, kpVarA);
                }
            } else if (hs.c(xmlPullParser, "region")) {
                ip ipVarA = a(xmlPullParser, aVar, cVar);
                if (ipVarA != null) {
                    map2.put(ipVarA.f542a, ipVarA);
                }
            } else if (hs.c(xmlPullParser, "metadata")) {
                a(xmlPullParser, map3);
            }
        } while (!hs.b(xmlPullParser, "head"));
        return map;
    }

    private static void a(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, "image") && (strA = hs.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!hs.b(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.hp a(org.xmlpull.v1.XmlPullParser r19, com.applovin.impl.hp r20, java.util.Map r21, com.applovin.impl.gp.b r22) throws com.applovin.impl.ml, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.hp, java.util.Map, com.applovin.impl.gp$b):com.applovin.impl.hp");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.ip a(org.xmlpull.v1.XmlPullParser r17, com.applovin.impl.gp.a r18, com.applovin.impl.gp.c r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.gp$a, com.applovin.impl.gp$c):com.applovin.impl.ip");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.kp a(org.xmlpull.v1.XmlPullParser r12, com.applovin.impl.kp r13) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.kp):com.applovin.impl.kp");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(java.lang.String r13, com.applovin.impl.gp.b r14) throws com.applovin.impl.ml, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(java.lang.String, com.applovin.impl.gp$b):long");
    }
}
