package com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: InLineParser.java */
/* loaded from: classes2.dex */
public class mZx {
    public static com.bytedance.sdk.openadsdk.core.VwS.EYQ EYQ(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list, int i, double d) throws XmlPullParserException, IOException {
        String name;
        xmlPullParser.require(2, Kbd.VwS, "InLine");
        com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq = new com.bytedance.sdk.openadsdk.core.VwS.EYQ();
        while (true) {
            if (xmlPullParser.next() != 3 || !"InLine".equals(xmlPullParser.getName())) {
                if (xmlPullParser.getEventType() == 2) {
                    name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "AdVerifications":
                            eyq.EYQ(Pm.EYQ(xmlPullParser));
                            continue;
                        case "Creatives":
                            if (!TextUtils.isEmpty(eyq.VwS()) && eyq.Td() != null) {
                                break;
                            } else {
                                while (xmlPullParser.next() != 3) {
                                    if (xmlPullParser.getEventType() == 2) {
                                        if ("Creative".equals(xmlPullParser.getName())) {
                                            EYQ(context, xmlPullParser, eyq, i, d);
                                        } else {
                                            Kbd.EYQ(xmlPullParser);
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        case "Description":
                            eyq.mZx(Kbd.mZx(xmlPullParser, name));
                            continue;
                        case "Error":
                            list.addAll(Kbd.EYQ(xmlPullParser, name));
                            continue;
                        case "Extensions":
                            while (true) {
                                if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                    continue;
                                } else {
                                    xmlPullParser.next();
                                    if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                        eyq.EYQ(Pm.EYQ(xmlPullParser));
                                    }
                                }
                            }
                            break;
                        case "AdTitle":
                            eyq.EYQ(Kbd.mZx(xmlPullParser, name));
                            continue;
                        case "Impression":
                            eyq.EYQ().EYQ(Kbd.EYQ(xmlPullParser, name));
                            continue;
                    }
                    Kbd.EYQ(xmlPullParser);
                }
            } else {
                eyq.EYQ().tp(list);
                return eyq;
            }
        }
    }

    public static void EYQ(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq, int i, double d) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(eyq.VwS())) {
                    Td.EYQ(xmlPullParser, eyq, i, d);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && eyq.Td() == null) {
                    eyq.EYQ(EYQ.EYQ(context, xmlPullParser));
                } else {
                    Kbd.EYQ(xmlPullParser);
                }
            }
        }
    }
}
