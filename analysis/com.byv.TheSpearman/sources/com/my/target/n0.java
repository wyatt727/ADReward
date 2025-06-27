package com.my.target;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes4.dex */
public class n0 extends RecyclerView.Adapter<s0> {

    /* renamed from: a, reason: collision with root package name */
    public final List<n4> f4058a;
    public final c8 b;

    public n0(List<n4> list, c8 c8Var) {
        this.f4058a = list;
        this.b = c8Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        p0 p0VarA = this.b.a();
        p0VarA.a().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new s0(p0VarA);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(s0 s0Var, int i) {
        s0Var.a(this.f4058a.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onFailedToRecycleView(s0 s0Var) {
        s0Var.a();
        return super.onFailedToRecycleView(s0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(s0 s0Var) {
        s0Var.a();
        super.onViewRecycled(s0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f4058a.size();
    }
}
