package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.webview.c;

/* loaded from: classes4.dex */
public class ProgressBar extends View implements c {

    /* renamed from: a, reason: collision with root package name */
    Runnable f3011a;
    private float b;
    private float c;
    private float d;
    private Drawable e;
    private float f;
    private long g;
    private Handler h;
    private Drawable i;
    private int j;
    private boolean k;
    private boolean l;
    private long m;
    private float n;
    private boolean o;
    private c.a p;
    private Drawable q;
    private Rect r;
    private Drawable s;
    private float t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private long y;

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    public ProgressBar(Context context) {
        super(context);
        this.f3011a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.g = 25L;
        this.h = new Handler(Looper.getMainLooper());
        this.k = false;
        this.n = 0.95f;
        this.o = false;
        this.r = new Rect();
        setWillNotDraw(false);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3011a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.g = 25L;
        this.h = new Handler(Looper.getMainLooper());
        this.k = false;
        this.n = 0.95f;
        this.o = false;
        this.r = new Rect();
        setWillNotDraw(false);
    }

    public float getProgress() {
        return this.b;
    }

    public void initResource(boolean z) throws Resources.NotFoundException {
        if (z || (this.i == null && this.q == null && this.s == null && this.e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
            this.i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
            this.q = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.q.getIntrinsicHeight());
            }
            this.s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
            this.e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        }
    }

    public void onThemeChange() throws Resources.NotFoundException {
        if (this.k) {
            initResource(true);
        }
    }

    public void setPaused(boolean z) {
        this.o = z;
        if (z) {
            return;
        }
        this.m = System.currentTimeMillis();
    }

    public void setProgress(float f, boolean z) {
        if (!z || f < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressBarListener(c.a aVar) {
        this.p = aVar;
    }

    public void setProgressState(int i) {
        if (i == 5) {
            this.v = 1;
            this.w = 0;
            this.x = 0;
            this.y = 0L;
            return;
        }
        if (i == 6) {
            this.w = 1;
            if (this.x == 1) {
                startEndAnimation();
            }
            this.y = 0L;
            return;
        }
        if (i == 7) {
            startEndAnimation();
        } else {
            if (i != 8) {
                return;
            }
            this.x = 1;
            if (this.w == 1) {
                startEndAnimation();
            }
        }
    }

    public void setVisible(boolean z) {
        if (z) {
            this.l = true;
            this.m = System.currentTimeMillis();
            this.d = 0.0f;
            this.y = 0L;
            this.u = false;
            this.f = 0.0f;
            this.b = 0.0f;
            this.t = getMeasuredWidth();
            this.o = false;
            this.v = 0;
            this.w = 0;
            this.x = 0;
            Drawable drawable = this.i;
            if (drawable != null) {
                this.j = -drawable.getIntrinsicWidth();
            } else {
                this.j = 0;
            }
            Drawable drawable2 = this.s;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.e;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.q;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    public void startEndAnimation() {
        if (this.u) {
            return;
        }
        this.u = true;
        this.f = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            c.a aVar = this.p;
            if (aVar != null) {
                aVar.a(true);
                return;
            }
            return;
        }
        c.a aVar2 = this.p;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.t = getMeasuredWidth();
    }
}
