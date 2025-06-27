package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* loaded from: classes4.dex */
public final class w {
    static int f = 3;
    static volatile w g;

    /* renamed from: a, reason: collision with root package name */
    final p f4268a;
    final h b;
    final Context c;
    InstallReferrerClient d;
    int e;

    final class a implements InstallReferrerStateListener {
        a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            z0.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + w.this.e);
            w.this.a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            z0.a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                w.this.a(this);
            } else {
                w.this.a(i);
            }
        }
    }

    w(p pVar, h hVar, Context context) {
        this.f4268a = pVar;
        this.b = hVar;
        this.c = context.getApplicationContext();
    }

    public static void a(p pVar, h hVar, Context context) {
        if (g != null) {
            return;
        }
        synchronized (w.class) {
            if (g != null) {
                return;
            }
            final w wVar = new w(pVar, hVar, context);
            g.a(new Runnable() { // from class: com.my.tracker.obfuscated.w$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    w.a(this.f$0);
                }
            });
            g = wVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(w wVar) {
        wVar.b();
        wVar.a();
    }

    public static void a(String str, Context context, Runnable runnable) {
        w wVar = g;
        if (wVar != null) {
            wVar.a(str, runnable);
            return;
        }
        r0 r0VarA = r0.a(context);
        if (!r0VarA.q()) {
            r0VarA.l(str);
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        try {
            z0.a("ReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a(new a());
        } catch (Throwable th) {
            z0.b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    void a() {
        if (r0.a(this.c).n()) {
            return;
        }
        g.c(new Runnable() { // from class: com.my.tracker.obfuscated.w$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        });
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:16:0x003b). Please report as a decompilation issue!!! */
    void a(int i) {
        if (this.d == null) {
            z0.b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                z0.a("ReferrerHandler: retrieving install referrer");
                final ReferrerDetails installReferrer = this.d.getInstallReferrer();
                g.a(new Runnable() { // from class: com.my.tracker.obfuscated.w$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(installReferrer);
                    }
                });
            } else {
                z0.a("ReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            z0.b("ReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.d;
        if (installReferrerClient == null) {
            z0.a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            z0.a("ReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            z0.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(ReferrerDetails referrerDetails) {
        r0 r0VarA = r0.a(this.c);
        if (r0VarA.n()) {
            z0.a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        z0.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f4268a.a(installReferrer, k.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        r0VarA.r();
    }

    void a(String str, Runnable runnable) {
        r0 r0VarA = r0.a(this.c);
        if (r0VarA.q()) {
            z0.a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.f4268a.a(str, k.b(this.c), runnable);
        this.b.a(str);
        r0VarA.u();
    }

    void b() {
        r0 r0VarA = r0.a(this.c);
        if (r0VarA.q()) {
            return;
        }
        String strL = r0VarA.l();
        if (TextUtils.isEmpty(strL)) {
            return;
        }
        a(strL, null);
    }
}
