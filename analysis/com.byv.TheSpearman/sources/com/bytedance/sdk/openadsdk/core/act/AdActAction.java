package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.EngagementSignalsCallback;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.model.HX;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdActAction {
    private Long KO;
    private String Kbd;
    private String Pm;
    private ActServiceConnection QQ;
    private UB Td;
    private CustomTabsSession VwS;
    private BindCustomTabsServiceCallback hu;
    private Context mZx;
    private CustomTabsClient IPb = null;
    private boolean HX = false;
    private boolean tp = false;
    private boolean MxO = false;
    private boolean tsL = false;
    private boolean pi = false;
    private long nWX = 0;
    private mZx UB = new mZx() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1
        @Override // com.bytedance.sdk.openadsdk.core.act.mZx
        public void EYQ(final CustomTabsClient customTabsClient) {
            if (xt.Kbd()) {
                AdActAction.this.EYQ(customTabsClient);
            } else {
                xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdActAction.this.EYQ(customTabsClient);
                    }
                });
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.act.mZx
        public void EYQ() {
            AdActAction.this.IPb = null;
            AdActAction.this.QQ = null;
            AdActAction.this.VwS = null;
        }
    };
    public EngagementSignalsCallback EYQ = new PAGEngagementSignalsCallback();
    private CustomTabsCallback Uc = new PAGCustomTabsCallback();

    public interface BindCustomTabsServiceCallback {
        void onBindFail(int i, String str);

        void onBindSuccess(CustomTabsSession customTabsSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(CustomTabsClient customTabsClient) {
        this.IPb = customTabsClient;
        this.VwS = customTabsClient.newSession(this.Uc);
        com.bytedance.sdk.openadsdk.tp.EYQ.EYQ EYQ = EYQ(9);
        try {
            boolean zIsEngagementSignalsApiAvailable = this.VwS.isEngagementSignalsApiAvailable(Bundle.EMPTY);
            boolean z = false;
            if (zIsEngagementSignalsApiAvailable) {
                boolean engagementSignalsCallback = this.VwS.setEngagementSignalsCallback(this.EYQ, Bundle.EMPTY);
                EYQ.Td(1);
                EYQ.EYQ(1);
                if (engagementSignalsCallback) {
                    EYQ.Pm(1);
                    EYQ.mZx(1);
                } else {
                    EYQ.mZx(0);
                }
                z = engagementSignalsCallback;
            } else {
                EYQ.Td(0);
                EYQ.EYQ(0);
            }
            Boolean.valueOf(zIsEngagementSignalsApiAvailable);
            Boolean.valueOf(z);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback = this.hu;
            if (bindCustomTabsServiceCallback != null) {
                bindCustomTabsServiceCallback.onBindSuccess(this.VwS);
            }
        } catch (Throwable th) {
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.hu;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(11, th.getMessage());
            }
        }
    }

    public class PAGEngagementSignalsCallback implements EngagementSignalsCallback {
        public PAGEngagementSignalsCallback() {
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onVerticalScrollEvent(boolean z, Bundle bundle) {
            AdActAction.this.nWX = System.currentTimeMillis();
            if (AdActAction.this.Td == null || AdActAction.this.HX) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", AdActAction.this.Kbd);
                jSONObject.put("down_time", AdActAction.this.nWX);
                long jCurrentTimeMillis = System.currentTimeMillis();
                jSONObject.put("up_time", jCurrentTimeMillis);
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(AdActAction.this.Td, FH.EYQ(AdActAction.this.Td), "in_web_click", jSONObject, jCurrentTimeMillis - AdActAction.this.nWX);
            } catch (Throwable th) {
                pi.EYQ("AdActAction", th.getMessage());
            }
            if (!TextUtils.isEmpty(UB.EYQ(AdActAction.this.mZx, AdActAction.this.Td))) {
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(CampaignEx.JSON_NATIVE_VIDEO_CLICK, AdActAction.this.Td, new HX.EYQ().mZx(AdActAction.this.nWX).EYQ(System.currentTimeMillis()).mZx(QQ.mZx().EYQ() ? 1 : 2).Td(tr.VwS(AdActAction.this.mZx)).EYQ(tr.Kbd(AdActAction.this.mZx)).mZx(tr.IPb(AdActAction.this.mZx)).EYQ(), FH.EYQ(AdActAction.this.Td), true, (Map<String, Object>) new HashMap(), 2);
            }
            AdActAction.this.HX = true;
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
            Integer.valueOf(i);
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onSessionEnded(boolean z, Bundle bundle) {
            Boolean.valueOf(z);
        }
    }

    public class PAGCustomTabsCallback extends CustomTabsCallback {
        public PAGCustomTabsCallback() {
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) throws JSONException {
            Integer.valueOf(i);
            if (i == 1) {
                AdActAction.this.KO = Long.valueOf(SystemClock.elapsedRealtime());
                if (AdActAction.this.tsL || AdActAction.this.Td == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    AdActAction.this.EYQ("load_start", jSONObject, 0L);
                    AdActAction.this.tsL = true;
                    return;
                } catch (Throwable th) {
                    pi.EYQ("AdActAction", th.getMessage());
                    return;
                }
            }
            if (i == 2) {
                if (AdActAction.this.tp || AdActAction.this.KO == null || AdActAction.this.Td == null) {
                    return;
                }
                long jLongValue = AdActAction.this.KO.longValue() - SystemClock.elapsedRealtime();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("first_page", true);
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.put("url", AdActAction.this.Kbd);
                    jSONObject2.put("preload_h5_type", AdActAction.this.Td.Fw());
                    AdActAction.this.EYQ("load_finish", jSONObject2, jLongValue);
                    AdActAction.this.tp = true;
                    return;
                } catch (Throwable th2) {
                    pi.EYQ("AdActAction", th2.getMessage());
                    return;
                }
            }
            if (i != 3) {
                if (i != 6) {
                    return;
                }
                AdActAction.this.EYQ();
                if (AdActAction.this.pi || AdActAction.this.Td == null || AdActAction.this.MxO || AdActAction.this.tp || AdActAction.this.KO == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(AdActAction.this.Td, FH.EYQ(AdActAction.this.Td), SystemClock.elapsedRealtime() - AdActAction.this.KO.longValue(), 0, 1);
                return;
            }
            if (AdActAction.this.MxO || AdActAction.this.Td == null) {
                return;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("render_type", "h5");
                jSONObject3.putOpt("render_type_2", 0);
                jSONObject3.put("url", AdActAction.this.Kbd);
                jSONObject3.put("preload_h5_type", AdActAction.this.Td.Fw());
                AdActAction.this.EYQ("load_fail", jSONObject3, 0L);
                AdActAction.this.MxO = true;
            } catch (Throwable th3) {
                pi.EYQ("AdActAction", th3.getMessage());
            }
        }
    }

    public AdActAction(Context context, UB ub, String str, String str2) {
        this.mZx = context;
        this.Td = ub;
        this.Pm = str;
        this.Kbd = str2;
    }

    public void EYQ(BindCustomTabsServiceCallback bindCustomTabsServiceCallback) {
        this.hu = bindCustomTabsServiceCallback;
        if (this.mZx == null || this.Td == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(8));
            String strEYQ = EYQ.EYQ(this.mZx);
            if (strEYQ == null) {
                return;
            }
            ActServiceConnection actServiceConnection = new ActServiceConnection(this.UB);
            this.QQ = actServiceConnection;
            CustomTabsClient.bindCustomTabsService(this.mZx, strEYQ, actServiceConnection);
        } catch (Throwable th) {
            String message = th.getMessage();
            pi.EYQ("AdActAction", message);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.hu;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(10, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ() {
        try {
            ActServiceConnection actServiceConnection = this.QQ;
            if (actServiceConnection == null) {
                return;
            }
            this.mZx.unbindService(actServiceConnection);
            this.IPb = null;
            this.VwS = null;
            this.QQ = null;
        } catch (Throwable th) {
            pi.EYQ("AdActAction", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str, JSONObject jSONObject, long j) {
        JSONObject jSONObject2;
        if (this.Td == null || TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject3 = null;
        try {
            int i = 1;
            jSONObject.put("is_playable", zF.mZx(this.Td) ? 1 : 0);
            if (!com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ().EYQ(this.Td)) {
                i = 0;
            }
            jSONObject.put("usecache", i);
            jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ad_extra_data", jSONObject.toString());
                if (j > 0) {
                    jSONObject2.put("duration", j);
                }
            } catch (Throwable th) {
                th = th;
                jSONObject3 = jSONObject2;
                pi.EYQ("AdActAction", th.getMessage());
                jSONObject2 = jSONObject3;
                UB ub = this.Td;
                com.bytedance.sdk.openadsdk.mZx.Td.Td(ub, FH.EYQ(ub), str, jSONObject2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        UB ub2 = this.Td;
        com.bytedance.sdk.openadsdk.mZx.Td.Td(ub2, FH.EYQ(ub2), str, jSONObject2);
    }

    private com.bytedance.sdk.openadsdk.tp.EYQ.EYQ EYQ(int i) {
        com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyq = new com.bytedance.sdk.openadsdk.tp.EYQ.EYQ();
        eyq.EYQ(this.Pm);
        eyq.EYQ(this.Td);
        eyq.mZx(FH.EYQ(this.Td));
        eyq.EYQ(i);
        eyq.EYQ(false);
        eyq.mZx(8);
        return eyq;
    }
}
