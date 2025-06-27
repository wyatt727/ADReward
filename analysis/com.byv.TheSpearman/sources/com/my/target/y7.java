package com.my.target;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.my.target.p5;
import com.my.target.t0;
import com.my.target.x7;

/* loaded from: classes4.dex */
public class y7 extends FrameLayout implements x7, t0.a, p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final p5 f4193a;
    public final LinearLayoutManager b;
    public final w1 c;
    public x7.a d;

    public y7(Context context) {
        super(context);
        p5 p5Var = new p5(context);
        this.f4193a = p5Var;
        t0 t0Var = new t0(context);
        t0Var.a(this);
        p5Var.setLayoutManager(t0Var);
        this.b = t0Var;
        w1 w1Var = new w1(17);
        this.c = w1Var;
        w1Var.attachToRecyclerView(p5Var);
        p5Var.setHasFixedSize(true);
        p5Var.setMoveStopListener(this);
        addView(p5Var, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.my.target.t0.a
    public void a() {
        w1 w1Var;
        int i;
        int iFindFirstCompletelyVisibleItemPosition = this.b.findFirstCompletelyVisibleItemPosition();
        View viewFindViewByPosition = iFindFirstCompletelyVisibleItemPosition >= 0 ? this.b.findViewByPosition(iFindFirstCompletelyVisibleItemPosition) : null;
        if (this.f4193a.getChildCount() == 0 || viewFindViewByPosition == null || getWidth() > viewFindViewByPosition.getWidth() * 1.7d) {
            w1Var = this.c;
            i = GravityCompat.START;
        } else {
            w1Var = this.c;
            i = 17;
        }
        w1Var.a(i);
        c();
    }

    @Override // com.my.target.x7
    public void a(int i) {
        this.c.b(i);
    }

    public final boolean a(View view) {
        return pa.a(view) < 50.0f;
    }

    @Override // com.my.target.p5.a
    public void b() {
        c();
    }

    @Override // com.my.target.x7
    public boolean b(int i) {
        return i >= this.b.findFirstCompletelyVisibleItemPosition() && i <= this.b.findLastCompletelyVisibleItemPosition();
    }

    public final void c() {
        int[] iArr;
        if (this.d != null) {
            int iFindFirstVisibleItemPosition = this.b.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = this.b.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
                return;
            }
            if (a(this.b.findViewByPosition(iFindFirstVisibleItemPosition))) {
                iFindFirstVisibleItemPosition++;
            }
            if (a(this.b.findViewByPosition(iFindLastVisibleItemPosition))) {
                iFindLastVisibleItemPosition--;
            }
            if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                iArr = new int[]{iFindFirstVisibleItemPosition};
            } else {
                int i = (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr2[i2] = iFindFirstVisibleItemPosition;
                    iFindFirstVisibleItemPosition++;
                }
                iArr = iArr2;
            }
            this.d.a(iArr);
        }
    }

    public void setAdapter(n0 n0Var) {
        this.f4193a.setAdapter(n0Var);
    }

    @Override // com.my.target.x7
    public void setListener(x7.a aVar) {
        this.d = aVar;
    }
}
