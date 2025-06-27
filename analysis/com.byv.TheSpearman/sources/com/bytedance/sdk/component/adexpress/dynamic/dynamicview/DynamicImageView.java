package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.Pm.KO;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.component.Pm.tp;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.Pm.VwS;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.HX;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationImageView;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;
import com.bytedance.sdk.component.adexpress.widget.GifView;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.utils.zF;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DynamicImageView extends DynamicBaseWidgetImp {
    private String EYQ;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        if (!TextUtils.isEmpty(this.tsL.Hnh()) && qq.hYh()) {
            DynamicLottieView dynamicLottieView = new DynamicLottieView(context);
            dynamicLottieView.setAnimationsLoop(this.tsL.XL());
            dynamicLottieView.setImageLottieTosPath(this.tsL.Hnh());
            dynamicLottieView.setLottieAppNameMaxLength(this.tsL.wG());
            dynamicLottieView.setLottieAdTitleMaxLength(this.tsL.CsQ());
            dynamicLottieView.setLottieAdDescMaxLength(this.tsL.TZE());
            dynamicLottieView.setData(qq.zF());
            this.KO = dynamicLottieView;
        } else if (this.tsL.KO() > 0.0f) {
            this.KO = new TTRoundRectImageView(context);
            ((TTRoundRectImageView) this.KO).setXRound((int) IPb.EYQ(context, this.tsL.KO()));
            ((TTRoundRectImageView) this.KO).setYRound((int) IPb.EYQ(context, this.tsL.KO()));
        } else if (!QQ() && "arrowButton".equals(qq.tp().mZx())) {
            AnimationImageView animationImageView = new AnimationImageView(context);
            animationImageView.setBrickNativeValue(this.tsL);
            this.KO = animationImageView;
        } else if (VwS.mZx(this.tsL.MxO())) {
            this.KO = new GifView(context);
        } else {
            this.KO = new ImageView(context);
        }
        this.EYQ = getImageKey();
        this.KO.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(qq.tp().mZx())) {
            if (this.tsL.mZx() > 0 || this.tsL.EYQ() > 0) {
                this.VwS = Math.min(this.VwS, this.QQ);
                this.QQ = Math.min(this.VwS, this.QQ);
                this.HX = (int) (this.HX + IPb.EYQ(context, this.tsL.mZx() + (this.tsL.EYQ() / 2) + 0.5f));
            } else {
                this.VwS = Math.max(this.VwS, this.QQ);
                this.QQ = Math.max(this.VwS, this.QQ);
            }
            this.tsL.EYQ(this.VwS / 2);
        }
        addView(this.KO, new FrameLayout.LayoutParams(this.VwS, this.QQ));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.KO).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.KO).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() throws NumberFormatException {
        super.HX();
        if (!TextUtils.isEmpty(this.tsL.Hnh())) {
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        if ("arrowButton".equals(this.pi.tp().mZx())) {
            ((ImageView) this.KO).setImageResource(zF.Pm(this.MxO, "tt_white_righterbackicon_titlebar"));
            if (Build.VERSION.SDK_INT >= 19 && ((ImageView) this.KO).getDrawable() != null) {
                ((ImageView) this.KO).getDrawable().setAutoMirrored(true);
            }
            this.KO.setPadding(0, 0, 0, 0);
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.KO.setBackgroundColor(this.tsL.xt());
        String strTd = this.pi.tp().Td();
        if ("user".equals(strTd)) {
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.KO).setColorFilter(this.tsL.VwS());
            ((ImageView) this.KO).setImageDrawable(zF.Td(getContext(), "tt_user"));
            ((ImageView) this.KO).setPadding(this.VwS / 10, this.QQ / 5, this.VwS / 10, 0);
        } else if (strTd != null && strTd.startsWith("@")) {
            try {
                ((ImageView) this.KO).setImageResource(Integer.parseInt(strTd.substring(1)));
            } catch (Exception unused) {
            }
        }
        KO koKbd = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Kbd();
        String strMxO = this.tsL.MxO();
        if (!TextUtils.isEmpty(strMxO) && !strMxO.startsWith("http:") && !strMxO.startsWith("https:")) {
            String strXN = null;
            if (this.nWX != null && this.nWX.getRenderRequest() != null) {
                strXN = this.nWX.getRenderRequest().XN();
            }
            strMxO = HX.mZx(strMxO, strXN);
        }
        tp tpVarEYQ = koKbd.EYQ(strMxO).EYQ(this.EYQ);
        String strNWX = this.nWX.getRenderRequest().nWX();
        if (!TextUtils.isEmpty(strNWX)) {
            tpVarEYQ.mZx(strNWX);
        }
        if (EYQ() && Build.VERSION.SDK_INT >= 17) {
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.FIT_CENTER);
            tpVarEYQ.EYQ(Bitmap.Config.ARGB_4444).Td(2).EYQ(new com.bytedance.sdk.component.Pm.QQ() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.2
                @Override // com.bytedance.sdk.component.Pm.QQ
                public Bitmap EYQ(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.Pm.EYQ.EYQ(DynamicImageView.this.MxO, bitmap, 25);
                }
            }).EYQ(new hu<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.1
                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(MxO<Bitmap> mxO) {
                    Bitmap bitmapMZx = mxO.mZx();
                    if (bitmapMZx == null || mxO.Td() == null) {
                        return;
                    }
                    DynamicImageView.this.KO.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), bitmapMZx));
                }
            });
        } else {
            if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                tpVarEYQ.EYQ((ImageView) this.KO);
            }
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.KO instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (!com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            EYQ(tpVarEYQ);
        }
        return true;
    }

    private boolean EYQ() {
        String strTsL = this.tsL.tsL();
        if (this.tsL.zF()) {
            return true;
        }
        if (TextUtils.isEmpty(strTsL)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strTsL);
            return Math.abs((((float) this.VwS) / (((float) this.QQ) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> mapMxO = this.nWX.getRenderRequest().MxO();
        if (mapMxO == null || mapMxO.size() <= 0) {
            return null;
        }
        return mapMxO.get(this.tsL.MxO());
    }

    private void EYQ(tp tpVar) {
        tpVar.Td(3).EYQ(new hu() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.3
            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(MxO mxO) {
                Object objMZx = mxO.mZx();
                if ((objMZx instanceof byte[]) && (DynamicImageView.this.KO instanceof ImageView)) {
                    com.bytedance.sdk.component.adexpress.Pm.Pm.EYQ((ImageView) DynamicImageView.this.KO, (byte[]) objMZx, DynamicImageView.this.VwS, DynamicImageView.this.QQ);
                }
            }
        });
    }
}
