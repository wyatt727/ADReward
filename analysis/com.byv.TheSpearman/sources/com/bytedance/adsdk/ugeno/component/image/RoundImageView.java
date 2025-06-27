package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class RoundImageView extends ImageView {
    public static final Shader.TileMode EYQ = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] Td = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    static final /* synthetic */ boolean mZx = true;
    private boolean HX;
    private ColorStateList IPb;
    private int KO;
    private Drawable Kbd;
    private boolean MxO;
    private final float[] Pm;
    private ColorFilter QQ;
    private Shader.TileMode UB;
    private Shader.TileMode Uc;
    private float VwS;
    private com.bytedance.adsdk.ugeno.mZx hYh;
    private ImageView.ScaleType hu;
    private int nWX;
    private boolean pi;
    private Drawable tp;
    private boolean tsL;

    public RoundImageView(Context context) {
        super(context);
        this.Pm = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.IPb = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.VwS = 0.0f;
        this.QQ = null;
        this.HX = false;
        this.MxO = false;
        this.tsL = false;
        this.pi = false;
        Shader.TileMode tileMode = EYQ;
        this.UB = tileMode;
        this.Uc = tileMode;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.hu;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!mZx && scaleType == null) {
            throw new AssertionError();
        }
        if (this.hu != scaleType) {
            this.hu = scaleType;
            switch (AnonymousClass1.EYQ[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            Td();
            EYQ(false);
            invalidate();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.component.image.RoundImageView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            EYQ = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EYQ[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EYQ[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EYQ[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EYQ[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EYQ[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.nWX = 0;
        this.tp = EYQ.EYQ(drawable);
        Td();
        super.setImageDrawable(this.tp);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.nWX = 0;
        this.tp = EYQ.EYQ(bitmap);
        Td();
        super.setImageDrawable(this.tp);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.nWX != i) {
            this.nWX = i;
            this.tp = EYQ();
            Td();
            super.setImageDrawable(this.tp);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private Drawable EYQ() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.nWX;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.nWX, e);
                this.nWX = 0;
            }
        }
        return EYQ.EYQ(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) throws Resources.NotFoundException {
        if (this.KO != i) {
            this.KO = i;
            Drawable drawableMZx = mZx();
            this.Kbd = drawableMZx;
            setBackgroundDrawable(drawableMZx);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.Kbd = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    private Drawable mZx() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.KO;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.KO, e);
                this.KO = 0;
            }
        }
        return EYQ.EYQ(drawable);
    }

    private void Td() {
        EYQ(this.tp, this.hu);
    }

    private void EYQ(boolean z) {
        if (this.pi) {
            if (z) {
                this.Kbd = EYQ.EYQ(this.Kbd);
            }
            EYQ(this.Kbd, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.QQ != colorFilter) {
            this.QQ = colorFilter;
            this.MxO = true;
            this.HX = true;
            Pm();
            invalidate();
        }
    }

    private void Pm() {
        Drawable drawable = this.tp;
        if (drawable == null || !this.HX) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.tp = drawableMutate;
        if (this.MxO) {
            drawableMutate.setColorFilter(this.QQ);
        }
    }

    private void EYQ(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof EYQ) {
            EYQ eyq = (EYQ) drawable;
            eyq.EYQ(scaleType).EYQ(this.VwS).EYQ(this.IPb).EYQ(this.tsL).EYQ(this.UB).mZx(this.Uc);
            float[] fArr = this.Pm;
            if (fArr != null) {
                eyq.EYQ(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            Pm();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                EYQ(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.Kbd = drawable;
        EYQ(true);
        super.setBackgroundDrawable(this.Kbd);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.Pm) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    public void setCornerRadiusDimen(int i) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(i);
        EYQ(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        EYQ(f, f, f, f);
    }

    public void EYQ(float f, float f2, float f3, float f4) {
        float[] fArr = this.Pm;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        Td();
        EYQ(false);
        invalidate();
    }

    public float getBorderWidth() {
        return this.VwS;
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderWidth(float f) {
        if (this.VwS == f) {
            return;
        }
        this.VwS = f;
        Td();
        EYQ(false);
        invalidate();
    }

    public int getBorderColor() {
        return this.IPb.getDefaultColor();
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public ColorStateList getBorderColors() {
        return this.IPb;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.IPb.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.IPb = colorStateList;
        Td();
        EYQ(false);
        if (this.VwS > 0.0f) {
            invalidate();
        }
    }

    public void setOval(boolean z) {
        this.tsL = z;
        Td();
        EYQ(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.UB;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.UB == tileMode) {
            return;
        }
        this.UB = tileMode;
        Td();
        EYQ(false);
        invalidate();
    }

    public Shader.TileMode getTileModeY() {
        return this.Uc;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.Uc == tileMode) {
            return;
        }
        this.Uc = tileMode;
        Td();
        EYQ(false);
        invalidate();
    }

    public void EYQ(com.bytedance.adsdk.ugeno.mZx mzx) {
        this.hYh = mzx;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.mZx mzx = this.hYh;
        if (mzx != null) {
            int[] iArrEYQ = mzx.EYQ(i, i2);
            super.onMeasure(iArrEYQ[0], iArrEYQ[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.mZx mzx = this.hYh;
        if (mzx != null) {
            mzx.EYQ(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mZx mzx = this.hYh;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mZx mzx = this.hYh;
        if (mzx != null) {
            mzx.VwS();
        }
    }
}
