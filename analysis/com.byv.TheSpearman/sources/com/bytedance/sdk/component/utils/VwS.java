package com.bytedance.sdk.component.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: HackTouchDelegate.java */
/* loaded from: classes2.dex */
public class VwS extends TouchDelegate {
    private View EYQ;
    private int Kbd;
    private boolean Pm;
    private Rect Td;
    private Rect mZx;

    public VwS(Rect rect, View view) {
        super(rect, view);
        this.mZx = rect;
        this.Kbd = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.Td = rect2;
        int i = this.Kbd;
        rect2.inset(-i, -i);
        this.EYQ = view;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 2) {
                boolean z = this.Pm;
                zContains = z ? this.Td.contains(x, y) : true;
                z = z;
            } else if (action != 3) {
                zContains = true;
                z = false;
            } else {
                boolean z2 = this.Pm;
                this.Pm = false;
                z = z2;
                zContains = true;
            }
        } else if (this.mZx.contains(x, y)) {
            this.Pm = true;
            zContains = true;
        } else {
            this.Pm = false;
            zContains = true;
            z = false;
        }
        if (!z) {
            return false;
        }
        View view = this.EYQ;
        if (zContains) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            float f = -(this.Kbd * 2);
            motionEvent.setLocation(f, f);
        }
        if (view.getVisibility() == 0) {
            return view.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
