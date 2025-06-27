package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ExoPlayer;

/* loaded from: classes4.dex */
public final class x extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextureView f4178a;
    public SurfaceView b;
    public int c;
    public int d;
    public a e;
    public int f;

    public interface a {
        void p();
    }

    public x(Context context) {
        super(context);
        this.f4178a = new TextureView(context);
        a();
    }

    public final void a() {
        View view;
        ca.b(this.f4178a, "ad_video");
        if (getChildAt(0) != null) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.f == 0) {
            view = this.f4178a;
        } else {
            if (this.b == null) {
                this.b = new SurfaceView(getContext());
            }
            view = this.b;
        }
        addView(view, layoutParams);
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        requestLayout();
        invalidate();
    }

    public Bitmap getScreenShot() {
        if (this.f == 1) {
            return null;
        }
        try {
            return this.f4178a.getBitmap(getWidth(), getHeight());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public TextureView getTextureView() {
        return this.f4178a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        a aVar;
        super.onAttachedToWindow();
        if (ca.a(this) || (aVar = this.e) == null) {
            return;
        }
        aVar.p();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.c;
        if (i4 <= 0 || (i3 = this.d) <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = i4 / i3;
        if (mode == 0 && mode2 == 0) {
            size = i4;
            size2 = i3;
        } else {
            if (mode == 0) {
                size = (int) (size2 * f);
            } else if (mode2 == 0) {
                size2 = (int) (size / f);
            } else if (r1.a(f, 1.0f) != -1) {
                i4 = size;
                i3 = size2;
                size2 = (int) (size / f);
            } else {
                i4 = size;
                i3 = size2;
                size = (int) (size2 * f);
            }
            i4 = size;
            i3 = size2;
        }
        this.f4178a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        SurfaceView surfaceView = this.b;
        if (surfaceView != null) {
            surfaceView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(i4, i3);
    }

    public void setAdVideoViewListener(a aVar) {
        this.e = aVar;
    }

    public void setExoPlayer(ExoPlayer exoPlayer) {
        if (exoPlayer == null) {
            return;
        }
        int i = this.f;
        if (i == 0) {
            exoPlayer.setVideoSurfaceView(null);
            exoPlayer.setVideoTextureView(this.f4178a);
        } else {
            if (i != 1) {
                return;
            }
            exoPlayer.setVideoTextureView(null);
            exoPlayer.setVideoSurfaceView(this.b);
        }
    }

    public void setViewMode(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        a();
    }
}
