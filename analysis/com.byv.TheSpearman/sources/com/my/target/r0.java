package com.my.target;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class r0 extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public a f4109a;
    public final float b;

    public interface a {
        void a();
    }

    public r0(float f, Context context) {
        super(context, 0, false);
        this.b = r1.a(f, -1.0f) == 0 ? 0.75f : f;
    }

    public void a(a aVar) {
        this.f4109a = aVar;
    }

    public boolean a(View view) {
        return findViewByPosition(findFirstCompletelyVisibleItemPosition()) == view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i, int i2) {
        ((RecyclerView.LayoutParams) view.getLayoutParams()).width = (int) (getWidth() * this.b);
        super.measureChildWithMargins(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.f4109a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
