package com.my.target;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class t0 extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public a f4127a;

    public interface a {
        void a();
    }

    public t0(Context context) {
        super(context, 0, false);
    }

    public void a(a aVar) {
        this.f4127a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i, int i2) {
        int iA = ca.a(10, view.getContext());
        if (getPosition(view) > 0) {
            ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin = iA;
            ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(((int) (getWidth() * 0.7f)) - iA, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight > getHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(((int) (getWidth() * (((getHeight() - (iA * 2)) * 0.7f) / measuredHeight))) - iA, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.f4127a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
