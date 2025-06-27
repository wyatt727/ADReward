package com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.VwS.EYQ.mZx;
import com.bytedance.sdk.openadsdk.core.VwS.Td.EYQ;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.Td;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VastXmlPullParser.java */
/* loaded from: classes2.dex */
public class Kbd extends com.bytedance.sdk.openadsdk.core.VwS.EYQ.mZx {
    public static final String VwS = null;

    public Kbd(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.VwS.EYQ.mZx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.openadsdk.core.VwS.EYQ EYQ(java.lang.String r6, java.util.List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r5.Kbd = r1
            android.content.Context r2 = r5.mZx
            r3 = 0
            if (r2 != 0) goto Le
            r6 = -1
            r5.Kbd = r6
            return r3
        Le:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L18
            r6 = -2
            r5.Kbd = r6
            return r3
        L18:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            java.lang.String r4 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r6.setFeature(r4, r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r6.setInput(r2, r0)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r6.nextTag()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            com.bytedance.sdk.openadsdk.core.VwS.EYQ r6 = r5.EYQ(r6, r7)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r5.EYQ(r6)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r2.close()     // Catch: java.io.IOException -> L3a
        L3a:
            return r6
        L3b:
            r6 = move-exception
            goto L4c
        L3d:
            r2 = r3
        L3e:
            r6 = -3
            r5.Kbd = r6     // Catch: java.lang.Throwable -> L4a
            r5.EYQ(r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.io.IOException -> L49
        L49:
            return r3
        L4a:
            r6 = move-exception
            r3 = r2
        L4c:
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Kbd.EYQ(java.lang.String, java.util.List):com.bytedance.sdk.openadsdk.core.VwS.EYQ");
    }

    private void EYQ(com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq) {
        if (this.IPb == null) {
            this.IPb = new mZx.EYQ();
        }
        this.IPb.EYQ = this.Kbd;
        this.IPb.mZx = this.EYQ;
        if (eyq != null) {
            this.IPb.Td = eyq.EYQ().mZx.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.VwS.EYQ EYQ(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) throws Throwable {
        xmlPullParser.require(2, VwS, "VAST");
        boolean z = false;
        String strMZx = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strMZx = mZx(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (EYQ(xmlPullParser.getAttributeValue(VwS, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.VwS.EYQ EYQ2 = mZx.EYQ(this.mZx, xmlPullParser, list, this.Td, this.Pm);
                                    if (EYQ2 != null) {
                                        if (!TextUtils.isEmpty(EYQ2.VwS())) {
                                            return EYQ2;
                                        }
                                        this.Kbd = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqMZx = mZx(xmlPullParser, list);
                                    if (eyqMZx != null) {
                                        return eyqMZx;
                                    }
                                } else {
                                    EYQ(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        EYQ(xmlPullParser);
                    }
                    z = true;
                } else {
                    EYQ(xmlPullParser);
                }
            }
        }
        if (!z) {
            this.Kbd = -4;
            Td(strMZx);
        }
        if (this.Kbd == 0) {
            this.Kbd = -5;
        }
        return null;
    }

    private void Td(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(Collections.singletonList(new Td.EYQ(str).EYQ()), this.EYQ > 0 ? com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.UNDEFINED_ERROR, -1L, null), (Td.mZx) null);
    }

    /* compiled from: VastXmlPullParser.java */
    static class EYQ {
        String EYQ;
        String Pm;
        EYQ.mZx Td;
        EYQ.EnumC0111EYQ mZx;
        final List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> Kbd = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> IPb = new ArrayList();
        float VwS = Float.MIN_VALUE;

        public EYQ() {
        }

        public EYQ(String str, EYQ.EnumC0111EYQ enumC0111EYQ, EYQ.mZx mzx) {
            EYQ(str, enumC0111EYQ, mzx);
        }

        public void EYQ(String str, EYQ.EnumC0111EYQ enumC0111EYQ, EYQ.mZx mzx) {
            this.EYQ = str;
            this.mZx = enumC0111EYQ;
            this.Td = mzx;
        }

        public void EYQ(String str) {
            this.Kbd.add(new Td.EYQ(str).EYQ());
        }

        public void mZx(String str) {
            this.IPb.add(new Td.EYQ(str).EYQ());
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> EYQ(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return Pm(mZx(xmlPullParser, str));
    }

    public static int mZx(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static String mZx(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = VwS;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    public static void EYQ(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void EYQ(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.openadsdk.core.VwS.EYQ mZx(org.xmlpull.v1.XmlPullParser r17, java.util.List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Kbd.mZx(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.VwS.EYQ");
    }

    private static List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> EYQ(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new Td.EYQ(str).EYQ(z).EYQ());
    }

    private static List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> Pm(String str) {
        return EYQ(str, false);
    }
}
