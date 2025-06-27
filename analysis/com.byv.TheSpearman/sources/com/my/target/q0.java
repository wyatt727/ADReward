package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.my.target.common.models.ImageData;
import com.my.target.p0;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class q0 extends LinearLayout implements View.OnTouchListener, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final i9 f4096a;
    public final TextView b;
    public final TextView c;
    public final Button d;
    public final w8 e;
    public final Set<View> f;
    public final int g;
    public final int h;
    public final int i;
    public p0.a j;
    public ImageData k;
    public boolean l;

    public q0(Context context, j8 j8Var, w8 w8Var) {
        super(context);
        this.f = new HashSet();
        setOrientation(1);
        this.e = w8Var;
        this.f4096a = new i9(context);
        this.b = new TextView(context);
        this.c = new TextView(context);
        this.d = new Button(context);
        this.g = w8Var.a(w8.S);
        this.h = w8Var.a(w8.h);
        this.i = w8Var.a(w8.G);
        a(j8Var);
    }

    private void setClickArea(x0 x0Var) {
        setOnTouchListener(this);
        this.f4096a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        this.c.setOnTouchListener(this);
        this.d.setOnTouchListener(this);
        this.f.clear();
        if (x0Var.m) {
            this.l = true;
            return;
        }
        if (x0Var.g) {
            this.f.add(this.d);
        } else {
            this.d.setEnabled(false);
            this.f.remove(this.d);
        }
        if (x0Var.l) {
            this.f.add(this);
        } else {
            this.f.remove(this);
        }
        if (x0Var.f4179a) {
            this.f.add(this.b);
        } else {
            this.f.remove(this.b);
        }
        if (x0Var.b) {
            this.f.add(this.c);
        } else {
            this.f.remove(this.c);
        }
        if (x0Var.d) {
            this.f.add(this.f4096a);
        } else {
            this.f.remove(this.f4096a);
        }
    }

    @Override // com.my.target.p0
    public View a() {
        return this;
    }

    public final void a(int i, int i2) {
        this.f4096a.measure(i, i2);
        if (this.b.getVisibility() == 0) {
            this.b.measure(i, i2);
        }
        if (this.c.getVisibility() == 0) {
            this.c.measure(i, i2);
        }
        if (this.d.getVisibility() == 0) {
            ca.a(this.d, this.f4096a.getMeasuredWidth() - (this.e.a(w8.O) * 2), this.g, 1073741824);
        }
    }

    public final void a(j8 j8Var) {
        this.d.setTransformationMethod(null);
        this.d.setSingleLine();
        this.d.setTextSize(1, this.e.a(w8.v));
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setGravity(17);
        this.d.setIncludeFontPadding(false);
        Button button = this.d;
        int i = this.h;
        button.setPadding(i, 0, i, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        w8 w8Var = this.e;
        int i2 = w8.O;
        layoutParams.leftMargin = w8Var.a(i2);
        layoutParams.rightMargin = this.e.a(i2);
        layoutParams.topMargin = this.i;
        layoutParams.gravity = 1;
        this.d.setLayoutParams(layoutParams);
        ca.b(this.d, j8Var.d(), j8Var.f(), this.e.a(w8.n));
        this.d.setTextColor(j8Var.e());
        this.b.setTextSize(1, this.e.a(w8.P));
        this.b.setTextColor(j8Var.k());
        this.b.setIncludeFontPadding(false);
        TextView textView = this.b;
        w8 w8Var2 = this.e;
        int i3 = w8.N;
        textView.setPadding(w8Var2.a(i3), 0, this.e.a(i3), 0);
        this.b.setTypeface(null, 1);
        this.b.setLines(this.e.a(w8.C));
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = this.h;
        this.b.setLayoutParams(layoutParams2);
        this.c.setTextColor(j8Var.j());
        this.c.setIncludeFontPadding(false);
        this.c.setLines(this.e.a(w8.D));
        this.c.setTextSize(1, this.e.a(w8.Q));
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        this.c.setPadding(this.e.a(i3), 0, this.e.a(i3), 0);
        this.c.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        this.c.setLayoutParams(layoutParams3);
        ca.b(this, "card_view");
        ca.b(this.b, "card_title_text");
        ca.b(this.c, "card_description_text");
        ca.b(this.d, "card_cta_button");
        ca.b(this.f4096a, "card_image");
        addView(this.f4096a);
        addView(this.b);
        addView(this.c);
        addView(this.d);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        a(i, i2);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0 && getMeasuredWidth() == size) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = this.f4096a.getMeasuredWidth();
        int measuredHeight = this.f4096a.getMeasuredHeight();
        if (size <= size2) {
            measuredHeight = getPaddingBottom() + 0 + getPaddingTop();
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                int measuredHeight2 = measuredHeight + childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = measuredHeight2 + layoutParams.topMargin + layoutParams.bottomMargin;
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                setBackgroundColor(0);
                this.d.setPressed(false);
                p0.a aVar = this.j;
                if (aVar != null) {
                    aVar.a(this.l || this.f.contains(view));
                }
            } else if (action == 3) {
                setBackgroundColor(0);
                this.d.setPressed(false);
            }
        } else if (this.l || this.f.contains(view)) {
            Button button = this.d;
            if (view == button) {
                button.setPressed(true);
            } else {
                setBackgroundColor(-13421773);
            }
        }
        return true;
    }

    @Override // com.my.target.p0
    public void setBanner(r3 r3Var) {
        if (r3Var == null) {
            this.f.clear();
            ImageData imageData = this.k;
            if (imageData != null) {
                m2.a(imageData, this.f4096a);
            }
            this.f4096a.setPlaceholderDimensions(0, 0);
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            return;
        }
        ImageData image = r3Var.getImage();
        this.k = image;
        if (image != null) {
            this.f4096a.setPlaceholderDimensions(image.getWidth(), this.k.getHeight());
            m2.b(this.k, this.f4096a);
        }
        if (r3Var.isImageOnly()) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            this.b.setText(r3Var.getTitle());
            this.c.setText(r3Var.getDescription());
            this.d.setText(r3Var.getCtaText());
        }
        setClickArea(r3Var.getClickArea());
    }

    @Override // com.my.target.p0
    public void setListener(p0.a aVar) {
        this.j = aVar;
    }
}
