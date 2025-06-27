package com.my.target;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.core.view.GravityCompat;

/* loaded from: classes4.dex */
public class h8 extends ProgressBar implements g8 {
    public h8(Context context) {
        super(context, null, android.R.attr.progressBarStyleHorizontal);
    }

    @Override // com.my.target.g8
    public View a() {
        return this;
    }

    @Override // com.my.target.g8
    public void setColor(int i) {
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
        layerDrawable.setDrawableByLayerId(android.R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(android.R.id.progress, clipDrawable);
        setProgressDrawable(layerDrawable);
    }

    @Override // com.my.target.g8
    public void setMaxTime(float f) {
        setMax((int) (f * 1000.0f));
    }

    @Override // com.my.target.g8
    public void setTimeChanged(float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            setProgress((int) (f * 1000.0f), true);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "progress", getProgress(), (int) (f * 1000.0f));
        objectAnimatorOfInt.setDuration(200L);
        objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfInt.start();
    }

    @Override // com.my.target.g8
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
