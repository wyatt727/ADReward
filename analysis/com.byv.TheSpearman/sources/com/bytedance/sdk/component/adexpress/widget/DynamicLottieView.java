package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.adsdk.lottie.HX;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.adsdk.lottie.Pm;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.QQ;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class DynamicLottieView extends LottieAnimationView {
    private Map<String, Bitmap> EYQ;
    private String mZx;

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }

    public DynamicLottieView(Context context) {
        super(context);
        this.EYQ = new HashMap();
    }

    public void setImageLottieTosPath(String str) {
        this.mZx = str;
    }

    public void IPb() {
        if (TextUtils.isEmpty(this.mZx)) {
            return;
        }
        setProgress(0.0f);
        mZx(true);
        setAnimationFromUrl(this.mZx);
        setImageAssetDelegate(new Pm() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1
            @Override // com.bytedance.adsdk.lottie.Pm
            public Bitmap EYQ(final HX hx) {
                final String strTd = hx.Td();
                String strKbd = hx.Kbd();
                String strPm = hx.Pm();
                if (TextUtils.equals(strTd, "image_0") && TextUtils.equals(strPm, "Lark20201123-180048_2.png")) {
                    strPm = "hand.png";
                }
                Bitmap bitmap = (Bitmap) DynamicLottieView.this.EYQ.get(strTd);
                if (bitmap != null) {
                    return bitmap;
                }
                EYQ.EYQ().Kbd().EYQ(strKbd + strPm).EYQ(new QQ() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1.2
                    @Override // com.bytedance.sdk.component.Pm.QQ
                    public Bitmap EYQ(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, hx.EYQ(), hx.mZx(), false);
                        DynamicLottieView.this.EYQ.put(strTd, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                }).EYQ(new hu<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicLottieView.1.1
                    @Override // com.bytedance.sdk.component.Pm.hu
                    public void EYQ(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.Pm.hu
                    public void EYQ(MxO<Bitmap> mxO) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(mxO.mZx(), hx.EYQ(), hx.mZx(), false);
                        DynamicLottieView.this.EYQ.put(strTd, bitmapCreateScaledBitmap);
                        DynamicLottieView.this.EYQ(hx.Td(), bitmapCreateScaledBitmap);
                    }
                });
                return (Bitmap) DynamicLottieView.this.EYQ.get(strTd);
            }
        });
        EYQ();
    }
}
