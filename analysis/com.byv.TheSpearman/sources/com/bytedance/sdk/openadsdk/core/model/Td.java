package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppInfo.java */
/* loaded from: classes2.dex */
public class Td {
    private int VwS;
    private String EYQ = "";
    private String mZx = "";
    private String Td = "";
    private String Pm = "";
    private double Kbd = -1.0d;
    private int IPb = -1;

    public String EYQ() {
        return this.EYQ;
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public String mZx() {
        return this.mZx;
    }

    public void mZx(String str) {
        this.mZx = str;
    }

    public String Td() {
        return this.Td;
    }

    public void Td(String str) {
        this.Td = str;
    }

    public double Pm() {
        return this.Kbd;
    }

    public void EYQ(double d) {
        if (d < 1.0d || d > 5.0d) {
            this.Kbd = -1.0d;
        } else {
            this.Kbd = d;
        }
    }

    public int Kbd() {
        return this.IPb;
    }

    public void EYQ(int i) {
        if (i <= 0) {
            this.IPb = -1;
        } else {
            this.IPb = i;
        }
    }

    public int IPb() {
        return this.VwS;
    }

    public void mZx(int i) {
        this.VwS = i;
    }

    public String VwS() {
        return this.Pm;
    }

    public void Pm(String str) {
        this.Pm = str;
    }

    public JSONObject QQ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", mZx());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, IPb());
            jSONObject.put("comment_num", Kbd());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, EYQ());
            jSONObject.put("package_name", Td());
            jSONObject.put(FirebaseAnalytics.Param.SCORE, Pm());
            jSONObject.put("app_category", VwS());
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.mZx(e.toString());
        }
        return jSONObject;
    }
}
