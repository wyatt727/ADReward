package com.unity3d.player;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes4.dex */
class x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f4412a;
    final /* synthetic */ B b;

    x(B b, View view) {
        this.b = b;
        this.f4412a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f4412a.isShown()) {
            Rect rect = new Rect();
            this.b.b.getWindowVisibleDisplayFrame(rect);
            int[] iArr = new int[2];
            this.b.b.getLocationOnScreen(iArr);
            Point point = new Point(rect.left - iArr[0], rect.height() - this.f4412a.getHeight());
            Point point2 = new Point();
            this.b.getWindow().getWindowManager().getDefaultDisplay().getSize(point2);
            int height = this.b.b.getHeight() - point2.y;
            int height2 = this.b.b.getHeight() - point.y;
            if (height2 != height + this.f4412a.getHeight()) {
                this.b.b.reportSoftInputIsVisible(true);
            } else {
                this.b.b.reportSoftInputIsVisible(false);
            }
            this.b.b.reportSoftInputArea(new Rect(point.x, point.y, this.f4412a.getWidth(), height2));
        }
    }
}
