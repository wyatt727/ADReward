package com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: LinearParser.java */
/* loaded from: classes2.dex */
public class Td {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void EYQ(org.xmlpull.v1.XmlPullParser r8, com.bytedance.sdk.openadsdk.core.VwS.EYQ r9, int r10, double r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 1
            r1 = 0
            r2 = r1
        L3:
            int r3 = r8.next()
            r4 = 3
            if (r3 != r4) goto L18
            java.lang.String r3 = r8.getName()
            java.lang.String r5 = "Linear"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L17
            goto L18
        L17:
            return
        L18:
            int r3 = r8.getEventType()
            r5 = 2
            if (r3 != r5) goto L3
            if (r2 == 0) goto L2e
            java.lang.String r3 = r9.VwS()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L2e
            com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Kbd.EYQ(r8)
        L2e:
            java.lang.String r3 = r8.getName()
            r3.hashCode()
            r6 = -1
            int r7 = r3.hashCode()
            switch(r7) {
                case -2049897434: goto L69;
                case -1927368268: goto L5e;
                case -385055469: goto L53;
                case 70476538: goto L4a;
                case 611554000: goto L3f;
                default: goto L3d;
            }
        L3d:
            r4 = r6
            goto L73
        L3f:
            java.lang.String r4 = "TrackingEvents"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L48
            goto L3d
        L48:
            r4 = 4
            goto L73
        L4a:
            java.lang.String r5 = "Icons"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L73
            goto L3d
        L53:
            java.lang.String r4 = "MediaFiles"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L5c
            goto L3d
        L5c:
            r4 = r5
            goto L73
        L5e:
            java.lang.String r4 = "Duration"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L67
            goto L3d
        L67:
            r4 = r0
            goto L73
        L69:
            java.lang.String r4 = "VideoClicks"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L72
            goto L3d
        L72:
            r4 = r1
        L73:
            switch(r4) {
                case 0: goto La2;
                case 1: goto L99;
                case 2: goto L93;
                case 3: goto L82;
                case 4: goto L7a;
                default: goto L76;
            }
        L76:
            com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Kbd.EYQ(r8)
            goto L3
        L7a:
            com.bytedance.sdk.openadsdk.core.VwS.Pm r3 = r9.EYQ()
            EYQ(r8, r3)
            goto L3
        L82:
            com.bytedance.sdk.openadsdk.core.VwS.mZx r3 = EYQ(r8)
            if (r3 == 0) goto L3
            com.bytedance.sdk.openadsdk.core.VwS.mZx r4 = r9.mZx()
            if (r4 != 0) goto L3
            r9.EYQ(r3)
            goto L3
        L93:
            EYQ(r8, r10, r11, r9)
            r2 = r0
            goto L3
        L99:
            double r3 = mZx(r8)
            r9.EYQ(r3)
            goto L3
        La2:
            EYQ(r8, r9)
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Td.EYQ(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.VwS.EYQ, int, double):void");
    }

    private static String EYQ(XmlPullParser xmlPullParser, int i, double d, com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq) throws XmlPullParserException, IOException {
        int i2 = Integer.MIN_VALUE;
        String str = null;
        double d2 = Double.NEGATIVE_INFINITY;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String attributeValue = xmlPullParser.getAttributeValue(Kbd.VwS, "type");
                int iMZx = Kbd.mZx(xmlPullParser.getAttributeValue(Kbd.VwS, "width"));
                int iMZx2 = Kbd.mZx(xmlPullParser.getAttributeValue(Kbd.VwS, "height"));
                int iMZx3 = Kbd.mZx(xmlPullParser.getAttributeValue(Kbd.VwS, "bitrate"));
                String strMZx = Kbd.mZx(xmlPullParser, "MediaFile");
                if (iMZx > 0 && iMZx2 > 0 && com.bytedance.sdk.openadsdk.core.VwS.Td.Pm.EYQ.contains(attributeValue) && !TextUtils.isEmpty(strMZx)) {
                    double dEYQ = com.bytedance.sdk.openadsdk.core.VwS.Td.Pm.EYQ(i, d, iMZx, iMZx2, iMZx3, attributeValue);
                    if (dEYQ > d2) {
                        str = strMZx;
                        i2 = iMZx;
                        d2 = dEYQ;
                        i3 = iMZx2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            eyq.Pm(str);
            eyq.EYQ(i2);
            eyq.mZx(i3);
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.openadsdk.core.VwS.mZx EYQ(org.xmlpull.v1.XmlPullParser r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Td.EYQ(org.xmlpull.v1.XmlPullParser):com.bytedance.sdk.openadsdk.core.VwS.mZx");
    }

    public static double mZx(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (Kbd.mZx(xmlPullParser, "Duration").split(":").length != 3) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        try {
            return (Integer.parseInt(r2[0].trim()) * 60 * 60) + (Integer.parseInt(r2[1].trim()) * 60) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void EYQ(org.xmlpull.v1.XmlPullParser r7, com.bytedance.sdk.openadsdk.core.VwS.Pm r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Td.EYQ(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.VwS.Pm):void");
    }

    private static void EYQ(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ClickThrough")) {
                    eyq.Td(Kbd.mZx(xmlPullParser, "ClickThrough"));
                } else if (name.equals("ClickTracking")) {
                    eyq.EYQ().VwS(Kbd.EYQ(xmlPullParser, "ClickTracking"));
                } else {
                    Kbd.EYQ(xmlPullParser);
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> Td(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return Kbd.EYQ(xmlPullParser, "Tracking");
    }
}
