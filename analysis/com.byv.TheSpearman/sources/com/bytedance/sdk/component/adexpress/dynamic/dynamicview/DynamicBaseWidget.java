package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.dynamic.Td.VwS;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.bytedance.sdk.component.utils.WU;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class DynamicBaseWidget extends FrameLayout implements IAnimation, Kbd, Pm {
    private float EYQ;
    protected int HX;
    protected float IPb;
    protected View KO;
    protected float Kbd;
    protected Context MxO;
    protected float Pm;
    protected int QQ;
    protected float Td;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.mZx UB;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.EYQ Uc;
    protected int VwS;
    private WU WU;
    private float hYh;
    protected boolean hu;
    private float mZx;
    protected DynamicRootView nWX;
    protected QQ pi;
    protected int tp;
    protected VwS tsL;
    private float zF;
    private static final View.OnTouchListener XN = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener NZ = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.mZx = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.EYQ;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.EYQ = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.hYh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.hYh = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.zF;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.zF = f;
        this.Uc.EYQ(this, f);
    }

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context);
        this.MxO = context;
        this.nWX = dynamicRootView;
        this.pi = qq;
        this.Td = qq.IPb();
        this.Pm = qq.VwS();
        this.Kbd = qq.QQ();
        this.IPb = qq.HX();
        this.HX = (int) IPb.EYQ(this.MxO, this.Td);
        this.tp = (int) IPb.EYQ(this.MxO, this.Pm);
        this.VwS = (int) IPb.EYQ(this.MxO, this.Kbd);
        this.QQ = (int) IPb.EYQ(this.MxO, this.IPb);
        VwS vwS = new VwS(qq.tp());
        this.tsL = vwS;
        if (vwS.Uc() > 0) {
            this.VwS += this.tsL.Uc() * 2;
            this.QQ += this.tsL.Uc() * 2;
            this.HX -= this.tsL.Uc();
            this.tp -= this.tsL.Uc();
            List<QQ> listMxO = qq.MxO();
            if (listMxO != null) {
                for (QQ qq2 : listMxO) {
                    qq2.Td(qq2.IPb() + IPb.mZx(this.MxO, this.tsL.Uc()));
                    qq2.Pm(qq2.VwS() + IPb.mZx(this.MxO, this.tsL.Uc()));
                    qq2.EYQ(IPb.mZx(this.MxO, this.tsL.Uc()));
                    qq2.mZx(IPb.mZx(this.MxO, this.tsL.Uc()));
                }
            }
        }
        this.hu = this.tsL.nWX() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.Uc = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.EYQ();
    }

    public void setShouldInvisible(boolean z) {
        this.hu = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.hu;
    }

    public boolean Td() {
        HX();
        IPb();
        Pm();
        return true;
    }

    public void EYQ(int i) {
        VwS vwS = this.tsL;
        if (vwS != null && vwS.EYQ(i)) {
            HX();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).EYQ(i);
                }
            }
        }
    }

    protected boolean Pm() throws JSONException {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.KO;
        if (view == null) {
            view = this;
        }
        if (Kbd()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = XN;
            onClickListener = NZ;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int iEYQ = com.bytedance.sdk.component.adexpress.dynamic.mZx.EYQ.EYQ(this.tsL);
            if (iEYQ == 2 || iEYQ == 3) {
                view.setOnClickListener(NZ);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        EYQ(view);
        mZx(view);
        return true;
    }

    protected void EYQ(View view) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.pi.QQ());
            jSONObject.put("height", this.pi.HX());
            if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.zF, this.tsL.mN());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.WU, this.pi.tp().mZx());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.XN, this.pi.Td());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.NZ, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.tsL.mN());
            view.setTag(2097610715, this.pi.tp().mZx());
            view.setTag(2097610714, this.pi.Td());
            view.setTag(2097610713, jSONObject.toString());
            int iEYQ = com.bytedance.sdk.component.adexpress.dynamic.mZx.EYQ.EYQ(this.tsL);
            if (iEYQ == 1) {
                view.setTag(2097610707, new Pair(this.tsL.wBa(), Long.valueOf(this.tsL.rfB())));
                view.setTag(2097610708, Integer.valueOf(iEYQ));
            }
        } catch (JSONException unused) {
        }
    }

    protected void mZx(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd;
        QQ qq = this.pi;
        if (qq == null || (iPbKbd = qq.tp().Kbd()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(iPbKbd.oCs()));
    }

    public boolean Kbd() {
        VwS vwS = this.tsL;
        return (vwS == null || vwS.lEs() == 0) ? false : true;
    }

    public void IPb() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.VwS, this.QQ);
        layoutParams.topMargin = this.tp;
        layoutParams.leftMargin = this.HX;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.tsL.lEs();
    }

    public String getImageObjectFit() {
        return this.tsL.TZn();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ getDynamicClickListener() {
        return this.nWX.getDynamicClickListener();
    }

    protected Drawable getBackgroundDrawable() {
        return EYQ(false, "");
    }

    protected Drawable EYQ(boolean z, String str) throws NumberFormatException {
        String[] strArrSplit;
        int[] iArr;
        int iXt;
        if (!TextUtils.isEmpty(this.tsL.kf())) {
            try {
                String strKf = this.tsL.kf();
                String strSubstring = strKf.substring(strKf.indexOf("(") + 1, strKf.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{VwS.EYQ(strArrSplit[1]), VwS.EYQ(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{VwS.EYQ(strArrSplit[1].substring(0, 7)), VwS.EYQ(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d > 225.0d && d < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableEYQ = EYQ(EYQ(strArrSplit[0]), iArr);
                gradientDrawableEYQ.setShape(0);
                gradientDrawableEYQ.setCornerRadius(IPb.EYQ(this.MxO, this.tsL.KO()));
                return gradientDrawableEYQ;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fEYQ = IPb.EYQ(this.MxO, this.tsL.KO());
        drawable.setCornerRadius(fEYQ);
        if (fEYQ < 1.0f) {
            float fEYQ2 = IPb.EYQ(this.MxO, this.tsL.FH());
            float fEYQ3 = IPb.EYQ(this.MxO, this.tsL.tr());
            float fEYQ4 = IPb.EYQ(this.MxO, this.tsL.Tnp());
            float fEYQ5 = IPb.EYQ(this.MxO, this.tsL.FtN());
            float[] fArr = new float[8];
            if (fEYQ2 > 0.0f) {
                fArr[0] = fEYQ2;
                fArr[1] = fEYQ2;
            }
            if (fEYQ3 > 0.0f) {
                fArr[2] = fEYQ3;
                fArr[3] = fEYQ3;
            }
            if (fEYQ4 > 0.0f) {
                fArr[4] = fEYQ4;
                fArr[5] = fEYQ4;
            }
            if (fEYQ5 > 0.0f) {
                fArr[6] = fEYQ5;
                fArr[7] = fEYQ5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            iXt = Color.parseColor(str);
        } else {
            iXt = this.tsL.xt();
        }
        drawable.setColor(iXt);
        if (this.tsL.UB() > 0.0f) {
            drawable.setStroke((int) IPb.EYQ(this.MxO, this.tsL.UB()), this.tsL.hu());
            return drawable;
        }
        if (this.tsL.Uc() <= 0) {
            return drawable;
        }
        drawable.setStroke(this.tsL.Uc(), this.tsL.hu());
        drawable.setAlpha(50);
        if (!TextUtils.equals(this.pi.tp().mZx(), "video-vd")) {
            return drawable;
        }
        setLayerType(1, null);
        return new Td((int) fEYQ, this.tsL.Uc());
    }

    protected mZx EYQ(Bitmap bitmap) {
        return new EYQ(bitmap, null);
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(EYQ(mZx(this.tsL.kf().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    private Drawable[] EYQ(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = VwS.EYQ(strArrSplit[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable gradientDrawableEYQ = EYQ(EYQ(strArrSplit[0]), iArr);
                gradientDrawableEYQ.setShape(0);
                gradientDrawableEYQ.setCornerRadius(IPb.EYQ(this.MxO, this.tsL.KO()));
                drawableArr[(list.size() - 1) - i] = gradientDrawableEYQ;
            }
        }
        return drawableArr;
    }

    private List<String> mZx(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && i - 1 == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    protected GradientDrawable EYQ(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new GradientDrawable();
        }
        if (iArr.length == 1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr[0]);
            return gradientDrawable;
        }
        return new GradientDrawable(orientation, iArr);
    }

    protected GradientDrawable.Orientation EYQ(String str) {
        try {
            int i = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.Uc.EYQ(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.EYQ eyq = this.Uc;
        View view = this.KO;
        if (view == null) {
            view = this;
        }
        eyq.EYQ(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        VwS();
        EYQ();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        mZx();
        super.onDetachedFromWindow();
    }

    public void VwS() {
        if (QQ()) {
            return;
        }
        View view = this.KO;
        if (view == null) {
            view = this;
        }
        com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.mZx mzx = new com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.mZx(view, this.pi.tp().Kbd().qxY());
        this.UB = mzx;
        mzx.EYQ();
    }

    public void mZx() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.mZx mzx = this.UB;
        if (mzx != null) {
            mzx.mZx();
        }
    }

    protected boolean QQ() {
        QQ qq = this.pi;
        return qq == null || qq.tp() == null || this.pi.tp().Kbd() == null || this.pi.tp().Kbd().qxY() == null;
    }

    public int getDynamicWidth() {
        return this.VwS;
    }

    public int getDynamicHeight() {
        return this.QQ;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Td.IPb getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.Td.Kbd kbdTp;
        QQ qq = this.pi;
        if (qq == null || (kbdTp = qq.tp()) == null) {
            return null;
        }
        return kbdTp.Kbd();
    }

    private void EYQ() {
        if (isShown()) {
            int iEYQ = com.bytedance.sdk.component.adexpress.dynamic.mZx.EYQ.EYQ(this.tsL);
            if (iEYQ == 2) {
                if (this.WU == null) {
                    this.WU = new WU(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.3
                };
                pi renderRequest = this.nWX.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.KO();
                    renderRequest.hYh();
                    return;
                }
                return;
            }
            if (iEYQ == 3) {
                if (this.WU == null) {
                    this.WU = new WU(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget.4
                };
                pi renderRequest2 = this.nWX.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.UB();
                    renderRequest2.zF();
                    renderRequest2.Uc();
                }
            }
        }
    }
}
