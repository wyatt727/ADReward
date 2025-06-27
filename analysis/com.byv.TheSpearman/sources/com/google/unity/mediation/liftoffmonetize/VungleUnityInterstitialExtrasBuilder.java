package com.google.unity.mediation.liftoffmonetize;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.vungle.mediation.VungleInterstitialAdapter;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class VungleUnityInterstitialExtrasBuilder extends VungleUnityExtrasBuilder {
    @Override // com.google.unity.mediation.liftoffmonetize.VungleUnityExtrasBuilder, com.google.unity.ads.AdNetworkExtras
    public /* bridge */ /* synthetic */ Bundle buildExtras(HashMap map) {
        return super.buildExtras(map);
    }

    @Override // com.google.unity.ads.AdNetworkExtras
    public Class<? extends MediationExtrasReceiver> getAdapterClass() {
        return VungleInterstitialAdapter.class;
    }
}
