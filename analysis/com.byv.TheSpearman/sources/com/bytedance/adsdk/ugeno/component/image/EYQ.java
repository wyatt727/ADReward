package com.bytedance.adsdk.ugeno.component.image;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import java.util.HashSet;

/* compiled from: RoundedDrawable.java */
/* loaded from: classes2.dex */
public class EYQ extends Drawable {
    private final Paint HX;
    private final int IPb;
    private float KO;
    private final Paint Kbd;
    private final RectF MxO;
    private final Bitmap Pm;
    private final RectF QQ;
    private final RectF Td;
    private boolean UB;
    private float Uc;
    private final int VwS;
    private ColorStateList hYh;
    private final boolean[] hu;
    private boolean nWX;
    private Shader.TileMode pi;
    private final Matrix tp;
    private Shader.TileMode tsL;
    private ImageView.ScaleType zF;
    private final RectF EYQ = new RectF();
    private final RectF mZx = new RectF();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public EYQ(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.Td = rectF;
        this.QQ = new RectF();
        this.tp = new Matrix();
        this.MxO = new RectF();
        this.tsL = Shader.TileMode.CLAMP;
        this.pi = Shader.TileMode.CLAMP;
        this.nWX = true;
        this.KO = 0.0f;
        this.hu = new boolean[]{true, true, true, true};
        this.UB = false;
        this.Uc = 0.0f;
        this.hYh = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.zF = ImageView.ScaleType.FIT_CENTER;
        this.Pm = bitmap;
        int width = bitmap.getWidth();
        this.IPb = width;
        int height = bitmap.getHeight();
        this.VwS = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.Kbd = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.HX = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.hYh.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.Uc);
    }

    public static EYQ EYQ(Bitmap bitmap) {
        if (bitmap != null) {
            return new EYQ(bitmap);
        }
        return null;
    }

    public static Drawable EYQ(Drawable drawable) {
        if (drawable == null || (drawable instanceof EYQ)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            Drawable.ConstantState constantState = drawable.mutate().getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), EYQ(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        Bitmap bitmapMZx = mZx(drawable);
        return bitmapMZx != null ? new EYQ(bitmapMZx) : drawable;
    }

    public static Bitmap mZx(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.hYh.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.hYh.getColorForState(iArr, 0);
        if (this.HX.getColor() != colorForState) {
            this.HX.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* compiled from: RoundedDrawable.java */
    /* renamed from: com.bytedance.adsdk.ugeno.component.image.EYQ$1, reason: invalid class name */
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
                EYQ[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EYQ[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EYQ[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void EYQ() {
        float fWidth;
        float fHeight;
        int i = AnonymousClass1.EYQ[this.zF.ordinal()];
        if (i == 1) {
            this.QQ.set(this.EYQ);
            RectF rectF = this.QQ;
            float f = this.Uc;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.tp.reset();
            this.tp.setTranslate((int) (((this.QQ.width() - this.IPb) * 0.5f) + 0.5f), (int) (((this.QQ.height() - this.VwS) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.QQ.set(this.EYQ);
            RectF rectF2 = this.QQ;
            float f2 = this.Uc;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.tp.reset();
            float fWidth2 = 0.0f;
            if (this.IPb * this.QQ.height() > this.QQ.width() * this.VwS) {
                fWidth = this.QQ.height() / this.VwS;
                fHeight = 0.0f;
                fWidth2 = (this.QQ.width() - (this.IPb * fWidth)) * 0.5f;
            } else {
                fWidth = this.QQ.width() / this.IPb;
                fHeight = (this.QQ.height() - (this.VwS * fWidth)) * 0.5f;
            }
            this.tp.setScale(fWidth, fWidth);
            Matrix matrix = this.tp;
            float f3 = this.Uc;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.tp.reset();
            float fMin = (((float) this.IPb) > this.EYQ.width() || ((float) this.VwS) > this.EYQ.height()) ? Math.min(this.EYQ.width() / this.IPb, this.EYQ.height() / this.VwS) : 1.0f;
            float fWidth3 = (int) (((this.EYQ.width() - (this.IPb * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.EYQ.height() - (this.VwS * fMin)) * 0.5f) + 0.5f);
            this.tp.setScale(fMin, fMin);
            this.tp.postTranslate(fWidth3, fHeight2);
            this.QQ.set(this.Td);
            this.tp.mapRect(this.QQ);
            RectF rectF3 = this.QQ;
            float f4 = this.Uc;
            rectF3.inset(f4 / 2.0f, f4 / 2.0f);
            this.tp.setRectToRect(this.Td, this.QQ, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.QQ.set(this.Td);
            this.tp.setRectToRect(this.Td, this.EYQ, Matrix.ScaleToFit.END);
            this.tp.mapRect(this.QQ);
            RectF rectF4 = this.QQ;
            float f5 = this.Uc;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.tp.setRectToRect(this.Td, this.QQ, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.QQ.set(this.Td);
            this.tp.setRectToRect(this.Td, this.EYQ, Matrix.ScaleToFit.START);
            this.tp.mapRect(this.QQ);
            RectF rectF5 = this.QQ;
            float f6 = this.Uc;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.tp.setRectToRect(this.Td, this.QQ, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.QQ.set(this.Td);
            this.tp.setRectToRect(this.Td, this.EYQ, Matrix.ScaleToFit.CENTER);
            this.tp.mapRect(this.QQ);
            RectF rectF6 = this.QQ;
            float f7 = this.Uc;
            rectF6.inset(f7 / 2.0f, f7 / 2.0f);
            this.tp.setRectToRect(this.Td, this.QQ, Matrix.ScaleToFit.FILL);
        } else {
            this.QQ.set(this.EYQ);
            RectF rectF7 = this.QQ;
            float f8 = this.Uc;
            rectF7.inset(f8 / 2.0f, f8 / 2.0f);
            this.tp.reset();
            this.tp.setRectToRect(this.Td, this.QQ, Matrix.ScaleToFit.FILL);
        }
        this.mZx.set(this.QQ);
        this.nWX = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.EYQ.set(rect);
        EYQ();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.nWX) {
            BitmapShader bitmapShader = new BitmapShader(this.Pm, this.tsL, this.pi);
            if (this.tsL == Shader.TileMode.CLAMP && this.pi == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.tp);
            }
            this.Kbd.setShader(bitmapShader);
            this.nWX = false;
        }
        if (this.UB) {
            if (this.Uc > 0.0f) {
                canvas.drawOval(this.mZx, this.Kbd);
                canvas.drawOval(this.QQ, this.HX);
                return;
            } else {
                canvas.drawOval(this.mZx, this.Kbd);
                return;
            }
        }
        if (EYQ(this.hu)) {
            float f = this.KO;
            if (this.Uc > 0.0f) {
                canvas.drawRoundRect(this.mZx, f, f, this.Kbd);
                canvas.drawRoundRect(this.QQ, f, f, this.HX);
                EYQ(canvas);
                mZx(canvas);
                return;
            }
            canvas.drawRoundRect(this.mZx, f, f, this.Kbd);
            EYQ(canvas);
            return;
        }
        canvas.drawRect(this.mZx, this.Kbd);
        if (this.Uc > 0.0f) {
            canvas.drawRect(this.QQ, this.HX);
        }
    }

    private void EYQ(Canvas canvas) {
        if (mZx(this.hu) || this.KO == 0.0f) {
            return;
        }
        float f = this.mZx.left;
        float f2 = this.mZx.top;
        float fWidth = this.mZx.width() + f;
        float fHeight = this.mZx.height() + f2;
        float f3 = this.KO;
        if (!this.hu[0]) {
            this.MxO.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.MxO, this.Kbd);
        }
        if (!this.hu[1]) {
            this.MxO.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.MxO, this.Kbd);
        }
        if (!this.hu[2]) {
            this.MxO.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.MxO, this.Kbd);
        }
        if (this.hu[3]) {
            return;
        }
        this.MxO.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.MxO, this.Kbd);
    }

    private void mZx(Canvas canvas) {
        if (mZx(this.hu) || this.KO == 0.0f) {
            return;
        }
        float f = this.mZx.left;
        float f2 = this.mZx.top;
        float fWidth = f + this.mZx.width();
        float fHeight = f2 + this.mZx.height();
        float f3 = this.KO;
        float f4 = this.Uc / 2.0f;
        if (!this.hu[0]) {
            canvas.drawLine(f - f4, f2, f + f3, f2, this.HX);
            canvas.drawLine(f, f2 - f4, f, f2 + f3, this.HX);
        }
        if (!this.hu[1]) {
            canvas.drawLine((fWidth - f3) - f4, f2, fWidth, f2, this.HX);
            canvas.drawLine(fWidth, f2 - f4, fWidth, f2 + f3, this.HX);
        }
        if (!this.hu[2]) {
            canvas.drawLine((fWidth - f3) - f4, fHeight, fWidth + f4, fHeight, this.HX);
            canvas.drawLine(fWidth, fHeight - f3, fWidth, fHeight, this.HX);
        }
        if (this.hu[3]) {
            return;
        }
        canvas.drawLine(f - f4, fHeight, f + f3, fHeight, this.HX);
        canvas.drawLine(f, fHeight - f3, f, fHeight, this.HX);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Kbd.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.Kbd.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.Kbd.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.Kbd.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.Kbd.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.Kbd.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.IPb;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.VwS;
    }

    public EYQ EYQ(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
            }
            this.KO = fFloatValue;
        } else {
            this.KO = 0.0f;
        }
        boolean[] zArr = this.hu;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    public EYQ EYQ(float f) {
        this.Uc = f;
        this.HX.setStrokeWidth(f);
        return this;
    }

    public EYQ EYQ(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.hYh = colorStateList;
        this.HX.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public EYQ EYQ(boolean z) {
        this.UB = z;
        return this;
    }

    public EYQ EYQ(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.zF != scaleType) {
            this.zF = scaleType;
            EYQ();
        }
        return this;
    }

    public EYQ EYQ(Shader.TileMode tileMode) {
        if (this.tsL != tileMode) {
            this.tsL = tileMode;
            this.nWX = true;
            invalidateSelf();
        }
        return this;
    }

    public EYQ mZx(Shader.TileMode tileMode) {
        if (this.pi != tileMode) {
            this.pi = tileMode;
            this.nWX = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean EYQ(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean mZx(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
