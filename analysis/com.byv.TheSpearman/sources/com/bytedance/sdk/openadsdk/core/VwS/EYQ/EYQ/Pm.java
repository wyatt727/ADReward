package com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.VwS.tp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VastAdVerificationsParser.java */
/* loaded from: classes2.dex */
public class Pm {
    public static Set<tp> EYQ(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        tp tpVarEYQ;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(Kbd.VwS, "vendor");
                    String strMZx = null;
                    String strMZx2 = null;
                    String strMZx3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(Kbd.VwS, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strMZx3 = Kbd.mZx(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(Kbd.VwS, "apiFramework"))) {
                                            break;
                                        } else {
                                            strMZx = Kbd.mZx(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        strMZx2 = Kbd.mZx(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strMZx) && (tpVarEYQ = tp.EYQ(CampaignEx.KEY_OMID, strMZx, attributeValue, strMZx2, strMZx3)) != null) {
                            hashSet.add(tpVarEYQ);
                        }
                    }
                } else {
                    Kbd.EYQ(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
