package com.mbridge.msdk.video.signal.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.click.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.d.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BaseVideoCommunication extends AbsFeedBackForH5 implements IVideoCommunication {

    /* renamed from: a, reason: collision with root package name */
    protected IJSFactory f3776a;
    private FastKV e = null;

    private String a(int i) {
        switch (i) {
            case 1:
                return "sdk_info";
            case 2:
                return MBridgeConstans.PROPERTIES_UNIT_ID;
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return t2.h.G;
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportData(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.f3776a = (IJSFactory) obj;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        ad.c("JS-Video-Brigde", t2.a.e);
        try {
            IJSFactory iJSFactory = this.f3776a;
            int i = 1;
            if (iJSFactory != null) {
                String strC = iJSFactory.getJSCommon().c();
                if (!TextUtils.isEmpty(strC)) {
                    strC = Base64.encodeToString(strC.getBytes(), 2);
                }
                g.a().a(obj, strC);
                this.f3776a.getJSCommon().b(true);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("showTransparent");
                int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                int iOptInt3 = jSONObject.optInt("closeType");
                int iOptInt4 = jSONObject.optInt("orientationType");
                int iOptInt5 = jSONObject.optInt("webfront");
                int iOptInt6 = jSONObject.optInt("showAlertRole");
                this.f3776a.getJSCommon().a(iOptInt == 1);
                this.f3776a.getJSCommon().b(iOptInt2);
                this.f3776a.getJSCommon().c(iOptInt3);
                this.f3776a.getJSCommon().d(iOptInt4);
                this.f3776a.getJSCommon().e(iOptInt5);
                d jSCommon = this.f3776a.getJSCommon();
                if (iOptInt6 != 0) {
                    i = iOptInt6;
                }
                jSCommon.h(i);
                return;
            }
            if (obj != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b.getObject() instanceof k) {
                    k kVar = (k) aVar.b.getObject();
                    String strC2 = kVar.c();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int iOptInt7 = jSONObject2.optInt("showTransparent");
                        int iOptInt8 = jSONObject2.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                        int iOptInt9 = jSONObject2.optInt("closeType");
                        int iOptInt10 = jSONObject2.optInt("orientationType");
                        int iOptInt11 = jSONObject2.optInt("webfront");
                        int iOptInt12 = jSONObject2.optInt("showAlertRole");
                        kVar.a(iOptInt7 == 1);
                        kVar.b(iOptInt8);
                        kVar.c(iOptInt9);
                        kVar.d(iOptInt10);
                        kVar.e(iOptInt11);
                        if (iOptInt12 != 0) {
                            i = iOptInt12;
                        }
                        kVar.h(i);
                        ad.c("JS-Video-Brigde", "init jsCommon.setIsShowingTransparent = " + iOptInt7);
                    }
                    g.a().a(obj, Base64.encodeToString(strC2.getBytes(), 2));
                }
            }
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "init error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        int iOptInt;
        String strOptString;
        k kVar;
        ad.c("JS-Video-Brigde", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                iOptInt = jSONObject.optInt("type");
                strOptString = jSONObject.optString("pt");
            } catch (JSONException e) {
                e.printStackTrace();
                iOptInt = 1;
                strOptString = "";
            }
            IJSFactory iJSFactory = this.f3776a;
            if (iJSFactory != null) {
                iJSFactory.getJSCommon().click(iOptInt, strOptString);
                return;
            }
            if (obj != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (!(aVar.b.getObject() instanceof k) || (kVar = (k) aVar.b.getObject()) == null) {
                    return;
                }
                kVar.click(iOptInt, strOptString);
            }
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "click error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        ad.c("JS-Video-Brigde", "statistics,params:" + str);
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.f3776a.getJSCommon().a(jSONObject.optInt("type"), jSONObject.optString("data"));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "statistics error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        ad.c("JS-Video-Brigde", "triggerCloseBtn");
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str) || !new JSONObject(str).optString("state").equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                return;
            }
            this.f3776a.getJSVideoModule().closeVideoOperate(1, -1);
            g.a().a(obj, b(0));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "triggerCloseBtn error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("margin_top", 0);
            int iOptInt2 = jSONObject.optInt("margin_left", 0);
            int iOptInt3 = jSONObject.optInt("view_width", 0);
            int iOptInt4 = jSONObject.optInt("view_height", 0);
            int iOptInt5 = jSONObject.optInt("radius", 0);
            int iOptInt6 = jSONObject.optInt("border_top", 0);
            int iOptInt7 = jSONObject.optInt("border_left", 0);
            int iOptInt8 = jSONObject.optInt("border_width", 0);
            int iOptInt9 = jSONObject.optInt("border_height", 0);
            ad.c("JS-Video-Brigde", "showVideoLocation,margin_top:" + iOptInt + ",marginLeft:" + iOptInt2 + ",viewWidth:" + iOptInt3 + ",viewHeight:" + iOptInt4 + ",radius:" + iOptInt5 + ",borderTop: " + iOptInt6 + ",borderLeft: " + iOptInt7 + ",borderWidth: " + iOptInt8 + ",borderHeight: " + iOptInt9);
            this.f3776a.getJSVideoModule().showVideoLocation(iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt5, iOptInt6, iOptInt7, iOptInt8, iOptInt9);
            this.f3776a.getJSCommon().f();
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "showVideoLocation error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
            int iOptInt2 = jSONObject.optInt("view_visible");
            String strOptString = jSONObject.optString("pt", "");
            ad.c("JS-Video-Brigde", "soundOperate,mute:" + iOptInt + ",viewVisible:" + iOptInt2 + ",pt:" + strOptString);
            if (TextUtils.isEmpty(strOptString)) {
                this.f3776a.getJSVideoModule().soundOperate(iOptInt, iOptInt2);
            } else {
                this.f3776a.getJSVideoModule().soundOperate(iOptInt, iOptInt2, strOptString);
            }
            g.a().a(obj, b(0));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "soundOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("pause_or_resume");
            ad.c("JS-Video-Brigde", "videoOperate,pauseOrResume:" + iOptInt);
            this.f3776a.getJSVideoModule().videoOperate(iOptInt);
            g.a().a(obj, b(0));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "videoOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("close");
            int iOptInt2 = jSONObject.optInt("view_visible");
            ad.c("JS-Video-Brigde", "closeVideoOperte,close:" + iOptInt + ",viewVisible:" + iOptInt2);
            this.f3776a.getJSVideoModule().closeVideoOperate(iOptInt, iOptInt2);
            g.a().a(obj, b(0));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "closeOperte error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("progress");
            int iOptInt2 = jSONObject.optInt("view_visible");
            ad.c("JS-Video-Brigde", "progressOperate,progress:" + iOptInt + ",viewVisible:" + iOptInt2);
            this.f3776a.getJSVideoModule().progressOperate(iOptInt, iOptInt2);
            g.a().a(obj, b(0));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f3776a.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
            g.a().a(obj, b(0));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f3776a;
            if (iJSFactory != null) {
                String currentProgress = iJSFactory.getJSVideoModule().getCurrentProgress();
                ad.c("JS-Video-Brigde", "getCurrentProgress:" + currentProgress);
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                g.a().a(obj, currentProgress);
            }
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "getCurrentProgress error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("type");
            ad.c("JS-Video-Brigde", "showVideoClickView,type:" + iOptInt);
            this.f3776a.getJSContainerModule().showVideoClickView(iOptInt);
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("fitxy");
            ad.c("JS-Video-Brigde", "setScaleFitXY,type:" + iOptInt);
            this.f3776a.getJSVideoModule().setScaleFitXY(iOptInt);
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            ad.c("JS-Video-Brigde", "notifyCloseBtn,result:" + iOptInt);
            this.f3776a.getJSVideoModule().notifyCloseBtn(iOptInt);
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "notifyCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        ad.b("JS-Video-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                c.c(this.b, strOptString);
            } else if (iOptInt == 2) {
                c.e(this.b, strOptString);
            }
        } catch (JSONException e) {
            ad.b("JS-Video-Brigde", e.getMessage());
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        ad.c("JS-Video-Brigde", "showAlertView");
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f3776a.getJSVideoModule().showIVRewardAlertView(str);
            g.a().a(obj, "showAlertView", "");
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "showAlertView", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            ad.c("JS-Video-Brigde", "toggleCloseBtn,result:" + iOptInt);
            int i = 2;
            if (iOptInt != 1) {
                i = iOptInt == 2 ? 1 : 0;
            }
            this.f3776a.getJSVideoModule().closeVideoOperate(0, i);
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            ad.c("JS-Video-Brigde", "handlerH5Exception,params:" + str);
            this.f3776a.getJSCommon().handlerH5Exception(jSONObject.optInt("code", -999), jSONObject.optString("message", "h5 error"));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "handlerH5Exception", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        try {
            if (this.f3776a != null) {
                ad.c("JS-Video-Brigde", "isSystemResume,params:" + str);
                g.a().a(obj, b(this.f3776a.getActivityProxy().h()));
            }
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "isSystemResume", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.b.getObject() instanceof k) {
                    ((k) aVar.b.getObject()).i(iOptInt);
                }
                if (aVar.b != null) {
                    WindVaneWebView windVaneWebView = aVar.b;
                    if (windVaneWebView.getWebViewListener() != null) {
                        windVaneWebView.getWebViewListener().a(windVaneWebView, iOptInt);
                    }
                }
            } catch (Throwable th) {
                ad.a("JS-Video-Brigde", "readyStatus", th);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("type");
            ad.c("JS-Video-Brigde", "playVideoFinishOperate,type: " + iOptInt);
            this.f3776a.getJSCommon().f(iOptInt);
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "playVideoFinishOperate error", th);
        }
    }

    private String b(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            ad.b("JS-Video-Brigde", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        ad.a("JS-Video-Brigde", "reactDeveloper");
        try {
            if (this.f3776a != null && !TextUtils.isEmpty(str)) {
                this.f3776a.getJSBTModule().reactDeveloper(obj, str);
            } else {
                g.a().b(obj, b(1));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "reactDeveloper error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        ad.a("JS-Video-Brigde", "reportUrls");
        try {
            if (!TextUtils.isEmpty(str)) {
                IJSFactory iJSFactory = this.f3776a;
                if (iJSFactory != null && iJSFactory.getJSBTModule() != null && (this.f3776a.getJSBTModule() instanceof j)) {
                    this.f3776a.getJSBTModule().reportUrls(obj, str);
                } else {
                    com.mbridge.msdk.video.bt.a.d.c().b(obj, str);
                }
            } else {
                g.a().b(obj, b(1));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "reportUrls error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().N(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "getFileInfo error", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        ad.c("JS-Video-Brigde", "getSDKInfo");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
                JSONObject jSONObject = new JSONObject();
                int i = 0;
                if (this.f3776a != null) {
                    while (i < jSONArray.length()) {
                        int i2 = jSONArray.getInt(i);
                        jSONObject.put(a(i2), this.f3776a.getJSCommon().g(i2));
                        i++;
                    }
                } else if (obj != null) {
                    while (i < jSONArray.length()) {
                        int i3 = jSONArray.getInt(i);
                        com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                        if (aVar.b.getObject() instanceof k) {
                            jSONObject.put(a(i3), ((k) aVar.b.getObject()).g(i3));
                        }
                        i++;
                    }
                }
                g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            g.a().b(obj, "params is null");
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "getSDKInfo error", th);
            g.a().b(obj, "exception");
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        int i;
        int iOptInt;
        String str2;
        String str3;
        ad.c("JS-Video-Brigde", "loadads");
        try {
            if (TextUtils.isEmpty(str)) {
                i = 1;
                iOptInt = 1;
                str2 = "";
                str3 = str2;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString(MBridgeConstans.PLACEMENT_ID);
                String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                int iOptInt2 = jSONObject.optInt("type", 1);
                if (iOptInt2 > 2) {
                    iOptInt2 = 1;
                }
                str3 = strOptString2;
                iOptInt = jSONObject.optInt("adtype", 1);
                i = iOptInt2;
                str2 = strOptString;
            }
            if (TextUtils.isEmpty(str3)) {
                g.a().a(obj, b(1));
                return;
            }
            if (obj != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b instanceof WindVaneWebView) {
                    WindVaneWebView windVaneWebView = aVar.b;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((com.mbridge.msdk.mbsignalcommon.b.a) windVaneWebView.getWebViewListener()).a(windVaneWebView, str2, str3, i, iOptInt);
                    }
                }
            }
            g.a().a(obj, b(0));
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "loadads error", th);
            g.a().a(obj, b(1));
        }
    }

    private void a(Object obj, String str) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "params is null");
                g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e) {
            ad.a("JS-Video-Brigde", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().b(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "createWebview error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "createView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().c(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "createPlayerView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().d(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "createSubPlayTemplateView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().e(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "destroyComponent error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().f(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getComponentOptions error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().g(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "setViewRect error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().h(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "removeFromSuperView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().i(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "appendSubView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().j(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "appendViewTo error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().k(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "appendSubView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().l(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "appendViewTo error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().m(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "bringViewToFront error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().n(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "hideView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().o(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "showView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().p(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "setViewBgColor error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().q(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "setViewAlpha error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().r(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "setViewScale error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().a(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "insertViewAbove error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().b(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "insertViewBelow error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().s(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "insertViewAbove error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().b(obj, new JSONObject(str), false);
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "insertViewBelow error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().t(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "webviewLoad error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().u(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "webviewReload error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().v(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "webviewGoBack error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().w(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "webviewGoForward error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().x(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerPlay error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().y(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerPause error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().z(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerResume error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().A(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerStop error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().B(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerUpdateFrame error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().C(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerMute error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().D(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerUnmute error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().E(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerGetMuteState error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().F(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerSetSource error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().G(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "playerSetRenderType error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            if (this.f3776a != null) {
                com.mbridge.msdk.video.bt.a.d.c().H(obj, new JSONObject(str));
            } else {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b instanceof WindVaneWebView) {
                    WindVaneWebView windVaneWebView = aVar.b;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((com.mbridge.msdk.mbsignalcommon.b.a) windVaneWebView.getWebViewListener()).a(obj, str);
                        ad.a("JS-Video-Brigde", "preloadSubPlayTemplateView: RVWebViewListener");
                    } else {
                        ad.a("JS-Video-Brigde", "preloadSubPlayTemplateView: failed");
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "preloadSubPlayTemplateView error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().I(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "closeAd error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().J(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "broadcast error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        ad.b("JS-Video-Brigde", "type" + str);
        try {
            if (TextUtils.isEmpty(str) || this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("status");
            this.f3776a.getJSContainerModule().hideAlertWebview();
            this.f3776a.getJSVideoModule().hideAlertView(iOptInt);
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "closeWeb", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        ad.b("JS-Video-Brigde", "ivRewardAdsWithoutVideo ： params" + str);
        try {
            if (TextUtils.isEmpty(str) || this.f3776a == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f3776a.getJSContainerModule().ivRewardAdsWithoutVideo(str);
        } catch (Throwable th) {
            ad.a("JS-Video-Brigde", "ivRewardAdsWithoutVideo", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) throws JSONException {
        ad.b("JS-Video-Brigde", "setSubPlayTemplateInfo : " + str);
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().K(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "setSubPlayTemplateInfo error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().L(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "setSubPlayTemplateInfo error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().M(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "increaseOfferFrequence error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.c.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "handleNativeObject error " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) throws JSONException {
        a(obj, str);
        if (obj != null) {
            try {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.b != null) {
                    WindVaneWebView windVaneWebView = aVar.b;
                    if (windVaneWebView.getWebViewListener() != null) {
                        windVaneWebView.getWebViewListener().c(windVaneWebView, iOptInt);
                    }
                }
            } catch (Throwable th) {
                ad.b("JS-Video-Brigde", "loadingResourceStatus error " + th);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) throws JSONException {
        a(obj, str);
        try {
            com.mbridge.msdk.video.bt.a.d.c().O(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "createNativeEC error " + th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7 A[ADDED_TO_REGION] */
    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCacheItem(java.lang.Object r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.setCacheItem(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[ADDED_TO_REGION] */
    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void removeCacheItem(java.lang.Object r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.removeCacheItem(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb A[Catch: all -> 0x011b, TRY_ENTER, TryCatch #4 {all -> 0x011b, blocks: (B:34:0x00e8, B:37:0x00fb, B:40:0x0106, B:38:0x00ff), top: B:53:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff A[Catch: all -> 0x011b, TryCatch #4 {all -> 0x011b, blocks: (B:34:0x00e8, B:37:0x00fb, B:40:0x0106, B:38:0x00ff), top: B:53:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106 A[Catch: all -> 0x011b, TRY_LEAVE, TryCatch #4 {all -> 0x011b, blocks: (B:34:0x00e8, B:37:0x00fb, B:40:0x0106, B:38:0x00ff), top: B:53:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getAllCache(java.lang.Object r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.getAllCache(java.lang.Object, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        com.mbridge.msdk.foundation.controller.d.a();
        if (this.e == null) {
            try {
                this.e = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "MBridgeH5CacheSP").build();
            } catch (Exception unused) {
                this.e = null;
            }
        }
        FastKV fastKV = this.e;
        if (fastKV != null) {
            try {
                try {
                    fastKV.clear();
                } catch (Throwable th) {
                    ad.b("JS-Video-Brigde", "getAllCache error " + th);
                    return;
                }
            } catch (Exception unused2) {
            }
            if (obj != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("message", "Success");
                g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            return;
        }
        try {
            com.mbridge.msdk.foundation.controller.c.m().c().getSharedPreferences("MBridgeH5CacheSP", 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 0);
                jSONObject2.put("message", "Success");
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            ad.b("JS-Video-Brigde", "getAllCache error " + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        try {
            String strI = this.f3776a.getJSCommon().i();
            ad.b("JS-Video-Brigde", strI);
            if (obj != null && !TextUtils.isEmpty(strI)) {
                g.a().a(obj, Base64.encodeToString(strI.getBytes(), 2));
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "No notch data, plz try again later.");
                g.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getCutout error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void cai(Object obj, String str) throws JSONException {
        ad.a("JS-Video-Brigde", "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String strOptString = new JSONObject(str).optString("packageName");
            if (TextUtils.isEmpty(strOptString)) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "packageName is empty");
            }
            int i = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), strOptString) ? 1 : 2;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", com.mbridge.msdk.mbsignalcommon.communication.d.b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", i);
                jSONObject.put("data", jSONObject2);
                g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, e.getMessage());
                ad.a("JS-Video-Brigde", e.getMessage());
            }
        } catch (JSONException e2) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + e2.getLocalizedMessage());
            ad.a("JS-Video-Brigde", "cai", e2);
        } catch (Throwable th) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + th.getLocalizedMessage());
            ad.a("JS-Video-Brigde", "cai", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String strOptString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(strOptString)) {
                String strG = h.a().g(strOptString);
                if (TextUtils.isEmpty(strG)) {
                    h.a();
                    jSONObject = new JSONObject(i.a().aL());
                } else {
                    jSONObject = new JSONObject(strG);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "Get App Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "Get App Setting error, because must give a appId.");
            }
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getAppSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject jSONObjectK = b.a().b().k();
            JSONObject jSONObject = new JSONObject();
            if (obj != null && jSONObjectK != null) {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Success");
                jSONObject.put("data", jSONObjectK);
            } else {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Get Reward Setting error, plz try again later.");
            }
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getRewardSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("appid", "");
            String strOptString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                JSONObject jSONObjectE = b.a().a(strOptString, strOptString2).E();
                if (obj != null && jSONObjectE != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put("data", jSONObjectE);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "Get Reward Unit Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "Get reward unit Setting error, because must give appId and unitId.");
            }
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getRewardUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("message", "Get Unit Setting error, RV/IV can not support this method.");
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        String str2;
        try {
            String str3 = "not replaced";
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (TextUtils.isEmpty(str)) {
                str2 = "params is null";
            } else {
                JSONObject jSONObject3 = new JSONObject(str);
                String strOptString = jSONObject3.optString("unitid", "");
                String strOptString2 = jSONObject3.optString("requestId", "");
                if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                    str2 = "params parsing exception";
                } else {
                    com.mbridge.msdk.foundation.entity.d dVarB = com.mbridge.msdk.foundation.same.a.d.b(strOptString, strOptString2);
                    if (dVarB != null && dVarB.c() == 1) {
                        str3 = "success";
                        jSONObject2.put("encrypt_p", dVarB.b());
                        jSONObject2.put(com.mbridge.msdk.foundation.entity.b.KEY_IRLFA, 1);
                        i = 0;
                    }
                    str2 = str3;
                }
            }
            jSONObject.put("code", i);
            jSONObject.put("message", str2);
            jSONObject.put("data", jSONObject2);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.b("JS-Video-Brigde", "getEncryptPrice error : " + th.getMessage());
        }
    }
}
