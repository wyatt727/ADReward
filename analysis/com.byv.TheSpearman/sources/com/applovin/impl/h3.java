package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class h3 extends AppLovinWebViewBase {
    private static Boolean b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f486a;

    public h3(Context context) throws NoSuchMethodException, SecurityException {
        super(context);
        this.f486a = new AtomicReference();
        if (b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                b = Boolean.FALSE;
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f486a.set(MotionEvent.obtain(motionEvent));
        if (b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean a() {
        return this.f486a.get() != null;
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f486a.get();
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f486a.getAndSet(null);
    }
}
