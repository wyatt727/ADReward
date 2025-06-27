package com.bytedance.sdk.openadsdk.tsL;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.json.i5;
import com.json.t2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PlayableJsBridge.java */
/* loaded from: classes2.dex */
public class IPb {
    private Context EYQ;
    private WeakReference<QQ> mZx;
    private Map<String, EYQ> Td = new HashMap();
    private SensorEventListener Pm = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            QQ qqPm;
            if (sensorEvent.sensor.getType() != 1 || (qqPm = IPb.this.Pm()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                qqPm.EYQ("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener Kbd = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            QQ qqPm;
            if (sensorEvent.sensor.getType() != 4 || (qqPm = IPb.this.Pm()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                qqPm.EYQ("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener IPb = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            QQ qqPm;
            if (sensorEvent.sensor.getType() != 10 || (qqPm = IPb.this.Pm()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                qqPm.EYQ("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener VwS = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                System.arraycopy(sensorEvent.values, 0, tp.mZx, 0, tp.mZx.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                System.arraycopy(sensorEvent.values, 0, tp.Td, 0, tp.Td.length);
            }
            SensorManager.getRotationMatrix(tp.Pm, null, tp.mZx, tp.Td);
            SensorManager.getOrientation(tp.Pm, tp.Kbd);
            QQ qqPm = IPb.this.Pm();
            if (qqPm == null) {
                return;
            }
            float f = tp.Kbd[0];
            float f2 = tp.Kbd[1];
            float f3 = tp.Kbd[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                qqPm.EYQ("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* compiled from: PlayableJsBridge.java */
    interface EYQ {
        JSONObject EYQ(JSONObject jSONObject) throws Throwable;
    }

    public IPb(QQ qq) {
        this.EYQ = qq.EYQ();
        this.mZx = new WeakReference<>(qq);
        Td();
    }

    public Set<String> EYQ() {
        return this.Td.keySet();
    }

    private void Td() {
        this.Td.put("adInfo", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.45
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                if (qqPm != null) {
                    JSONObject jSONObjectHYh = qqPm.hYh();
                    if (jSONObjectHYh != null) {
                        jSONObjectHYh.put("code", 1);
                        return jSONObjectHYh;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.Td.put("appInfo", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.56
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = IPb.this.EYQ().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                QQ qqPm = IPb.this.Pm();
                if (qqPm != null) {
                    jSONObject2.put("deviceId", qqPm.VwS());
                    jSONObject2.put("netType", qqPm.hu());
                    jSONObject2.put("innerAppName", qqPm.Pm());
                    jSONObject2.put("appName", qqPm.Kbd());
                    jSONObject2.put("appVersion", qqPm.IPb());
                    Map<String, String> mapMZx = qqPm.mZx();
                    for (String str : mapMZx.keySet()) {
                        jSONObject2.put(str, mapMZx.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.Td.put("playableSDKInfo", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.61
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(i5.x, "android");
                return jSONObject2;
            }
        });
        this.Td.put("subscribe_app_ad", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.62
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tsL.EYQ eyqKbd = IPb.this.Kbd();
                JSONObject jSONObject2 = new JSONObject();
                if (eyqKbd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("download_app_ad", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.63
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tsL.EYQ eyqKbd = IPb.this.Kbd();
                JSONObject jSONObject2 = new JSONObject();
                if (eyqKbd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put(t2.h.o, new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.2
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                if (qqPm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", qqPm.HX());
                return jSONObject3;
            }
        });
        this.Td.put("getVolume", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.3
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                if (qqPm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", qqPm.QQ());
                return jSONObject3;
            }
        });
        this.Td.put("getScreenSize", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.4
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                if (qqPm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectUc = qqPm.Uc();
                jSONObjectUc.put("code", 1);
                return jSONObjectUc;
            }
        });
        this.Td.put("start_accelerometer_observer", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.5
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        VwS.EYQ("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                tp.EYQ(IPb.this.EYQ, IPb.this.Pm, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("close_accelerometer_observer", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.6
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    tp.EYQ(IPb.this.EYQ, IPb.this.Pm);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    VwS.EYQ("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.Td.put("start_gyro_observer", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.7
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        VwS.EYQ("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                tp.mZx(IPb.this.EYQ, IPb.this.Kbd, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("close_gyro_observer", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.8
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    tp.EYQ(IPb.this.EYQ, IPb.this.Kbd);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    VwS.EYQ("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.Td.put("start_accelerometer_grativityless_observer", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.9
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        VwS.EYQ("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                tp.Td(IPb.this.EYQ, IPb.this.IPb, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("close_accelerometer_grativityless_observer", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.10
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    tp.EYQ(IPb.this.EYQ, IPb.this.IPb);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    VwS.EYQ("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.Td.put("start_rotation_vector_observer", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.11
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        VwS.EYQ("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                tp.Pm(IPb.this.EYQ, IPb.this.VwS, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("close_rotation_vector_observer", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.13
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    tp.EYQ(IPb.this.EYQ, IPb.this.VwS);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    VwS.EYQ("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.Td.put("device_shake", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.14
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    tp.EYQ(IPb.this.EYQ, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    VwS.EYQ("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.Td.put("device_shake_short", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.15
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    tp.EYQ(IPb.this.EYQ, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    VwS.EYQ("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.Td.put("playable_style", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.16
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm != null) {
                    JSONObject jSONObjectTd = qqPm.Td();
                    jSONObjectTd.put("code", 1);
                    return jSONObjectTd;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.Td.put("sendReward", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.17
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm != null) {
                    qqPm.WU();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.Td.put("webview_time_track", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.18
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.Td.put("playable_event", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.19
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.mZx(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("reportAd", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.20
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("close", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.21
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("openAdLandPageLinks", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.22
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("get_viewport", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.24
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectZF = qqPm.zF();
                jSONObjectZF.put("code", 1);
                return jSONObjectZF;
            }
        });
        this.Td.put("jssdk_load_finish", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.25
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.FH();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_material_render_result", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.26
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.HX(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("detect_change_playable_click", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.27
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectTp = qqPm.tp();
                jSONObjectTp.put("code", 1);
                return jSONObjectTp;
            }
        });
        this.Td.put("check_camera_permission", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.28
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectPi = qqPm.pi();
                jSONObjectPi.put("code", 1);
                return jSONObjectPi;
            }
        });
        this.Td.put("check_external_storage", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.29
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectNWX = qqPm.nWX();
                if (jSONObjectNWX.isNull("result")) {
                    jSONObjectNWX.put("code", -1);
                } else {
                    jSONObjectNWX.put("code", 1);
                }
                return jSONObjectNWX;
            }
        });
        this.Td.put("playable_open_camera", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.30
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_pick_photo", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.31
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_download_media_in_photos", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.32
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.EYQ(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_preventTouchEvent", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.33
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.mZx(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_settings_info", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.35
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectKO = qqPm.KO();
                jSONObjectKO.put("code", 1);
                return jSONObjectKO;
            }
        });
        this.Td.put("playable_load_main_scene", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.36
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.XN();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_enter_section", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.37
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.Pm(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_end", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.38
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.NZ();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_finish_play_playable", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.39
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.tPj();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_transfrom_module_show", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.40
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.wBa();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_transfrom_module_change_color", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.41
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.rfB();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_set_scroll_rect", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.42
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_click_area", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.43
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.Kbd(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_real_play_start", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.44
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_material_first_frame_show", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.46
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.lEs();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_stuck_check_pong", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.47
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.xt();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_material_adnormal_mask", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.48
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                qqPm.IPb(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_long_press_panel", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.49
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_alpha_player_play", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.50
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_transfrom_module_highlight", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.51
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_send_click_event", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.52
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_query_media_permission_declare", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.53
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectVwS = qqPm.VwS(jSONObject);
                jSONObjectVwS.put("code", 1);
                return jSONObjectVwS;
            }
        });
        this.Td.put("playable_query_media_permission_enable", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.54
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                QQ qqPm = IPb.this.Pm();
                JSONObject jSONObject2 = new JSONObject();
                if (qqPm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectQQ = qqPm.QQ(jSONObject);
                jSONObjectQQ.put("code", 1);
                return jSONObjectQQ;
            }
        });
        this.Td.put("playable_apply_media_permission", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.55
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tsL.EYQ eyqKbd = IPb.this.Kbd();
                JSONObject jSONObject2 = new JSONObject();
                if (eyqKbd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_start_kws", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.57
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tsL.EYQ eyqKbd = IPb.this.Kbd();
                JSONObject jSONObject2 = new JSONObject();
                if (eyqKbd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_close_kws", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.58
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tsL.EYQ eyqKbd = IPb.this.Kbd();
                JSONObject jSONObject2 = new JSONObject();
                if (eyqKbd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_video_preload_task_add", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.59
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tsL.EYQ eyqKbd = IPb.this.Kbd();
                JSONObject jSONObject2 = new JSONObject();
                if (eyqKbd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.Td.put("playable_video_preload_task_cancel", new EYQ() { // from class: com.bytedance.sdk.openadsdk.tsL.IPb.60
            @Override // com.bytedance.sdk.openadsdk.tsL.IPb.EYQ
            public JSONObject EYQ(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tsL.EYQ eyqKbd = IPb.this.Kbd();
                JSONObject jSONObject2 = new JSONObject();
                if (eyqKbd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public QQ Pm() {
        WeakReference<QQ> weakReference = this.mZx;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.tsL.EYQ Kbd() {
        QQ qqPm = Pm();
        if (qqPm == null) {
            return null;
        }
        return qqPm.UB();
    }

    public JSONObject EYQ(String str, JSONObject jSONObject) {
        try {
            EYQ eyq = this.Td.get(str);
            if (eyq == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return eyq.EYQ(jSONObject);
        } catch (Throwable th) {
            VwS.EYQ("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    public void mZx() {
        tp.EYQ(this.EYQ, this.Pm);
        tp.EYQ(this.EYQ, this.Kbd);
        tp.EYQ(this.EYQ, this.IPb);
        tp.EYQ(this.EYQ, this.VwS);
    }
}
