package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.settings.Kbd;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.json.i5;
import com.json.t2;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ApmHelper {
    private static boolean EYQ = false;
    private static EYQ IPb = null;
    private static mZx Kbd = null;
    private static boolean Pm = false;
    private static boolean Td;
    private static String mZx;

    private interface mZx {
        void EYQ(String str, String str2, Throwable th);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        xt.EYQ(new QQ("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (ApmHelper.EYQ) {
                    return;
                }
                Kbd kbdPm = hu.Pm();
                boolean unused = ApmHelper.Td = kbdPm.wa();
                if (!ApmHelper.Td || TextUtils.isEmpty(kbdPm.kf())) {
                    return;
                }
                String unused2 = ApmHelper.mZx = initConfig.getAppId();
                String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                String strEYQ = MxO.EYQ(context);
                String strKf = kbdPm.kf();
                try {
                    final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 5906L, BuildConfig.VERSION_NAME, strArr);
                    monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                        @Override // com.apm.insight.AttachUserData
                        public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                            Map<? extends String, ? extends String> mapHX = ApmHelper.HX();
                            if (mapHX.containsKey("render_type")) {
                                monitorCrashInitSDK.addTags("render_type", mapHX.get("render_type"));
                            } else {
                                monitorCrashInitSDK.addTags("render_type", "-2");
                            }
                            return mapHX;
                        }
                    });
                    if (kbdPm.XL()) {
                        monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so"});
                    }
                    monitorCrashInitSDK.config().setDeviceId(strEYQ);
                    monitorCrashInitSDK.setReportUrl(strKf);
                    monitorCrashInitSDK.addTags("host_appid", ApmHelper.mZx);
                    monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                    monitorCrashInitSDK.config().setChannel(ApmHelper.tp());
                    mZx unused3 = ApmHelper.Kbd = new mZx() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                        @Override // com.bytedance.sdk.openadsdk.ApmHelper.mZx
                        public void EYQ(String str, String str2, Throwable th) {
                            monitorCrashInitSDK.reportCustomErr(str, str2, th);
                        }
                    };
                    boolean unused4 = ApmHelper.EYQ = true;
                    ApmHelper.Td(strEYQ, strKf);
                    monitorCrashInitSDK.registerCrashCallback(new ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                        @Override // com.apm.insight.ICrashCallback
                        public void onCrash(CrashType crashType, String str, Thread thread) {
                            if (!ApmHelper.Pm) {
                                ApmHelper.Pm(crashType.getName());
                            }
                            boolean unused5 = ApmHelper.Pm = true;
                        }
                    }, CrashType.ALL);
                    EYQ eyq = ApmHelper.IPb;
                    EYQ unused5 = ApmHelper.IPb = null;
                    if (eyq != null) {
                        ApmHelper.Kbd.EYQ(eyq.EYQ, eyq.mZx, eyq.Td);
                    }
                } catch (Throwable unused6) {
                    boolean unused7 = ApmHelper.EYQ = false;
                }
            }
        });
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        mZx mzx = Kbd;
        if (mzx != null) {
            mzx.EYQ(str, str2, th);
        } else {
            IPb = new EYQ(str, str2, th);
        }
    }

    private static class EYQ {
        public final String EYQ;
        public final Throwable Td;
        public final String mZx;

        public EYQ(String str, String str2, Throwable th) {
            this.EYQ = str;
            this.mZx = str2;
            this.Td = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> HX() {
        HashMap map = new HashMap();
        UB ubEYQ = com.bytedance.sdk.openadsdk.utils.mZx.EYQ();
        if (ubEYQ != null) {
            map.put("adType", String.valueOf(ubEYQ.Yd()));
            map.put("aid", String.valueOf(ubEYQ.VM()));
            map.put("cid", ubEYQ.VOV());
            map.put("reqId", ubEYQ.ZFP());
            map.put("rit", ubEYQ.wBa("-1"));
            int iNZ = ubEYQ.NZ();
            if (ubEYQ.zF() != 2) {
                iNZ = -1;
            }
            map.put("render_type", String.valueOf(iNZ));
        }
        return map;
    }

    private static void mZx(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        hu.Td().EYQ(Td(str), "https://" + str2 + "/monitor/collect/c/session?version_code=5906&device_platform=android&aid=10000001");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Td(String str, String str2) throws JSONException {
        mZx(str, str2);
    }

    public static void reportPvFromBackGround() throws JSONException {
        if (Td) {
            mZx(MxO.EYQ(hu.EYQ()), hu.Pm().kf());
        }
    }

    private static JSONObject Td(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", mZx);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put(i5.x, t2.e);
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", tp());
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e) {
            pi.EYQ("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }

    public static boolean isIsInit() {
        return EYQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Pm(final String str) {
        final UB ubEYQ = com.bytedance.sdk.openadsdk.utils.mZx.EYQ();
        if (ubEYQ != null) {
            String strEYQ = FH.EYQ(ubEYQ);
            if (TextUtils.isEmpty(strEYQ)) {
                return;
            }
            Td.EYQ(System.currentTimeMillis(), ubEYQ, strEYQ, "sdk_crash_info", new JSONObject(), (VwS) null, new com.bytedance.sdk.openadsdk.mZx.mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.mZx.mZx.EYQ
                public void EYQ(JSONObject jSONObject) throws JSONException {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", str);
                    jSONObject2.put("material", com.bytedance.sdk.component.utils.EYQ.EYQ(ubEYQ.aEX()).toString());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String tp() {
        Kbd kbdPm = hu.Pm();
        return kbdPm != null ? kbdPm.pi() ? "support_mem_dynamic_1" : "support_mem_dynamic_0" : "release";
    }
}
