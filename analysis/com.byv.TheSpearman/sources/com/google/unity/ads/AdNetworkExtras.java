package com.google.unity.ads;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.HashMap;

/* loaded from: classes4.dex */
public interface AdNetworkExtras {
    Bundle buildExtras(HashMap<String, String> extras);

    Class<? extends MediationExtrasReceiver> getAdapterClass();
}
