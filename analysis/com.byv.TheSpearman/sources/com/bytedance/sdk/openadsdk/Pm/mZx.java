package com.bytedance.sdk.openadsdk.Pm;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.tp.Td;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* compiled from: GeckoHub.java */
/* loaded from: classes2.dex */
public class mZx {
    private static final String[] EYQ = {"gecko-pangle-sg.byteoversea.com"};

    /* compiled from: GeckoHub.java */
    private static class EYQ {
        private static final mZx EYQ = new mZx();
    }

    public static mZx EYQ() {
        return EYQ.EYQ;
    }

    public ILoader mZx() {
        try {
            return GeckoHubImp.inst(hu.EYQ()).getGeckoResLoader();
        } catch (Throwable th) {
            pi.EYQ("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private mZx() {
        try {
            GeckoHubImp.inst(hu.EYQ());
        } catch (Throwable th) {
            pi.EYQ("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    private static String Td() {
        String[] strArrBy = hu.Pm().by();
        if (strArrBy != null) {
            int length = strArrBy.length;
        }
        if (strArrBy == null) {
            strArrBy = EYQ;
        }
        String str = strArrBy[new SecureRandom().nextInt(strArrBy.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = EYQ;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public void EYQ(final Map<String, UB> map) {
        try {
            String strEYQ = MxO.EYQ(hu.EYQ());
            if (TextUtils.isEmpty(strEYQ)) {
                return;
            }
            Iterator<UB> it = map.values().iterator();
            while (it.hasNext()) {
                Td.mZx(it.next());
            }
            GeckoHubImp.setRandomHost(Td());
            GeckoHubImp.inst(hu.EYQ()).preload(strEYQ, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.Pm.mZx.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        UB ub = (UB) map.get(jSONObject.optString("channel"));
                        if (ub != null) {
                            Td.EYQ.EYQ(str, jSONObject, ub);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        mZx.mZx(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.Pm.EYQ());
        } catch (Throwable th) {
            mZx(map, null, th.toString());
            pi.EYQ("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(Map<String, UB> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<UB> it = map.values().iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.tp.Td.EYQ(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            pi.EYQ("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void EYQ(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(hu.EYQ()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                pi.EYQ("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel EYQ(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(hu.EYQ()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            pi.EYQ("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int EYQ(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(hu.EYQ()).getResCount(iLoader, str);
        } catch (Throwable th) {
            pi.EYQ("GeckoHub", "getResCount error", th);
            return 0;
        }
    }

    public static void EYQ(ThreadPoolExecutor threadPoolExecutor) {
        try {
            GeckoHubImp.setThreadPoolExecutor(threadPoolExecutor);
        } catch (Throwable th) {
            pi.EYQ("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }
}
