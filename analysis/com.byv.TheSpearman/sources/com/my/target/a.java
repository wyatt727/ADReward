package com.my.target;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.my.target.common.models.ImageData;

/* loaded from: classes4.dex */
public class a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3917a;
    public final i9 b;

    public a(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f3917a = textView;
        i9 i9Var = new i9(context);
        this.b = i9Var;
        ca caVarE = ca.e(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1157627904, -1157627904});
        gradientDrawable.setStroke(caVarE.a(1.0f), -1157627904);
        gradientDrawable.setCornerRadius(caVarE.a(10.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1157627904, -1157627904});
        gradientDrawable2.setStroke(caVarE.a(1.0f), -1157627904);
        gradientDrawable2.setCornerRadius(caVarE.a(10.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int iB = caVarE.b(6);
        int iB2 = caVarE.b(12);
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int iA = ca.a(32, context);
        setPadding(iB2, iB, iB2, iB);
        setBackgroundDrawable(stateListDrawable);
        setGravity(16);
        setOrientation(0);
        ca.b(i9Var, "ctc_icon");
        addView(i9Var, iA, iA);
        ca.b(textView, "ctc_text");
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    public void a(String str, ImageData imageData) {
        this.f3917a.setText(str);
        this.b.setImageData(imageData);
        ((LinearLayout.LayoutParams) this.f3917a.getLayoutParams()).leftMargin = imageData == null ? 0 : ca.a(4, getContext()) * 2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
