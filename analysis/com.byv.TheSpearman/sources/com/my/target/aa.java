package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class aa extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3925a;
    public final l0 b;
    public final int c;
    public final int d;

    public aa(Context context) {
        super(context);
        ca caVarE = ca.e(context);
        TextView textView = new TextView(context);
        this.f3925a = textView;
        l0 l0Var = new l0(context);
        this.b = l0Var;
        l0Var.setLines(1);
        textView.setTextSize(2, 18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        this.c = caVarE.b(4);
        this.d = caVarE.b(2);
        ca.b(textView, "title_text");
        ca.b(l0Var, "age_bordering");
        addView(textView);
        addView(l0Var);
    }

    public TextView getLeftText() {
        return this.f3925a;
    }

    public l0 getRightBorderedView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f3925a.getMeasuredWidth();
        int measuredHeight = this.f3925a.getMeasuredHeight();
        int measuredWidth2 = this.b.getMeasuredWidth();
        int measuredHeight2 = this.b.getMeasuredHeight();
        int measuredHeight3 = getMeasuredHeight();
        int i5 = (measuredHeight3 - measuredHeight) / 2;
        int i6 = (measuredHeight3 - measuredHeight2) / 2;
        int i7 = this.c + measuredWidth;
        this.f3925a.layout(0, i5, measuredWidth, measuredHeight + i5);
        this.b.layout(i7, i6, measuredWidth2 + i7, measuredHeight2 + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.d * 2), Integer.MIN_VALUE));
        int i3 = size / 2;
        if (this.b.getMeasuredWidth() > i3) {
            this.b.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.d * 2), Integer.MIN_VALUE));
        }
        this.f3925a.measure(View.MeasureSpec.makeMeasureSpec((size - this.b.getMeasuredWidth()) - this.c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.d * 2), Integer.MIN_VALUE));
        setMeasuredDimension(this.f3925a.getMeasuredWidth() + this.b.getMeasuredWidth() + this.c, Math.max(this.f3925a.getMeasuredHeight(), this.b.getMeasuredHeight()));
    }
}
