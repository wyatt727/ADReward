package com.my.target.nativeads;

import android.content.Context;
import android.view.View;
import com.my.target.ba;
import com.my.target.c7;
import com.my.target.common.BaseAd;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.d6;
import com.my.target.e5;
import com.my.target.h2;
import com.my.target.j5;
import com.my.target.k6;
import com.my.target.m;
import com.my.target.m6;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.o5;
import com.my.target.q6;
import java.util.List;

/* loaded from: classes4.dex */
public final class NativeBannerAd extends BaseAd implements INativeAd {
    private NativeBannerAdChoicesListener adChoicesListener;
    private NativeBannerAdChoicesOptionListener adChoicesOptionListener;
    private int adChoicesPlacement;
    private final Context appContext;
    private h2 engine;
    private NativeBannerAdListener listener;
    private NativeBannerAdMediaListener mediaListener;
    private MenuFactory menuFactory;

    public interface NativeBannerAdChoicesListener {
        void onAdChoicesIconLoad(ImageData imageData, boolean z, NativeBannerAd nativeBannerAd);
    }

    public interface NativeBannerAdChoicesOptionListener {
        void closeIfAutomaticallyDisabled(NativeBannerAd nativeBannerAd);

        void onCloseAutomatically(NativeBannerAd nativeBannerAd);

        boolean shouldCloseAutomatically();
    }

    public interface NativeBannerAdListener {
        void onClick(NativeBannerAd nativeBannerAd);

        void onLoad(NativeBanner nativeBanner, NativeBannerAd nativeBannerAd);

        void onNoAd(IAdLoadingError iAdLoadingError, NativeBannerAd nativeBannerAd);

        void onShow(NativeBannerAd nativeBannerAd);
    }

    public interface NativeBannerAdMediaListener {
        void onIconLoad(NativeBannerAd nativeBannerAd);
    }

    public NativeBannerAd(int i, Context context) {
        super(i, "nativebanner");
        this.adChoicesPlacement = 0;
        this.appContext = context.getApplicationContext();
        ba.c("Native banner ad created. Version - 5.20.0");
    }

    public NativeBannerAd(int i, MenuFactory menuFactory, Context context) {
        this(i, context);
        this.menuFactory = menuFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(q6 q6Var, IAdLoadingError iAdLoadingError) {
        NativeBannerAdListener nativeBannerAdListener = this.listener;
        if (nativeBannerAdListener == null) {
            return;
        }
        if (q6Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.o;
            }
            nativeBannerAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        d6 d6VarE = q6Var.e();
        e5 e5VarB = q6Var.b();
        if (d6VarE != null) {
            c7 c7VarA = c7.a(this, d6VarE, this.menuFactory, this.appContext);
            this.engine = c7VarA;
            c7VarA.a(this.mediaListener);
            NativeBanner nativeBannerD = this.engine.d();
            if (nativeBannerD != null) {
                this.listener.onLoad(nativeBannerD, this);
                return;
            }
            return;
        }
        if (e5VarB != null) {
            j5 j5VarA = j5.a(this, e5VarB, this.adConfig, this.metricFactory, this.menuFactory);
            this.engine = j5VarA;
            j5VarA.b(this.appContext);
        } else {
            NativeBannerAdListener nativeBannerAdListener2 = this.listener;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.u;
            }
            nativeBannerAdListener2.onNoAd(iAdLoadingError, this);
        }
    }

    public NativeBannerAdChoicesListener getAdChoicesListener() {
        return this.adChoicesListener;
    }

    public NativeBannerAdChoicesOptionListener getAdChoicesOptionListener() {
        return this.adChoicesOptionListener;
    }

    @Override // com.my.target.nativeads.INativeAd
    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    public String getAdSource() {
        h2 h2Var = this.engine;
        if (h2Var != null) {
            return h2Var.b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        h2 h2Var = this.engine;
        if (h2Var != null) {
            return h2Var.c();
        }
        return 0.0f;
    }

    public NativeBanner getBanner() {
        h2 h2Var = this.engine;
        if (h2Var == null) {
            return null;
        }
        return h2Var.d();
    }

    @Override // com.my.target.nativeads.INativeAd
    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    public NativeBannerAdListener getListener() {
        return this.listener;
    }

    public NativeBannerAdMediaListener getMediaListener() {
        return this.mediaListener;
    }

    public void handleAdChoicesClick(Context context) {
        h2 h2Var = this.engine;
        if (h2Var == null) {
            return;
        }
        h2Var.handleAdChoicesClick(context);
    }

    @Override // com.my.target.nativeads.INativeAd
    public void handleData(String str) {
        k6.a(str, this.adConfig, this.metricFactory).a(new NativeBannerAd$$ExternalSyntheticLambda0(this)).a(this.metricFactory.a(), this.appContext);
    }

    public final void handleSection(q6 q6Var) {
        o5.a aVarA = o5.a(this.adConfig.getSlotId());
        k6.a(q6Var, this.adConfig, aVarA).a(new NativeBannerAd$$ExternalSyntheticLambda0(this)).a(aVarA.a(), this.appContext);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    @Override // com.my.target.nativeads.INativeAd
    public final void load() {
        if (isLoadCalled()) {
            ba.a("NativeBannerAd: Doesn't support multiple load");
            handleResult(null, m.t);
        } else {
            k6.a(this.adConfig, this.metricFactory).a(new NativeBannerAd$$ExternalSyntheticLambda0(this)).a(this.metricFactory.a(), this.appContext);
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
        h2 h2Var = this.engine;
        if (h2Var != null) {
            h2Var.registerView(view, list, this.adChoicesPlacement);
        }
    }

    public void setAdChoicesListener(NativeBannerAdChoicesListener nativeBannerAdChoicesListener) {
        this.adChoicesListener = nativeBannerAdChoicesListener;
    }

    public void setAdChoicesOptionListener(NativeBannerAdChoicesOptionListener nativeBannerAdChoicesOptionListener) {
        this.adChoicesOptionListener = nativeBannerAdChoicesOptionListener;
    }

    @Override // com.my.target.nativeads.INativeAd
    public void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public void setBanner(d6 d6Var) {
        this.engine = c7.a(this, d6Var, this.menuFactory, this.appContext);
    }

    @Override // com.my.target.nativeads.INativeAd
    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public void setListener(NativeBannerAdListener nativeBannerAdListener) {
        this.listener = nativeBannerAdListener;
    }

    public void setMediaListener(NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.mediaListener = nativeBannerAdMediaListener;
        h2 h2Var = this.engine;
        if (h2Var != null) {
            h2Var.a(nativeBannerAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    @Override // com.my.target.nativeads.INativeAd
    public final void unregisterView() {
        m6.a(this);
        h2 h2Var = this.engine;
        if (h2Var != null) {
            h2Var.unregisterView();
        }
    }
}
