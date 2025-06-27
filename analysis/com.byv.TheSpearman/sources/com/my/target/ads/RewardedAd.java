package com.my.target.ads;

import android.content.Context;
import com.my.target.ba;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.e4;
import com.my.target.e5;
import com.my.target.f2;
import com.my.target.m;
import com.my.target.m5;
import com.my.target.p3;
import com.my.target.s3;

/* loaded from: classes4.dex */
public final class RewardedAd extends BaseInterstitialAd {
    protected RewardedAdListener listener;

    public class EngineListener implements f2.a {
        private EngineListener() {
        }

        @Override // com.my.target.f2.a
        public void onClick() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onClick(rewardedAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onDismiss() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDismiss(rewardedAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onDisplay() {
            RewardedAd.this.finishRenderMetrics();
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDisplay(rewardedAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onLoad() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onLoad(rewardedAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onNoAd(IAdLoadingError iAdLoadingError) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onNoAd(iAdLoadingError, rewardedAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onStartDisplaying() {
            RewardedAd.this.startRenderMetrics();
        }

        @Override // com.my.target.f2.a
        public void onVideoCompleted() {
        }
    }

    public interface RewardedAdListener {
        void onClick(RewardedAd rewardedAd);

        void onDismiss(RewardedAd rewardedAd);

        void onDisplay(RewardedAd rewardedAd);

        void onLoad(RewardedAd rewardedAd);

        void onNoAd(IAdLoadingError iAdLoadingError, RewardedAd rewardedAd);

        void onReward(Reward reward, RewardedAd rewardedAd);
    }

    public class RewardedListener implements f2.b {
        private RewardedListener() {
        }

        @Override // com.my.target.f2.b
        public void onReward(Reward reward) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onReward(reward, rewardedAd);
            }
        }
    }

    public RewardedAd(int i, Context context) {
        super(i, "rewarded", context);
        ba.c("Rewarded ad created. Version - 5.20.0");
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void destroy() {
        super.destroy();
        this.listener = null;
    }

    public RewardedAdListener getListener() {
        return this.listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.my.target.ads.BaseInterstitialAd
    public void handleResult(e4 e4Var, IAdLoadingError iAdLoadingError) {
        RewardedAdListener rewardedAdListener;
        RewardedAdListener rewardedAdListener2 = this.listener;
        if (rewardedAdListener2 == null) {
            return;
        }
        if (e4Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.o;
            }
            rewardedAdListener2.onNoAd(iAdLoadingError, this);
            return;
        }
        p3 p3VarC = e4Var.c();
        e5 e5VarB = e4Var.b();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (p3VarC != null) {
            s3 s3VarA = s3.a(p3VarC, e4Var, this.useExoPlayer, new EngineListener());
            this.engine = s3VarA;
            if (s3VarA != null) {
                s3VarA.a(new RewardedListener());
                this.listener.onLoad(this);
                return;
            } else {
                rewardedAdListener = this.listener;
                iAdLoadingError = m.o;
            }
        } else {
            if (e5VarB != null) {
                m5 m5VarA = m5.a(e5VarB, this.adConfig, this.metricFactory, new EngineListener());
                m5VarA.a(new RewardedListener());
                this.engine = m5VarA;
                m5VarA.b(this.context);
                return;
            }
            rewardedAdListener = this.listener;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.u;
            }
        }
        rewardedAdListener.onNoAd(iAdLoadingError, this);
    }

    public void setListener(RewardedAdListener rewardedAdListener) {
        this.listener = rewardedAdListener;
    }
}
