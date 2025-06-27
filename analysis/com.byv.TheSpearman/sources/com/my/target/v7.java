package com.my.target;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.r0;
import com.my.target.u7;
import com.my.target.z7;
import java.util.List;

/* loaded from: classes4.dex */
public class v7 extends RecyclerView implements w7 {

    /* renamed from: a, reason: collision with root package name */
    public final b f4162a;
    public final u7.c b;
    public final u7 c;
    public boolean d;
    public z7.a e;

    public class a implements u7.c {
        public a() {
        }

        @Override // com.my.target.u7.c
        public void onCardRender(int i) {
            v7 v7Var = v7.this;
            z7.a aVar = v7Var.e;
            if (aVar != null) {
                aVar.a(i, v7Var.getContext());
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View viewFindContainingItemView;
            int position;
            v7 v7Var = v7.this;
            if (v7Var.d || !v7Var.isClickable() || (viewFindContainingItemView = v7.this.f4162a.findContainingItemView(view)) == null) {
                return;
            }
            v7 v7Var2 = v7.this;
            if (v7Var2.e == null || (position = v7Var2.f4162a.getPosition(viewFindContainingItemView)) < 0) {
                return;
            }
            v7.this.e.a(viewFindContainingItemView, position);
        }
    }

    public static class b extends LinearLayoutManager {

        /* renamed from: a, reason: collision with root package name */
        public r0.a f4164a;
        public int b;

        public b(Context context) {
            super(context, 0, false);
        }

        public void a(int i) {
            this.b = i;
        }

        public void a(r0.a aVar) {
            this.f4164a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void measureChildWithMargins(View view, int i, int i2) {
            int i3;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int width = getWidth();
            if (getHeight() <= 0 || width <= 0) {
                return;
            }
            if (getItemViewType(view) == 1) {
                i3 = this.b;
            } else if (getItemViewType(view) == 2) {
                layoutParams.leftMargin = this.b;
                super.measureChildWithMargins(view, i, i2);
            } else {
                i3 = this.b;
                layoutParams.leftMargin = i3;
            }
            layoutParams.rightMargin = i3;
            super.measureChildWithMargins(view, i, i2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutCompleted(RecyclerView.State state) {
            super.onLayoutCompleted(state);
            r0.a aVar = this.f4164a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public v7(Context context) {
        this(context, null);
    }

    public v7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public v7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new a();
        b bVar = new b(context);
        this.f4162a = bVar;
        bVar.a(ca.a(4, context));
        this.c = new u7(getContext());
        setHasFixedSize(true);
    }

    private void setCardLayoutManager(b bVar) {
        bVar.a(new r0.a() { // from class: com.my.target.v7$$ExternalSyntheticLambda0
            @Override // com.my.target.r0.a
            public final void a() {
                this.f$0.a();
            }
        });
        super.setLayoutManager(bVar);
    }

    public final void a() {
        z7.a aVar = this.e;
        if (aVar != null) {
            aVar.a(getVisibleCardNumbers(), getContext());
        }
    }

    @Override // com.my.target.z7
    public void dispose() {
        this.c.a();
    }

    @Override // com.my.target.z7
    public Parcelable getState() {
        return this.f4162a.onSaveInstanceState();
    }

    @Override // com.my.target.w7
    public View getView() {
        return this;
    }

    @Override // com.my.target.z7
    public int[] getVisibleCardNumbers() {
        int iFindFirstVisibleItemPosition = this.f4162a.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.f4162a.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (pa.a(this.f4162a.findViewByPosition(iFindFirstVisibleItemPosition)) < 50.0f) {
            iFindFirstVisibleItemPosition++;
        }
        if (pa.a(this.f4162a.findViewByPosition(iFindLastVisibleItemPosition)) < 50.0f) {
            iFindLastVisibleItemPosition--;
        }
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return new int[0];
        }
        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
            return new int[]{iFindFirstVisibleItemPosition};
        }
        int i = (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = iFindFirstVisibleItemPosition;
            iFindFirstVisibleItemPosition++;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.d = z;
        if (z) {
            return;
        }
        a();
    }

    @Override // com.my.target.z7
    public void restoreState(Parcelable parcelable) {
        this.f4162a.onRestoreInstanceState(parcelable);
    }

    @Override // com.my.target.z7
    public void setPromoCardSliderListener(z7.a aVar) {
        this.e = aVar;
    }

    @Override // com.my.target.w7
    public void setupCards(List<f6> list) {
        this.c.a(list);
        if (isClickable()) {
            this.c.a(this.b);
        }
        setCardLayoutManager(this.f4162a);
        swapAdapter(this.c, true);
    }
}
