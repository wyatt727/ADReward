package com.bytedance.sdk.openadsdk.core.ugen;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UgenUtils.java */
/* loaded from: classes2.dex */
public class Td {
    public static JSONObject EYQ(UB ub, String str) {
        JSONObject jSONObjectAEX = ub.aEX();
        try {
            jSONObjectAEX.put("show_dislike", ub.BQ());
            jSONObjectAEX.put("language", MxO.EYQ());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strKbd = QQ.mZx().Kbd();
                int iIPb = QQ.mZx().IPb();
                jSONObject.put("app_name", strKbd);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iIPb)));
                jSONObjectAEX.put("open_app_info", jSONObject);
            }
        } catch (Throwable th) {
            pi.EYQ("UgenUtils", "parseUGenDataInfo excaption", th.getMessage());
        }
        return jSONObjectAEX;
    }

    public static boolean EYQ(UB ub) {
        return ub != null && ub.NZ() == 7;
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    public static JSONObject EYQ(UB ub, com.bytedance.sdk.openadsdk.core.ugen.Pm.mZx mzx) {
        JSONObject jSONObject;
        mzx.EYQ();
        JSONObject jSONObject2 = null;
        try {
            UB.EYQ eyqPI = ub.PI();
            String strHu = ub.PI() != null ? eyqPI.hu() : "";
            if (TextUtils.isEmpty(strHu) && !TextUtils.isEmpty(eyqPI.KO()) && !TextUtils.isEmpty(eyqPI.Kbd())) {
                strHu = com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ().EYQ("ad", eyqPI.Kbd(), eyqPI.KO());
            }
            ?? IsEmpty = TextUtils.isEmpty(strHu);
            try {
                if (IsEmpty == 0) {
                    try {
                        jSONObject = new JSONObject(strHu);
                    } catch (JSONException unused) {
                    }
                    try {
                        mzx.EYQ("local");
                        return jSONObject;
                    } catch (JSONException unused2) {
                        mzx.EYQ(2, "parse json exception data is ".concat(String.valueOf(strHu)), "local");
                        return null;
                    }
                }
                mzx.EYQ(3, "local data is null", "local");
                return null;
            } catch (Throwable th) {
                jSONObject2 = IsEmpty;
                th = th;
                mzx.EYQ(2, "get template error " + th.getMessage(), "local");
                return jSONObject2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
