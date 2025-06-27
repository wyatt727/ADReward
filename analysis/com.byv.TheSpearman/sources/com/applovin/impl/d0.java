package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class d0 extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f347a;
    private AppLovinSdkUtils.Size b;
    private Activity c;
    private RelativeLayout d;

    public d0(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f347a = viewGroup;
        this.b = size;
        this.c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.c, this.b.getWidth()), AppLovinSdkUtils.dpToPx(this.c, this.b.getHeight()));
        layoutParams.addRule(13);
        this.f347a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.d0$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.c);
        this.d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.d.setBackgroundColor(Integer.MIN_VALUE);
        this.d.addView(imageButton);
        this.d.addView(this.f347a);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.d0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.b(view);
            }
        });
        setContentView(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.d.removeView(this.f347a);
        super.dismiss();
    }
}
