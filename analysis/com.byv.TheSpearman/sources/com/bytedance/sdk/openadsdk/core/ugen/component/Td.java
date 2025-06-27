package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* compiled from: UGLogoWidget.java */
/* loaded from: classes2.dex */
public class Td extends com.bytedance.adsdk.ugeno.component.mZx<FrameLayout> {
    public Td(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public FrameLayout Td() {
        FrameLayout frameLayout = new FrameLayout(this.mZx);
        frameLayout.addView(new PAGLogoView(this.mZx));
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
    }
}
