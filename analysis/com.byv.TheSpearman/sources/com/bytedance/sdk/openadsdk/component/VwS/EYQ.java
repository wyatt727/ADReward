package com.bytedance.sdk.openadsdk.component.VwS;

import android.content.Context;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.IPb;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.multipro.mZx;
import com.bytedance.sdk.openadsdk.utils.HX;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenUtils.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static File EYQ(String str) {
        return new File(CacheDirFactory.getICacheDir(0).mZx() + File.separator + str);
    }

    public static String EYQ() {
        return HX.EYQ();
    }

    public static File mZx(String str) {
        return EYQ(hu.EYQ(), IPb.EYQ(hu.EYQ()).mZx(), str);
    }

    public static File EYQ(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.IPb.EYQ(context, mZx.Td(), str, str2);
    }

    public static void EYQ(File file) {
        if (file == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.utils.IPb.mZx(file);
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(Context context) {
        try {
            IPb.EYQ(context).EYQ();
        } catch (Throwable unused) {
        }
    }

    public static String mZx() {
        return com.bytedance.sdk.component.utils.IPb.EYQ(hu.EYQ(), mZx.Td(), IPb.EYQ(hu.EYQ()).mZx()).getAbsolutePath();
    }

    public static void EYQ(JSONObject jSONObject, int i) throws JSONException {
        try {
            String strKbd = QQ.mZx().Kbd();
            int iIPb = QQ.mZx().IPb();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", strKbd);
            jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iIPb)));
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", hu.Pm().WU(String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e) {
            pi.EYQ("TTAppOpenUtils", e.getMessage());
        }
    }

    public static int EYQ(UB ub, int i) {
        return i - ub.qxY();
    }
}
