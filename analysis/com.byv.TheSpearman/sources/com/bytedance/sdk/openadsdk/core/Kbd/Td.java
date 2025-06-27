package com.bytedance.sdk.openadsdk.core.Kbd;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.Kbd;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.hu;
import com.json.ra;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SecSdkHelperUtil.java */
/* loaded from: classes2.dex */
public class Td {
    private static boolean EYQ = false;

    public static void EYQ() {
        if (!EYQ && hu.Pm().KR()) {
            mZx.EYQ();
            EYQ = mZx.EYQ().mZx();
        }
    }

    public static void EYQ(String str) {
        if (TextUtils.isEmpty(str) && hu.Pm().KR()) {
            mZx.EYQ().EYQ(str);
        }
    }

    public static void mZx(String str) {
        if (TextUtils.isEmpty(str) || !hu.Pm().KR()) {
            return;
        }
        mZx.EYQ().mZx(str);
    }

    public static void mZx() {
        if (hu.Pm().KR()) {
            mZx.EYQ().Td("AdShow");
        }
    }

    public static Map<String, String> EYQ(String str, String str2) {
        if (hu.Pm().KR()) {
            return mZx.EYQ().EYQ(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static String Td() {
        return hu.Pm().KR() ? mZx.EYQ().Pm() : "";
    }

    public static int Pm() {
        if (hu.Pm().KR()) {
            return mZx.EYQ().Kbd();
        }
        return 6;
    }

    public static void EYQ(MotionEvent motionEvent) {
        if (hu.Pm().KR()) {
            mZx.EYQ().EYQ(motionEvent);
        }
    }

    public static void EYQ(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            if (hu.Pm().KR()) {
                EYQ();
                if (Pm() == 0) {
                    jSONObject.put("sec_did", mZx.EYQ().Td());
                    String strEYQ = Kbd.EYQ(jSONObject.toString());
                    Map<String, String> mapEYQ = mZx.EYQ().EYQ("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strEYQ != null ? strEYQ.getBytes() : new byte[0]);
                    if (mapEYQ != null && mapEYQ.size() > 0) {
                        for (String str : mapEYQ.keySet()) {
                            jSONObject.put(str, mapEYQ.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strEYQ);
                        return;
                    }
                    jSONObject.put("pglx", "8");
                    return;
                }
                jSONObject.put("pglx", String.valueOf(Pm()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            pi.EYQ("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", ra.e);
            } catch (JSONException unused) {
            }
        }
    }

    public static String Kbd() {
        if (hu.Pm().KR()) {
            return mZx.EYQ().Td();
        }
        return null;
    }
}
