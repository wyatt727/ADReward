package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.xt;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: LandingPageModel.java */
/* loaded from: classes2.dex */
public class KO implements Handler.Callback {
    ImageView EYQ;
    private final Activity FH;
    private com.bytedance.sdk.openadsdk.mZx.tp FtN;
    ObjectAnimator HX;
    RelativeLayout IPb;
    private Handler KO;
    private com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd Kbc;
    View Kbd;
    ObjectAnimator MxO;
    private FrameLayout NZ;
    private boolean PI;
    private String Pf;
    FrameLayout Pm;
    FrameLayout QQ;
    TextView Td;
    private com.com.bytedance.overseas.sdk.EYQ.Td Tnp;
    private TextView UB;
    private TextView Uc;
    final UB VwS;
    private wBa WU;
    private SSWebView XN;
    private TTRoundRectImageView hYh;
    private View hu;
    private View lEs;
    private boolean mN;
    FrameLayout mZx;
    com.bytedance.sdk.openadsdk.core.mZx.mZx nWX;
    com.bytedance.sdk.openadsdk.core.mZx.EYQ pi;
    private ImageView rfB;
    private LandingPageLoadingLayout tPj;
    ObjectAnimator tp;
    private String tr;
    Td.EYQ tsL;
    private ILoader vD;
    private View wBa;
    private int wJ;
    private int wa;
    private long xt;
    private TextView zF;
    private final AtomicBoolean Nvm = new AtomicBoolean(false);
    private final AtomicBoolean kf = new AtomicBoolean(false);
    private volatile int lRN = 0;
    private volatile int XPd = 0;
    private volatile int Dal = 0;

    static /* synthetic */ int UB(KO ko) {
        int i = ko.Dal;
        ko.Dal = i + 1;
        return i;
    }

    static /* synthetic */ int hu(KO ko) {
        int i = ko.XPd;
        ko.XPd = i + 1;
        return i;
    }

    static /* synthetic */ int nWX(KO ko) {
        int i = ko.lRN;
        ko.lRN = i + 1;
        return i;
    }

    public KO(Activity activity, final UB ub, String str, FrameLayout frameLayout) {
        this.FH = activity;
        this.VwS = ub;
        this.tr = str;
        if (ub != null) {
            this.Pf = ub.Dd();
        }
        if (!TextUtils.isEmpty(this.Pf)) {
            this.vD = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().mZx();
            int iEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(this.vD, this.Pf);
            this.wJ = iEYQ;
            this.wa = iEYQ > 0 ? 2 : 0;
        }
        boolean zTd = Td(ub);
        if (mZx(ub)) {
            this.tr = "landingpage_split_screen";
        } else if (zTd) {
            this.tr = "landingpage_direct";
        }
        this.pi = new com.bytedance.sdk.openadsdk.core.mZx.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ(), ub, this.tr, FH.EYQ(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.pi.EYQ(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.pi.EYQ(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.mZx.mZx mzx = new com.bytedance.sdk.openadsdk.core.mZx.mZx(activity, ub, this.tr, FH.EYQ(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.KO.1
            @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx
            public boolean EYQ(HX hx, Map<String, Object> map2) {
                if (KO.IPb(ub) && KO.this.Kbc != null) {
                    KO.this.Kbc.EYQ(hx);
                    KO.this.Kbc.EYQ(map2);
                    if (KO.Kbd(KO.this.VwS) || KO.this.mN) {
                        return true;
                    }
                }
                return super.EYQ(hx, map2);
            }
        };
        this.nWX = mzx;
        mzx.EYQ(map);
        this.nWX.EYQ(viewFindViewById);
        this.QQ = frameLayout;
        if (zTd) {
            try {
                Handler handler = new Handler(Looper.getMainLooper(), this);
                this.KO = handler;
                handler.sendMessage(handler.obtainMessage(100, 0, 0));
            } catch (Exception e) {
                Log.e("LandingPageModel", "LandingPageModel: ", e);
            }
        }
    }

    public void EYQ(Td.EYQ eyq) {
        this.tsL = eyq;
    }

    public void EYQ() {
        View view;
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        SSWebView sSWebView = (SSWebView) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.WU);
        this.XN = sSWebView;
        if (sSWebView != null && !UB.EYQ(this.VwS)) {
            this.XN.d_();
        } else {
            tr.EYQ((View) this.XN, 8);
        }
        this.NZ = (FrameLayout) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.zF);
        this.tPj = (LandingPageLoadingLayout) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.wBa);
        this.wBa = this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.XN);
        this.rfB = (ImageView) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.NZ);
        this.lEs = this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Tnp);
        this.mZx = (FrameLayout) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Uc);
        this.EYQ = (ImageView) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.hYh);
        this.IPb = (RelativeLayout) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.tPj);
        this.Td = (TextView) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Ts);
        this.Pm = (FrameLayout) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.tp);
        View viewFindViewById = this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.rfB);
        this.hu = viewFindViewById;
        if (viewFindViewById == null) {
            this.hu = this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.PI);
        }
        this.UB = (TextView) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.xt);
        this.Uc = (TextView) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Nvm);
        this.hYh = (TTRoundRectImageView) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.lEs);
        this.zF = (TextView) this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.FH);
        if (this.Td != null && this.VwS.QQ() != null) {
            this.Td.setText(this.VwS.QQ().Td());
        }
        this.Kbd = this.FH.findViewById(com.bytedance.sdk.openadsdk.utils.tp.tr);
        if ((Td(this.VwS) || mZx(this.VwS)) && this.VwS.QQ() != null) {
            View view2 = this.Kbd;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.core.pi.Td().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.6
                @Override // java.lang.Runnable
                public void run() {
                    if (KO.this.Nvm.get()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.mZx.Td.EYQ(KO.this.VwS, KO.this.tr, System.currentTimeMillis() - KO.this.xt, false);
                    KO.this.tsL();
                }
            }, this.VwS.QQ().EYQ() * 1000);
        }
        QQ();
        if (mZx(this.VwS)) {
            nWX();
            if (!Td()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.NZ.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.NZ.setLayoutParams(layoutParams);
            }
        }
        if (Td(this.VwS) && (view = this.lEs) != null) {
            view.setVisibility(8);
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.tPj;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.EYQ(this.VwS, this.tr);
        }
        Td.EYQ.EYQ(SystemClock.elapsedRealtime() - lValueOf.longValue(), this.VwS, this.tr, this.vD, this.Pf);
    }

    private void QQ() throws JSONException {
        LandingPageLoadingLayout landingPageLoadingLayout;
        SSWebView sSWebView = this.XN;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.EYQ.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()).EYQ(false).mZx(false).EYQ(this.XN.getWebView());
            SSWebView sSWebView2 = this.XN;
            if (sSWebView2 != null && sSWebView2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.mZx.tp tpVarEYQ = new com.bytedance.sdk.openadsdk.mZx.tp(this.VwS, this.XN.getWebView(), new com.bytedance.sdk.openadsdk.mZx.HX() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.7
                    @Override // com.bytedance.sdk.openadsdk.mZx.HX
                    public void EYQ(int i) {
                        Td.EYQ.EYQ(KO.this.wJ, KO.this.Dal, KO.this.XPd, KO.this.lRN - KO.this.XPd, KO.this.VwS, KO.this.tr, i);
                    }
                }, this.wa).EYQ(true);
                this.FtN = tpVarEYQ;
                tpVarEYQ.EYQ(this.tr);
            }
            HX();
            this.XN.setLandingPage(true);
            this.XN.setTag(this.tr);
            this.XN.setMaterialMeta(this.VwS.dbE());
            com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd kbd = new com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd(com.bytedance.sdk.openadsdk.core.hu.EYQ(), this.WU, this.VwS.VOV(), this.FtN, true) { // from class: com.bytedance.sdk.openadsdk.core.model.KO.8
                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    KO.this.tp();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (KO.this.FH instanceof com.bytedance.sdk.openadsdk.core.video.Td.Td) {
                        ((com.bytedance.sdk.openadsdk.core.video.Td.Td) KO.this.FH).mZx();
                    }
                    KO.this.xt = System.currentTimeMillis();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String strPm = Pm(str2);
                    if (this.IPb != null) {
                        this.IPb.EYQ(webView, i, str, str2, Pm(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z = strPm != null && strPm.startsWith("image");
                    boolean z2 = strPm != null && strPm.startsWith("mp4");
                    if (z || z2 || KO.this.Nvm.get()) {
                        return;
                    }
                    KO.this.tsL();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        KO.this.tsL();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(KO.this.Pf)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        KO.nWX(KO.this);
                        WebResourceResponseModel webResourceResponseModelEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(KO.this.vD, KO.this.Pf, str);
                        if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getWebResourceResponse() != null) {
                            KO.hu(KO.this);
                            return webResourceResponseModelEYQ.getWebResourceResponse();
                        }
                        if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getMsg() == 2) {
                            KO.UB(KO.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.pi.EYQ("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.Kbc = kbd;
            this.XN.setWebViewClient(kbd);
            this.Kbc.EYQ(this.VwS);
            this.Kbc.EYQ(this.tr);
            this.XN.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.WU, this.FtN) { // from class: com.bytedance.sdk.openadsdk.core.model.KO.9
                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (KO.this.FH != null && !KO.this.FH.isFinishing() && i == 100) {
                        KO.this.tp();
                    }
                    if (KO.this.tPj != null) {
                        KO.this.tPj.EYQ(i);
                    }
                }
            });
            if (this.Tnp == null) {
                this.Tnp = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ(), this.VwS, this.tr);
            }
            this.XN.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.10
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (KO.this.Tnp != null) {
                        KO.this.Tnp.Pm();
                    }
                }
            });
            SSWebView sSWebView3 = this.XN;
            sSWebView3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.pi.EYQ(sSWebView3.getWebView(), BuildConfig.VERSION_CODE));
            if (Build.VERSION.SDK_INT >= 21) {
                this.XN.setMixedContentMode(0);
            }
            this.XN.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!KO.this.mN || KO.IPb(KO.this.VwS)) {
                        KO.this.nWX.onTouch(view, motionEvent);
                    }
                    if ((!KO.this.mN || KO.IPb(KO.this.VwS)) && motionEvent.getAction() == 1 && KO.this.nWX.VwS()) {
                        KO.this.XN.getWebView().performClick();
                        KO.this.mN = true;
                    }
                    if (KO.this.FtN == null) {
                        return false;
                    }
                    KO.this.FtN.mZx(motionEvent.getActionMasked());
                    return false;
                }
            });
            this.XN.getWebView().setOnClickListener(this.nWX);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.VwS, this.tr, this.wa);
            com.bytedance.sdk.openadsdk.utils.KO.EYQ(this.XN, this.VwS.XPd());
            this.PI = true;
        }
        if (this.XN == null || (landingPageLoadingLayout = this.tPj) == null) {
            return;
        }
        landingPageLoadingLayout.EYQ();
    }

    private void HX() {
        wBa wba = new wBa(this.FH);
        this.WU = wba;
        wba.mZx(this.XN).Td(this.VwS.VOV()).Pm(this.VwS.GfQ()).EYQ(this.VwS).mZx(-1).EYQ(this.VwS.FtN()).mZx(this.tr).Kbd(this.VwS.TfI()).EYQ(this.XN).EYQ(new com.bytedance.sdk.openadsdk.core.widget.mZx() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.mZx
            public void EYQ() {
                if (KO.this.Kbc != null) {
                    KO.this.Kbc.mZx();
                }
            }
        });
    }

    public static boolean EYQ(UB ub) {
        if (ub == null || VwS(ub)) {
            return false;
        }
        return Td(ub) || mZx(ub);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tp() {
        if (this.Nvm.get() || this.kf.get()) {
            return;
        }
        this.Nvm.set(true);
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.VwS, this.tr, System.currentTimeMillis() - this.xt, true);
        MxO();
    }

    private void MxO() {
        this.IPb.setVisibility(8);
        if (Td(this.VwS) || !Td()) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.MxO = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.MxO.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.13
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) KO.this.NZ.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                KO.this.EYQ((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                KO.this.NZ.setLayoutParams(layoutParams);
            }
        });
        this.MxO.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tsL() {
        if (this.Nvm.get()) {
            return;
        }
        pi();
        this.kf.set(true);
        ComponentCallbacks2 componentCallbacks2 = this.FH;
        if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.video.Td.Td) {
            ((com.bytedance.sdk.openadsdk.core.video.Td.Td) componentCallbacks2).Td();
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.tPj;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.mZx();
        }
        this.hu.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.hu.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.addRule(10, 0);
        this.hu.setLayoutParams(layoutParams);
        if (this.VwS.vD() != null && !TextUtils.isEmpty(this.VwS.vD().EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.VwS.vD().EYQ(), this.VwS.vD().mZx(), this.VwS.vD().Td(), this.hYh, this.VwS);
        }
        this.UB.setText(this.VwS.Kbc());
        this.Uc.setText(this.VwS.OtA());
        if (this.zF != null) {
            mZx();
            this.zF.setClickable(true);
            this.zF.setOnClickListener(this.pi);
            this.zF.setOnTouchListener(this.pi);
        }
    }

    private void pi() {
        if (Td(this.VwS)) {
            ComponentCallbacks2 componentCallbacks2 = this.FH;
            if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.video.Td.Td) {
                ((com.bytedance.sdk.openadsdk.core.video.Td.Td) componentCallbacks2).mZx();
                ((com.bytedance.sdk.openadsdk.core.video.Td.Td) this.FH).HX();
            }
        }
    }

    protected void mZx() {
        UB ub = this.VwS;
        if (ub == null || TextUtils.isEmpty(ub.TZn())) {
            return;
        }
        this.zF.setText(this.VwS.TZn());
    }

    private void nWX() {
        if (Td()) {
            this.wBa.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.rfB, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.HX = duration;
            duration.setRepeatMode(2);
            this.HX.setRepeatCount(-1);
            this.HX.start();
            this.wBa.setClickable(true);
            this.wBa.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!KO.this.mN) {
                        KO.this.nWX.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    KO.this.tp = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    KO.this.tp.setDuration(200L);
                    KO.this.tp.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.2.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) KO.this.NZ.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            KO.this.EYQ((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            KO.this.NZ.setLayoutParams(layoutParams);
                        }
                    });
                    if (KO.this.nWX.VwS()) {
                        KO.this.wBa.performClick();
                        KO.this.mN = true;
                    }
                    KO.this.tp.start();
                    KO.this.wBa.setVisibility(8);
                    return true;
                }
            });
            this.wBa.setOnClickListener(this.nWX);
        }
        if (!KO()) {
            this.QQ.setVisibility(8);
            this.mZx.setVisibility(0);
            this.EYQ.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.EYQ.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.openadsdk.mZx.Td.mZx(KO.this.VwS, KO.this.tr);
                }
            });
            UB ub = this.VwS;
            if (ub != null && ub.Dal() != null && this.VwS.Dal().size() > 0 && this.VwS.Dal().get(0) != null && !TextUtils.isEmpty(this.VwS.Dal().get(0).EYQ())) {
                com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.VwS.Dal().get(0), this.EYQ, this.VwS);
            }
        }
        try {
            String strEYQ = this.VwS.Dal().get(0).EYQ();
            com.bytedance.sdk.openadsdk.IPb.Pm.EYQ().EYQ(strEYQ).EYQ(this.VwS.Dal().get(0).mZx()).mZx(this.VwS.Dal().get(0).Td()).Kbd(tr.Pm(com.bytedance.sdk.openadsdk.core.hu.EYQ())).Pm(tr.Td(com.bytedance.sdk.openadsdk.core.hu.EYQ())).Td(2).EYQ(new com.bytedance.sdk.component.Pm.QQ() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.5
                @Override // com.bytedance.sdk.component.Pm.QQ
                public Bitmap EYQ(Bitmap bitmap) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        return com.bytedance.sdk.component.adexpress.Pm.EYQ.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ(), bitmap, 25);
                    }
                    return null;
                }
            }).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(this.VwS, strEYQ, new com.bytedance.sdk.component.Pm.hu<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.model.KO.4
                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(com.bytedance.sdk.component.Pm.MxO<Bitmap> mxO) {
                    try {
                        Bitmap bitmapMZx = mxO.mZx();
                        if (bitmapMZx != null && mxO.Td() != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.hu.EYQ().getResources(), bitmapMZx);
                            if (!KO.this.KO()) {
                                KO.this.mZx.setBackground(bitmapDrawable);
                                return;
                            }
                            KO.this.Pm.setBackground(bitmapDrawable);
                            View viewKbd = KO.this.FH instanceof com.bytedance.sdk.openadsdk.core.video.Td.Td ? ((com.bytedance.sdk.openadsdk.core.video.Td.Td) KO.this.FH).Kbd() : null;
                            if (viewKbd == null || !(viewKbd.getParent() instanceof View)) {
                                return;
                            }
                            View view = (View) viewKbd.getParent();
                            view.setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean KO() {
        return UB.Kbd(this.VwS);
    }

    public boolean Td() {
        return this.VwS.by() == 15 || this.VwS.by() == 16;
    }

    public void EYQ(float f) {
        try {
            ((com.bytedance.sdk.openadsdk.core.video.Td.Td) this.FH).Pm();
        } catch (Throwable unused) {
        }
    }

    public static boolean mZx(UB ub) {
        return ub != null && ub.Pf() == 3 && ub.nWX() == 6 && !zF.mZx(ub) && ub.TZE() == 1 && (ub.CsQ() == 0.0f || ub.CsQ() == 100.0f);
    }

    public static boolean Td(UB ub) {
        if (ub == null) {
            return false;
        }
        if (VwS(ub)) {
            return true;
        }
        return ub.Pf() == 3 && ub.nWX() == 5 && !zF.mZx(ub) && (ub.CsQ() == 0.0f || ub.CsQ() == 100.0f);
    }

    public static boolean Pm(UB ub) {
        return Td(ub) && !VwS(ub);
    }

    public static boolean Kbd(UB ub) {
        return (ub == null || ub.tC() == 1 || !IPb(ub)) ? false : true;
    }

    public static boolean IPb(UB ub) {
        if (ub != null) {
            return ub.nWX() == 19 || ub.nWX() == 20;
        }
        return false;
    }

    public static boolean VwS(UB ub) {
        return ub != null && ub.nWX() == 19;
    }

    public static boolean QQ(UB ub) {
        return (ub == null || !com.bytedance.sdk.openadsdk.core.hu.Pm().NZ() || !ub.Tnp() || mZx(ub) || Td(ub)) ? false : true;
    }

    public void Pm() {
        FrameLayout frameLayout = this.NZ;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.lEs;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public void Kbd() {
        SSWebView sSWebView;
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.FtN;
        if (tpVar != null && (sSWebView = this.XN) != null) {
            tpVar.EYQ(sSWebView);
        }
        Handler handler = this.KO;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ObjectAnimator objectAnimator = this.tp;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.tp.cancel();
        }
        ObjectAnimator objectAnimator2 = this.MxO;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.MxO.cancel();
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.tPj;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.mZx();
        }
        ObjectAnimator objectAnimator3 = this.HX;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        SSWebView sSWebView2 = this.XN;
        if (sSWebView2 != null) {
            xt.EYQ(sSWebView2.getWebView());
        }
        this.XN = null;
        wBa wba = this.WU;
        if (wba != null) {
            wba.tsL();
        }
        com.bytedance.sdk.openadsdk.mZx.tp tpVar2 = this.FtN;
        if (tpVar2 != null) {
            tpVar2.Td(true);
        }
        if (!TextUtils.isEmpty(this.Pf) && this.PI) {
            Td.EYQ.EYQ(this.XPd, this.lRN, this.VwS);
        }
        com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(this.vD);
    }

    public void IPb() {
        wBa wba = this.WU;
        if (wba != null) {
            wba.MxO();
        }
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.FtN;
        if (tpVar != null) {
            tpVar.VwS();
        }
    }

    public void VwS() {
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.FtN;
        if (tpVar != null) {
            tpVar.QQ();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100) {
            int i = message.arg1;
            Td.EYQ eyq = this.tsL;
            if (eyq != null) {
                eyq.EYQ(i * 1000, this.VwS.QQ().mZx() * 1000);
            }
            long j = i;
            if (j >= this.VwS.QQ().mZx()) {
                Td.EYQ eyq2 = this.tsL;
                if (eyq2 != null) {
                    eyq2.EYQ(this.VwS.QQ().mZx() * 1000, 100);
                }
            } else if (j < this.VwS.QQ().mZx() && this.KO != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i + 1;
                this.KO.sendMessageDelayed(messageObtain, 1000L);
            }
        }
        return true;
    }
}
