package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class u1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f4140a;

    public u1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f4140a = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f4140a.setImageBitmap(bitmap);
    }
}
