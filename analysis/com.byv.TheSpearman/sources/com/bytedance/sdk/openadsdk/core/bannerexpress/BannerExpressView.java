package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class BannerExpressView extends PAGFrameLayout {
    protected final Context EYQ;
    protected String HX;
    protected PAGBannerAdWrapperListener IPb;
    protected AdSlot Kbd;
    protected UB Pm;
    protected boolean QQ;
    protected NativeExpressView Td;
    protected int VwS;
    protected NativeExpressView mZx;

    public BannerExpressView(Context context, UB ub, AdSlot adSlot) {
        super(context);
        this.HX = "banner_ad";
        this.EYQ = context;
        this.Pm = ub;
        this.Kbd = adSlot;
        EYQ();
        AdSlot adSlot2 = this.Kbd;
        if (adSlot2 != null) {
            EYQ(adSlot2.getExpressViewAcceptedWidth(), this.Kbd.getExpressViewAcceptedHeight());
        }
    }

    protected void EYQ() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.EYQ, this.Pm, this.Kbd, this.HX);
        this.mZx = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.IPb;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public void EYQ(UB ub, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.EYQ, ub, adSlot, this.HX);
        this.Td = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (BannerExpressView.this.IPb != null) {
                    BannerExpressView.this.IPb.onAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressView.this.EYQ(f, f2);
                if (BannerExpressView.this.Td != null) {
                    BannerExpressView.this.Td.setSoundMute(true);
                }
                BannerExpressView.this.Kbd();
            }
        });
        tr.EYQ((View) this.Td, 8);
        addView(this.Td, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.IPb = pAGBannerAdWrapperListener;
        NativeExpressView nativeExpressView = this.mZx;
        if (nativeExpressView != null) {
            nativeExpressView.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mZx() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.mZx
                public void EYQ() {
                    BannerExpressView.this.IPb.onAdClicked();
                }
            });
            this.mZx.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    if (BannerExpressView.this.IPb != null) {
                        BannerExpressView.this.IPb.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                    if (BannerExpressView.this.IPb != null) {
                        BannerExpressView.this.IPb.onRenderFail(BannerExpressView.this, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (BannerExpressView.this.mZx != null) {
                        BannerExpressView.this.mZx.setSoundMute(true);
                    }
                    BannerExpressView.this.EYQ(f, f2);
                    if (BannerExpressView.this.IPb != null) {
                        BannerExpressView.this.IPb.onRenderSuccess(BannerExpressView.this, f, f2);
                    }
                }
            });
        }
    }

    protected void EYQ(float f, float f2) {
        int iMZx = tr.mZx(this.EYQ, f);
        int iMZx2 = tr.mZx(this.EYQ, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iMZx, iMZx2);
        }
        layoutParams.width = iMZx;
        layoutParams.height = iMZx2;
        setLayoutParams(layoutParams);
    }

    public void mZx() {
        NativeExpressView nativeExpressView = this.mZx;
        if (nativeExpressView != null) {
            nativeExpressView.HX();
        }
    }

    public void Td() {
        if (this.mZx != null) {
            QQ.mZx().Pm(this.mZx.getClosedListenerKey());
            removeView(this.mZx);
            this.mZx.MxO();
            this.mZx = null;
        }
        if (this.Td != null) {
            QQ.mZx().Pm(this.Td.getClosedListenerKey());
            removeView(this.Td);
            this.Td.MxO();
            this.Td = null;
        }
        QQ.mZx().WU();
    }

    public NativeExpressView getCurView() {
        return this.mZx;
    }

    public NativeExpressView getNextView() {
        return this.Td;
    }

    public void setDuration(int i) {
        this.VwS = i;
    }

    private ObjectAnimator EYQ(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", 0.0f, -getWidth());
    }

    private ObjectAnimator mZx(NativeExpressView nativeExpressView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", getWidth(), 0.0f);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BannerExpressView.this.QQ = false;
                BannerExpressView.this.VwS();
            }
        });
        return objectAnimatorOfFloat;
    }

    public void Pm() {
        NativeExpressView nativeExpressView = this.Td;
        if (nativeExpressView != null) {
            nativeExpressView.HX();
        }
    }

    protected void Kbd() {
        try {
            if (this.QQ || this.Td == null) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(EYQ(this.mZx)).with(mZx(this.Td));
            animatorSet.setDuration(this.VwS).start();
            tr.EYQ((View) this.Td, 0);
            this.QQ = true;
        } catch (Throwable th) {
            pi.EYQ("BannerExpressView", th.getMessage());
        }
    }

    public boolean IPb() {
        return this.Td != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VwS() {
        NativeExpressView nativeExpressView = this.mZx;
        this.mZx = this.Td;
        this.Td = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.Td.MxO();
            this.Td = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mZx == null) {
            EYQ();
        }
        com.bytedance.sdk.openadsdk.utils.Td.EYQ(this, this.Pm);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
