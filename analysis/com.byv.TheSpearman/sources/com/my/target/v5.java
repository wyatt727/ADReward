package com.my.target;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;

/* loaded from: classes4.dex */
public class v5 extends h0 {
    public a d;
    public boolean e;
    public boolean f;
    public int g;

    public interface a {
        void a(boolean z);

        void b();
    }

    public static class b extends GestureDetector {

        /* renamed from: a, reason: collision with root package name */
        public final View f4160a;
        public a b;

        public interface a {
            void a();
        }

        public b(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public b(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f4160a = view;
            setIsLongpressEnabled(false);
        }

        public void a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.b == null) {
                        ba.a("MraidWebView$ViewGestureDetector: View's onUserClick() is not registered");
                        return;
                    } else {
                        ba.a("MraidWebView$ViewGestureDetector: Gestures - user clicked");
                        this.b.a();
                        return;
                    }
                }
                if (action != 2 || !a(motionEvent, this.f4160a)) {
                    return;
                }
            }
            onTouchEvent(motionEvent);
        }

        public void a(a aVar) {
            this.b = aVar;
        }

        public final boolean a(MotionEvent motionEvent, View view) {
            if (motionEvent == null || view == null) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
        }
    }

    public v5(Context context) {
        super(context);
        this.e = getVisibility() == 0;
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        final b bVar = new b(getContext(), this);
        bVar.a(new b.a() { // from class: com.my.target.v5$$ExternalSyntheticLambda1
            @Override // com.my.target.v5.b.a
            public final void a() {
                this.f$0.i();
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.v5$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return v5.a(bVar, view, motionEvent);
            }
        });
    }

    public static /* synthetic */ boolean a(b bVar, View view, MotionEvent motionEvent) {
        bVar.a(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.f = true;
    }

    public final void a(int i, int i2) {
        int i3 = ((float) i) / ((float) i2) > 1.0f ? 2 : 1;
        if (i3 != this.g) {
            this.g = i3;
            a aVar = this.d;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public void a(boolean z) {
        ba.a("MraidWebView: Pause, finishing " + z);
        if (z) {
            f();
            a("");
        }
        d();
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.e;
    }

    @Override // com.my.target.h0, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (z != this.e) {
            this.e = z;
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(z);
            }
        }
    }

    public void setClicked(boolean z) {
        this.f = z;
    }

    public void setVisibilityChangedListener(a aVar) {
        this.d = aVar;
    }
}
