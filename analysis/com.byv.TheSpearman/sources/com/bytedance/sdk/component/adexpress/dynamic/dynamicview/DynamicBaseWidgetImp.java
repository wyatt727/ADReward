package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.component.Pm.tp;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.Pm.VwS;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.HX;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.bytedance.sdk.component.adexpress.widget.GifView;
import com.bytedance.sdk.component.utils.XN;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class DynamicBaseWidgetImp extends DynamicBaseWidget {
    private static String zF = "";
    private Runnable EYQ;
    private volatile boolean WU;
    private ImageView XN;
    protected InteractViewContainer hYh;
    private Runnable mZx;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.WU = true;
        setTag(Integer.valueOf(getClickArea()));
        String strMZx = qq.tp().mZx();
        if ("logo-union".equals(strMZx)) {
            dynamicRootView.setLogoUnionHeight(this.QQ - ((int) IPb.EYQ(context, this.tsL.mZx() + this.tsL.EYQ())));
        } else if ("scoreCountWithIcon".equals(strMZx)) {
            dynamicRootView.setScoreCountWithIcon(this.QQ - ((int) IPb.EYQ(context, this.tsL.mZx() + this.tsL.EYQ())));
        }
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.VwS, this.QQ);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        Drawable backgroundDrawable;
        final View view = this.KO == null ? this : this.KO;
        setContentDescription(this.pi.EYQ(this.tsL.lEs()));
        String strWU = this.tsL.WU();
        if (this.tsL.zF() && Build.VERSION.SDK_INT >= 17) {
            final int iHYh = this.tsL.hYh();
            com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Kbd().EYQ(this.tsL.mZx).Td(2).EYQ(new com.bytedance.sdk.component.Pm.QQ() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.3
                @Override // com.bytedance.sdk.component.Pm.QQ
                public Bitmap EYQ(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.Pm.EYQ.EYQ(DynamicBaseWidgetImp.this.MxO, bitmap, iHYh);
                }
            }).EYQ(new hu<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.1
                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(MxO<Bitmap> mxO) {
                    Bitmap bitmapMZx = mxO.mZx();
                    if (bitmapMZx == null || mxO.Td() == null) {
                        return;
                    }
                    view.setBackground(DynamicBaseWidgetImp.this.EYQ(bitmapMZx));
                }
            });
        } else if (!TextUtils.isEmpty(strWU)) {
            if (!strWU.startsWith("http:")) {
                String strXN = null;
                if (this.nWX != null && this.nWX.getRenderRequest() != null) {
                    strXN = this.nWX.getRenderRequest().XN();
                }
                strWU = HX.mZx(strWU, strXN);
            }
            tp tpVarTd = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Kbd().EYQ(strWU).Td(2);
            EYQ(tpVarTd);
            if (!com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                if ((view instanceof FrameLayout) && TextUtils.equals(this.pi.tp().mZx(), "vessel")) {
                    if (VwS.mZx(strWU)) {
                        this.XN = new GifView(this.MxO);
                    } else {
                        this.XN = new ImageView(this.MxO);
                    }
                    ((FrameLayout) view).addView(this.XN, new FrameLayout.LayoutParams(-1, -1));
                    tpVarTd.Td(3).EYQ(new hu() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.4
                        @Override // com.bytedance.sdk.component.Pm.hu
                        public void EYQ(int i, String str, Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.Pm.hu
                        public void EYQ(MxO mxO) {
                            Object objMZx = mxO.mZx();
                            if (objMZx instanceof byte[]) {
                                com.bytedance.sdk.component.adexpress.Pm.Pm.EYQ(DynamicBaseWidgetImp.this.XN, (byte[]) objMZx, DynamicBaseWidgetImp.this.VwS, DynamicBaseWidgetImp.this.QQ);
                            }
                        }
                    });
                } else {
                    EYQ(tpVarTd, view);
                }
            } else {
                tpVarTd.EYQ(new hu<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.5
                    @Override // com.bytedance.sdk.component.Pm.hu
                    public void EYQ(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.Pm.hu
                    public void EYQ(MxO<Bitmap> mxO) {
                        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                            view.setBackground(new BitmapDrawable(mxO.mZx()));
                            if (DynamicBaseWidgetImp.this.pi == null || DynamicBaseWidgetImp.this.pi.tp() == null || 6 != DynamicBaseWidgetImp.this.pi.tp().EYQ() || Build.VERSION.SDK_INT < 19 || view.getBackground() == null) {
                                return;
                            }
                            view.getBackground().setAutoMirrored(true);
                            return;
                        }
                        if (DynamicBaseWidgetImp.this.nWX == null) {
                            return;
                        }
                        if (!"open_ad".equals(DynamicBaseWidgetImp.this.nWX.getRenderRequest().Pm()) && !"splash_ad".equals(DynamicBaseWidgetImp.this.nWX.getRenderRequest().Pm())) {
                            view.setBackground(new BitmapDrawable(mxO.mZx()));
                        } else {
                            view.setBackground(new BitmapDrawable(mxO.mZx()));
                        }
                    }
                });
            }
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.tsL.Nvm() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DynamicBaseWidgetImp.this.tsL.PI() > 0) {
                            DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                            Drawable drawableMZx = dynamicBaseWidgetImp.mZx(dynamicBaseWidgetImp.nWX.getBgMaterialCenterCalcColor().get(Integer.valueOf(DynamicBaseWidgetImp.this.tsL.PI())));
                            if (drawableMZx == null) {
                                DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                                drawableMZx = dynamicBaseWidgetImp2.EYQ(true, dynamicBaseWidgetImp2.nWX.getBgMaterialCenterCalcColor().get(Integer.valueOf(DynamicBaseWidgetImp.this.tsL.PI())));
                            }
                            if (drawableMZx != null) {
                                view.setBackground(drawableMZx);
                                return;
                            }
                            View view2 = view;
                            DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                            view2.setBackground(dynamicBaseWidgetImp3.EYQ(true, dynamicBaseWidgetImp3.nWX.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.tsL.Nvm() * 1000.0d));
        }
        if (this.KO != null) {
            this.KO.setPadding((int) IPb.EYQ(this.MxO, this.tsL.Td()), (int) IPb.EYQ(this.MxO, this.tsL.mZx()), (int) IPb.EYQ(this.MxO, this.tsL.Pm()), (int) IPb.EYQ(this.MxO, this.tsL.EYQ()));
        }
        if (this.hu || this.tsL.nWX() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    private void EYQ(tp tpVar, final View view) {
        tpVar.EYQ(new hu<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.7
            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(MxO<Bitmap> mxO) {
                if (DynamicBaseWidgetImp.this.nWX == null) {
                    return;
                }
                if (!"open_ad".equals(DynamicBaseWidgetImp.this.nWX.getRenderRequest().Pm()) && !"splash_ad".equals(DynamicBaseWidgetImp.this.nWX.getRenderRequest().Pm())) {
                    view.setBackground(new BitmapDrawable(mxO.mZx()));
                } else {
                    if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                        view.setBackground(new EYQ(mxO.mZx(), ((DynamicRoot) DynamicBaseWidgetImp.this.nWX.getChildAt(0)).EYQ));
                        return;
                    }
                    view.setBackground(new BitmapDrawable(mxO.mZx()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable mZx(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i));
                } else if (jSONArray.getString(i).endsWith("deg")) {
                    string = jSONArray.getString(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.Td.VwS.EYQ(((String) arrayList.get(i2)).substring(0, 7));
            }
            GradientDrawable gradientDrawableEYQ = EYQ(EYQ(string), iArr);
            gradientDrawableEYQ.setShape(0);
            gradientDrawableEYQ.setCornerRadius(IPb.EYQ(this.MxO, this.tsL.KO()));
            return gradientDrawableEYQ;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void EYQ(tp tpVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            tpVar.EYQ(Bitmap.Config.ARGB_8888);
        }
    }

    private static String getBuildModel() {
        try {
            zF = XN.EYQ();
        } catch (Throwable unused) {
            zF = Build.MODEL;
        }
        if (TextUtils.isEmpty(zF)) {
            zF = Build.MODEL;
        }
        return zF;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View view = this.KO == null ? this : this.KO;
        double dZF = this.pi.tp().Kbd().zF();
        if (dZF < 90.0d && dZF > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            com.bytedance.sdk.component.utils.QQ.mZx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.8
                @Override // java.lang.Runnable
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (dZF * 1000.0d));
        }
        EYQ(this.pi.tp().Kbd().hYh(), view);
        if (!TextUtils.isEmpty(this.tsL.lRN())) {
            EYQ();
        }
        super.onAttachedToWindow();
    }

    private void EYQ(double d, final View view) {
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            com.bytedance.sdk.component.utils.QQ.mZx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.9
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.pi.tp().Kbd().qxY() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    DynamicBaseWidgetImp.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.EYQ);
            removeCallbacks(this.mZx);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof InteractViewContainer) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    private void EYQ() {
        if (this.WU) {
            int iKR = this.tsL.KR();
            int iNa = this.tsL.na();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.10
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.nWX != null && DynamicBaseWidgetImp.this.nWX.getRenderRequest() != null) {
                        pi renderRequest = DynamicBaseWidgetImp.this.nWX.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.Td.tp tpVar = new com.bytedance.sdk.component.adexpress.dynamic.Td.tp();
                        tpVar.EYQ(renderRequest.KO());
                        tpVar.mZx(renderRequest.hu());
                        tpVar.Td(renderRequest.UB());
                        tpVar.EYQ(renderRequest.Uc());
                        tpVar.Pm(renderRequest.hYh());
                        tpVar.Kbd(renderRequest.zF());
                        DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                        Context context = DynamicBaseWidgetImp.this.MxO;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp.hYh = new InteractViewContainer(context, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.tsL, tpVar, renderRequest);
                    } else {
                        DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                        Context context2 = DynamicBaseWidgetImp.this.MxO;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp3.hYh = new InteractViewContainer(context2, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.tsL);
                    }
                    DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp5.mZx(dynamicBaseWidgetImp5.hYh);
                    if (DynamicBaseWidgetImp.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) DynamicBaseWidgetImp.this.getParent()).setClipChildren(false);
                    }
                    DynamicBaseWidgetImp.this.setClipChildren(false);
                    DynamicBaseWidgetImp.this.hYh.setTag(2);
                    DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp6.EYQ((ViewGroup) dynamicBaseWidgetImp6);
                    DynamicBaseWidgetImp dynamicBaseWidgetImp7 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp7.addView(dynamicBaseWidgetImp7.hYh, new FrameLayout.LayoutParams(-1, -1));
                    DynamicBaseWidgetImp.this.hYh.Td();
                }
            };
            this.EYQ = runnable;
            postDelayed(runnable, iKR * 1000);
            if (this.tsL.TQF() || iNa >= Integer.MAX_VALUE || iKR >= iNa) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.2
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.hYh != null) {
                        DynamicBaseWidgetImp.this.WU = false;
                        DynamicBaseWidgetImp.this.hYh.Pm();
                        DynamicBaseWidgetImp.this.hYh.setVisibility(4);
                        DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp.removeView(dynamicBaseWidgetImp.hYh);
                    }
                }
            };
            this.mZx = runnable2;
            postDelayed(runnable2, iNa * 1000);
        }
    }
}
