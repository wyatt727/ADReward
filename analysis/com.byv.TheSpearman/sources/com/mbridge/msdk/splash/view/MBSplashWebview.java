package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes4.dex */
public class MBSplashWebview extends WindVaneWebView {
    private static final String e = "MBSplashWebview";
    private String f;
    private AdSession g;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public String getRequestId() {
        return this.f;
    }

    public void setRequestId(String str) {
        this.f = str;
    }

    public AdSession getAdSession() {
        return this.g;
    }

    public void setAdSession(AdSession adSession) {
        this.g = adSession;
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.g;
            if (adSession != null) {
                adSession.finish();
                this.g = null;
                ad.a("OMSDK", "finish adSession");
            }
        } catch (Exception e2) {
            ad.a("OMSDK", e2.getMessage());
        }
    }
}
