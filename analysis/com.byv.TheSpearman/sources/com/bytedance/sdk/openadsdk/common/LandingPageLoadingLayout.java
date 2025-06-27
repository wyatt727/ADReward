package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.hu;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class LandingPageLoadingLayout extends PAGFrameLayout {
    View EYQ;
    private Runnable IPb;
    private Runnable Kbd;
    private long Pm;
    private int Td;
    private IPb mZx;

    public LandingPageLoadingLayout(Context context) {
        super(context);
        this.Pm = 10L;
        Td();
    }

    private void Td() {
        setBackgroundColor(-1);
        this.EYQ = new PAGLogoView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, tr.mZx(getContext(), 14.0f));
        this.EYQ.setVisibility(8);
        this.EYQ.setId(520093739);
        layoutParams.gravity = 8388691;
        layoutParams.leftMargin = tr.mZx(getContext(), 16.0f);
        layoutParams.bottomMargin = tr.mZx(getContext(), 16.0f);
        addView(this.EYQ, layoutParams);
        setVisibility(8);
    }

    public void EYQ(UB ub, String str) {
        EYQ(ub, str, false);
    }

    public void EYQ(final UB ub, final String str, boolean z) {
        int iRM;
        String str2;
        String[] strArr;
        nWX nwx;
        hu huVar;
        nWX nwxVD = null;
        if (ub != null) {
            hu huVarQQ = ub.QQ();
            if (huVarQQ != null) {
                this.Pm = huVarQQ.EYQ();
            }
            String strOZ = ub.oZ();
            String[] strArrAs = ub.As();
            iRM = ub.rM();
            if (ub.vD() != null && !TextUtils.isEmpty(ub.vD().EYQ())) {
                nwxVD = ub.vD();
            }
            nwx = nwxVD;
            huVar = huVarQQ;
            str2 = strOZ;
            strArr = strArrAs;
        } else {
            iRM = 0;
            str2 = null;
            strArr = null;
            nwx = null;
            huVar = null;
        }
        if (iRM == 1) {
            this.mZx = new Kbd(getContext(), str2, strArr, nwx, huVar);
        } else {
            this.mZx = new Pm(getContext(), str2, strArr, nwx, huVar);
        }
        View viewKbd = this.mZx.Kbd();
        if (viewKbd.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewKbd.getParent()).removeView(viewKbd);
        }
        addView(viewKbd);
        View view = this.EYQ;
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            }
            this.EYQ.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.EYQ(LandingPageLoadingLayout.this.getContext(), ub, str);
                }
            });
        }
    }

    public void EYQ() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.2
            @Override // java.lang.Runnable
            public void run() {
                if (LandingPageLoadingLayout.this.mZx != null) {
                    LandingPageLoadingLayout.this.setVisibility(0);
                    LandingPageLoadingLayout.this.mZx.mZx();
                }
            }
        });
        if (this.Kbd == null) {
            this.Kbd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    LandingPageLoadingLayout.this.mZx();
                }
            };
        }
        postDelayed(this.Kbd, this.Pm * 1000);
    }

    public void EYQ(int i) {
        if (i == 100 || i - this.Td >= 7) {
            this.Td = i;
            if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
                mZx(this.Td);
                return;
            }
            if (this.IPb == null) {
                this.IPb = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        LandingPageLoadingLayout landingPageLoadingLayout = LandingPageLoadingLayout.this;
                        landingPageLoadingLayout.mZx(landingPageLoadingLayout.Td);
                    }
                };
            }
            post(this.IPb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(int i) {
        IPb iPb = this.mZx;
        if (iPb != null) {
            iPb.EYQ(i);
        }
        if (i == 100) {
            mZx();
        }
    }

    public void mZx() {
        this.Td = 0;
        IPb iPb = this.mZx;
        if (iPb != null) {
            removeView(iPb.Kbd);
            this.mZx.Pm();
        }
        setVisibility(8);
        this.mZx = null;
        Runnable runnable = this.Kbd;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.IPb;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.IPb = null;
        this.Kbd = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.Kbd;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.Kbd = null;
        }
    }
}
