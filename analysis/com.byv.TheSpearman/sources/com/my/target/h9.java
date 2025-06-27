package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes4.dex */
public class h9 extends View {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f3993a;
    public static final Path b;

    static {
        Paint paint = new Paint();
        f3993a = paint;
        b = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    public h9(Context context) {
        super(context);
    }

    public static Path a(float f) {
        Path path = b;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f2 = 0.45f * f;
        double d = f;
        float f3 = f * 2.0f;
        path.moveTo((float) ((Math.sin(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) * d) + d), f3 - ((float) ((Math.cos(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) * d) + d)));
        double d2 = f2;
        path.lineTo((float) ((Math.sin(0.6283185307179586d) * d2) + d), f3 - ((float) ((Math.cos(0.6283185307179586d) * d2) + d)));
        for (int i = 1; i < 5; i++) {
            Path path2 = b;
            double d3 = i * 1.2566370614359172d;
            path2.lineTo((float) ((Math.sin(d3) * d) + d), f3 - ((float) ((Math.cos(d3) * d) + d)));
            double d4 = d3 + 0.6283185307179586d;
            path2.lineTo((float) ((Math.sin(d4) * d2) + d), f3 - ((float) ((Math.cos(d4) * d2) + d)));
        }
        Path path3 = b;
        path3.close();
        return path3;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (measuredHeight == 0.0f) {
            return;
        }
        canvas.drawPath(a(measuredHeight), f3993a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        setMeasuredDimension(iMin, iMin);
    }

    public void setColor(int i) {
        f3993a.setColor(i);
        invalidate();
    }
}
