package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes4.dex */
public class s1 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f4118a;
    public final ImageView b;
    public final ImageView c;
    public final ca d;
    public final boolean e;
    public final View.OnClickListener f;

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4119a;

        public a(Context context) {
            this.f4119a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://target.my.com/"));
                if (!(this.f4119a instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                this.f4119a.startActivity(intent);
            } catch (Throwable th) {
                ba.a("FooterView$GoToMyTargetClickListener: Error - " + th.getMessage());
            }
        }
    }

    public s1(Context context, ca caVar, boolean z) {
        super(context);
        this.f4118a = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ca.b(imageView, "logo_image");
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        ca.b(imageView2, "store_image");
        this.d = caVar;
        this.e = z;
        this.f = new a(context);
    }

    public void a() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f4118a.setLayoutParams(layoutParams);
        this.b.setImageBitmap(b4.a(getContext()));
        this.f4118a.addView(this.b);
        this.f4118a.addView(this.c);
        addView(this.f4118a);
    }

    public void a(int i, boolean z) {
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int i2 = i / 3;
        if (this.e) {
            i2 = i / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i2);
        int iB8 = this.d.b(24);
        ca caVar = this.d;
        if (z) {
            iB = caVar.b(4);
            iB2 = this.d.b(24);
            iB3 = this.d.b(8);
        } else {
            iB = caVar.b(16);
            iB2 = this.d.b(24);
            iB3 = this.d.b(16);
        }
        layoutParams.setMargins(iB8, iB, iB2, iB3);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20);
        this.c.setScaleType(ImageView.ScaleType.FIT_START);
        this.c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i2);
        if (z) {
            iB4 = this.d.b(8);
            iB5 = this.d.b(4);
            iB6 = this.d.b(8);
            iB7 = this.d.b(8);
        } else {
            iB4 = this.d.b(24);
            iB5 = this.d.b(16);
            iB6 = this.d.b(24);
            iB7 = this.d.b(16);
        }
        layoutParams2.setMargins(iB4, iB5, iB6, iB7);
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(21);
        this.b.setScaleType(ImageView.ScaleType.FIT_END);
        this.b.setLayoutParams(layoutParams2);
        this.b.setOnClickListener(this.f);
    }
}
