package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class DomainCampaignEx extends Campaign implements NoProGuard, Serializable {
    private static final String JSON_KEY_AD_TRACKING_DLE = "D+S8+FxXJFPsYFc3+F5/Hv==";
    private static final String JSON_KEY_AD_TRACKING_DLS = "D+S8+FxXJFPsYFc3+bfTD+zT";
    private static final String JSON_KEY_AD_TRACKING_I = "D+S8+FQ/hbxtY7M=";
    public static final String KEY_BIND_ID = "bind_id";
    public static final String KEY_GH_ID = "gh_id";
    public static final String KEY_GH_PATH = "gh_path";
    private static String TAG = "DomainCampaignEx";
    private String bindId;
    private String ghId;
    private String ghPath;

    public static JSONObject campaignToJsonObject(JSONObject jSONObject, CampaignEx campaignEx) throws JSONException {
        return jSONObject;
    }

    public boolean needShowIDialog(CampaignEx campaignEx) {
        return false;
    }

    public static CampaignEx parseCampaignWithBackData(JSONObject jSONObject, CampaignEx campaignEx) {
        String strOptString = jSONObject.optString(KEY_GH_ID);
        if (!TextUtils.isEmpty(strOptString)) {
            campaignEx.setGhId(strOptString);
            String strOptString2 = jSONObject.optString(KEY_GH_PATH);
            if (!TextUtils.isEmpty(strOptString2)) {
                campaignEx.setGhPath(x.a(strOptString2));
            }
            campaignEx.setBindId(jSONObject.optString(KEY_BIND_ID));
        }
        return campaignEx;
    }

    public static CampaignEx parseCampaign(JSONObject jSONObject, CampaignEx campaignEx) {
        String strOptString = jSONObject.optString(KEY_GH_ID);
        if (!TextUtils.isEmpty(strOptString)) {
            campaignEx.setGhId(strOptString);
            String strOptString2 = jSONObject.optString(KEY_GH_PATH);
            if (!TextUtils.isEmpty(strOptString2)) {
                campaignEx.setGhPath(x.a(strOptString2));
            }
            campaignEx.setBindId(jSONObject.optString(KEY_BIND_ID));
        }
        return campaignEx;
    }

    public static JSONObject object2TrackingStr(JSONObject jSONObject, j jVar) throws JSONException {
        if (jSONObject == null || jVar == null) {
            return null;
        }
        try {
            if (jVar.u() != null) {
                jSONObject.put(x.a(JSON_KEY_AD_TRACKING_DLS), CampaignEx.processNativeVideoTrackingArray2Json(jVar.u()));
            }
            if (jVar.v() != null) {
                jSONObject.put(x.a(JSON_KEY_AD_TRACKING_DLE), CampaignEx.processNativeVideoTrackingArray2Json(jVar.v()));
            }
            if (jVar.w() != null) {
                jSONObject.put(x.a(JSON_KEY_AD_TRACKING_I), CampaignEx.processNativeVideoTrackingArray2Json(jVar.w()));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DomainCampaignEx", e.getMessage(), e);
            }
        }
        return jSONObject;
    }

    public static j trackingStr2Object(JSONObject jSONObject, j jVar) {
        if (jSONObject == null || jVar == null) {
            return null;
        }
        try {
            jVar.t(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(x.a(JSON_KEY_AD_TRACKING_DLS))));
            jVar.u(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(x.a(JSON_KEY_AD_TRACKING_DLE))));
            jVar.v(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(x.a(JSON_KEY_AD_TRACKING_I))));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DomainCampaignEx", e.getMessage(), e);
            }
        }
        return jVar;
    }

    protected static String replaceValueByKey(CampaignUnit campaignUnit, CampaignEx campaignEx, String str) {
        if (campaignUnit != null && !TextUtils.isEmpty(str) && campaignEx != null) {
            try {
                HashMap<String, String> rks = campaignUnit.getRks();
                if (rks != null) {
                    rks.entrySet().iterator();
                    for (Map.Entry<String, String> entry : rks.entrySet()) {
                        String key = entry.getKey();
                        str = str.replaceAll("\\{" + key + "\\}", entry.getValue());
                    }
                }
                HashMap<String, String> aks = campaignEx.getAks();
                if (aks != null) {
                    aks.entrySet().iterator();
                    for (Map.Entry<String, String> entry2 : aks.entrySet()) {
                        String key2 = entry2.getKey();
                        str = str.replaceAll("\\{" + key2 + "\\}", entry2.getValue());
                    }
                }
                HashMap<String, String> epMap = campaignUnit.getEpMap();
                if (epMap != null) {
                    for (Map.Entry<String, String> entry3 : epMap.entrySet()) {
                        String key3 = entry3.getKey();
                        str = str.replaceAll("\\{" + key3 + "\\}", entry3.getValue());
                    }
                }
                str = str.replaceAll("\\{c\\}", URLEncoder.encode(campaignUnit.assembCParams(), m4.M));
                Matcher matcher = Pattern.compile("=\\{.*?\\}").matcher(str);
                while (matcher.find()) {
                    str = str.replace(matcher.group(0), t2.i.b);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("DomainCampaignEx", th.getMessage(), th);
                }
            }
        }
        return str;
    }

    public String getGhId() {
        return this.ghId;
    }

    public void setGhId(String str) {
        this.ghId = str;
    }

    public String getGhPath() {
        return this.ghPath;
    }

    public void setGhPath(String str) {
        this.ghPath = str;
    }

    public String getBindId() {
        return this.bindId;
    }

    public void setBindId(String str) {
        this.bindId = str;
    }
}
