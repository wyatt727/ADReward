package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.sdk.component.adexpress.dynamic.Td.tp;
import com.bytedance.sdk.component.utils.WU;

/* loaded from: classes2.dex */
public class WriggleGuideAnimationView extends LinearLayout {
    private TextView EYQ;
    private LottieAnimationView IPb;
    private LinearLayout Kbd;
    private EYQ Pm;
    private TextView Td;
    private tp VwS;
    private WU mZx;

    public interface EYQ {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public WriggleGuideAnimationView(Context context, View view, tp tpVar) {
        super(context);
        this.VwS = tpVar;
        EYQ(context, view);
    }

    private void EYQ(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.Kbd = (LinearLayout) findViewById(2097610722);
        this.EYQ = (TextView) findViewById(2097610719);
        this.Td = (TextView) findViewById(2097610718);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(2097610706);
        this.IPb = lottieAnimationView;
        lottieAnimationView.setAnimation("lottie_json/twist_multi_angle.json");
        this.IPb.setImageAssetsFolder("images/");
        this.IPb.mZx(true);
    }

    public void setShakeText(String str) {
        this.Td.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.Kbd;
    }

    public View getWriggleProgressIv() {
        return this.IPb;
    }

    public TextView getTopTextView() {
        return this.EYQ;
    }

    public void setOnShakeViewListener(EYQ eyq) {
        this.Pm = eyq;
    }

    public void EYQ() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    WriggleGuideAnimationView.this.IPb.EYQ();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.mZx == null) {
                this.mZx = new WU(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.2
            };
            tp tpVar = this.VwS;
            if (tpVar != null) {
                tpVar.Td();
                this.VwS.Kbd();
                this.VwS.IPb();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            LottieAnimationView lottieAnimationView = this.IPb;
            if (lottieAnimationView != null) {
                lottieAnimationView.Td();
            }
        } catch (Exception unused) {
        }
    }
}
