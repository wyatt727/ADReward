package com.bytedance.sdk.openadsdk.QQ.EYQ;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.EYQ.UB;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.json.t2;
import org.json.JSONObject;

/* compiled from: OldBridgeSyncMethod.java */
/* loaded from: classes2.dex */
public class Kbd extends com.bytedance.sdk.component.EYQ.Kbd<JSONObject, JSONObject> {
    private final String EYQ;
    private final wBa mZx;

    public Kbd(String str, wBa wba) {
        this.mZx = wba;
        this.EYQ = str;
    }

    public static void EYQ(UB ub, wBa wba) {
        ub.EYQ("appInfo", new Kbd("appInfo", wba));
        ub.EYQ("adInfo", new Kbd("adInfo", wba));
        ub.EYQ("sendLog", new Kbd("sendLog", wba));
        ub.EYQ("playable_style", new Kbd("playable_style", wba));
        ub.EYQ("getTemplateInfo", new Kbd("getTemplateInfo", wba));
        ub.EYQ("getTeMaiAds", new Kbd("getTeMaiAds", wba));
        ub.EYQ(t2.h.o, new Kbd(t2.h.o, wba));
        ub.EYQ("getScreenSize", new Kbd("getScreenSize", wba));
        ub.EYQ("getCloseButtonInfo", new Kbd("getCloseButtonInfo", wba));
        ub.EYQ("getVolume", new Kbd("getVolume", wba));
        ub.EYQ("removeLoading", new Kbd("removeLoading", wba));
        ub.EYQ("sendReward", new Kbd("sendReward", wba));
        ub.EYQ("subscribe_app_ad", new Kbd("subscribe_app_ad", wba));
        ub.EYQ("download_app_ad", new Kbd("download_app_ad", wba));
        ub.EYQ("cancel_download_app_ad", new Kbd("cancel_download_app_ad", wba));
        ub.EYQ("unsubscribe_app_ad", new Kbd("unsubscribe_app_ad", wba));
        ub.EYQ("landscape_click", new Kbd("landscape_click", wba));
        ub.EYQ("clickEvent", new Kbd("clickEvent", wba));
        ub.EYQ("renderDidFinish", new Kbd("renderDidFinish", wba));
        ub.EYQ("dynamicTrack", new Kbd("dynamicTrack", wba));
        ub.EYQ("skipVideo", new Kbd("skipVideo", wba));
        ub.EYQ("muteVideo", new Kbd("muteVideo", wba));
        ub.EYQ("changeVideoState", new Kbd("changeVideoState", wba));
        ub.EYQ("getCurrentVideoState", new Kbd("getCurrentVideoState", wba));
        ub.EYQ("send_temai_product_ids", new Kbd("send_temai_product_ids", wba));
        ub.EYQ("getMaterialMeta", new Kbd("getMaterialMeta", wba));
        ub.EYQ("endcard_load", new Kbd("endcard_load", wba));
        ub.EYQ("pauseWebView", new Kbd("pauseWebView", wba));
        ub.EYQ("pauseWebViewTimers", new Kbd("pauseWebViewTimers", wba));
        ub.EYQ("webview_time_track", new Kbd("webview_time_track", wba));
        ub.EYQ("openPrivacy", new Kbd("openPrivacy", wba));
        ub.EYQ("openAdLandPageLinks", new Kbd("openAdLandPageLinks", wba));
        ub.EYQ("getNativeSiteCustomData", new Kbd("getNativeSiteCustomData", wba));
        ub.EYQ("close", new Kbd("close", wba));
    }

    @Override // com.bytedance.sdk.component.EYQ.Kbd
    public JSONObject EYQ(JSONObject jSONObject, com.bytedance.sdk.component.EYQ.IPb iPb) throws Exception {
        wBa.mZx mzx = new wBa.mZx();
        mzx.EYQ = NotificationCompat.CATEGORY_CALL;
        mzx.Td = this.EYQ;
        mzx.Pm = jSONObject;
        return this.mZx.EYQ(mzx, 3);
    }
}
