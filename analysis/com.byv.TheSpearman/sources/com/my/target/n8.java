package com.my.target;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.my.target.k8;

/* loaded from: classes4.dex */
public class n8 extends l8 {
    public n8(View view, View view2, k8.a aVar, View view3, w8 w8Var, Context context) {
        super(view, view2, aVar, view3, w8Var, context);
    }

    public final void a(int i, int i2) {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.n.setVisibility(8);
        this.d.setVisibility(0);
        if (a(i)) {
            this.s.setVisibility(0);
            ca.a(this.s, i, i2, Integer.MIN_VALUE);
            this.o.setVisibility(8);
            int[] iArr = new int[2];
            View view = this.K;
            iArr[0] = view != null ? view.getMeasuredWidth() : 0;
            iArr[1] = this.i.getMeasuredWidth();
            int iA = i - ca.a(iArr);
            ca.a(this.d, iA, iA, Integer.MIN_VALUE);
        } else {
            this.s.setVisibility(8);
            this.o.setVisibility(0);
            ca.a(this.d, i, i2, Integer.MIN_VALUE);
        }
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
        if (!a(i3 - i)) {
            i9 i9Var = this.j;
            int i6 = this.H;
            ca.c(i9Var, i6, i6);
            ca.e(this.d, i4 - i2, i);
            ca.a(this.i, i, i2, i3, i4);
            ca.a(this.K, i, i2, i3, i4);
            this.m.layout(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            this.n.layout(0, 0, 0, 0);
            ca.c(this.o, this.d.getTop(), this.d.getLeft());
            this.f.a(true);
            ca.d(this.k, this.d.getTop() - this.z, i3 - this.H);
            return;
        }
        i9 i9Var2 = this.i;
        ca.a(i9Var2, i, i2, i9Var2.getMeasuredWidth() + i, i4);
        int i7 = this.H;
        int right = this.i.getRight() + this.H;
        int iA = ca.a(this.j.getMeasuredHeight(), this.s.getMeasuredHeight());
        int i8 = this.D;
        ca.a(i7, right, iA + i8, i8, this.j, this.s);
        View view2 = this.K;
        ca.a(view2, i, i2, (view2 != null ? view2.getMeasuredWidth() : 0) + i, i4);
        this.d.layout(this.i.getRight(), i2, i3, i4);
        this.n.layout(0, 0, 0, 0);
        this.f.a(false);
        int left = this.c.getVisibility() == 0 ? (this.c.getLeft() - this.z) + this.D : this.t.getVisibility() == 0 ? this.t.getLeft() - this.z : i3 - this.H;
        ca.b(this.k, this.H, left);
        ca.b(this.k, this.H, left);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r11, int r12) {
        /*
            r10 = this;
            android.view.View r0 = r10.d
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r10.n
            r0.setVisibility(r1)
            android.view.View r0 = r10.o
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.s
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r10.d
            int r3 = r10.C
            int r3 = r11 - r3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            com.my.target.ca.a(r0, r3, r12, r4)
            android.view.View r0 = r10.n
            android.view.View r3 = r10.d
            int r3 = r3.getMeasuredHeight()
            r5 = 1073741824(0x40000000, float:2.0)
            com.my.target.ca.a(r0, r11, r3, r5)
            com.my.target.i9 r0 = r10.i
            int r0 = r0.getMeasuredHeight()
            double r6 = (double) r0
            r8 = 4609884578576439706(0x3ff999999999999a, double:1.6)
            double r6 = r6 * r8
            double r8 = (double) r12
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L53
            android.widget.TextView r0 = r10.q
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L81
            goto L76
        L53:
            android.widget.TextView r0 = r10.q
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L65
            android.widget.TextView r0 = r10.q
            r0.setVisibility(r1)
            goto L6a
        L65:
            android.widget.TextView r0 = r10.q
            r0.setVisibility(r2)
        L6a:
            android.widget.TextView r0 = r10.r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7c
        L76:
            android.widget.TextView r0 = r10.r
            r0.setVisibility(r1)
            goto L81
        L7c:
            android.widget.TextView r0 = r10.r
            r0.setVisibility(r2)
        L81:
            int r0 = r10.z
            int r1 = r0 * 2
            int r0 = r0 * 4
            int r0 = r11 - r0
            com.my.target.i r2 = r10.k
            int r2 = r2.getMeasuredWidth()
            int r0 = r0 - r2
            com.my.target.i9 r2 = r10.j
            int r2 = r2.getMeasuredWidth()
            int r0 = r0 - r2
            android.widget.Button r2 = r10.p
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            int r3 = r10.G
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r2.measure(r0, r3)
            android.widget.TextView r0 = r10.q
            int r2 = r11 - r1
            int r1 = r12 - r1
            com.my.target.ca.a(r0, r2, r1, r4)
            android.widget.TextView r0 = r10.r
            com.my.target.ca.a(r0, r2, r1, r4)
            android.view.View r0 = r10.o
            com.my.target.ca.a(r0, r11, r12, r5)
            com.my.target.ka r11 = r10.t
            int r12 = r10.C
            com.my.target.ca.a(r11, r12, r12, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.n8.b(int, int):void");
    }

    public final void b(int i, int i2, int i3, int i4) {
        View view;
        int i5;
        if (this.c.getVisibility() == 0) {
            view = this.c;
            i5 = this.z - this.D;
        } else {
            view = this.t;
            i5 = this.z;
        }
        ca.b(view, i2 + i5, (i3 - i) - i5);
        ca.c(this.d, i2, i);
        Button button = this.p;
        ca.a(button, 0, (i4 - this.E) - button.getMeasuredHeight(), i3, i4 - this.E);
        ca.a(this.i, i, i2, i3, i4);
        int measuredHeight = this.r.getMeasuredHeight() + (this.z / 2);
        if (this.q.getVisibility() == 0) {
            measuredHeight += this.z + this.q.getMeasuredHeight();
        }
        int i6 = this.z;
        int i7 = i3 - i;
        int measuredWidth = i6 + (((i7 - (i6 * 2)) - this.q.getMeasuredWidth()) / 2);
        int i8 = this.z;
        int measuredWidth2 = i8 + (((i7 - (i8 * 2)) - this.r.getMeasuredWidth()) / 2);
        int bottom = this.i.getBottom();
        if (measuredHeight < this.p.getTop() - bottom) {
            int top = bottom + (((this.p.getTop() - bottom) - measuredHeight) / 2);
            ca.c(this.q, top, measuredWidth);
            ca.c(this.r, ca.a(top, this.q.getBottom() + this.I), measuredWidth2);
        } else {
            ca.e(this.r, this.p.getTop() - this.z, measuredWidth2);
            this.q.layout(0, 0, 0, 0);
        }
        int top2 = (this.q.getTop() > 0 ? this.q : this.r.getTop() > 0 ? this.r : this.p).getTop() - this.z;
        ca.c(this.n, this.d.getTop(), this.d.getLeft());
        ca.c(this.o, top2, i);
        this.f.a(((double) (this.i.getBottom() - this.o.getTop())) > ((double) this.i.getMeasuredHeight()) * 0.1d);
        i iVar = this.k;
        int i9 = this.z;
        ca.d(iVar, i4 - i9, i3 - i9);
        i9 i9Var = this.j;
        int i10 = this.z;
        ca.e(i9Var, i4 - i10, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 - i < i4 - i2) {
            b(i, i2, i3, i4);
        } else {
            a(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r0 = r5.L
            if (r0 <= 0) goto L2f
            int r1 = r5.M
            if (r1 <= 0) goto L2f
            float r0 = (float) r0
            float r1 = (float) r1
            float r2 = r0 / r1
            float r3 = (float) r6
            float r0 = r3 / r0
            float r4 = (float) r7
            float r1 = r4 / r1
            float r1 = java.lang.Math.min(r0, r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L2c
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2c
            float r3 = r3 / r2
            int r0 = (int) r3
            r1 = r0
            r0 = r6
            goto L31
        L2c:
            float r4 = r4 * r2
            int r0 = (int) r4
            goto L30
        L2f:
            r0 = r6
        L30:
            r1 = r7
        L31:
            com.my.target.i9 r2 = r5.i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            com.my.target.ca.a(r2, r0, r1, r3)
            com.my.target.i9 r0 = r5.j
            int r1 = r5.F
            com.my.target.ca.a(r0, r1, r1, r3)
            com.my.target.k2 r0 = r5.c
            int r1 = r5.C
            int r2 = r5.D
            int r2 = r2 * 2
            int r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            com.my.target.ca.a(r0, r1, r1, r2)
            com.my.target.ka r0 = r5.t
            int r1 = r5.C
            com.my.target.ca.a(r0, r1, r1, r2)
            com.my.target.i r0 = r5.k
            int r1 = r5.C
            int r3 = r5.D
            int r3 = r3 * 2
            int r1 = r1 + r3
            com.my.target.ca.a(r0, r1, r1, r2)
            if (r6 >= r7) goto L66
            r5.b(r6, r7)
            goto L69
        L66:
            r5.a(r6, r7)
        L69:
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.n8.onMeasure(int, int):void");
    }

    @Override // com.my.target.l8, com.my.target.k8
    public void setBanner(z3 z3Var) {
        super.setBanner(z3Var);
        View view = this.K;
        if (view != null) {
            view.setVisibility(8);
        }
        this.m.setVisibility(8);
    }
}
