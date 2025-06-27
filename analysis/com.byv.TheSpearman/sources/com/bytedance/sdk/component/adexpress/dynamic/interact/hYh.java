package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import com.bytedance.sdk.component.utils.zF;
import org.json.JSONObject;

/* compiled from: WriggleGuideInteract.java */
/* loaded from: classes2.dex */
public class hYh implements VwS<WriggleGuideAnimationView> {
    private WriggleGuideAnimationView EYQ;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.tp IPb;
    private String Kbd;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.VwS Pm;
    private DynamicBaseWidget Td;
    private Context mZx;

    public hYh(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS, String str, com.bytedance.sdk.component.adexpress.dynamic.Td.tp tpVar) {
        this.mZx = context;
        this.Td = dynamicBaseWidget;
        this.Pm = vwS;
        this.Kbd = str;
        this.IPb = tpVar;
        Kbd();
    }

    private void Kbd() {
        int iWa = this.Pm.wa();
        final com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ dynamicClickListener = this.Td.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.Kbd)) {
            Context context = this.mZx;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, com.bytedance.sdk.component.adexpress.Td.EYQ.tp(context), this.IPb);
            this.EYQ = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.EYQ.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.EYQ.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.Pm.eFB())) {
                    this.EYQ.getTopTextView().setText(zF.mZx(this.mZx, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.EYQ.getTopTextView().setText(this.Pm.eFB());
                }
            }
        } else {
            Context context2 = this.mZx;
            this.EYQ = new WriggleGuideAnimationView(context2, com.bytedance.sdk.component.adexpress.Td.EYQ.tp(context2), this.IPb);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.EYQ.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(this.mZx, iWa)));
        this.EYQ.setLayoutParams(layoutParams);
        this.EYQ.setShakeText(this.Pm.OtA());
        this.EYQ.setClipChildren(false);
        final View wriggleProgressIv = this.EYQ.getWriggleProgressIv();
        this.EYQ.setOnShakeViewListener(new WriggleGuideAnimationView.EYQ() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.hYh.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void EYQ() {
        this.EYQ.EYQ();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    public void mZx() {
        this.EYQ.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.VwS
    /* renamed from: Pm, reason: merged with bridge method [inline-methods] */
    public WriggleGuideAnimationView Td() {
        return this.EYQ;
    }
}
