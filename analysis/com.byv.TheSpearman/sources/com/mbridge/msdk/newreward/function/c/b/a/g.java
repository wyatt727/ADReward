package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RequestControllerReceiver.java */
/* loaded from: classes4.dex */
public final class g implements com.mbridge.msdk.newreward.function.c.b.d {
    public final Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
        long jLongValue = ((Long) map.get("last_response_empty_time")).longValue();
        if (eVar == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(eVar.C()) && eVar.r() != null && eVar.r().b() != null) {
            if (System.currentTimeMillis() - jLongValue < eVar.r().b().a() * 1000) {
                map2.put(AndroidBridgeConstants.ERROR_CODE, "-1");
                map2.put(NotificationCompat.CATEGORY_MESSAGE, "EXCEPTION_RETURN_EMPTY");
                return map2;
            }
        }
        com.mbridge.msdk.foundation.same.net.k kVarA = com.mbridge.msdk.foundation.same.net.g.c.a().a(eVar.v(), eVar.A(), eVar.w(), eVar.C(), eVar.p() + "");
        if (kVarA != null) {
            try {
                JSONObject jSONObject = new JSONObject(kVarA.c.toString());
                jSONObject.optInt("status");
                jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                map2.put(AndroidBridgeConstants.ERROR_CODE, jSONObject.optInt("status") + "");
                map2.put(NotificationCompat.CATEGORY_MESSAGE, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            } catch (JSONException e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
        return map2;
    }
}
