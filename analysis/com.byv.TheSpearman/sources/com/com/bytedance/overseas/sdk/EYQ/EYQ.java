package com.com.bytedance.overseas.sdk.EYQ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.MxO;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AndroidRGPDownLoader.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx {
    public EYQ(Context context, UB ub, String str) {
        super(context, ub, str);
    }

    @Override // com.com.bytedance.overseas.sdk.EYQ.mZx, com.com.bytedance.overseas.sdk.EYQ.Td
    public boolean EYQ() {
        if (this.EYQ == null) {
            return false;
        }
        HashMap map = null;
        if (this.mZx != null && this.mZx.CE() == 0) {
            map = new HashMap();
            map.put("dpl_probability_jump", Boolean.valueOf(this.VwS >= 11));
        }
        return EYQ(this.mZx, this.EYQ.Td(), Td(), this.Td, map);
    }

    public static boolean EYQ(UB ub, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentEYQ;
        if (ub != null && ub.Ko() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentEYQ = FH.EYQ(context, str)) == null) {
                return false;
            }
            intentEYQ.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentEYQ.addFlags(268435456);
            }
            context.startActivity(intentEYQ);
            if (map == null) {
                map = new HashMap<>();
            }
            EYQ(ub, map);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private static void EYQ(UB ub, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (ub != null && ub.CE() == 0) {
            map.put("auto_click", Boolean.valueOf((ub == null || ub.Td()) ? false : true));
        }
        map.put("can_query_install", 0);
    }

    @Override // com.com.bytedance.overseas.sdk.EYQ.mZx
    public boolean mZx() throws JSONException {
        com.bytedance.sdk.openadsdk.core.Pm.EYQ(this.mZx, this.Td, 1, null);
        if (this.mZx.dVQ() != null) {
            HashMap map = new HashMap();
            if (this.mZx != null && this.mZx.CE() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(this.VwS >= 11));
            }
            if (EYQ(this.mZx.dVQ().EYQ(), Td(), this.Td, this.mZx, map)) {
                return true;
            }
            if (!this.Pm || this.IPb.get()) {
                this.Pm = true;
                EYQ(this.mZx, map);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.mZx, this.Td, "open_fallback_url", map);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.Pm.EYQ(this.mZx, this.Td, -1, null);
        }
        return false;
    }

    public static boolean EYQ(String str, Context context, String str2, UB ub, Map<String, Object> map) throws JSONException {
        Intent intent = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!TextUtils.isEmpty(str)) {
            Uri uri = Uri.parse(str);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            try {
                intent2.setData(uri);
                if (!(context instanceof Activity)) {
                    intent2.addFlags(268435456);
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                EYQ(ub, map);
                map.put("url", str);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str2, "open_url_app", map);
                context.startActivity(intent2);
                MxO.EYQ().EYQ(map).EYQ(ub, str2);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ("dp_start_act_success", ub, str2, map);
                return true;
            } catch (Throwable th2) {
                th = th2;
                intent = intent2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("exception", th.getMessage());
                    if (intent != null) {
                        jSONObject.put("intent", intent.toString());
                    }
                    jSONObject.put("can_query_install", 0);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.Pm.EYQ(ub, str2, -4, jSONObject);
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.Pm.EYQ(ub, str2, -2, null);
        return false;
    }
}
