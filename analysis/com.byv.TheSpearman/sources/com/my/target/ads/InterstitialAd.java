package com.my.target.ads;

import android.content.Context;
import com.my.target.ba;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.e4;
import com.my.target.e5;
import com.my.target.f2;
import com.my.target.h5;
import com.my.target.m;
import com.my.target.p3;
import com.my.target.s3;

/* loaded from: classes4.dex */
public final class InterstitialAd extends BaseInterstitialAd {
    protected InterstitialAdListener listener;

    public class EngineListener implements f2.a {
        private EngineListener() {
        }

        @Override // com.my.target.f2.a
        public void onClick() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onClick(interstitialAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onDismiss() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onDismiss(interstitialAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onDisplay() {
            InterstitialAd.this.finishRenderMetrics();
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onDisplay(interstitialAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onLoad() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onLoad(interstitialAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onNoAd(IAdLoadingError iAdLoadingError) {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onNoAd(iAdLoadingError, interstitialAd);
            }
        }

        @Override // com.my.target.f2.a
        public void onStartDisplaying() {
            InterstitialAd.this.startRenderMetrics();
        }

        @Override // com.my.target.f2.a
        public void onVideoCompleted() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onVideoCompleted(interstitialAd);
            }
        }
    }

    public interface InterstitialAdListener {
        void onClick(InterstitialAd interstitialAd);

        void onDismiss(InterstitialAd interstitialAd);

        void onDisplay(InterstitialAd interstitialAd);

        void onLoad(InterstitialAd interstitialAd);

        void onNoAd(IAdLoadingError iAdLoadingError, InterstitialAd interstitialAd);

        void onVideoCompleted(InterstitialAd interstitialAd);
    }

    public InterstitialAd(int i, Context context) {
        super(i, "fullscreen", context);
        ba.c("Interstitial ad created. Version - 5.20.0");
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void destroy() {
        super.destroy();
        this.listener = null;
    }

    public InterstitialAdListener getListener() {
        return this.listener;
    }

    @Override // com.my.target.ads.BaseInterstitialAd
    public void handleResult(e4 e4Var, IAdLoadingError iAdLoadingError) {
        InterstitialAdListener interstitialAdListener;
        InterstitialAdListener interstitialAdListener2 = this.listener;
        if (interstitialAdListener2 == null) {
            return;
        }
        if (e4Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.o;
            }
            interstitialAdListener2.onNoAd(iAdLoadingError, this);
            return;
        }
        p3 p3VarC = e4Var.c();
        e5 e5VarB = e4Var.b();
        if (p3VarC != null) {
            s3 s3VarA = s3.a(p3VarC, e4Var, this.useExoPlayer, new EngineListener());
            this.engine = s3VarA;
            if (s3VarA != null) {
                this.listener.onLoad(this);
                return;
            } else {
                interstitialAdListener = this.listener;
                iAdLoadingError = m.o;
            }
        } else if (e5VarB != null) {
            h5 h5VarA = h5.a(e5VarB, this.adConfig, this.metricFactory, new EngineListener());
            this.engine = h5VarA;
            h5VarA.b(this.context);
            return;
        } else {
            interstitialAdListener = this.listener;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.u;
            }
        }
        interstitialAdListener.onNoAd(iAdLoadingError, this);
    }

    public void setListener(InterstitialAdListener interstitialAdListener) {
        this.listener = interstitialAdListener;
    }
}
