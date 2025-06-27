package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BaseRewardSignalH5 extends a {

    /* renamed from: a, reason: collision with root package name */
    protected IJSFactory f3775a;

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f3775a = (IJSFactory) context;
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f3775a = (IJSFactory) obj;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        String strEncodeToString;
        try {
            IJSFactory iJSFactory = this.f3775a;
            if (iJSFactory != null) {
                String strA = iJSFactory.getIJSRewardVideoV1().a();
                if (!TextUtils.isEmpty(strA)) {
                    strEncodeToString = Base64.encodeToString(strA.getBytes(), 2);
                    ad.a("JS-Reward-Communication", "getEndScreenInfo success");
                } else {
                    strEncodeToString = "";
                    ad.a("JS-Reward-Communication", "getEndScreenInfo failed");
                }
                g.a().a(obj, strEncodeToString);
            }
        } catch (Throwable th) {
            ad.a("JS-Reward-Communication", "getEndScreenInfo", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            if (this.f3775a != null) {
                ad.a("JS-Reward-Communication", "install:" + str);
                if (this.f3775a.getJSContainerModule().endCardShowing()) {
                    this.f3775a.getJSCommon().click(3, str);
                } else {
                    this.f3775a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th) {
            ad.a("JS-Reward-Communication", "install", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        ad.b("JS-Reward-Communication", "openURL:" + str);
        Context contextC = c.m().c();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextC == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                    contextC = windVaneWebView.getContext();
                }
            } catch (Exception e) {
                ad.b("JS-Reward-Communication", e.getMessage());
            }
        }
        if (contextC == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextC, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextC, strOptString);
            }
        } catch (JSONException e2) {
            ad.b("JS-Reward-Communication", e2.getMessage());
        } catch (Throwable th) {
            ad.b("JS-Reward-Communication", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f3775a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            ad.a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
            this.f3775a.getIJSRewardVideoV1().notifyCloseBtn(iOptInt);
        } catch (Throwable th) {
            ad.a("JS-Reward-Communication", "notifyCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f3775a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            ad.a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
            this.f3775a.getIJSRewardVideoV1().toggleCloseBtn(iOptInt);
        } catch (Throwable th) {
            ad.a("JS-Reward-Communication", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f3775a == null || TextUtils.isEmpty(str)) {
                return;
            }
            g.a().a(obj, a(0));
            this.f3775a.getIJSRewardVideoV1().a(new JSONObject(str).optString("state"));
            ad.a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
        } catch (Throwable th) {
            ad.a("JS-Reward-Communication", "triggerCloseBtn", th);
            g.a().a(obj, a(-1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f3775a == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString("state");
            ad.a("JS-Reward-Communication", "setOrientation,state:" + str);
            this.f3775a.getIJSRewardVideoV1().b(strOptString);
        } catch (Throwable th) {
            ad.a("JS-Reward-Communication", "setOrientation", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f3775a == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString(NotificationCompat.CATEGORY_MESSAGE);
            ad.a("JS-Reward-Communication", "handlerPlayableException,msg:" + str);
            this.f3775a.getIJSRewardVideoV1().c(strOptString);
        } catch (Throwable th) {
            ad.a("JS-Reward-Communication", "setOrientation", th);
        }
    }

    private String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            ad.b("JS-Reward-Communication", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) throws JSONException {
        ad.a("JS-Reward-Communication", "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String strOptString = new JSONObject(str).optString("packageName");
            if (TextUtils.isEmpty(strOptString)) {
                d.a(obj, "packageName is empty");
            }
            int i = ai.c(c.m().c(), strOptString) ? 1 : 2;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", d.b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", i);
                jSONObject.put("data", jSONObject2);
                g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e) {
                d.a(obj, e.getMessage());
                ad.a("JS-Reward-Communication", e.getMessage());
            }
        } catch (JSONException e2) {
            d.a(obj, "exception: " + e2.getLocalizedMessage());
            ad.a("JS-Reward-Communication", "cai", e2);
        } catch (Throwable th) {
            d.a(obj, "exception: " + th.getLocalizedMessage());
            ad.a("JS-Reward-Communication", "cai", th);
        }
    }
}
