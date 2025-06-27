package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.mZx;

/* compiled from: UGRatingBarWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx<UGRatingBar> {
    private int EYQ;
    private float KR;
    private int na;
    private int wa;

    public EYQ(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public UGRatingBar Td() {
        UGRatingBar uGRatingBar = new UGRatingBar(this.mZx);
        uGRatingBar.EYQ(this);
        return uGRatingBar;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        ((UGRatingBar) this.Kbd).EYQ(this.KR, this.EYQ, this.na, 5);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "highLightColor":
                this.EYQ = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "lowLightColor":
                this.wa = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "size":
                try {
                    this.na = Integer.parseInt(str2);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case "score":
                try {
                    this.KR = Float.parseFloat(str2);
                    break;
                } catch (NumberFormatException unused2) {
                    this.KR = 5.0f;
                    return;
                }
        }
    }
}
