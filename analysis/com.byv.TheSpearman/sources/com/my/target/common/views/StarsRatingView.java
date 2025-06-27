package com.my.target.common.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.my.target.ba;

/* loaded from: classes4.dex */
public class StarsRatingView extends View {
    private static final float ACCURACY = 0.2f;
    private static final int GRAY = -3355444;
    private static final int ORANGE = -552162;
    private static final float RAY_LENGTH = 0.45f;
    private static final Paint STAR_PAINT;
    private boolean bitmapCreating;
    private float rating;
    private float starPadding;
    private int starSize;
    private Bitmap starsBitmap;

    static {
        Paint paint = new Paint();
        STAR_PAINT = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public StarsRatingView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createBitmap() {
        if (this.starSize <= 0) {
            return;
        }
        int iFloor = (int) Math.floor(this.rating);
        int iCeil = (int) Math.ceil(5.0f - this.rating);
        float f = iFloor;
        boolean z = this.rating - f >= ACCURACY;
        try {
            int i = this.starSize;
            this.starsBitmap = Bitmap.createBitmap((int) ((i + this.starPadding) * 5.0f), i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.starsBitmap);
            drawStars(0, this.starSize, ORANGE, canvas, iFloor);
            int i2 = this.starSize;
            int i3 = (int) (0 + ((i2 + this.starPadding) * f));
            drawStars(i3, i2, GRAY, canvas, iCeil);
            if (z) {
                int i4 = this.starSize;
                double d = this.rating;
                drawOrangePartStar(i3, i4, (float) (d - Math.floor(d)), canvas);
            }
            invalidate();
            this.bitmapCreating = false;
        } catch (OutOfMemoryError unused) {
            ba.a("StarsRatingView: Unable to create rating bitmap because of OOME");
        }
    }

    private void drawOrangePartStar(int i, int i2, float f, Canvas canvas) {
        Paint paint = STAR_PAINT;
        paint.setColor(ORANGE);
        Path pathDrawStarPath = drawStarPath(0, i2 / 2, 1);
        float f2 = i2 * f;
        Rect rect = new Rect(i, 0, (int) (i + f2), i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) f2, i2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawPath(pathDrawStarPath, paint);
        canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rect, paint);
    }

    private Path drawStarPath(int i, float f, int i2) {
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        int i3 = 0;
        while (i3 < i2) {
            float f2 = i3;
            float f3 = i + f + (f2 * f * 2.0f) + (f2 * this.starPadding);
            float f4 = RAY_LENGTH * f;
            double d = f3;
            double d2 = f;
            float f5 = 2.0f * f;
            path.moveTo((float) (d + (Math.sin(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) * d2)), f5 - ((float) ((Math.cos(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) * d2) + d2)));
            double d3 = f4;
            path.lineTo((float) (d + (Math.sin(0.6283185307179586d) * d3)), f5 - ((float) (d2 + (Math.cos(0.6283185307179586d) * d3))));
            int i4 = 1;
            while (i4 < 5) {
                double d4 = i4 * 1.2566370614359172d;
                path.lineTo((float) (d + (Math.sin(d4) * d2)), f5 - ((float) (d2 + (Math.cos(d4) * d2))));
                double d5 = d4 + 0.6283185307179586d;
                path.lineTo((float) (d + (Math.sin(d5) * d3)), f5 - ((float) ((Math.cos(d5) * d3) + d2)));
                i4++;
                i3 = i3;
            }
            i3++;
        }
        path.close();
        return path;
    }

    private void drawStars(int i, int i2, int i3, Canvas canvas, int i4) {
        Paint paint = STAR_PAINT;
        paint.setColor(i3);
        canvas.drawPath(drawStarPath(i, i2 / 2, i4), paint);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.rating > 0.0f) {
            Bitmap bitmap = this.starsBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                if (this.starSize <= 0 || this.bitmapCreating) {
                    return;
                }
                this.bitmapCreating = true;
                post(new Runnable() { // from class: com.my.target.common.views.StarsRatingView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.createBitmap();
                    }
                });
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = this.starSize;
        if (size <= 0) {
            size = View.MeasureSpec.getSize(i2);
            this.starSize = size;
        }
        setMeasuredDimension((int) ((size * 5) + (this.starPadding * 4.0f)), size);
    }

    public void setRating(float f) {
        setContentDescription(Float.toString(f));
        if (f > 5.0f || f < 0.0f) {
            ba.a("StarsRatingView: Rating is out of bounds - " + f);
            this.rating = 0.0f;
        } else {
            this.rating = f;
        }
        invalidate();
    }

    public void setStarSize(int i) {
        this.starSize = i;
    }

    public void setStarsPadding(float f) {
        this.starPadding = f;
    }
}
