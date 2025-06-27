package com.bytedance.sdk.openadsdk.tp.EYQ;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.hu;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.tp.EYQ.Td;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.json.i5;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* compiled from: LogStatsBase.java */
/* loaded from: classes2.dex */
public class Td<T extends Td> implements mZx {
    private String EYQ;
    private String HX;
    private String MxO;
    private String Td;
    private String VwS;
    private String mZx;
    private String tp;
    private String tsL;
    private final String Pm = BuildConfig.VERSION_NAME;
    private long Kbd = System.currentTimeMillis() / 1000;
    private int IPb = 0;
    private int QQ = 0;

    private T hu() {
        return this;
    }

    public static Td<Td> mZx() {
        return new Td<>();
    }

    @Override // com.bytedance.sdk.openadsdk.tp.EYQ.mZx
    @JProtect
    public JSONObject EYQ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_sdk_version", VwS());
            jSONObject.put("app_version", FH.VwS());
            jSONObject.put("timestamp", QQ());
            jSONObject.put("conn_type", hu.mZx(com.bytedance.sdk.openadsdk.core.hu.EYQ()));
            jSONObject.put("appid", TextUtils.isEmpty(QQ.mZx().Pm()) ? "" : QQ.mZx().Pm());
            jSONObject.put("device_info", KO());
            if (!TextUtils.isEmpty(Td())) {
                jSONObject.put("type", Td());
            }
            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, MxO());
            if (!TextUtils.isEmpty(tsL())) {
                jSONObject.put("error_msg", tsL());
            }
            if (!TextUtils.isEmpty(Kbd())) {
                jSONObject.put("rit", Kbd());
            }
            if (!TextUtils.isEmpty(IPb())) {
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, IPb());
            }
            if (HX() > 0) {
                jSONObject.put("adtype", HX());
            }
            if (!TextUtils.isEmpty(tp())) {
                jSONObject.put("req_id", tp());
            }
            if (!TextUtils.isEmpty(pi())) {
                jSONObject.put("extra", pi());
            }
            String strPm = Pm();
            JSONObject jSONObject2 = null;
            if (TextUtils.isEmpty(strPm)) {
                jSONObject2 = new JSONObject();
            } else {
                try {
                    jSONObject2 = new JSONObject(strPm);
                } catch (Exception unused) {
                }
            }
            if (jSONObject2 != null) {
                jSONObject2.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("event_extra", jSONObject2.toString());
            } else if (!TextUtils.isEmpty(strPm)) {
                jSONObject.put("event_extra", strPm);
            }
            if (!TextUtils.isEmpty(nWX())) {
                jSONObject.put("duration", nWX());
            }
        } catch (Throwable th) {
            pi.EYQ("LogStatsBase", th.getMessage());
        }
        return jSONObject;
    }

    @JProtect
    private JSONObject KO() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(i5.x, 1);
            jSONObject.put(i5.u, Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", FH.Kbd());
            jSONObject.put(i5.R, FH.Td());
            jSONObject.put(i5.w0, com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ().mZx());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String Td() {
        return this.EYQ;
    }

    public T EYQ(String str) {
        this.EYQ = str;
        return (T) hu();
    }

    public String Pm() {
        return this.MxO;
    }

    public T mZx(String str) {
        this.MxO = str;
        return (T) hu();
    }

    public String Kbd() {
        return this.mZx;
    }

    public T Td(String str) {
        this.mZx = str;
        return (T) hu();
    }

    public String IPb() {
        return this.Td;
    }

    public T Pm(String str) {
        this.Td = str;
        return (T) hu();
    }

    public String VwS() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public long QQ() {
        return this.Kbd;
    }

    public int HX() {
        return this.IPb;
    }

    public T EYQ(int i) {
        this.IPb = i;
        return (T) hu();
    }

    public String tp() {
        return this.VwS;
    }

    public T Kbd(String str) {
        this.VwS = str;
        return (T) hu();
    }

    public int MxO() {
        return this.QQ;
    }

    public T mZx(int i) {
        this.QQ = i;
        return (T) hu();
    }

    public String tsL() {
        return this.HX;
    }

    public T IPb(String str) {
        this.HX = str;
        return (T) hu();
    }

    public String pi() {
        return this.tp;
    }

    public T VwS(String str) {
        this.tp = str;
        return (T) hu();
    }

    public String nWX() {
        return this.tsL;
    }

    public T QQ(String str) {
        this.tsL = str;
        return (T) hu();
    }
}
