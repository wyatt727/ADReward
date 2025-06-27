package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class o extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f731a;

    public o(Context context, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i2);
        this.f731a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i != -2 && i != -1) {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void setColor(int i) {
        this.f731a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }
}
