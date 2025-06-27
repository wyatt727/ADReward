package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.core.Kbd.Td;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.core.act.EYQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.mZx.EYQ.Pm;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.wBa;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PAGInitHelper {
    public static final List<PAGSdk.PAGInitCallback> CALLBACK_LIST = new ArrayList();
    public static float animationScale = 1.0f;

    public static void maybeAsyncInitTask(final Context context) {
        EYQ.EYQ(context);
        wBa.EYQ();
        tr.EYQ(context);
        EYQ(context);
        hu.Kbd();
        String strEYQ = MxO.EYQ(context);
        Td.mZx(strEYQ);
        Pm.EYQ(strEYQ, true);
        mZx.EYQ();
        com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ().mZx();
        initAnimationScale(context);
        pi.mZx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.tp.Td.EYQ();
                com.bytedance.sdk.openadsdk.tp.Td.EYQ("android_act", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1.1
                    @Override // com.bytedance.sdk.openadsdk.tp.mZx
                    public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("act", EYQ.mZx(context));
                            jSONObject.put("api_available", EYQ.mZx());
                            jSONObject.put("act_signals_callback_available", EYQ.Td());
                            jSONObject.put("act_event", EYQ.EYQ());
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.pi.EYQ("AsyncInitTask", "run: ", th);
                        }
                        return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("android_act").mZx(jSONObject.toString());
                    }
                });
            }
        }, 10000L);
    }

    public static void initAnimationScale(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                float f = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
                animationScale = f;
                if (f <= 0.0f) {
                    animationScale = 1.0f;
                }
            }
        } catch (Throwable unused) {
            animationScale = 1.0f;
        }
    }

    private static void EYQ(Context context) {
        com.bytedance.sdk.openadsdk.core.Td.EYQ(context).EYQ("uuid", hYh.EYQ());
    }

    public static void initMemoryData() {
        hu.Pm();
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_icon_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ(com.bytedance.sdk.openadsdk.MxO.mZx.EYQ, "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_event_net_ad", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_event_net_state", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_event_net_trail", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_event_db_ad", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_event_db_state", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_sdk_event_db_trail", "a", 0);
    }
}
