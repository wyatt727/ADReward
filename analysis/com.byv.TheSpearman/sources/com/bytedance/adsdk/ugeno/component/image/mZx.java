package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.EYQ;
import com.bytedance.adsdk.ugeno.Td;
import com.bytedance.adsdk.ugeno.mZx.Pm;
import com.bytedance.adsdk.ugeno.mZx.QQ;

/* compiled from: UGImageWidget.java */
/* loaded from: classes2.dex */
public class mZx extends com.bytedance.adsdk.ugeno.component.mZx<RoundImageView> {
    protected String EYQ;
    protected boolean KR;
    private float TQF;
    private int na;
    protected ImageView.ScaleType wa;

    public mZx(Context context) {
        super(context);
        this.wa = ImageView.ScaleType.FIT_CENTER;
        this.na = -1;
        this.TQF = -1.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() throws NumberFormatException {
        super.mZx();
        QQ();
        ((RoundImageView) this.Kbd).setScaleType(this.wa);
        ((RoundImageView) this.Kbd).setBorderColor(this.mN);
        ((RoundImageView) this.Kbd).setCornerRadius(this.FH);
        ((RoundImageView) this.Kbd).setBorderWidth(this.kf);
        if (this.na != -1) {
            ((RoundImageView) this.Kbd).setColorFilter(this.na);
        }
    }

    public void Kbd(String str) {
        this.EYQ = str;
    }

    private void QQ() throws NumberFormatException {
        if (TextUtils.isEmpty(this.EYQ)) {
            return;
        }
        ((RoundImageView) this.Kbd).setImageDrawable(null);
        if (this.EYQ.startsWith("local://")) {
            ((RoundImageView) this.Kbd).setImageResource(Pm.mZx(this.mZx, this.EYQ.replace("local://", "")));
        } else {
            if (this.EYQ.startsWith("@")) {
                try {
                    ((RoundImageView) this.Kbd).setImageResource(Integer.parseInt(this.EYQ.substring(1)));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            Td.EYQ().mZx().EYQ(this.mZx, this.EYQ, this.TQF, new EYQ.InterfaceC0074EYQ() { // from class: com.bytedance.adsdk.ugeno.component.image.mZx.1
                @Override // com.bytedance.adsdk.ugeno.EYQ.InterfaceC0074EYQ
                public void EYQ(Bitmap bitmap) {
                    Bitmap bitmapEYQ;
                    if (bitmap == null) {
                        return;
                    }
                    ((RoundImageView) mZx.this.Kbd).setImageBitmap(bitmap);
                    if (!mZx.this.KR || (bitmapEYQ = QQ.EYQ(mZx.this.mZx, bitmap, 10)) == null) {
                        return;
                    }
                    ((RoundImageView) mZx.this.Kbd).setBackground(new BitmapDrawable(mZx.this.mZx.getResources(), bitmapEYQ));
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public RoundImageView Td() {
        RoundImageView roundImageView = new RoundImageView(this.mZx);
        roundImageView.EYQ(this);
        return roundImageView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleType":
                this.wa = IPb(str2);
                break;
            case "imageBlur":
                this.TQF = com.bytedance.adsdk.ugeno.mZx.Td.EYQ(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                try {
                    this.KR = Boolean.parseBoolean(str2);
                    break;
                } catch (NumberFormatException unused) {
                    this.KR = false;
                    return;
                }
            case "src":
                this.EYQ = str2;
                break;
            case "tintColor":
                this.na = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
        }
    }

    private ImageView.ScaleType IPb(String str) {
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
