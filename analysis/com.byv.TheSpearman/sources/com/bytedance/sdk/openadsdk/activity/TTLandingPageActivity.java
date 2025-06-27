package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.VwS.Pm;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserDownloadButton;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewBottomBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewTitleBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserTitleBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserTitleBarForDark;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.common.QQ;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.mZx.EYQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd;
import com.bytedance.sdk.openadsdk.core.zF;
import com.bytedance.sdk.openadsdk.mZx.HX;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.mZx.tp;
import com.bytedance.sdk.openadsdk.multipro.mZx;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.KO;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.com.bytedance.overseas.sdk.EYQ.Td;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTLandingPageActivity extends TTBaseActivity implements Pm {
    tp EYQ;
    private boolean FH;
    private LandingPageLoadingLayout FtN;
    private TextView HX;
    private SSWebView IPb;
    private String KO;
    private PangleViewStub MxO;
    private String NZ;
    private boolean PI;
    private ImageView QQ;
    TTAdDislikeToast Td;
    private QQ Tnp;
    private int UB;
    private String Uc;
    private String WU;
    private UB hYh;
    private wBa hu;
    private int lEs;
    TTAdDislikeDialog mZx;
    private String nWX;
    private PAGProgressBar pi;
    private ILoader tPj;
    private Context tp;
    private com.bytedance.sdk.openadsdk.common.tp tr;
    private Button tsL;
    private int xt;
    private Td zF;
    private final AtomicBoolean XN = new AtomicBoolean(true);
    private final AtomicInteger wBa = new AtomicInteger(0);
    private final AtomicInteger rfB = new AtomicInteger(0);
    private final AtomicInteger Nvm = new AtomicInteger(0);
    final AtomicBoolean Pm = new AtomicBoolean(false);
    final AtomicBoolean Kbd = new AtomicBoolean(false);
    private String kf = "ダウンロード";

    @Override // com.bytedance.sdk.openadsdk.VwS.Pm
    public void EYQ(boolean z, JSONArray jSONArray) {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws JSONException {
        SSWebView sSWebView;
        EYQ(3);
        super.onCreate(bundle);
        if (!pi.Kbd()) {
            finish();
            return;
        }
        try {
            hu.EYQ(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            setContentView(mZx());
            Intent intent = getIntent();
            int intExtra = intent.getIntExtra("sdk_version", 1);
            this.nWX = intent.getStringExtra("adid");
            this.KO = intent.getStringExtra("log_extra");
            this.UB = intent.getIntExtra(FirebaseAnalytics.Param.SOURCE, -1);
            String stringExtra = intent.getStringExtra("url");
            this.WU = stringExtra;
            mZx(4);
            String stringExtra2 = intent.getStringExtra("web_title");
            this.Uc = intent.getStringExtra("event_tag");
            this.NZ = intent.getStringExtra("gecko_id");
            if (mZx.Td()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.hYh = com.bytedance.sdk.openadsdk.core.mZx.EYQ(new JSONObject(stringExtra3));
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.hYh = zF.EYQ().mZx();
                zF.EYQ().IPb();
            }
            if (this.hYh == null) {
                finish();
                return;
            }
            this.FH = hu.Pm().NZ();
            Kbd();
            if (!TextUtils.isEmpty(this.NZ)) {
                this.tPj = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().mZx();
                int iEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(this.tPj, this.NZ);
                this.lEs = iEYQ;
                this.xt = iEYQ > 0 ? 2 : 0;
            }
            this.tp = this;
            if (this.IPb != null) {
                com.bytedance.sdk.openadsdk.core.widget.EYQ.Td.EYQ(this).EYQ(false).mZx(false).EYQ(this.IPb.getWebView());
            }
            SSWebView sSWebView2 = this.IPb;
            if (sSWebView2 != null && sSWebView2.getWebView() != null) {
                this.EYQ = new tp(this.hYh, this.IPb.getWebView(), new HX() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.mZx.HX
                    public void EYQ(int i) {
                        Td.EYQ.EYQ(TTLandingPageActivity.this.lEs, TTLandingPageActivity.this.rfB.get(), TTLandingPageActivity.this.Nvm.get(), TTLandingPageActivity.this.wBa.get() - TTLandingPageActivity.this.Nvm.get(), TTLandingPageActivity.this.hYh, "landingpage", i);
                    }
                }, this.xt).EYQ(true);
            }
            IPb();
            this.IPb.setLandingPage(true);
            this.IPb.setTag("landingpage");
            this.IPb.setMaterialMeta(this.hYh.dbE());
            this.IPb.setWebViewClient(new Kbd(this.tp, this.hu, this.nWX, this.EYQ, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.pi != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.pi.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.FtN != null) {
                        TTLandingPageActivity.this.FtN.mZx();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (!TextUtils.isEmpty(TTLandingPageActivity.this.NZ)) {
                            TTLandingPageActivity.this.wBa.incrementAndGet();
                            WebResourceResponseModel webResourceResponseModelEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(TTLandingPageActivity.this.tPj, TTLandingPageActivity.this.NZ, str);
                            if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getWebResourceResponse() != null) {
                                TTLandingPageActivity.this.Nvm.incrementAndGet();
                                return webResourceResponseModelEYQ.getWebResourceResponse();
                            }
                            if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getMsg() == 2) {
                                TTLandingPageActivity.this.rfB.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            });
            SSWebView sSWebView3 = this.IPb;
            if (sSWebView3 != null) {
                sSWebView3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.pi.EYQ(sSWebView3.getWebView(), intExtra));
            }
            if (Build.VERSION.SDK_INT >= 21 && (sSWebView = this.IPb) != null) {
                sSWebView.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.hYh, "landingpage", this.xt);
            KO.EYQ(this.IPb, stringExtra);
            this.IPb.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.hu, this.EYQ) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (TTLandingPageActivity.this.FtN != null) {
                        TTLandingPageActivity.this.FtN.EYQ(i);
                    }
                    if (TTLandingPageActivity.this.FH) {
                        if (TTLandingPageActivity.this.tr != null) {
                            TTLandingPageActivity.this.tr.EYQ(i);
                        }
                        if (TTLandingPageActivity.this.Tnp == null || i != 100) {
                            return;
                        }
                        TTLandingPageActivity.this.Tnp.EYQ(webView);
                        return;
                    }
                    if (TTLandingPageActivity.this.pi == null || TTLandingPageActivity.this.isFinishing()) {
                        return;
                    }
                    if (i != 100 || !TTLandingPageActivity.this.pi.isShown()) {
                        TTLandingPageActivity.this.pi.setProgress(i);
                    } else {
                        TTLandingPageActivity.this.pi.setVisibility(8);
                    }
                }
            });
            if (this.IPb.getWebView() != null) {
                if (this.FH) {
                    this.IPb.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.13
                        float EYQ = 0.0f;

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (TTLandingPageActivity.this.EYQ != null) {
                                TTLandingPageActivity.this.EYQ.mZx(motionEvent.getActionMasked());
                            }
                            if (motionEvent.getAction() == 0) {
                                this.EYQ = motionEvent.getY();
                            }
                            if (motionEvent.getAction() == 2) {
                                float y = motionEvent.getY();
                                float f = this.EYQ;
                                if (y - f > 8.0f) {
                                    if (TTLandingPageActivity.this.tr != null) {
                                        TTLandingPageActivity.this.tr.EYQ();
                                    }
                                    if (TTLandingPageActivity.this.Tnp != null) {
                                        TTLandingPageActivity.this.Tnp.EYQ();
                                    }
                                    return false;
                                }
                                if (y - f < -8.0f) {
                                    if (TTLandingPageActivity.this.tr != null) {
                                        TTLandingPageActivity.this.tr.mZx();
                                    }
                                    if (TTLandingPageActivity.this.Tnp != null) {
                                        TTLandingPageActivity.this.Tnp.mZx();
                                    }
                                }
                            }
                            return false;
                        }
                    });
                } else {
                    this.IPb.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.14
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (TTLandingPageActivity.this.EYQ == null) {
                                return false;
                            }
                            TTLandingPageActivity.this.EYQ.mZx(motionEvent.getActionMasked());
                            return false;
                        }
                    });
                }
            }
            this.IPb.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.15
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (TTLandingPageActivity.this.zF != null) {
                        TTLandingPageActivity.this.zF.Pm();
                    }
                }
            });
            TextView textView = this.HX;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = com.bytedance.sdk.component.utils.zF.EYQ(this, "tt_web_title_default");
                }
                textView.setText(stringExtra2);
            }
            Td();
            Td.EYQ.EYQ(SystemClock.elapsedRealtime() - jElapsedRealtime, this.hYh, "landingpage", this.tPj, this.NZ);
        } catch (Throwable unused2) {
            finish();
        }
    }

    private View mZx() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setOrientation(1);
        pAGFrameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        PangleViewStub pangleViewStub = new PangleViewStub(this, new PangleViewStub.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.16
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.EYQ
            public View EYQ(Context context) {
                return new LandingPageBrowserTitleBar(context);
            }
        });
        pangleViewStub.setId(com.bytedance.sdk.openadsdk.utils.tp.xh);
        pAGLinearLayout.addView(pangleViewStub, new LinearLayout.LayoutParams(-1, tr.mZx(this, 44.0f)));
        PangleViewStub pangleViewStub2 = new PangleViewStub(this, new PangleViewStub.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.17
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.EYQ
            public View EYQ(Context context) {
                return new LandingPageBrowserTitleBarForDark(context);
            }
        });
        pangleViewStub2.setId(com.bytedance.sdk.openadsdk.utils.tp.dVQ);
        pAGLinearLayout.addView(pangleViewStub2, new LinearLayout.LayoutParams(-1, tr.mZx(this, 44.0f)));
        PangleViewStub pangleViewStub3 = new PangleViewStub(this, new PangleViewStub.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.18
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.EYQ
            public View EYQ(Context context) {
                return new LandingPageBrowserNewTitleBar(context);
            }
        });
        pangleViewStub3.setId(com.bytedance.sdk.openadsdk.utils.tp.GfQ);
        pAGLinearLayout.addView(pangleViewStub3, new LinearLayout.LayoutParams(-1, tr.mZx(this, 44.0f)));
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(pAGFrameLayout2, layoutParams);
        SSWebView sSWebView = new SSWebView(this);
        sSWebView.setId(com.bytedance.sdk.openadsdk.utils.tp.Dal);
        pAGFrameLayout2.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        PangleViewStub pangleViewStub4 = new PangleViewStub(this, new PangleViewStub.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.EYQ
            public View EYQ(Context context) {
                return new LandingPageBrowserDownloadButton(context);
            }
        });
        pangleViewStub4.setId(com.bytedance.sdk.openadsdk.utils.tp.VOV);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        pAGFrameLayout2.addView(pangleViewStub4, layoutParams2);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
        pAGProgressBar.setId(com.bytedance.sdk.openadsdk.utils.tp.by);
        pAGProgressBar.setProgress(1);
        pAGProgressBar.setVisibility(8);
        pAGProgressBar.setProgressDrawable(com.bytedance.sdk.component.utils.zF.Td(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, tr.mZx(this, 3.0f));
        layoutParams3.gravity = 49;
        pAGFrameLayout2.addView(pAGProgressBar, layoutParams3);
        PangleViewStub pangleViewStub5 = new PangleViewStub(this, new PangleViewStub.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.EYQ
            public View EYQ(Context context) {
                return new LandingPageBrowserNewBottomBar(context);
            }
        });
        pangleViewStub5.setId(com.bytedance.sdk.openadsdk.utils.tp.Nuq);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, tr.mZx(this, 44.0f));
        layoutParams4.gravity = 80;
        pAGFrameLayout2.addView(pangleViewStub5, layoutParams4);
        LandingPageLoadingLayout landingPageLoadingLayout = new LandingPageLoadingLayout(this);
        landingPageLoadingLayout.setId(520093721);
        pAGFrameLayout.addView(landingPageLoadingLayout, new FrameLayout.LayoutParams(-1, -1));
        return pAGFrameLayout;
    }

    private void EYQ(int i) {
        if (i == 1 || Build.VERSION.SDK_INT == 26) {
            return;
        }
        if (Build.VERSION.SDK_INT == 27) {
            try {
                setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        } else {
            setRequestedOrientation(i);
        }
    }

    private void Td() {
        UB ub = this.hYh;
        if (ub == null || ub.Pf() != 4) {
            return;
        }
        PangleViewStub pangleViewStub = this.MxO;
        if (pangleViewStub != null) {
            pangleViewStub.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.tp.aEX);
        this.tsL = button;
        if (button != null) {
            EYQ(Pm());
            if (this.zF == null) {
                this.zF = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(this, this.hYh, TextUtils.isEmpty(this.Uc) ? FH.mZx(this.UB) : this.Uc);
            }
            EYQ eyq = new EYQ(this, this.hYh, this.Uc, this.UB);
            eyq.EYQ(false);
            this.tsL.setOnClickListener(eyq);
            this.tsL.setOnTouchListener(eyq);
            eyq.Td(true);
            eyq.EYQ(this.zF);
        }
    }

    private String Pm() {
        UB ub = this.hYh;
        if (ub != null && !TextUtils.isEmpty(ub.TZn())) {
            this.kf = this.hYh.TZn();
        }
        return this.kf;
    }

    private void EYQ(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.tsL) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.tsL == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.tsL.setText(str);
            }
        });
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Td();
    }

    private void Kbd() {
        this.IPb = (SSWebView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.Dal);
        this.MxO = (PangleViewStub) findViewById(com.bytedance.sdk.openadsdk.utils.tp.VOV);
        PangleViewStub pangleViewStub = (PangleViewStub) findViewById(com.bytedance.sdk.openadsdk.utils.tp.xh);
        PangleViewStub pangleViewStub2 = (PangleViewStub) findViewById(com.bytedance.sdk.openadsdk.utils.tp.dVQ);
        LandingPageLoadingLayout landingPageLoadingLayout = (LandingPageLoadingLayout) findViewById(520093721);
        this.FtN = landingPageLoadingLayout;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.EYQ(this.hYh, this.Uc, true);
            this.FtN.EYQ();
        }
        if (this.FH) {
            PangleViewStub pangleViewStub3 = (PangleViewStub) findViewById(com.bytedance.sdk.openadsdk.utils.tp.GfQ);
            PangleViewStub pangleViewStub4 = (PangleViewStub) findViewById(com.bytedance.sdk.openadsdk.utils.tp.Nuq);
            pangleViewStub3.setVisibility(0);
            pangleViewStub4.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(com.bytedance.sdk.openadsdk.utils.tp.VEW);
            LinearLayout linearLayout = (LinearLayout) findViewById(com.bytedance.sdk.openadsdk.utils.tp.XL);
            com.bytedance.sdk.openadsdk.common.tp tpVar = new com.bytedance.sdk.openadsdk.common.tp(this, relativeLayout, this.hYh);
            this.tr = tpVar;
            ImageView imageViewTd = tpVar.Td();
            this.QQ = imageViewTd;
            imageViewTd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
            this.Tnp = new QQ(this, linearLayout, this.IPb, this.hYh, "landingpage");
            return;
        }
        int iPi = com.bytedance.sdk.openadsdk.core.QQ.mZx().pi();
        if (iPi != 0) {
            if (iPi == 1 && pangleViewStub2 != null) {
                pangleViewStub2.setVisibility(0);
            }
        } else if (pangleViewStub != null) {
            pangleViewStub.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(520093720);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    if (TTLandingPageActivity.this.IPb != null) {
                        if (TTLandingPageActivity.this.IPb.Kbd()) {
                            TTLandingPageActivity.this.IPb.IPb();
                        } else if (TTLandingPageActivity.this.VwS()) {
                            TTLandingPageActivity.this.onBackPressed();
                        } else {
                            TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(520093716);
        this.QQ = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.HX = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.XT);
        PAGProgressBar pAGProgressBar = (PAGProgressBar) findViewById(com.bytedance.sdk.openadsdk.utils.tp.by);
        this.pi = pAGProgressBar;
        pAGProgressBar.setVisibility(0);
        TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.tp.Ko);
        textView.setText(com.bytedance.sdk.component.utils.zF.EYQ(hu.EYQ(), "tt_reward_feedback"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTLandingPageActivity.this.EYQ();
            }
        });
    }

    private void IPb() {
        wBa wba = new wBa(this);
        this.hu = wba;
        wba.mZx(this.IPb).Td(this.nWX).Pm(this.KO).EYQ(this.hYh).mZx(this.UB).EYQ(this.hYh.FtN()).Kbd(this.hYh.TfI()).EYQ(this.IPb).mZx("landingpage").EYQ(this);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super.onResume();
        wBa wba = this.hu;
        if (wba != null) {
            wba.MxO();
        }
        tp tpVar = this.EYQ;
        if (tpVar != null) {
            tpVar.VwS();
        }
        if (this.PI) {
            return;
        }
        this.PI = true;
        EYQ(4);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        tp tpVar = this.EYQ;
        if (tpVar != null) {
            tpVar.QQ();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        if (VwS() && !this.XN.getAndSet(true)) {
            QQ();
            mZx(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean VwS() {
        return !TextUtils.isEmpty(this.WU) && this.WU.contains("__luban_sdk");
    }

    private void mZx(final int i) {
        if (this.QQ == null || !VwS()) {
            return;
        }
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // java.lang.Runnable
            public void run() {
                tr.EYQ((View) TTLandingPageActivity.this.QQ, i);
            }
        });
    }

    private void QQ() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.hu.EYQ("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        SSWebView sSWebView;
        super.onDestroy();
        tp tpVar = this.EYQ;
        if (tpVar != null && (sSWebView = this.IPb) != null) {
            tpVar.EYQ(sSWebView);
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView2 = this.IPb;
        if (sSWebView2 != null) {
            com.bytedance.sdk.openadsdk.core.xt.EYQ(sSWebView2.getWebView());
        }
        this.IPb = null;
        wBa wba = this.hu;
        if (wba != null) {
            wba.tsL();
        }
        tp tpVar2 = this.EYQ;
        if (tpVar2 != null) {
            tpVar2.Td(true);
        }
        if (!TextUtils.isEmpty(this.NZ)) {
            Td.EYQ.EYQ(this.Nvm.get(), this.wBa.get(), this.hYh);
        }
        com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(this.tPj);
    }

    protected void EYQ() {
        if (isFinishing()) {
            return;
        }
        if (this.Kbd.get()) {
            tp();
            return;
        }
        if (this.mZx == null) {
            HX();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.mZx;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.EYQ();
        }
    }

    private void HX() {
        try {
            if (this.mZx == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.tp, this.hYh);
                this.mZx = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void EYQ(View view) {
                        TTLandingPageActivity.this.Pm.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void mZx(View view) {
                        TTLandingPageActivity.this.Pm.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void EYQ(int i, FilterWord filterWord) {
                        if (TTLandingPageActivity.this.Kbd.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.Kbd.set(true);
                        TTLandingPageActivity.this.MxO();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.mZx);
            if (this.Td == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.tp);
                this.Td = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void tp() {
        TTAdDislikeToast tTAdDislikeToast = this.Td;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.EYQ(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MxO() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.Td) == null) {
            return;
        }
        tTAdDislikeToast.EYQ(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.Td.EYQ(this, this.hYh);
    }
}
