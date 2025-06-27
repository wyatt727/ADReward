package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.Pm.VwS;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.HX.IPb;
import com.bytedance.sdk.openadsdk.Pm.mZx;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.WU;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.mZx.Pm;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.widget.DefaultEndCardBackupLayout;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.core.xt;
import com.bytedance.sdk.openadsdk.mZx.HX;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.mZx.Td.Kbd;
import com.bytedance.sdk.openadsdk.mZx.tp;
import com.bytedance.sdk.openadsdk.tsL.EYQ;
import com.bytedance.sdk.openadsdk.tsL.QQ;
import com.bytedance.sdk.openadsdk.tsL.VwS;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.KO;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.com.bytedance.overseas.sdk.EYQ.Td;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTPlayableLandingPageActivity extends TTBaseActivity implements wBa.EYQ, IPb, Pm {
    private static final VwS.EYQ wJ = new VwS.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
        @Override // com.bytedance.sdk.openadsdk.tsL.VwS.EYQ
        public void EYQ(String str, String str2, Throwable th) {
            pi.EYQ(str, str2, th);
        }
    };
    private tp Dal;
    WU EYQ;
    private Td FH;
    private PAGProgressBar KO;
    private int Kbc;
    private SSWebView Kbd;
    private ShadowTextView MxO;
    private String NZ;
    private boolean Nvm;
    private QQ Pf;
    private String Tnp;
    private DefaultEndCardBackupLayout UB;
    private String Uc;
    private com.bytedance.sdk.openadsdk.core.wBa WU;
    private int XN;
    private Kbd XPd;
    private String hYh;
    private PlayableLoadingView hu;
    private int mN;
    TTAdDislikeToast mZx;
    private int nWX;
    private Context pi;
    private UB rfB;
    private String tPj;
    private RelativeLayout tp;
    private ShadowImageView tsL;
    private ILoader vD;
    private boolean xt;
    private com.bytedance.sdk.openadsdk.core.wBa zF;
    private boolean IPb = true;
    private boolean QQ = false;
    private boolean HX = true;
    final AtomicBoolean Td = new AtomicBoolean(false);
    private final String wBa = "embeded_ad";
    private final wBa lEs = new wBa(Looper.getMainLooper(), this);
    private final AtomicBoolean tr = new AtomicBoolean(false);
    private final AtomicInteger FtN = new AtomicInteger(0);
    private final AtomicInteger PI = new AtomicInteger(0);
    private final AtomicInteger kf = new AtomicInteger(0);
    private boolean lRN = false;
    protected com.bytedance.sdk.openadsdk.HX.Td Pm = new com.bytedance.sdk.openadsdk.HX.Td() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
        @Override // com.bytedance.sdk.openadsdk.HX.Td
        public void EYQ() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && zF.VwS(TTPlayableLandingPageActivity.this.rfB) && zF.HX(TTPlayableLandingPageActivity.this.rfB)) {
                TTPlayableLandingPageActivity.this.lEs.removeMessages(2);
                TTPlayableLandingPageActivity.this.lEs.sendMessage(TTPlayableLandingPageActivity.this.EYQ(1, 0));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.HX.Td
        public void mZx() {
            if (zF.VwS(TTPlayableLandingPageActivity.this.rfB) && zF.QQ(TTPlayableLandingPageActivity.this.rfB)) {
                TTPlayableLandingPageActivity.this.lEs.sendMessageDelayed(TTPlayableLandingPageActivity.this.EYQ(0, 0), 1000L);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.HX.Td
        public void EYQ(int i) {
            if (!zF.VwS(TTPlayableLandingPageActivity.this.rfB) || TTPlayableLandingPageActivity.this.hu == null) {
                return;
            }
            TTPlayableLandingPageActivity.this.hu.setProgress(i);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public Message EYQ(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.pi.Kbd()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            hu.EYQ(this);
        } catch (Throwable unused) {
        }
        EYQ(bundle);
        UB ub = this.rfB;
        if (ub == null) {
            return;
        }
        int iTp = zF.tp(ub);
        if (iTp != 0) {
            if (iTp == 1) {
                setRequestedOrientation(1);
            } else if (iTp == 2) {
                setRequestedOrientation(0);
            }
        } else if (Build.VERSION.SDK_INT >= 18) {
            setRequestedOrientation(14);
        } else {
            setRequestedOrientation(1);
        }
        this.pi = this;
        try {
            setContentView(Pm());
            HX();
            IPb();
            EYQ();
            MxO();
            VwS();
            if (!TextUtils.isEmpty(this.Tnp)) {
                this.vD = mZx.EYQ().mZx();
                int iEYQ = mZx.EYQ().EYQ(this.vD, this.Tnp);
                this.mN = iEYQ;
                this.Kbc = iEYQ > 0 ? 2 : 0;
            }
            QQ();
            Kbd kbd = this.XPd;
            if (kbd != null) {
                kbd.VwS();
            }
            Td.EYQ.EYQ(SystemClock.elapsedRealtime() - jElapsedRealtime, this.rfB, "embeded_ad", this.vD, this.Tnp);
        } catch (Throwable unused2) {
            finish();
        }
    }

    private View Pm() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        pAGFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.Kbd = new SSWebView(this);
        this.Kbd.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.Kbd.setVisibility(4);
        this.KO = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tr.mZx(this, 3.0f));
        layoutParams.gravity = 49;
        this.KO.setLayoutParams(layoutParams);
        this.KO.setProgress(1);
        this.KO.setProgressDrawable(com.bytedance.sdk.component.utils.zF.Td(this, "tt_browser_progress_style"));
        this.hu = new PlayableLoadingView(this);
        this.hu.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.hu.setClickable(true);
        this.hu.setFocusable(true);
        this.UB = new DefaultEndCardBackupLayout(this);
        this.UB.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.tsL = new ShadowImageView(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tr.mZx(this, 28.0f), tr.mZx(this, 28.0f));
        layoutParams2.leftMargin = tr.mZx(this, 12.0f);
        layoutParams2.topMargin = tr.mZx(this, 20.0f);
        this.tsL.setLayoutParams(layoutParams2);
        this.tsL.setScaleType(ImageView.ScaleType.CENTER);
        this.tsL.setImageResource(com.bytedance.sdk.component.utils.zF.Pm(this, "tt_unmute_wrapper"));
        this.MxO = new ShadowTextView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tr.mZx(this, 28.0f));
        layoutParams3.gravity = 8388661;
        layoutParams3.leftMargin = tr.mZx(this, 16.0f);
        layoutParams3.rightMargin = tr.mZx(this, 80.0f);
        layoutParams3.topMargin = tr.mZx(this, 20.0f);
        this.MxO.setLayoutParams(layoutParams3);
        this.MxO.setGravity(17);
        this.MxO.setText(com.bytedance.sdk.component.utils.zF.EYQ(this, "tt_reward_feedback"));
        this.MxO.setTextColor(Color.parseColor("#ffffff"));
        this.MxO.setTextSize(14.0f);
        this.tp = new PAGRelativeLayout(this);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tr.mZx(this, 28.0f), tr.mZx(this, 28.0f));
        layoutParams4.gravity = 8388661;
        layoutParams4.topMargin = tr.mZx(this, 20.0f);
        layoutParams4.rightMargin = tr.mZx(this, 24.0f);
        this.tp.setLayoutParams(layoutParams4);
        this.tp.setBackground(com.bytedance.sdk.openadsdk.utils.VwS.EYQ(this, "tt_mute_btn_bg"));
        this.tp.setGravity(17);
        this.tp.setVisibility(8);
        PAGImageView pAGImageView = new PAGImageView(this);
        pAGImageView.setLayoutParams(new RelativeLayout.LayoutParams(tr.mZx(this, 12.0f), tr.mZx(this, 12.0f)));
        pAGImageView.setImageDrawable(com.bytedance.sdk.component.utils.zF.Td(this, "tt_video_close_drawable"));
        pAGImageView.setVisibility(0);
        this.tp.addView(pAGImageView);
        pAGFrameLayout.addView(this.Kbd);
        pAGFrameLayout.addView(this.KO);
        pAGFrameLayout.addView(this.UB);
        pAGFrameLayout.addView(this.hu);
        pAGFrameLayout.addView(this.tsL);
        pAGFrameLayout.addView(this.MxO);
        pAGFrameLayout.addView(this.tp);
        return pAGFrameLayout;
    }

    private void Kbd() {
        if (this.Pf != null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.QQ.mZx().UB()) {
            VwS.EYQ(wJ);
        }
        EYQ eyq = new EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.tsL.EYQ
            public void EYQ(int i, String str) {
                super.EYQ(i, str);
                if (zF.hu(TTPlayableLandingPageActivity.this.rfB)) {
                    TTPlayableLandingPageActivity.this.lEs.sendMessage(TTPlayableLandingPageActivity.this.EYQ(3, zF.EYQ(i)));
                    TTPlayableLandingPageActivity.this.tp();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tsL.EYQ
            public com.bytedance.sdk.openadsdk.tsL.Pm EYQ() {
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

            @Override // com.bytedance.sdk.openadsdk.tsL.EYQ
            public void EYQ(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(TTPlayableLandingPageActivity.this.rfB, "embeded_ad", "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.tsL.Td td = new com.bytedance.sdk.openadsdk.tsL.Td() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.tsL.Td
            public void EYQ(String str, JSONObject jSONObject) {
                TTPlayableLandingPageActivity.this.zF.EYQ(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.Uc);
            jSONObject.put("log_extra", this.hYh);
            this.Pf = QQ.EYQ(getApplicationContext(), this.Kbd.getWebView(), td, eyq).IPb(this.NZ).Kbd(com.bytedance.sdk.openadsdk.common.EYQ.EYQ(hu.EYQ())).EYQ(com.bytedance.sdk.openadsdk.common.EYQ.EYQ()).Td(jSONObject).mZx(com.bytedance.sdk.openadsdk.common.EYQ.Kbd()).EYQ("sdkEdition", com.bytedance.sdk.openadsdk.common.EYQ.Td()).Pm(com.bytedance.sdk.openadsdk.common.EYQ.Pm()).Td(false).EYQ(this.lRN).EYQ(zF.pi(this.rfB)).mZx(zF.pi(this.rfB)).Pm(true);
        } catch (Throwable unused) {
        }
        if (this.Pf == null) {
            pi.EYQ("Pangle", "new PlayablePlugin Object failed, mPlayablePlugin is null");
            return;
        }
        if (!TextUtils.isEmpty(zF.Pm(this.rfB))) {
            this.Pf.Td(zF.Pm(this.rfB));
        }
        Set<String> setMxO = this.Pf.MxO();
        final WeakReference weakReference = new WeakReference(this.Pf);
        for (String str : setMxO) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str)) {
                this.zF.EYQ().EYQ(str, new com.bytedance.sdk.component.EYQ.Kbd<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.EYQ.Kbd
                    public JSONObject EYQ(JSONObject jSONObject2, com.bytedance.sdk.component.EYQ.IPb iPb) {
                        try {
                            QQ qq = (QQ) weakReference.get();
                            if (qq == null) {
                                return null;
                            }
                            return qq.Pm(EYQ(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void IPb() {
        if (this.rfB.Pf() == 4) {
            this.FH = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(this.pi, this.rfB, "interaction");
        }
    }

    private void VwS() {
        int i = hu.Pm().rfB(String.valueOf(this.rfB.yK())).hu;
        if (i >= 0) {
            this.lEs.sendEmptyMessageDelayed(1, i * 1000);
        } else {
            tr.EYQ((View) this.tp, 0);
        }
    }

    private void EYQ(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.nWX = intent.getIntExtra("sdk_version", 1);
            this.Uc = intent.getStringExtra("adid");
            this.hYh = intent.getStringExtra("log_extra");
            this.XN = intent.getIntExtra(FirebaseAnalytics.Param.SOURCE, -1);
            this.xt = intent.getBooleanExtra("ad_pending_download", false);
            this.NZ = intent.getStringExtra("url");
            this.Tnp = intent.getStringExtra("gecko_id");
            this.tPj = intent.getStringExtra("web_title");
            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.rfB = com.bytedance.sdk.openadsdk.core.mZx.EYQ(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        pi.EYQ("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.rfB = com.bytedance.sdk.openadsdk.core.zF.EYQ().mZx();
                com.bytedance.sdk.openadsdk.core.zF.EYQ().IPb();
            }
        }
        if (bundle != null) {
            try {
                this.nWX = bundle.getInt("sdk_version", 1);
                this.Uc = bundle.getString("adid");
                this.hYh = bundle.getString("log_extra");
                this.XN = bundle.getInt(FirebaseAnalytics.Param.SOURCE, -1);
                this.xt = bundle.getBoolean("ad_pending_download", false);
                this.NZ = bundle.getString("url");
                this.tPj = bundle.getString("web_title");
                String string = bundle.getString("material_meta", null);
                if (!TextUtils.isEmpty(string)) {
                    this.rfB = com.bytedance.sdk.openadsdk.core.mZx.EYQ(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.rfB == null) {
            pi.EYQ("TTPWPActivity", "material is null, no data to display");
            finish();
        } else {
            try {
                this.lRN = hu.Pm().hu(this.rfB.Nvm().getCodeId());
            } catch (Throwable th) {
                pi.EYQ("TTPWPActivity", th.getMessage());
            }
        }
    }

    private void QQ() {
        SSWebView sSWebView = this.Kbd;
        if (sSWebView == null) {
            return;
        }
        sSWebView.setLandingPage(true);
        this.Kbd.setTag("landingpage");
        this.Kbd.setMaterialMeta(this.rfB.dbE());
        tp tpVarEYQ = new tp(this.rfB, this.Kbd.getWebView(), new HX() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.11
            @Override // com.bytedance.sdk.openadsdk.mZx.HX
            public void EYQ(int i) {
                Td.EYQ.EYQ(TTPlayableLandingPageActivity.this.mN, TTPlayableLandingPageActivity.this.kf.get(), TTPlayableLandingPageActivity.this.PI.get(), TTPlayableLandingPageActivity.this.FtN.get() - TTPlayableLandingPageActivity.this.PI.get(), TTPlayableLandingPageActivity.this.rfB, "embeded_ad", i);
            }
        }, this.Kbc).EYQ(true);
        this.Dal = tpVarEYQ;
        tpVarEYQ.EYQ("embeded_ad");
        this.Dal.EYQ(this.XPd);
        this.Kbd.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd(this.pi, this.zF, this.Uc, this.Dal, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                TTPlayableLandingPageActivity.this.QQ = true;
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if (TTPlayableLandingPageActivity.this.Pf != null) {
                    TTPlayableLandingPageActivity.this.Pf.QQ(str);
                }
                try {
                    TTPlayableLandingPageActivity.this.Pm.mZx();
                } catch (Throwable unused) {
                }
                try {
                    if (TTPlayableLandingPageActivity.this.KO != null) {
                        TTPlayableLandingPageActivity.this.KO.setVisibility(8);
                    }
                    if (TTPlayableLandingPageActivity.this.IPb) {
                        TTPlayableLandingPageActivity.this.tp();
                        TTPlayableLandingPageActivity.this.EYQ("py_loading_success");
                        if (this.Td != null) {
                            this.Td.mZx(true);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (TTPlayableLandingPageActivity.this.NZ != null && webResourceRequest != null && webResourceRequest.getUrl() != null && TTPlayableLandingPageActivity.this.NZ.equals(webResourceRequest.getUrl().toString())) {
                    TTPlayableLandingPageActivity.this.IPb = false;
                }
                if (TTPlayableLandingPageActivity.this.Pf != null && webResourceRequest != null) {
                    try {
                        TTPlayableLandingPageActivity.this.Pf.EYQ(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    } catch (Throwable unused) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (Build.VERSION.SDK_INT < 23) {
                    return;
                }
                TTPlayableLandingPageActivity.this.IPb = false;
                if (TTPlayableLandingPageActivity.this.Pf == null || webResourceError == null || webResourceRequest == null) {
                    return;
                }
                TTPlayableLandingPageActivity.this.Pf.EYQ(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (Build.VERSION.SDK_INT >= 23) {
                    return;
                }
                TTPlayableLandingPageActivity.this.IPb = false;
                if (TTPlayableLandingPageActivity.this.Pf != null) {
                    TTPlayableLandingPageActivity.this.Pf.EYQ(i, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (TTPlayableLandingPageActivity.this.Pf != null) {
                        TTPlayableLandingPageActivity.this.Pf.HX(str);
                    }
                    if (!TextUtils.isEmpty(TTPlayableLandingPageActivity.this.Tnp)) {
                        TTPlayableLandingPageActivity.this.FtN.incrementAndGet();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    WebResourceResponseModel webResourceResponseModelEYQ = mZx.EYQ().EYQ(TTPlayableLandingPageActivity.this.vD, TTPlayableLandingPageActivity.this.Tnp, str);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (TTPlayableLandingPageActivity.this.XPd != null) {
                        VwS.EYQ EYQ = com.bytedance.sdk.component.adexpress.Pm.VwS.EYQ(str);
                        int i = (webResourceResponseModelEYQ == null || webResourceResponseModelEYQ.getWebResourceResponse() == null) ? 2 : 1;
                        if (EYQ == VwS.EYQ.HTML) {
                            TTPlayableLandingPageActivity.this.XPd.EYQ(str, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        } else if (EYQ == VwS.EYQ.JS) {
                            TTPlayableLandingPageActivity.this.XPd.mZx(str, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        }
                    }
                    if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getWebResourceResponse() != null) {
                        TTPlayableLandingPageActivity.this.PI.incrementAndGet();
                        if (TTPlayableLandingPageActivity.this.Pf != null) {
                            TTPlayableLandingPageActivity.this.Pf.tp(str);
                        }
                        return webResourceResponseModelEYQ.getWebResourceResponse();
                    }
                    if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getMsg() == 2) {
                        TTPlayableLandingPageActivity.this.kf.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Exception unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }
        });
        EYQ(this.Kbd);
        KO.EYQ(this.Kbd, this.NZ);
        QQ qq = this.Pf;
        if (qq != null) {
            qq.VwS(this.NZ);
        }
        this.Kbd.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.zF, this.Dal) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    TTPlayableLandingPageActivity.this.Pm.EYQ(i);
                } catch (Throwable unused) {
                }
                if (TTPlayableLandingPageActivity.this.KO != null) {
                    if (i == 100) {
                        TTPlayableLandingPageActivity.this.QQ = true;
                        TTPlayableLandingPageActivity.this.KO.setVisibility(8);
                        TTPlayableLandingPageActivity.this.tp();
                        return;
                    }
                    TTPlayableLandingPageActivity.this.KO.setProgress(i);
                }
            }
        });
        this.Kbd.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.14
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (TTPlayableLandingPageActivity.this.Dal == null) {
                    return false;
                }
                TTPlayableLandingPageActivity.this.Dal.mZx(motionEvent.getActionMasked());
                return false;
            }
        });
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            UB ub = this.rfB;
            bundle.putString("material_meta", ub != null ? ub.aEX().toString() : null);
            bundle.putInt("sdk_version", this.nWX);
            bundle.putString("adid", this.Uc);
            bundle.putString("log_extra", this.hYh);
            bundle.putInt(FirebaseAnalytics.Param.SOURCE, this.XN);
            bundle.putBoolean("ad_pending_download", this.xt);
            bundle.putString("url", this.NZ);
            bundle.putString("web_title", this.tPj);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private void HX() {
        RelativeLayout relativeLayout = this.tp;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.XPd != null) {
                        TTPlayableLandingPageActivity.this.XPd.QQ();
                    }
                    TTPlayableLandingPageActivity.this.lEs.sendMessage(TTPlayableLandingPageActivity.this.EYQ(4, 0));
                    TTPlayableLandingPageActivity.this.EYQ("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        ShadowTextView shadowTextView = this.MxO;
        if (shadowTextView != null) {
            shadowTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.mZx();
                }
            });
        }
        ShadowImageView shadowImageView = this.tsL;
        if (shadowImageView != null) {
            shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.lRN = !r2.lRN;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.Td(tTPlayableLandingPageActivity.lRN);
                    if (TTPlayableLandingPageActivity.this.Pf != null) {
                        TTPlayableLandingPageActivity.this.Pf.EYQ(TTPlayableLandingPageActivity.this.lRN);
                    }
                }
            });
        }
        this.Kbd.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        tr.EYQ((View) this.Kbd, 4);
        this.hu.mZx();
    }

    protected void EYQ() {
        if (this.hu == null) {
            return;
        }
        UB ub = this.rfB;
        if (ub != null && !zF.VwS(ub)) {
            this.hu.EYQ();
            return;
        }
        this.hu.mZx();
        if (this.hu.getPlayView() != null) {
            com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(this, this.rfB, "embeded_ad", this.XN) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ, com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
                public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) throws JSONException {
                    if (this.Kbd == null || this.Kbd.UB() != 1 || z) {
                        super.EYQ(view, f, f2, f3, f4, sparseArray, z);
                        TTPlayableLandingPageActivity.this.xt = true;
                        TTPlayableLandingPageActivity.this.Nvm = true;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.NZ);
                        } catch (JSONException e) {
                            pi.EYQ("TTPWPActivity", "onClick JSON ERROR", e);
                        }
                        com.bytedance.sdk.openadsdk.mZx.Td.mZx(TTPlayableLandingPageActivity.this.rfB, this.IPb, "click_playable_download_button_loading", jSONObject);
                    }
                }
            };
            eyq.EYQ(this.FH);
            this.hu.getPlayView().setOnClickListener(eyq);
        }
        if (zF.HX(this.rfB)) {
            this.lEs.sendMessageDelayed(EYQ(2, zF.EYQ(2)), zF.nWX(this.rfB));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tp() {
        if (this.tr.getAndSet(true)) {
            return;
        }
        if (zF.hu(this.rfB) && (!this.QQ || !this.IPb)) {
            if (this.UB == null || this.hu == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(this, this.rfB, "embeded_ad", this.XN);
            eyq.EYQ(this.FH);
            this.UB.EYQ(this.rfB, "embeded_ad", eyq);
            tr.EYQ((View) this.UB, 0);
            tr.EYQ((View) this.hu, 8);
            tr.EYQ((View) this.tsL, 8);
            return;
        }
        SSWebView sSWebView = this.Kbd;
        if (sSWebView == null || this.hu == null) {
            return;
        }
        tr.EYQ((View) sSWebView, 0);
        tr.EYQ((View) this.hu, 8);
    }

    private void EYQ(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.EYQ.Td.EYQ(this.pi).EYQ(false).mZx(false).EYQ(sSWebView.getWebView());
        sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.pi.EYQ(sSWebView.getWebView(), this.nWX));
        if (Build.VERSION.SDK_INT >= 21) {
            sSWebView.setMixedContentMode(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str) {
        com.bytedance.sdk.openadsdk.mZx.Td.Td(this.rfB, "embeded_ad", str, null);
    }

    private void MxO() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.rfB);
        this.XPd = new com.bytedance.sdk.openadsdk.mZx.hu(3, "embeded_ad", this.rfB);
        this.zF = new com.bytedance.sdk.openadsdk.core.wBa(this);
        this.zF.mZx(this.Kbd).EYQ(this.rfB).EYQ(arrayList).Td(this.Uc).Pm(this.hYh).mZx("embeded_ad").mZx(this.XN).EYQ(this).EYQ(this.XPd).EYQ(this.Pm).EYQ(this.Kbd).Kbd(this.rfB.TfI());
        Kbd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Kbd kbd = this.XPd;
        if (kbd != null) {
            kbd.tp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, JSONException, NoSuchFieldException, IllegalArgumentException {
        super.onResume();
        com.bytedance.sdk.openadsdk.core.wBa wba = this.zF;
        if (wba != null) {
            wba.MxO();
            SSWebView sSWebView = this.Kbd;
            if (sSWebView != null) {
                this.zF.mZx(sSWebView.getVisibility() == 0);
            }
        }
        com.bytedance.sdk.openadsdk.core.wBa wba2 = this.WU;
        if (wba2 != null) {
            wba2.MxO();
        }
        QQ qq = this.Pf;
        if (qq != null) {
            qq.mZx(true);
        }
        tp tpVar = this.Dal;
        if (tpVar != null) {
            tpVar.VwS();
        }
        DeviceUtils.AudioInfoReceiver.EYQ((IPb) this);
        if (DeviceUtils.VwS() == 0) {
            this.lRN = true;
        }
        Td(this.lRN);
    }

    @Override // android.app.Activity
    protected void onPause() throws JSONException {
        super.onPause();
        com.bytedance.sdk.openadsdk.core.wBa wba = this.zF;
        if (wba != null) {
            wba.mZx(false);
        }
        QQ qq = this.Pf;
        if (qq != null) {
            qq.EYQ(true);
            this.Pf.mZx(false);
        }
        DeviceUtils.AudioInfoReceiver.mZx((IPb) this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Kbd kbd = this.XPd;
        if (kbd != null) {
            kbd.HX();
        }
        tp tpVar = this.Dal;
        if (tpVar != null) {
            tpVar.QQ();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        Kbd kbd = this.XPd;
        if (kbd != null) {
            kbd.QQ();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Kbd kbd = this.XPd;
        if (kbd != null) {
            kbd.EYQ(true);
            this.XPd.tsL();
        }
        this.lEs.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.Tnp)) {
            Td.EYQ.EYQ(this.PI.get(), this.FtN.get(), this.rfB);
        }
        mZx.EYQ().EYQ(this.vD);
        SSWebView sSWebView = this.Kbd;
        if (sSWebView != null) {
            xt.EYQ(sSWebView.getWebView());
            this.Kbd.tsL();
        }
        this.Kbd = null;
        com.bytedance.sdk.openadsdk.core.wBa wba = this.zF;
        if (wba != null) {
            wba.tsL();
        }
        com.bytedance.sdk.openadsdk.core.wBa wba2 = this.WU;
        if (wba2 != null) {
            wba2.tsL();
        }
        QQ qq = this.Pf;
        if (qq != null) {
            qq.PI();
        }
        tp tpVar = this.Dal;
        if (tpVar != null) {
            tpVar.Td(true);
        }
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) throws JSONException {
        int i = message.what;
        if (i == 1) {
            tr.EYQ((View) this.tp, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        PlayableLoadingView playableLoadingView = this.hu;
        if (playableLoadingView == null || !playableLoadingView.Td()) {
            int i2 = message.arg1;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                jSONObject.put("playable_url", this.NZ);
                PlayableLoadingView playableLoadingView2 = this.hu;
                jSONObject.put("duration", playableLoadingView2 != null ? playableLoadingView2.getDisplayDuration() : 0L);
            } catch (JSONException e) {
                pi.EYQ("TTPWPActivity", "handleMsg json error", e);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.rfB, "embeded_ad", "remove_loading_page", jSONObject);
            this.lEs.removeMessages(2);
            PlayableLoadingView playableLoadingView3 = this.hu;
            if (playableLoadingView3 != null) {
                playableLoadingView3.EYQ();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.Pm
    public void mZx(boolean z) {
        com.com.bytedance.overseas.sdk.EYQ.Td td;
        this.xt = true;
        this.Nvm = z;
        if (!z) {
            try {
                Toast.makeText(this.pi, com.bytedance.sdk.component.utils.zF.EYQ(hu.EYQ(), "tt_toast_later_download"), 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.Nvm || (td = this.FH) == null) {
            return;
        }
        td.Pm();
    }

    protected void mZx() {
        if (this.rfB == null || isFinishing()) {
            return;
        }
        if (this.Td.get()) {
            tsL();
            return;
        }
        if (this.EYQ == null) {
            Td();
        }
        this.EYQ.EYQ(new WU.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.WU.EYQ
            public void EYQ() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.WU.EYQ
            public void EYQ(int i, String str) {
                if (TTPlayableLandingPageActivity.this.Td.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.Td.set(true);
                TTPlayableLandingPageActivity.this.pi();
            }
        });
        WU wu = this.EYQ;
        if (wu != null) {
            wu.EYQ();
        }
    }

    void Td() {
        UB ub = this.rfB;
        if (ub != null) {
            this.EYQ = new com.bytedance.sdk.openadsdk.dislike.mZx(this, ub.GfQ(), this.rfB.VEW(), this.rfB.aEX().toString());
        }
        if (this.mZx == null) {
            this.mZx = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.mZx);
        }
    }

    private void tsL() {
        TTAdDislikeToast tTAdDislikeToast = this.mZx;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.EYQ(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pi() {
        TTAdDislikeToast tTAdDislikeToast = this.mZx;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.EYQ(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    protected void Td(boolean z) {
        int iPm;
        try {
            this.lRN = z;
            if (z) {
                iPm = com.bytedance.sdk.component.utils.zF.Pm(this.pi, "tt_mute_wrapper");
            } else {
                iPm = com.bytedance.sdk.component.utils.zF.Pm(this.pi, "tt_unmute_wrapper");
            }
            this.tsL.setImageResource(iPm);
            QQ qq = this.Pf;
            if (qq != null) {
                qq.EYQ(z);
            }
        } catch (Exception e) {
            pi.EYQ("TTPWPActivity", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.HX.IPb
    public void EYQ(int i) {
        Td(i <= 0);
    }
}
