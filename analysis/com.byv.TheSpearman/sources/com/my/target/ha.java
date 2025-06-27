package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.views.MediaAdView;

/* loaded from: classes4.dex */
public class ha extends RelativeLayout {
    public static final int g = ca.c();
    public static final int h = ca.c();

    /* renamed from: a, reason: collision with root package name */
    public final k0 f3994a;
    public final Button b;
    public final l0 c;
    public final s1 d;
    public final ca e;
    public final boolean f;

    public ha(Context context, ca caVar, boolean z) {
        super(context);
        this.e = caVar;
        this.f = z;
        s1 s1Var = new s1(context, caVar, z);
        this.d = s1Var;
        ca.b(s1Var, "footer_layout");
        k0 k0Var = new k0(context, caVar, z);
        this.f3994a = k0Var;
        ca.b(k0Var, "body_layout");
        Button button = new Button(context);
        this.b = button;
        ca.b(button, "cta_button");
        l0 l0Var = new l0(context);
        this.c = l0Var;
        ca.b(l0Var, "age_bordering");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(x0 x0Var, View.OnClickListener onClickListener, View view, MotionEvent motionEvent) {
        if (!x0Var.h) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3994a.setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            this.f3994a.setBackgroundColor(-1);
            onClickListener.onClick(view);
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    public void a(int i, int i2, boolean z) {
        Button button;
        float f;
        int iMax = Math.max(i2, i) / 8;
        this.f3994a.a(z);
        this.d.a();
        View view = new View(getContext());
        view.setBackgroundColor(-5592406);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
        s1 s1Var = this.d;
        int i3 = g;
        s1Var.setId(i3);
        this.d.a(iMax, z);
        this.b.setPadding(this.e.b(15), 0, this.e.b(15), 0);
        this.b.setMinimumWidth(this.e.b(100));
        this.b.setTransformationMethod(null);
        this.b.setSingleLine();
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.c.a(1, -7829368);
        this.c.setPadding(this.e.b(2), 0, 0, 0);
        this.c.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        this.c.setMaxEms(5);
        this.c.a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.e.b(3));
        this.c.setBackgroundColor(1711276032);
        k0 k0Var = this.f3994a;
        int i4 = h;
        k0Var.setId(i4);
        if (z) {
            this.f3994a.setPadding(this.e.b(4), this.e.b(4), this.e.b(4), this.e.b(4));
        } else {
            this.f3994a.setPadding(this.e.b(16), this.e.b(16), this.e.b(16), this.e.b(16));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, i3);
        this.f3994a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        ca caVar = this.e;
        layoutParams2.setMargins(this.e.b(16), z ? caVar.b(8) : caVar.b(16), this.e.b(16), this.e.b(4));
        layoutParams2.addRule(21, -1);
        this.c.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, this.f ? this.e.b(64) : this.e.b(52));
        layoutParams3.addRule(14, -1);
        layoutParams3.addRule(8, i4);
        int i5 = -this.e.b(52);
        layoutParams3.bottomMargin = z ? (int) (i5 / 1.5d) : i5 / 2;
        this.b.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, iMax);
        layoutParams4.addRule(12, -1);
        this.d.setLayoutParams(layoutParams4);
        addView(this.f3994a);
        addView(view);
        addView(this.c);
        addView(this.d);
        addView(this.b);
        setClickable(true);
        if (this.f) {
            button = this.b;
            f = 32.0f;
        } else {
            button = this.b;
            f = 22.0f;
        }
        button.setTextSize(2, f);
    }

    public void a(final x0 x0Var, final View.OnClickListener onClickListener) {
        Button button;
        boolean z;
        this.f3994a.a(x0Var, onClickListener);
        if (x0Var.m) {
            this.b.setOnClickListener(onClickListener);
            return;
        }
        if (x0Var.g) {
            this.b.setOnClickListener(onClickListener);
            button = this.b;
            z = true;
        } else {
            this.b.setOnClickListener(null);
            button = this.b;
            z = false;
        }
        button.setEnabled(z);
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.ha$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.a(x0Var, onClickListener, view, motionEvent);
            }
        });
    }

    public void setBanner(z3 z3Var) {
        this.f3994a.setBanner(z3Var);
        this.b.setText(z3Var.getCtaText());
        this.d.setBackgroundColor(-39322);
        if (TextUtils.isEmpty(z3Var.getAgeRestrictions())) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(z3Var.getAgeRestrictions());
        }
        ca.b(this.b, -16733198, -16746839, this.e.b(2));
        this.b.setTextColor(-1);
    }
}
