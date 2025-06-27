package com.json.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.qa;

/* loaded from: classes4.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private ConnectivityManager f1760a;
    private qa b;
    private boolean c = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkStateReceiver.this.b != null) {
                NetworkStateReceiver.this.b.a(NetworkStateReceiver.this.c);
            }
        }
    }

    public NetworkStateReceiver(Context context, qa qaVar) {
        this.b = qaVar;
        if (context != null) {
            this.f1760a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    private boolean a() {
        boolean z = this.c;
        ConnectivityManager connectivityManager = this.f1760a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception unused) {
            }
        } else {
            this.c = false;
        }
        return z != this.c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
