package com.json;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oa implements x5 {

    /* renamed from: a, reason: collision with root package name */
    private String f2046a = "oa";
    private int b = 23;
    private final y5 c;
    private ConnectivityManager.NetworkCallback d;

    class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2047a;

        a(Context context) {
            this.f2047a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                oa.this.c.a(q2.a(network, this.f2047a), q2.a(this.f2047a, network));
                return;
            }
            y5 y5Var = oa.this.c;
            String strB = q2.b(this.f2047a);
            Context context = this.f2047a;
            y5Var.a(strB, q2.a(context, q2.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                oa.this.c.b(q2.a(network, this.f2047a), q2.a(this.f2047a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                oa.this.c.b(q2.a(network, this.f2047a), q2.a(this.f2047a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (q2.b(this.f2047a).equals("none")) {
                oa.this.c.a();
            }
        }
    }

    public oa(y5 y5Var) {
        this.c = y5Var;
    }

    @Override // com.json.x5
    public void a() {
        this.d = null;
    }

    @Override // com.json.x5
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception unused) {
            Log.e(this.f2046a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.json.x5
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (q2.b(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.d);
                }
            } catch (Exception unused) {
                Log.e(this.f2046a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.json.x5
    public JSONObject c(Context context) {
        return q2.a(context, q2.a(context));
    }
}
