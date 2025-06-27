package com.bytedance.sdk.openadsdk.mZx;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.Td;
import com.bytedance.sdk.openadsdk.core.hYh;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.mZx.EYQ;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.json.i1;
import com.json.t2;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEventManager.java */
/* loaded from: classes2.dex */
public class Td {
    public static void EYQ() throws ClassNotFoundException {
        try {
            Class.forName(Td.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void EYQ(UB ub, String str, int i) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("render_type", "h5");
            jSONObject2.putOpt("render_type_2", 0);
            jSONObject2.putOpt("preload_status", Integer.valueOf(i));
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
        } catch (Exception unused) {
        }
        Td(ub, str, "open_url_h5", jSONObject);
    }

    public static void EYQ(UB ub, String str) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (UB.Td(ub)) {
                if (ub.po() != null) {
                    jSONObject2.putOpt("url", ub.po().Td());
                    jSONObject2.putOpt("id", ub.po().EYQ());
                    jSONObject2.putOpt("md5", ub.po().mZx());
                }
                if (ub.mN() != null) {
                    jSONObject2.putOpt("render_type", 7);
                }
            } else {
                jSONObject2.putOpt("url", ub.mN().tsL());
                jSONObject2.putOpt("style_id", ub.OUK());
                if (ub.mN() != null) {
                    jSONObject2.putOpt("render_type", 0);
                }
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.mZx(e.getMessage());
        }
        Td(ub, str, "endcard_load_start", jSONObject);
    }

    public static void EYQ(UB ub, String str, long j) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (UB.Td(ub)) {
                if (ub.po() != null) {
                    jSONObject2.putOpt("url", ub.po().Td());
                    jSONObject2.putOpt("id", ub.po().EYQ());
                    jSONObject2.putOpt("md5", ub.po().mZx());
                }
                if (ub.mN() != null) {
                    jSONObject2.putOpt("render_type", 7);
                }
            } else {
                jSONObject2.putOpt("url", ub.mN().tsL());
                jSONObject2.putOpt("style_id", ub.OUK());
                if (ub.mN() != null) {
                    jSONObject2.putOpt("render_type", 0);
                }
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            jSONObject.put("duration", j);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.mZx(e.getMessage());
        }
        Td(ub, str, "endcard_load_finish", jSONObject);
    }

    public static void EYQ(UB ub, String str, long j, int i, String str2, String str3) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (UB.Td(ub)) {
                if (ub.po() != null) {
                    jSONObject2.putOpt("url", ub.po().Td());
                    jSONObject2.putOpt("id", ub.po().EYQ());
                    jSONObject2.putOpt("md5", ub.po().mZx());
                }
                if (ub.mN() != null) {
                    jSONObject2.putOpt("render_type", 7);
                }
            } else {
                jSONObject2.putOpt("url", ub.mN().tsL());
                jSONObject2.putOpt("style_id", ub.OUK());
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject2.putOpt("error_url", str3);
                }
                if (ub.mN() != null) {
                    jSONObject2.putOpt("render_type", 0);
                }
            }
            jSONObject2.put(AndroidBridgeConstants.ERROR_CODE, i);
            jSONObject2.put("error_msg", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            jSONObject.put("duration", j);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.mZx(e.getMessage());
        }
        Td(ub, str, "endcard_load_fail", jSONObject);
    }

    public static void EYQ(UB ub, String str, long j, int i, int i2) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("render_type", "h5");
            jSONObject2.putOpt("render_type_2", 0);
            jSONObject2.putOpt("interaction_method", Integer.valueOf(ub.KO()));
            jSONObject2.put("first_page", i2);
            jSONObject2.put("preload_h5_type", ub.Fw());
            if (i >= 0) {
                jSONObject2.putOpt("preload_status", Integer.valueOf(i));
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            jSONObject.put("duration", Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME));
        } catch (Exception unused) {
        }
        Td(ub, str, "load", jSONObject);
    }

    public static void EYQ(String str, UB ub, String str2, Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception unused) {
            }
        }
        mZx(System.currentTimeMillis(), ub, str2, str, jSONObject);
    }

    public static void EYQ(long j, UB ub, String str, String str2, JSONObject jSONObject, VwS vwS, com.bytedance.sdk.openadsdk.mZx.mZx.EYQ eyq) {
        if (ub == null || EYQ(str2)) {
            return;
        }
        new EYQ.C0131EYQ(j, ub).IPb(ub.VOV()).QQ(ub.ZFP()).Kbd(ub.GfQ()).EYQ(ub.Nuq()).mZx(str).Td(str2).EYQ(jSONObject).EYQ(eyq);
    }

    public static void EYQ(UB ub, String str, JSONObject jSONObject) {
        Pm(ub, i1.u, str, jSONObject);
    }

    private static void Pm(final UB ub, final String str, final String str2, final JSONObject jSONObject) {
        if (ub == null || TextUtils.isEmpty(str)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        EYQ(new com.bytedance.sdk.component.VwS.QQ("onShow") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2;
                Object obj;
                try {
                    hYh.mZx(ub);
                    String strEYQ = com.bytedance.sdk.openadsdk.core.hu.Pm().CsQ() ? com.bytedance.sdk.openadsdk.core.Kbd.EYQ.EYQ.EYQ((Application) com.bytedance.sdk.openadsdk.core.hu.EYQ()).EYQ(str2, DeviceUtils.EYQ(), ub.yK()) : "none";
                    jSONObject2 = new JSONObject();
                    try {
                        JSONObject jSONObject3 = jSONObject;
                        if (jSONObject3 != null) {
                            jSONObject3.put("interaction_method", ub.KO());
                            jSONObject.put("real_interaction_method", ub.nWX());
                            jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.hu.Pm().tsL(String.valueOf(ub.yK())));
                            jSONObject.put("au_show", strEYQ);
                            jSONObject2.put("ad_extra_data", jSONObject.toString());
                        } else {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", ub.KO());
                            jSONObject4.put("real_interaction_method", ub.nWX());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.hu.Pm().tsL(String.valueOf(ub.yK())));
                            jSONObject4.put("au_show", strEYQ);
                            jSONObject2.put("ad_extra_data", jSONObject4.toString());
                        }
                        jSONObject2.putOpt("log_extra", ub.GfQ());
                        float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - ub.OMh()).floatValue();
                        if (fFloatValue <= 0.0f) {
                            fFloatValue = 0.0f;
                        }
                        jSONObject2.putOpt("show_time", Float.valueOf(fFloatValue));
                        jSONObject2.putOpt("ua_policy", Integer.valueOf(ub.FtN()));
                        String strWBa = ub.wBa();
                        if (!TextUtils.isEmpty(strWBa) && !TextUtils.isEmpty(strWBa)) {
                            try {
                                jSONObject2.put("ttdsp_price", Math.round(Float.parseFloat(strWBa) * 100000.0f));
                            } catch (Throwable th) {
                                jSONObject2.put("ttdsp_price", 0);
                                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AdEvent", th.getMessage());
                            }
                        }
                        if (ub.Hnh() != null) {
                            try {
                                Object obj2 = ub.Hnh().get("sdk_bidding_type");
                                if (obj2 != null && Integer.parseInt(obj2.toString()) == 2 && (obj = ub.Hnh().get("price")) != null) {
                                    jSONObject2.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                }
                            } catch (Throwable th2) {
                                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AdEvent", "client bidding price error: ", th2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    jSONObject2 = null;
                }
                new EYQ.C0131EYQ(jCurrentTimeMillis, ub).mZx(str2).Td(str).IPb(ub.VOV()).EYQ(ub.Nuq()).EYQ(jSONObject2).QQ(ub.ZFP()).EYQ((com.bytedance.sdk.openadsdk.mZx.mZx.EYQ) null);
                if (i1.u.equals(str)) {
                    if (!ub.Jpu()) {
                        if (ub.HG()) {
                            com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(ub.wa(), new Td.mZx("show_urls", ub));
                        } else {
                            Td.EYQ(ub);
                        }
                    }
                    JSONObject jSONObject5 = jSONObject;
                    if (jSONObject5 != null) {
                        int iOptInt = jSONObject5.optInt("dynamic_show_type");
                        if (ub.TmV() == 1 && iOptInt == 7) {
                            com.bytedance.sdk.component.utils.QQ.EYQ().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.Td.1.1
                                @Override // java.lang.Runnable
                                public void run() throws JSONException {
                                    JSONObject jSONObject6 = new JSONObject();
                                    try {
                                        jSONObject6.put("auto_click", true);
                                        Td.mZx(ub, str2, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject6);
                                    } catch (Exception unused3) {
                                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().oIw());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.Kbd.Td.mZx();
                }
            }
        });
    }

    public static void EYQ(UB ub) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.MxO.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ(com.bytedance.sdk.openadsdk.nWX.EYQ.EYQ(ub.wa(), true), 1, ub.VOV());
    }

    public static void EYQ(final String str, final UB ub, final String str2, final VwS vwS) {
        if (ub == null || vwS == null || !vwS.EYQ()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        EYQ(new com.bytedance.sdk.component.VwS.QQ("adShowTimeReport") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.6
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                    VwS vwS2 = vwS;
                    if (vwS2 != null && vwS2.mZx() != null) {
                        JSONObject jSONObjectMZx = vwS.mZx();
                        if (str2.equals("open_ad")) {
                            jSONObjectMZx.put("is_icon_only", ub.BEC() ? 1 : 0);
                        }
                        jSONObject.put("ad_extra_data", jSONObjectMZx.toString());
                    }
                } catch (Throwable unused) {
                }
                Td.mZx(jCurrentTimeMillis, ub, str2, "ad_show_time", jSONObject);
            }
        });
    }

    public static void EYQ(final UB ub, final String str, final Nvm nvm) {
        if (ub == null) {
            return;
        }
        final long jTd = nvm.Td();
        EYQ(new com.bytedance.sdk.component.VwS.QQ("adBackShowTimeReport") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jTd);
                    jSONObject.put("click_time", nvm.EYQ);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", ub.BEC() ? 1 : 0);
                    }
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable unused) {
                }
                Td.mZx(System.currentTimeMillis(), ub, str, "stay_duration", jSONObject2);
            }
        });
    }

    public static void mZx(final UB ub, final String str, final long j) {
        if (ub == null) {
            return;
        }
        EYQ(new com.bytedance.sdk.component.VwS.QQ("adClickShowTimeReport") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.8
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("video_click_duration_time", j);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable unused) {
                }
                long j2 = j;
                if (j2 <= 0 || j2 >= 200000) {
                    return;
                }
                Td.mZx(System.currentTimeMillis(), ub, str, "video_click_duration", jSONObject2);
            }
        });
    }

    public static void EYQ(final UB ub, final String str, final long j, final boolean z) {
        EYQ(new com.bytedance.sdk.component.VwS.QQ("onLpLoading") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.9
            @Override // java.lang.Runnable
            public void run() {
                if (ub == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z ? 1 : 2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put("duration", j);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.mZx(th.toString());
                }
                Td.mZx(System.currentTimeMillis(), ub, str, "lp_loading", jSONObject2);
            }
        });
    }

    public static void mZx(final UB ub, final String str) {
        EYQ(new com.bytedance.sdk.component.VwS.QQ("pictureClick") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.10
            @Override // java.lang.Runnable
            public void run() {
                if (ub == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", ub.Nvm().getNativeAdType());
                    jSONObject.put("interaction_method", ub.KO());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.mZx(th.toString());
                }
                Td.mZx(System.currentTimeMillis(), ub, str, "picture_click", jSONObject2);
            }
        });
    }

    public static void EYQ(final String str, final UB ub, final com.bytedance.sdk.openadsdk.core.model.HX hx, final String str2, final boolean z, final Map<String, Object> map, final int i) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        EYQ(new com.bytedance.sdk.component.VwS.QQ("onClick") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.11
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (ub == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.core.model.HX hx2 = hx;
                    if (hx2 != null) {
                        JSONObject jSONObjectEYQ = hx2.EYQ();
                        jSONObjectEYQ.put("is_valid", z);
                        int i2 = i;
                        if (i2 > 0 && i2 <= 2) {
                            jSONObjectEYQ.put("user_behavior_type", i2);
                        }
                        Map map2 = map;
                        if (map2 != null) {
                            if (map2.containsKey("duration")) {
                                jSONObject.put("duration", map.get("duration"));
                            }
                            for (Map.Entry entry : map.entrySet()) {
                                if (!"duration".equals(entry.getKey())) {
                                    jSONObjectEYQ.put((String) entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        jSONObjectEYQ.put("interaction_method", ub.KO());
                        if (str2.equals("open_ad")) {
                            jSONObjectEYQ.put("is_icon_only", ub.BEC() ? 1 : 0);
                        }
                        jSONObject.put("ad_extra_data", jSONObjectEYQ.toString());
                    }
                    jSONObject.putOpt("log_extra", ub.GfQ());
                    float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - ub.OMh()).floatValue();
                    if (fFloatValue <= 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                    jSONObject.putOpt("ua_policy", Integer.valueOf(ub.FtN()));
                } catch (Exception unused) {
                }
                new EYQ.C0131EYQ(jCurrentTimeMillis, ub).mZx(str2).Td(str).IPb(ub.VOV()).EYQ(ub.Nuq()).EYQ(jSONObject).QQ(ub.ZFP()).EYQ((com.bytedance.sdk.openadsdk.mZx.mZx.EYQ) null);
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.MxO.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ())) && CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ(com.bytedance.sdk.openadsdk.nWX.EYQ.EYQ(ub.KR(), true), 2, ub.VOV());
                }
                if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    hYh.Td(ub);
                }
            }
        });
    }

    public static void EYQ(UB ub, String str, String str2, JSONObject jSONObject) throws JSONException {
        if (ub == null) {
            return;
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ad_extra_data", jSONObject.toString());
                if (jSONObject.has("duration")) {
                    jSONObject2.put("duration", jSONObject.get("duration"));
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AdEvent", e.getMessage());
            }
            mZx(System.currentTimeMillis(), ub, str, str2, jSONObject2);
        } else {
            mZx(System.currentTimeMillis(), ub, str, str2);
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str2)) {
            hYh.Td(ub);
        }
    }

    public static void EYQ(UB ub, String str, int i, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("video_choose", i);
            jSONObject2.put("video_choose_duration", j);
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.mZx(th.toString());
        }
        mZx(System.currentTimeMillis(), ub, str, "video_choose", jSONObject);
    }

    public static void EYQ(UB ub, String str, String str2, long j, int i, JSONObject jSONObject, VwS vwS) {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("duration", j);
            jSONObject2.put("percent", i);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (("feed_break".equals(str2) || "feed_over".equals(str2)) && vwS != null) {
                vwS.EYQ(jSONObject);
            }
            jSONObject2.put("ad_extra_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        mZx(System.currentTimeMillis(), ub, str, str2, jSONObject2);
    }

    public static void mZx(UB ub, String str, String str2, JSONObject jSONObject) {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject2.put("ad_extra_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        mZx(System.currentTimeMillis(), ub, str, str2, jSONObject2);
    }

    public static void EYQ(UB ub, String str, String str2, JSONObject jSONObject, long j) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject2.put("ad_extra_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("duration", j);
        mZx(System.currentTimeMillis(), ub, str, str2, jSONObject2);
    }

    public static void EYQ(UB ub, String str, String str2, Map<String, Object> map) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject2.put("dp_creative_type", ub.CE());
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (Exception unused) {
        }
        mZx(System.currentTimeMillis(), ub, str, str2, jSONObject);
    }

    private static void mZx(long j, UB ub, String str, String str2) {
        mZx(j, ub, str, str2, new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(final long j, final UB ub, final String str, final String str2, final JSONObject jSONObject) {
        if (ub == null || EYQ(str2)) {
            return;
        }
        EYQ(new com.bytedance.sdk.component.VwS.QQ("sendEvent") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.12
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        jSONObject2.putOpt("log_extra", ub.GfQ());
                        jSONObject.putOpt("ua_policy", Integer.valueOf(ub.FtN()));
                    }
                } catch (Exception unused) {
                }
                new EYQ.C0131EYQ(j, ub).mZx(str).Td(str2).IPb(ub.VOV()).EYQ(ub.Nuq()).EYQ(jSONObject).QQ(ub.ZFP()).EYQ((com.bytedance.sdk.openadsdk.mZx.mZx.EYQ) null);
            }
        });
    }

    public static void EYQ(UB ub, String str, String str2) {
        if (ub == null) {
            return;
        }
        mZx(System.currentTimeMillis(), ub, str, str2);
    }

    public static void EYQ(long j, UB ub, String str, String str2) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("duration", j);
            if (UB.Td(ub)) {
                if (ub.po() != null) {
                    jSONObject2.putOpt("url", ub.po().Td());
                    jSONObject2.putOpt("id", ub.po().EYQ());
                    jSONObject2.putOpt("md5", ub.po().mZx());
                }
                jSONObject2.putOpt(TypedValues.TransitionType.S_FROM, str2);
                if (ub.mN() != null) {
                    jSONObject2.putOpt("render_type", 7);
                }
            } else {
                jSONObject2.put("url", ub.mN().tsL());
                jSONObject2.put("style_id", ub.OUK());
                if (ub.mN() != null) {
                    jSONObject2.putOpt("render_type", 0);
                }
            }
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.mZx(e.getMessage());
        }
        mZx(System.currentTimeMillis(), ub, str, "endcard_feeling_duraion", jSONObject);
    }

    public static void Td(UB ub, String str) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!UB.Td(ub) || ub.po() == null) {
                return;
            }
            jSONObject2.putOpt("url", ub.po().Td());
            jSONObject2.putOpt("id", ub.po().EYQ());
            jSONObject2.putOpt("md5", ub.po().mZx());
            if (ub.mN() != null) {
                jSONObject2.putOpt("render_type", Integer.valueOf(ub.mN().Pm()));
            }
            jSONObject.put("ad_extra_data", jSONObject2.toString());
            mZx(System.currentTimeMillis(), ub, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, jSONObject);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.mZx(e.getMessage());
        }
    }

    public static void EYQ(long j, UB ub, String str) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!UB.Td(ub) || ub.po() == null) {
                return;
            }
            jSONObject2.putOpt("url", ub.po().Td());
            jSONObject2.putOpt("id", ub.po().EYQ());
            jSONObject2.putOpt("md5", ub.po().mZx());
            if (ub.mN() != null) {
                jSONObject2.putOpt("render_type", Integer.valueOf(ub.mN().Pm()));
            }
            jSONObject.put("ad_extra_data", jSONObject2.toString());
            jSONObject.put("duration", j);
            mZx(System.currentTimeMillis(), ub, str, "endcard_close", jSONObject);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.mZx(e.getMessage());
        }
    }

    public static void mZx(UB ub, String str, String str2) throws JSONException {
        if (ub == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("error_msg", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
        } catch (Exception unused) {
        }
        mZx(System.currentTimeMillis(), ub, str, "show_error", jSONObject);
    }

    public static void EYQ(UB ub, String str, String str2, long j, JSONObject jSONObject) {
        if (ub == null || jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("duration", j);
            jSONObject2.put("ad_extra_data", jSONObject.toString());
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AdEvent", e.getMessage());
        }
        mZx(System.currentTimeMillis(), ub, str, str2, jSONObject2);
    }

    public static void mZx(UB ub, String str, String str2, JSONObject jSONObject, long j) {
        if (ub == null || jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_extra_data", jSONObject.toString());
            jSONObject2.put("duration", j);
        } catch (Throwable unused) {
        }
        mZx(System.currentTimeMillis(), ub, str, str2, jSONObject2);
    }

    public static void EYQ(String str, long j) {
        com.bytedance.sdk.openadsdk.core.Pm.Td.EYQ(str, j);
    }

    public static void EYQ(final UB ub, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject) {
        if (ub == null || EYQ(str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        EYQ(new com.bytedance.sdk.component.VwS.QQ("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.13
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                UB ub2;
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data", null);
                        if (strOptString != null) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            jSONObject2.put(t2.h.G, DeviceUtils.Kbd(com.bytedance.sdk.openadsdk.core.hu.EYQ()).toString());
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3) && zF.mZx(ub)) {
                            jSONObject2.put("click_scence", 3);
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            hYh.Td(ub);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - UB.mZx(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.MxO.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ())) && (ub2 = ub) != null) {
                                com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ(com.bytedance.sdk.openadsdk.nWX.EYQ.EYQ(ub2.KR(), true), 2, ub.VOV());
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                new EYQ.C0131EYQ(jCurrentTimeMillis, ub).Pm(str).mZx(str2).Td(str3).IPb(String.valueOf(j)).VwS(String.valueOf(j2)).EYQ(ub.Nuq()).EYQ(jSONObject).QQ(ub.ZFP()).EYQ((com.bytedance.sdk.openadsdk.mZx.mZx.EYQ) null);
            }
        });
    }

    public static void Td(UB ub, String str, String str2, JSONObject jSONObject) {
        if (ub == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        mZx(System.currentTimeMillis(), ub, str, str2, jSONObject);
    }

    public static void mZx(UB ub, String str, JSONObject jSONObject) {
        if (ub == null) {
            return;
        }
        EYQ(ub, str, -1L, jSONObject);
    }

    public static void EYQ(final UB ub, final String str, final long j, final JSONObject jSONObject) {
        if (ub == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        EYQ(new com.bytedance.sdk.component.VwS.QQ("onAppOpenAd") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.2
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 != -1) {
                        jSONObject2.put("duration", j2);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    } else {
                        jSONObject2.put("ad_extra_data", new JSONObject().toString());
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AdEvent", e.getMessage());
                }
                Td.EYQ(jCurrentTimeMillis, ub, "open_ad", str, jSONObject2, (VwS) null, (com.bytedance.sdk.openadsdk.mZx.mZx.EYQ) null);
            }
        });
    }

    public static void EYQ(final com.bytedance.sdk.component.VwS.QQ qq) {
        if (qq == null) {
            return;
        }
        if (xt.Kbd()) {
            com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.Td.3
                @Override // java.lang.Runnable
                public void run() {
                    xt.mZx(qq, 10);
                }
            });
        } else if (!xt.IPb()) {
            xt.mZx(qq, 10);
        } else {
            qq.run();
        }
    }

    public static void mZx() {
        xt.Td(new com.bytedance.sdk.component.VwS.QQ("showFailLog") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AdEvent", th.getMessage());
                }
            }
        });
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyq) throws JSONException {
        if (eyq == null || eyq.mZx() == null) {
            return;
        }
        UB ubMZx = eyq.mZx();
        int iPf = ubMZx.Pf();
        if (iPf == 2 || iPf == 8) {
            JSONObject jSONObject = new JSONObject();
            try {
                int iPm = eyq.Pm();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("count", FH.nWX(com.bytedance.sdk.openadsdk.core.hu.EYQ()));
                jSONObject2.put("interceptor", iPm);
                jSONObject2.put("success", eyq.Kbd());
                jSONObject2.put("link", eyq.EYQ());
                jSONObject2.put("interaction_type", iPf);
                jSONObject2.put("real_interaction_type", eyq.VwS());
                if (eyq.Pm() == 9) {
                    jSONObject2.put("is_act_signals_api_available", eyq.QQ());
                    jSONObject2.put("is_act_signals_callback", eyq.HX());
                }
                if (!TextUtils.isEmpty(eyq.IPb())) {
                    jSONObject2.put("exception_msg", eyq.IPb());
                }
                if (iPm == 2 || iPm == 5) {
                    jSONObject2.put("meta", ubMZx.aEX().toString());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
                mZx(System.currentTimeMillis(), ubMZx, eyq.Td(), "open_browser", jSONObject);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AdEvent", e.getMessage());
            }
        }
    }

    public static void Td(UB ub, String str, JSONObject jSONObject) {
        Pm(ub, "activity_recreate", str, jSONObject);
    }

    /* compiled from: AdEventManager.java */
    public static class EYQ {
        public static void EYQ(final String str, final JSONObject jSONObject, final UB ub) {
            Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("res_hit") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String strEYQ = FH.EYQ(ub);
                        if (strEYQ == null) {
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        Td.mZx(System.currentTimeMillis(), ub, strEYQ + "_landingpage", str, jSONObject2);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.loadEvent error", th);
                    }
                }
            });
        }

        public static void EYQ(final int i, final int i2, final UB ub) {
            Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("res_hit") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.EYQ.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String strEYQ = FH.EYQ(ub);
                        if (strEYQ == null) {
                            return;
                        }
                        String str = strEYQ + "_landingpage";
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("all_times", i2);
                        jSONObject.put("hit_times", i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        Td.mZx(System.currentTimeMillis(), ub, str, "local_res_hit_rate", jSONObject2);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                }
            });
        }

        public static void EYQ(final long j, final UB ub, final String str, final ILoader iLoader, final String str2) {
            Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("page_init") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.EYQ.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (str == null) {
                            return;
                        }
                        int iEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(iLoader, str2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", ub.XPd());
                        jSONObject.put("channel_name", ub.Dd());
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(ub.Dd()) || iEYQ <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iEYQ);
                        jSONObject.put("resource_info", jSONObject2);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("ad_extra_data", jSONObject.toString());
                        jSONObject3.put("duration", j);
                        Td.mZx(System.currentTimeMillis(), ub, str, "landingpage_init", jSONObject3);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                }
            });
        }

        public static void EYQ(final int i, final int i2, final int i3, final int i4, final UB ub, final String str, final int i5) {
            Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("resource_detail") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.EYQ.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (str != null && !TextUtils.isEmpty(ub.Dd())) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("next_url", ub.XPd());
                            jSONObject.put("channel_name", ub.Dd());
                            jSONObject.put("preload_status", i <= 0 ? 0 : 2);
                            jSONObject.put("first_page", i5);
                            jSONObject.put("preload_h5_type", ub.Fw());
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("channel_response", i);
                            jSONObject2.put("failResourceCount", i2);
                            jSONObject2.put("successCount", i3);
                            jSONObject2.put("failCount", i4);
                            jSONObject.put("resource_info", jSONObject2);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("ad_extra_data", jSONObject.toString());
                            Td.mZx(System.currentTimeMillis(), ub, str, "landing_page_resource_detail", jSONObject3);
                        }
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                }
            });
        }
    }

    public static void EYQ(UB ub, String str, int i, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        mZx(ub, str, "open_ad_land_page_links", jSONObject);
    }

    public static void mZx(UB ub, String str, int i, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        mZx(ub, str, "download_app_ad_track", jSONObject);
    }

    public static void EYQ(final UB ub, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i) {
        EYQ(new com.bytedance.sdk.component.VwS.QQ("start_show_endcard") { // from class: com.bytedance.sdk.openadsdk.mZx.Td.5
            @Override // java.lang.Runnable
            public void run() {
                if (ub == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isSkip", z);
                    jSONObject2.put("force", z2);
                    jSONObject2.put("isFromLandingPage", z3);
                    jSONObject2.put("finishing", z4);
                    jSONObject2.put(TypedValues.TransitionType.S_FROM, i);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                Td.mZx(System.currentTimeMillis(), ub, str, "start_show_endcard", jSONObject);
            }
        });
    }

    public static void EYQ(UB ub, String str, String str2, long j, String str3, String str4, int i, String str5) throws JSONException {
        UB.EYQ eyqPI;
        JSONObject jSONObject = new JSONObject();
        char c = 65535;
        try {
            int iHashCode = str4.hashCode();
            if (iHashCode != -1606803861) {
                if (iHashCode == 3107 && str4.equals("ad")) {
                    c = 1;
                }
            } else if (str4.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                c = 0;
            }
            if (c == 0) {
                com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ eyqPo = ub.po();
                if (eyqPo != null) {
                    jSONObject.putOpt("url", eyqPo.Td());
                    jSONObject.putOpt("id", eyqPo.EYQ());
                    jSONObject.putOpt("md5", eyqPo.mZx());
                }
            } else if (c == 1 && (eyqPI = ub.PI()) != null) {
                jSONObject.putOpt("url", eyqPI.nWX());
                jSONObject.putOpt("id", eyqPI.Kbd());
                jSONObject.putOpt("md5", eyqPI.KO());
            }
            jSONObject.put("status", str2);
            jSONObject.put(TypedValues.TransitionType.S_FROM, str3);
            jSONObject.put("scene", str4);
            if (t2.f.e.equals(str2)) {
                jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i);
                jSONObject.put("error_msg", str5);
            }
        } catch (Throwable unused) {
        }
        EYQ(ub, str, "load_ugen_template", jSONObject, j);
    }

    private static boolean EYQ(String str) {
        int iXt = com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().xt(str);
        if (iXt == 0) {
            return true;
        }
        if (iXt != 100) {
            return ((int) ((Math.random() * 100.0d) + 1.0d)) > iXt;
        }
        return false;
    }
}
