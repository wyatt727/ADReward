package com.my.target;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.nearby.messages.Strategy;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.views.MediaAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class n7 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4070a;
    public final aa b;
    public final TextView c;
    public final LinearLayout d;
    public final StarsRatingView e;
    public final TextView f;
    public final TextView g;
    public final Button h;
    public final i9 i;
    public final ca j;
    public final int k;
    public final int l;
    public final int m;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n7.this.c.setVisibility(8);
            n7.this.f4070a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (n7.this.d.isEnabled()) {
                n7.this.d.setVisibility(8);
            }
            if (n7.this.g.isEnabled()) {
                n7.this.g.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public n7(Context context, ca caVar) {
        super(context);
        this.j = caVar;
        Button button = new Button(context);
        this.h = button;
        ca.b(button, "cta_button");
        i9 i9Var = new i9(context);
        this.i = i9Var;
        ca.b(i9Var, "icon_image");
        this.b = new aa(context);
        TextView textView = new TextView(context);
        this.f4070a = textView;
        ca.b(textView, "description_text");
        TextView textView2 = new TextView(context);
        this.c = textView2;
        ca.b(textView2, "disclaimer_text");
        this.d = new LinearLayout(context);
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.e = starsRatingView;
        ca.b(starsRatingView, "stars_view");
        TextView textView3 = new TextView(context);
        this.f = textView3;
        ca.b(textView3, "votes_text");
        TextView textView4 = new TextView(context);
        this.g = textView4;
        ca.b(textView4, "domain_text");
        this.k = caVar.b(16);
        this.m = caVar.b(8);
        this.l = caVar.b(64);
    }

    public void a() {
        setBackgroundColor(1711276032);
        this.f4070a.setTextColor(-2236963);
        this.f4070a.setEllipsize(TextUtils.TruncateAt.END);
        this.g.setTextColor(NativeAdColor.STANDARD_GREY);
        this.g.setVisibility(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(1, -3355444);
        this.c.setPadding(this.j.b(4), this.j.b(4), this.j.b(4), this.j.b(4));
        this.c.setBackgroundDrawable(gradientDrawable);
        this.c.setTextSize(2, 12.0f);
        this.c.setTextColor(-3355444);
        this.c.setVisibility(8);
        this.d.setOrientation(0);
        this.d.setGravity(16);
        this.d.setVisibility(8);
        this.f.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f.setGravity(16);
        this.f.setTextSize(2, 14.0f);
        this.h.setPadding(this.j.b(15), 0, this.j.b(15), 0);
        this.h.setMinimumWidth(this.j.b(100));
        this.h.setTransformationMethod(null);
        this.h.setTextSize(2, 22.0f);
        this.h.setMaxEms(10);
        this.h.setSingleLine();
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        l0 rightBorderedView = this.b.getRightBorderedView();
        rightBorderedView.a(1, -7829368);
        rightBorderedView.setPadding(this.j.b(2), 0, 0, 0);
        rightBorderedView.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        rightBorderedView.a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.j.b(3));
        rightBorderedView.setBackgroundColor(1711276032);
        this.e.setStarSize(this.j.b(12));
        this.d.addView(this.e);
        this.d.addView(this.f);
        this.d.setVisibility(8);
        this.g.setVisibility(8);
        addView(this.b);
        addView(this.d);
        addView(this.g);
        addView(this.f4070a);
        addView(this.c);
        addView(this.i);
        addView(this.h);
    }

    public final void a(int i, View... viewArr) {
        int height = this.i.getHeight();
        int height2 = getHeight();
        int width = this.h.getWidth();
        int height3 = this.h.getHeight();
        int width2 = this.i.getWidth();
        this.i.setPivotX(0.0f);
        this.i.setPivotY(height / 2.0f);
        this.h.setPivotX(width);
        this.h.setPivotY(height3 / 2.0f);
        float f = height2 * 0.3f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<Button, Float>) View.SCALE_X, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<Button, Float>) View.SCALE_Y, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<i9, Float>) View.SCALE_X, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<i9, Float>) View.SCALE_Y, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(this.f4070a, (Property<TextView, Float>) View.ALPHA, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) View.ALPHA, 0.0f));
        if (this.d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) View.ALPHA, 1.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<n7, Float>) View.ALPHA, 0.6f));
        float f2 = -(width2 * 0.3f);
        arrayList.add(ObjectAnimator.ofFloat(this.b, (Property<aa, Float>) View.TRANSLATION_X, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) View.TRANSLATION_X, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.g, (Property<TextView, Float>) View.TRANSLATION_X, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.f4070a, (Property<TextView, Float>) View.TRANSLATION_X, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) View.TRANSLATION_X, f2));
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<n7, Float>) View.TRANSLATION_Y, f));
        float f3 = (-f) / 2.0f;
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<Button, Float>) View.TRANSLATION_Y, f3));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<i9, Float>) View.TRANSLATION_Y, f3));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f));
        }
        if (this.d.isEnabled()) {
            this.d.setVisibility(0);
        }
        if (this.g.isEnabled()) {
            this.g.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new a());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(i);
        animatorSet.start();
    }

    public void a(x0 x0Var, View.OnClickListener onClickListener) {
        View view;
        if (x0Var.m) {
            setOnClickListener(onClickListener);
            view = this.h;
        } else {
            if (x0Var.g) {
                this.h.setOnClickListener(onClickListener);
            } else {
                this.h.setEnabled(false);
            }
            if (x0Var.l) {
                setOnClickListener(onClickListener);
            } else {
                setOnClickListener(null);
            }
            if (x0Var.f4179a) {
                this.b.getLeftText().setOnClickListener(onClickListener);
            } else {
                this.b.getLeftText().setOnClickListener(null);
            }
            if (x0Var.h) {
                this.b.getRightBorderedView().setOnClickListener(onClickListener);
            } else {
                this.b.getRightBorderedView().setOnClickListener(null);
            }
            if (x0Var.c) {
                this.i.setOnClickListener(onClickListener);
            } else {
                this.i.setOnClickListener(null);
            }
            if (x0Var.b) {
                this.f4070a.setOnClickListener(onClickListener);
            } else {
                this.f4070a.setOnClickListener(null);
            }
            if (x0Var.e) {
                this.e.setOnClickListener(onClickListener);
            } else {
                this.e.setOnClickListener(null);
            }
            if (x0Var.f) {
                this.f.setOnClickListener(onClickListener);
            } else {
                this.f.setOnClickListener(null);
            }
            if (!x0Var.j) {
                this.g.setOnClickListener(null);
                return;
            }
            view = this.g;
        }
        view.setOnClickListener(onClickListener);
    }

    public void a(View... viewArr) {
        if (getVisibility() == 0) {
            a(Strategy.TTL_SECONDS_DEFAULT, viewArr);
        }
    }

    public void b(View... viewArr) {
        if (getVisibility() == 0) {
            d(viewArr);
        }
    }

    public final void c(View... viewArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<Button, Float>) View.SCALE_Y, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<Button, Float>) View.SCALE_X, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<i9, Float>) View.SCALE_Y, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<i9, Float>) View.SCALE_X, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f4070a, (Property<TextView, Float>) View.ALPHA, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) View.ALPHA, 1.0f));
        if (this.d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) View.ALPHA, 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<n7, Float>) View.ALPHA, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.b, (Property<aa, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.g, (Property<TextView, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f4070a, (Property<TextView, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<n7, Float>) View.TRANSLATION_Y, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<Button, Float>) View.TRANSLATION_Y, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<i9, Float>) View.TRANSLATION_Y, 0.0f));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        if (!TextUtils.isEmpty(this.c.getText().toString())) {
            this.c.setVisibility(0);
        }
        this.f4070a.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new b());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void d(View... viewArr) {
        a(0, viewArr);
    }

    public void e(View... viewArr) {
        c(viewArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.i.getMeasuredHeight();
        int measuredWidth2 = this.i.getMeasuredWidth();
        int i5 = (measuredHeight - measuredHeight2) / 2;
        i9 i9Var = this.i;
        int i6 = this.k;
        i9Var.layout(i6, i5, i6 + measuredWidth2, measuredHeight2 + i5);
        int measuredWidth3 = this.h.getMeasuredWidth();
        int measuredHeight3 = this.h.getMeasuredHeight();
        int i7 = (measuredHeight - measuredHeight3) / 2;
        int i8 = this.k;
        this.h.layout((measuredWidth - measuredWidth3) - i8, i7, measuredWidth - i8, measuredHeight3 + i7);
        int i9 = this.k;
        int i10 = measuredWidth2 + i9 + i9;
        aa aaVar = this.b;
        aaVar.layout(i10, this.m, aaVar.getMeasuredWidth() + i10, this.m + this.b.getMeasuredHeight());
        this.d.layout(i10, this.b.getBottom(), this.d.getMeasuredWidth() + i10, this.b.getBottom() + this.d.getMeasuredHeight());
        this.g.layout(i10, this.b.getBottom(), this.g.getMeasuredWidth() + i10, this.b.getBottom() + this.g.getMeasuredHeight());
        this.f4070a.layout(i10, this.b.getBottom(), this.f4070a.getMeasuredWidth() + i10, this.b.getBottom() + this.f4070a.getMeasuredHeight());
        this.c.layout(i10, this.f4070a.getBottom(), this.c.getMeasuredWidth() + i10, this.f4070a.getBottom() + this.c.getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2) / 4;
        int i3 = size - (this.k * 2);
        int i4 = size2 - (this.m * 2);
        int iMin = Math.min(i4, this.l);
        this.i.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iMin - (this.m * 2), 1073741824));
        int measuredWidth = ((i3 - this.i.getMeasuredWidth()) - this.h.getMeasuredWidth()) - (this.k * 2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.g.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.f4070a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4 - this.b.getMeasuredHeight(), Integer.MIN_VALUE));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        int measuredHeight = this.b.getMeasuredHeight() + Math.max(this.f4070a.getMeasuredHeight(), this.d.getMeasuredHeight()) + (this.m * 2);
        if (this.c.getVisibility() == 0) {
            measuredHeight += this.c.getMeasuredHeight();
        }
        setMeasuredDimension(size, Math.max(this.h.getMeasuredHeight(), Math.max(this.i.getMeasuredHeight(), measuredHeight)) + (this.m * 2));
    }

    public void setBanner(z3 z3Var) {
        this.b.getLeftText().setText(z3Var.getTitle());
        this.f4070a.setText(z3Var.getDescription());
        String disclaimer = z3Var.getDisclaimer();
        if (TextUtils.isEmpty(disclaimer)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText(disclaimer);
        }
        ImageData icon = z3Var.getIcon();
        if (icon != null) {
            this.i.setVisibility(0);
            this.i.setImageData(icon);
        } else {
            this.i.setVisibility(8);
        }
        this.h.setText(z3Var.getCtaText());
        if ("".equals(z3Var.getAgeRestrictions())) {
            this.b.getRightBorderedView().setVisibility(8);
        } else {
            this.b.getRightBorderedView().setText(z3Var.getAgeRestrictions());
        }
        ca.b(this.h, -16733198, -16746839, this.j.b(2));
        this.h.setTextColor(-1);
        if ("store".equals(z3Var.getNavigationType())) {
            if (z3Var.getVotes() == 0 || z3Var.getRating() <= 0.0f) {
                this.d.setEnabled(false);
                this.d.setVisibility(8);
            } else {
                this.d.setEnabled(true);
                this.e.setRating(z3Var.getRating());
                this.f.setText(String.valueOf(z3Var.getVotes()));
            }
            this.g.setEnabled(false);
        } else {
            String domain = z3Var.getDomain();
            if (TextUtils.isEmpty(domain)) {
                this.g.setEnabled(false);
                this.g.setVisibility(8);
            } else {
                this.g.setEnabled(true);
                this.g.setText(domain);
            }
            this.d.setEnabled(false);
        }
        if (z3Var.getVideoBanner() == null || !z3Var.getVideoBanner().isAutoPlay()) {
            this.d.setVisibility(8);
            this.g.setVisibility(8);
        }
    }
}
