package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.signal.a.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSCommon.java */
/* loaded from: classes4.dex */
public final class k extends l {
    private Activity p;
    private String q;
    private String r;
    private CampaignEx s;
    private List<CampaignEx> t;
    private int u;
    private String v = "";
    private String w = "";
    private boolean x = false;
    private boolean y = false;

    public final void a(CampaignEx campaignEx) {
        this.s = campaignEx;
    }

    public final void a(List<CampaignEx> list) {
        this.t = list;
    }

    public final void c(boolean z) {
        this.x = z;
    }

    public k(Activity activity, CampaignEx campaignEx) {
        this.p = activity;
        this.s = campaignEx;
    }

    public k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.p = activity;
        this.s = campaignEx;
        this.t = list;
    }

    public final void q() {
        this.q = "";
    }

    public final void c(String str) {
        this.v = str;
    }

    public final void d(String str) {
        this.w = str;
    }

    public final int r() {
        return this.u;
    }

    public final void i(int i) {
        this.u = i;
    }

    public final void d(boolean z) {
        this.y = z;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String c() {
        this.m.a();
        this.f3764a = true;
        if (TextUtils.isEmpty(this.q)) {
            this.q = s();
        } else {
            this.q = ai.b(this.q, "tun", z.q() + "");
        }
        return this.q;
    }

    private String s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.v);
            jSONObject2.put("rootViewInstanceId", this.w);
            jSONObject2.put("isRootTemplateWebView", this.x);
            jSONObject.put("sdk_info", "MAL_16.7.41,3.0.1");
            jSONObject2.put("playVideoMute", this.n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.t;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.t) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), b(campaignEx)));
                }
            } else {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.s));
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", A());
            String strG = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(strG)) {
                JSONObject jSONObject3 = new JSONObject(strG);
                b(jSONObject3);
                String strC = com.mbridge.msdk.c.h.a().c(this.j);
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject3.put("ivreward", new JSONObject(strC));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", B());
            if (!TextUtils.isEmpty(this.j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            }
            jSONObject.put("rw_plus", this.y ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void b(JSONObject jSONObject) throws JSONException {
        try {
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            String string = al.a(contextC, "MBridge_ConfirmTitle" + this.j, "").toString();
            String string2 = al.a(contextC, "MBridge_ConfirmContent" + this.j, "").toString();
            String string3 = al.a(contextC, "MBridge_CancelText" + this.j, "").toString();
            String string4 = al.a(contextC, "MBridge_ConfirmText" + this.j, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private CampaignEx a(String str, CampaignEx campaignEx) throws JSONException {
        String strValueOf;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                if (campaignWithBackData == null) {
                    campaignWithBackData = campaignEx;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(jSONObjectCampaignToJsonObject, campaignWithBackData);
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.j);
                    String strValueOf2 = "-999";
                    if (jSONObjectOptJSONObject != null) {
                        strValueOf2 = String.valueOf(ai.a(this.p, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.h)).intValue()));
                        strValueOf = String.valueOf(ai.a(this.p, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.i)).intValue()));
                    } else {
                        strValueOf = "-999";
                    }
                    campaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(campaignWithBackData.getClickURL(), strValueOf2, strValueOf));
                    String noticeUrl = campaignWithBackData.getNoticeUrl();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (itKeys.hasNext()) {
                            sb.append(t2.i.c);
                            String next = itKeys.next();
                            String strOptString = jSONObjectOptJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.h.equals(next) || com.mbridge.msdk.foundation.same.a.i.equals(next)) {
                                strOptString = String.valueOf(ai.a(this.p, Integer.valueOf(strOptString).intValue()));
                            }
                            sb.append(next);
                            sb.append(t2.i.b);
                            sb.append(strOptString);
                        }
                        campaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb));
                    }
                }
                return campaignWithBackData;
            } catch (JSONException e) {
                e.printStackTrace();
                return campaignEx;
            } catch (Throwable th) {
                th.printStackTrace();
                return campaignEx;
            }
        }
        try {
            JSONObject jSONObjectCampaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    jSONObjectCampaignToJsonObject2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObjectCampaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            a(jSONObjectCampaignToJsonObject2, campaignWithBackData2);
            return campaignWithBackData2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return campaignEx;
        }
    }

    private void a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            campaignEx.setCampaignUnitId(strOptString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.e
    public final void click(int i, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int iP;
        List<CampaignEx> list2;
        super.click(i, str);
        CampaignEx campaignEx = this.s;
        if (campaignEx != null) {
            if (campaignEx.getDynamicTempCode() == 5 && this.s != null && (list2 = this.t) != null && list2.size() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("camp_position")) {
                        this.s = this.t.get(jSONObject.getInt("camp_position"));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            CampaignEx campaignEx2 = this.s;
            if (i == 3) {
                campaignEx2.setClickTempSource(2);
                if (campaignEx2.getTriggerClickSource() == 0) {
                    campaignEx2.setTriggerClickSource(2);
                }
            } else if (i == 1 && campaignEx2.getClickTempSource() != 2) {
                campaignEx2.setClickTempSource(1);
            }
        }
        try {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.m.a(true);
                    return;
                }
                CampaignEx campaignEx3 = this.s;
                if (campaignEx3 != null && campaignEx3.getCbd() > -2) {
                    iP = this.s.getCbd();
                } else {
                    iP = this.k != null ? this.k.p() : 1;
                }
                if (iP == -1) {
                    a(new a.b(this, this.m));
                }
                click(1, str);
                return;
            }
            if (this.s == null && (list = this.t) != null && list.size() > 0) {
                this.s = this.t.get(0);
            }
            CampaignEx campaignEx4 = this.s;
            if (campaignEx4 == null) {
                return;
            }
            CampaignEx campaignExA = a(str, campaignEx4);
            if (campaignExA != null && (appletsModel = AppletModelManager.getInstance().get(campaignExA)) != null) {
                appletsModel.setUserClick(true);
                AppletModelManager.getInstance().replace(appletsModel, campaignExA);
            }
            a(campaignExA, this.p);
        } catch (Throwable th) {
            ad.a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.e
    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.m.a(i, str);
        } catch (Throwable th) {
            ad.a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void a(int i, String str) {
        super.a(i, str);
        if (i != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT);
            final String strOptString2 = jSONObject.optString("template", "-1");
            final String strOptString3 = jSONObject.optString("layout", "-1");
            final String strOptString4 = jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            final int iL = z.l(this.p.getApplication());
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.signal.a.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.foundation.db.q.a(com.mbridge.msdk.foundation.db.h.a(k.this.p.getApplication())).a(new com.mbridge.msdk.foundation.entity.n("2000039", strOptString, strOptString2, strOptString3, strOptString4, k.this.s.getId(), iL, z.a(k.this.p.getApplication(), iL)));
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void f() {
        super.f();
        if (this.m != null) {
            this.m.b();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void d() {
        super.d();
        try {
            Activity activity = this.p;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            ad.a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String g(int i) {
        switch (i) {
            case 1:
                return u().toString();
            case 2:
                return v().toString();
            case 3:
                return w().toString();
            case 4:
                return x().toString();
            case 5:
                return y().toString();
            case 6:
                return z().toString();
            default:
                return t().toString();
        }
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.s));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", A());
            String strG = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(strG)) {
                JSONObject jSONObject3 = new JSONObject(strG);
                b(jSONObject3);
                String strC = com.mbridge.msdk.c.h.a().c(this.j);
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject3.put("ivreward", strC);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", B());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_16.7.41,3.0.1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject v() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strG = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put("appSetting", new JSONObject(strG));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject x() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.k != null) {
                jSONObject.put("unitSetting", this.k.E());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject z() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.n);
            jSONObject2.put("instanceId", this.v);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject A() {
        return this.k != null ? this.k.E() : new JSONObject();
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.d.a aVarB = com.mbridge.msdk.videocommon.d.b.a().b();
        return aVarB != null ? aVarB.k() : jSONObject;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void a(Activity activity) {
        this.p = activity;
    }

    private boolean b(CampaignEx campaignEx) {
        com.mbridge.msdk.c.g gVarB;
        try {
            String strK = com.mbridge.msdk.foundation.controller.c.m().k();
            long jAc = (TextUtils.isEmpty(strK) || (gVarB = com.mbridge.msdk.c.h.a().b(strK)) == null) ? 0L : gVarB.ac() * 1000;
            com.mbridge.msdk.videocommon.d.a aVarB = com.mbridge.msdk.videocommon.d.b.a().b();
            long jF = aVarB != null ? aVarB.f() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(jF, jAc);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.r = str;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return this.r;
    }
}
