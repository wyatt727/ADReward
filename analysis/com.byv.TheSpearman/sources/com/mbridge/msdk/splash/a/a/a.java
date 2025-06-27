package com.mbridge.msdk.splash.a.a;

import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SplashUtils.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3469a = "a";

    public static CampaignEx a(String str, CampaignEx campaignEx) throws JSONException, NumberFormatException {
        String strValueOf;
        String strValueOf2;
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
                    String strOptString = jSONObjectCampaignToJsonObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                    if (!TextUtils.isEmpty(strOptString)) {
                        campaignWithBackData.setCampaignUnitId(strOptString);
                    }
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.j);
                    if (jSONObjectOptJSONObject != null) {
                        String string = jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.h);
                        String string2 = jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.i);
                        if (TextUtils.isEmpty(string)) {
                            string = "-999";
                        }
                        int i = Integer.parseInt(string);
                        if (TextUtils.isEmpty(string2)) {
                            string2 = "-999";
                        }
                        int i2 = Integer.parseInt(string2);
                        strValueOf = i != -999 ? String.valueOf(ai.a(c.m().c(), i)) : "-999";
                        strValueOf2 = i2 != -999 ? String.valueOf(ai.a(c.m().c(), i2)) : "-999";
                    } else {
                        strValueOf = "-999";
                        strValueOf2 = strValueOf;
                    }
                    campaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(campaignWithBackData.getClickURL(), strValueOf, strValueOf2));
                    String noticeUrl = campaignWithBackData.getNoticeUrl();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (itKeys.hasNext()) {
                            sb.append(t2.i.c);
                            String next = itKeys.next();
                            String strOptString2 = jSONObjectOptJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.h.equals(next) || com.mbridge.msdk.foundation.same.a.i.equals(next)) {
                                if (TextUtils.isEmpty(strOptString2)) {
                                    strOptString2 = "-999";
                                }
                                int i3 = Integer.parseInt(strOptString2);
                                strOptString2 = i3 != -999 ? String.valueOf(ai.a(c.m().c(), i3)) : "-999";
                            }
                            sb.append(next);
                            sb.append(t2.i.b);
                            sb.append(strOptString2);
                        }
                        campaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb));
                    }
                }
                return campaignWithBackData;
            } catch (Throwable unused) {
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
            } catch (Exception e) {
                ad.b(f3469a, e.getMessage());
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObjectCampaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            String strOptString3 = jSONObjectCampaignToJsonObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (!TextUtils.isEmpty(strOptString3)) {
                campaignWithBackData2.setCampaignUnitId(strOptString3);
            }
            return campaignWithBackData2;
        } catch (JSONException e2) {
            ad.b(f3469a, e2.getMessage());
            return campaignEx;
        }
    }

    public static String a(int i, float f, float f2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (i == 4) {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.h, -999);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.i, -999);
            } else {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.h, ai.b(c.m().c(), f));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.i, ai.b(c.m().c(), f2));
            }
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.m, i);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.k, c.m().c().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, ai.d(c.m().c()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.j, jSONObject2);
        } catch (Exception e) {
            ad.b(f3469a, e.getMessage());
        }
        return jSONObject.toString();
    }
}
