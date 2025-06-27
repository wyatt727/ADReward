package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class u7 extends RecyclerView.Adapter<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4143a;
    public final List<f6> b = new ArrayList();
    public c c;

    public static class a extends FrameLayout {

        /* renamed from: a, reason: collision with root package name */
        public int f4144a;
        public int b;

        public a(Context context) {
            super(context);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (size == 0) {
                size = this.f4144a;
            }
            if (size2 == 0) {
                size2 = this.b;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        }
    }

    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final i9 f4145a;
        public final FrameLayout b;

        public b(FrameLayout frameLayout, i9 i9Var, FrameLayout frameLayout2) {
            super(frameLayout);
            this.f4145a = i9Var;
            this.b = frameLayout2;
        }
    }

    public interface c extends View.OnClickListener {
        void onCardRender(int i);
    }

    public u7(Context context) {
        this.f4143a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        a aVar = new a(this.f4143a);
        aVar.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        i9 i9Var = new i9(this.f4143a);
        ca.b(i9Var, "card_media_view");
        aVar.addView(i9Var, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(this.f4143a);
        if (viewGroup.isClickable()) {
            ca.a(frameLayout, 0, 1153821432);
        }
        aVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return new b(aVar, i9Var, frameLayout);
    }

    public void a() {
        this.b.clear();
        notifyDataSetChanged();
        this.c = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(b bVar) {
        int adapterPosition = bVar.getAdapterPosition();
        f6 f6Var = (adapterPosition <= 0 || adapterPosition >= this.b.size()) ? null : this.b.get(adapterPosition);
        bVar.f4145a.setImageData(null);
        ImageData image = f6Var != null ? f6Var.getImage() : null;
        if (image != null) {
            m2.a(image, bVar.f4145a);
        }
        bVar.b.setOnClickListener(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.onCardRender(i);
        }
        f6 f6Var = i < this.b.size() ? this.b.get(i) : null;
        ImageData image = f6Var != null ? f6Var.getImage() : null;
        if (image != null) {
            bVar.f4145a.setPlaceholderDimensions(image.getWidth(), image.getHeight());
            Bitmap bitmap = image.getBitmap();
            if (bitmap != null) {
                bVar.f4145a.setImageBitmap(bitmap);
            } else {
                m2.b(image, bVar.f4145a);
            }
        }
        bVar.f4145a.setContentDescription("card_" + i);
        bVar.b.setOnClickListener(this.c);
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    public void a(List<f6> list) {
        this.b.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i == this.b.size() - 1 ? 2 : 0;
    }
}
