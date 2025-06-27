package com.my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.my.target.e8;

/* loaded from: classes4.dex */
public class f8 extends ViewGroup implements e8, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final i9 f3968a;
    public final h9 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final Button h;
    public final e8.a i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final w8 q;
    public final int r;
    public final int s;
    public final int t;
    public b u;
    public boolean v;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3969a;

        static {
            int[] iArr = new int[b.values().length];
            f3969a = iArr;
            try {
                iArr[b.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3969a[b.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3969a[b.LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        PORTRAIT,
        LANDSCAPE,
        SQUARE
    }

    public f8(w8 w8Var, Context context, e8.a aVar) {
        super(context);
        this.u = b.PORTRAIT;
        this.i = aVar;
        this.q = w8Var;
        this.j = w8Var.a(w8.E);
        this.k = w8Var.a(w8.F);
        this.t = w8Var.a(w8.G);
        this.l = w8Var.a(w8.H);
        this.m = w8Var.a(w8.n);
        this.n = w8Var.a(w8.m);
        int iA = w8Var.a(w8.M);
        this.r = iA;
        int iA2 = w8Var.a(w8.T);
        this.o = iA2;
        this.p = w8Var.a(w8.S);
        this.s = ca.a(iA, context);
        i9 i9Var = new i9(context);
        this.f3968a = i9Var;
        h9 h9Var = new h9(context);
        this.b = h9Var;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setMaxLines(1);
        textView.setTextSize(1, w8Var.a(w8.I));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, w8Var.a(w8.K));
        textView2.setMaxLines(w8Var.a(w8.L));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setIncludeFontPadding(false);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        float f = iA;
        textView3.setTextSize(1, f);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setLines(1);
        textView3.setIncludeFontPadding(false);
        TextView textView4 = new TextView(context);
        this.f = textView4;
        textView4.setTextSize(1, f);
        textView4.setIncludeFontPadding(false);
        Button button = new Button(context);
        this.h = button;
        button.setLines(1);
        button.setTextSize(1, w8Var.a(w8.v));
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setMinimumWidth(iA2);
        button.setIncludeFontPadding(false);
        int iA3 = w8Var.a(w8.w);
        int i = iA3 * 2;
        button.setPadding(i, iA3, i, iA3);
        TextView textView5 = new TextView(context);
        this.g = textView5;
        textView5.setPadding(w8Var.a(w8.x), 0, 0, 0);
        textView5.setTextColor(-1);
        textView5.setMaxLines(w8Var.a(w8.A));
        textView5.setIncludeFontPadding(false);
        textView5.setTextSize(1, w8Var.a(w8.B));
        ca.a(i9Var, "panel_icon");
        ca.a(textView, "panel_title");
        ca.a(textView2, "panel_description");
        ca.a(textView3, "panel_domain");
        ca.a(textView4, "panel_rating");
        ca.a(button, "panel_cta");
        ca.a(textView5, "age_bordering");
        addView(i9Var);
        addView(h9Var);
        addView(textView);
        addView(textView2);
        addView(textView3);
        addView(textView4);
        addView(button);
        addView(textView5);
    }

    private void setClickArea(x0 x0Var) {
        View view;
        if (x0Var.m) {
            setOnClickListener(this);
            view = this.h;
        } else {
            if (x0Var.g) {
                this.h.setOnClickListener(this);
            } else {
                this.h.setEnabled(false);
            }
            if (x0Var.l) {
                setOnClickListener(this);
            } else {
                setOnClickListener(null);
            }
            if (x0Var.f4179a) {
                this.c.setOnClickListener(this);
            } else {
                this.c.setOnClickListener(null);
            }
            if (x0Var.c) {
                this.f3968a.setOnClickListener(this);
            } else {
                this.f3968a.setOnClickListener(null);
            }
            if (x0Var.b) {
                this.d.setOnClickListener(this);
            } else {
                this.d.setOnClickListener(null);
            }
            if (x0Var.e) {
                this.f.setOnClickListener(this);
                this.b.setOnClickListener(this);
            } else {
                this.f.setOnClickListener(null);
                this.b.setOnClickListener(null);
            }
            if (x0Var.j) {
                this.e.setOnClickListener(this);
            } else {
                this.e.setOnClickListener(null);
            }
            if (!x0Var.h) {
                this.g.setOnClickListener(null);
                return;
            }
            view = this.g;
        }
        view.setOnClickListener(this);
    }

    @Override // com.my.target.e8
    public View a() {
        return this;
    }

    public final void a(int i, int i2) {
        this.c.setGravity(1);
        this.d.setGravity(1);
        this.d.setVisibility(0);
        this.h.setVisibility(0);
        this.g.setVisibility(8);
        this.c.setTypeface(Typeface.defaultFromStyle(0));
        this.c.setTextSize(1, this.q.a(w8.J));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.p, 1073741824));
        ca.a(this.c, i2, i2, Integer.MIN_VALUE);
        ca.a(this.d, i2, i2, Integer.MIN_VALUE);
        setMeasuredDimension(i, i);
    }

    public final void a(int i, int i2, int i3) {
        i9 i9Var = this.f3968a;
        int i4 = this.k;
        ca.c(i9Var, i4, i4);
        int right = this.f3968a.getRight() + (this.k / 2);
        int iA = ca.a(this.f.getMeasuredHeight(), i3, i2);
        int iA2 = ca.a(i + this.k, this.f3968a.getTop());
        if (this.f3968a.getMeasuredHeight() > 0) {
            iA2 += (((this.f3968a.getMeasuredHeight() - this.c.getMeasuredHeight()) - this.l) - iA) / 2;
        }
        TextView textView = this.c;
        textView.layout(right, iA2, textView.getMeasuredWidth() + right, this.c.getMeasuredHeight() + iA2);
        ca.a(this.c.getBottom() + this.l, right, this.c.getBottom() + this.l + iA, this.k / 4, this.b, this.f, this.e);
        ca.e(this.g, this.c.getBottom(), this.c.getRight() + this.l);
    }

    public final void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int measuredHeight = this.f3968a.getMeasuredHeight();
        if (measuredHeight > 0) {
            i5 = measuredHeight + 0;
            i6 = 1;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int measuredHeight2 = this.c.getMeasuredHeight();
        if (measuredHeight2 > 0) {
            i6++;
            i5 += measuredHeight2;
        }
        int measuredHeight3 = this.d.getMeasuredHeight();
        if (measuredHeight3 > 0) {
            i6++;
            i5 += measuredHeight3;
        }
        int iMax = Math.max(this.b.getMeasuredHeight(), this.e.getMeasuredHeight());
        if (iMax > 0) {
            i6++;
            i5 += iMax;
        }
        int measuredHeight4 = this.h.getMeasuredHeight();
        if (measuredHeight4 > 0) {
            i6++;
            i5 += measuredHeight4;
        }
        int i7 = (i4 - i2) - i5;
        int iA = ca.a(this.l, this.k, i7 / i6);
        int i8 = (i7 - (i6 * iA)) / 2;
        int i9 = i3 - i;
        ca.a(this.f3968a, 0, i8, i9, measuredHeight + i8);
        int iA2 = ca.a(i8, this.f3968a.getBottom() + iA);
        ca.a(this.c, 0, iA2, i9, measuredHeight2 + iA2);
        int iA3 = ca.a(iA2, this.c.getBottom() + iA);
        ca.a(this.d, 0, iA3, i9, measuredHeight3 + iA3);
        int iA4 = ca.a(iA3, this.d.getBottom() + iA);
        int measuredWidth = ((i9 - this.f.getMeasuredWidth()) - this.b.getMeasuredWidth()) - this.e.getMeasuredWidth();
        int i10 = this.l;
        ca.a(iA4, (measuredWidth - (i10 * 2)) / 2, iMax + iA4, i10, this.b, this.f, this.e);
        int iA5 = ca.a(iA4, this.e.getBottom(), this.b.getBottom()) + iA;
        ca.a(this.h, 0, iA5, i9, measuredHeight4 + iA5);
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        i9 i9Var = this.f3968a;
        int i7 = i4 - i2;
        int i8 = this.t;
        ca.e(i9Var, i7 - i8, i8);
        Button button = this.h;
        int i9 = this.t;
        ca.d(button, i7 - i9, (i3 - i) - i9);
        int right = this.f3968a.getRight() + this.k;
        int iA = ca.a(this.f.getMeasuredHeight(), i6, i5);
        int iA2 = ca.a(this.f3968a.getTop(), this.l) + ((((this.f3968a.getMeasuredHeight() - this.c.getMeasuredHeight()) - this.l) - iA) / 2);
        TextView textView = this.c;
        textView.layout(right, iA2, textView.getMeasuredWidth() + right, this.c.getMeasuredHeight() + iA2);
        ca.a(this.c.getBottom() + this.l, right, this.c.getBottom() + this.l + iA, this.k / 4, this.b, this.f, this.e);
        ca.e(this.g, this.c.getBottom(), this.c.getRight() + (this.k / 2));
    }

    public final void b(int i, int i2, int i3) {
        this.c.setGravity(GravityCompat.START);
        this.d.setVisibility(8);
        this.h.setVisibility(0);
        this.c.setTextSize(this.q.a(w8.J));
        this.g.setVisibility(0);
        TextView textView = this.c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.c.setTextSize(1, this.q.a(w8.I));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i2 / 3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.p, 1073741824));
        ca.a(this.g, i2, i3, Integer.MIN_VALUE);
        int measuredWidth = i2 - ((((this.f3968a.getMeasuredWidth() + this.h.getMeasuredWidth()) + (this.k * 2)) + this.g.getMeasuredWidth()) + this.l);
        ca.a(this.c, measuredWidth, i3, Integer.MIN_VALUE);
        ca.a(this.e, measuredWidth, i3, Integer.MIN_VALUE);
        int measuredHeight = this.h.getMeasuredHeight() + (this.t * 2);
        if (this.v) {
            measuredHeight += this.n;
        }
        setMeasuredDimension(i, measuredHeight);
    }

    public final void c(int i, int i2, int i3) {
        this.c.setGravity(GravityCompat.START);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.g.setVisibility(0);
        TextView textView = this.c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.c.setTextSize(1, this.q.a(w8.I));
        ca.a(this.g, i2, i3, Integer.MIN_VALUE);
        ca.a(this.c, ((i2 - this.f3968a.getMeasuredWidth()) - (this.k * 2)) - this.g.getMeasuredWidth(), this.f3968a.getMeasuredHeight() - (this.l * 2), Integer.MIN_VALUE);
        setMeasuredDimension(i, ca.a(this.f3968a.getMeasuredHeight() + (this.k * 2), this.c.getMeasuredHeight() + ca.a(this.r, this.e.getMeasuredHeight()) + this.k));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.i.a(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = this.e.getMeasuredHeight();
        int measuredHeight2 = this.b.getMeasuredHeight();
        int i5 = a.f3969a[this.u.ordinal()];
        if (i5 == 1) {
            a(i, i2, i3, i4);
        } else if (i5 != 3) {
            a(i2, measuredHeight, measuredHeight2);
        } else {
            a(i, i2, i3, i4, measuredHeight, measuredHeight2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.k * 2;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.u = i4 == i5 ? b.SQUARE : i4 > i5 ? b.LANDSCAPE : b.PORTRAIT;
        i9 i9Var = this.f3968a;
        int i6 = this.j;
        ca.a(i9Var, i6, i6, 1073741824);
        if (this.f.getVisibility() != 8) {
            ca.a(this.f, (i4 - this.f3968a.getMeasuredWidth()) - this.l, i5, Integer.MIN_VALUE);
            h9 h9Var = this.b;
            int i7 = this.s;
            ca.a(h9Var, i7, i7, 1073741824);
        }
        if (this.e.getVisibility() != 8) {
            ca.a(this.e, (i4 - this.f3968a.getMeasuredWidth()) - (this.k * 2), i5, Integer.MIN_VALUE);
        }
        b bVar = this.u;
        if (bVar == b.SQUARE) {
            int i8 = this.t * 2;
            a(size - i8, i4 - i8);
        } else if (bVar == b.LANDSCAPE) {
            b(size, i4, i5);
        } else {
            c(size, i4, i5);
        }
    }

    @Override // com.my.target.e8
    public void setBanner(z3 z3Var) {
        j8 promoStyleSettings = z3Var.getPromoStyleSettings();
        int iJ = promoStyleSettings.j();
        this.c.setTextColor(promoStyleSettings.k());
        this.d.setTextColor(iJ);
        this.e.setTextColor(iJ);
        this.f.setTextColor(iJ);
        this.b.setColor(iJ);
        this.v = z3Var.getVideoBanner() != null;
        this.f3968a.setImageData(z3Var.getIcon());
        this.c.setText(z3Var.getTitle());
        this.d.setText(z3Var.getDescription());
        if (z3Var.getNavigationType().equals("store")) {
            this.e.setVisibility(8);
            if (z3Var.getRating() > 0.0f) {
                this.f.setVisibility(0);
                String strValueOf = String.valueOf(z3Var.getRating());
                if (strValueOf.length() > 3) {
                    strValueOf = strValueOf.substring(0, 3);
                }
                this.f.setText(strValueOf);
            } else {
                this.f.setVisibility(8);
            }
        } else {
            this.f.setVisibility(8);
            this.e.setVisibility(0);
            this.e.setText(z3Var.getDomain());
            this.e.setTextColor(promoStyleSettings.g());
        }
        this.h.setText(z3Var.getCtaText());
        ca.b(this.h, promoStyleSettings.d(), promoStyleSettings.f(), this.m);
        this.h.setTextColor(promoStyleSettings.j());
        setClickArea(z3Var.getClickArea());
        this.g.setText(z3Var.getAgeRestrictions());
    }
}
