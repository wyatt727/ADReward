package com.my.target;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class u0 extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final int f4139a;
    public int b;
    public a c;
    public int d;
    public int e;
    public int f;
    public int g;

    public interface a {
        void a();
    }

    public u0(Context context) {
        super(context, 0, false);
        this.f4139a = ca.e(context).b(4);
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public boolean a(View view) {
        int iFindFirstCompletelyVisibleItemPosition = findFirstCompletelyVisibleItemPosition();
        int position = getPosition(view);
        return iFindFirstCompletelyVisibleItemPosition <= position && position <= findLastCompletelyVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i, int i2) {
        int height = getHeight();
        int width = getWidth();
        if (height != this.g || width != this.f || this.d <= 0 || this.e <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
            float width2 = getWidth() / view.getMeasuredWidth();
            this.d = width2 > 1.0f ? (int) (width / (Math.floor(width2) + 0.5d)) : (int) (width / 1.5f);
            this.e = height;
            this.f = width;
            this.g = height;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (view != getChildAt(0)) {
            layoutParams.leftMargin = ca.a(this.b / 2, view.getContext());
        }
        if (view != getChildAt(getChildCount())) {
            layoutParams.rightMargin = ca.a(this.b / 2, view.getContext());
        }
        int childMeasureSpec = LinearLayoutManager.getChildMeasureSpec(width, getWidthMode(), 0, this.d, canScrollHorizontally());
        int heightMode = getHeightMode();
        int i3 = this.f4139a;
        view.measure(childMeasureSpec, LinearLayoutManager.getChildMeasureSpec(height, heightMode, i3, height - (i3 * 2), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }
}
