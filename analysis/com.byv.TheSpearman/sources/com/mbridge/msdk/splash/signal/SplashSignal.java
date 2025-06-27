package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SplashSignal extends AbsFeedBackForH5 {

    /* renamed from: a, reason: collision with root package name */
    private static String f3523a = "SplashSignal";
    private c e;

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof c)) {
                return;
            }
            this.e = (c) windVaneWebView.getObject();
        } catch (Throwable th) {
            ad.a(f3523a, MobileAdsBridgeBase.initializeMethodName, th);
        }
    }

    public void init(Object obj, String str) {
        ad.b(f3523a, MobileAdsBridgeBase.initializeMethodName + str);
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(obj, str);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        ad.b(f3523a, "toggleCloseBtn" + str);
        c cVar = this.e;
        if (cVar != null) {
            cVar.b(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        ad.b(f3523a, "triggerCloseBtn" + str);
        c cVar = this.e;
        if (cVar != null) {
            cVar.c(obj, str);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.b != null) {
                    WindVaneWebView windVaneWebView = aVar.b;
                    if (windVaneWebView.getWebViewListener() != null) {
                        windVaneWebView.getWebViewListener().a(windVaneWebView, iOptInt);
                    }
                }
            } catch (Throwable th) {
                ad.a(f3523a, "readyStatus", th);
            }
        }
    }

    public void install(Object obj, String str) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.d(obj, str);
        }
    }

    public void resetCountdown(Object obj, String str) {
        ad.b(f3523a, "resetCountdown" + str);
        c cVar = this.e;
        if (cVar != null) {
            cVar.f(obj, str);
        }
    }

    public void openURL(Object obj, String str) {
        ad.b(f3523a, "openURL" + str);
        c cVar = this.e;
        if (cVar != null) {
            cVar.e(obj, str);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    WindVaneWebView windVaneWebView = aVar.b;
                    if (windVaneWebView.getWebViewListener() != null) {
                        windVaneWebView.getWebViewListener().a(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
                    }
                }
            } catch (Throwable th) {
                ad.a(f3523a, "handlerH5Exception", th);
            }
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            d.a(obj, new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            ad.b(f3523a, "sendImpressions");
            c cVar = this.e;
            if (cVar != null) {
                cVar.g(obj, str);
            }
        } catch (Throwable th) {
            ad.a(f3523a, "sendImpressions", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            ad.b(f3523a, "reportUrls");
            c cVar = this.e;
            if (cVar != null) {
                cVar.h(obj, str);
            }
        } catch (Throwable th) {
            ad.a(f3523a, "reportUrls", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            d.b(obj, new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            ad.b(f3523a, "onSignalCommunication");
            c cVar = this.e;
            if (cVar != null) {
                cVar.i(obj, str);
            }
        } catch (Throwable th) {
            ad.a(f3523a, "onSignalCommunication", th);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            ad.b(f3523a, "pauseCountDown");
            c cVar = this.e;
            if (cVar != null) {
                cVar.j(obj, str);
            }
        } catch (Throwable th) {
            ad.a(f3523a, "pauseCountDown", th);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            ad.b(f3523a, "resumeCountDown");
            c cVar = this.e;
            if (cVar != null) {
                cVar.k(obj, str);
            }
        } catch (Throwable th) {
            ad.a(f3523a, "resumeCountDown", th);
        }
    }
}
