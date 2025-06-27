package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.g.a;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.videocommon.d.b;
import com.mbridge.msdk.videocommon.download.d;
import com.mbridge.msdk.videocommon.download.e;

/* loaded from: classes4.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    private String x;

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected final String a() {
        if (TextUtils.isEmpty(this.unitId)) {
            return "";
        }
        b.a().a(c.m().k(), this.unitId, false);
        String str = com.mbridge.msdk.videocommon.d.c.f3883a;
        this.x = str;
        return !TextUtils.isEmpty(str) ? d.a().a(this.x) : "";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String strA = a();
        if (this.f && this.b != null && !TextUtils.isEmpty(strA)) {
            a aVar = new a(this.b);
            aVar.a(this.b.getAppName());
            this.q.setDownloadListener(aVar);
            this.q.setCampaignId(this.b.getId());
            setCloseVisible(8);
            this.q.setApiManagerJSFactory(bVar);
            this.q.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeAlertWebview.1
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    ad.b("MBridgeAlertWebview", "finish+" + str);
                    g.a().a(webView);
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i, String str, String str2) {
                    super.a(webView, i, str, str2);
                    ad.b("MBridgeAlertWebview", "onReceivedError");
                    if (MBridgeAlertWebview.this.u) {
                        return;
                    }
                    ad.a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
                    k.a(MBridgeAlertWebview.this.f3680a, MBridgeAlertWebview.this.b, MBridgeAlertWebview.this.x, MBridgeAlertWebview.this.unitId, 2, str, 1);
                    MBridgeAlertWebview.this.u = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i) {
                    String str;
                    super.a(webView, i);
                    ad.b("MBridgeAlertWebview", "readyState  :  " + i);
                    if (MBridgeAlertWebview.this.u) {
                        return;
                    }
                    MBridgeAlertWebview.this.t = i == 1;
                    if (MBridgeAlertWebview.this.t) {
                        str = "readyState state is " + i;
                    } else {
                        str = "";
                    }
                    k.a(MBridgeAlertWebview.this.f3680a, MBridgeAlertWebview.this.b, MBridgeAlertWebview.this.x, MBridgeAlertWebview.this.unitId, i, str, 1);
                }
            });
            setHtmlSource(e.a().b(strA));
            this.t = false;
            if (TextUtils.isEmpty(this.s)) {
                ad.a(MBridgeBaseView.TAG, "load url:" + strA);
                this.q.loadUrl(strA);
            } else {
                ad.a(MBridgeBaseView.TAG, "load html...");
                this.q.loadDataWithBaseURL(strA, this.s, "text/html", C.UTF8_NAME, null);
            }
            this.q.setBackgroundColor(0);
            setBackgroundColor(0);
            return;
        }
        this.e.a(101, "");
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        if (this.o != null) {
            this.o.setBackgroundColor(0);
        }
        super.webviewshow();
        k.a(this.f3680a, this.b, this.x, this.unitId, 2, 1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }
}
