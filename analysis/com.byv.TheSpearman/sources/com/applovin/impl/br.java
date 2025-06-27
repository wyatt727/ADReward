package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class br {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f304a;
    private final com.applovin.impl.sdk.t b;
    private final View c;

    public long a(ie ieVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.a("ViewabilityTracker", "Checking visibility...");
        }
        long j = 0;
        Point pointB = x3.b(this.c.getContext());
        if (!this.c.isShown()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.c.getAlpha() < ieVar.c0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.c.getParent() == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getWidth());
        if (iPxToDp < Math.min(ieVar.i0(), pointB.x)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getHeight());
        if (iPxToDp2 < ieVar.e0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.c.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect2 = new Rect(i, iArr[1], this.c.getWidth() + i, iArr[1] + this.c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity activityB = this.f304a.e().b();
        if (activityB != null && !ar.a(this.c, activityB)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }

    public br(View view, com.applovin.impl.sdk.k kVar) {
        this.f304a = kVar;
        this.b = kVar.L();
        this.c = view;
    }
}
