package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;

/* loaded from: classes4.dex */
public final class b0 {
    static int f = 3;
    static volatile b0 g;

    /* renamed from: a, reason: collision with root package name */
    final p f4214a;
    final h b;
    final Context c;
    InstallReferrerClient d;
    int e;

    final class a implements InstallReferrerStateListener {
        a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            z0.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + b0.this.e);
            b0.this.a(this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                b0.this.a(this);
            } else {
                z0.a("HuaweiReferrerHandler: install referrer setup is finished");
                b0.this.a(i);
            }
        }
    }

    b0(p pVar, h hVar, Context context) {
        this.f4214a = pVar;
        this.b = hVar;
        this.c = context.getApplicationContext();
    }

    public static void a(p pVar, h hVar, Context context) {
        if (g != null) {
            return;
        }
        synchronized (b0.class) {
            if (g != null) {
                return;
            }
            final b0 b0Var = new b0(pVar, hVar, context);
            g.a(new Runnable() { // from class: com.my.tracker.obfuscated.b0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a();
                }
            });
            g = b0Var;
        }
    }

    void a() {
        if (r0.a(this.c).o()) {
            return;
        }
        try {
            z0.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a(new a());
        } catch (Throwable th) {
            z0.b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    void a(int i) {
        if (this.d == null) {
            z0.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                z0.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.d.getInstallReferrer());
            } else {
                z0.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            z0.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.d == null) {
            z0.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            z0.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.d.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            z0.a("HuaweiReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            z0.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }

    void a(ReferrerDetails referrerDetails) {
        r0 r0VarA = r0.a(this.c);
        if (r0VarA.o()) {
            z0.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        z0.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f4214a.b(installReferrer, k.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        r0VarA.s();
    }
}
