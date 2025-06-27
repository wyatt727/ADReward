package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBGradientAndShadowTextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: classes4.dex */
public class MBAcquireRewardPopView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f2629a;
    private AcquireRewardPopViewParameters b;
    private AnimationSet c;
    private float d;
    private float e;
    private float f;
    private float g;
    private int h;
    private boolean i;
    private boolean j;
    private TextView k;
    private final View.OnClickListener l;
    private Runnable m;
    private Runnable n;
    private View.OnTouchListener o;
    private final View.OnClickListener p;
    private final View.OnClickListener q;

    static /* synthetic */ int i(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i = mBAcquireRewardPopView.h;
        mBAcquireRewardPopView.h = i - 1;
        return i;
    }

    public MBAcquireRewardPopView(Context context) {
        super(context);
        this.f2629a = "MBAcquireRewardPopView";
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                View viewE = zContains ? MBAcquireRewardPopView.e(mBAcquireRewardPopView2) : MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, viewE);
                }
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.n, 2000L);
            }
        };
        this.m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.h <= 0) {
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.m, 1000L);
            }
        };
        this.n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.d = motionEvent.getX();
                    MBAcquireRewardPopView.this.e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f = motionEvent.getX();
                        MBAcquireRewardPopView.this.g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f <= MBAcquireRewardPopView.this.d || Math.abs(MBAcquireRewardPopView.this.f - MBAcquireRewardPopView.this.d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.g - MBAcquireRewardPopView.this.e) >= 100.0f) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.d, MBAcquireRewardPopView.this.e);
                } else {
                    if (MBAcquireRewardPopView.this.j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                    MBAcquireRewardPopView.this.j = true;
                    View viewE = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, viewE);
                    }
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.n, 2000L);
                }
                return false;
            }
        };
        this.p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.d, MBAcquireRewardPopView.this.e);
                }
            }
        };
        this.q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2629a = "MBAcquireRewardPopView";
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                View viewE = zContains ? MBAcquireRewardPopView.e(mBAcquireRewardPopView2) : MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, viewE);
                }
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.n, 2000L);
            }
        };
        this.m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.h <= 0) {
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.m, 1000L);
            }
        };
        this.n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.d = motionEvent.getX();
                    MBAcquireRewardPopView.this.e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f = motionEvent.getX();
                        MBAcquireRewardPopView.this.g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f <= MBAcquireRewardPopView.this.d || Math.abs(MBAcquireRewardPopView.this.f - MBAcquireRewardPopView.this.d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.g - MBAcquireRewardPopView.this.e) >= 100.0f) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.d, MBAcquireRewardPopView.this.e);
                } else {
                    if (MBAcquireRewardPopView.this.j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                    MBAcquireRewardPopView.this.j = true;
                    View viewE = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, viewE);
                    }
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.n, 2000L);
                }
                return false;
            }
        };
        this.p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.d, MBAcquireRewardPopView.this.e);
                }
            }
        };
        this.q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2629a = "MBAcquireRewardPopView";
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                View viewE = zContains ? MBAcquireRewardPopView.e(mBAcquireRewardPopView2) : MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, viewE);
                }
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.n, 2000L);
            }
        };
        this.m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.h <= 0) {
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.m, 1000L);
            }
        };
        this.n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.d = motionEvent.getX();
                    MBAcquireRewardPopView.this.e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f = motionEvent.getX();
                        MBAcquireRewardPopView.this.g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f <= MBAcquireRewardPopView.this.d || Math.abs(MBAcquireRewardPopView.this.f - MBAcquireRewardPopView.this.d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.g - MBAcquireRewardPopView.this.e) >= 100.0f) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.d, MBAcquireRewardPopView.this.e);
                } else {
                    if (MBAcquireRewardPopView.this.j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                    MBAcquireRewardPopView.this.j = true;
                    View viewE = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, viewE);
                    }
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.n, 2000L);
                }
                return false;
            }
        };
        this.p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.d, MBAcquireRewardPopView.this.e);
                }
            }
        };
        this.q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2629a = "MBAcquireRewardPopView";
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                View viewE = zContains ? MBAcquireRewardPopView.e(mBAcquireRewardPopView2) : MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, viewE);
                }
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.n, 2000L);
            }
        };
        this.m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.h <= 0) {
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.m, 1000L);
            }
        };
        this.n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.d = motionEvent.getX();
                    MBAcquireRewardPopView.this.e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f = motionEvent.getX();
                        MBAcquireRewardPopView.this.g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f <= MBAcquireRewardPopView.this.d || Math.abs(MBAcquireRewardPopView.this.f - MBAcquireRewardPopView.this.d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.g - MBAcquireRewardPopView.this.e) >= 100.0f) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.d, MBAcquireRewardPopView.this.e);
                } else {
                    if (MBAcquireRewardPopView.this.j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                    MBAcquireRewardPopView.this.j = true;
                    View viewE = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, viewE);
                    }
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.n, 2000L);
                }
                return false;
            }
        };
        this.p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.d, MBAcquireRewardPopView.this.e);
                }
            }
        };
        this.q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public void init(AcquireRewardPopViewParameters acquireRewardPopViewParameters) {
        if (acquireRewardPopViewParameters == null) {
            ad.b("MBAcquireRewardPopView", "Must generate parameters.");
            return;
        }
        this.b = acquireRewardPopViewParameters;
        View view = null;
        if (acquireRewardPopViewParameters.viewType == 1) {
            ArrayList<String> arrayList = new ArrayList<>();
            AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.b;
            if (acquireRewardPopViewParameters2 != null) {
                if (acquireRewardPopViewParameters2.rightAnswerList != null) {
                    arrayList.addAll(this.b.rightAnswerList);
                }
                if (this.b.wrongAnswerList != null) {
                    int iNextInt = new Random().nextInt(this.b.wrongAnswerList.size());
                    if (iNextInt > this.b.wrongAnswerList.size() - 1) {
                        iNextInt = 0;
                    }
                    arrayList.add(this.b.wrongAnswerList.get(iNextInt));
                }
            }
            View viewA = a(arrayList);
            view = viewA;
            if (this.b.canClickMaskArea) {
                setOnClickListener(this.p);
                view = viewA;
            }
        }
        View view2 = view;
        if (this.b.viewType == 2) {
            int iA = ai.a(getContext(), 290.0f);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
            gradientAndShadowParameters.gradientStartColor = this.b.successTitleGradientStartColor;
            gradientAndShadowParameters.gradientEndColor = this.b.successTitleGradientEndColor;
            gradientAndShadowParameters.shadowColor = this.b.successTitleShadowColor;
            gradientAndShadowParameters.textSize = 30;
            MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, 0, 0, ai.a(getContext(), 12.0f));
            layoutParams2.gravity = 1;
            mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
            mBGradientAndShadowTextView.setText(String.format(" %s ", this.b.slideTitle));
            mBGradientAndShadowTextView.setGravity(17);
            linearLayout.addView(mBGradientAndShadowTextView);
            GradientDrawable gradientDrawableA = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
            this.k = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.setMargins(0, 0, 0, ai.a(getContext(), 25.0f));
            this.k.setLayoutParams(layoutParams3);
            this.k.setTextSize(12.0f);
            this.k.setGravity(17);
            this.k.setTextColor(this.b.successTipTextColor);
            this.k.setText(String.format(this.b.slideTip, Integer.valueOf(this.b.reduceTime)));
            int iA2 = ai.a(getContext(), 6.0f);
            int iA3 = ai.a(getContext(), 32.0f);
            this.k.setPadding(iA3, iA2, iA3, iA2);
            this.k.setBackground(gradientDrawableA);
            linearLayout.addView(this.k);
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            imageView.setLayoutParams(layoutParams4);
            imageView.setBackgroundResource(getResources().getIdentifier("mbridge_slide_rightarrow", "drawable", c.m().g()));
            linearLayout.addView(imageView);
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView2.setBackgroundResource(getResources().getIdentifier("mbridge_slide_hand", "drawable", c.m().g()));
            linearLayout.addView(imageView2);
            imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, view3);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                    if (MBAcquireRewardPopView.this.c != null) {
                        MBAcquireRewardPopView.this.c.cancel();
                    }
                }
            });
            linearLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.2
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                    MBAcquireRewardPopView.this.setLongClickable(true);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.setOnTouchListener(mBAcquireRewardPopView.o);
                }
            });
            view2 = linearLayout;
        }
        if (view2 != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.b.containerBackgroundColor);
            addView(view2);
            if (this.b.autoDismissTime > 0) {
                this.h = this.b.autoDismissTime;
                post(this.m);
                this.i = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.m);
    }

    private View a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        int i = this.b.viewBackLayerTopColor;
        int i2 = this.b.viewBackLayerBottomColor;
        int i3 = this.b.viewForegroundTopColor;
        int i4 = this.b.viewForegroundBottomColor;
        GradientDrawable gradientDrawableA = a(new int[]{i, i2}, GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawableA.setCornerRadius(ai.a(getContext(), 12.0f));
        GradientDrawable gradientDrawableA2 = a(new int[]{i3, i4}, GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawableA2.setCornerRadius(ai.a(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawableA, gradientDrawableA2});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        linearLayout.setBackground(layerDrawable);
        ImageView imageView = new ImageView(getContext());
        int iA = ai.a(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA, iA);
        layoutParams2.gravity = GravityCompat.END;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("mbridge_reward_popview_close", "drawable", c.m().g()));
        imageView.setOnClickListener(this.q);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int iA2 = ai.a(getContext(), 18.0f);
        layoutParams3.setMargins(iA2, 5, iA2, ai.a(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.b.title);
        textView.setTextColor(this.b.titleTextColor);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList != null && arrayList.size() > 1) {
            int iA3 = ai.a(getContext(), 8.0f);
            int iA4 = ai.a(getContext(), 24.0f);
            int iA5 = ai.a(getContext(), 30.0f);
            int iA6 = ai.a(getContext(), 12.0f);
            int iA7 = ai.a(getContext(), 40.0f);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                boolean zContains = this.b.rightAnswerList.contains(arrayList.get(i5));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(iA5, iA6, iA5, 0);
                textView2.setPadding(iA4, iA3, iA4, iA3);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i5));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i5));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.b;
                textView2.setTextColor(zContains ? acquireRewardPopViewParameters.buttonTextLightColor : acquireRewardPopViewParameters.buttonTextDarkColor);
                AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.b;
                int i6 = zContains ? acquireRewardPopViewParameters2.buttonBackgroundLightColor : acquireRewardPopViewParameters2.buttonBackgroundDarkColor;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i6);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(iA7);
                textView2.setBackground(gradientDrawable);
                textView2.setOnClickListener(this.l);
                linearLayout.addView(textView2);
            }
        }
        this.k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int iA8 = ai.a(getContext(), 16.0f);
        int iA9 = ai.a(getContext(), 18.0f);
        layoutParams5.setMargins(iA9, iA8, iA9, iA8);
        layoutParams5.gravity = 1;
        this.k.setLayoutParams(layoutParams5);
        this.k.setText(String.format(this.b.tips, Integer.valueOf(this.b.reduceTime)));
        this.k.setTextColor(this.b.tipTextColor);
        this.k.setGravity(17);
        this.k.setTextSize(12.0f);
        linearLayout.addView(this.k);
        return linearLayout;
    }

    private GradientDrawable a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    public void onTimeLessThanReduce(int i) {
        this.b.reduceTime = i;
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(String.format(this.b.tips, Integer.valueOf(this.b.reduceTime)));
        }
    }

    public void onResume() {
        if (!this.i || this.h <= 0) {
            return;
        }
        post(this.m);
    }

    public void onPause() {
        if (!this.i || this.h <= 0) {
            return;
        }
        removeCallbacks(this.m);
    }

    public void onStop() {
        if (!this.i || this.h <= 0) {
            return;
        }
        removeCallbacks(this.m);
    }

    static /* synthetic */ void a(MBAcquireRewardPopView mBAcquireRewardPopView, final View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        mBAcquireRewardPopView.c = animationSet;
        animationSet.addAnimation(translateAnimation);
        mBAcquireRewardPopView.c.addAnimation(alphaAnimation);
        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(MBAcquireRewardPopView.this.c);
            }
        });
        mBAcquireRewardPopView.c.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(alphaAnimation2);
            }
        });
        view.startAnimation(mBAcquireRewardPopView.c);
    }

    static /* synthetic */ View e(MBAcquireRewardPopView mBAcquireRewardPopView) {
        String str;
        LinearLayout linearLayout = new LinearLayout(mBAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        gradientAndShadowParameters.gradientStartColor = mBAcquireRewardPopView.b.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = mBAcquireRewardPopView.b.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = mBAcquireRewardPopView.b.successTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(mBAcquireRewardPopView.getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, ai.a(mBAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        if (mBAcquireRewardPopView.b.viewType == 1) {
            str = mBAcquireRewardPopView.b.successTitle;
        } else {
            str = mBAcquireRewardPopView.b.viewType == 2 ? mBAcquireRewardPopView.b.slideSuccessTitle : "";
        }
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setText(String.format(" %s ", str));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = mBAcquireRewardPopView.a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(mBAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(mBAcquireRewardPopView.b.successTipTextColor);
        textView.setText(String.format(mBAcquireRewardPopView.b.successTip, Integer.valueOf(mBAcquireRewardPopView.b.reduceTime)));
        int iA = ai.a(mBAcquireRewardPopView.getContext(), 6.0f);
        int iA2 = ai.a(mBAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(iA2, iA, iA2, iA);
        textView.setBackground(gradientDrawableA);
        linearLayout.addView(textView);
        return linearLayout;
    }

    static /* synthetic */ View f(MBAcquireRewardPopView mBAcquireRewardPopView) {
        LinearLayout linearLayout = new LinearLayout(mBAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        gradientAndShadowParameters.gradientStartColor = mBAcquireRewardPopView.b.failTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = mBAcquireRewardPopView.b.failTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = mBAcquireRewardPopView.b.failTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(mBAcquireRewardPopView.getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, ai.a(mBAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(String.format(" %s ", mBAcquireRewardPopView.b.failTitle));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableA = mBAcquireRewardPopView.a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(mBAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(mBAcquireRewardPopView.b.failTipTextColor);
        textView.setText(String.format(mBAcquireRewardPopView.b.failTip, ""));
        int iA = ai.a(mBAcquireRewardPopView.getContext(), 6.0f);
        int iA2 = ai.a(mBAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(iA2, iA, iA2, iA);
        textView.setBackground(gradientDrawableA);
        linearLayout.addView(textView);
        return linearLayout;
    }

    static /* synthetic */ void a(MBAcquireRewardPopView mBAcquireRewardPopView, View view, View view2) {
        mBAcquireRewardPopView.removeView(view);
        mBAcquireRewardPopView.addView(view2);
    }
}
