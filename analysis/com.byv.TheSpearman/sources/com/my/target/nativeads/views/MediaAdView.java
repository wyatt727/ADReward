package com.my.target.nativeads.views;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.my.target.ca;
import com.my.target.i9;
import com.my.target.l2;
import com.my.target.n6;

/* loaded from: classes4.dex */
public class MediaAdView extends FrameLayout {
    public static final int COLOR_PLACEHOLDER_GRAY = -1118482;
    private final i9 imageView;
    private float mediaAspectRatio;
    private int placeholderHeight;
    private int placeholderWidth;
    private final l2 playButton;
    private final ProgressBar progressBar;

    public MediaAdView(Context context) {
        super(context);
        this.imageView = new i9(context);
        this.playButton = new l2(context);
        this.progressBar = new ProgressBar(context, null, R.attr.progressBarStyle);
        initViews(context);
    }

    public MediaAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.imageView = new i9(context);
        this.playButton = new l2(context);
        this.progressBar = new ProgressBar(context, null, R.attr.progressBarStyle);
        initViews(context);
    }

    public MediaAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.imageView = new i9(context);
        this.playButton = new l2(context);
        this.progressBar = new ProgressBar(context, null, R.attr.progressBarStyle);
        initViews(context);
    }

    private void initViews(Context context) {
        ca.b(this.imageView, "media_image");
        ca.b(this.progressBar, "progress_bar");
        ca.b(this.playButton, "play_button");
        setBackgroundColor(COLOR_PLACEHOLDER_GRAY);
        this.progressBar.setVisibility(8);
        Drawable indeterminateDrawable = this.progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setColorFilter(-16733198, PorterDuff.Mode.SRC_ATOP);
        }
        this.playButton.a(n6.a(ca.e(context).b(80)), false);
        this.playButton.setVisibility(8);
        addView(this.imageView);
        addView(this.playButton, new FrameLayout.LayoutParams(-2, -2));
        addView(this.progressBar, new FrameLayout.LayoutParams(-2, -2));
    }

    public ImageView getImageView() {
        return this.imageView;
    }

    public float getMediaAspectRatio() {
        return this.mediaAspectRatio;
    }

    public View getPlayButtonView() {
        return this.playButton;
    }

    public ProgressBar getProgressBarView() {
        return this.progressBar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i6 = ((i3 - i) - measuredWidth) / 2;
                    int i7 = ((i4 - i2) - measuredHeight) / 2;
                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = this.placeholderWidth;
        if (i5 == 0 || (i3 = this.placeholderHeight) == 0) {
            if (mode != 1073741824) {
                size = 0;
            }
            if (mode2 != 1073741824) {
                size2 = 0;
            }
            setMeasuredDimension(size, size2);
            return;
        }
        float f = i5 / i3;
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (mode == 0) {
            size = (int) (size2 * f);
        } else if (mode2 == 0 || mode2 != 1073741824) {
            size2 = (int) (size / f);
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i7 = Integer.MIN_VALUE;
                if (layoutParams != null) {
                    i4 = layoutParams.width == -1 ? 1073741824 : Integer.MIN_VALUE;
                    if (layoutParams.height == -1) {
                        i7 = 1073741824;
                    }
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i4), View.MeasureSpec.makeMeasureSpec(size2, i7));
                if (childAt.getMeasuredHeight() > 0) {
                    z = true;
                }
            }
        }
        if (z) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.playButton.setOnClickListener(onClickListener);
    }

    public void setPlaceHolderDimension(int i, int i2) {
        this.placeholderWidth = i;
        this.placeholderHeight = i2;
        this.imageView.setPlaceholderDimensions(i, i2);
        float f = i2;
        this.mediaAspectRatio = f != 0.0f ? i / f : 0.0f;
    }
}
