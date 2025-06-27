package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.NZ;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.XN;
import com.json.i5;
import com.json.t2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsFetchTask.java */
/* loaded from: classes2.dex */
public class pi extends com.bytedance.sdk.component.VwS.QQ {
    private final EYQ EYQ;
    private final Pm Td;
    private final tsL mZx;

    /* compiled from: SettingsFetchTask.java */
    public interface EYQ {
        void EYQ(boolean z);
    }

    public pi(EYQ eyq, tsL tsl, Pm pm) {
        super("SetF");
        this.EYQ = eyq;
        this.mZx = tsl;
        this.Td = pm;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iEYQ = NZ.EYQ(hu.EYQ(), 0L);
        if (iEYQ == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.EYQ.EYQ(false);
            return;
        }
        final com.bytedance.sdk.openadsdk.tp.EYQ.Pm pm = new com.bytedance.sdk.openadsdk.tp.EYQ.Pm(1);
        JSONObject jSONObjectEYQ = EYQ(iEYQ);
        com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
        try {
            String strEYQ = com.bytedance.sdk.openadsdk.Kbd.Pm.EYQ(pmMZx, FH.Pm("/api/ad/union/sdk/settings/"));
            pmMZx.EYQ(strEYQ);
            pmMZx.mZx("User-Agent", FH.Td());
            pm.EYQ(strEYQ);
        } catch (Exception unused) {
        }
        String string = mZx(jSONObjectEYQ).toString();
        if (hu.Pm().TQF() && com.bytedance.sdk.openadsdk.core.NZ.EYQ().VwS() == 1) {
            FH.EYQ("Pangle_Debug_Mode", string, hu.EYQ());
        }
        pmMZx.EYQ(string, hu.Pm().Uc());
        pm.EYQ(pmMZx.Td()).EYQ();
        pmMZx.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.settings.pi.1
            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                JSONObject jSONObject;
                int iOptInt;
                int iEYQ2 = mzx.EYQ();
                String strPm = mzx.Pm();
                if (hu.Pm().TQF() && com.bytedance.sdk.openadsdk.core.NZ.EYQ().VwS() == 1) {
                    FH.EYQ("Pangle_Debug_Mode", strPm, hu.EYQ());
                }
                if (mzx.IPb() && !TextUtils.isEmpty(strPm)) {
                    pm.Td(strPm).EYQ(iEYQ2).EYQ(true).Td();
                    String strTd = null;
                    try {
                        jSONObject = new JSONObject(strPm);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null && (iOptInt = jSONObject.optInt("cypher", -1)) != -1) {
                        if (iOptInt == 3) {
                            strTd = com.bytedance.sdk.component.utils.EYQ.Td(jSONObject.optString("message"));
                            if (!TextUtils.isEmpty(strTd)) {
                                try {
                                    jSONObject = new JSONObject(strTd);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            pi.this.EYQ(strTd, mzx.Td());
                        } catch (Throwable unused4) {
                        }
                        try {
                            pi.this.EYQ(jSONObject);
                            hu.Pm().EYQ(System.currentTimeMillis());
                        } catch (Throwable unused5) {
                        }
                        pi.this.EYQ.EYQ(true);
                        com.bytedance.sdk.openadsdk.core.IPb.EYQ.EYQ();
                        return;
                    }
                }
                pm.Td(strPm).EYQ(iEYQ2).Pm(mzx.mZx()).EYQ(mzx.IPb()).Td();
                pi.this.EYQ.EYQ(false);
            }

            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                pm.Pm(iOException != null ? iOException.getMessage() : null).EYQ(false).Td();
                pi.this.EYQ.EYQ(false);
                com.bytedance.sdk.openadsdk.core.IPb.EYQ.EYQ();
            }
        });
        DeviceUtils.MxO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                int i2 = Integer.parseInt((String) map2.get("active-control"));
                long j = Long.parseLong((String) map2.get("ts"));
                String str2 = (String) map2.get("pst");
                String strEYQ = com.bykv.vk.openvk.component.video.api.IPb.mZx.EYQ(str + i2 + j);
                if (strEYQ != null) {
                    if (strEYQ.equalsIgnoreCase(str2)) {
                        i = i2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        MxO.EYQ(i);
    }

    private JSONObject EYQ(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            Kbd kbdPm = hu.Pm();
            jSONObject.put(i5.u, Build.MODEL);
            jSONObject.put("device_city", FH.KO());
            if (kbdPm.lEs(i5.w0)) {
                jSONObject.put(i5.w0, com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ().mZx());
            }
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.QQ.mZx().QQ());
            jSONObject.put("coppa", com.bytedance.sdk.openadsdk.core.QQ.mZx().VwS());
            jSONObject.put("ccpa", com.bytedance.sdk.openadsdk.core.QQ.mZx().zF());
            if (kbdPm.lEs("mcc")) {
                jSONObject.put("mcc", XN.mZx());
            }
            Context contextEYQ = hu.EYQ();
            jSONObject.put("conn_type", FH.VwS(i));
            int i2 = 1;
            jSONObject.put(i5.x, 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.MxO.EYQ());
            jSONObject.put("time_zone", FH.Uc());
            jSONObject.put("package_name", FH.Kbd());
            if (!FH.EYQ()) {
                i2 = 2;
            }
            jSONObject.put(t2.h.L, i2);
            jSONObject.put("app_version", FH.VwS());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.MxO.Td(contextEYQ));
            String strPm = com.bytedance.sdk.openadsdk.core.QQ.mZx().Pm();
            if (strPm != null) {
                jSONObject.put("app_id", strPm);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.Kbd.EYQ(strPm != null ? strPm.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME) : ""));
            jSONObject.put("tcstring", KO.Td(contextEYQ));
            jSONObject.put("tcf_gdpr", KO.mZx(contextEYQ));
            jSONObject.put("lmt", DeviceUtils.Td());
            jSONObject.put("locale_language", DeviceUtils.Pm());
            jSONObject.put("channel", t2.h.Z);
            JSONObject jSONObjectKbd = kbdPm.Kbd();
            if (jSONObjectKbd != null) {
                jSONObject.put("digest", jSONObjectKbd);
            }
            jSONObject.put("data_time", kbdPm.IPb());
            jSONObject.put("app_set_id_scope", Td.mZx());
            jSONObject.put("app_set_id", Td.Td());
            jSONObject.put("installed_source", Td.Pm());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private JSONObject mZx(JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject);
    }

    public boolean EYQ(JSONObject jSONObject) {
        this.mZx.EYQ(jSONObject);
        this.Td.EYQ(jSONObject);
        return this.mZx.Td;
    }

    public static boolean EYQ() {
        return BinderPoolService.EYQ;
    }
}
