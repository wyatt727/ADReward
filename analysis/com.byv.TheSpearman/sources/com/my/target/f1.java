package com.my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public final class f1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final i f3962a;
    public int b;
    public int c;

    public f1(Context context) {
        this(context, null);
    }

    public f1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i iVar = new i(context);
        this.f3962a = iVar;
        int iA = ca.a(2, context);
        iVar.setPadding(iA, iA, iA, iA);
        iVar.setFixedHeight(ca.a(17, context));
        addView(iVar);
    }

    public void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public i getAdChoicesView() {
        return this.f3962a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.b;
        if (i3 > 0 && this.c > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            i2 = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
