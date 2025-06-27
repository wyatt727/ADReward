package com.bytedance.sdk.component.IPb.Td;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TNCConfigHandler.java */
/* loaded from: classes2.dex */
public class Pm {
    private static final Object Pm = new Object();
    private Context EYQ;
    private int Kbd;
    private boolean Td;
    private Td mZx = new Td();

    public Pm(Context context, boolean z, int i) {
        this.Td = true;
        this.EYQ = context;
        this.Td = z;
        this.Kbd = i;
    }

    public void EYQ(JSONObject jSONObject) {
        if (this.Td) {
            VwS.EYQ().EYQ(this.Kbd).Kbd();
            try {
                try {
                    boolean z = jSONObject.optInt("ttnet_url_dispatcher_enabled", 0) > 0;
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ttnet_dispatch_actions");
                    JSONObject jSONObject2 = null;
                    if (VwS.EYQ().EYQ(this.Kbd).Td() && z && jSONArrayOptJSONArray != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            JSONObject jSONObject3 = ((JSONObject) jSONArrayOptJSONArray.get(i)).getJSONObject("param");
                            if (jSONObject3.optString("service_name", "").equals("idc_selection")) {
                                arrayList.add(jSONObject3.getJSONObject("strategy_info"));
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            jSONObject2 = new JSONObject();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                JSONObject jSONObject4 = (JSONObject) it.next();
                                Iterator<String> itKeys = jSONObject4.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject2.put(next, jSONObject4.getString(next));
                                }
                            }
                        }
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tnc_config");
                    if (jSONObjectOptJSONObject != null || jSONObject2 != null) {
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                            jSONObjectOptJSONObject.put("host_replace_map", jSONObject2);
                        } else if (jSONObject2 != null) {
                            jSONObjectOptJSONObject.put("host_replace_map", jSONObject2);
                        }
                    }
                    Td tdMZx = mZx(jSONObjectOptJSONObject);
                    if (tdMZx != null) {
                        tdMZx.toString();
                    }
                    if (tdMZx == null) {
                        synchronized (Pm) {
                            this.EYQ.getSharedPreferences(VwS.EYQ().EYQ(this.Kbd).EYQ(), 0).edit().putString("tnc_config_str", "").apply();
                            com.bytedance.sdk.component.IPb.Pm.Pm.EYQ(this.EYQ, 1, "", this.Kbd);
                        }
                    } else {
                        this.mZx = tdMZx;
                        String string = jSONObjectOptJSONObject.toString();
                        synchronized (Pm) {
                            this.EYQ.getSharedPreferences(VwS.EYQ().EYQ(this.Kbd).EYQ(), 0).edit().putString("tnc_config_str", string).apply();
                            com.bytedance.sdk.component.IPb.Pm.Pm.EYQ(this.EYQ, 1, string, this.Kbd);
                        }
                    }
                } catch (Throwable unused) {
                    this.mZx = new Td();
                    synchronized (Pm) {
                        this.EYQ.getSharedPreferences(VwS.EYQ().EYQ(this.Kbd).EYQ(), 0).edit().putString("tnc_config_str", "").apply();
                        com.bytedance.sdk.component.IPb.Pm.Pm.EYQ(this.EYQ, 1, "", this.Kbd);
                    }
                }
            } catch (Throwable th) {
                synchronized (Pm) {
                    this.EYQ.getSharedPreferences(VwS.EYQ().EYQ(this.Kbd).EYQ(), 0).edit().putString("tnc_config_str", "").apply();
                    com.bytedance.sdk.component.IPb.Pm.Pm.EYQ(this.EYQ, 1, "", this.Kbd);
                    throw th;
                }
            }
        }
    }

    public void EYQ() {
        if (this.Td) {
            String string = this.EYQ.getSharedPreferences(VwS.EYQ().EYQ(this.Kbd).EYQ(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                Td tdMZx = mZx(new JSONObject(string));
                if (tdMZx != null) {
                    this.mZx = tdMZx;
                }
                if (tdMZx == null) {
                    return;
                }
                tdMZx.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void mZx() {
        try {
            String strEYQ = com.bytedance.sdk.component.IPb.Pm.Pm.EYQ(this.EYQ, 1, this.Kbd);
            if (TextUtils.isEmpty(strEYQ)) {
                return;
            }
            Td tdMZx = mZx(new JSONObject(strEYQ));
            if (tdMZx != null) {
                tdMZx.toString();
            }
            if (tdMZx != null) {
                this.mZx = tdMZx;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public Td Td() {
        return this.mZx;
    }

    private Td mZx(JSONObject jSONObject) {
        try {
            Td td = new Td();
            if (jSONObject.has("local_enable")) {
                td.EYQ = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                td.mZx = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap map = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(string, 0);
                        }
                    }
                }
                td.Td = map;
            } else {
                td.Td = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap map2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            map2.put(next, string2);
                        }
                    }
                }
                td.Pm = map2;
            } else {
                td.Pm = null;
            }
            td.Kbd = jSONObject.optInt("req_to_cnt", td.Kbd);
            td.IPb = jSONObject.optInt("req_to_api_cnt", td.IPb);
            td.VwS = jSONObject.optInt("req_to_ip_cnt", td.VwS);
            td.QQ = jSONObject.optInt("req_err_cnt", td.QQ);
            td.HX = jSONObject.optInt("req_err_api_cnt", td.HX);
            td.tp = jSONObject.optInt("req_err_ip_cnt", td.tp);
            td.MxO = jSONObject.optInt("update_interval", td.MxO);
            td.tsL = jSONObject.optInt("update_random_range", td.tsL);
            td.pi = jSONObject.optString("http_code_black", td.pi);
            return td;
        } catch (Throwable unused) {
            return null;
        }
    }
}
