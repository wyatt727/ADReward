package com.google.games.bridge;

import com.google.android.gms.nearby.connection.DiscoveredEndpointInfo;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

/* loaded from: classes2.dex */
public class EndpointDiscoveryCallbackProxy extends EndpointDiscoveryCallback {
    private Callback callback;

    public interface Callback {
        void onEndpointFound(String str, DiscoveredEndpointInfo discoveredEndpointInfo);

        void onEndpointLost(String str);
    }

    public EndpointDiscoveryCallbackProxy(Callback callback) {
        this.callback = callback;
    }

    @Override // com.google.android.gms.nearby.connection.EndpointDiscoveryCallback
    public void onEndpointFound(String str, DiscoveredEndpointInfo discoveredEndpointInfo) {
        this.callback.onEndpointFound(str, discoveredEndpointInfo);
    }

    @Override // com.google.android.gms.nearby.connection.EndpointDiscoveryCallback
    public void onEndpointLost(String str) {
        this.callback.onEndpointLost(str);
    }
}
