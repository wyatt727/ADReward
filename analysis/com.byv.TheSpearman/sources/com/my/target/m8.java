package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.my.target.k8;

/* loaded from: classes4.dex */
public class m8 extends l8 {
    public final int P;

    public m8(boolean z, View view, View view2, k8.a aVar, View view3, w8 w8Var, Context context) {
        super(view, view2, aVar, view3, w8Var, context);
        this.P = z ? 0 : 1;
    }

    public final void a(int i, int i2) {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.n.setVisibility(8);
        this.d.setVisibility(0);
        this.o.setVisibility(0);
        ca.a(this.d, i, i2, Integer.MIN_VALUE);
        ca.a(this.o, this.d.getMeasuredWidth(), this.d.getMeasuredHeight(), 1073741824);
    }

    public final void a(int i, int i2, int i3, int i4) {
        View view;
        int i5;
        if (this.c.getVisibility() == 0) {
            view = this.c;
            i5 = this.H - this.D;
        } else {
            view = this.t;
            i5 = this.H;
        }
        ca.b(view, i2 + i5, (i3 - i) - i5);
        ca.e(this.d, i4, i);
        ca.e(this.K, this.d.getTop(), 0);
        this.n.layout(0, 0, 0, 0);
        View view2 = this.o;
        View view3 = this.K;
        if (view3 != null) {
            i4 = view3.getBottom();
        }
        ca.c(view2, i4, 0);
        ca.d(this.k, this.d.getTop() - this.z, i3 - this.H);
    }

    public final void b(int i, int i2) {
        this.d.setVisibility(0);
        this.n.setVisibility(0);
        ca.a(this.d, i - this.C, i2, Integer.MIN_VALUE);
        ca.a(this.n, i, this.d.getMeasuredHeight(), 1073741824);
        if (TextUtils.isEmpty(this.q.getText())) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.r.getText())) {
            this.r.setVisibility(8);
        } else {
            this.r.setVisibility(0);
        }
        if (this.P != 0) {
            this.o.setVisibility(8);
            return;
        }
        int i3 = this.z;
        int i4 = i3 * 2;
        this.p.measure(View.MeasureSpec.makeMeasureSpec(((i - (i3 * 4)) - this.k.getMeasuredWidth()) - this.j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        int i5 = i - i4;
        int i6 = i2 - i4;
        ca.a(this.q, i5, i6, Integer.MIN_VALUE);
        ca.a(this.r, i5, i6, Integer.MIN_VALUE);
        this.o.setVisibility(0);
        ca.a(this.o, i, i2, 1073741824);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            com.my.target.k2 r0 = r4.c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L10
            com.my.target.k2 r0 = r4.c
            int r1 = r4.z
            int r2 = r4.D
            int r1 = r1 - r2
            goto L14
        L10:
            com.my.target.ka r0 = r4.t
            int r1 = r4.z
        L14:
            int r2 = r6 + r1
            int r3 = r7 - r5
            int r3 = r3 - r1
            com.my.target.ca.b(r0, r2, r3)
            android.view.View r0 = r4.d
            com.my.target.ca.c(r0, r6, r5)
            com.my.target.i9 r6 = r4.j
            int r6 = r6.getMeasuredHeight()
            int r6 = r8 - r6
            int r0 = r4.z
            int r6 = r6 - r0
            android.widget.Button r0 = r4.p
            int r1 = r0.getMeasuredHeight()
            int r1 = r6 - r1
            r2 = 0
            com.my.target.ca.a(r0, r2, r1, r7, r6)
            int r6 = r4.P
            r0 = 1
            if (r6 != r0) goto L48
            android.view.View r6 = r4.K
            android.view.View r0 = r4.d
            int r0 = r0.getBottom()
            com.my.target.ca.a(r6, r5, r0, r7, r8)
        L48:
            android.widget.Button r6 = r4.p
            int r6 = r6.getTop()
            int r0 = r4.z
            int r6 = r6 - r0
            android.widget.TextView r0 = r4.r
            int r1 = r0.getMeasuredHeight()
            int r1 = r6 - r1
            com.my.target.ca.a(r0, r2, r1, r7, r6)
            android.widget.TextView r0 = r4.r
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L6b
            android.widget.TextView r6 = r4.r
            int r6 = r6.getTop()
            goto L72
        L6b:
            android.widget.TextView r0 = r4.r
            int r0 = r0.getMeasuredHeight()
            int r6 = r6 + r0
        L72:
            int r0 = r4.z
            int r6 = r6 - r0
            android.widget.TextView r0 = r4.q
            int r1 = r0.getMeasuredHeight()
            int r1 = r6 - r1
            com.my.target.ca.a(r0, r2, r1, r7, r6)
            int r6 = r4.P
            if (r6 != 0) goto L9e
            android.view.View r6 = r4.K
            android.view.View r0 = r4.d
            int r0 = r0.getBottom()
            android.widget.TextView r1 = r4.r
            int r1 = r1.getTop()
            com.my.target.ca.a(r6, r5, r0, r7, r1)
            android.view.View r6 = r4.K
            if (r6 == 0) goto L9e
            int r6 = r6.getBottom()
            goto L9f
        L9e:
            r6 = r8
        L9f:
            android.view.View r0 = r4.n
            android.view.View r1 = r4.d
            int r1 = r1.getTop()
            android.view.View r2 = r4.d
            int r2 = r2.getLeft()
            com.my.target.ca.c(r0, r1, r2)
            android.view.View r0 = r4.o
            com.my.target.ca.c(r0, r6, r5)
            com.my.target.i r5 = r4.k
            int r6 = r4.z
            int r0 = r8 - r6
            int r7 = r7 - r6
            com.my.target.ca.d(r5, r0, r7)
            com.my.target.i9 r5 = r4.j
            int r6 = r4.H
            int r8 = r8 - r6
            com.my.target.ca.e(r5, r8, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.m8.b(int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 - i < i4 - i2) {
            b(i, i2, i3, i4);
        } else {
            a(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view;
        int measuredHeight;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size < size2) {
            b(size, size2);
            int i4 = this.P;
            if (i4 == 1) {
                view = this.K;
                measuredHeight = size2 - this.n.getMeasuredHeight();
                i3 = this.z * 2;
            } else if (i4 == 0) {
                view = this.K;
                measuredHeight = (((size2 - this.d.getMeasuredHeight()) - this.q.getMeasuredHeight()) - this.p.getMeasuredHeight()) - this.r.getMeasuredHeight();
                i3 = this.z * 8;
            }
            ca.a(view, size, measuredHeight - i3, Integer.MIN_VALUE);
        } else {
            a(size, size2);
            ca.a(this.K, size, (size2 - this.d.getMeasuredHeight()) - (this.z * 2), 1073741824);
        }
        ka kaVar = this.t;
        int i5 = this.C;
        ca.a(kaVar, i5, i5, 1073741824);
        k2 k2Var = this.c;
        int i6 = this.C + (this.D * 2);
        ca.a(k2Var, i6, i6, 1073741824);
        i iVar = this.k;
        int i7 = this.C + (this.D * 2);
        ca.a(iVar, i7, i7, 1073741824);
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.l8, com.my.target.k8
    public void setBanner(z3 z3Var) {
        super.setBanner(z3Var);
        this.f.a(true);
        View view = this.K;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
