package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: RichTextWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends com.bytedance.adsdk.ugeno.component.mZx<RichTextView> {
    private String EYQ;
    private float KR;
    private int OtA;
    private int TQF;
    private String TZn;
    private int VOV;
    private String na;
    private int wa;

    public EYQ(Context context) {
        super(context);
        this.TQF = Integer.MAX_VALUE;
        this.VOV = 2;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public RichTextView Td() {
        return new RichTextView(this.mZx);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        ((RichTextView) this.Kbd).setRichText(this.EYQ);
        ((RichTextView) this.Kbd).setTextSize(1, this.KR);
        ((RichTextView) this.Kbd).setTextColor(this.wa);
        ((RichTextView) this.Kbd).setLines(this.OtA);
        ((RichTextView) this.Kbd).setMaxLines(this.TQF);
        ((RichTextView) this.Kbd).setGravity(this.VOV);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "textAlign":
                this.VOV = Kbd(str2);
                break;
            case "textColor":
                this.wa = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "textStyle":
                this.na = str2;
                break;
            case "textSize":
                this.KR = Float.parseFloat(str2);
                break;
            case "text":
                this.EYQ = str2;
                break;
            case "lines":
                this.OtA = Integer.parseInt(str2);
                break;
            case "maxLines":
                this.TQF = Integer.parseInt(str2);
                break;
            case "ellipsize":
                this.TZn = str2;
                break;
        }
    }

    private int Kbd(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 17;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return 2;
        }
    }
}
