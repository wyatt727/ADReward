package com.google.ads.mediation.vungle;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.mediation.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class VungleInitializer implements InitializationListener {
    private static final VungleInitializer instance = new VungleInitializer();
    private final AtomicBoolean isInitializing = new AtomicBoolean(false);
    private final ArrayList<VungleInitializationListener> initListeners = new ArrayList<>();

    public interface VungleInitializationListener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public static VungleInitializer getInstance() {
        return instance;
    }

    private VungleInitializer() {
        VungleAds.setIntegrationName(VungleAds.WrapperFramework.admob, BuildConfig.ADAPTER_VERSION.replace('.', '_'));
    }

    public void initialize(String str, Context context, VungleInitializationListener vungleInitializationListener) {
        if (VungleSdkWrapper.delegate.isInitialized()) {
            vungleInitializationListener.onInitializeSuccess();
        } else {
            if (this.isInitializing.getAndSet(true)) {
                this.initListeners.add(vungleInitializationListener);
                return;
            }
            updateCoppaStatus(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            VungleSdkWrapper.delegate.init(context, str, this);
            this.initListeners.add(vungleInitializationListener);
        }
    }

    @Override // com.vungle.ads.InitializationListener
    public void onSuccess() {
        Iterator<VungleInitializationListener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.initListeners.clear();
        this.isInitializing.set(false);
    }

    @Override // com.vungle.ads.InitializationListener
    public void onError(VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Iterator<VungleInitializationListener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(adError);
        }
        this.initListeners.clear();
        this.isInitializing.set(false);
    }

    public void updateCoppaStatus(int i) {
        if (i == 0) {
            VunglePrivacySettings.setCOPPAStatus(false);
        } else {
            if (i != 1) {
                return;
            }
            VunglePrivacySettings.setCOPPAStatus(true);
        }
    }
}
