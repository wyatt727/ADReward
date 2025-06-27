package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsConfiglInfo.java */
/* loaded from: classes2.dex */
public class IPb {
    public static final IPb EYQ = new IPb(null);
    public static String mZx = "";
    public boolean IPb;
    public boolean Kbd;
    public boolean Pm;
    public String Td;

    public IPb(String str) {
        this.Td = "https://lf3-cdn-tos.bytegoofy.com/obj/goofy/bytecom/resource/tetrisIAB/3p_monitor.2424fa46.js";
        this.Pm = true;
        this.Kbd = true;
        this.IPb = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf3-cdn-tos.bytegoofy.com/obj/goofy/bytecom/resource/tetrisIAB/3p_monitor.2424fa46.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.Td = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            this.Pm = arrayList.contains("load_finish");
            this.IPb = arrayList.contains("load_fail");
            this.Kbd = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
