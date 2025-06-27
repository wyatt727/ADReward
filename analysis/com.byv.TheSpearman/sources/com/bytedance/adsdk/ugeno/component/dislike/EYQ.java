package com.bytedance.adsdk.ugeno.component.dislike;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.component.mZx;
import com.bytedance.adsdk.ugeno.mZx.QQ;

/* compiled from: UGDislikeWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx<DislikeView> {
    private int EYQ;
    private int KR;
    private int wa;

    public EYQ(Context context) {
        super(context);
        this.EYQ = 0;
        this.KR = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public DislikeView Td() {
        DislikeView dislikeView = new DislikeView(this.mZx);
        dislikeView.EYQ(this);
        return dislikeView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        ((DislikeView) this.Kbd).setRadius(this.FH);
        ((DislikeView) this.Kbd).setStrokeWidth((int) this.kf);
        ((DislikeView) this.Kbd).setDislikeColor(this.EYQ);
        ((DislikeView) this.Kbd).setStrokeColor(this.mN);
        ((DislikeView) this.Kbd).setDislikeWidth(this.wa);
        ((DislikeView) this.Kbd).setBgColor(this.KR);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "dislikeColor":
                this.EYQ = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "dislikeWidth":
                this.wa = (int) QQ.EYQ(this.mZx, Integer.parseInt(str2));
                break;
            case "dislikeFillColor":
                this.KR = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
        }
    }
}
