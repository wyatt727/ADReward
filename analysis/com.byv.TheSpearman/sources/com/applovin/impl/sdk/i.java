package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.c4;
import com.applovin.impl.ho;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class i implements AppLovinBroadcastManager.Receiver {
    private static AlertDialog c;
    private static final AtomicBoolean d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final j f931a;
    private ho b;

    public interface a {
        void a();

        void b();
    }

    i(j jVar, k kVar) {
        this.f931a = jVar;
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final k kVar, final a aVar) {
        if (this.f931a.f()) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                return;
            }
            return;
        }
        Activity activityB = kVar.e().b();
        if (activityB != null && c4.a(k.k())) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.i$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(kVar, aVar);
                }
            });
            return;
        }
        if (activityB == null) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("ConsentAlertManager", "No parent Activity found - rescheduling consent alert...");
            }
        } else {
            kVar.L();
            if (t.a()) {
                kVar.L().b("ConsentAlertManager", "No internet available - rescheduling consent alert...");
            }
        }
        d.set(false);
        a(((Long) kVar.a(oj.t0)).longValue(), kVar, aVar);
    }

    public void a(long j, final k kVar, final a aVar) {
        if (j <= 0) {
            return;
        }
        AlertDialog alertDialog = c;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (d.getAndSet(true)) {
                if (j >= this.b.c()) {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().k("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.b.c() + " milliseconds");
                        return;
                    }
                    return;
                }
                kVar.L();
                if (t.a()) {
                    kVar.L().a("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.b.c() + "ms)");
                }
                this.b.a();
            }
            kVar.L();
            if (t.a()) {
                kVar.L().a("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
            }
            this.b = ho.a(j, kVar, new Runnable() { // from class: com.applovin.impl.sdk.i$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(kVar, aVar);
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if (this.b == null) {
            return;
        }
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.b.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.b.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final k kVar, final a aVar) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(kVar.e().b()).setTitle((CharSequence) kVar.a(oj.u0)).setMessage((CharSequence) kVar.a(oj.v0)).setCancelable(false).setPositiveButton((CharSequence) kVar.a(oj.w0), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.i$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                i.a(aVar, dialogInterface, i);
            }
        }).setNegativeButton((CharSequence) kVar.a(oj.x0), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.i$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.a(aVar, kVar, dialogInterface, i);
            }
        }).create();
        c = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i) {
        aVar.b();
        dialogInterface.dismiss();
        d.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, k kVar, DialogInterface dialogInterface, int i) {
        aVar.a();
        dialogInterface.dismiss();
        d.set(false);
        a(((Long) kVar.a(oj.s0)).longValue(), kVar, aVar);
    }
}
