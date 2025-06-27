package com.applovin.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class vc extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private a f1090a;

    interface a {
        void a(vc vcVar);
    }

    public void setListener(a aVar) {
        this.f1090a = aVar;
    }

    public vc(xc xcVar, Context context) {
        super(context);
        setOnClickListener(this);
        com.applovin.impl.adview.i iVar = new com.applovin.impl.adview.i(context);
        int iDpToPx = AppLovinSdkUtils.dpToPx(context, xcVar.e());
        iVar.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 17));
        iVar.a(iDpToPx);
        addView(iVar);
        int iDpToPx2 = AppLovinSdkUtils.dpToPx(context, xcVar.e() + (xcVar.c() * 2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, 8388661);
        int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, xcVar.f());
        int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, xcVar.d());
        layoutParams.setMargins(iDpToPx4, iDpToPx3, iDpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f1090a.a(this);
    }
}
