package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class z0 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f4198a;
    public final BitmapDrawable b;
    public final int c;
    public final int d;
    public final int e;
    public final Rect f;
    public final Rect g;
    public final Rect h;
    public final Rect i;
    public a j;
    public boolean k;
    public boolean l;
    public int m;

    public interface a {
        void c();
    }

    public z0(Context context) {
        super(context);
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.m = 8388661;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(g0.a(ca.e(context).b(30)));
        this.b = bitmapDrawable;
        bitmapDrawable.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawable.setCallback(this);
        this.f4198a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = ca.a(50, context);
        this.d = ca.a(30, context);
        this.e = ca.a(8, context);
        setWillNotDraw(false);
    }

    public final void a() {
        playSoundEffect(0);
        a aVar = this.j;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void a(int i, Rect rect, Rect rect2) {
        Gravity.apply(this.m, i, i, rect, rect2);
    }

    public boolean a(int i, int i2, int i3) {
        Rect rect = this.g;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    public void b(int i, Rect rect, Rect rect2) {
        int i2 = this.d;
        Gravity.apply(i, i2, i2, rect, rect2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.k) {
            this.k = false;
            this.f.set(0, 0, getWidth(), getHeight());
            a(this.c, this.f, this.g);
            this.i.set(this.g);
            Rect rect = this.i;
            int i = this.e;
            rect.inset(i, i);
            a(this.d, this.i, this.h);
            this.b.setBounds(this.h);
        }
        if (this.b.isVisible()) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.k = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.b.isVisible() || !a(x, y, this.f4198a)) {
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.l = true;
        } else if (action != 1) {
            if (action == 3) {
                this.l = false;
            }
        } else if (this.l) {
            a();
            this.l = false;
        }
        return true;
    }

    public void setCloseBounds(Rect rect) {
        this.g.set(rect);
    }

    public void setCloseGravity(int i) {
        this.m = i;
    }

    public void setCloseVisible(boolean z) {
        ca.a(this, z ? "close_button" : "closeable_layout");
        if (this.b.setVisible(z, false)) {
            invalidate(this.g);
        }
    }

    public void setOnCloseListener(a aVar) {
        this.j = aVar;
    }
}
