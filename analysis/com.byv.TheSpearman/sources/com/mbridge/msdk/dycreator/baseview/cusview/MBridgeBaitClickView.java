package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f2596a;
    private MBridgeDyImageView b;
    private TextView c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private Animation i;
    private Animation j;
    private Animation k;
    private Animation l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
    }

    public void init(int i) {
        this.g = i;
        init();
    }

    public void init(int i, int i2) {
        this.h = i;
        this.g = i2;
        init();
    }

    public void init(int i, int i2, String str, String str2, String str3) {
        this.h = i;
        this.g = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        init();
    }

    public void init() {
        try {
            setBackgroundColor(this.h);
            try {
                this.f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
            } catch (Throwable th) {
                ad.b("MBridgeAnimationClickView", th.getMessage());
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = ai.a(getContext(), 55.0f);
            int iA2 = ai.a(getContext(), 33.0f);
            this.b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.b.setLayoutParams(layoutParams);
            final int iA3 = v.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.e)) {
                this.b.setImageResource(iA3);
            } else {
                b.a(c.m().c()).a(this.d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.b.setImageBitmap(bitmap);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.b.setImageResource(iA3);
                    }
                });
            }
            int iA4 = ai.a(getContext(), 108.0f);
            int iA5 = ai.a(getContext(), 35.0f);
            int iA6 = ai.a(getContext(), 43.0f);
            this.f2596a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f2596a.setLayoutParams(layoutParams2);
            final int iA7 = v.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.d)) {
                this.f2596a.setImageResource(iA7);
            } else {
                b.a(c.m().c()).a(this.d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f2596a.setImageBitmap(bitmap);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f2596a.setImageResource(iA7);
                    }
                });
            }
            relativeLayout.addView(this.b);
            relativeLayout.addView(this.f2596a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.c = new TextView(getContext());
            this.c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.c.setText(this.f);
            this.c.setTextColor(-1);
            this.c.setGravity(14);
            linearLayout.addView(this.c);
            addView(linearLayout);
        } catch (Throwable th2) {
            ad.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public void startAnimation() {
        int i = this.g;
        if (i == 2) {
            this.b.setVisibility(4);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.i = scaleAnimation;
            scaleAnimation.setDuration(500L);
            this.i.setRepeatCount(-1);
            this.i.setRepeatMode(2);
            MBridgeDyImageView mBridgeDyImageView = this.f2596a;
            if (mBridgeDyImageView != null) {
                mBridgeDyImageView.startAnimation(this.i);
                return;
            }
            return;
        }
        if (i == 3) {
            MBridgeDyImageView mBridgeDyImageView2 = this.b;
            if (mBridgeDyImageView2 != null) {
                mBridgeDyImageView2.setVisibility(4);
            }
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.i = scaleAnimation2;
            scaleAnimation2.setDuration(500L);
            this.i.setRepeatCount(1);
            this.i.setRepeatMode(2);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.j = scaleAnimation3;
            scaleAnimation3.setDuration(1000L);
            this.j.setRepeatCount(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            this.k = alphaAnimation;
            alphaAnimation.setDuration(1000L);
            this.k.setRepeatCount(0);
            final AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(this.j);
            animationSet.addAnimation(this.k);
            this.j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    if (MBridgeBaitClickView.this.b != null) {
                        MBridgeBaitClickView.this.b.setVisibility(0);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (MBridgeBaitClickView.this.b != null) {
                        MBridgeBaitClickView.this.b.setVisibility(4);
                    }
                }
            });
            this.i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.b != null) {
                                MBridgeBaitClickView.this.b.startAnimation(animationSet);
                            }
                        }
                    }, 550L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f2596a != null) {
                                MBridgeBaitClickView.this.f2596a.startAnimation(MBridgeBaitClickView.this.i);
                            }
                        }
                    }, 1000L);
                }
            });
            MBridgeDyImageView mBridgeDyImageView3 = this.f2596a;
            if (mBridgeDyImageView3 != null) {
                mBridgeDyImageView3.startAnimation(this.i);
                return;
            }
            return;
        }
        if (i == 4) {
            this.b.setVisibility(4);
            ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.i = scaleAnimation4;
            scaleAnimation4.setDuration(200L);
            this.i.setRepeatCount(1);
            this.i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f2596a != null) {
                                MBridgeBaitClickView.this.f2596a.startAnimation(MBridgeBaitClickView.this.i);
                            }
                        }
                    }, 1000L);
                }
            });
            MBridgeDyImageView mBridgeDyImageView4 = this.f2596a;
            if (mBridgeDyImageView4 != null) {
                mBridgeDyImageView4.startAnimation(this.i);
                return;
            }
            return;
        }
        if (i != 5) {
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.i = scaleAnimation5;
            scaleAnimation5.setDuration(200L);
            this.i.setRepeatCount(-1);
            this.i.setRepeatMode(2);
            MBridgeDyImageView mBridgeDyImageView5 = this.f2596a;
            if (mBridgeDyImageView5 != null) {
                mBridgeDyImageView5.startAnimation(this.i);
            }
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
            this.j = scaleAnimation6;
            scaleAnimation6.setDuration(400L);
            this.j.setRepeatCount(-1);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.3f);
            this.k = alphaAnimation2;
            alphaAnimation2.setDuration(400L);
            this.k.setRepeatCount(-1);
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(this.j);
            animationSet2.addAnimation(this.k);
            MBridgeDyImageView mBridgeDyImageView6 = this.b;
            if (mBridgeDyImageView6 != null) {
                mBridgeDyImageView6.startAnimation(animationSet2);
                return;
            }
            return;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.l = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.l.setRepeatMode(2);
        this.l.setRepeatCount(-1);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation7;
        scaleAnimation7.setDuration(600L);
        this.j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
        this.k = alphaAnimation3;
        alphaAnimation3.setDuration(600L);
        this.k.setRepeatCount(-1);
        AnimationSet animationSet3 = new AnimationSet(true);
        animationSet3.addAnimation(this.j);
        animationSet3.addAnimation(this.k);
        MBridgeDyImageView mBridgeDyImageView7 = this.f2596a;
        if (mBridgeDyImageView7 != null) {
            mBridgeDyImageView7.startAnimation(this.l);
        }
        MBridgeDyImageView mBridgeDyImageView8 = this.b;
        if (mBridgeDyImageView8 != null) {
            mBridgeDyImageView8.startAnimation(animationSet3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }
}
