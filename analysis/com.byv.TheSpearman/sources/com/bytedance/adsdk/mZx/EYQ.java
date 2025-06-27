package com.bytedance.adsdk.mZx;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.lottie.HX;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.adsdk.lottie.Pm;
import com.bytedance.adsdk.ugeno.EYQ;
import com.bytedance.adsdk.ugeno.EYQ.Td;
import com.bytedance.adsdk.ugeno.component.mZx;
import java.util.HashMap;

/* compiled from: LottieAnimationWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx<LottieAnimationView> {
    protected ImageView.ScaleType EYQ;
    private String KR;
    private HashMap<String, Bitmap> Nuq;
    private boolean OtA;
    private boolean TQF;
    private float TZn;
    private float VOV;
    private boolean na;
    private String wa;

    public EYQ(Context context) {
        super(context);
        this.KR = "images";
        this.VOV = 1.0f;
        this.EYQ = ImageView.ScaleType.FIT_CENTER;
        this.Nuq = new HashMap<>();
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public LottieAnimationView Td() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.mZx);
        lottieAnimationView.EYQ(this);
        return lottieAnimationView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        ((LottieAnimationView) this.Kbd).setProgress(this.TZn);
        if (this.VOV <= 0.0f) {
            this.VOV = 1.0f;
        }
        ((LottieAnimationView) this.Kbd).setSpeed(this.VOV);
        if (this.wa.startsWith("local")) {
            ((LottieAnimationView) this.Kbd).setAnimation(Kbd(this.wa));
            ((LottieAnimationView) this.Kbd).setImageAssetsFolder(this.KR);
        } else {
            ((LottieAnimationView) this.Kbd).setAnimationFromUrl(this.wa);
            ((LottieAnimationView) this.Kbd).setImageAssetDelegate(new Pm() { // from class: com.bytedance.adsdk.mZx.EYQ.1
                @Override // com.bytedance.adsdk.lottie.Pm
                public Bitmap EYQ(final HX hx) {
                    if (hx == null) {
                        return null;
                    }
                    String strPm = hx.Pm();
                    if (TextUtils.isEmpty(strPm)) {
                        return null;
                    }
                    final String strEYQ = Td.EYQ(strPm, EYQ.this.Pm);
                    com.bytedance.adsdk.ugeno.Td.EYQ().mZx().EYQ(EYQ.this.mZx, strEYQ, -1.0f, new EYQ.InterfaceC0074EYQ() { // from class: com.bytedance.adsdk.mZx.EYQ.1.1
                        @Override // com.bytedance.adsdk.ugeno.EYQ.InterfaceC0074EYQ
                        public void EYQ(Bitmap bitmap) {
                            if (bitmap != null) {
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, hx.EYQ(), hx.mZx(), false);
                                EYQ.this.Nuq.put(strEYQ, bitmapCreateScaledBitmap);
                                ((LottieAnimationView) EYQ.this.Kbd).EYQ(hx.Td(), bitmapCreateScaledBitmap);
                            }
                        }
                    });
                    return (Bitmap) EYQ.this.Nuq.get(strEYQ);
                }
            });
        }
        ((LottieAnimationView) this.Kbd).setScaleType(this.EYQ);
        ((LottieAnimationView) this.Kbd).mZx(this.TQF);
        ((LottieAnimationView) this.Kbd).EYQ();
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleType":
                this.EYQ = IPb(str2);
                break;
            case "progress":
                this.TZn = com.bytedance.adsdk.ugeno.mZx.Td.EYQ(str2, 0.0f);
                break;
            case "imagePath":
                this.KR = str2;
                break;
            case "autoReverse":
                this.na = com.bytedance.adsdk.ugeno.mZx.Td.EYQ(str2, false);
                break;
            case "src":
                this.wa = str2;
                break;
            case "loop":
                this.TQF = com.bytedance.adsdk.ugeno.mZx.Td.EYQ(str2, false);
                break;
            case "speed":
                this.VOV = com.bytedance.adsdk.ugeno.mZx.Td.EYQ(str2, 1.0f);
                break;
            case "autoPlay":
                this.OtA = com.bytedance.adsdk.ugeno.mZx.Td.EYQ(str2, false);
                break;
        }
    }

    private String Kbd(String str) {
        return (!TextUtils.isEmpty(str) && str.contains("local")) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
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
