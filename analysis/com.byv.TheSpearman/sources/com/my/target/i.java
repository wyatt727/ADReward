package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes4.dex */
public class i extends i9 {
    public static final int DEFAULT_HEIGHT = 20;
    private int fixedHeight;

    public i(Context context) {
        this(context, null);
    }

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixedHeight = -1;
        this.fixedHeight = ca.a(20, context);
    }

    @Override // com.my.target.i9, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.fixedHeight >= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setFixedHeight(int i) {
        this.fixedHeight = i;
    }

    @Override // com.my.target.i9, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        int paddingTop;
        int width;
        int i = this.fixedHeight;
        int height = 0;
        if (i >= 0) {
            paddingTop = (i - getPaddingTop()) - getPaddingBottom();
            if (paddingTop < 0) {
                paddingTop = 0;
            }
        } else {
            paddingTop = -1;
        }
        if (paddingTop >= 0) {
            if (bitmap != null) {
                width = bitmap.getWidth();
                height = bitmap.getHeight();
            } else {
                width = 0;
            }
            setMeasuredDimension(((int) (paddingTop * (height > 0 ? width / height : 0.0f))) + getPaddingLeft() + getPaddingRight(), this.fixedHeight);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // com.my.target.i9, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        int paddingTop;
        int intrinsicWidth;
        int i = this.fixedHeight;
        int intrinsicHeight = 0;
        if (i >= 0) {
            paddingTop = (i - getPaddingTop()) - getPaddingBottom();
            if (paddingTop < 0) {
                paddingTop = 0;
            }
        } else {
            paddingTop = -1;
        }
        if (paddingTop >= 0) {
            if (drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
                intrinsicHeight = drawable.getIntrinsicHeight();
            } else {
                intrinsicWidth = 0;
            }
            setMeasuredDimension(((int) (paddingTop * (intrinsicHeight > 0 ? intrinsicWidth / intrinsicHeight : 0.0f))) + getPaddingLeft() + getPaddingRight(), this.fixedHeight);
        }
        super.setImageDrawable(drawable);
    }
}
