package com.my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.common.NavigationType;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.u0;
import com.my.target.w0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class v0 extends RecyclerView {

    /* renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f4152a;
    public final u0 b;
    public final View.OnClickListener c;
    public final LinearSnapHelper d;
    public List<r3> e;
    public w0.b f;
    public boolean g;
    public boolean h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View viewFindContainingItemView;
            v0 v0Var;
            w0.b bVar;
            List<r3> list;
            v0 v0Var2 = v0.this;
            if (v0Var2.g || (viewFindContainingItemView = v0Var2.getCardLayoutManager().findContainingItemView(view)) == null) {
                return;
            }
            if (!v0.this.getCardLayoutManager().a(viewFindContainingItemView)) {
                v0 v0Var3 = v0.this;
                if (!v0Var3.h) {
                    v0Var3.a(viewFindContainingItemView);
                    return;
                }
            }
            if (!view.isClickable() || (bVar = (v0Var = v0.this).f) == null || (list = v0Var.e) == null) {
                return;
            }
            bVar.a(list.get(v0Var.getCardLayoutManager().getPosition(viewFindContainingItemView)));
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<r3> list;
            ViewParent parent = view.getParent();
            while (parent != 0 && !(parent instanceof o0)) {
                parent = parent.getParent();
            }
            v0 v0Var = v0.this;
            w0.b bVar = v0Var.f;
            if (bVar == null || (list = v0Var.e) == null || parent == 0) {
                return;
            }
            bVar.a(list.get(v0Var.getCardLayoutManager().getPosition((View) parent)));
        }
    }

    public static class c extends RecyclerView.Adapter<d> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4155a;
        public final List<r3> b;
        public final List<r3> c = new ArrayList();
        public final boolean d;
        public View.OnClickListener e;
        public View.OnClickListener f;

        public c(List<r3> list, Context context) {
            this.b = list;
            this.f4155a = context;
            this.d = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new d(new o0(this.d, this.f4155a));
        }

        public List<r3> a() {
            return this.b;
        }

        public void a(View.OnClickListener onClickListener) {
            this.f = onClickListener;
        }

        public final void a(r3 r3Var, o0 o0Var) {
            ImageData image = r3Var.getImage();
            if (image != null) {
                i9 smartImageView = o0Var.getSmartImageView();
                smartImageView.setPlaceholderDimensions(image.getWidth(), image.getHeight());
                m2.b(image, smartImageView);
            }
            o0Var.getTitleTextView().setText(r3Var.getTitle());
            o0Var.getDescriptionTextView().setText(r3Var.getDescription());
            o0Var.getCtaButtonView().setText(r3Var.getCtaText());
            TextView domainTextView = o0Var.getDomainTextView();
            String domain = r3Var.getDomain();
            StarsRatingView ratingView = o0Var.getRatingView();
            if (NavigationType.WEB.equals(r3Var.getNavigationType())) {
                ratingView.setVisibility(8);
                domainTextView.setVisibility(0);
                domainTextView.setText(domain);
                return;
            }
            domainTextView.setVisibility(8);
            float rating = r3Var.getRating();
            if (rating <= 0.0f) {
                ratingView.setVisibility(8);
            } else {
                ratingView.setVisibility(0);
                ratingView.setRating(rating);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(d dVar) {
            o0 o0VarA = dVar.a();
            o0VarA.a(null, null);
            o0VarA.getCtaButtonView().setOnClickListener(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(d dVar, int i) {
            o0 o0VarA = dVar.a();
            r3 r3Var = a().get(i);
            if (!this.c.contains(r3Var)) {
                this.c.add(r3Var);
                w9.a(r3Var.getStatHolder().b("render"), dVar.itemView.getContext());
            }
            a(r3Var, o0VarA);
            o0VarA.a(this.e, r3Var.getClickArea());
            o0VarA.getCtaButtonView().setOnClickListener(this.f);
        }

        public void b(View.OnClickListener onClickListener) {
            this.e = onClickListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return a().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == getItemCount() - 1 ? 2 : 0;
        }
    }

    public static class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final o0 f4156a;

        public d(o0 o0Var) {
            super(o0Var);
            this.f4156a = o0Var;
        }

        public o0 a() {
            return this.f4156a;
        }
    }

    public v0(Context context) {
        this(context, null);
    }

    public v0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public v0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4152a = new a();
        this.c = new b();
        setOverScrollMode(2);
        this.b = new u0(context);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        this.d = linearSnapHelper;
        linearSnapHelper.attachToRecyclerView(this);
    }

    private List<r3> getVisibleCards() {
        int iFindFirstCompletelyVisibleItemPosition;
        int iFindLastCompletelyVisibleItemPosition;
        ArrayList arrayList = new ArrayList();
        if (this.e != null && (iFindFirstCompletelyVisibleItemPosition = getCardLayoutManager().findFirstCompletelyVisibleItemPosition()) <= (iFindLastCompletelyVisibleItemPosition = getCardLayoutManager().findLastCompletelyVisibleItemPosition()) && iFindFirstCompletelyVisibleItemPosition >= 0 && iFindLastCompletelyVisibleItemPosition < this.e.size()) {
            while (iFindFirstCompletelyVisibleItemPosition <= iFindLastCompletelyVisibleItemPosition) {
                arrayList.add(this.e.get(iFindFirstCompletelyVisibleItemPosition));
                iFindFirstCompletelyVisibleItemPosition++;
            }
        }
        return arrayList;
    }

    private void setCardLayoutManager(u0 u0Var) {
        u0Var.a(new u0.a() { // from class: com.my.target.v0$$ExternalSyntheticLambda0
            @Override // com.my.target.u0.a
            public final void a() {
                this.f$0.a();
            }
        });
        super.setLayoutManager(u0Var);
    }

    public final void a() {
        w0.b bVar = this.f;
        if (bVar != null) {
            bVar.a(getVisibleCards());
        }
    }

    public void a(View view) {
        int[] iArrCalculateDistanceToFinalSnap = this.d.calculateDistanceToFinalSnap(getCardLayoutManager(), view);
        if (iArrCalculateDistanceToFinalSnap != null) {
            smoothScrollBy(iArrCalculateDistanceToFinalSnap[0], 0);
        }
    }

    public void a(List<r3> list) {
        c cVar = new c(list, getContext());
        this.e = list;
        cVar.b(this.f4152a);
        cVar.a(this.c);
        setCardLayoutManager(this.b);
        setAdapter(cVar);
    }

    public void a(boolean z) {
        if (z) {
            this.d.attachToRecyclerView(this);
        } else {
            this.d.attachToRecyclerView(null);
        }
    }

    public u0 getCardLayoutManager() {
        return this.b;
    }

    public LinearSnapHelper getSnapHelper() {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 > i4) {
            this.h = true;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.g = z;
        if (z) {
            return;
        }
        a();
    }

    public void setCarouselListener(w0.b bVar) {
        this.f = bVar;
    }

    public void setSideSlidesMargins(int i) {
        getCardLayoutManager().a(i);
    }
}
