package com.google.android.gms.nearby.connection;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public abstract class EndpointDiscoveryCallback {
    public abstract void onEndpointFound(String str, DiscoveredEndpointInfo discoveredEndpointInfo);

    public abstract void onEndpointLost(String str);
}
