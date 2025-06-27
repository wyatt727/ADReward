package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Td;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class PAGAppOpenHtmlLayout extends PAGAppOpenBaseLayout {
    EYQ nWX;

    public interface EYQ {
        void EYQ(View view, int i);
    }

    public PAGAppOpenHtmlLayout(Context context, UB ub) {
        super(context);
        EYQ(context, ub);
    }

    private void EYQ(Context context, UB ub) {
        DspHtmlWebView dspHtmlWebView = new DspHtmlWebView(context);
        Td.EYQ().Td(dspHtmlWebView);
        dspHtmlWebView.EYQ(ub, new DspHtmlWebView.mZx() { // from class: com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
            public void EYQ(int i, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
            public void c_() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
            public View EYQ() {
                if (PAGAppOpenHtmlLayout.this.HX != null) {
                    return PAGAppOpenHtmlLayout.this.HX.getTopDislike();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
            public View mZx() {
                return PAGAppOpenHtmlLayout.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.mZx
            public void EYQ(View view, int i) {
                if (PAGAppOpenHtmlLayout.this.nWX != null) {
                    PAGAppOpenHtmlLayout.this.nWX.EYQ(view, i);
                }
            }
        }, "open_ad");
        addView(dspHtmlWebView, new ViewGroup.LayoutParams(-1, -1));
        dspHtmlWebView.hu();
        int iMZx = tr.mZx(context, 9.0f);
        int iMZx2 = tr.mZx(context, 10.0f);
        this.Pm = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, tr.mZx(context, 14.0f));
        layoutParams.leftMargin = iMZx2;
        layoutParams.bottomMargin = iMZx2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.Pm, layoutParams);
        this.pi = new DSPAdChoice(context);
        this.pi.setPadding(iMZx, 0, iMZx, 0);
        this.pi.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(tr.mZx(context, 32.0f), tr.mZx(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iMZx2, iMZx2);
        addView(this.pi, layoutParams2);
        if (this.HX != null) {
            addView(this.HX);
        }
    }

    public void setRenderListener(EYQ eyq) {
        this.nWX = eyq;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.nWX = null;
    }
}
