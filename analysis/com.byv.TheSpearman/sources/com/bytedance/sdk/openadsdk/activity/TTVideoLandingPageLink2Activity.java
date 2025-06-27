package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.VwS.Pm;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserDownloadButton;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewBottomBar;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.common.QQ;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.utils.VwS;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements Pm {
    private LinearLayout Dd;
    private TextView Nuq;
    private View OtA;
    private LandingPageLoadingLayout TQF;
    private View TZn;
    private QQ VEW;
    private boolean VOV;
    private boolean by;
    private long dVQ;
    TTAdDislikeDialog wJ;
    TTAdDislikeToast wa;
    private TextView xh;
    private boolean GfQ = false;
    final AtomicBoolean KR = new AtomicBoolean(false);
    final AtomicBoolean na = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (!pi.Kbd() || this.hu == null || this.EYQ == null) {
            finish();
            return;
        }
        this.by = hu.Pm().NZ();
        this.EYQ.setWebViewClient(new Kbd(this.Kbd, this.tp, this.QQ, this.Pf, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.OtA != null && !TTVideoLandingPageLink2Activity.this.VOV) {
                        TTVideoLandingPageLink2Activity.this.OtA.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.Dd != null) {
                        TTVideoLandingPageLink2Activity.this.Dd.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.GfQ = true;
                    TTVideoLandingPageLink2Activity.this.nWX();
                    Td.EYQ(TTVideoLandingPageLink2Activity.this.hu, TTVideoLandingPageLink2Activity.this.tr, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.dVQ, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.dVQ = System.currentTimeMillis();
            }
        });
        this.EYQ.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.tp, this.Pf) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.by && TTVideoLandingPageLink2Activity.this.VEW != null && i == 100) {
                    TTVideoLandingPageLink2Activity.this.VEW.EYQ(webView);
                }
                if (TTVideoLandingPageLink2Activity.this.TQF != null) {
                    TTVideoLandingPageLink2Activity.this.TQF.EYQ(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(tp.Ts);
        if (textView != null && this.hu.QQ() != null) {
            textView.setText(this.hu.QQ().Td());
        }
        long jEYQ = 10000;
        if (this.hu != null && this.hu.QQ() != null) {
            jEYQ = this.hu.QQ().EYQ() * 1000;
        }
        pi.Td().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.VOV = true;
                    if (TTVideoLandingPageLink2Activity.this.TQF != null) {
                        TTVideoLandingPageLink2Activity.this.TQF.mZx();
                    }
                    TTVideoLandingPageLink2Activity.this.TZn.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.GfQ) {
                        return;
                    }
                    Td.EYQ(TTVideoLandingPageLink2Activity.this.hu, TTVideoLandingPageLink2Activity.this.tr, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.dVQ, false);
                } catch (Exception unused) {
                }
            }
        }, jEYQ);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected View EYQ() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setBackgroundColor(-1);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        pAGLinearLayout.addView(pAGFrameLayout, new LinearLayout.LayoutParams(-1, tr.mZx(this, 220.0f)));
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(this);
        pAGFrameLayout2.setId(tp.kf);
        pAGFrameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setPadding(0, tr.mZx(this, 20.0f), 0, 0);
        pAGFrameLayout.addView(pAGLinearLayout2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout2.addView(view, layoutParams);
        ShadowTextView shadowTextView = new ShadowTextView(this);
        shadowTextView.setId(520093713);
        shadowTextView.setGravity(17);
        shadowTextView.setText(zF.mZx(this, "tt_reward_feedback"));
        shadowTextView.setTextColor(-1);
        shadowTextView.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, tr.mZx(this, 28.0f));
        int iMZx = tr.mZx(this, 16.0f);
        layoutParams2.rightMargin = iMZx;
        layoutParams2.leftMargin = iMZx;
        pAGLinearLayout2.addView(shadowTextView, layoutParams2);
        ShadowImageView shadowImageView = new ShadowImageView(this);
        shadowImageView.setId(tp.mN);
        shadowImageView.setPadding(tr.mZx(this, 7.0f), tr.mZx(this, 7.0f), tr.mZx(this, 7.0f), tr.mZx(this, 7.0f));
        shadowImageView.setImageResource(zF.Pm(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(tr.mZx(this, 28.0f), tr.mZx(this, 28.0f));
        layoutParams3.rightMargin = tr.mZx(this, 12.0f);
        pAGLinearLayout2.addView(shadowImageView, layoutParams3);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this);
        pAGRelativeLayout.setVisibility(8);
        pAGRelativeLayout.setId(tp.Kbc);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = tr.mZx(this, 10.0f);
        pAGLinearLayout.addView(pAGRelativeLayout, layoutParams4);
        CornerIV cornerIV = new CornerIV(this);
        cornerIV.setId(tp.Pf);
        cornerIV.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        cornerIV.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(tr.mZx(this, 44.0f), tr.mZx(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = tr.mZx(this, 5.0f);
        pAGRelativeLayout.addView(cornerIV, layoutParams5);
        PAGTextView pAGTextView = new PAGTextView(this);
        pAGTextView.setId(tp.vD);
        pAGTextView.setBackground(VwS.EYQ(this, "tt_circle_solid_mian"));
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 19.0f);
        pAGTextView.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(tr.mZx(this, 44.0f), tr.mZx(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = tr.mZx(this, 5.0f);
        pAGRelativeLayout.addView(pAGTextView, layoutParams6);
        PAGTextView pAGTextView2 = new PAGTextView(this);
        pAGTextView2.setId(tp.lRN);
        pAGTextView2.setMaxLines(1);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setTextColor(Color.parseColor("#e5000000"));
        pAGTextView2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = tr.mZx(this, 5.0f);
        layoutParams7.rightMargin = tr.mZx(this, 80.0f);
        layoutParams7.addRule(1, tp.vD);
        pAGRelativeLayout.addView(pAGTextView2, layoutParams7);
        PAGTextView pAGTextView3 = new PAGTextView(this);
        pAGTextView3.setId(tp.XPd);
        pAGTextView3.setClickable(true);
        pAGTextView3.setMaxLines(1);
        pAGTextView3.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView3.setFocusable(true);
        pAGTextView3.setGravity(17);
        pAGTextView3.setText(zF.mZx(this, "tt_video_mobile_go_detail"));
        pAGTextView3.setTextColor(-1);
        pAGTextView3.setTextSize(2, 14.0f);
        pAGTextView3.setPadding(tr.mZx(this, 2.0f), tr.mZx(this, 2.0f), tr.mZx(this, 2.0f), tr.mZx(this, 2.0f));
        pAGTextView3.setBackgroundResource(zF.Pm(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(tr.mZx(this, 90.0f), tr.mZx(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = tr.mZx(this, 5.0f);
        pAGRelativeLayout.addView(pAGTextView3, layoutParams8);
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(this);
        pAGLinearLayout.addView(pAGFrameLayout3, new LinearLayout.LayoutParams(-1, -1));
        SSWebView sSWebView = new SSWebView(this);
        sSWebView.setId(tp.Dal);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = tr.mZx(this, 2.0f);
        pAGFrameLayout3.addView(sSWebView, layoutParams9);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(this);
        pAGRelativeLayout2.setId(tp.wJ);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        pAGFrameLayout3.addView(pAGRelativeLayout2, new FrameLayout.LayoutParams(-1, -1));
        LandingPageLoadingLayout landingPageLoadingLayout = new LandingPageLoadingLayout(this);
        landingPageLoadingLayout.setId(tp.wa);
        pAGRelativeLayout2.addView(landingPageLoadingLayout, new RelativeLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(this);
        pAGLinearLayout3.setId(tp.PI);
        pAGLinearLayout3.setOrientation(1);
        pAGLinearLayout3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        pAGRelativeLayout2.addView(pAGLinearLayout3, layoutParams10);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this);
        tTRoundRectImageView.setId(tp.KR);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(tr.mZx(this, 80.0f), tr.mZx(this, 80.0f));
        layoutParams11.gravity = 17;
        pAGLinearLayout3.addView(tTRoundRectImageView, layoutParams11);
        PAGTextView pAGTextView4 = new PAGTextView(this);
        pAGTextView4.setId(tp.na);
        pAGTextView4.setTextColor(Color.parseColor("#161823"));
        pAGTextView4.setTextSize(0, tr.mZx(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = tr.mZx(this, 12.0f);
        pAGLinearLayout3.addView(pAGTextView4, layoutParams12);
        PAGTextView pAGTextView5 = new PAGTextView(this);
        pAGTextView5.setId(tp.TQF);
        pAGTextView5.setTextColor(Color.parseColor("#80161823"));
        pAGTextView5.setTextSize(0, tr.mZx(this, 16.0f));
        if (Build.VERSION.SDK_INT >= 17) {
            pAGTextView5.setTextAlignment(4);
        }
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iMZx2 = tr.mZx(this, 60.0f);
        layoutParams13.rightMargin = iMZx2;
        layoutParams13.leftMargin = iMZx2;
        layoutParams13.topMargin = tr.mZx(this, 8.0f);
        pAGLinearLayout3.addView(pAGTextView5, layoutParams13);
        PAGTextView pAGTextView6 = new PAGTextView(this);
        pAGTextView6.setId(tp.OtA);
        pAGTextView6.setGravity(17);
        pAGTextView6.setTextColor(-1);
        pAGTextView6.setText(zF.mZx(this, "tt_video_mobile_go_detail"));
        pAGTextView6.setBackground(VwS.EYQ(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(tr.mZx(this, 255.0f), tr.mZx(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = tr.mZx(this, 32.0f);
        pAGLinearLayout3.addView(pAGTextView6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        pAGLogoView.setId(tp.TZn);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, tr.mZx(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = tr.mZx(this, 16.0f);
        layoutParams15.bottomMargin = tr.mZx(this, 20.0f);
        pAGRelativeLayout2.addView(pAGLogoView, layoutParams15);
        PangleViewStub pangleViewStub = new PangleViewStub(this, new PangleViewStub.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.EYQ
            public View EYQ(Context context) {
                return new LandingPageBrowserDownloadButton(context);
            }
        });
        pangleViewStub.setId(tp.VOV);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, tr.mZx(this, 48.0f));
        layoutParams16.gravity = 81;
        pAGFrameLayout3.addView(pangleViewStub, layoutParams16);
        PangleViewStub pangleViewStub2 = new PangleViewStub(this, new PangleViewStub.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.EYQ
            public View EYQ(Context context) {
                return new LandingPageBrowserNewBottomBar(context);
            }
        });
        pangleViewStub2.setId(tp.Nuq);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, tr.mZx(this, 44.0f));
        layoutParams17.gravity = 80;
        pAGFrameLayout3.addView(pangleViewStub2, layoutParams17);
        return pAGLinearLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void Td() {
        super.Td();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(zF.EYQ(hu.EYQ(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.tsL();
                }
            });
        }
        this.Nuq = (TextView) findViewById(520093714);
        this.TQF = (LandingPageLoadingLayout) findViewById(tp.wa);
        this.OtA = findViewById(tp.wJ);
        this.TZn = findViewById(tp.PI);
        TextView textView2 = (TextView) findViewById(tp.na);
        TextView textView3 = (TextView) findViewById(tp.TQF);
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) findViewById(tp.KR);
        this.xh = (TextView) findViewById(tp.OtA);
        if (this.hu.vD() != null && !TextUtils.isEmpty(this.hu.vD().EYQ())) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.hu.vD(), tTRoundRectImageView, this.hu);
        }
        textView2.setText(this.hu.Kbc());
        textView3.setText(this.hu.OtA());
        findViewById(tp.TZn).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.EYQ(TTVideoLandingPageLink2Activity.this.Kbd, TTVideoLandingPageLink2Activity.this.hu, TTVideoLandingPageLink2Activity.this.tr);
            }
        });
        boolean zNZ = hu.Pm().NZ();
        this.by = zNZ;
        if (zNZ) {
            ((PangleViewStub) findViewById(tp.Nuq)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(tp.XL);
            this.Dd = linearLayout;
            linearLayout.setVisibility(8);
            this.VEW = new QQ(this, this.Dd, this.EYQ, this.hu, "landingpage_split_screen");
            if (this.EYQ.getWebView() != null) {
                this.EYQ.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                    float EYQ = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.EYQ = motionEvent.getY();
                        }
                        if (TTVideoLandingPageLink2Activity.this.Pf != null) {
                            TTVideoLandingPageLink2Activity.this.Pf.mZx(motionEvent.getActionMasked());
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f = this.EYQ;
                            if (y - f > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.VEW != null) {
                                    TTVideoLandingPageLink2Activity.this.VEW.EYQ();
                                }
                                return false;
                            }
                            if (y - f < -8.0f && TTVideoLandingPageLink2Activity.this.VEW != null) {
                                TTVideoLandingPageLink2Activity.this.VEW.mZx();
                            }
                        }
                        return false;
                    }
                });
            }
        } else if (this.EYQ.getWebView() != null) {
            this.EYQ.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTVideoLandingPageLink2Activity.this.Pf == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.Pf.mZx(motionEvent.getActionMasked());
                    return false;
                }
            });
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.TQF;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.EYQ(this.hu, this.tr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pi() throws JSONException {
        Td.EYQ(this.hu, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LandingPageLoadingLayout landingPageLoadingLayout = this.TQF;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.EYQ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void Pm() {
        if (Kbd()) {
            super.Pm();
            if (this.nWX != null) {
                if (this.nWX.getNativeVideoController() != null) {
                    this.nWX.getNativeVideoController().EYQ(false);
                    ((com.bytedance.sdk.openadsdk.core.video.nativevideo.Td) this.nWX.getNativeVideoController()).VwS(false);
                    this.tsL.setClickable(true);
                    this.tsL.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) throws JSONException {
                            if (motionEvent.getAction() != 0) {
                                return false;
                            }
                            TTVideoLandingPageLink2Activity.this.pi();
                            return false;
                        }
                    });
                }
                this.nWX.getNativeVideoController().EYQ(new Td.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
                    public void EYQ() {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
                    public void EYQ(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
                    public void mZx(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
                    public void EYQ(long j, long j2) {
                        if (TTVideoLandingPageLink2Activity.this.Nuq != null) {
                            int iMax = (int) Math.max(0L, (j2 - j) / 1000);
                            TTVideoLandingPageLink2Activity.this.Nuq.setText(String.valueOf(iMax));
                            if (iMax <= 0) {
                                TTVideoLandingPageLink2Activity.this.Nuq.setVisibility(8);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.hu.Dal().get(0), imageView, this.hu);
            this.tsL.setVisibility(0);
            this.tsL.removeAllViews();
            this.tsL.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.openadsdk.mZx.Td.mZx(TTVideoLandingPageLink2Activity.this.hu, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected boolean Kbd() {
        return this.pi == 5 || this.pi == 15 || this.pi == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void HX() {
        super.HX();
        if (this.hu != null) {
            this.hu.IPb(true);
        }
        TextView textView = this.xh;
        if (textView != null) {
            textView.setText(mZx());
            this.xh.setClickable(true);
            this.xh.setOnClickListener(this.Dal);
            this.xh.setOnTouchListener(this.Dal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nWX() {
        LandingPageLoadingLayout landingPageLoadingLayout = this.TQF;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.mZx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    protected void onDestroy() {
        nWX();
        if (!this.VOV && this.Pf != null && this.EYQ != null && this.TQF.getVisibility() == 8) {
            this.Pf.EYQ(this.EYQ);
        }
        super.onDestroy();
    }

    private void KO() {
        TTAdDislikeToast tTAdDislikeToast = this.wa;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.EYQ(TTAdDislikeToast.getDislikeTip());
    }

    protected void tsL() {
        if (isFinishing()) {
            return;
        }
        if (this.na.get()) {
            KO();
            return;
        }
        if (this.wJ == null) {
            hu();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.wJ;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.EYQ();
        }
    }

    private void hu() {
        try {
            if (this.wJ == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.Kbd, this.hu);
                this.wJ = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void EYQ(View view) {
                        TTVideoLandingPageLink2Activity.this.KR.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void mZx(View view) {
                        TTVideoLandingPageLink2Activity.this.KR.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void EYQ(int i, FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.na.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.na.set(true);
                        TTVideoLandingPageLink2Activity.this.UB();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.wJ);
            if (this.wa == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.Kbd);
                this.wa = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void UB() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.wa) == null) {
            return;
        }
        tTAdDislikeToast.EYQ(TTAdDislikeToast.getDislikeSendTip());
    }
}
