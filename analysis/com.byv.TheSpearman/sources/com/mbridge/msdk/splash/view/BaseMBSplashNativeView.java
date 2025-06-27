package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ac;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.shake.b;
import com.mbridge.msdk.splash.view.nativeview.MBNoRecycledCrashImageView;
import com.mbridge.msdk.splash.view.nativeview.MBSplashClickView;
import com.mbridge.msdk.widget.FeedBackButton;

/* loaded from: classes4.dex */
public class BaseMBSplashNativeView extends RelativeLayout {
    private MBNoRecycledCrashImageView A;
    private TextView B;
    private MBNoRecycledCrashImageView C;
    private TextView D;
    private TextView E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private float L;
    private float M;
    private boolean N;
    private boolean O;
    private String P;
    private String Q;
    private String R;
    private String S;

    /* renamed from: a, reason: collision with root package name */
    protected TextView f3528a;
    protected RelativeLayout b;
    protected TextView c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected MBSplashClickView g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected String p;
    protected MBSplashView q;
    protected CampaignEx r;
    protected MBShakeView s;
    protected b t;
    private MBNoRecycledCrashImageView u;
    private MBNoRecycledCrashImageView v;
    private RelativeLayout w;
    private ImageView x;
    private FeedBackButton y;
    private RelativeLayout z;

    protected void a() {
    }

    protected void b() {
    }

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.n = false;
        this.o = false;
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = false;
        this.o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseMBSplashNativeView(android.content.Context r11, com.mbridge.msdk.splash.view.MBSplashView r12, com.mbridge.msdk.splash.a.d r13) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.view.BaseMBSplashNativeView.<init>(android.content.Context, com.mbridge.msdk.splash.view.MBSplashView, com.mbridge.msdk.splash.a.d):void");
    }

    protected final void a(int i) {
        if (this.q.getSplashSignalCommunicationImpl() == null || this.q.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        try {
            this.q.getSplashSignalCommunicationImpl().a().a(com.mbridge.msdk.splash.a.a.a.a(com.mbridge.msdk.splash.a.a.a.a(i, this.L, this.M), this.r));
        } catch (Throwable th) {
            ad.b("MBSplashNativeView", th.getMessage());
            this.q.getSplashSignalCommunicationImpl().a().a(this.r);
        }
    }

    public void updateCountDown(int i) {
        String str;
        if (this.f3528a != null) {
            this.F = i;
            if (this.m) {
                str = this.R + " " + i + this.Q;
            } else {
                str = i + this.Q + " " + this.S;
            }
            this.f3528a.setText(str);
        }
    }

    public void setIsPause(boolean z) {
        this.n = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        try {
            RelativeLayout relativeLayout = this.w;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.leftMargin = this.K + i;
            layoutParams.rightMargin = this.K + i2;
            layoutParams.topMargin = this.K + i3;
            layoutParams.bottomMargin = this.K + i4;
        } catch (Throwable th) {
            ad.b("MBSplashNativeView", th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.j != 1 || this.s == null || this.t == null) {
                return;
            }
            com.mbridge.msdk.shake.a.a().a(this.t);
        } catch (Throwable th) {
            ad.b("MBSplashNativeView", th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L = motionEvent.getRawX();
        this.M = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.t != null) {
                com.mbridge.msdk.shake.a.a().b(this.t);
                this.t = null;
            }
            com.mbridge.msdk.foundation.d.b.a().c(this.p);
            detachAllViewsFromParent();
        } catch (Exception e) {
            ad.b("MBSplashNativeView", e.getMessage());
        }
    }

    static /* synthetic */ void f(BaseMBSplashNativeView baseMBSplashNativeView) {
        if (!TextUtils.isEmpty(baseMBSplashNativeView.r.getIconUrl())) {
            com.mbridge.msdk.foundation.same.c.b.a(c.m().c()).a(baseMBSplashNativeView.r.getIconUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseMBSplashNativeView.2
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    Bitmap bitmapA;
                    if (bitmap != null) {
                        try {
                            if (bitmap.isRecycled()) {
                                return;
                            }
                            try {
                                if (BaseMBSplashNativeView.this.A == null || (bitmapA = ac.a(bitmap, 1, ai.a(c.m().c(), 40.0f))) == null || bitmapA.isRecycled()) {
                                    return;
                                }
                                BaseMBSplashNativeView.this.A.setImageBitmap(bitmapA);
                            } catch (Throwable th) {
                                ad.b("MBSplashNativeView", th.getMessage());
                                BaseMBSplashNativeView.this.A.setImageBitmap(bitmap);
                            }
                        } catch (Throwable th2) {
                            ad.b("MBSplashNativeView", th2.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str, String str2) {
                    BaseMBSplashNativeView.this.A.setVisibility(4);
                }
            });
        } else {
            baseMBSplashNativeView.A.setVisibility(4);
        }
    }

    static /* synthetic */ void b(BaseMBSplashNativeView baseMBSplashNativeView, boolean z) {
        if (baseMBSplashNativeView.q.getSplashSignalCommunicationImpl() == null || baseMBSplashNativeView.q.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        baseMBSplashNativeView.q.getSplashSignalCommunicationImpl().a().a(z ? 2 : 1, baseMBSplashNativeView.F);
    }
}
