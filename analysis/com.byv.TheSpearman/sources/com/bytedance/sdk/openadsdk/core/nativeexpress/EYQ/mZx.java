package com.bytedance.sdk.openadsdk.core.nativeexpress.EYQ;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.EYQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.Uc;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TemplateUtils.java */
/* loaded from: classes2.dex */
public class mZx {
    public static boolean EYQ() {
        return true;
    }

    public static JSONObject EYQ(float f, float f2, boolean z, UB ub) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            if ((ub instanceof Uc) && ((Uc) ub).oFG()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("choose_ui_data", jSONObject3);
                EYQ.C0119EYQ c0119eyqFd = ((Uc) ub).Fd();
                JSONObject jSONObjectMZx = c0119eyqFd.mZx();
                if (TextUtils.isEmpty(c0119eyqFd.QQ())) {
                    jSONObjectMZx.put("data", mZx(c0119eyqFd));
                }
                jSONObject3.put("tpl_info", jSONObjectMZx);
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("creatives", jSONArray);
                for (UB ub2 : ((Uc) ub).gR()) {
                    JSONObject jSONObjectEYQ = EYQ(false, ub2);
                    if (jSONObjectEYQ != null) {
                        jSONObjectEYQ.put("template_Plugin", mZx(ub2.PI()));
                        jSONObjectEYQ.put("diff_template_Plugin", EYQ(ub2.PI()));
                        jSONArray.put(jSONObjectEYQ);
                    }
                }
                return jSONObject;
            }
            jSONObject.put("creative", EYQ(false, ub));
            jSONObject.put("template_Plugin", mZx(ub.PI()));
            jSONObject.put("diff_template_Plugin", EYQ(ub.PI()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String EYQ(UB.EYQ eyq) {
        return eyq != null ? eyq.HX() : "";
    }

    private static String mZx(UB.EYQ eyq) {
        com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzxTd;
        if (eyq == null) {
            return "";
        }
        String strQQ = eyq.QQ();
        return (!TextUtils.isEmpty(strQQ) || (mzxTd = com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.Td(eyq.Kbd())) == null) ? strQQ : mzxTd.Kbd();
    }

    public static JSONObject EYQ(boolean z, UB ub) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", ub.TZn());
            if (ub.vD() != null) {
                if (ub.vD() != null && !TextUtils.isEmpty(ub.vD().EYQ())) {
                    jSONObject.put("icon", ub.vD().EYQ());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (ub.Dal() != null) {
                for (int i = 0; i < ub.Dal().size(); i++) {
                    nWX nwx = ub.Dal().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", nwx.Td());
                    jSONObject2.put("width", nwx.mZx());
                    jSONObject2.put("url", nwx.EYQ());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", ub.by());
            jSONObject.put("interaction_type", ub.Pf());
            jSONObject.put("interaction_method", ub.KO());
            jSONObject.put("is_compliance_template", EYQ());
            jSONObject.put("title", ub.TQF());
            jSONObject.put("description", ub.OtA());
            jSONObject.put(FirebaseAnalytics.Param.SOURCE, ub.Kbc());
            if (ub.xh() != null) {
                jSONObject.put("comment_num", ub.xh().Kbd());
                jSONObject.put(FirebaseAnalytics.Param.SCORE, ub.xh().Pm());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, ub.xh().IPb());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, ub.xh().QQ());
            }
            com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = ub.mN();
            if (mzxMN != null) {
                JSONObject jSONObjectUc = mzxMN.Uc();
                jSONObjectUc.put("video_duration", mzxMN.IPb() * mzxMN.XN());
                jSONObject.put("video", jSONObjectUc);
            }
            if (ub.PI() != null) {
                jSONObject.put("dynamic_creative", ub.PI().tp());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String EYQ(UB ub, String str) {
        List<nWX> listDal;
        if (ub != null && (listDal = ub.Dal()) != null && listDal.size() > 0) {
            for (nWX nwx : listDal) {
                if (nwx != null && TextUtils.equals(str, nwx.EYQ())) {
                    return nwx.VwS();
                }
            }
        }
        return null;
    }

    public static Map<String, String> EYQ(UB ub) {
        HashMap map = null;
        if (ub == null) {
            return null;
        }
        List<nWX> listDal = ub.Dal();
        if (listDal != null && listDal.size() > 0) {
            map = new HashMap();
            for (nWX nwx : listDal) {
                if (nwx != null) {
                    map.put(nwx.EYQ(), nwx.VwS());
                }
            }
        }
        return map;
    }
}
