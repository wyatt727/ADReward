package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTTitleNewStyleManager.java */
/* loaded from: classes2.dex */
public class tp {
    TTAdDislikeDialog EYQ;
    private TextView HX;
    private final UB IPb;
    private final RelativeLayout Kbd;
    private ImageView QQ;
    private final Context VwS;
    TTAdDislikeToast mZx;
    private PAGProgressBar tp;
    private boolean tsL;
    final AtomicBoolean Td = new AtomicBoolean(false);
    final AtomicBoolean Pm = new AtomicBoolean(false);
    private final int MxO = tr.mZx(hu.EYQ(), 44.0f);

    public tp(Context context, RelativeLayout relativeLayout, UB ub) {
        this.VwS = context;
        this.Kbd = relativeLayout;
        this.IPb = ub;
        Kbd();
    }

    private void Kbd() {
        this.QQ = (ImageView) this.Kbd.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Dd);
        this.HX = (TextView) this.Kbd.findViewById(com.bytedance.sdk.openadsdk.utils.tp.OnO);
        ImageView imageView = (ImageView) this.Kbd.findViewById(com.bytedance.sdk.openadsdk.utils.tp.eFB);
        this.tp = (PAGProgressBar) this.Kbd.findViewById(com.bytedance.sdk.openadsdk.utils.tp.Hnh);
        UB ub = this.IPb;
        if (ub != null) {
            this.HX.setText(TextUtils.isEmpty(ub.TQF()) ? zF.EYQ(this.VwS, "tt_web_title_default") : this.IPb.TQF());
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tp.this.Pm();
            }
        });
    }

    public void EYQ(int i) {
        if (i == 100) {
            this.tp.setVisibility(8);
        } else {
            this.tp.setVisibility(0);
            this.tp.setProgress(i);
        }
    }

    public void EYQ() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Kbd.getLayoutParams();
            if (this.tsL) {
                return;
            }
            int i = marginLayoutParams.topMargin;
            int i2 = this.MxO;
            if (i == (-i2)) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-i2, 0);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.tp.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        tp.this.Kbd.setLayoutParams(marginLayoutParams);
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.tp.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        tp.this.tsL = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        tp.this.tsL = false;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void mZx() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Kbd.getLayoutParams();
            if (this.tsL || marginLayoutParams.topMargin != 0) {
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -this.MxO);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.tp.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    tp.this.Kbd.setLayoutParams(marginLayoutParams);
                }
            });
            valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.tp.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    tp.this.tsL = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    tp.this.tsL = false;
                }
            });
            valueAnimatorOfInt.start();
        } catch (Throwable unused) {
        }
    }

    public ImageView Td() {
        return this.QQ;
    }

    protected void Pm() {
        if (this.Pm.get()) {
            VwS();
            return;
        }
        if (this.EYQ == null) {
            IPb();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.EYQ;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.EYQ();
        }
    }

    private void IPb() {
        try {
            if (this.EYQ == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.VwS, this.IPb);
                this.EYQ = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.EYQ() { // from class: com.bytedance.sdk.openadsdk.common.tp.6
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void EYQ(View view) {
                        tp.this.Td.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void mZx(View view) {
                        tp.this.Td.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                    public void EYQ(int i, FilterWord filterWord) {
                        if (tp.this.Pm.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        tp.this.Pm.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.Kbd.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.EYQ);
            if (this.mZx == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.VwS);
                this.mZx = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private void VwS() {
        this.mZx.EYQ(TTAdDislikeToast.getDislikeTip());
    }
}
