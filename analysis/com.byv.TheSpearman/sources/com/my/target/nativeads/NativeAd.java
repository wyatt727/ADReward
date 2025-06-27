package com.my.target.nativeads;

import android.content.Context;
import android.view.View;
import com.my.target.ba;
import com.my.target.common.BaseAd;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.d6;
import com.my.target.e5;
import com.my.target.g2;
import com.my.target.i5;
import com.my.target.j6;
import com.my.target.k6;
import com.my.target.m;
import com.my.target.m6;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.q6;
import com.my.target.x8;
import java.util.List;

/* loaded from: classes4.dex */
public final class NativeAd extends BaseAd implements INativeAd {
    private NativeAdChoicesListener adChoicesListener;
    private NativeAdChoicesOptionListener adChoicesOptionListener;
    private int adChoicesPlacement;
    private final Context appContext;
    private g2 engine;
    private NativeAdListener listener;
    private NativeAdMediaListener mediaListener;
    private MenuFactory menuFactory;
    private boolean useExoPlayer;

    public interface NativeAdChoicesListener {
        void onAdChoicesIconLoad(ImageData imageData, boolean z, NativeAd nativeAd);
    }

    public interface NativeAdChoicesOptionListener {
        void closeIfAutomaticallyDisabled(NativeAd nativeAd);

        void onCloseAutomatically(NativeAd nativeAd);

        boolean shouldCloseAutomatically();
    }

    public interface NativeAdListener {
        void onClick(NativeAd nativeAd);

        void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd);

        void onNoAd(IAdLoadingError iAdLoadingError, NativeAd nativeAd);

        void onShow(NativeAd nativeAd);

        void onVideoComplete(NativeAd nativeAd);

        void onVideoPause(NativeAd nativeAd);

        void onVideoPlay(NativeAd nativeAd);
    }

    public interface NativeAdMediaListener {
        void onIconLoad(NativeAd nativeAd);

        void onImageLoad(NativeAd nativeAd);
    }

    public NativeAd(int i, Context context) {
        super(i, "nativeads");
        this.adChoicesPlacement = 0;
        this.useExoPlayer = true;
        this.appContext = context.getApplicationContext();
        this.menuFactory = null;
        ba.c("Native ad created. Version - 5.20.0");
    }

    public NativeAd(int i, MenuFactory menuFactory, Context context) {
        this(i, context);
        this.menuFactory = menuFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(q6 q6Var, IAdLoadingError iAdLoadingError) {
        NativeAdListener nativeAdListener = this.listener;
        if (nativeAdListener == null) {
            return;
        }
        if (q6Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.o;
            }
            nativeAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        d6 d6VarE = q6Var.e();
        e5 e5VarB = q6Var.b();
        if (d6VarE != null) {
            j6 j6VarA = j6.a(this, d6VarE, this.menuFactory, this.appContext);
            this.engine = j6VarA;
            j6VarA.a(this.mediaListener);
            if (this.engine.e() != null) {
                this.listener.onLoad(this.engine.e(), this);
                return;
            }
            return;
        }
        if (e5VarB != null) {
            i5 i5VarA = i5.a(this, e5VarB, this.adConfig, this.metricFactory, this.menuFactory);
            this.engine = i5VarA;
            i5VarA.b(this.appContext);
        } else {
            NativeAdListener nativeAdListener2 = this.listener;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.u;
            }
            nativeAdListener2.onNoAd(iAdLoadingError, this);
        }
    }

    public NativeAdChoicesListener getAdChoicesListener() {
        return this.adChoicesListener;
    }

    public NativeAdChoicesOptionListener getAdChoicesOptionListener() {
        return this.adChoicesOptionListener;
    }

    @Override // com.my.target.nativeads.INativeAd
    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    public String getAdSource() {
        g2 g2Var = this.engine;
        if (g2Var != null) {
            return g2Var.b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        g2 g2Var = this.engine;
        if (g2Var != null) {
            return g2Var.c();
        }
        return 0.0f;
    }

    public NativePromoBanner getBanner() {
        g2 g2Var = this.engine;
        if (g2Var == null) {
            return null;
        }
        return g2Var.e();
    }

    @Override // com.my.target.nativeads.INativeAd
    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    public NativeAdListener getListener() {
        return this.listener;
    }

    public NativeAdMediaListener getMediaListener() {
        return this.mediaListener;
    }

    public void handleAdChoicesClick(Context context) {
        g2 g2Var = this.engine;
        if (g2Var == null) {
            return;
        }
        g2Var.handleAdChoicesClick(context);
    }

    @Override // com.my.target.nativeads.INativeAd
    public void handleData(String str) {
        k6.a(str, this.adConfig, this.metricFactory).a(new NativeAd$$ExternalSyntheticLambda0(this)).a(this.metricFactory.a(), this.appContext);
    }

    public final void handleSection(q6 q6Var) {
        k6.a(q6Var, this.adConfig, this.metricFactory).a(new NativeAd$$ExternalSyntheticLambda0(this)).a(this.metricFactory.a(), this.appContext);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public boolean isUseExoPlayer() {
        return this.useExoPlayer;
    }

    @Override // com.my.target.nativeads.INativeAd
    public final void load() {
        if (isLoadCalled()) {
            ba.a("NativeAd: Doesn't support multiple load");
            handleResult(null, m.t);
        } else {
            k6.a(this.adConfig, this.metricFactory).a(new NativeAd$$ExternalSyntheticLambda0(this)).a(this.metricFactory.a(), this.appContext);
        }
    }

    @Override // com.my.target.nativeads.INativeAd
    public void loadFromBid(String str) {
        this.adConfig.setBidId(str);
        load();
    }

    @Override // com.my.target.nativeads.INativeAd
    public final void registerView(View view) {
        registerView(view, null);
    }

    @Override // com.my.target.nativeads.INativeAd
    public final void registerView(View view, List<View> list) {
        m6.a(view, this);
        g2 g2Var = this.engine;
        if (g2Var != null) {
            g2Var.a(view, list, this.adChoicesPlacement, null);
        }
    }

    public void registerView(View view, List<View> list, MediaAdView mediaAdView) {
        m6.a(view, this);
        g2 g2Var = this.engine;
        if (g2Var != null) {
            g2Var.a(view, list, this.adChoicesPlacement, mediaAdView);
        }
    }

    public void setAdChoicesListener(NativeAdChoicesListener nativeAdChoicesListener) {
        this.adChoicesListener = nativeAdChoicesListener;
    }

    public void setAdChoicesOptionListener(NativeAdChoicesOptionListener nativeAdChoicesOptionListener) {
        this.adChoicesOptionListener = nativeAdChoicesOptionListener;
    }

    @Override // com.my.target.nativeads.INativeAd
    public void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public void setBanner(d6 d6Var) {
        this.engine = j6.a(this, d6Var, this.menuFactory, this.appContext);
    }

    @Override // com.my.target.nativeads.INativeAd
    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public void setListener(NativeAdListener nativeAdListener) {
        this.listener = nativeAdListener;
    }

    public void setMediaListener(NativeAdMediaListener nativeAdMediaListener) {
        this.mediaListener = nativeAdMediaListener;
        g2 g2Var = this.engine;
        if (g2Var != null) {
            g2Var.a(nativeAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    @Override // com.my.target.nativeads.INativeAd
    public final void unregisterView() {
        m6.a(this);
        g2 g2Var = this.engine;
        if (g2Var != null) {
            g2Var.unregisterView();
        }
    }

    public void useExoPlayer(boolean z) {
        this.useExoPlayer = z;
        if (z) {
            return;
        }
        x8.g();
    }
}
