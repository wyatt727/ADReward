package com.unity3d.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public class C extends View {

    /* renamed from: a, reason: collision with root package name */
    final a f4329a;
    final int b;
    int c;
    Bitmap d;
    Bitmap e;

    enum a {
        /* JADX INFO: Fake field, exist only in values array */
        Center,
        /* JADX INFO: Fake field, exist only in values array */
        Fit,
        Fill
    }

    public C(Context context, a aVar) {
        super(context);
        this.c = ViewCompat.MEASURED_STATE_MASK;
        this.f4329a = aVar;
        int identifier = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
        this.b = identifier;
        if (identifier != 0) {
            forceLayout();
        }
        int identifier2 = getResources().getIdentifier("staticSplashScreenBackgroundColor", "color", getContext().getPackageName());
        if (identifier2 != 0) {
            this.c = getResources().getColor(identifier2);
        }
        setBackgroundColor(this.c);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
            this.d = null;
        }
        Bitmap bitmap2 = this.e;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.e = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            int r8 = r7.b
            if (r8 != 0) goto L5
            return
        L5:
            android.graphics.Bitmap r8 = r7.d
            r9 = 0
            if (r8 != 0) goto L1d
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r8.inScaled = r9
            android.content.res.Resources r10 = r7.getResources()
            int r11 = r7.b
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeResource(r10, r11, r8)
            r7.d = r8
        L1d:
            android.graphics.Bitmap r8 = r7.d
            int r8 = r8.getWidth()
            android.graphics.Bitmap r10 = r7.d
            int r10 = r10.getHeight()
            int r11 = r7.getWidth()
            int r12 = r7.getHeight()
            if (r11 == 0) goto Lc7
            if (r12 != 0) goto L37
            goto Lc7
        L37:
            float r0 = (float) r8
            float r1 = (float) r10
            float r0 = r0 / r1
            float r1 = (float) r11
            float r2 = (float) r12
            float r3 = r1 / r2
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r4 = 1
            if (r3 > 0) goto L45
            r3 = r4
            goto L46
        L45:
            r3 = r9
        L46:
            com.unity3d.player.C$a r5 = r7.f4329a
            int r5 = r5.ordinal()
            r6 = 2
            if (r5 == 0) goto L64
            if (r5 == r4) goto L54
            if (r5 == r6) goto L54
            goto L6e
        L54:
            com.unity3d.player.C$a r8 = r7.f4329a
            com.unity3d.player.C$a r10 = com.unity3d.player.C.a.Fill
            if (r8 != r10) goto L5c
            r8 = r4
            goto L5d
        L5c:
            r8 = r9
        L5d:
            r8 = r8 ^ r3
            if (r8 == 0) goto L6b
            float r1 = r1 / r0
            int r10 = (int) r1
            r8 = r11
            goto L6e
        L64:
            if (r11 >= r8) goto L69
            float r1 = r1 / r0
            int r10 = (int) r1
            r8 = r11
        L69:
            if (r12 >= r10) goto L6e
        L6b:
            float r2 = r2 * r0
            int r8 = (int) r2
            r10 = r12
        L6e:
            android.graphics.Bitmap r11 = r7.e
            if (r11 == 0) goto L8d
            int r11 = r11.getWidth()
            if (r11 != r8) goto L81
            android.graphics.Bitmap r11 = r7.e
            int r11 = r11.getHeight()
            if (r11 != r10) goto L81
            return
        L81:
            android.graphics.Bitmap r11 = r7.e
            android.graphics.Bitmap r12 = r7.d
            if (r11 == r12) goto L8d
            r11.recycle()
            r11 = 0
            r7.e = r11
        L8d:
            android.graphics.Bitmap r11 = r7.d
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r11, r8, r10, r4)
            r7.e = r8
            android.content.res.Resources r10 = r7.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.densityDpi
            r8.setDensity(r10)
            android.graphics.drawable.ColorDrawable r8 = new android.graphics.drawable.ColorDrawable
            int r10 = r7.c
            r8.<init>(r10)
            android.graphics.drawable.BitmapDrawable r10 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r11 = r7.getResources()
            android.graphics.Bitmap r12 = r7.e
            r10.<init>(r11, r12)
            r11 = 17
            r10.setGravity(r11)
            android.graphics.drawable.LayerDrawable r11 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r12 = new android.graphics.drawable.Drawable[r6]
            r12[r9] = r8
            r12[r4] = r10
            r11.<init>(r12)
            r7.setBackground(r11)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C.onLayout(boolean, int, int, int, int):void");
    }
}
