package com.bytedance.sdk.openadsdk.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.utils.NZ;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.VwS.Pm;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd;
import com.bytedance.sdk.openadsdk.core.zF;
import com.bytedance.sdk.openadsdk.mZx.HX;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.mZx.tp;
import com.bytedance.sdk.openadsdk.multipro.mZx;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.KO;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.com.bytedance.overseas.sdk.EYQ.Td;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseActivity implements Pm {
    protected SSWebView EYQ;
    protected String HX;
    protected int IPb;
    protected long KO;
    protected com.bytedance.sdk.openadsdk.multipro.mZx.EYQ Kbc;
    protected Context Kbd;
    protected int MxO;
    protected TextView NZ;
    protected Td Nvm;
    private int OtA;
    protected tp Pf;
    protected TextView Pm;
    protected String QQ;
    private int TQF;
    protected ImageView Td;
    protected RelativeLayout XN;
    protected String XPd;
    protected UB hu;
    protected PangleViewStub lEs;
    protected int mN;
    protected ImageView mZx;
    protected NativeVideoTsView nWX;
    protected TextView rfB;
    protected CornerIV tPj;
    protected wBa tp;
    protected String tr;
    protected FrameLayout tsL;
    protected TextView wBa;
    private ILoader wJ;
    protected Button xt;
    protected int pi = -1;
    protected int UB = 0;
    protected int Uc = 0;
    protected int hYh = 0;
    protected int zF = 0;
    protected String WU = "ダウンロード";
    protected boolean FH = false;
    protected boolean Tnp = false;
    protected boolean FtN = true;
    protected boolean PI = false;
    protected String kf = null;
    protected AtomicBoolean vD = new AtomicBoolean(true);
    protected JSONArray lRN = null;
    private final AtomicInteger wa = new AtomicInteger(0);
    private final AtomicInteger KR = new AtomicInteger(0);
    private final AtomicInteger na = new AtomicInteger(0);
    protected com.bytedance.sdk.openadsdk.core.mZx.EYQ Dal = null;
    private final Td.mZx TZn = new Td.mZx() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.mZx
        public void EYQ(boolean z) {
            TTVideoLandingPageActivity.this.FH = z;
            if (TTVideoLandingPageActivity.this.isFinishing()) {
                return;
            }
            if (z) {
                tr.EYQ((View) TTVideoLandingPageActivity.this.EYQ, 8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.tsL.getLayoutParams();
                TTVideoLandingPageActivity.this.Uc = marginLayoutParams.leftMargin;
                TTVideoLandingPageActivity.this.UB = marginLayoutParams.topMargin;
                TTVideoLandingPageActivity.this.hYh = marginLayoutParams.width;
                TTVideoLandingPageActivity.this.zF = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                TTVideoLandingPageActivity.this.tsL.setLayoutParams(marginLayoutParams);
                return;
            }
            tr.EYQ((View) TTVideoLandingPageActivity.this.EYQ, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.tsL.getLayoutParams();
            marginLayoutParams2.width = TTVideoLandingPageActivity.this.hYh;
            marginLayoutParams2.height = TTVideoLandingPageActivity.this.zF;
            marginLayoutParams2.leftMargin = TTVideoLandingPageActivity.this.Uc;
            marginLayoutParams2.topMargin = TTVideoLandingPageActivity.this.UB;
            TTVideoLandingPageActivity.this.tsL.setLayoutParams(marginLayoutParams2);
        }
    };
    private final NZ.EYQ VOV = new NZ.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.NZ.EYQ
        public void EYQ(Context context, Intent intent, boolean z, final int i) {
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    EYQ(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void EYQ(int i) {
            if (TTVideoLandingPageActivity.this.mN == 0 && i != 0 && TTVideoLandingPageActivity.this.EYQ != null && TTVideoLandingPageActivity.this.kf != null) {
                TTVideoLandingPageActivity.this.EYQ.a_(TTVideoLandingPageActivity.this.kf);
            }
            if (TTVideoLandingPageActivity.this.nWX != null && TTVideoLandingPageActivity.this.nWX.getNativeVideoController() != null && !TTVideoLandingPageActivity.this.Tnp && TTVideoLandingPageActivity.this.mN != i) {
                ((com.bytedance.sdk.openadsdk.core.video.nativevideo.Td) TTVideoLandingPageActivity.this.nWX.getNativeVideoController()).Td(i);
            }
            TTVideoLandingPageActivity.this.mN = i;
        }
    };

    protected abstract View EYQ();

    protected abstract boolean Kbd();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws JSONException {
        SSWebView sSWebView;
        super.onCreate(bundle);
        if (!pi.Kbd()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            hu.EYQ(this);
        } catch (Throwable unused2) {
        }
        this.mN = com.bytedance.sdk.component.utils.hu.Td(getApplicationContext());
        try {
            setContentView(EYQ());
            this.Kbd = this;
            Intent intent = getIntent();
            this.IPb = intent.getIntExtra("sdk_version", 1);
            this.QQ = intent.getStringExtra("adid");
            this.HX = intent.getStringExtra("log_extra");
            this.MxO = intent.getIntExtra(FirebaseAnalytics.Param.SOURCE, -1);
            this.kf = intent.getStringExtra("url");
            String stringExtra = intent.getStringExtra("web_title");
            this.tr = intent.getStringExtra("event_tag");
            this.XPd = intent.getStringExtra("gecko_id");
            this.PI = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.KO = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (mZx.Td()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.hu = com.bytedance.sdk.openadsdk.core.mZx.EYQ(new JSONObject(stringExtra3));
                    } catch (Exception unused3) {
                    }
                }
                UB ub = this.hu;
                if (ub != null) {
                    this.pi = ub.by();
                }
            } else {
                UB ubMZx = zF.EYQ().mZx();
                this.hu = ubMZx;
                if (ubMZx != null) {
                    this.pi = ubMZx.by();
                }
                zF.EYQ().IPb();
            }
            if (this.hu == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.XPd)) {
                this.wJ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().mZx();
                int iEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(this.wJ, this.XPd);
                this.TQF = iEYQ;
                this.OtA = iEYQ > 0 ? 2 : 0;
            }
            if (stringExtra2 != null) {
                try {
                    this.Kbc = com.bytedance.sdk.openadsdk.multipro.mZx.EYQ.EYQ(new JSONObject(stringExtra2));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.mZx.EYQ eyq = this.Kbc;
                if (eyq != null) {
                    this.KO = eyq.VwS;
                }
            }
            if (bundle != null) {
                String string = bundle.getString("material_meta");
                if (this.hu == null) {
                    try {
                        this.hu = com.bytedance.sdk.openadsdk.core.mZx.EYQ(new JSONObject(string));
                    } catch (Throwable unused5) {
                    }
                }
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.KO = j;
                }
            }
            Td();
            HX();
            pi();
            EYQ(4);
            if (this.EYQ != null) {
                com.bytedance.sdk.openadsdk.core.widget.EYQ.Td.EYQ(this.Kbd).EYQ(true).mZx(false).EYQ(this.EYQ.getWebView());
                tp tpVarEYQ = new tp(this.hu, this.EYQ.getWebView(), new HX() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.mZx.HX
                    public void EYQ(int i) {
                        Td.EYQ.EYQ(TTVideoLandingPageActivity.this.TQF, TTVideoLandingPageActivity.this.na.get(), TTVideoLandingPageActivity.this.KR.get(), TTVideoLandingPageActivity.this.wa.get() - TTVideoLandingPageActivity.this.KR.get(), TTVideoLandingPageActivity.this.hu, "landingpage_split_screen", i);
                    }
                }, this.OtA).EYQ(true);
                this.Pf = tpVarEYQ;
                tpVarEYQ.EYQ("landingpage_split_screen");
            }
            SSWebView sSWebView2 = this.EYQ;
            if (sSWebView2 != null) {
                sSWebView2.setLandingPage(true);
                this.EYQ.setTag("landingpage_split_screen");
                this.EYQ.setMaterialMeta(this.hu.dbE());
                this.EYQ.setWebViewClient(new Kbd(this.Kbd, this.tp, this.QQ, this.Pf, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (!TextUtils.isEmpty(TTVideoLandingPageActivity.this.XPd)) {
                                TTVideoLandingPageActivity.this.wa.incrementAndGet();
                                WebResourceResponseModel webResourceResponseModelEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(TTVideoLandingPageActivity.this.wJ, TTVideoLandingPageActivity.this.XPd, str);
                                if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getWebResourceResponse() != null) {
                                    TTVideoLandingPageActivity.this.KR.incrementAndGet();
                                    return webResourceResponseModelEYQ.getWebResourceResponse();
                                }
                                if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getMsg() == 2) {
                                    TTVideoLandingPageActivity.this.na.incrementAndGet();
                                }
                                return super.shouldInterceptRequest(webView, str);
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.pi.EYQ("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                SSWebView sSWebView3 = this.EYQ;
                sSWebView3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.pi.EYQ(sSWebView3.getWebView(), this.IPb));
            }
            if (Build.VERSION.SDK_INT >= 21 && (sSWebView = this.EYQ) != null) {
                sSWebView.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.hu, "landingpage_split_screen", this.OtA);
            KO.EYQ(this.EYQ, this.kf);
            this.EYQ.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.tp, this.Pf) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.EYQ.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
                    if (TTVideoLandingPageActivity.this.Nvm != null) {
                        TTVideoLandingPageActivity.this.Nvm.Pm();
                    }
                }
            });
            TextView textView = this.Pm;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = com.bytedance.sdk.component.utils.zF.EYQ(this, "tt_web_title_default");
                }
                textView.setText(stringExtra);
            }
            tp();
            Pm();
            tsL();
            Td.EYQ.EYQ(SystemClock.elapsedRealtime() - jElapsedRealtime, this.hu, "landingpage_split_screen", this.wJ, this.XPd);
        } catch (Throwable unused6) {
            finish();
        }
    }

    private void tsL() {
        UB ub = this.hu;
        if (ub == null || ub.Pf() != 4) {
            return;
        }
        this.lEs.setVisibility(0);
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.tp.aEX);
        this.xt = button;
        if (button != null) {
            EYQ(mZx());
            this.xt.setOnClickListener(this.Dal);
            this.xt.setOnTouchListener(this.Dal);
        }
    }

    protected String mZx() {
        UB ub = this.hu;
        if (ub != null && !TextUtils.isEmpty(ub.TZn())) {
            this.WU = this.hu.TZn();
        }
        return this.WU;
    }

    private void EYQ(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.xt) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (TTVideoLandingPageActivity.this.xt == null || TTVideoLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.xt.setText(str);
            }
        });
    }

    protected void Td() {
        this.lEs = (PangleViewStub) findViewById(com.bytedance.sdk.openadsdk.utils.tp.VOV);
        this.EYQ = (SSWebView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.Dal);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.mZx = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    if (TTVideoLandingPageActivity.this.EYQ != null) {
                        if (!TTVideoLandingPageActivity.this.EYQ.Kbd()) {
                            if (TTVideoLandingPageActivity.this.UB()) {
                                TTVideoLandingPageActivity.this.onBackPressed();
                                return;
                            }
                            JSONObject jSONObjectEYQ = null;
                            if (TTVideoLandingPageActivity.this.nWX != null && TTVideoLandingPageActivity.this.nWX.getNativeVideoController() != null) {
                                jSONObjectEYQ = FH.EYQ(TTVideoLandingPageActivity.this.hu, TTVideoLandingPageActivity.this.nWX.getNativeVideoController().IPb(), TTVideoLandingPageActivity.this.nWX.getNativeVideoController().tsL());
                            }
                            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(TTVideoLandingPageActivity.this.hu, "embeded_ad", "detail_back", TTVideoLandingPageActivity.this.IPb(), TTVideoLandingPageActivity.this.VwS(), jSONObjectEYQ, (VwS) null);
                            TTVideoLandingPageActivity.this.finish();
                            return;
                        }
                        TTVideoLandingPageActivity.this.EYQ.IPb();
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.nWX;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.PI);
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.mN);
        this.Td = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.nWX != null) {
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(TTVideoLandingPageActivity.this.hu, "embeded_ad", "detail_skip", TTVideoLandingPageActivity.this.IPb(), TTVideoLandingPageActivity.this.VwS(), TTVideoLandingPageActivity.this.nWX.getNativeVideoController() != null ? FH.EYQ(TTVideoLandingPageActivity.this.hu, TTVideoLandingPageActivity.this.nWX.getNativeVideoController().IPb(), TTVideoLandingPageActivity.this.nWX.getNativeVideoController().tsL()) : null, (VwS) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.Pm = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.XT);
        this.tsL = (FrameLayout) findViewById(com.bytedance.sdk.openadsdk.utils.tp.kf);
        this.XN = (RelativeLayout) findViewById(com.bytedance.sdk.openadsdk.utils.tp.Kbc);
        this.NZ = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.vD);
        this.wBa = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.lRN);
        this.rfB = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.XPd);
        this.tPj = (CornerIV) findViewById(com.bytedance.sdk.openadsdk.utils.tp.Pf);
        QQ();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tsL();
    }

    protected void Pm() {
        if (Kbd()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.Kbd, this.hu, true, null);
                this.nWX = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.nWX.getNativeVideoController().EYQ(false);
                }
                if (this.Tnp) {
                    this.tsL.setVisibility(0);
                    this.tsL.removeAllViews();
                    this.tsL.addView(this.nWX);
                    this.nWX.mZx(true);
                } else {
                    if (!this.PI) {
                        this.KO = 0L;
                    }
                    if (this.Kbc != null && this.nWX.getNativeVideoController() != null) {
                        this.nWX.getNativeVideoController().mZx(this.Kbc.VwS);
                        this.nWX.getNativeVideoController().Td(this.Kbc.Kbd);
                        this.nWX.setIsQuiet(hu.Pm().Td(String.valueOf(this.hu.yK())));
                    }
                    if (this.nWX.EYQ(this.KO, this.FtN, this.Tnp)) {
                        this.tsL.setVisibility(0);
                        this.tsL.removeAllViews();
                        this.tsL.addView(this.nWX);
                    }
                    if (this.nWX.getNativeVideoController() != null) {
                        this.nWX.getNativeVideoController().EYQ(false);
                        this.nWX.getNativeVideoController().EYQ(this.TZn);
                    }
                }
                String strEYQ = this.hu.Dal().get(0).EYQ();
                com.bytedance.sdk.openadsdk.IPb.Pm.EYQ().EYQ(strEYQ).EYQ(this.hu.Dal().get(0).mZx()).mZx(this.hu.Dal().get(0).Td()).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).Td(2).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(this.hu, strEYQ, new com.bytedance.sdk.component.Pm.hu<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.Pm.hu
                    public void EYQ(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.Pm.hu
                    public void EYQ(MxO<Bitmap> mxO) {
                        try {
                            Bitmap bitmapMZx = mxO.mZx();
                            if (Build.VERSION.SDK_INT >= 17) {
                                new EYQ(bitmapMZx, TTVideoLandingPageActivity.this.nWX.getNativeVideoController().pi()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.nWX.findViewById(520093726).setOnTouchListener(null);
                this.nWX.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTVideoLandingPage", e.getMessage());
                if (this.nWX == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e);
                }
            }
            if (this.mN == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.zF.mZx(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    protected long IPb() {
        NativeVideoTsView nativeVideoTsView = this.nWX;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0L;
        }
        return this.nWX.getNativeVideoController().QQ();
    }

    protected int VwS() {
        NativeVideoTsView nativeVideoTsView = this.nWX;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.nWX.getNativeVideoController().tp();
    }

    protected void QQ() {
        String strKbc;
        UB ub = this.hu;
        if (ub == null || ub.Pf() != 4) {
            return;
        }
        tr.EYQ((View) this.XN, 0);
        if (!TextUtils.isEmpty(this.hu.TQF())) {
            strKbc = this.hu.TQF();
        } else if (!TextUtils.isEmpty(this.hu.OtA())) {
            strKbc = this.hu.OtA();
        } else {
            strKbc = !TextUtils.isEmpty(this.hu.Kbc()) ? this.hu.Kbc() : "";
        }
        if (this.hu.vD() != null && this.hu.vD().EYQ() != null) {
            tr.EYQ((View) this.tPj, 0);
            tr.EYQ((View) this.NZ, 4);
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.hu.vD(), this.tPj, this.hu);
        } else if (!TextUtils.isEmpty(strKbc)) {
            tr.EYQ((View) this.tPj, 4);
            tr.EYQ((View) this.NZ, 0);
            this.NZ.setText(strKbc.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.hu.TZn())) {
            this.rfB.setText(this.hu.TZn());
        }
        if (!TextUtils.isEmpty(strKbc)) {
            this.wBa.setText(strKbc);
        }
        tr.EYQ((View) this.wBa, 0);
        tr.EYQ((View) this.rfB, 0);
    }

    public void HX() {
        UB ub = this.hu;
        if (ub == null) {
            return;
        }
        this.Nvm = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(this, ub, this.tr);
        com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(this, this.hu, this.tr, this.MxO);
        this.Dal = eyq;
        eyq.EYQ(false);
        this.Dal.Td(true);
        this.rfB.setOnClickListener(this.Dal);
        this.rfB.setOnTouchListener(this.Dal);
        this.Dal.EYQ(this.Nvm);
    }

    private void pi() {
        wBa wba = new wBa(this);
        this.tp = wba;
        wba.mZx(this.EYQ).Td(this.QQ).Pm(this.HX).mZx(this.MxO).EYQ(this.hu).EYQ(this.hu.FtN()).EYQ(this.EYQ).mZx("landingpage_split_screen").Kbd(this.hu.TfI());
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        NativeVideoTsView nativeVideoTsView;
        if (this.FH && (nativeVideoTsView = this.nWX) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((com.bykv.vk.openvk.component.video.api.Pm.EYQ) this.nWX.getNativeVideoController()).Kbd(null, null);
            this.FH = false;
        } else if (UB() && !this.vD.getAndSet(true)) {
            Uc();
            EYQ(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        UB ub = this.hu;
        bundle.putString("material_meta", ub != null ? ub.aEX().toString() : null);
        bundle.putLong("video_play_position", this.KO);
        bundle.putBoolean("is_complete", this.Tnp);
        long jKbd = this.KO;
        NativeVideoTsView nativeVideoTsView = this.nWX;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            jKbd = this.nWX.getNativeVideoController().Kbd();
        }
        bundle.putLong("video_play_position", jKbd);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super.onResume();
        if (!this.FtN) {
            nWX();
        }
        this.FtN = false;
        wBa wba = this.tp;
        if (wba != null) {
            wba.MxO();
        }
        tp tpVar = this.Pf;
        if (tpVar != null) {
            tpVar.VwS();
        }
    }

    private void nWX() {
        NativeVideoTsView nativeVideoTsView = this.nWX;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null || hu()) {
            return;
        }
        this.nWX.pi();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        KO();
        NativeVideoTsView nativeVideoTsView = this.nWX;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return;
        }
        EYQ(this.nWX.getNativeVideoController());
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        tp tpVar = this.Pf;
        if (tpVar != null) {
            tpVar.QQ();
        }
    }

    private void EYQ(com.bykv.vk.openvk.component.video.api.Pm.Td td) {
        this.Tnp = this.Tnp || td.KO();
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.TRUE);
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_isfromvideodetailpage", Boolean.TRUE);
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.Tnp));
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(td.Kbd()));
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(td.QQ() + td.IPb()));
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_duration", Long.valueOf(td.QQ()));
    }

    private void KO() {
        if (this.nWX == null || hu()) {
            return;
        }
        this.nWX.pi();
    }

    private boolean hu() {
        NativeVideoTsView nativeVideoTsView = this.nWX;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return true;
        }
        return this.nWX.getNativeVideoController().KO();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        MxO();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.hu.IPb(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.EYQ;
        if (sSWebView != null) {
            com.bytedance.sdk.openadsdk.core.xt.EYQ(sSWebView.getWebView());
        }
        this.EYQ = null;
        wBa wba = this.tp;
        if (wba != null) {
            wba.tsL();
        }
        NativeVideoTsView nativeVideoTsView = this.nWX;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            this.nWX.getNativeVideoController().Pm();
        }
        this.nWX = null;
        this.hu = null;
        tp tpVar = this.Pf;
        if (tpVar != null) {
            tpVar.Td(true);
        }
        if (!TextUtils.isEmpty(this.XPd)) {
            Td.EYQ.EYQ(this.KR.get(), this.wa.get(), this.hu);
        }
        com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(this.wJ);
    }

    protected void tp() {
        NZ.EYQ(this.VOV, this.Kbd);
    }

    protected void MxO() {
        try {
            NZ.EYQ(this.VOV);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean UB() {
        return !TextUtils.isEmpty(this.kf) && this.kf.contains("__luban_sdk");
    }

    private void EYQ(final int i) {
        if (this.Td == null || !UB()) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                tr.EYQ((View) TTVideoLandingPageActivity.this.Td, i);
            }
        });
    }

    private void Uc() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.tp.EYQ("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.VwS.Pm
    public void EYQ(boolean z, JSONArray jSONArray) {
        if (!z || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.lRN = jSONArray;
    }

    private static class EYQ extends AsyncTask<Void, Void, Drawable> {
        private final Bitmap EYQ;
        private final WeakReference<com.bykv.vk.openvk.component.video.api.Pm.mZx> mZx;

        private EYQ(Bitmap bitmap, com.bykv.vk.openvk.component.video.api.Pm.mZx mzx) {
            this.EYQ = bitmap;
            this.mZx = new WeakReference<>(mzx);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap bitmapEYQ = com.bytedance.sdk.component.adexpress.Pm.EYQ.EYQ(hu.EYQ(), this.EYQ, 25);
                if (bitmapEYQ == null) {
                    return null;
                }
                return new BitmapDrawable(hu.EYQ().getResources(), bitmapEYQ);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.component.video.api.Pm.mZx> weakReference;
            if (drawable == null || (weakReference = this.mZx) == null || weakReference.get() == null) {
                return;
            }
            this.mZx.get().EYQ(drawable);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.Td.EYQ(this, this.hu);
    }
}
