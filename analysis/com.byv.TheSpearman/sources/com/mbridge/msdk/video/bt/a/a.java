package com.mbridge.msdk.video.bt.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.json.z4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.bt.a.b;
import com.mbridge.msdk.video.bt.module.BTBaseView;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC;
import com.mbridge.msdk.video.bt.module.MBridgeBTVideoView;
import com.mbridge.msdk.video.bt.module.MBridgeBTWebView;
import com.mbridge.msdk.video.signal.a.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseOperateViews.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f3561a = new ConcurrentHashMap<>();
    private static LinkedHashMap<String, String> b = new LinkedHashMap<>();
    private static LinkedHashMap<String, CampaignEx> c = new LinkedHashMap<>();
    private static LinkedHashMap<String, com.mbridge.msdk.videocommon.d.c> d = new LinkedHashMap<>();
    private static LinkedHashMap<String, String> e = new LinkedHashMap<>();
    private static LinkedHashMap<String, Integer> f = new LinkedHashMap<>();
    private static LinkedHashMap<String, Activity> g = new LinkedHashMap<>();
    private static volatile int h = 10000;
    private static int i = 0;
    private static int j = 1;
    private static String k = "";
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;

    public final String a() {
        h++;
        return String.valueOf(h);
    }

    public final CampaignEx a(String str) {
        if (c.containsKey(str)) {
            return c.get(str);
        }
        return null;
    }

    private String h(String str) {
        return b.containsKey(str) ? b.get(str) : "";
    }

    public final void a(String str, String str2) {
        b.put(str, str2);
    }

    public final com.mbridge.msdk.videocommon.d.c b(String str) {
        if (d.containsKey(str)) {
            return d.get(str);
        }
        return null;
    }

    public final String c(String str) {
        return e.containsKey(str) ? e.get(str) : "";
    }

    public final void a(String str, Activity activity) {
        g.put(str, activity);
    }

    public final void d(String str) {
        g.remove(str);
    }

    public final void a(String str, int i2) {
        f.put(str, Integer.valueOf(i2));
    }

    public final int e(String str) {
        if (f.containsKey(str)) {
            return f.get(str).intValue();
        }
        return 2;
    }

    public final void f(String str) {
        if (e.containsKey(str)) {
            e.remove(str);
        }
        if (d.containsKey(str)) {
            d.remove(str);
        }
        if (c.containsKey(str)) {
            c.remove(str);
        }
        if (b.containsKey(str)) {
            b.remove(str);
        }
    }

    public final void g(String str) {
        if (f.containsKey(str)) {
            f.remove(str);
        }
    }

    public final synchronized LinkedHashMap<String, View> b(String str, String str2) {
        if (f3561a.containsKey(str + "_" + str2)) {
            return f3561a.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        f3561a.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    private void c(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            ad.a("OperateViews", e2.getMessage());
        }
    }

    public final void a(WebView webView, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            g.a().a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            ad.a("OperateViews", e2.getMessage());
        }
    }

    public final void a(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            c(obj, e2.getMessage());
            ad.a("OperateViews", e2.getMessage());
        }
    }

    private void a(Object obj, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            g.a().a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            c(obj, e2.getMessage());
            ad.a("OperateViews", e2.getMessage());
        }
    }

    public final void a(WebView webView, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            g.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            a(webView, e2.getMessage());
            ad.a("OperateViews", e2.getMessage());
        }
    }

    public final void a(final Object obj, JSONObject jSONObject) throws JSONException {
        final int i2;
        final int iOptInt;
        final Rect rect;
        try {
            final String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(strOptString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("delay", 0);
            jSONObjectOptJSONObject.optString("fileURL");
            jSONObjectOptJSONObject.optString(z4.c.c);
            jSONObjectOptJSONObject.optString("html");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect3 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                rect = rect3;
                i2 = iOptInt3;
            } else {
                i2 = 0;
                iOptInt = 0;
                rect = rect2;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    String rid;
                    WindVaneWebView windVaneWebView;
                    com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                    if (aVar.b != null) {
                        windVaneWebView = aVar.b;
                        rid = windVaneWebView.getRid();
                    } else {
                        rid = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> linkedHashMapB = a.this.b(strOptString, rid);
                    String strA = a.this.a();
                    a.b.put(strA, rid);
                    MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.m().c());
                    linkedHashMapB.put(strA, mBridgeBTLayout);
                    mBridgeBTLayout.setInstanceId(strA);
                    mBridgeBTLayout.setUnitId(strOptString);
                    mBridgeBTLayout.setWebView(windVaneWebView);
                    mBridgeBTLayout.setRect(rect);
                    int i3 = i2;
                    if (i3 > 0 || iOptInt > 0) {
                        mBridgeBTLayout.setLayout(i3, iOptInt);
                    }
                    a.this.a(obj, strA);
                    ad.a("OperateViews", "create view instanceId = " + strA);
                }
            }, iOptInt2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "create view failed：" + th.getMessage());
        }
    }

    public final void b(final Object obj, JSONObject jSONObject) throws JSONException {
        final int i2;
        final int iOptInt;
        final Rect rect;
        try {
            final String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(strOptString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("delay", 0);
            final String strOptString2 = jSONObjectOptJSONObject.optString("fileURL");
            final String strOptString3 = jSONObjectOptJSONObject.optString(z4.c.c);
            final String strOptString4 = jSONObjectOptJSONObject.optString("html");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect3 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                rect = rect3;
                i2 = iOptInt3;
            } else {
                i2 = 0;
                iOptInt = 0;
                rect = rect2;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.2
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    String rid;
                    WindVaneWebView windVaneWebView;
                    com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                    if (aVar.b != null) {
                        windVaneWebView = aVar.b;
                        rid = windVaneWebView.getRid();
                    } else {
                        rid = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> linkedHashMapB = a.this.b(strOptString, rid);
                    String strA = a.this.a();
                    a.b.put(strA, rid);
                    MBridgeBTWebView mBridgeBTWebView = new MBridgeBTWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                    linkedHashMapB.put(strA, mBridgeBTWebView);
                    mBridgeBTWebView.setInstanceId(strA);
                    mBridgeBTWebView.setUnitId(strOptString);
                    mBridgeBTWebView.setFileURL(strOptString2);
                    mBridgeBTWebView.setFilePath(strOptString3);
                    mBridgeBTWebView.setHtml(strOptString4);
                    mBridgeBTWebView.setRect(rect);
                    mBridgeBTWebView.setWebViewRid(rid);
                    mBridgeBTWebView.setCreateWebView(windVaneWebView);
                    int i3 = i2;
                    if (i3 > 0 || iOptInt > 0) {
                        mBridgeBTWebView.setLayout(i3, iOptInt);
                    }
                    mBridgeBTWebView.preload();
                    a.this.a(obj, strA);
                    ad.a("OperateViews", "createWebview instanceId = " + strA);
                }
            }, iOptInt2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "createWebview failed：" + th.getMessage());
        }
    }

    public final void c(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject(FirebaseAnalytics.Param.CAMPAIGN));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                int iOptInt = jSONObjectOptJSONObject.optInt("show_time", 0);
                int iOptInt2 = jSONObjectOptJSONObject.optInt("show_mute", 0);
                int iOptInt3 = jSONObjectOptJSONObject.optInt("show_close", 0);
                int iOptInt4 = jSONObjectOptJSONObject.optInt("orientation", 1);
                int iOptInt5 = jSONObjectOptJSONObject.optInt("show_pgb", 0);
                MBridgeBTVideoView mBridgeBTVideoView = new MBridgeBTVideoView(com.mbridge.msdk.foundation.controller.c.m().c());
                try {
                    k kVar = (k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b.getObject();
                    mBridgeBTVideoView.setAdEvents(kVar.l());
                    mBridgeBTVideoView.setAdSession(kVar.j());
                    mBridgeBTVideoView.setVideoEvents(kVar.k());
                } catch (Exception e2) {
                    ad.b("OperateViews", e2.getMessage());
                }
                mBridgeBTVideoView.setCampaign(campaignWithBackData);
                mBridgeBTVideoView.setUnitId(strOptString);
                mBridgeBTVideoView.setShowMute(iOptInt2);
                mBridgeBTVideoView.setShowTime(iOptInt);
                mBridgeBTVideoView.setShowClose(iOptInt3);
                mBridgeBTVideoView.setOrientation(iOptInt4);
                mBridgeBTVideoView.setProgressBarState(iOptInt5);
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    WindVaneWebView windVaneWebView = aVar.b;
                    rid = windVaneWebView.getRid();
                    mBridgeBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
                String strA = a();
                b.put(strA, rid);
                mBridgeBTVideoView.setInstanceId(strA);
                linkedHashMapB.put(strA, mBridgeBTVideoView);
                mBridgeBTVideoView.preLoadData();
                if (campaignWithBackData == null) {
                    c(obj, "campaign is null");
                    ad.a("OperateViews", "createPlayerView failed");
                } else {
                    a(obj, strA);
                    ad.a("OperateViews", "createPlayerView instanceId = " + strA);
                }
                b unused = b.a.f3565a;
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "createPlayerView failed：" + th.getMessage());
        }
    }

    public final void d(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                int iOptInt = jSONObjectOptJSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject(FirebaseAnalytics.Param.CAMPAIGN));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.c.a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (cVarA != null) {
                    cVarA.a(strOptString);
                }
                String strOptString2 = jSONObjectOptJSONObject.optString("userId");
                if (TextUtils.isEmpty(rid)) {
                    com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                    if (aVar.b != null) {
                        rid = aVar.b.getRid();
                    }
                }
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
                String strA = a();
                b.put(strA, rid);
                MBTempContainer mBTempContainer = new MBTempContainer(com.mbridge.msdk.foundation.controller.c.m().c());
                try {
                    k kVar = (k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b.getObject();
                    mBTempContainer.setAdEvents(kVar.l());
                    mBTempContainer.setAdSession(kVar.j());
                    mBTempContainer.setVideoEvents(kVar.k());
                } catch (Exception e2) {
                    ad.b("OperateViews", e2.getMessage());
                }
                mBTempContainer.setInstanceId(strA);
                mBTempContainer.setUnitId(strOptString);
                mBTempContainer.setCampaign(campaignWithBackData);
                mBTempContainer.setRewardUnitSetting(cVarA);
                mBTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(strOptString2)) {
                    mBTempContainer.setUserId(strOptString2);
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("reward");
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString3 = jSONObjectOptJSONObject2.optString("id");
                    com.mbridge.msdk.videocommon.b.c cVar = new com.mbridge.msdk.videocommon.b.c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                    if (!TextUtils.isEmpty(strOptString3)) {
                        mBTempContainer.setRewardId(strOptString3);
                    }
                    if (!TextUtils.isEmpty(cVar.a())) {
                        mBTempContainer.setReward(cVar);
                    }
                }
                String strOptString4 = jSONObjectOptJSONObject.optString("extra");
                if (!TextUtils.isEmpty(strOptString4)) {
                    mBTempContainer.setDeveloperExtraData(strOptString4);
                }
                mBTempContainer.setMute(iOptInt);
                linkedHashMapB.put(strA, mBTempContainer);
                e.put(strA, strOptString);
                c.put(strA, campaignWithBackData);
                d.put(strA, cVarA);
                a(obj, strA);
                ad.a("OperateViews", "createSubPlayTemplateView instanceId = " + strA);
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "createSubPlayTemplateView failed：" + th.getMessage());
        }
    }

    public final void e(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(strOptString)) {
                String strH = h(strOptString2);
                if (TextUtils.isEmpty(strH)) {
                    com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                    if (aVar.b != null) {
                        strH = aVar.b.getRid();
                    }
                }
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
                if (linkedHashMapB != null && linkedHashMapB.containsKey(strOptString2)) {
                    View view = linkedHashMapB.get(strOptString2);
                    linkedHashMapB.remove(strOptString2);
                    if (view != null && view.getParent() != null) {
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() > 0) {
                                int childCount = viewGroup2.getChildCount();
                                for (int i2 = 0; i2 < childCount; i2++) {
                                    View childAt = viewGroup2.getChildAt(i2);
                                    if (childAt instanceof MBridgeBTWebView) {
                                        linkedHashMapB.remove(((MBridgeBTWebView) childAt).getInstanceId());
                                        ((MBridgeBTWebView) childAt).onDestory();
                                    } else if (childAt instanceof MBridgeBTVideoView) {
                                        linkedHashMapB.remove(((MBridgeBTVideoView) childAt).getInstanceId());
                                        ((MBridgeBTVideoView) childAt).onDestory();
                                    } else if (childAt instanceof MBTempContainer) {
                                        linkedHashMapB.remove(((MBTempContainer) childAt).getInstanceId());
                                        ((MBTempContainer) childAt).onDestroy();
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    }
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onDestory();
                    }
                    a(obj, strOptString2);
                    a(obj, "onComponentDestroy", strOptString2);
                    ad.a("OperateViews", "destroyComponent instanceId = " + strOptString2);
                    return;
                }
                c(obj, "unitId or instanceId not exist");
                ad.a("OperateViews", "destroyComponent failed");
                return;
            }
            c(obj, "unidId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "destroyComponent failed");
        }
    }

    public final void f(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            } else {
                a(obj, strOptString);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void g(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            if (jSONObjectOptJSONObject2 == null) {
                c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            Rect rect = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
            int iOptInt = jSONObjectOptJSONObject2.optInt("width");
            int iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null) {
                    if (view.getParent() != null) {
                        view.setLayoutParams(a(view.getLayoutParams(), rect, iOptInt, iOptInt2));
                        view.requestLayout();
                    } else {
                        if (view instanceof MBridgeBTWebView) {
                            ((MBridgeBTWebView) view).setRect(rect);
                            ((MBridgeBTWebView) view).setLayout(iOptInt, iOptInt2);
                        }
                        if (view instanceof MBridgeBTVideoView) {
                            ((MBridgeBTVideoView) view).setRect(rect);
                            ((MBridgeBTVideoView) view).setLayout(iOptInt, iOptInt2);
                        }
                    }
                    a(obj, strOptString2);
                    a(obj, "onViewRectChanged", strOptString2);
                    ad.a("OperateViews", "setViewRect instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "setViewRect failed: view is null");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewRect failed: instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setViewRect failed: " + th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.LinearLayout$LayoutParams] */
    private ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams, Rect rect, int i2, int i3) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        if (contextC == null) {
            return layoutParams;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            if (rect.left != -999) {
                layoutParams2.leftMargin = ai.a(contextC, rect.left);
            }
            if (rect.top != -999) {
                layoutParams2.topMargin = ai.a(contextC, rect.top);
            }
            if (rect.right != -999) {
                layoutParams2.rightMargin = ai.a(contextC, rect.right);
            }
            if (rect.bottom != -999) {
                layoutParams2.bottomMargin = ai.a(contextC, rect.bottom);
            }
            if (i2 > 0) {
                layoutParams2.width = ai.a(contextC, i2);
            }
            if (i3 > 0) {
                layoutParams2.height = ai.a(contextC, i3);
            }
            return layoutParams2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            if (rect.left != -999) {
                layoutParams3.leftMargin = ai.a(contextC, rect.left);
            }
            if (rect.top != -999) {
                layoutParams3.topMargin = ai.a(contextC, rect.top);
            }
            if (rect.right != -999) {
                layoutParams3.rightMargin = ai.a(contextC, rect.right);
            }
            if (rect.bottom != -999) {
                layoutParams3.bottomMargin = ai.a(contextC, rect.bottom);
            }
            if (i2 > 0) {
                layoutParams3.width = ai.a(contextC, i2);
            }
            if (i3 > 0) {
                layoutParams3.height = ai.a(contextC, i3);
            }
            return layoutParams3;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
            if (rect.left != -999) {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = ai.a(contextC, rect.left);
            }
            if (rect.top != -999) {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = ai.a(contextC, rect.top);
            }
            if (rect.right != -999) {
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = ai.a(contextC, rect.right);
            }
            if (rect.bottom != -999) {
                ((LinearLayout.LayoutParams) layoutParams).bottomMargin = ai.a(contextC, rect.bottom);
            }
            if (i2 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).width = ai.a(contextC, i2);
            }
            if (i3 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).height = ai.a(contextC, i3);
            }
        }
        return layoutParams;
    }

    public final void h(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                        a(obj, strOptString2);
                        a(obj, "onRemoveFromView", strOptString2);
                        ad.a("OperateViews", "removeFromSuperView instanceId = " + strOptString2);
                        return;
                    }
                    c(obj, "parent is null");
                    ad.a("OperateViews", "removeFromSuperView failed: parent is null instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "removeFromSuperView failed: view is null instanceId = " + strOptString2);
                return;
            }
            c(obj, "params not enough");
            ad.a("OperateViews", "removeFromSuperView failed: params not enough instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "removeFromSuperView failed: " + th.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        com.mbridge.msdk.foundation.tools.ar.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        r2 = (com.mbridge.msdk.video.bt.module.MBTempContainer) r5;
        r6 = (com.mbridge.msdk.video.signal.a.k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) r13).b.getObject();
        r2.setAdEvents(r6.l());
        r2.setAdSession(r6.j());
        r2.setVideoEvents(r6.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("OperateViews", r2.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r13, org.json.JSONObject r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.a.a.i(java.lang.Object, org.json.JSONObject):void");
    }

    public final void j(Object obj, JSONObject jSONObject) throws JSONException {
        int iOptInt;
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
                if (linkedHashMapB.containsKey(strOptString2) && linkedHashMapB.containsKey(strOptString3)) {
                    ViewGroup viewGroup = (ViewGroup) linkedHashMapB.get(strOptString3);
                    View view = linkedHashMapB.get(strOptString2);
                    ar.a(view);
                    if (viewGroup != null && view != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            Iterator<View> it = linkedHashMapB.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof MBridgeBTContainer) {
                                    ar.a(view);
                                    ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, jSONObjectOptJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            Rect rect = null;
                            int iOptInt2 = 0;
                            if (jSONObjectOptJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    iOptInt2 = ((BTBaseView) view).getViewWidth();
                                    iOptInt = ((BTBaseView) view).getViewHeight();
                                } else {
                                    iOptInt = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                                iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            ViewGroup.LayoutParams layoutParamsA = a(layoutParams, rect, iOptInt2, iOptInt);
                            ar.a(view);
                            viewGroup.addView(view, layoutParamsA);
                        }
                        a(obj, strOptString2);
                        a(obj, "onAppendViewTo", strOptString2);
                        ad.a("OperateViews", "appendViewTo parentId = " + strOptString3 + " childId = " + strOptString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                ad.a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    public final void k(Object obj, JSONObject jSONObject) throws JSONException {
        int iOptInt;
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString3) && linkedHashMapB.containsKey(strOptString2)) {
                ViewGroup viewGroup = (ViewGroup) linkedHashMapB.get(strOptString2);
                View view = linkedHashMapB.get(strOptString3);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    int iOptInt2 = 0;
                    if (view instanceof MBTempContainer) {
                        ad.b("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(l), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(o), Integer.valueOf(p)));
                        ((MBTempContainer) view).setNotchPadding(l, m, n, o, p);
                        Iterator<View> it = linkedHashMapB.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTContainer) {
                                ar.a(view);
                                ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, jSONObjectOptJSONObject2);
                                break;
                            }
                        }
                    } else {
                        Rect rect = null;
                        if (jSONObjectOptJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                iOptInt2 = ((BTBaseView) view).getViewWidth();
                                iOptInt = ((BTBaseView) view).getViewHeight();
                            } else {
                                iOptInt = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                            iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                            iOptInt = jSONObjectOptJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, a(layoutParams, rect, iOptInt2, iOptInt));
                    }
                    a(obj, strOptString2);
                    a(obj, "onAppendView", strOptString2);
                    ad.a("OperateViews", "appendSubView parentId = " + strOptString2 + " childId = " + strOptString3);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
            ad.a("OperateViews", "appendSubView failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "appendSubView failed: " + th.getMessage());
        }
    }

    public final void l(Object obj, JSONObject jSONObject) throws JSONException {
        int iOptInt;
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
                if (linkedHashMapB.containsKey(strOptString2) && linkedHashMapB.containsKey(strOptString3)) {
                    ViewGroup viewGroup = (ViewGroup) linkedHashMapB.get(strOptString3);
                    View view = linkedHashMapB.get(strOptString2);
                    if (viewGroup != null && view != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            Iterator<View> it = linkedHashMapB.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof MBridgeBTContainer) {
                                    ar.a(view);
                                    ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, jSONObjectOptJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            Rect rect = null;
                            int iOptInt2 = 0;
                            if (jSONObjectOptJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    iOptInt2 = ((BTBaseView) view).getViewWidth();
                                    iOptInt = ((BTBaseView) view).getViewHeight();
                                } else {
                                    iOptInt = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                                iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            viewGroup.addView(view, a(layoutParams, rect, iOptInt2, iOptInt));
                        }
                        a(obj, strOptString2);
                        a(obj, "onAppendViewTo", strOptString2);
                        ad.a("OperateViews", "appendViewTo parentId = " + strOptString3 + " childId = " + strOptString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                ad.a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    public final void m(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                        a(obj, strOptString2);
                        a(obj, "onBringViewToFront", strOptString2);
                        ad.a("OperateViews", "bringViewToFront instanceId = " + strOptString2);
                        return;
                    }
                    c(obj, "parent is null");
                    ad.a("OperateViews", "bringViewToFront failed: parent is null");
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "bringViewToFront failed: view is null");
                return;
            }
            c(obj, "instanceId is not exist");
            ad.a("OperateViews", "bringViewToFront failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "bringViewToFront failed: " + th.getMessage());
        }
    }

    public final void n(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null) {
                    view.setVisibility(8);
                    a(obj, strOptString2);
                    a(obj, "onHideView", strOptString2);
                    ad.a("OperateViews", "hideView instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "hideView failed: view not exist");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "hideView failed: instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "hideView failed: + " + th.getMessage());
        }
    }

    public final void o(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null) {
                    view.setVisibility(0);
                    a(obj, strOptString2);
                    a(obj, "onShowView", strOptString2);
                    ad.a("OperateViews", "showView instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "showView failed: view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "showView failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "showView failed: " + th.getMessage());
        }
    }

    public final void p(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("color");
            if (TextUtils.isEmpty(strOptString3)) {
                c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null) {
                    a(obj, strOptString2);
                    view.setBackgroundColor(Color.parseColor(strOptString3));
                    a(obj, "onViewBgColorChanged", strOptString2);
                    ad.a("OperateViews", "setViewBgColor instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewBgColor failed: view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewBgColor failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setViewBgColor failed: " + th.getMessage());
        }
    }

    public final void q(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null) {
                    view.setAlpha((float) dOptDouble);
                    a(obj, strOptString2);
                    a(obj, "onViewAlphaChanged", strOptString2);
                    ad.a("OperateViews", "setViewAlpha instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewAlpha failed: view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewAlpha failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setViewAlpha failed: " + th.getMessage());
        }
    }

    public final void r(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("vertical", 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null) {
                    view.setScaleX((float) dOptDouble2);
                    view.setScaleY((float) dOptDouble);
                    a(obj, strOptString2);
                    a(obj, "onViewScaleChanged", strOptString2);
                    ad.a("OperateViews", "setViewScale instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewScale failed: view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewScale failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setViewScale failed: " + th.getMessage());
        }
    }

    public final void a(Object obj, JSONObject jSONObject, boolean z) throws JSONException {
        int iOptInt;
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2) && linkedHashMapB.containsKey(strOptString3)) {
                View view = linkedHashMapB.get(strOptString2);
                View view2 = linkedHashMapB.get(strOptString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int iIndexOfChild = viewGroup.indexOfChild(view2);
                    Rect rect = null;
                    int iOptInt2 = 0;
                    if (jSONObjectOptJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            iOptInt2 = ((BTBaseView) view).getViewWidth();
                            iOptInt = ((BTBaseView) view).getViewHeight();
                        } else {
                            iOptInt = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt = jSONObjectOptJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams layoutParamsA = a(layoutParams, rect, iOptInt2, iOptInt);
                    if (z) {
                        ar.a(view);
                    }
                    viewGroup.addView(view, iIndexOfChild + 1, layoutParamsA);
                    a(obj, strOptString2);
                    a(obj, "onInsertViewAbove", strOptString2);
                    ad.a("OperateViews", "insertViewAbove instanceId = " + strOptString2 + " brotherId = " + strOptString3);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "insertViewAbove failed: " + th.getMessage());
        }
    }

    public final void b(Object obj, JSONObject jSONObject, boolean z) throws JSONException {
        int iOptInt;
        int viewWidth;
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2) && linkedHashMapB.containsKey(strOptString3)) {
                View view = linkedHashMapB.get(strOptString2);
                View view2 = linkedHashMapB.get(strOptString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int iIndexOfChild = viewGroup.indexOfChild(view2);
                    Rect rect = null;
                    if (jSONObjectOptJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            viewWidth = ((BTBaseView) view).getViewWidth();
                            iOptInt = ((BTBaseView) view).getViewHeight();
                        } else {
                            viewWidth = 0;
                            iOptInt = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                        int iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt = jSONObjectOptJSONObject2.optInt("height");
                        viewWidth = iOptInt2;
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams layoutParamsA = a(layoutParams, rect, viewWidth, iOptInt);
                    if (z) {
                        ar.a(view);
                    }
                    int i2 = iIndexOfChild - 1;
                    viewGroup.addView(view, i2 > -1 ? i2 : 0, layoutParamsA);
                    a(obj, strOptString2);
                    a(obj, "onInsertViewBelow", strOptString2);
                    ad.a("OperateViews", "insertViewBelow instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "insertViewBelow failed: view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "insertViewBelow failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "insertViewBelow failed: " + th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:3:0x0002, B:5:0x0018, B:7:0x001f, B:8:0x0025, B:10:0x002d, B:12:0x0033, B:14:0x0049, B:16:0x004f, B:18:0x005d, B:20:0x0063, B:22:0x0071, B:24:0x0075, B:28:0x00bd, B:30:0x00c7, B:37:0x00e0, B:31:0x00cd, B:33:0x00d1, B:34:0x00d7, B:36:0x00db, B:27:0x0090, B:38:0x010e, B:39:0x0128), top: B:44:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:3:0x0002, B:5:0x0018, B:7:0x001f, B:8:0x0025, B:10:0x002d, B:12:0x0033, B:14:0x0049, B:16:0x004f, B:18:0x005d, B:20:0x0063, B:22:0x0071, B:24:0x0075, B:28:0x00bd, B:30:0x00c7, B:37:0x00e0, B:31:0x00cd, B:33:0x00d1, B:34:0x00d7, B:36:0x00db, B:27:0x0090, B:38:0x010e, B:39:0x0128), top: B:44:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r13, org.json.JSONObject r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.a.a.s(java.lang.Object, org.json.JSONObject):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    public final void t(Object obj, JSONObject jSONObject) throws JSONException {
        Rect rect;
        String str;
        int iOptInt;
        Object obj2 = obj;
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj2;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj2, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("content");
            if (jSONObjectOptJSONObject2 == null) {
                c(obj2, "content is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject2.optString("fileURL");
            String strOptString4 = jSONObjectOptJSONObject2.optString(z4.c.c);
            String strOptString5 = jSONObjectOptJSONObject2.optString("html");
            if (TextUtils.isEmpty(strOptString3) && TextUtils.isEmpty(strOptString4) && TextUtils.isEmpty(strOptString5)) {
                c(obj2, "url is empty");
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("campaigns");
            List<CampaignEx> arrayList = new ArrayList<>();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONArray jSONArray = jSONArrayOptJSONArray;
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONArrayOptJSONArray.getJSONObject(i2));
                    if (campaignWithBackData != null) {
                        campaignWithBackData.setCampaignUnitId(strOptString);
                        arrayList.add(campaignWithBackData);
                    }
                    i2++;
                    jSONArrayOptJSONArray = jSONArray;
                }
            }
            String strOptString6 = jSONObjectOptJSONObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.c.a(jSONObjectOptJSONObject2.optJSONObject("unitSetting"));
            if (cVarA != null) {
                cVarA.a(strOptString6);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (jSONObjectOptJSONObject3 != null) {
                try {
                    str = "OperateViews";
                } catch (Throwable th) {
                    th = th;
                    obj2 = obj;
                    rect = "OperateViews";
                    c(obj2, th.getMessage());
                    ad.a(rect, "webviewLoad failed: " + th.getMessage());
                }
                try {
                    Rect rect3 = new Rect(jSONObjectOptJSONObject3.optInt("left", -999), jSONObjectOptJSONObject3.optInt("top", -999), jSONObjectOptJSONObject3.optInt("right", -999), jSONObjectOptJSONObject3.optInt("bottom", -999));
                    int iOptInt2 = jSONObjectOptJSONObject3.optInt("width");
                    iOptInt = jSONObjectOptJSONObject3.optInt("height");
                    rect = rect3;
                    obj2 = iOptInt2;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = obj;
                    rect = str;
                    c(obj2, th.getMessage());
                    ad.a(rect, "webviewLoad failed: " + th.getMessage());
                }
            } else {
                str = "OperateViews";
                iOptInt = 0;
                obj2 = 0;
                rect = rect2;
            }
            int iOptInt3 = jSONObjectOptJSONObject2.optInt("refreshCache", 0);
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            try {
                if (linkedHashMapB.containsKey(strOptString2)) {
                    View view = linkedHashMapB.get(strOptString2);
                    if (view instanceof MBridgeBTWebView) {
                        MBridgeBTWebView mBridgeBTWebView = (MBridgeBTWebView) view;
                        mBridgeBTWebView.setHtml(strOptString5);
                        mBridgeBTWebView.setFilePath(strOptString4);
                        mBridgeBTWebView.setFileURL(strOptString3);
                        mBridgeBTWebView.setRect(rect);
                        mBridgeBTWebView.setLayout(obj2, iOptInt);
                        mBridgeBTWebView.setCampaigns(arrayList);
                        mBridgeBTWebView.setRewardUnitSetting(cVarA);
                        mBridgeBTWebView.webviewLoad(iOptInt3);
                        Object obj3 = obj;
                        try {
                            a(obj3, strOptString2);
                            String str2 = str;
                            ad.a(str2, "webviewLoad instanceId = " + strOptString2);
                            obj2 = obj3;
                            rect = str2;
                        } catch (Throwable th3) {
                            th = th3;
                            obj2 = obj3;
                            rect = str;
                            c(obj2, th.getMessage());
                            ad.a(rect, "webviewLoad failed: " + th.getMessage());
                        }
                    } else {
                        Object obj4 = obj;
                        String str3 = str;
                        c(obj4, "view not exist");
                        ad.a(str3, "webviewLoad failed: view not exist instanceId = " + strOptString2);
                        obj2 = obj4;
                        rect = str3;
                    }
                } else {
                    Object obj5 = obj;
                    String str4 = str;
                    c(obj5, "instanceId not exist");
                    ad.a(str4, "webviewLoad failed: instanceId not exist instanceId = " + strOptString2);
                    obj2 = obj5;
                    rect = str4;
                }
            } catch (Throwable th4) {
                th = th4;
                c(obj2, th.getMessage());
                ad.a(rect, "webviewLoad failed: " + th.getMessage());
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void u(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewReload()) {
                        a(obj, strOptString2);
                        ad.a("OperateViews", "webviewReload instanceId = " + strOptString2);
                        return;
                    }
                    c(obj, "reload failed");
                    ad.a("OperateViews", "webviewReload failed reload failed instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewReload failed view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewReload failed instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "webviewReload failed: " + th.getMessage());
        }
    }

    public final void v(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewGoBack()) {
                        a(obj, strOptString2);
                        ad.a("OperateViews", "webviewGoBack instanceId = " + strOptString2);
                        return;
                    }
                    c(obj, "webviewGoBack failed");
                    ad.a("OperateViews", "webviewGoBack failed instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewGoBack failed view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewGoBack failed instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "webviewGoBack failed: " + th.getMessage());
        }
    }

    public final void w(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewGoForward()) {
                        a(obj, strOptString2);
                        ad.a("OperateViews", "webviewGoForward instanceId = " + strOptString2);
                        return;
                    }
                    c(obj, "webviewGoForward failed");
                    ad.a("OperateViews", "webviewGoForward failed instanceId = " + strOptString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewGoForward failed view not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewGoForward failed instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "webviewGoForward failed: " + th.getMessage());
        }
    }

    public final void x(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTVideoView) {
                    MBridgeBTVideoView mBridgeBTVideoView = (MBridgeBTVideoView) view;
                    LinkedHashMap<String, View> linkedHashMapB2 = b(strOptString, strH);
                    MBridgeBTContainer mBridgeBTContainer = null;
                    if (linkedHashMapB2.size() > 0) {
                        Iterator<View> it = linkedHashMapB2.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTContainer) {
                                mBridgeBTContainer = (MBridgeBTContainer) next;
                                break;
                            }
                        }
                    }
                    if (mBridgeBTContainer != null) {
                        mBridgeBTVideoView.setAdEvents(mBridgeBTContainer.getAdEvents());
                        mBridgeBTVideoView.setAdSession(mBridgeBTContainer.getAdSession());
                        mBridgeBTVideoView.setVideoEvents(mBridgeBTContainer.getVideoEvents());
                    }
                    mBridgeBTVideoView.play();
                    a(obj, strOptString2);
                    ad.a("OperateViews", "playerPlay success");
                    return;
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerPlay failed instanceId is not player instanceId = " + strOptString2);
                return;
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerPlay failed instanceId not exit instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerPlay failed: " + th.getMessage());
        }
    }

    public final void y(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).pause();
                    a(obj, strOptString2);
                    ad.a("OperateViews", "playerPause success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerPause failed instanceId is not player instanceId = " + strOptString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerPause failed instanceId not exit instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerPause failed: " + th.getMessage());
        }
    }

    public final void z(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).resume();
                    a(obj, strOptString2);
                    ad.a("OperateViews", "playerResume success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerResume failed instanceId is not player instanceId = " + strOptString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerResume failed instanceId not exit instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerResume failed: " + th.getMessage());
        }
    }

    public final void A(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).stop();
                    a(obj, strOptString2);
                    ad.a("OperateViews", "playerStop success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerStop failed instanceId is not player instanceId = " + strOptString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerStop failed instanceId not exit instanceId = " + strOptString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerStop failed: " + th.getMessage());
        }
    }

    public final void B(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void C(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTVideoView) {
                    if (((MBridgeBTVideoView) view).playMute()) {
                        a(obj, strOptString2);
                        ad.a("OperateViews", "playerMute success");
                        return;
                    } else {
                        c(obj, "set mute failed");
                        ad.a("OperateViews", "playerMute failed set mute failed");
                        return;
                    }
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerMute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "playerMute failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerMute failed: " + th.getMessage());
        }
    }

    public final void D(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTVideoView) {
                    if (((MBridgeBTVideoView) view).playUnMute()) {
                        a(obj, strOptString2);
                        a(obj, "onUnmute", strOptString2);
                        ad.a("OperateViews", "playerUnmute successed");
                        return;
                    } else {
                        a(obj, "set unmute failed");
                        ad.a("OperateViews", "playerUnmute failed: set unmute failed");
                        return;
                    }
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerUnmute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerUnmute failed: instanceId not exit");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerUnmute failed: " + th.getMessage());
        }
    }

    public final void E(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBridgeBTVideoView) {
                    int mute = ((MBridgeBTVideoView) view).getMute();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", strOptString2);
                    jSONObject3.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, mute);
                    jSONObject2.put("data", jSONObject3);
                    g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    ad.a("OperateViews", "playerGetMuteState successed mute = " + mute);
                    return;
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerGetMuteState failed instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "playerGetMuteState failed instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerGetMuteState failed: " + th.getMessage());
        }
    }

    public final void F(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void G(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            } else {
                c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void H(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).preload();
                    a(obj, strOptString2);
                    return;
                } else {
                    c(obj, "view not exist");
                    return;
                }
            }
            c(obj, "instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "preloadSubPlayTemplateView failed: " + th.getMessage());
        }
    }

    public final void I(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            String strH = h(strOptString2);
            if (TextUtils.isEmpty(strH)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    strH = aVar.b.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strH);
            MBridgeBTContainer mBridgeBTContainer = null;
            if (linkedHashMapB.size() > 0) {
                for (View view : linkedHashMapB.values()) {
                    if (view instanceof MBridgeBTContainer) {
                        mBridgeBTContainer = (MBridgeBTContainer) view;
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    } else if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).getInstanceId();
                        b unused = b.a.f3565a;
                        ((MBridgeBTVideoView) view).onDestory();
                    } else if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                }
                if (mBridgeBTContainer != null) {
                    mBridgeBTContainer.onAdClose();
                    f3561a.remove(linkedHashMapB);
                    linkedHashMapB.clear();
                    f3561a.remove(strOptString + "_" + strH);
                    a(obj, strOptString2);
                    return;
                }
                c(obj, "not found MBridgeBTContainer");
                ad.a("OperateViews", "closeAd successed");
                return;
            }
            c(obj, "unitId or instanceId not exist");
            ad.a("OperateViews", "closeAd failed: unitId or instanceId not exist unitId = " + strOptString);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "closeAd failed: " + th.getMessage());
        }
    }

    public final void J(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            String rid = aVar.b != null ? aVar.b.getRid() : "";
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString(t2.h.k0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
            if (linkedHashMapB != null && linkedHashMapB.size() > 0) {
                for (View view : linkedHashMapB.values()) {
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                    }
                    if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                    }
                }
                a(obj, "");
                return;
            }
            c(obj, "unitId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "broadcast failed: " + th.getMessage());
        }
    }

    public final void K(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            String strOptString = "";
            String rid = aVar.b != null ? aVar.b.getRid() : "";
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString3 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString4 = jSONObjectOptJSONObject.optString("userId");
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("expired");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("reward");
            String strOptString5 = jSONObjectOptJSONObject.optString("extra");
            com.mbridge.msdk.videocommon.b.c cVar = null;
            if (jSONObjectOptJSONObject2 != null) {
                cVar = new com.mbridge.msdk.videocommon.b.c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                strOptString = jSONObjectOptJSONObject2.optString("id");
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString2, rid);
            if (linkedHashMapB.size() > 0 && e.containsKey(strOptString3)) {
                View view = linkedHashMapB.get(strOptString3);
                if (view instanceof MBTempContainer) {
                    MBTempContainer mBTempContainer = (MBTempContainer) view;
                    mBTempContainer.setReward(cVar);
                    mBTempContainer.setUserId(strOptString4);
                    mBTempContainer.setRewardId(strOptString);
                    mBTempContainer.setCampaignExpired(zOptBoolean);
                    if (!TextUtils.isEmpty(strOptString5)) {
                        mBTempContainer.setDeveloperExtraData(strOptString5);
                    }
                    a(obj, strOptString3);
                    ad.a("OperateViews", "setSubPlayTemplateInfo success instanceId = " + strOptString3);
                    return;
                }
                c(obj, "instanceId not exist");
                ad.a("OperateViews", "setSubPlayTemplateInfo failed: instanceId not exist instanceId = " + strOptString3);
                return;
            }
            c(obj, "unitId not exist");
            ad.a("OperateViews", "setSubPlayTemplateInfo failed: unitId not exist instanceId = " + strOptString3);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setSubPlayTemplateInfo failed: " + th.getMessage());
        }
    }

    public final void L(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            String rid = aVar.b != null ? aVar.b.getRid() : "";
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString2 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString3 = jSONObjectOptJSONObject.optString(t2.h.k0);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("eventData");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
            if (linkedHashMapB.size() > 0) {
                View view = linkedHashMapB.get(strOptString2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof WindVaneWebView) {
                            g.a().a((WebView) childAt, strOptString3, Base64.encodeToString(jSONObjectOptJSONObject2.toString().getBytes(), 2));
                            a(obj, strOptString2);
                            ad.a("OperateViews", "webviewFireEvent instanceId = " + strOptString2);
                            return;
                        }
                    }
                }
                c(obj, "instanceId not exist");
                ad.a("OperateViews", "webviewFireEvent failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            c(obj, "unitId not exist");
            ad.a("OperateViews", "webviewFireEvent failed: unitId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "webviewFireEvent failed: " + th.getMessage());
        }
    }

    public final void M(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            final CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                c(obj, "data camapign is empty");
            } else {
                new Thread(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.foundation.db.k kVarA = com.mbridge.msdk.foundation.db.k.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            if (kVarA != null) {
                                if (!kVarA.b(campaignWithBackData.getId())) {
                                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                                    gVar.a(campaignWithBackData.getId());
                                    gVar.b(campaignWithBackData.getFca());
                                    gVar.c(campaignWithBackData.getFcb());
                                    gVar.a(0);
                                    gVar.d(1);
                                    gVar.a(System.currentTimeMillis());
                                    kVarA.a(gVar);
                                } else {
                                    kVarA.a(campaignWithBackData.getId());
                                }
                            }
                            a.a(a.this, campaignWithBackData.getCampaignUnitId(), campaignWithBackData);
                        } catch (Throwable th) {
                            ad.a("OperateViews", th.getMessage(), th);
                        }
                    }
                }).start();
                a(obj, "");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void N(Object obj, JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        boolean z;
        String str5;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        String str6 = "message";
        String str7 = "code";
        int i3 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e2) {
                ad.a("OperateViews", e2.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i4 = 0;
                while (i4 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                    String strOptString = jSONObject3.optString("ref", "");
                    int i5 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    if (i5 == i3 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        m mVarA = p.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(strOptString);
                        if (mVarA != null) {
                            i2 = length;
                            ad.a("OperateViews", "VideoBean not null");
                            jSONObject5.put("type", 1);
                            str3 = str6;
                            try {
                                jSONObject5.put("videoDataLength", mVarA.d());
                                String strE = mVarA.e();
                                str4 = str7;
                                if (TextUtils.isEmpty(strE)) {
                                    try {
                                        ad.a("OperateViews", "VideoPath null");
                                        jSONObject5.put("path", "");
                                        jSONObject5.put("path4Web", "");
                                    } catch (Throwable th) {
                                        th = th;
                                        str = str3;
                                        str2 = str4;
                                    }
                                } else {
                                    ad.a("OperateViews", "VideoPath not null");
                                    jSONObject5.put("path", strE);
                                    jSONObject5.put("path4Web", strE);
                                }
                                if (mVarA.b() == 5) {
                                    jSONObject5.put("downloaded", 1);
                                    z = false;
                                } else {
                                    z = false;
                                    jSONObject5.put("downloaded", 0);
                                }
                                jSONObject4.put(strOptString, jSONObject5);
                                jSONArray2.put(jSONObject4);
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = str7;
                                str = str3;
                                jSONObject2.put(str2, 1);
                                jSONObject2.put(str, th.getLocalizedMessage());
                                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            }
                        } else {
                            str3 = str6;
                            str4 = str7;
                            i2 = length;
                            z = false;
                            ad.a("OperateViews", "VideoBean null");
                        }
                    } else {
                        str3 = str6;
                        str4 = str7;
                        i2 = length;
                        z = false;
                        if (i5 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? "" : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                            jSONObject4.put(strOptString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i5 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                file = new File(strOptString);
                            } catch (Throwable th3) {
                                if (MBridgeConstans.DEBUG) {
                                    th3.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                ad.a("OperateViews", "getFileInfo Mraid file " + strOptString);
                                str5 = "file:////" + strOptString;
                            } else {
                                str5 = "";
                            }
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 3);
                            jSONObject7.put("path", str5);
                            jSONObject4.put(strOptString, jSONObject7);
                            jSONArray2.put(jSONObject4);
                        } else if (i5 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put("path", ah.a(strOptString) == null ? "" : ah.a(strOptString));
                            jSONObject4.put(strOptString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        }
                    }
                    i4++;
                    jSONArray = jSONArray3;
                    length = i2;
                    str6 = str3;
                    str7 = str4;
                    i3 = 1;
                }
                str3 = str6;
                str4 = str7;
                jSONObject2.put("resource", jSONArray2);
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            str3 = "message";
            str2 = "code";
            try {
                jSONObject2.put(str2, 1);
                str = str3;
                try {
                    try {
                        jSONObject2.put(str, "resource is null");
                        g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        ad.a("OperateViews", e.getMessage());
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (JSONException e4) {
                e = e4;
                str = str3;
            } catch (Throwable th5) {
                th = th5;
                str = str3;
                jSONObject2.put(str2, 1);
                jSONObject2.put(str, th.getLocalizedMessage());
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable th6) {
            th = th6;
            str = str6;
            str2 = str7;
        }
        try {
            jSONObject2.put(str2, 1);
            jSONObject2.put(str, th.getLocalizedMessage());
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e5) {
            ad.a("OperateViews", e5.getMessage());
        }
    }

    public final void b(Object obj, String str) {
        ad.a("OperateViews", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int iOptInt = jSONObject.optInt("type");
                String strA = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), (CampaignEx) null, "", strA, false, iOptInt != 0);
                } else {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), (CampaignEx) null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            try {
                a(obj, "");
            } catch (Throwable th) {
                th = th;
                ad.a("OperateViews", "reportUrls", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void O(Object obj, JSONObject jSONObject) throws JSONException {
        ad.a("OperateViews", "createNativeEC:" + jSONObject);
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject(FirebaseAnalytics.Param.CAMPAIGN));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.c.a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (cVarA != null) {
                    cVarA.a(strOptString);
                }
                MBridgeBTNativeEC mBridgeBTNativeEC = new MBridgeBTNativeEC(com.mbridge.msdk.foundation.controller.c.m().c());
                mBridgeBTNativeEC.setCampaign(campaignWithBackData);
                k kVar = new k(null, campaignWithBackData);
                kVar.a(strOptString);
                mBridgeBTNativeEC.setJSCommon(kVar);
                mBridgeBTNativeEC.setUnitId(strOptString);
                mBridgeBTNativeEC.setRewardUnitSetting(cVarA);
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.b != null) {
                    WindVaneWebView windVaneWebView = aVar.b;
                    rid = windVaneWebView.getRid();
                    mBridgeBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
                String strA = a();
                b.put(strA, rid);
                mBridgeBTNativeEC.setInstanceId(strA);
                linkedHashMapB.put(strA, mBridgeBTNativeEC);
                mBridgeBTNativeEC.preLoadData();
                if (campaignWithBackData == null) {
                    c(obj, "campaign is null");
                    ad.a("OperateViews", "createNativeEC failed");
                    return;
                }
                a(obj, strA);
                ad.a("OperateViews", "createNativeEC instanceId = " + strA);
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "createNativeEC failed：" + th.getMessage());
        }
    }

    public final void a(int i2, int i3, int i4, int i5, int i6) {
        ad.a("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
        k = r.a(i2, i3, i4, i5, i6);
        l = i2;
        m = i3;
        n = i4;
        o = i5;
        p = i6;
    }

    static /* synthetic */ void a(a aVar, String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.a.d.j == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.d.a(str, campaignEx, "reward");
    }
}
