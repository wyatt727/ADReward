package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class xb {

    /* renamed from: a, reason: collision with root package name */
    public TextView f1165a;
    public TextView b;
    public ImageView c;
    public ImageView d;
    private yb e;
    private int f;

    public int a() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }

    public yb b() {
        return this.e;
    }

    public void a(yb ybVar) {
        this.e = ybVar;
        this.f1165a.setText(ybVar.k());
        this.f1165a.setTextColor(ybVar.l());
        if (this.b != null) {
            if (!TextUtils.isEmpty(ybVar.f())) {
                this.b.setTypeface(null, 0);
                this.b.setVisibility(0);
                this.b.setText(ybVar.f());
                this.b.setTextColor(ybVar.g());
                if (ybVar.p()) {
                    this.b.setTypeface(null, 1);
                }
            } else {
                this.b.setVisibility(8);
            }
        }
        if (this.c != null) {
            if (ybVar.h() > 0) {
                this.c.setImageResource(ybVar.h());
                this.c.setColorFilter(ybVar.i());
                this.c.setVisibility(0);
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (ybVar.d() > 0) {
                this.d.setImageResource(ybVar.d());
                this.d.setColorFilter(ybVar.e());
                this.d.setVisibility(0);
                return;
            }
            this.d.setVisibility(8);
        }
    }
}
