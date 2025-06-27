package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: LandingPageNewStyleManager.java */
/* loaded from: classes2.dex */
public class VwS {
    private final UB EYQ;
    private final String IPb;
    private ImageView Kbd;
    private SSWebView Pm;
    private QQ QQ;
    private final Context Td;
    private tp VwS;
    private RelativeLayout mZx;

    public VwS(Context context, UB ub, String str) {
        this.Td = context;
        this.EYQ = ub;
        this.IPb = str;
        IPb();
    }

    private static RelativeLayout EYQ(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new LandingPageBrowserNewTitleBar(context));
        SSWebView sSWebView = new SSWebView(context);
        sSWebView.setId(com.bytedance.sdk.openadsdk.utils.tp.Dal);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.tp.VEW);
        relativeLayout.addView(sSWebView, layoutParams);
        LandingPageBrowserNewBottomBar landingPageBrowserNewBottomBar = new LandingPageBrowserNewBottomBar(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(landingPageBrowserNewBottomBar.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(landingPageBrowserNewBottomBar, layoutParams2);
        return relativeLayout;
    }

    private void IPb() {
        RelativeLayout relativeLayoutEYQ = EYQ(this.Td);
        this.mZx = relativeLayoutEYQ;
        this.Pm = (SSWebView) relativeLayoutEYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Dal);
        tp tpVar = new tp(this.Td, (RelativeLayout) this.mZx.findViewById(com.bytedance.sdk.openadsdk.utils.tp.VEW), this.EYQ);
        this.VwS = tpVar;
        this.Kbd = tpVar.Td();
        this.QQ = new QQ(this.Td, (LinearLayout) this.mZx.findViewById(com.bytedance.sdk.openadsdk.utils.tp.XL), this.Pm, this.EYQ, this.IPb);
    }

    public void EYQ() {
        tp tpVar = this.VwS;
        if (tpVar != null) {
            tpVar.EYQ();
        }
        QQ qq = this.QQ;
        if (qq != null) {
            qq.EYQ();
        }
    }

    public void mZx() {
        tp tpVar = this.VwS;
        if (tpVar != null) {
            tpVar.mZx();
        }
        QQ qq = this.QQ;
        if (qq != null) {
            qq.mZx();
        }
    }

    public ImageView Td() {
        return this.Kbd;
    }

    public SSWebView Pm() {
        return this.Pm;
    }

    public View Kbd() {
        return this.mZx;
    }

    public void EYQ(WebView webView, int i) {
        tp tpVar = this.VwS;
        if (tpVar != null) {
            tpVar.EYQ(i);
        }
        QQ qq = this.QQ;
        if (qq != null) {
            qq.EYQ(webView);
        }
    }
}
