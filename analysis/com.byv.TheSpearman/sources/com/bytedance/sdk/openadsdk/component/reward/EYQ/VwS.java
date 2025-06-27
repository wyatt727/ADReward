package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.tsL.VwS;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.json.t2;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullPlayableManager.java */
/* loaded from: classes2.dex */
public class VwS implements Handler.Callback, com.bytedance.sdk.openadsdk.HX.IPb {
    private static final VwS.EYQ HX = new VwS.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.1
        @Override // com.bytedance.sdk.openadsdk.tsL.VwS.EYQ
        public void EYQ(String str, String str2, Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ(str, str2, th);
        }
    };
    private final Activity MxO;
    private volatile boolean NZ;
    private boolean QQ;
    private PlayableLoadingView Uc;
    private com.bytedance.sdk.openadsdk.tsL.QQ WU;
    private boolean XN;
    private nWX hu;
    private final EYQ nWX;
    private final String pi;
    private boolean tPj;
    private volatile boolean tp;
    private final UB tsL;
    private boolean wBa;
    private HomeWatcherReceiver zF;
    protected final AtomicBoolean EYQ = new AtomicBoolean(false);
    private final Handler KO = new Handler(this);
    boolean mZx = false;
    boolean Td = false;
    long Pm = 0;
    int Kbd = 0;
    int IPb = 0;
    int VwS = 0;
    private int UB = 1;
    private boolean hYh = true;
    private final com.bytedance.sdk.openadsdk.HX.Td rfB = new com.bytedance.sdk.openadsdk.HX.Td() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.8
        @Override // com.bytedance.sdk.openadsdk.HX.Td
        public void EYQ(int i) {
        }

        @Override // com.bytedance.sdk.openadsdk.HX.Td
        public void mZx() {
        }

        @Override // com.bytedance.sdk.openadsdk.HX.Td
        public void EYQ() {
            if (!VwS.this.nWX.TZn.isFinishing() && VwS.this.nWX.EYQ.In() && zF.HX(VwS.this.nWX.EYQ)) {
                VwS.this.KO.removeMessages(800);
                VwS.this.KO.sendMessage(VwS.EYQ(1, 0));
            }
        }
    };

    public VwS(EYQ eyq) {
        this.nWX = eyq;
        this.MxO = eyq.TZn;
        this.pi = eyq.VwS;
        this.tsL = eyq.EYQ;
    }

    public static Message EYQ(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 800;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    public void mZx(int i) {
        if (i == 5) {
            this.QQ = true;
            if (zF.hu(this.tsL)) {
                this.KO.removeMessages(TypedValues.Custom.TYPE_INT);
                this.nWX.Nuq.sendEmptyMessage(600);
            }
        }
        this.KO.sendMessage(EYQ(i, 0));
    }

    public void EYQ() {
        if (this.XN) {
            return;
        }
        this.XN = true;
        this.hu = this.nWX.wJ;
        this.UB = this.nWX.tp;
        XN();
        if (zF.mZx(this.tsL)) {
            DeviceUtils.AudioInfoReceiver.EYQ(this);
        }
        if (NZ() && zF.MxO(this.tsL) && zF.HX(this.tsL)) {
            Handler handler = this.KO;
            handler.sendMessageDelayed(handler.obtainMessage(800, 2, zF.EYQ(2)), zF.pi(this.tsL) * 1000);
        }
    }

    public void EYQ(final com.bytedance.sdk.openadsdk.HX.Pm pm, boolean z) {
        com.bytedance.sdk.openadsdk.tp.mZx mzx;
        com.bytedance.sdk.component.EYQ.UB ubEYQ;
        com.bytedance.sdk.openadsdk.tsL.QQ qqPm;
        if (zF.mZx(this.tsL)) {
            if (com.bytedance.sdk.openadsdk.core.QQ.mZx().UB()) {
                com.bytedance.sdk.openadsdk.tsL.VwS.EYQ(HX);
            }
            com.bytedance.sdk.openadsdk.tsL.EYQ eyq = new com.bytedance.sdk.openadsdk.tsL.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.2
                @Override // com.bytedance.sdk.openadsdk.tsL.EYQ
                public void EYQ(int i, String str) {
                    super.EYQ(i, str);
                    if (VwS.this.Uc == null || !VwS.this.Uc.isShown()) {
                        return;
                    }
                    VwS.this.KO.sendMessage(VwS.EYQ(3, zF.EYQ(i)));
                }

                @Override // com.bytedance.sdk.openadsdk.tsL.EYQ
                public com.bytedance.sdk.openadsdk.tsL.Pm EYQ() {
                    return VwS.WU();
                }

                @Override // com.bytedance.sdk.openadsdk.tsL.EYQ
                public void mZx() {
                    VwS.this.nWX.wJ.tp().Td(true);
                    com.bytedance.sdk.openadsdk.HX.Pm pm2 = pm;
                    if (pm2 != null) {
                        pm2.EYQ();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.tsL.EYQ
                public void EYQ(JSONObject jSONObject) {
                    com.bytedance.sdk.openadsdk.mZx.Td.mZx(VwS.this.tsL, VwS.this.pi, "playable_track", jSONObject);
                }
            };
            com.bytedance.sdk.openadsdk.tsL.Td td = new com.bytedance.sdk.openadsdk.tsL.Td() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.3
                @Override // com.bytedance.sdk.openadsdk.tsL.Td
                public void EYQ(String str, JSONObject jSONObject) {
                    VwS.this.nWX.wJ.tp().EYQ(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cid", this.tsL.VOV());
                jSONObject.put("log_extra", this.tsL.GfQ());
                qqPm = com.bytedance.sdk.openadsdk.tsL.QQ.EYQ(hu.EYQ(), this.nWX.wJ.QQ().getWebView(), td, eyq).IPb(this.nWX.wJ.XN()).Kbd(com.bytedance.sdk.openadsdk.common.EYQ.EYQ(hu.EYQ())).EYQ(com.bytedance.sdk.openadsdk.common.EYQ.EYQ()).Td(jSONObject).EYQ("sdkEdition", com.bytedance.sdk.openadsdk.common.EYQ.Td()).mZx(com.bytedance.sdk.openadsdk.common.EYQ.Kbd()).Pm(com.bytedance.sdk.openadsdk.common.EYQ.Pm()).Td(false).EYQ(z).EYQ(zF.pi(this.tsL)).mZx(zF.pi(this.tsL)).Pm(zF.MxO(this.tsL));
                this.WU = qqPm;
            } catch (Exception unused) {
                if (this.WU == null) {
                    mzx = new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.4
                        @Override // com.bytedance.sdk.openadsdk.tp.mZx
                        public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("PlayablePlugin_init").mZx(jSONObject2.toString());
                        }
                    };
                }
            } catch (Throwable th) {
                if (this.WU == null) {
                    com.bytedance.sdk.openadsdk.tp.Td.EYQ("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.4
                        @Override // com.bytedance.sdk.openadsdk.tp.mZx
                        public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("PlayablePlugin_init").mZx(jSONObject2.toString());
                        }
                    });
                }
                throw th;
            }
            if (qqPm == null) {
                mzx = new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.4
                    @Override // com.bytedance.sdk.openadsdk.tp.mZx
                    public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("PlayablePlugin_is_null", true);
                        return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("PlayablePlugin_init").mZx(jSONObject2.toString());
                    }
                };
                com.bytedance.sdk.openadsdk.tp.Td.EYQ("PlayablePlugin_init", false, mzx);
            }
            if (this.WU != null && !TextUtils.isEmpty(zF.Pm(this.tsL))) {
                this.WU.Td(zF.Pm(this.tsL));
            }
            com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
            if (qq != null) {
                Set<String> setMxO = qq.MxO();
                final WeakReference weakReference = new WeakReference(this.WU);
                for (String str : setMxO) {
                    if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (ubEYQ = this.nWX.wJ.tp().EYQ()) != null) {
                        ubEYQ.EYQ(str, new com.bytedance.sdk.component.EYQ.Kbd<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.5
                            @Override // com.bytedance.sdk.component.EYQ.Kbd
                            public JSONObject EYQ(JSONObject jSONObject2, com.bytedance.sdk.component.EYQ.IPb iPb) {
                                try {
                                    com.bytedance.sdk.openadsdk.tsL.QQ qq2 = (com.bytedance.sdk.openadsdk.tsL.QQ) weakReference.get();
                                    if (qq2 == null) {
                                        return null;
                                    }
                                    return qq2.Pm(EYQ(), jSONObject2);
                                } catch (Throwable unused2) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.tsL.Pm WU() {
        String strIPb = com.bytedance.sdk.openadsdk.common.EYQ.IPb();
        strIPb.hashCode();
        switch (strIPb) {
            case "2g":
                return com.bytedance.sdk.openadsdk.tsL.Pm.TYPE_2G;
            case "3g":
                return com.bytedance.sdk.openadsdk.tsL.Pm.TYPE_3G;
            case "4g":
                return com.bytedance.sdk.openadsdk.tsL.Pm.TYPE_4G;
            case "5g":
                return com.bytedance.sdk.openadsdk.tsL.Pm.TYPE_5G;
            case "wifi":
                return com.bytedance.sdk.openadsdk.tsL.Pm.TYPE_WIFI;
            default:
                return com.bytedance.sdk.openadsdk.tsL.Pm.TYPE_UNKNOWN;
        }
    }

    private void XN() {
        this.Uc = (PlayableLoadingView) this.MxO.findViewById(com.bytedance.sdk.openadsdk.utils.tp.oy);
    }

    private boolean NZ() {
        if (this.Uc == null) {
            return false;
        }
        if (this.tsL.In() && zF.MxO(this.tsL)) {
            this.Uc.mZx();
            return true;
        }
        this.Uc.EYQ();
        return false;
    }

    public void mZx() {
        if (this.EYQ.getAndSet(true)) {
            return;
        }
        this.hu.tr();
        if (zF.Td(this.tsL)) {
            this.hu.IPb();
        }
    }

    public void EYQ(DownloadListener downloadListener) {
        SSWebView sSWebViewHX = this.hu.HX();
        if (sSWebViewHX == null) {
            return;
        }
        String strTPj = tPj();
        if (TextUtils.isEmpty(strTPj)) {
            return;
        }
        sSWebViewHX.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd(this.MxO, this.hu.MxO(), this.tsL.VOV(), null, false) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (VwS.this.hYh) {
                    com.bytedance.sdk.openadsdk.mZx.Td.Td(VwS.this.tsL, VwS.this.pi, "loading_h5_success", null);
                }
                super.onPageFinished(webView, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                VwS.this.hYh = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                VwS.this.hYh = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                VwS.this.hYh = false;
            }
        });
        sSWebViewHX.a_(strTPj);
        sSWebViewHX.setDisplayZoomControls(false);
        sSWebViewHX.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.hu.MxO(), this.hu.tsL()));
        sSWebViewHX.setDownloadListener(downloadListener);
    }

    private String tPj() {
        String strLEs = hu.Pm().lEs();
        if (TextUtils.isEmpty(strLEs) || this.tsL.xh() == null) {
            return strLEs;
        }
        String strMZx = this.tsL.xh().mZx();
        double dPm = this.tsL.xh().Pm();
        int iKbd = this.tsL.xh().Kbd();
        String strEYQ = (this.tsL.vD() == null || TextUtils.isEmpty(this.tsL.vD().EYQ())) ? "" : this.tsL.vD().EYQ();
        String strVOV = this.tsL.VOV();
        String strTd = this.tsL.xh().Td();
        String strEYQ2 = this.tsL.xh().EYQ();
        String strMZx2 = this.tsL.xh().mZx();
        String strTQF = this.tsL.TQF();
        StringBuilder sb = new StringBuilder();
        sb.append("appname=");
        sb.append(URLEncoder.encode(strMZx));
        sb.append("&stars=");
        sb.append(dPm);
        sb.append("&comments=");
        sb.append(iKbd);
        sb.append("&icon=");
        sb.append(URLEncoder.encode(strEYQ));
        sb.append("&downloading=true&id=");
        sb.append(URLEncoder.encode(strVOV));
        sb.append("&packageName=");
        sb.append(URLEncoder.encode(strTd));
        sb.append("&downloadUrl=");
        sb.append(URLEncoder.encode(strEYQ2));
        sb.append("&name=");
        sb.append(URLEncoder.encode(strMZx2));
        sb.append("&orientation=");
        sb.append(this.UB == 1 ? t2.h.D : t2.h.C);
        sb.append("&apptitle=");
        sb.append(URLEncoder.encode(strTQF));
        return strLEs + "?" + ((Object) sb);
    }

    public void Td() {
        this.mZx = true;
    }

    public boolean Pm() {
        return this.mZx;
    }

    public void Kbd() {
        if (this.wBa) {
            return;
        }
        this.wBa = true;
        Td(false);
        EYQ(this.MxO.getApplicationContext());
        com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
        if (qq != null) {
            qq.PI();
        }
        this.KO.removeCallbacksAndMessages(null);
        DeviceUtils.AudioInfoReceiver.mZx(this);
    }

    public void EYQ(boolean z) {
        if (Build.VERSION.SDK_INT < 19 || !z) {
            return;
        }
        this.hu.QQ().setDomStorageEnabled(true);
    }

    public void mZx(boolean z) {
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.hu.XN()) && this.hu.zF() != 0) {
                    com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ(this.hu.XN(), this.hu.zF(), this.hu.WU());
                }
            } catch (Throwable unused) {
            }
        }
        if (z) {
            try {
                if (TextUtils.isEmpty(this.hu.XN())) {
                    return;
                }
                com.bytedance.sdk.openadsdk.tp.Td.EYQ().mZx(this.hu.XN());
            } catch (Throwable unused2) {
            }
        }
    }

    public void IPb() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.zF = homeWatcherReceiver;
            homeWatcherReceiver.EYQ(new HomeWatcherReceiver.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS.7
                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.EYQ
                public void EYQ() {
                    VwS.this.Td = true;
                }

                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.EYQ
                public void mZx() {
                    VwS.this.Td = true;
                }
            });
            this.MxO.getApplicationContext().registerReceiver(this.zF, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    private void EYQ(Context context) {
        try {
            this.zF.EYQ(null);
            context.getApplicationContext().unregisterReceiver(this.zF);
        } catch (Throwable unused) {
        }
    }

    public void EYQ(String str) throws JSONException {
        if (this.Td) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.Pm);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFPM", "sendPlayableEvent error", e);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.tsL, this.pi, str, jSONObject);
            if ("return_foreground".equals(str)) {
                this.Td = false;
            }
        }
    }

    public void VwS() {
        if (this.Pm > 0) {
            return;
        }
        this.Pm = System.currentTimeMillis();
        Handler handler = this.KO;
        handler.sendMessage(handler.obtainMessage(TypedValues.Custom.TYPE_INT, MxO(), 0));
        Td(true);
    }

    public void EYQ(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.Pm);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFPM", "endShow json error", e);
            }
        }
    }

    public void Td(int i) {
        PlayableLoadingView playableLoadingView = this.Uc;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i);
        }
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.mZx.Kbd kbd) {
        PlayableLoadingView playableLoadingView = this.Uc;
        if (playableLoadingView == null || playableLoadingView.getPlayView() == null) {
            return;
        }
        if (zF.MxO(this.tsL) || zF.hu(this.tsL)) {
            this.Uc.getPlayView().setOnClickListener(kbd);
            this.Uc.getPlayView().setOnTouchListener(kbd);
        }
    }

    public void QQ() {
        if (zF.tsL(this.tsL) && this.Uc.isShown()) {
            this.nWX.na.EYQ(this.nWX.xh);
        }
        PlayableLoadingView playableLoadingView = this.Uc;
        if (playableLoadingView != null) {
            playableLoadingView.EYQ();
        }
        if (this.EYQ.getAndSet(true) || !zF.mZx(this.tsL) || !zF.hu(this.tsL) || this.nWX.wJ == null || this.nWX.wJ.PI()) {
            return;
        }
        if (zF.MxO(this.nWX.EYQ)) {
            EYQ(this.nWX.KO, this.nWX.EYQ, this.nWX.TZn.KO());
            VwS();
            this.nWX.TZn.mZx();
        }
        this.nWX.na.EYQ(false);
        this.nWX.wJ.Tnp();
        this.NZ = true;
        this.nWX.KR.Td(false);
        this.nWX.XPd.EYQ(true);
        this.nWX.Pm = true;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_event", "PL_sdk_page_show");
            jSONObject.put("playable_ts", System.currentTimeMillis());
            String strKbd = zF.Kbd(this.tsL);
            String strXN = this.nWX.wJ.XN();
            if (!TextUtils.isEmpty(strXN)) {
                strKbd = strXN;
            }
            jSONObject.put("playable_url", strKbd);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_network_type", WU());
            jSONObject.put("render_type", 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.tsL, this.pi, "playable_track", jSONObject);
        if (zF.tsL(this.tsL)) {
            this.KO.removeMessages(TypedValues.Custom.TYPE_INT);
            this.nWX.KR.Pm(false);
            if (this.nWX.Nuq != null) {
                this.nWX.Nuq.removeMessages(1);
                this.nWX.Nuq.sendEmptyMessageDelayed(600, 1000L);
            }
        }
    }

    public void HX() {
        if (this.Uc.isShown()) {
            return;
        }
        PlayableLoadingView playableLoadingView = this.Uc;
        if (playableLoadingView != null) {
            playableLoadingView.mZx();
            this.Uc.setProgress(this.nWX.wJ.QQ() != null ? this.nWX.wJ.QQ().getProgress() : 0);
        }
        com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
        if (qq != null) {
            qq.Nvm();
        }
    }

    public boolean tp() {
        return this.tp;
    }

    public void Td(boolean z) {
        this.tp = z;
        if (z) {
            return;
        }
        this.KO.removeMessages(TypedValues.Custom.TYPE_INT);
    }

    public int Pm(int i) {
        return this.VwS - (this.IPb - i);
    }

    public int MxO() {
        return this.IPb;
    }

    public int tsL() {
        return this.Kbd;
    }

    public void EYQ(int i, UB ub, boolean z) {
        if (ub == null) {
            return;
        }
        this.IPb = ub.eVP();
        this.VwS = hu.Pm().EYQ(String.valueOf(i), z);
    }

    public void Kbd(int i) {
        this.Kbd = i - 1;
    }

    public void IPb(int i) {
        this.Kbd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.HX.IPb
    public void EYQ(int i) {
        if (!zF.tsL(this.nWX.EYQ) || this.nWX.WU.get()) {
            if (zF.MxO(this.nWX.EYQ) || zF.tsL(this.nWX.EYQ)) {
                if (this.nWX.XPd.mZx()) {
                    boolean z = this.nWX.Pm;
                    this.nWX.XPd.EYQ();
                    if (i == 0) {
                        this.nWX.KR.mZx(true);
                        this.nWX.FtN.mZx(true);
                        return;
                    } else {
                        this.nWX.KR.mZx(false);
                        this.nWX.FtN.mZx(false);
                        return;
                    }
                }
                this.nWX.XPd.EYQ(-1);
                boolean z2 = this.nWX.Pm;
                this.nWX.XPd.EYQ();
                if (this.nWX.Kbd) {
                    if (i == 0) {
                        this.nWX.Pm = true;
                        this.nWX.KR.mZx(true);
                        this.nWX.FtN.mZx(true);
                    } else {
                        this.nWX.Pm = false;
                        this.nWX.KR.mZx(false);
                        this.nWX.FtN.mZx(false);
                    }
                }
            }
        }
    }

    public void pi() {
        if (this.WU == null || !tr.Pm(this.nWX.wJ.QQ())) {
            return;
        }
        this.WU.mZx(true);
    }

    public void nWX() throws JSONException {
        com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
        if (qq != null) {
            qq.mZx(false);
        }
        this.KO.removeMessages(TypedValues.Custom.TYPE_INT);
    }

    public void Pm(boolean z) throws JSONException {
        com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
        if (qq != null) {
            qq.mZx(z);
        }
    }

    public void Kbd(boolean z) {
        com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
        if (qq != null) {
            qq.EYQ(z);
        }
    }

    public void EYQ(int i, String str, String str2) {
        try {
            com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
            if (qq != null) {
                qq.EYQ(i, str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public void EYQ(boolean z, String str, int i) {
        try {
            com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
            if (qq != null) {
                qq.EYQ(z, str, i);
            }
        } catch (Exception unused) {
        }
    }

    public void mZx(String str) {
        com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
        if (qq != null) {
            qq.QQ(str);
        }
        if (UB()) {
            this.nWX.wJ.Pm(true);
            this.nWX.XPd.EYQ(true);
            this.nWX.Pm = true;
        }
    }

    public void Td(String str) {
        com.bytedance.sdk.openadsdk.tsL.QQ qq = this.WU;
        if (qq != null) {
            qq.VwS(str);
        }
    }

    public void KO() {
        this.KO.removeMessages(TypedValues.Custom.TYPE_INT);
        this.KO.removeMessages(600);
    }

    public void EYQ(long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = TypedValues.Custom.TYPE_INT;
        messageObtain.arg1 = tsL();
        this.KO.sendMessageDelayed(messageObtain, j);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws JSONException {
        PlayableLoadingView playableLoadingView;
        if (message.what == 900) {
            if (!this.tp || !zF.MxO(this.nWX.EYQ)) {
                return true;
            }
            int i = message.arg1;
            if (i > 0) {
                this.nWX.KR.Pm(true);
                int iPm = this.nWX.kf.Pm(i);
                if (iPm == i) {
                    this.nWX.KR.EYQ(String.valueOf(i), null);
                } else if (iPm > 0) {
                    this.nWX.KR.EYQ(String.valueOf(i), String.format(com.bytedance.sdk.component.utils.zF.EYQ(this.nWX.TZn.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(iPm)));
                } else if (UB()) {
                    this.nWX.FH.set(true);
                    this.nWX.xh.hu();
                } else {
                    this.nWX.KR.EYQ(String.valueOf(i), com.bytedance.sdk.component.utils.zF.EYQ(this.nWX.TZn.getApplicationContext(), "tt_txt_skip"));
                    this.nWX.KR.Kbd(true);
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = TypedValues.Custom.TYPE_INT;
                messageObtain.arg1 = i - 1;
                this.KO.sendMessageDelayed(messageObtain, 1000L);
                this.nWX.kf.Kbd(i);
            } else {
                if (zF.Td(this.tsL) && (!zF.hu(this.tsL) || !this.nWX.kf.UB())) {
                    this.nWX.KR.Td();
                    this.nWX.KR.Kbd(true);
                } else {
                    this.nWX.KR.Pm(false);
                    this.nWX.FH.set(true);
                    this.nWX.xh.hu();
                }
                if (!this.QQ) {
                    this.tPj = true;
                }
            }
            this.nWX.TZn.tp();
        } else {
            if (message.what != 800 || ((playableLoadingView = this.Uc) != null && playableLoadingView.Td())) {
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                String strKbd = zF.Kbd(this.tsL);
                EYQ eyq = this.nWX;
                if (eyq != null && eyq.wJ != null) {
                    String strXN = this.nWX.wJ.XN();
                    if (!TextUtils.isEmpty(strXN)) {
                        strKbd = strXN;
                    }
                }
                jSONObject.put("playable_url", strKbd);
                PlayableLoadingView playableLoadingView2 = this.Uc;
                displayDuration = playableLoadingView2 != null ? playableLoadingView2.getDisplayDuration() : 0L;
                jSONObject.put("duration", displayDuration);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFPM", "handleMessage json error", e);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.nWX.EYQ, this.nWX.TZn.EYQ, "remove_loading_page", jSONObject, displayDuration);
            this.KO.removeMessages(800);
            if (!this.MxO.isFinishing()) {
                this.nWX.kf.QQ();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.HX.Td hu() {
        return this.rfB;
    }

    public void IPb(boolean z) {
        if (!z || this.nWX.kf.UB()) {
            return;
        }
        boolean zMxO = zF.MxO(this.tsL);
        if ((zMxO || zF.hu(this.tsL)) && this.tsL.In() && !zF.HX(this.tsL)) {
            Handler handler = this.KO;
            handler.sendMessageDelayed(handler.obtainMessage(800, 0, 0), 1000L);
        }
        if (zMxO) {
            this.nWX.kf.mZx();
            this.nWX.wJ.mZx(true);
            this.nWX.wJ.Td(true);
            com.bytedance.sdk.openadsdk.mZx.Td.Td(this.nWX.EYQ, this.pi, "py_loading_success", null);
        }
    }

    public boolean UB() {
        return this.NZ;
    }

    public boolean Uc() {
        return this.tPj;
    }

    public boolean hYh() {
        PlayableLoadingView playableLoadingView = this.Uc;
        return playableLoadingView != null && playableLoadingView.isShown();
    }
}
