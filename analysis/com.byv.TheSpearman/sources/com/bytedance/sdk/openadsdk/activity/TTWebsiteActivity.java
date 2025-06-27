package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.mZx;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.HX;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.xt;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.common.net.HttpHeaders;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private String EYQ = null;
    private WebView Td;
    private HX mZx;

    public static void EYQ(Context context, UB ub, String str) {
        if (context == null) {
            return;
        }
        Td.EYQ(ub, str, "open_policy");
        if (TextUtils.isEmpty(hu.Pm().mN())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (ub != null) {
            intent.putExtra("_extra_meta", ub.aEX().toString());
            intent.putExtra("_extra_glo_d", ub.LoE());
        }
        mZx.EYQ(context, intent, null);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        super.onCreate(bundle);
        hu.EYQ(getApplicationContext());
        if (!pi.Kbd()) {
            finish();
            return;
        }
        final String stringExtra = getIntent().getStringExtra("_extra_meta");
        String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setBackgroundColor(-1);
        pAGLinearLayout.setId(520093726);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(pAGLinearLayout);
            int iMZx = tr.mZx(this, 5.0f);
            int iMZx2 = tr.mZx(this, 8.0f);
            int iMZx3 = tr.mZx(this, 10.0f);
            int iMZx4 = tr.mZx(this, 12.0f);
            int iMZx5 = tr.mZx(this, 14.0f);
            int iMZx6 = tr.mZx(this, 20.0f);
            int iMZx7 = tr.mZx(this, 24.0f);
            int iMZx8 = tr.mZx(this, 40.0f);
            int iMZx9 = tr.mZx(this, 44.0f);
            int iMZx10 = tr.mZx(this, 191.0f);
            PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this);
            pAGRelativeLayout.setGravity(15);
            pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, iMZx9));
            PAGImageView pAGImageView = new PAGImageView(this);
            pAGImageView.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iMZx8, iMZx9);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(iMZx2);
            } else {
                layoutParams.leftMargin = iMZx2;
            }
            pAGImageView.setLayoutParams(layoutParams);
            pAGImageView.setClickable(true);
            pAGImageView.setFocusable(true);
            pAGImageView.setPadding(iMZx5, iMZx4, iMZx5, iMZx4);
            pAGImageView.setImageDrawable(zF.Td(this, "tt_ad_arrow_backward_wrapper"));
            final PAGImageView pAGImageView2 = new PAGImageView(this);
            pAGImageView2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iMZx8, iMZx9);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams2.addRule(17, 520093720);
                z = true;
            } else {
                z = true;
                layoutParams2.addRule(1, 520093720);
            }
            pAGImageView2.setLayoutParams(layoutParams2);
            pAGImageView2.setClickable(z);
            pAGImageView2.setFocusable(z);
            pAGImageView2.setPadding(iMZx4, iMZx5, iMZx4, iMZx5);
            pAGImageView2.setImageDrawable(zF.Td(this, "tt_ad_xmark"));
            PAGTextView pAGTextView = new PAGTextView(this);
            pAGTextView.setId(tp.XT);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iMZx10, iMZx7);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams3.setMarginStart(iMZx);
            } else {
                layoutParams3.leftMargin = iMZx;
            }
            layoutParams3.addRule(15);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams3.addRule(16, 520093741);
                layoutParams3.addRule(17, 520093716);
                z2 = true;
            } else {
                layoutParams3.addRule(0, 520093741);
                z2 = true;
                layoutParams3.addRule(1, 520093716);
            }
            pAGTextView.setLayoutParams(layoutParams3);
            pAGTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            pAGTextView.setGravity(17);
            pAGTextView.setSingleLine(z2);
            pAGTextView.setTextColor(Color.parseColor("#222222"));
            pAGTextView.setTextSize(17.0f);
            PAGImageView pAGImageView3 = new PAGImageView(this);
            pAGImageView3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iMZx8, iMZx9);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams4.addRule(16, 520093742);
            } else {
                layoutParams4.addRule(0, 520093742);
            }
            pAGImageView3.setLayoutParams(layoutParams4);
            pAGImageView3.setPadding(iMZx3, iMZx4, iMZx3, iMZx4);
            pAGImageView3.setImageDrawable(zF.Td(this, "tt_ad_link"));
            PAGImageView pAGImageView4 = new PAGImageView(this);
            pAGImageView4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iMZx8, iMZx9);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams5.addRule(21);
                layoutParams5.setMarginEnd(iMZx2);
            } else {
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = iMZx2;
            }
            pAGImageView4.setLayoutParams(layoutParams5);
            pAGImageView4.setPadding(iMZx4, iMZx6, iMZx4, iMZx6);
            pAGImageView4.setImageDrawable(zF.Td(this, "tt_ad_threedots"));
            final PAGProgressBar pAGProgressBar = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
            pAGProgressBar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, tr.mZx(this, 2.0f));
            layoutParams6.addRule(12);
            pAGProgressBar.setLayoutParams(layoutParams6);
            pAGProgressBar.setProgress(1);
            pAGProgressBar.setProgressDrawable(zF.Td(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, tr.mZx(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            pAGRelativeLayout.addView(pAGImageView);
            pAGRelativeLayout.addView(pAGImageView2);
            pAGRelativeLayout.addView(pAGTextView);
            pAGRelativeLayout.addView(pAGImageView3);
            pAGRelativeLayout.addView(pAGImageView4);
            pAGRelativeLayout.addView(pAGProgressBar);
            pAGRelativeLayout.addView(view);
            pAGLinearLayout.addView(pAGRelativeLayout);
            try {
                WebView webView = new WebView(this);
                this.Td = webView;
                webView.setBackgroundColor(-1);
                pAGLinearLayout.addView(this.Td, new ViewGroup.LayoutParams(-1, -1));
                pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.Td.canGoBack()) {
                            TTWebsiteActivity.this.Td.goBack();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                pAGImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                pAGImageView2.setVisibility(4);
                pAGImageView2.setClickable(false);
                pAGTextView.setText(zF.EYQ(this, "tt_privacy_title"));
                pAGImageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.Td.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        mZx.EYQ(TTWebsiteActivity.this, intent, null);
                    }
                });
                pAGImageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.mZx == null) {
                            TTWebsiteActivity.this.mZx = new HX(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.mZx.EYQ(stringExtra);
                            TTWebsiteActivity.this.mZx.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.mZx.show();
                    }
                });
                if (hu.Pm() != null) {
                    this.EYQ = hu.Pm().mN();
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        String strEncode = URLEncoder.encode(stringExtra2);
                        if (this.EYQ.contains("?")) {
                            this.EYQ += "&gdid_encrypted=" + strEncode;
                        } else {
                            this.EYQ += "?gdid_encrypted=" + strEncode;
                        }
                    }
                }
                if (this.EYQ != null) {
                    WebSettings settings = this.Td.getSettings();
                    if (Build.VERSION.SDK_INT >= 21) {
                        z3 = false;
                        settings.setMixedContentMode(0);
                    } else {
                        z3 = false;
                    }
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(z3);
                        settings.setAllowFileAccess(z3);
                    } catch (Throwable unused) {
                    }
                    HashMap map = new HashMap();
                    map.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
                    try {
                        this.Td.loadUrl(this.EYQ, map);
                    } catch (Throwable unused2) {
                        this.Td.loadUrl(this.EYQ);
                    }
                    this.Td.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i) {
                            super.onProgressChanged(webView2, i);
                            if (pAGProgressBar == null || TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i == 100) {
                                pAGProgressBar.setVisibility(8);
                                if (webView2.canGoBack()) {
                                    pAGImageView2.setVisibility(0);
                                    pAGImageView2.setClickable(true);
                                    return;
                                } else {
                                    pAGImageView2.setVisibility(4);
                                    pAGImageView2.setClickable(false);
                                    return;
                                }
                            }
                            pAGProgressBar.setVisibility(0);
                            pAGProgressBar.setProgress(i);
                        }
                    });
                    this.Td.setWebViewClient(new SSWebView.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                            if (webView2 == null || webResourceRequest == null) {
                                return false;
                            }
                            if (Build.VERSION.SDK_INT >= 21) {
                                webView2.loadUrl(webResourceRequest.getUrl().toString());
                                return true;
                            }
                            webView2.loadUrl(webResourceRequest.toString());
                            return true;
                        }

                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str) {
                            super.onPageFinished(webView2, str);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=".concat(String.valueOf(webResourceResponse)));
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i, String str, String str2) {
                            super.onReceivedError(webView2, i, str, str2);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.EYQ.Td.mZx(this.Td);
                    return;
                }
                finish();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xt.EYQ(this.Td);
    }
}
