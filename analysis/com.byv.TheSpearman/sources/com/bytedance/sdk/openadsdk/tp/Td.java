package com.bytedance.sdk.openadsdk.tp;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.json.t2;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import java.io.File;
import org.json.JSONObject;

/* compiled from: StatsLogManager.java */
/* loaded from: classes2.dex */
public class Td {
    private static volatile Td EYQ;

    private boolean Td(com.bytedance.sdk.openadsdk.tp.EYQ.Td td) {
        return td == null;
    }

    private Td() {
    }

    public static Td EYQ() {
        if (EYQ == null) {
            synchronized (Td.class) {
                if (EYQ == null) {
                    EYQ = new Td();
                }
            }
        }
        return EYQ;
    }

    public static void EYQ(final UB ub) {
        if (ub == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        EYQ("bidding_receive", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.1
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (ub.Yd() == 3) {
                    jSONObject.put("is_icon_only", ub.BEC() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("bidding_receive").mZx(jSONObject.toString());
            }
        });
    }

    public static void EYQ(UB ub, final long j) {
        if (ub == null) {
            return;
        }
        EYQ("bidding_load", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.12
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("bidding_load").mZx(jSONObject.toString());
            }
        });
    }

    public static void EYQ(final String str, final com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq) {
        if (eyq == null) {
            return;
        }
        EYQ(str, false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.16
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObjectTd = eyq.Td();
                if (jSONObjectTd == null) {
                    jSONObjectTd = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td tdPm = eyq.Pm();
                if (tdPm != null) {
                    tdPm.EYQ(jSONObjectTd);
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ(str).EYQ(eyq.EYQ().Yd()).mZx(jSONObjectTd.toString());
            }
        });
    }

    public static void mZx(final UB ub) {
        if (FH.EYQ(ub) == null || TextUtils.isEmpty(ub.Dd())) {
            return;
        }
        EYQ("download_gecko_start", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.17
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", ub.XPd());
                jSONObject.put("channel_name", ub.Dd());
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("download_gecko_start").EYQ(ub.Yd()).mZx(jSONObject.toString());
            }
        });
    }

    public static void EYQ(final UB ub, final JSONObject jSONObject) {
        if (FH.EYQ(ub) == null || TextUtils.isEmpty(ub.Dd())) {
            return;
        }
        EYQ("download_gecko_end", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.18
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", ub.XPd());
                jSONObject2.put("channel_name", ub.Dd());
                jSONObject2.put("data", jSONObject);
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("download_gecko_end").EYQ(ub.Yd()).mZx(jSONObject2.toString());
            }
        });
    }

    public void EYQ(final com.bytedance.sdk.openadsdk.tp.EYQ.Td td) {
        if (Td(td)) {
            return;
        }
        td.EYQ("express_ad_render");
        hu.Kbd().EYQ(new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.19
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                return td;
            }
        });
    }

    public void mZx(final com.bytedance.sdk.openadsdk.tp.EYQ.Td td) {
        if (Td(td)) {
            return;
        }
        td.EYQ("show_backup_endcard");
        hu.Kbd().EYQ(new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.20
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                return td;
            }
        });
    }

    public void EYQ(final String str) {
        EYQ("click_playable_test_tool", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.2
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("click_playable_test_tool").mZx(jSONObject.toString());
            }
        });
    }

    public void mZx(final String str) {
        EYQ("close_playable_test_tool", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.3
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("close_playable_test_tool").mZx(jSONObject.toString());
            }
        });
    }

    public void EYQ(final String str, final int i, final String str2) {
        EYQ("use_playable_test_tool_error", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.4
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("use_playable_test_tool_error").mZx(jSONObject.toString());
            }
        });
    }

    public void EYQ(final long j, final long j2) {
        final long j3 = j2 - j;
        EYQ("general_label", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.5
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                int i = !pi.mZx.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("general_label").QQ(String.valueOf(j3)).mZx(jSONObject.toString());
            }
        });
    }

    public void EYQ(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        EYQ(str, false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.6
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ(str).mZx(jSONObject.toString());
            }
        });
    }

    public void EYQ(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        EYQ(str, false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.7
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ(str).mZx(str2);
            }
        });
    }

    public void mZx() {
        EYQ("blind_mode_status", true, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.8
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("blind_mode_status");
            }
        });
    }

    public void EYQ(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            return;
        }
        EYQ("ad_revenue", true, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.9
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                try {
                    jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                    jSONObject.put("uuid", MxO.Td(hu.EYQ()));
                    String strEYQ = "";
                    try {
                        if (MxO.EYQ(hu.EYQ()) != null) {
                            strEYQ = MxO.EYQ(hu.EYQ());
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    jSONObject.put("device_id", strEYQ);
                    jSONObject.put("platform", "android");
                    jSONObject.put("partner", "PangleSDK");
                } catch (Throwable th2) {
                    th2.getMessage();
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("ad_revenue").mZx(jSONObject.toString());
            }
        });
    }

    public static void Td() {
        EYQ("disk_log", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.10
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jEYQ = Td.EYQ(file2);
                        j += jEYQ;
                        jSONObject.put(file2.getName(), jEYQ);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("disk_log").mZx(jSONObject.toString());
            }
        });
    }

    public static long EYQ(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jEYQ = 0;
        for (File file2 : file.listFiles()) {
            jEYQ += EYQ(file2);
        }
        return jEYQ;
    }

    public static void mZx(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final com.bytedance.sdk.openadsdk.tp.EYQ.Td tdMZx = com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ(str).mZx(str2);
                hu.Kbd().EYQ(new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.11
                    @Override // com.bytedance.sdk.openadsdk.tp.mZx
                    public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                        return tdMZx;
                    }
                }, false);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("StatsLogManager", th.getMessage());
        }
    }

    public static void EYQ(String str, boolean z, mZx mzx) {
        int iMZx = KO.Jpu().mZx(str);
        Integer.valueOf(iMZx);
        if (TextUtils.isEmpty(str) || iMZx == 0 || mzx == null) {
            return;
        }
        boolean z2 = iMZx == 100;
        if (!z2) {
            z2 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= iMZx;
        }
        if (z2) {
            hu.Kbd().EYQ(mzx, z);
        }
    }

    public static void EYQ(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = jElapsedRealtime - j;
        final long j4 = jElapsedRealtime - j2;
        final long j5 = j2 - j;
        EYQ("ad_show_cost_time", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.13
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("ad_show_cost_time").mZx(jSONObject.toString());
            }
        });
    }

    public static void Td(final String str) {
        EYQ("request_monitor_daily", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.Td.14
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("request_monitor_daily").mZx(str);
            }
        });
    }

    public static void EYQ(int i, String str) {
        EYQ(i, str, 0, (String) null);
    }

    public static void EYQ(final int i, final String str, final int i2, final String str2) {
        EYQ("ipv6_req", false, (mZx) new mZx<com.bytedance.sdk.openadsdk.tp.EYQ.mZx>() { // from class: com.bytedance.sdk.openadsdk.tp.Td.15
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 == -1) {
                    jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i2);
                    jSONObject.put("error_msg", str2);
                    str3 = t2.f.e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("ipv6_req").mZx(jSONObject.toString());
            }
        });
    }
}
