package com.unity3d.player;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes4.dex */
public class NetworkConnectivityNougat extends NetworkConnectivity {
    private int b;
    private final ConnectivityManager.NetworkCallback c;

    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            NetworkConnectivityNougat networkConnectivityNougat;
            int i;
            super.onCapabilitiesChanged(network, networkCapabilities);
            if (networkCapabilities.hasTransport(0)) {
                networkConnectivityNougat = NetworkConnectivityNougat.this;
                i = 1;
            } else {
                networkConnectivityNougat = NetworkConnectivityNougat.this;
                i = 2;
            }
            networkConnectivityNougat.b = i;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            NetworkConnectivityNougat.this.b = 0;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            NetworkConnectivityNougat.this.b = 0;
        }
    }

    public NetworkConnectivityNougat(Context context) {
        super(context);
        this.b = 0;
        a aVar = new a();
        this.c = aVar;
        if (this.f4344a == null) {
            return;
        }
        this.b = super.b();
        this.f4344a.registerDefaultNetworkCallback(aVar);
    }

    @Override // com.unity3d.player.NetworkConnectivity
    public void a() {
        ConnectivityManager connectivityManager = this.f4344a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }

    @Override // com.unity3d.player.NetworkConnectivity
    public int b() {
        return this.b;
    }
}
