package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.my.target.common.models.VideoData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.j4;
import com.my.target.u4;

/* loaded from: classes4.dex */
public class i8 extends ViewGroup implements t4 {
    public j4.a A;
    public int B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f4002a;
    public final d8 b;
    public final t1 c;
    public final t1 d;
    public final i e;
    public final Runnable f;
    public final b g;
    public final TextView h;
    public final StarsRatingView i;
    public final Button j;
    public final TextView k;
    public final ca l;
    public final TextView m;
    public final ka n;
    public final l2 o;
    public final t1 p;
    public final d q;
    public final a r;
    public final TextView s;
    public final FrameLayout t;
    public final int u;
    public final int v;
    public final Bitmap w;
    public final Bitmap x;
    public final int y;
    public u4.a z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u4.a aVar;
            j4.a aVar2;
            j4.a aVar3;
            i8 i8Var = i8.this;
            if (view == i8Var.f4002a) {
                aVar2 = i8Var.A;
                if (aVar2 != null) {
                    aVar2.o();
                }
            } else {
                if (view == i8Var.c) {
                    if (!i8Var.b.e() || (aVar3 = i8.this.A) == null) {
                        return;
                    }
                    aVar3.j();
                    return;
                }
                if (view != i8Var.d) {
                    if (view != i8Var.e || (aVar = i8Var.z) == null) {
                        return;
                    }
                    aVar.c();
                    return;
                }
                if (i8Var.A != null) {
                    if (i8Var.c()) {
                        i8.this.A.l();
                    } else {
                        aVar2 = i8.this.A;
                        aVar2.o();
                    }
                }
            }
            i8.this.f();
        }
    }

    public final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u4.a aVar;
            if (!view.isEnabled() || (aVar = i8.this.z) == null) {
                return;
            }
            aVar.d();
        }
    }

    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i8 i8Var = i8.this;
            int i = i8Var.B;
            if (i == 2 || i == 0) {
                i8Var.f();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i8 i8Var = i8.this;
            i8Var.removeCallbacks(i8Var.f);
            i8 i8Var2 = i8.this;
            int i = i8Var2.B;
            if (i == 2) {
                i8Var2.f();
                i8 i8Var3 = i8.this;
                i8Var3.postDelayed(i8Var3.f, 4000L);
            } else if (i == 0 || i == 3) {
                i8Var2.h();
                i8 i8Var4 = i8.this;
                i8Var4.postDelayed(i8Var4.f, 4000L);
            }
        }
    }

    public i8(Context context, boolean z) {
        super(context);
        TextView textView = new TextView(context);
        this.k = textView;
        TextView textView2 = new TextView(context);
        this.h = textView2;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.i = starsRatingView;
        Button button = new Button(context);
        this.j = button;
        TextView textView3 = new TextView(context);
        this.s = textView3;
        FrameLayout frameLayout = new FrameLayout(context);
        this.t = frameLayout;
        t1 t1Var = new t1(context);
        this.c = t1Var;
        t1 t1Var2 = new t1(context);
        this.d = t1Var2;
        t1 t1Var3 = new t1(context);
        this.p = t1Var3;
        TextView textView4 = new TextView(context);
        this.m = textView4;
        d8 d8Var = new d8(context, ca.e(context), false, z);
        this.b = d8Var;
        ka kaVar = new ka(context);
        this.n = kaVar;
        l2 l2Var = new l2(context);
        this.o = l2Var;
        this.f4002a = new LinearLayout(context);
        ca caVarE = ca.e(context);
        this.l = caVarE;
        this.f = new c();
        this.q = new d();
        this.r = new a();
        this.e = new i(context);
        ca.b(textView, "dismiss_button");
        ca.b(textView2, "title_text");
        ca.b(starsRatingView, "stars_view");
        ca.b(button, "cta_button");
        ca.b(textView3, "replay_text");
        ca.b(frameLayout, "shadow");
        ca.b(t1Var, "pause_button");
        ca.b(t1Var2, "play_button");
        ca.b(t1Var3, "replay_button");
        ca.b(textView4, "domain_text");
        ca.b(d8Var, "media_view");
        ca.b(kaVar, "video_progress_wheel");
        ca.b(l2Var, "sound_button");
        this.y = caVarE.b(28);
        this.u = caVarE.b(16);
        this.v = caVarE.b(4);
        this.w = b4.f(context);
        this.x = b4.e(context);
        this.g = new b();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        j4.a aVar = this.A;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.my.target.t4
    public void a() {
        this.b.g();
    }

    @Override // com.my.target.t4
    public void a(int i) {
        this.b.a(i);
    }

    public final void a(com.my.target.c cVar) {
        this.e.setImageBitmap(cVar.c().getBitmap());
        this.e.setOnClickListener(this.r);
    }

    @Override // com.my.target.t4
    public void a(z3 z3Var) {
        this.b.setOnClickListener(null);
        this.o.setVisibility(8);
        this.b.b(z3Var);
        d();
        this.B = 4;
        this.f4002a.setVisibility(8);
        this.d.setVisibility(8);
        this.c.setVisibility(8);
        this.t.setVisibility(8);
        this.n.setVisibility(8);
    }

    @Override // com.my.target.t4
    public void a(boolean z) {
        this.b.b(true);
    }

    @Override // com.my.target.t4
    public void b() {
        this.b.i();
        j();
    }

    @Override // com.my.target.t4
    public final void b(boolean z) {
        String str;
        l2 l2Var = this.o;
        if (z) {
            l2Var.a(this.x, false);
            str = "sound_off";
        } else {
            l2Var.a(this.w, false);
            str = "sound_on";
        }
        l2Var.setContentDescription(str);
    }

    @Override // com.my.target.t4
    public void c(boolean z) {
        this.b.a(z);
        f();
    }

    @Override // com.my.target.t4
    public boolean c() {
        return this.b.d();
    }

    @Override // com.my.target.u4
    public void d() {
        this.k.setText(this.G);
        this.k.setTextSize(2, 16.0f);
        this.k.setVisibility(0);
        this.k.setTextColor(-1);
        this.k.setEnabled(true);
        TextView textView = this.k;
        int i = this.u;
        textView.setPadding(i, i, i, i);
        ca.a(this.k, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        this.I = true;
    }

    @Override // com.my.target.t4
    public void destroy() {
        this.b.a();
    }

    @Override // com.my.target.t4
    public void e() {
        this.n.setVisibility(8);
        k();
    }

    public void f() {
        this.B = 0;
        this.f4002a.setVisibility(8);
        this.d.setVisibility(8);
        this.c.setVisibility(8);
        this.t.setVisibility(8);
    }

    public final void g() {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i = this.u;
        this.b.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.b.c();
        this.t.setBackgroundColor(-1728053248);
        this.t.setVisibility(8);
        this.k.setTextSize(2, 16.0f);
        this.k.setTransformationMethod(null);
        this.k.setEllipsize(TextUtils.TruncateAt.END);
        this.k.setVisibility(8);
        this.k.setTextAlignment(4);
        this.k.setTextColor(-1);
        ca.a(this.k, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        this.h.setMaxLines(2);
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setTextSize(2, 18.0f);
        this.h.setTextColor(-1);
        ca.a(this.j, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        this.j.setTextColor(-1);
        this.j.setTransformationMethod(null);
        this.j.setGravity(1);
        this.j.setTextSize(2, 16.0f);
        this.j.setMinimumWidth(this.l.b(100));
        this.j.setPadding(i, i, i, i);
        this.h.setShadowLayer(this.l.b(1), this.l.b(1), this.l.b(1), ViewCompat.MEASURED_STATE_MASK);
        this.m.setTextColor(-3355444);
        this.m.setMaxEms(10);
        this.m.setShadowLayer(this.l.b(1), this.l.b(1), this.l.b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f4002a.setOnClickListener(this.r);
        this.f4002a.setGravity(17);
        this.f4002a.setVisibility(8);
        this.f4002a.setPadding(this.l.b(8), 0, this.l.b(8), 0);
        this.s.setSingleLine();
        this.s.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.s;
        textView.setTypeface(textView.getTypeface(), 1);
        this.s.setTextColor(-1);
        this.s.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.l.b(4);
        this.p.setPadding(this.l.b(16), this.l.b(16), this.l.b(16), this.l.b(16));
        this.c.setOnClickListener(this.r);
        this.c.setVisibility(8);
        this.c.setPadding(this.l.b(16), this.l.b(16), this.l.b(16), this.l.b(16));
        this.d.setOnClickListener(this.r);
        this.d.setVisibility(8);
        this.d.setPadding(this.l.b(16), this.l.b(16), this.l.b(16), this.l.b(16));
        Bitmap bitmapC = b4.c(getContext());
        if (bitmapC != null) {
            this.d.setImageBitmap(bitmapC);
        }
        Bitmap bitmapB = b4.b(getContext());
        if (bitmapB != null) {
            this.c.setImageBitmap(bitmapB);
        }
        ca.a(this.c, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        ca.a(this.d, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        ca.a(this.p, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        this.i.setStarSize(this.l.b(12));
        this.n.setVisibility(8);
        this.e.setFixedHeight(this.y);
        addView(this.b);
        addView(this.t);
        addView(this.o);
        addView(this.k);
        addView(this.n);
        addView(this.f4002a);
        addView(this.c);
        addView(this.d);
        addView(this.i);
        addView(this.m);
        addView(this.j);
        addView(this.h);
        addView(this.e);
        this.f4002a.addView(this.p);
        this.f4002a.addView(this.s, layoutParams);
    }

    @Override // com.my.target.u4
    public View getCloseButton() {
        return this.k;
    }

    @Override // com.my.target.t4
    public d8 getPromoMediaView() {
        return this.b;
    }

    @Override // com.my.target.u4
    public View getView() {
        return this;
    }

    public void h() {
        this.B = 2;
        this.f4002a.setVisibility(8);
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.t.setVisibility(8);
    }

    public final void i() {
        this.B = 1;
        this.f4002a.setVisibility(8);
        this.d.setVisibility(0);
        this.c.setVisibility(8);
        this.t.setVisibility(0);
    }

    @Override // com.my.target.t4
    public boolean isPlaying() {
        return this.b.e();
    }

    public final void j() {
        this.f4002a.setVisibility(8);
        this.d.setVisibility(8);
        if (this.B != 2) {
            this.c.setVisibility(8);
        }
    }

    public final void k() {
        this.B = 4;
        if (this.F) {
            this.f4002a.setVisibility(0);
            this.t.setVisibility(0);
        }
        this.d.setVisibility(8);
        this.c.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredHeight = this.b.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        this.b.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.t.layout(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
        int measuredWidth2 = this.d.getMeasuredWidth();
        int i9 = i3 >> 1;
        int i10 = measuredWidth2 >> 1;
        int i11 = i4 >> 1;
        int measuredHeight2 = this.d.getMeasuredHeight() >> 1;
        this.d.layout(i9 - i10, i11 - measuredHeight2, i10 + i9, measuredHeight2 + i11);
        int measuredWidth3 = this.c.getMeasuredWidth();
        int i12 = measuredWidth3 >> 1;
        int measuredHeight3 = this.c.getMeasuredHeight() >> 1;
        this.c.layout(i9 - i12, i11 - measuredHeight3, i12 + i9, measuredHeight3 + i11);
        int measuredWidth4 = this.f4002a.getMeasuredWidth();
        int i13 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f4002a.getMeasuredHeight() >> 1;
        this.f4002a.layout(i9 - i13, i11 - measuredHeight4, i9 + i13, i11 + measuredHeight4);
        TextView textView = this.k;
        int i14 = this.u;
        textView.layout(i14, i14, textView.getMeasuredWidth() + i14, this.u + this.k.getMeasuredHeight());
        if (i5 <= i6) {
            this.o.layout(((this.b.getRight() - this.u) - this.o.getMeasuredWidth()) + this.o.getPadding(), ((this.b.getBottom() - this.u) - this.o.getMeasuredHeight()) + this.o.getPadding(), (this.b.getRight() - this.u) + this.o.getPadding(), (this.b.getBottom() - this.u) + this.o.getPadding());
            this.e.layout((this.b.getRight() - this.u) - this.e.getMeasuredWidth(), this.b.getTop() + this.u, this.b.getRight() - this.u, this.b.getTop() + this.u + this.e.getMeasuredHeight());
            int i15 = this.u;
            int measuredHeight5 = this.h.getMeasuredHeight() + this.i.getMeasuredHeight() + this.m.getMeasuredHeight() + this.j.getMeasuredHeight();
            int bottom = getBottom() - this.b.getBottom();
            if ((i15 * 3) + measuredHeight5 > bottom) {
                i15 = (bottom - measuredHeight5) / 3;
            }
            TextView textView2 = this.h;
            int i16 = i5 >> 1;
            textView2.layout(i16 - (textView2.getMeasuredWidth() >> 1), this.b.getBottom() + i15, (this.h.getMeasuredWidth() >> 1) + i16, this.b.getBottom() + i15 + this.h.getMeasuredHeight());
            StarsRatingView starsRatingView = this.i;
            starsRatingView.layout(i16 - (starsRatingView.getMeasuredWidth() >> 1), this.h.getBottom() + i15, (this.i.getMeasuredWidth() >> 1) + i16, this.h.getBottom() + i15 + this.i.getMeasuredHeight());
            TextView textView3 = this.m;
            textView3.layout(i16 - (textView3.getMeasuredWidth() >> 1), this.h.getBottom() + i15, (this.m.getMeasuredWidth() >> 1) + i16, this.h.getBottom() + i15 + this.m.getMeasuredHeight());
            Button button = this.j;
            button.layout(i16 - (button.getMeasuredWidth() >> 1), this.i.getBottom() + i15, i16 + (this.j.getMeasuredWidth() >> 1), this.i.getBottom() + i15 + this.j.getMeasuredHeight());
            this.n.layout(this.u, (this.b.getBottom() - this.u) - this.n.getMeasuredHeight(), this.u + this.n.getMeasuredWidth(), this.b.getBottom() - this.u);
            return;
        }
        int iMax = Math.max(this.j.getMeasuredHeight(), Math.max(this.h.getMeasuredHeight(), this.i.getMeasuredHeight()));
        Button button2 = this.j;
        int measuredWidth5 = (i5 - this.u) - button2.getMeasuredWidth();
        int measuredHeight6 = ((i6 - this.u) - this.j.getMeasuredHeight()) - ((iMax - this.j.getMeasuredHeight()) >> 1);
        int i17 = this.u;
        button2.layout(measuredWidth5, measuredHeight6, i5 - i17, (i6 - i17) - ((iMax - this.j.getMeasuredHeight()) >> 1));
        this.o.layout((this.j.getRight() - this.o.getMeasuredWidth()) + this.o.getPadding(), (((this.b.getBottom() - (this.u << 1)) - this.o.getMeasuredHeight()) - iMax) + this.o.getPadding(), this.j.getRight() + this.o.getPadding(), ((this.b.getBottom() - (this.u << 1)) - iMax) + this.o.getPadding());
        this.e.layout(this.j.getRight() - this.e.getMeasuredWidth(), this.u, this.j.getRight(), this.u + this.e.getMeasuredHeight());
        StarsRatingView starsRatingView2 = this.i;
        int left = (this.j.getLeft() - this.u) - this.i.getMeasuredWidth();
        int measuredHeight7 = ((i6 - this.u) - this.i.getMeasuredHeight()) - ((iMax - this.i.getMeasuredHeight()) >> 1);
        int left2 = this.j.getLeft();
        int i18 = this.u;
        starsRatingView2.layout(left, measuredHeight7, left2 - i18, (i6 - i18) - ((iMax - this.i.getMeasuredHeight()) >> 1));
        TextView textView4 = this.m;
        int left3 = (this.j.getLeft() - this.u) - this.m.getMeasuredWidth();
        int measuredHeight8 = ((i6 - this.u) - this.m.getMeasuredHeight()) - ((iMax - this.m.getMeasuredHeight()) >> 1);
        int left4 = this.j.getLeft();
        int i19 = this.u;
        textView4.layout(left3, measuredHeight8, left4 - i19, (i6 - i19) - ((iMax - this.m.getMeasuredHeight()) >> 1));
        int iMin = Math.min(this.i.getLeft(), this.m.getLeft());
        TextView textView5 = this.h;
        int measuredWidth6 = (iMin - this.u) - textView5.getMeasuredWidth();
        int measuredHeight9 = ((i6 - this.u) - this.h.getMeasuredHeight()) - ((iMax - this.h.getMeasuredHeight()) >> 1);
        int i20 = this.u;
        textView5.layout(measuredWidth6, measuredHeight9, iMin - i20, (i6 - i20) - ((iMax - this.h.getMeasuredHeight()) >> 1));
        ka kaVar = this.n;
        int i21 = this.u;
        kaVar.layout(i21, ((i6 - i21) - kaVar.getMeasuredHeight()) - ((iMax - this.n.getMeasuredHeight()) >> 1), this.u + this.n.getMeasuredWidth(), (i6 - this.u) - ((iMax - this.n.getMeasuredHeight()) >> 1));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view;
        this.o.measure(View.MeasureSpec.makeMeasureSpec(this.y, 1073741824), View.MeasureSpec.makeMeasureSpec(this.y, 1073741824));
        this.n.measure(View.MeasureSpec.makeMeasureSpec(this.y, 1073741824), View.MeasureSpec.makeMeasureSpec(this.y, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i3 = this.u << 1;
        int measuredWidth = size - i3;
        int i4 = size2 - i3;
        this.k.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(this.y, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.y, Integer.MIN_VALUE));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.f4002a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.i.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.t.measure(View.MeasureSpec.makeMeasureSpec(this.b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.b.getMeasuredHeight(), 1073741824));
        this.j.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.m.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth2 = this.j.getMeasuredWidth();
            int measuredWidth3 = this.h.getMeasuredWidth();
            if (this.n.getMeasuredWidth() + measuredWidth3 + Math.max(this.i.getMeasuredWidth(), this.m.getMeasuredWidth()) + measuredWidth2 + (this.u * 3) > measuredWidth) {
                int measuredWidth4 = (measuredWidth - this.n.getMeasuredWidth()) - (this.u * 3);
                int i5 = measuredWidth4 / 3;
                this.j.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
                this.i.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
                this.m.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
                measuredWidth = ((measuredWidth4 - this.j.getMeasuredWidth()) - this.m.getMeasuredWidth()) - this.i.getMeasuredWidth();
                view = this.h;
                view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
            }
        } else {
            int measuredHeight = this.h.getMeasuredHeight() + this.i.getMeasuredHeight() + this.m.getMeasuredHeight() + this.j.getMeasuredHeight();
            int measuredHeight2 = (size2 - this.b.getMeasuredHeight()) / 2;
            int i6 = this.u;
            if (measuredHeight + (i6 * 3) > measuredHeight2) {
                int i7 = i6 / 2;
                this.j.setPadding(i6, i7, i6, i7);
                view = this.j;
                view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.t4
    public void pause() {
        int i = this.B;
        if (i == 0 || i == 2) {
            i();
            this.b.f();
        }
    }

    @Override // com.my.target.u4
    public void setBanner(z3 z3Var) {
        String str;
        this.b.b(z3Var, 1);
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        if (videoBanner == null) {
            return;
        }
        this.n.setMax(z3Var.getDuration());
        this.F = videoBanner.isAllowReplay();
        this.E = z3Var.isAllowClose();
        this.j.setText(z3Var.getCtaText());
        this.h.setText(z3Var.getTitle());
        if ("store".equals(z3Var.getNavigationType())) {
            if (z3Var.getRating() > 0.0f) {
                this.i.setVisibility(0);
                this.i.setRating(z3Var.getRating());
            } else {
                this.i.setVisibility(8);
            }
            this.m.setVisibility(8);
        } else {
            this.i.setVisibility(8);
            this.m.setVisibility(0);
            this.m.setText(z3Var.getDomain());
        }
        this.G = videoBanner.getCloseActionText();
        this.H = videoBanner.getCloseDelayActionText();
        this.k.setText(this.G);
        if (videoBanner.isAllowClose() && videoBanner.isAutoPlay()) {
            if (videoBanner.getAllowCloseDelay() > 0.0f) {
                this.D = videoBanner.getAllowCloseDelay();
                this.k.setEnabled(false);
                this.k.setTextColor(-3355444);
                TextView textView = this.k;
                int i = this.v;
                textView.setPadding(i, i, i, i);
                ca.a(this.k, -2013265920, -2013265920, -3355444, this.l.b(1), this.l.b(4));
                this.k.setTextSize(2, 12.0f);
            } else {
                TextView textView2 = this.k;
                int i2 = this.u;
                textView2.setPadding(i2, i2, i2, i2);
                this.k.setVisibility(0);
            }
        }
        this.s.setText(videoBanner.getReplayActionText());
        Bitmap bitmapD = b4.d(getContext());
        if (bitmapD != null) {
            this.p.setImageBitmap(bitmapD);
        }
        if (videoBanner.isAutoPlay()) {
            c(true);
            f();
        } else {
            i();
        }
        this.C = videoBanner.getDuration();
        l2 l2Var = this.o;
        l2Var.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.i8$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        });
        if (videoBanner.isAutoMute()) {
            l2Var.a(this.x, false);
            str = "sound_off";
        } else {
            l2Var.a(this.w, false);
            str = "sound_on";
        }
        l2Var.setContentDescription(str);
        com.my.target.c adChoices = z3Var.getAdChoices();
        if (adChoices != null) {
            a(adChoices);
        } else {
            this.e.setVisibility(8);
        }
    }

    @Override // com.my.target.u4
    public void setClickArea(x0 x0Var) {
        ba.a("PromoStyle1View: Apply click area " + x0Var.a() + " to view");
        setOnClickListener((x0Var.l || x0Var.m) ? this.g : null);
        this.j.setOnClickListener((x0Var.g || x0Var.m) ? this.g : null);
        this.h.setOnClickListener((x0Var.f4179a || x0Var.m) ? this.g : null);
        this.i.setOnClickListener((x0Var.e || x0Var.m) ? this.g : null);
        this.m.setOnClickListener((x0Var.j || x0Var.m) ? this.g : null);
        this.b.getClickableLayout().setOnClickListener((x0Var.n || x0Var.m) ? this.g : this.q);
    }

    @Override // com.my.target.u4
    public void setInterstitialPromoViewListener(u4.a aVar) {
        this.z = aVar;
    }

    @Override // com.my.target.t4
    public void setMediaListener(j4.a aVar) {
        this.A = aVar;
        this.b.setInterstitialPromoViewListener(aVar);
    }

    @Override // com.my.target.t4
    public void setTimeChanged(float f) {
        if (!this.I && this.E) {
            float f2 = this.D;
            if (f2 > 0.0f && f2 >= f) {
                if (this.k.getVisibility() != 0) {
                    this.k.setVisibility(0);
                }
                if (this.H != null) {
                    int iCeil = (int) Math.ceil(this.D - f);
                    String strValueOf = String.valueOf(iCeil);
                    if (this.D > 9.0f && iCeil <= 9) {
                        strValueOf = "0" + strValueOf;
                    }
                    this.k.setText(this.H.replace("%d", strValueOf));
                }
            }
        }
        if (this.n.getVisibility() != 0) {
            this.n.setVisibility(0);
        }
        this.n.setProgress(f / this.C);
        this.n.setDigit((int) Math.ceil(this.C - f));
    }
}
