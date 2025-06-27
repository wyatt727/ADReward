package com.json.mediationsdk.adunit.adapter.internal;

import android.content.Context;
import com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.json.mediationsdk.adunit.adapter.utility.AdData;

/* loaded from: classes4.dex */
public interface AdapterBaseInterface {
    String getAdapterVersion();

    String getNetworkSDKVersion();

    void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener);
}
