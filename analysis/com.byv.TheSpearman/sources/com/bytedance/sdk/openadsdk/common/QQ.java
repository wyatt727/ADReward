package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTBottomNewStyleManager.java */
/* loaded from: classes2.dex */
public class QQ {
    private final LinearLayout EYQ;
    private ImageView IPb;
    private final Context Kbd;
    private final String Pm;
    private final UB Td;
    private ImageView VwS;
    private final SSWebView mZx;

    public QQ(Context context, LinearLayout linearLayout, SSWebView sSWebView, UB ub, String str) {
        this.Kbd = context;
        this.EYQ = linearLayout;
        this.mZx = sSWebView;
        this.Td = ub;
        this.Pm = str;
        Td();
    }

    private void Td() {
        this.IPb = (ImageView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.TZE);
        this.VwS = (ImageView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.CsQ);
        ImageView imageView = (ImageView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.wG);
        ImageView imageView2 = (ImageView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.BQ);
        this.IPb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.QQ.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (QQ.this.mZx == null || !QQ.this.mZx.Kbd()) {
                    return;
                }
                QQ.this.EYQ(ToolBar.BACKWARD);
                QQ.this.mZx.IPb();
            }
        });
        this.VwS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.QQ.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (QQ.this.mZx == null || !QQ.this.mZx.VwS()) {
                    return;
                }
                QQ.this.EYQ(ToolBar.FORWARD);
                QQ.this.mZx.QQ();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.QQ.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (QQ.this.mZx != null) {
                    QQ.this.mZx(ToolBar.REFRESH);
                    QQ.this.mZx.Pm();
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.QQ.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws JSONException {
                if (QQ.this.mZx != null) {
                    QQ.this.mZx("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = QQ.this.mZx.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.mZx.EYQ(QQ.this.Kbd, intent, null);
                }
            }
        });
        this.EYQ.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.QQ.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.IPb.setClickable(false);
        this.VwS.setClickable(false);
        this.IPb.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.VwS.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    public void EYQ(WebView webView) {
        try {
            if (this.IPb != null) {
                if (webView.canGoBack()) {
                    this.IPb.setClickable(true);
                    this.IPb.clearColorFilter();
                } else {
                    this.IPb.setClickable(false);
                    this.IPb.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.VwS != null) {
                if (webView.canGoForward()) {
                    this.VwS.setClickable(true);
                    this.VwS.clearColorFilter();
                } else {
                    this.VwS.setClickable(false);
                    this.VwS.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void EYQ() {
        if (this.EYQ.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.EYQ, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    public void mZx() {
        if (this.EYQ.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.EYQ, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str) throws JSONException {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mZx.getWebView() != null && (webBackForwardListCopyBackForwardList = this.mZx.getWebView().copyBackForwardList()) != null) {
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.mZx.getUrl();
                }
                String url2 = str.equals(ToolBar.BACKWARD) ? webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl() : "";
                int i = 1;
                if (str.equals(ToolBar.FORWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", url2);
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) {
                    i = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.Td(this.Td, this.Pm, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(String str) throws JSONException {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mZx.getWebView() != null && (webBackForwardListCopyBackForwardList = this.mZx.getWebView().copyBackForwardList()) != null) {
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.mZx.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.Td(this.Td, this.Pm, str, jSONObject);
    }
}
