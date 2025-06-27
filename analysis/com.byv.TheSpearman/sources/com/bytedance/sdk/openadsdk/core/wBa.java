package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.pi;
import com.bytedance.sdk.openadsdk.mZx.mZx;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.sdk.controller.f;
import com.json.t2;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAndroidObject.java */
/* loaded from: classes2.dex */
public class wBa implements com.bytedance.sdk.component.adexpress.Kbd.mZx, wBa.EYQ, com.bytedance.sdk.openadsdk.VwS.mZx {
    private static final Map<String, Boolean> QQ;
    private Context Dal;
    protected Map<String, Object> EYQ;
    private List<com.bytedance.sdk.openadsdk.core.model.UB> FH;
    private com.bytedance.sdk.openadsdk.VwS.Td HX;
    private String IPb;
    private int KO;
    private WeakReference<View> MxO;
    private com.bytedance.sdk.openadsdk.HX.Pm NZ;
    private com.bytedance.sdk.openadsdk.mZx.Td.Kbd PI;
    private com.bytedance.sdk.openadsdk.core.widget.EYQ.EYQ Pf;
    private WeakReference<SSWebView> Pm;
    private com.bytedance.sdk.openadsdk.core.model.UB UB;
    private com.bytedance.sdk.component.adexpress.mZx.MxO Uc;
    private com.bytedance.sdk.openadsdk.core.widget.mZx VwS;
    private com.bytedance.sdk.openadsdk.VwS.Pm WU;
    private com.bytedance.sdk.openadsdk.HX.EYQ XN;
    private boolean XPd;
    private com.bytedance.sdk.openadsdk.core.nativeexpress.tsL hYh;
    private com.bytedance.sdk.component.EYQ.UB kf;
    private com.bytedance.sdk.openadsdk.HX.mZx lEs;
    private boolean lRN;
    private String mN;
    boolean mZx;
    private String nWX;
    private int pi;
    private com.bytedance.sdk.openadsdk.core.mZx.Pm rfB;
    private com.bytedance.sdk.openadsdk.HX.Td tPj;
    private String tp;
    private HashMap<String, HX> tr;
    private String tsL;
    private com.bytedance.sdk.openadsdk.HX.Kbd vD;
    private JSONObject wBa;
    private EYQ wJ;
    private com.bytedance.sdk.openadsdk.HX.QQ xt;
    private JSONObject zF;
    private boolean hu = true;
    private boolean Nvm = true;
    private boolean Tnp = false;
    private boolean FtN = false;
    boolean Td = false;
    private boolean Kbc = false;
    private final com.bytedance.sdk.component.utils.wBa Kbd = new com.bytedance.sdk.component.utils.wBa(Looper.getMainLooper(), this);

    /* compiled from: TTAndroidObject.java */
    public interface EYQ {
        void EYQ();
    }

    /* compiled from: TTAndroidObject.java */
    public static class mZx {
        public String EYQ;
        public int Kbd;
        public JSONObject Pm;
        public String Td;
        public String mZx;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        QQ = concurrentHashMap;
        concurrentHashMap.put("log_event", Boolean.TRUE);
        concurrentHashMap.put("private", Boolean.TRUE);
        concurrentHashMap.put("dispatch_message", Boolean.TRUE);
        concurrentHashMap.put("custom_event", Boolean.TRUE);
        concurrentHashMap.put("log_event_v3", Boolean.TRUE);
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.core.widget.EYQ.EYQ eyq) {
        this.Pf = eyq;
        return this;
    }

    public wBa(Context context) {
        this.Dal = context;
    }

    public wBa mZx(String str) {
        this.IPb = str;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.core.widget.mZx mzx) {
        this.VwS = mzx;
        return this;
    }

    public wBa EYQ(SSWebView sSWebView) {
        WebView webView = sSWebView.getWebView();
        if (webView == null) {
            return this;
        }
        try {
            com.bytedance.sdk.component.EYQ.UB ubMZx = com.bytedance.sdk.component.EYQ.UB.EYQ(webView).EYQ(new com.bytedance.sdk.openadsdk.QQ.EYQ()).EYQ("ToutiaoJSBridge").EYQ(new com.bytedance.sdk.component.EYQ.tsL() { // from class: com.bytedance.sdk.openadsdk.core.wBa.1
                @Override // com.bytedance.sdk.component.EYQ.tsL
                public <T> T EYQ(String str, Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.EYQ.tsL
                public <T> String EYQ(T t) {
                    return null;
                }
            }).EYQ(QQ.mZx().UB()).mZx(true).EYQ().mZx();
            this.kf = ubMZx;
            com.bytedance.sdk.openadsdk.QQ.EYQ.Kbd.EYQ(ubMZx, this);
            com.bytedance.sdk.openadsdk.QQ.EYQ.EYQ.EYQ(this.kf, this);
            com.bytedance.sdk.openadsdk.QQ.EYQ.mZx.EYQ(this.kf, this);
            com.bytedance.sdk.openadsdk.QQ.EYQ.Td.EYQ(this.kf, this);
            com.bytedance.sdk.openadsdk.QQ.EYQ.Pm.EYQ(this.kf, this);
            com.bytedance.sdk.openadsdk.QQ.EYQ.IPb.EYQ(this.kf, this);
            com.bytedance.sdk.openadsdk.QQ.EYQ.QQ.EYQ(this.kf, this);
            com.bytedance.sdk.openadsdk.QQ.EYQ.VwS.EYQ(this.kf, sSWebView);
        } catch (Exception unused) {
        }
        return this;
    }

    public com.bytedance.sdk.component.EYQ.UB EYQ() {
        return this.kf;
    }

    private WebView nWX() {
        SSWebView sSWebView;
        WeakReference<SSWebView> weakReference = this.Pm;
        if (weakReference == null || (sSWebView = weakReference.get()) == null) {
            return null;
        }
        return sSWebView.getWebView();
    }

    public wBa mZx(SSWebView sSWebView) {
        this.Pm = new WeakReference<>(sSWebView);
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd) {
        this.PI = kbd;
        return this;
    }

    public wBa EYQ(boolean z) {
        this.mZx = z;
        return this;
    }

    public wBa mZx(boolean z) {
        this.FtN = z;
        return this;
    }

    public wBa Td(String str) {
        this.tp = str;
        return this;
    }

    public wBa EYQ(View view) {
        this.MxO = new WeakReference<>(view);
        return this;
    }

    @JProtect
    private JSONObject KO() {
        View view;
        SSWebView sSWebView;
        try {
            view = this.MxO.get();
            sSWebView = this.Pm.get();
        } catch (Throwable unused) {
        }
        if (view == null || sSWebView == null) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
            return null;
        }
        int[] iArrMZx = tr.mZx(view);
        int[] iArrMZx2 = tr.mZx((View) sSWebView);
        if (iArrMZx != null && iArrMZx2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", tr.Td(hu.EYQ(), iArrMZx[0] - iArrMZx2[0]));
            jSONObject.put("y", tr.Td(hu.EYQ(), iArrMZx[1] - iArrMZx2[1]));
            jSONObject.put("w", tr.Td(hu.EYQ(), view.getWidth()));
            jSONObject.put(CmcdHeadersFactory.STREAMING_FORMAT_HLS, tr.Td(hu.EYQ(), view.getHeight()));
            jSONObject.put("isExist", true);
            return jSONObject;
        }
        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
        return null;
    }

    public wBa EYQ(int i) {
        this.KO = i;
        return this;
    }

    public void mZx() {
        com.bytedance.sdk.component.EYQ.UB ub = this.kf;
        if (ub == null) {
            return;
        }
        ub.EYQ();
        this.kf = null;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        this.UB = ub;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.HX.mZx mzx) {
        this.lEs = mzx;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.HX.QQ qq) {
        this.xt = qq;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.model.UB Td() {
        return this.UB;
    }

    public boolean Pm() {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.UB;
        return ub != null && ub.WU();
    }

    public wBa Pm(String str) {
        this.tsL = str;
        return this;
    }

    public wBa mZx(int i) {
        this.pi = i;
        return this;
    }

    public wBa Kbd(String str) {
        this.nWX = str;
        return this;
    }

    private List<String> hu() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    public wBa EYQ(Map<String, Object> map) {
        this.EYQ = map;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.component.adexpress.mZx.MxO mxO) {
        this.Uc = mxO;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.core.nativeexpress.tsL tsl) {
        this.hYh = tsl;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.VwS.Pm pm) {
        this.WU = pm;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.core.mZx.Pm pm) {
        this.rfB = pm;
        return this;
    }

    public wBa EYQ(JSONObject jSONObject) {
        this.zF = jSONObject;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.HX.EYQ eyq) {
        this.XN = eyq;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.HX.Pm pm) {
        this.NZ = pm;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.HX.Td td) {
        this.tPj = td;
        return this;
    }

    public wBa EYQ(List<com.bytedance.sdk.openadsdk.core.model.UB> list) {
        this.FH = list;
        return this;
    }

    public wBa EYQ(com.bytedance.sdk.openadsdk.HX.Kbd kbd) {
        this.vD = kbd;
        return this;
    }

    public boolean Kbd() {
        return this.Td;
    }

    @JProtect
    private void EYQ(JSONObject jSONObject, int i) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = hu().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.EYQ.EYQ());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.EYQ.Kbd());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.EYQ.mZx());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.EYQ.Td());
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.common.EYQ.Pm());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.EYQ.IPb());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.EYQ.EYQ(hu.EYQ()));
        if (DeviceUtils.mZx(hu.EYQ())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", t2.e);
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    private void Kbd(JSONObject jSONObject) throws Exception {
        if (this.lRN) {
            com.bytedance.sdk.openadsdk.core.model.UB ub = this.UB;
            if ((ub instanceof com.bytedance.sdk.openadsdk.core.model.Uc) && ((com.bytedance.sdk.openadsdk.core.model.Uc) ub).oFG()) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("adInfos", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.UB ub2 : ((com.bytedance.sdk.openadsdk.core.model.Uc) this.UB).gR()) {
                    JSONObject jSONObject2 = new JSONObject();
                    EYQ(jSONObject2, ub2);
                    jSONArray.put(jSONObject2);
                }
                return;
            }
        }
        EYQ(jSONObject, this.UB);
    }

    private static void EYQ(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.UB ub) throws Exception {
        String strVOV = ub.VOV();
        if (!TextUtils.isEmpty(strVOV)) {
            jSONObject.put("cid", strVOV);
        }
        String strGfQ = ub.GfQ();
        if (!TextUtils.isEmpty(strGfQ)) {
            jSONObject.put("log_extra", strGfQ);
        }
        String strTfI = ub.TfI();
        if (!TextUtils.isEmpty(strTfI)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strTfI);
        }
        jSONObject.put("dc", TextUtils.isEmpty(hu.Pm().vD()) ? hu.Pm().vD() : "SG");
        jSONObject.put("language", MxO.EYQ());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().eFB());
    }

    private void IPb(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.zF.Pm(this.UB))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.zF.Pm(this.UB));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0386 A[PHI: r4
      0x0386: PHI (r4v19 org.json.JSONObject) = (r4v15 org.json.JSONObject), (r4v20 org.json.JSONObject) binds: [B:222:0x0384, B:206:0x0340] A[DONT_GENERATE, DONT_INLINE]] */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject EYQ(com.bytedance.sdk.openadsdk.core.wBa.mZx r22, int r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.wBa.EYQ(com.bytedance.sdk.openadsdk.core.wBa$mZx, int):org.json.JSONObject");
    }

    private boolean EYQ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        boolean z = false;
        if (iOptInt != 1) {
            if (iOptInt == 2) {
                try {
                    if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                        jSONObject2.put("empty_url", 1);
                    } else if (!com.bytedance.sdk.component.utils.hu.EYQ(strOptString2)) {
                        jSONObject2.put("invalid_url", 1);
                    }
                } catch (JSONException e) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AndroidObject", "handleUrl, EX2->: ", e);
                }
            }
            return z;
        }
        if (!com.bytedance.sdk.component.utils.hu.EYQ(strOptString)) {
            try {
                jSONObject2.put("invalid_url", 1);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AndroidObject", "handleUrl, EX1->: ", e2);
            }
            return z;
        }
        z = true;
        return z;
    }

    public void IPb() {
        com.bytedance.sdk.openadsdk.HX.mZx mzx;
        if (this.XPd && (mzx = this.lEs) != null) {
            mzx.EYQ();
            return;
        }
        Context context = this.Dal;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.hu.EYQ((Activity) context)) {
            ((Activity) this.Dal).finish();
        }
    }

    public void mZx(JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        try {
            jSONObject.put("is_activity", this.Dal instanceof Activity);
        } catch (JSONException unused) {
        }
        boolean z = true;
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.UB, this.mN, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            WebView webViewNWX = nWX();
            if (webViewNWX != null) {
                webViewNWX.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.UB, this.mN, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.UB, this.mN, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyq = new com.bytedance.sdk.openadsdk.tp.EYQ.EYQ();
            eyq.EYQ(mZx.EYQ.mZx);
            eyq.EYQ(this.UB);
            eyq.mZx(this.mN);
            eyq.EYQ(-1);
            eyq.EYQ(false);
            eyq.mZx(this.UB.Pf());
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyq);
            com.bytedance.sdk.openadsdk.utils.hu.EYQ(UB(), strOptString, this.UB, mZx.EYQ.mZx);
        } else if (iOptInt == 2) {
            Context contextUB = UB();
            if (!com.bytedance.sdk.openadsdk.utils.hu.mZx(contextUB, strOptString, this.UB, this.mN)) {
                com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyq2 = new com.bytedance.sdk.openadsdk.tp.EYQ.EYQ();
                eyq2.EYQ(mZx.EYQ.mZx);
                eyq2.EYQ(this.UB);
                eyq2.mZx(this.mN);
                eyq2.EYQ(-1);
                eyq2.EYQ(false);
                eyq2.mZx(this.UB.Pf());
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(eyq2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.UB, this.mN, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.hu.EYQ(contextUB, strOptString2, this.UB, mZx.EYQ.mZx);
            }
        } else if (iOptInt != 3) {
            z = false;
        } else if (lEs.mZx(UB(), strOptString, this.UB, this.pi, this.mN, false)) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.UB, this.mN, 3, (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.UB, this.mN, -2, (JSONObject) null);
        }
        com.bytedance.sdk.openadsdk.core.widget.mZx mzx = this.VwS;
        if (mzx == null || !z) {
            return;
        }
        mzx.EYQ();
    }

    private Context UB() {
        WeakReference<SSWebView> weakReference = this.Pm;
        Activity activityEYQ = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.mZx.EYQ(this.Pm.get());
        return activityEYQ == null ? this.Dal : activityEYQ;
    }

    private void VwS(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd;
        if (jSONObject == null || (kbd = this.PI) == null) {
            return;
        }
        kbd.mZx(jSONObject);
    }

    private void EYQ(String str, boolean z) {
        if (this.PI == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            this.PI.EYQ(str);
        } else {
            this.PI.mZx(str);
        }
    }

    private void Uc() {
        com.bytedance.sdk.openadsdk.HX.QQ qq = this.xt;
        if (qq == null) {
            return;
        }
        qq.EYQ();
    }

    private void hYh() {
        com.bytedance.sdk.openadsdk.HX.QQ qq = this.xt;
        if (qq == null) {
            return;
        }
        qq.mZx();
    }

    private void QQ(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.HX.mZx mzx = this.lEs;
        if (mzx == null || jSONObject == null) {
            return;
        }
        mzx.EYQ(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            Kbd(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            EYQ(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public String getTemplateInfo() throws JSONException {
        EYQ("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.zF;
            if (jSONObject != null) {
                jSONObject.put("setting", XN());
                com.bytedance.sdk.openadsdk.core.model.UB ub = this.UB;
                if (ub != null) {
                    this.zF.put("extension", ub.Rd());
                }
            }
            EYQ("getTemplateInfo", false);
            return this.zF.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            tsL(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wBa.2
                @Override // java.lang.Runnable
                public void run() {
                    wBa.this.HX(jSONObject);
                }
            });
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            nWX(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wBa.3
                @Override // java.lang.Runnable
                public void run() {
                    wBa.this.tp(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wBa.4
                @Override // java.lang.Runnable
                public void run() {
                    wBa.this.Td(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wBa.5
            @Override // java.lang.Runnable
            public void run() {
                wBa.this.zF();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public String getCurrentVideoState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        MxO(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wBa.6
            @Override // java.lang.Runnable
            public void run() {
                if (wBa.this.Pf != null) {
                    wBa.this.Pf.EYQ();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    public void EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.nativeexpress.tsL tsl = this.hYh;
            if (tsl != null) {
                tsl.EYQ(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zF() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.tsL tsl = this.hYh;
        if (tsl != null) {
            tsl.EYQ();
        }
    }

    private void WU() {
        if (this.Dal == null || TextUtils.isEmpty(hu.Pm().mN())) {
            return;
        }
        TTWebsiteActivity.EYQ(this.Dal, this.UB, this.mN);
    }

    public void VwS() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.tsL tsl = this.hYh;
        if (tsl != null) {
            tsl.mZx();
        }
    }

    public void IPb(String str) {
        this.mN = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HX(JSONObject jSONObject) {
        if (this.hYh == null || jSONObject == null) {
            return;
        }
        try {
            this.hYh.EYQ(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tp(JSONObject jSONObject) {
        if (this.hYh == null || jSONObject == null) {
            return;
        }
        try {
            this.hYh.EYQ(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private boolean MxO(JSONObject jSONObject) throws JSONException {
        com.bytedance.sdk.openadsdk.core.nativeexpress.tsL tsl = this.hYh;
        if (tsl != null && jSONObject != null) {
            double dTd = tsl.Td();
            int iPm = this.hYh.Pm();
            try {
                jSONObject.put("currentTime", dTd / 1000.0d);
                jSONObject.put("state", iPm);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @JProtect
    private JSONObject XN() throws JSONException {
        boolean zHu;
        JSONObject jSONObject = new JSONObject();
        if (hu.Pm() == null) {
            return jSONObject;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.UB ub = this.UB;
            int iYK = ub != null ? ub.yK() : 0;
            com.bytedance.sdk.openadsdk.core.model.UB ub2 = this.UB;
            int iKvC = ub2 != null ? ub2.KvC() : 0;
            int iTp = hu.Pm().tp(String.valueOf(iYK));
            int iUB = hu.Pm().UB(String.valueOf(iYK));
            boolean zIPb = hu.Pm().IPb(String.valueOf(iYK));
            boolean z = true;
            boolean z2 = !com.bytedance.sdk.openadsdk.core.model.UB.Kbd(this.UB) && hu.Pm().tsL(String.valueOf(iYK)) == 1;
            if (iKvC == 7 || iKvC == 8) {
                zHu = hu.Pm().hu(String.valueOf(iYK));
            } else {
                zHu = hu.Pm().Td(String.valueOf(iYK));
            }
            jSONObject.put("voice_control", zHu);
            jSONObject.put("rv_skip_time", iTp);
            jSONObject.put("fv_skip_show", zIPb);
            jSONObject.put("iv_skip_time", iUB);
            com.bytedance.sdk.openadsdk.core.model.UB ub3 = this.UB;
            if (ub3 == null || !ub3.BQ()) {
                z = false;
            }
            jSONObject.put("show_dislike", z);
            com.bytedance.sdk.openadsdk.core.model.UB ub4 = this.UB;
            jSONObject.put("video_adaptation", ub4 != null ? ub4.rfB() : 0);
            jSONObject.put("skip_change_to_close", z2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void Td(JSONObject jSONObject) {
        String str;
        double d;
        double d2;
        double dOptDouble;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.UB.EYQ("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String strOptString = jSONObject.optString(f.b.AD_ID);
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d9 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble7 = jSONObjectOptJSONObject2.optDouble("button_x", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble8 = jSONObjectOptJSONObject2.optDouble("button_y", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble9 = jSONObjectOptJSONObject2.optDouble("button_width", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble10 = jSONObjectOptJSONObject2.optDouble("button_height", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d8 = dOptDouble10;
                d9 = dOptDouble2;
                d2 = dOptDouble3;
                d3 = dOptDouble5;
                d4 = dOptDouble6;
                d5 = dOptDouble7;
                d6 = dOptDouble8;
                d7 = dOptDouble9;
                str = strOptString;
                d = dOptDouble4;
            } else {
                str = strOptString;
                d = 0.0d;
                d2 = 0.0d;
                dOptDouble = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                d5 = 0.0d;
                d6 = 0.0d;
                d7 = 0.0d;
                d8 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.pi piVarEYQ = new pi.EYQ().Pm((float) d9).Td((float) dOptDouble).mZx((float) d2).EYQ((float) d).mZx((long) d3).EYQ((long) d4).Td((int) d5).Pm((int) d6).Kbd((int) d7).IPb((int) d8).EYQ(strOptString2).EYQ((SparseArray<Td.EYQ>) null).EYQ(true).mZx(iOptInt).EYQ(jSONObjectOptJSONObject).EYQ(jSONObject.optInt("clickAreaCategory", -1)).EYQ();
            com.bytedance.sdk.component.adexpress.mZx.MxO mxO = this.Uc;
            if (mxO != null) {
                mxO.EYQ(null, iOptInt, piVarEYQ);
            }
            EYQ(str, iOptInt, piVarEYQ);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.mZx.MxO mxO2 = this.Uc;
            if (mxO2 != null) {
                mxO2.EYQ(null, -1, null);
            }
        }
    }

    @JProtect
    private void tsL(JSONObject jSONObject) {
        int i;
        double dOptDouble;
        double dOptDouble2;
        JSONObject jSONObjectOptJSONObject;
        boolean z;
        double d;
        String strOptString;
        int iOptInt;
        com.bytedance.sdk.openadsdk.HX.Kbd kbd;
        wBa wba = this;
        if (wba.Uc == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.mZx.nWX nwx = new com.bytedance.sdk.component.adexpress.mZx.nWX();
        nwx.EYQ(1);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("AdSize");
            dOptDouble = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (jSONObjectOptJSONObject2 != null) {
                dOptDouble = jSONObjectOptJSONObject2.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject2.optDouble("height");
            } else {
                dOptDouble2 = 0.0d;
            }
            jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                try {
                    double dOptDouble3 = jSONObjectOptJSONObject.optDouble("x");
                    double dOptDouble4 = jSONObjectOptJSONObject.optDouble("y");
                    z = zOptBoolean;
                    double dOptDouble5 = jSONObjectOptJSONObject.optDouble("width");
                    double dOptDouble6 = jSONObjectOptJSONObject.optDouble("height");
                    if (wba.pi(jSONObjectOptJSONObject)) {
                        d = dOptDouble2;
                        nwx.EYQ((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopLeft"));
                        nwx.mZx((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight"));
                        nwx.Td((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft"));
                        nwx.Pm((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight"));
                    } else {
                        d = dOptDouble2;
                    }
                    nwx.Td(dOptDouble3);
                    nwx.Pm(dOptDouble4);
                    nwx.Kbd(dOptDouble5);
                    nwx.IPb(dOptDouble6);
                } catch (Exception unused) {
                    i = 101;
                    wba = this;
                    nwx.mZx(i);
                    nwx.EYQ(VwS.EYQ(i));
                    wba.Uc.EYQ(nwx);
                }
            } else {
                z = zOptBoolean;
                d = dOptDouble2;
            }
            try {
                strOptString = jSONObject.optString("message", VwS.EYQ(101));
                iOptInt = jSONObject.optInt("code", 101);
            } catch (Exception unused2) {
                wba = this;
                i = 101;
                nwx.mZx(i);
                nwx.EYQ(VwS.EYQ(i));
                wba.Uc.EYQ(nwx);
            }
        } catch (Exception unused3) {
        }
        try {
            nwx.EYQ(z);
            nwx.EYQ(dOptDouble);
            nwx.mZx(d);
            nwx.EYQ(strOptString);
            nwx.mZx(iOptInt);
            wba = this;
            wba.Uc.EYQ(nwx);
            if (jSONObjectOptJSONObject == null || (kbd = wba.vD) == null) {
                return;
            }
            kbd.EYQ(nwx);
        } catch (Exception unused4) {
            wba = this;
            i = 101;
            nwx.mZx(i);
            nwx.EYQ(VwS.EYQ(i));
            wba.Uc.EYQ(nwx);
        }
    }

    private boolean pi(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private void nWX(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.pi.EYQ(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    private void KO(JSONObject jSONObject) {
        if (jSONObject == null || this.WU == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.WU.EYQ(true, jSONArrayOptJSONArray);
            } else {
                this.WU.EYQ(false, null);
            }
        } catch (Exception unused) {
            this.WU.EYQ(false, null);
        }
    }

    private boolean hu(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("creatives", mZx(this.FH));
        } catch (Exception unused) {
        }
        return true;
    }

    private void EYQ(final mZx mzx, final JSONObject jSONObject) {
        if (mzx == null) {
            return;
        }
        try {
            new Object() { // from class: com.bytedance.sdk.openadsdk.core.wBa.7
            };
        } catch (Exception unused) {
        }
    }

    @JProtect
    public void QQ() {
        new Object() { // from class: com.bytedance.sdk.openadsdk.core.wBa.8
        };
    }

    @JProtect
    private boolean EYQ(String str, int i, com.bytedance.sdk.openadsdk.core.model.pi piVar) {
        HashMap<String, HX> map;
        if (TextUtils.isEmpty(str) || (map = this.tr) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    public static JSONArray mZx(List<com.bytedance.sdk.openadsdk.core.model.UB> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(list.get(i).aEX());
        }
        return jSONArray;
    }

    private boolean NZ() {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.UB;
        if (ub == null || ub.XL() == null || com.bytedance.sdk.openadsdk.core.model.zF.mZx(this.UB) || this.Tnp || this.UB.XL().optInt("parent_type") != 2) {
            return false;
        }
        int iKvC = this.UB.KvC();
        if (iKvC != 8 && iKvC != 7) {
            return false;
        }
        this.Tnp = true;
        return true;
    }

    public void Td(boolean z) {
        this.Td = z;
    }

    public boolean HX() {
        return this.Kbc;
    }

    private void mZx(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            UB(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void UB(JSONObject jSONObject) {
        WebView webViewNWX;
        if (jSONObject == null || (webViewNWX = nWX()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.tsL.EYQ(webViewNWX, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private void Td(String str, JSONObject jSONObject) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            UB(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void VwS(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                mZx mzx = new mZx();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        mzx.EYQ = jSONObjectOptJSONObject.optString("__msg_type", null);
                        mzx.mZx = jSONObjectOptJSONObject.optString("__callback_id", null);
                        mzx.Td = jSONObjectOptJSONObject.optString("func");
                        mzx.Pm = jSONObjectOptJSONObject.optJSONObject("params");
                        mzx.Kbd = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(mzx.EYQ) && !TextUtils.isEmpty(mzx.Td)) {
                    Message messageObtainMessage = this.Kbd.obtainMessage(11);
                    messageObtainMessage.obj = mzx;
                    this.Kbd.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public boolean EYQ(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return QQ.containsKey(uri.getHost());
        }
        return false;
    }

    public void mZx(final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    tp(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.wBa.9
                @Override // java.lang.Runnable
                public void run() throws JSONException, NumberFormatException {
                    long j;
                    String strHX;
                    JSONObject jSONObject;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    wBa.this.mN = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (wBa.this.QQ(queryParameter3)) {
                        long j2 = 0;
                        try {
                            j = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j3 = j2;
                        JSONObject jSONObjectUc = null;
                        String queryParameter4 = uri.getQueryParameter("extra");
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(wBa.this.KO));
                                } catch (Exception unused3) {
                                }
                                jSONObjectUc = jSONObject2;
                            } catch (Exception unused4) {
                            }
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(queryParameter3)) {
                            jSONObjectUc = wBa.this.Uc(jSONObjectUc);
                        }
                        if (!"landing_perf_error".equals(queryParameter3) && !"landing_perf_stats".equals(queryParameter3)) {
                            strHX = wBa.this.HX(queryParameter2);
                            jSONObject = jSONObjectUc;
                        } else {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject3.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject3.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strHX = wBa.this.IPb;
                                jSONObject = jSONObject3;
                            } catch (Exception unused6) {
                                return;
                            }
                        }
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(wBa.this.UB, queryParameter, strHX, queryParameter3, j, j3, jSONObject);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean QQ(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return tp();
        }
        return true;
    }

    boolean tp() {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.UB;
        return ub != null && ub.kf() == 1;
    }

    public void Td(int i) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.tsL tsl = this.hYh;
        if (tsl != null) {
            tsl.mZx(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject Uc(JSONObject jSONObject) throws JSONException {
        if (this.EYQ != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.EYQ.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.mZx(e.toString());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String HX(String str) {
        if (this.lEs != null) {
            return FH.EYQ(this.pi);
        }
        return this.Uc == null ? FH.mZx(this.pi) : str;
    }

    private void tp(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewNWX = nWX();
                    if (webViewNWX != null) {
                        com.bytedance.sdk.component.utils.tsL.EYQ(webViewNWX, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (!str.startsWith("bytedance://private/setresult/") || (iIndexOf = str.indexOf(38, 30)) <= 0) {
                    return;
                }
                String strSubstring = str.substring(30, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                    return;
                }
                VwS(strSubstring2);
            } catch (Exception unused) {
            }
        }
    }

    public void MxO() {
        if (NZ()) {
            QQ();
        }
    }

    public void tsL() {
        com.bytedance.sdk.openadsdk.VwS.Td td = this.HX;
        if (td != null) {
            td.EYQ();
        }
        this.Dal = null;
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        if (message != null && message.what == 11 && (message.obj instanceof mZx)) {
            try {
                EYQ((mZx) message.obj, 1);
            } catch (Exception unused) {
            }
        }
    }

    private void tPj() {
        if (this.HX == null) {
            this.HX = com.bytedance.sdk.openadsdk.VwS.EYQ.EYQ(this, this.UB);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.VwS.mZx
    public void EYQ(String str, JSONObject jSONObject) {
        Td(str, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.mZx
    @JavascriptInterface
    public void chooseAdResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("video_choose");
            long jOptLong = jSONObject.optLong("video_choose_duration");
            com.bytedance.sdk.openadsdk.HX.Kbd kbd = this.vD;
            if (kbd != null) {
                kbd.EYQ(iOptInt, jOptLong);
            }
        } catch (Exception unused) {
        }
    }

    public void pi() {
        EYQ eyq = this.wJ;
        if (eyq != null) {
            eyq.EYQ();
        }
    }

    public void Pm(boolean z) {
        this.lRN = z;
    }

    public void Kbd(boolean z) {
        this.XPd = z;
    }

    public void Pm(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.UB ubEYQ = com.bytedance.sdk.openadsdk.core.mZx.EYQ(jSONObject);
        if (ubEYQ != null) {
            com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(hu.EYQ(), ubEYQ, this.mN, this.pi);
            eyq.EYQ(com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(hu.EYQ(), ubEYQ, this.mN));
            eyq.onClick(null);
        }
    }

    public void EYQ(EYQ eyq) {
        this.wJ = eyq;
    }
}
