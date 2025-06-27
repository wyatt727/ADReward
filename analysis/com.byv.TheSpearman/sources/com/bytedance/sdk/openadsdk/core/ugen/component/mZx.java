package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.core.widget.GifView;

/* compiled from: UGGifWidget.java */
/* loaded from: classes2.dex */
public class mZx extends com.bytedance.adsdk.ugeno.component.mZx<GifView> {
    protected String EYQ;
    protected ImageView.ScaleType wa;

    public mZx(Context context) {
        super(context);
        this.wa = ImageView.ScaleType.FIT_CENTER;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public GifView Td() {
        this.Kbd = new GifView(this.mZx);
        return (GifView) this.Kbd;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        QQ();
        ((GifView) this.Kbd).setScaleType(this.wa);
    }

    private void QQ() {
        if (TextUtils.isEmpty(this.EYQ)) {
            return;
        }
        if (this.EYQ.startsWith("local://")) {
            ((GifView) this.Kbd).EYQ(com.bytedance.adsdk.ugeno.mZx.Pm.mZx(this.mZx, this.EYQ.replace("local://", "")), false);
        } else {
            com.bytedance.adsdk.ugeno.Td.EYQ().mZx().EYQ(this.mZx, this.EYQ, (ImageView) this.Kbd);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        super.EYQ(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        if (str.equals("scaleType")) {
            this.wa = Kbd(str2);
        } else if (str.equals("src")) {
            this.EYQ = str2;
        }
    }

    private ImageView.ScaleType Kbd(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitXY":
                return ImageView.ScaleType.FIT_XY;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }
}
