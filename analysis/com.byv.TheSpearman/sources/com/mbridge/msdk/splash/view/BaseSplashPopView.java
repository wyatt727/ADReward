package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.click.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ac;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.d.d;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;
    private static final AtomicInteger h = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    protected String f3536a;
    protected String b;
    protected d c;
    protected Handler d;
    protected com.mbridge.msdk.click.a e;
    View.OnClickListener f;
    View.OnClickListener g;
    private int i;
    private CampaignEx j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private int r;
    private boolean s;
    private i t;
    private Runnable u;
    private Runnable v;

    static /* synthetic */ int i(BaseSplashPopView baseSplashPopView) {
        int i = baseSplashPopView.r;
        baseSplashPopView.r = i - 1;
        return i;
    }

    public BaseSplashPopView(Context context, a aVar, d dVar) {
        super(context);
        this.i = 1;
        this.r = -1;
        this.d = new Handler();
        this.s = false;
        this.t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i;
                int i2 = 0;
                if (BaseSplashPopView.this.i == 1) {
                    int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int iA = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                    int iA2 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + iA;
                    int iA3 = iA + ai.a(BaseSplashPopView.this.getContext(), 10.0f);
                    i2 = iA2;
                    i = iA3;
                } else {
                    i = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i2, i);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.q != null) {
                    if (BaseSplashPopView.this.r == 0) {
                        BaseSplashPopView.this.r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView.this.d.removeCallbacks(BaseSplashPopView.this.u);
                        if (BaseSplashPopView.this.c != null) {
                            BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.q.setText(String.valueOf(BaseSplashPopView.this.r));
                    BaseSplashPopView.this.d.postDelayed(BaseSplashPopView.this.u, 1000L);
                }
            }
        };
        this.v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.i);
                }
            }
        };
        this.f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.a(baseSplashPopView.j);
                }
            }
        };
        this.g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.r <= 0 && BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 4);
                }
            }
        };
        if (aVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.b = aVar.b();
        this.f3536a = aVar.a();
        this.i = aVar.c();
        this.j = aVar.d();
        this.c = dVar;
        a();
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.i = 1;
        this.r = -1;
        this.d = new Handler();
        this.s = false;
        this.t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i;
                int i2 = 0;
                if (BaseSplashPopView.this.i == 1) {
                    int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int iA = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                    int iA2 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + iA;
                    int iA3 = iA + ai.a(BaseSplashPopView.this.getContext(), 10.0f);
                    i2 = iA2;
                    i = iA3;
                } else {
                    i = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i2, i);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.q != null) {
                    if (BaseSplashPopView.this.r == 0) {
                        BaseSplashPopView.this.r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView.this.d.removeCallbacks(BaseSplashPopView.this.u);
                        if (BaseSplashPopView.this.c != null) {
                            BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.q.setText(String.valueOf(BaseSplashPopView.this.r));
                    BaseSplashPopView.this.d.postDelayed(BaseSplashPopView.this.u, 1000L);
                }
            }
        };
        this.v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.i);
                }
            }
        };
        this.f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.a(baseSplashPopView.j);
                }
            }
        };
        this.g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.r <= 0 && BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 4);
                }
            }
        };
        this.i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 1;
        this.r = -1;
        this.d = new Handler();
        this.s = false;
        this.t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i;
                int i2 = 0;
                if (BaseSplashPopView.this.i == 1) {
                    int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int iA = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                    int iA2 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + iA;
                    int iA3 = iA + ai.a(BaseSplashPopView.this.getContext(), 10.0f);
                    i2 = iA2;
                    i = iA3;
                } else {
                    i = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i2, i);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.q != null) {
                    if (BaseSplashPopView.this.r == 0) {
                        BaseSplashPopView.this.r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView.this.d.removeCallbacks(BaseSplashPopView.this.u);
                        if (BaseSplashPopView.this.c != null) {
                            BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.q.setText(String.valueOf(BaseSplashPopView.this.r));
                    BaseSplashPopView.this.d.postDelayed(BaseSplashPopView.this.u, 1000L);
                }
            }
        };
        this.v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.i);
                }
            }
        };
        this.f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.a(baseSplashPopView.j);
                }
            }
        };
        this.g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.r <= 0 && BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 4);
                }
            }
        };
        this.i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 1;
        this.r = -1;
        this.d = new Handler();
        this.s = false;
        this.t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i2;
                int i22 = 0;
                if (BaseSplashPopView.this.i == 1) {
                    int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int iA = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                    int iA2 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + iA;
                    int iA3 = iA + ai.a(BaseSplashPopView.this.getContext(), 10.0f);
                    i22 = iA2;
                    i2 = iA3;
                } else {
                    i2 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i22, i2);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.q != null) {
                    if (BaseSplashPopView.this.r == 0) {
                        BaseSplashPopView.this.r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView.this.d.removeCallbacks(BaseSplashPopView.this.u);
                        if (BaseSplashPopView.this.c != null) {
                            BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.q.setText(String.valueOf(BaseSplashPopView.this.r));
                    BaseSplashPopView.this.d.postDelayed(BaseSplashPopView.this.u, 1000L);
                }
            }
        };
        this.v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.i);
                }
            }
        };
        this.f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.a(baseSplashPopView.j);
                }
            }
        };
        this.g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.r <= 0 && BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 4);
                }
            }
        };
        this.i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = 1;
        this.r = -1;
        this.d = new Handler();
        this.s = false;
        this.t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i22;
                int i222 = 0;
                if (BaseSplashPopView.this.i == 1) {
                    int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int iA = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                    int iA2 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + iA;
                    int iA3 = iA + ai.a(BaseSplashPopView.this.getContext(), 10.0f);
                    i222 = iA2;
                    i22 = iA3;
                } else {
                    i22 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i222, i22);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.q != null) {
                    if (BaseSplashPopView.this.r == 0) {
                        BaseSplashPopView.this.r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView.this.d.removeCallbacks(BaseSplashPopView.this.u);
                        if (BaseSplashPopView.this.c != null) {
                            BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.q.setText(String.valueOf(BaseSplashPopView.this.r));
                    BaseSplashPopView.this.d.postDelayed(BaseSplashPopView.this.u, 1000L);
                }
            }
        };
        this.v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.i);
                }
            }
        };
        this.f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.c != null) {
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.a(baseSplashPopView.j);
                }
            }
        };
        this.g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseSplashPopView.this.r <= 0 && BaseSplashPopView.this.c != null) {
                    BaseSplashPopView.this.c.a(new MBridgeIds(BaseSplashPopView.this.f3536a, BaseSplashPopView.this.b), 4);
                }
            }
        };
        this.i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c != null) {
            postDelayed(this.v, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void setPopViewType(a aVar, d dVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.b = aVar.b();
        this.f3536a = aVar.a();
        this.i = aVar.c();
        this.j = aVar.d();
        this.c = dVar;
        a();
    }

    public void startCountDown() {
        this.d.removeCallbacks(this.u);
        CampaignEx campaignEx = this.j;
        if (campaignEx == null || this.i != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime > 0) {
            this.r = flbSkipTime;
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(String.valueOf(flbSkipTime));
                this.d.postDelayed(this.u, 1000L);
                return;
            }
            return;
        }
        g();
    }

    public void reStartCountDown() {
        if (this.s) {
            this.s = false;
            int i = this.r;
            if (i == -1 || i == 0) {
                g();
                return;
            }
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(String.valueOf(i));
                this.d.postDelayed(this.u, 1000L);
            }
        }
    }

    public void pauseCountDown() {
        this.s = true;
        if (this.q != null) {
            this.d.removeCallbacks(this.u);
        }
    }

    public void release() {
        try {
            this.d.removeCallbacks(this.v);
            this.d.removeCallbacks(this.u);
            this.u = null;
            detachAllViewsFromParent();
            this.j = null;
            this.c = null;
        } catch (Exception e) {
            ad.b("MBSplashPopView", e.getMessage());
        }
    }

    private void a() {
        if (this.j == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i = this.i;
        if (i == 1) {
            b();
            return;
        }
        if (i == 2) {
            c();
        } else if (i == 3) {
            d();
        } else {
            if (i != 4) {
                return;
            }
            e();
        }
    }

    private void b() {
        ImageView imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 80.0f), ai.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = ai.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", c.m().g()));
        this.k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(getContext(), 60.0f), ai.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = ai.a(getContext(), 7.0f);
        layoutParams2.leftMargin = ai.a(getContext(), 10.0f);
        this.k.setId(generateViewId());
        this.k.setLayoutParams(layoutParams2);
        this.k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.j;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.j.getIconUrl(), true);
        }
        this.q = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = ai.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = ai.a(getContext(), 70.0f);
        this.q.setId(generateViewId());
        this.q.setTextSize(10.0f);
        this.q.setTextColor(-1);
        this.q.setGravity(17);
        this.q.setMinWidth(ai.a(getContext(), 16.0f));
        this.q.setMaxHeight(ai.a(getContext(), 16.0f));
        this.q.setLayoutParams(layoutParams3);
        this.q.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", c.m().g()));
        addView(imageView);
        addView(this.q);
        addView(this.k);
        CampaignEx campaignEx2 = this.j;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        setOnClickListener(this.f);
        this.q.setOnClickListener(this.g);
    }

    private void c() {
        int iA = ai.a(getContext(), 4.0f);
        this.k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 28.0f), ai.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.k.setId(generateViewId());
        this.k.setLayoutParams(layoutParams);
        this.k.setPadding(iA, iA, iA, iA);
        this.k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.j.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.o = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.k.getId());
        layoutParams2.addRule(6, this.k.getId());
        layoutParams2.addRule(8, this.k.getId());
        layoutParams2.leftMargin = ai.a(getContext(), 4.0f);
        layoutParams2.rightMargin = ai.a(getContext(), 40.0f);
        this.o.setLayoutParams(layoutParams2);
        this.o.setGravity(16);
        this.o.setTextSize(10.0f);
        this.o.setSelected(true);
        this.o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.o.setMarqueeRepeatLimit(-1);
        this.o.setSingleLine(true);
        this.o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.o.setText(this.j.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", c.m().g()));
        addView(this.k);
        addView(this.o);
        f();
        setOnClickListener(this.f);
    }

    private void d() {
        int iA = ai.a(getContext(), 4.0f);
        this.k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 50.0f), ai.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.k.setId(generateViewId());
        this.k.setLayoutParams(layoutParams);
        this.k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.k.setPadding(iA, iA, iA, iA);
        a(this.j.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.k.getId());
        layoutParams2.addRule(6, this.k.getId());
        layoutParams2.addRule(8, this.k.getId());
        layoutParams2.leftMargin = ai.a(getContext(), 8.0f);
        layoutParams2.rightMargin = ai.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.o = textView;
        textView.setId(generateViewId());
        this.o.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.o.setGravity(16);
        this.o.setTextSize(12.0f);
        this.o.setSelected(true);
        this.o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.o.setMarqueeRepeatLimit(-1);
        this.o.setSingleLine(true);
        this.o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.o.setText(this.j.getAppName());
        TextView textView2 = new TextView(getContext());
        this.p = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.o.getId());
        layoutParams3.addRule(3, this.o.getId());
        layoutParams3.topMargin = ai.a(getContext(), 4.0f);
        layoutParams3.rightMargin = ai.a(getContext(), 36.0f);
        this.p.setGravity(16);
        this.p.setLayoutParams(layoutParams3);
        this.p.setTextSize(8.0f);
        this.p.setTextColor(-10066330);
        this.p.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.p.setMarqueeRepeatLimit(-1);
        this.p.setSelected(true);
        this.p.setSingleLine(true);
        this.p.setText(this.j.getAppDesc());
        relativeLayout.addView(this.o);
        relativeLayout.addView(this.p);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", c.m().g()));
        addView(this.k);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f);
    }

    private void e() {
        this.m = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ai.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.m.setScaleType(ImageView.ScaleType.FIT_XY);
        this.m.setId(generateViewId());
        this.m.setLayoutParams(layoutParams);
        a(this.j.getImageUrl());
        this.l = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, ai.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.l.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.l.setId(generateViewId());
        this.l.setLayoutParams(layoutParams2);
        b(this.j.getImageUrl());
        this.k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ai.a(getContext(), 50.0f), ai.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.m.getId());
        layoutParams3.topMargin = 20;
        this.k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.k.setId(generateViewId());
        this.k.setLayoutParams(layoutParams3);
        a(this.j.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.k.getId());
        layoutParams4.addRule(6, this.k.getId());
        layoutParams4.addRule(8, this.k.getId());
        layoutParams4.leftMargin = ai.a(getContext(), 8.0f);
        layoutParams4.rightMargin = ai.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.o = textView;
        textView.setId(generateViewId());
        this.o.setGravity(16);
        this.o.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.o.setTextSize(12.0f);
        this.o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.o.setMarqueeRepeatLimit(-1);
        this.o.setSelected(true);
        this.o.setSingleLine(true);
        this.o.setText(this.j.getAppName());
        TextView textView2 = new TextView(getContext());
        this.p = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.o.getId());
        layoutParams5.addRule(3, this.o.getId());
        layoutParams5.topMargin = ai.a(getContext(), 4.0f);
        layoutParams5.rightMargin = ai.a(getContext(), 36.0f);
        this.p.setGravity(16);
        this.p.setLayoutParams(layoutParams5);
        this.p.setTextSize(8.0f);
        this.p.setTextColor(-10066330);
        this.p.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.p.setMarqueeRepeatLimit(-1);
        this.p.setSelected(true);
        this.p.setSingleLine(true);
        this.p.setText(this.j.getAppDesc());
        relativeLayout.addView(this.o);
        relativeLayout.addView(this.p);
        addView(this.m);
        addView(this.l);
        addView(this.k);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f);
    }

    private void f() {
        String language;
        int identifier;
        this.n = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 32.0f), ai.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.k.getId());
        this.n.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            ad.b("MBSplashPopView", th.getMessage());
            language = "ZH";
        }
        if (language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) {
            identifier = getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", c.m().g());
        } else {
            identifier = getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", c.m().g());
        }
        this.n.setBackgroundResource(identifier);
        addView(this.n);
    }

    private void a(String str, final boolean z) {
        b.a(c.m().c()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.2
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                Bitmap bitmapA;
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (!z) {
                        bitmapA = ac.a(bitmap, 1, 16);
                    } else if (bitmap == null || bitmap.isRecycled()) {
                        bitmapA = null;
                    } else {
                        int width = bitmap.getWidth();
                        bitmapA = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_4444);
                        Canvas canvas = new Canvas(bitmapA);
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        canvas.drawCircle(width / 2, width / 2, width / 2, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    }
                    ImageView imageView = BaseSplashPopView.this.k;
                    if (bitmapA != null) {
                        bitmap = bitmapA;
                    }
                    imageView.setImageBitmap(bitmap);
                } catch (Throwable th) {
                    ad.b("MBSplashPopView", th.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
                ad.b("MBSplashPopView", str2);
            }
        });
    }

    private void a(String str) {
        b.a(c.m().c()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.3
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    BaseSplashPopView.this.m.setImageBitmap(o.a(bitmap, 10));
                } catch (Throwable th) {
                    ad.b("MBSplashPopView", th.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
                ad.b("MBSplashPopView", str2);
            }
        });
    }

    private void b(String str) {
        b.a(c.m().c()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.4
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    BaseSplashPopView.this.l.setImageBitmap(ac.a(bitmap, 1, 16));
                } catch (Throwable th) {
                    ad.b("MBSplashPopView", th.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
                ad.b("MBSplashPopView", str2);
            }
        });
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = h;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    protected void a(CampaignEx campaignEx) {
        com.mbridge.msdk.splash.e.a.b(campaignEx, this.b);
    }

    protected final void b(CampaignEx campaignEx) {
        if (this.e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(c.m().c(), this.b);
            this.e = aVar;
            aVar.a(this.t);
        }
        campaignEx.setCampaignUnitId(this.b);
        this.e.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.e.a.a(c.m().c(), campaignEx);
        }
        d dVar = this.c;
        if (dVar != null) {
            dVar.b(new MBridgeIds(this.f3536a, this.b));
            this.c.a(new MBridgeIds(this.f3536a, this.b), 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.q;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = ai.a(getContext(), 16.0f);
            layoutParams.height = ai.a(getContext(), 16.0f);
            this.q.setLayoutParams(layoutParams);
            this.q.setText("");
            this.q.setSelected(true);
            this.q.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", c.m().g()));
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f3545a;
        private String b;
        private int c;
        private CampaignEx d;

        public a(String str, String str2, int i, CampaignEx campaignEx) {
            this.f3545a = str;
            this.b = str2;
            this.c = i;
            this.d = campaignEx;
        }

        public final String a() {
            return this.f3545a;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final CampaignEx d() {
            return this.d;
        }
    }
}
