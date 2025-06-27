package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.shake.b;
import com.mbridge.msdk.splash.a.d;

/* loaded from: classes4.dex */
public class MBSplashNativeView extends BaseMBSplashNativeView {
    public MBSplashNativeView(Context context) {
        super(context);
    }

    public MBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBSplashNativeView(Context context, MBSplashView mBSplashView, d dVar) {
        super(context, mBSplashView, dVar);
    }

    @Override // com.mbridge.msdk.splash.view.BaseMBSplashNativeView
    protected final void a() {
        this.b.setVisibility(8);
    }

    @Override // com.mbridge.msdk.splash.view.BaseMBSplashNativeView
    protected final void b() {
        if (this.j == 1) {
            this.s = new MBShakeView(getContext());
            this.s.initView(this.r.getAdCall());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.s.setLayoutParams(layoutParams);
            addView(this.s);
            this.g.setVisibility(4);
            this.g.setEnabled(false);
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.MBSplashNativeView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBSplashNativeView.this.a(0);
                }
            });
            this.t = new b(this.k, this.l * 1000) { // from class: com.mbridge.msdk.splash.view.MBSplashNativeView.2
                @Override // com.mbridge.msdk.shake.b
                public final void a() {
                    if (MBSplashNativeView.this.o || MBSplashNativeView.this.n) {
                        return;
                    }
                    MBSplashNativeView.this.a(4);
                    com.mbridge.msdk.shake.a.a().b(this);
                }
            };
        }
    }
}
