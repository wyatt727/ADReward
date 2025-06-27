package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.o;
import com.applovin.impl.r3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final GradientDrawable f683a;
    private final Button b;
    private final o c;
    private b d;
    private MaxAdFormat f;
    private a g;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        return b.LOAD == bVar ? r3.a(R.color.applovin_sdk_brand_color, getContext()) : b.LOADING == bVar ? r3.a(R.color.applovin_sdk_brand_color, getContext()) : r3.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.c.a();
        } else {
            setEnabled(true);
            this.c.b();
        }
        this.b.setText(b(bVar));
        this.f683a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.d;
    }

    public MaxAdFormat getFormat() {
        return this.f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.d != bVar) {
            c(bVar);
        }
        this.d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.g = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f683a = gradientDrawable;
        Button button = new Button(getContext());
        this.b = button;
        o oVar = new o(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.c = oVar;
        b bVar = b.LOAD;
        this.d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        oVar.setColor(-1);
        addView(oVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{r3.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
