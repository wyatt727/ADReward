package com.applovin.impl;

import com.applovin.impl.ab;
import com.applovin.impl.hf;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
abstract class is {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f547a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static hf b(String str) throws XmlPullParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!hs.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ah.a("Couldn't find xmp metadata", null);
        }
        long jC = -9223372036854775807L;
        ab abVarH = ab.h();
        do {
            xmlPullParserNewPullParser.next();
            if (hs.c(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!b(xmlPullParserNewPullParser)) {
                    return null;
                }
                jC = c(xmlPullParserNewPullParser);
                abVarH = a(xmlPullParserNewPullParser);
            } else if (hs.c(xmlPullParserNewPullParser, "Container:Directory")) {
                abVarH = a(xmlPullParserNewPullParser, "Container", "Item");
            } else if (hs.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abVarH = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!hs.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abVarH.isEmpty()) {
            return null;
        }
        return new hf(jC, abVarH);
    }

    private static long c(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : b) {
            String strA = hs.a(xmlPullParser, str);
            if (strA != null) {
                long j = Long.parseLong(strA);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    private static boolean b(XmlPullParser xmlPullParser) {
        for (String str : f547a) {
            String strA = hs.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    public static hf a(String str) {
        try {
            return b(str);
        } catch (ah | NumberFormatException | XmlPullParserException unused) {
            kc.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static ab a(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : c) {
            String strA = hs.a(xmlPullParser, str);
            if (strA != null) {
                return ab.a(new hf.a(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new hf.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return ab.h();
    }

    private static ab a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ab.a aVarF = ab.f();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, str3)) {
                String strA = hs.a(xmlPullParser, str2 + ":Mime");
                String strA2 = hs.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = hs.a(xmlPullParser, str2 + ":Length");
                String strA4 = hs.a(xmlPullParser, str2 + ":Padding");
                if (strA != null && strA2 != null) {
                    aVarF.b(new hf.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
                } else {
                    return ab.h();
                }
            }
        } while (!hs.b(xmlPullParser, str4));
        return aVarF.a();
    }
}
