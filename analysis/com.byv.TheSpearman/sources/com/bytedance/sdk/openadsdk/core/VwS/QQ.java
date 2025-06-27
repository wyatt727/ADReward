package com.bytedance.sdk.openadsdk.core.VwS;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.pi;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: ViewabilityTrackerFactory.java */
/* loaded from: classes2.dex */
public class QQ {
    public static VwS EYQ(View view, Set<tp> set) {
        AdSession adSessionEYQ = EYQ(CreativeType.VIDEO, set, Owner.NATIVE);
        return new HX(adSessionEYQ, AdEvents.createAdEvents(adSessionEYQ), view, MediaEvents.createMediaEvents(adSessionEYQ));
    }

    public static VwS EYQ(WebView webView) {
        Partner partnerEYQ = Kbd.EYQ();
        if (partnerEYQ == null) {
            throw new IllegalArgumentException("Parameter 'partner' may not be null.");
        }
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerEYQ, webView, "", ""));
        return new VwS(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
    }

    private static AdSession EYQ(CreativeType creativeType, Set<tp> set, Owner owner) {
        List<VerificationScriptResource> listEYQ = EYQ(set);
        if (listEYQ.isEmpty()) {
            pi.mZx("verificationScriptResources is empty");
        }
        Partner partnerEYQ = Kbd.EYQ();
        if (partnerEYQ == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerEYQ, Kbd.mZx(), listEYQ, "", ""));
    }

    private static List<VerificationScriptResource> EYQ(Set<tp> set) {
        ArrayList arrayList = new ArrayList();
        for (tp tpVar : set) {
            try {
                if (TextUtils.isEmpty(tpVar.EYQ()) || TextUtils.isEmpty(tpVar.mZx())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(tpVar.Td()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(tpVar.EYQ(), tpVar.Td(), tpVar.mZx()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
