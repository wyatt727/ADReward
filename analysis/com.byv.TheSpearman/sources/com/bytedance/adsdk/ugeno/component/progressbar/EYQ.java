package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.mZx;
import com.bytedance.adsdk.ugeno.mZx.QQ;
import com.bytedance.adsdk.ugeno.mZx.Td;

/* compiled from: UGProgressButtonWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx<UGProgressBar> {
    private int EYQ;
    private String KR;
    private float OtA;
    private float TQF;
    private int na;
    private int wa;

    public EYQ(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public UGProgressBar Td() {
        UGProgressBar uGProgressBar = new UGProgressBar(this.mZx);
        uGProgressBar.EYQ(this);
        return uGProgressBar;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        ((UGProgressBar) this.Kbd).setBackgroundColor(this.wa);
        ((UGProgressBar) this.Kbd).setText(this.KR);
        ((UGProgressBar) this.Kbd).setProgressBgColor(this.wa);
        ((UGProgressBar) this.Kbd).setProgressColor(this.EYQ);
        ((UGProgressBar) this.Kbd).setTextColor(this.na);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "progressBgColor":
                this.wa = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "textColor":
                this.na = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "textSize":
                this.TQF = QQ.EYQ(this.mZx, str2);
                break;
            case "progress":
                this.OtA = Td.EYQ(str2, 0.0f);
                break;
            case "text":
                this.KR = str2;
                break;
            case "progressColor":
                this.EYQ = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
        }
    }
}
