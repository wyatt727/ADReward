package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class gb {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f454a;
    private final Activity b;
    private AlertDialog c;
    private a d;

    public interface a {
        void b();

        void c();
    }

    public gb(Activity activity, com.applovin.impl.sdk.k kVar) {
        this.f454a = kVar;
        this.b = activity;
    }

    public void a() {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.gb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.c = new AlertDialog.Builder(this.b).setTitle((CharSequence) this.f454a.a(oj.t1)).setMessage((CharSequence) this.f454a.a(oj.u1)).setCancelable(false).setPositiveButton((CharSequence) this.f454a.a(oj.w1), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.gb$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.a(dialogInterface, i);
            }
        }).setNegativeButton((CharSequence) this.f454a.a(oj.v1), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.gb$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.b(dialogInterface, i);
            }
        }).show();
    }

    public void e() {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.gb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        });
    }

    public boolean b() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, DialogInterface dialogInterface, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, final Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        builder.setTitle(bVar.a0());
        String strY = bVar.Y();
        if (AppLovinSdkUtils.isValidString(strY)) {
            builder.setMessage(strY);
        }
        builder.setPositiveButton(bVar.Z(), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.gb$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                gb.a(runnable, dialogInterface, i);
            }
        });
        builder.setCancelable(false);
        this.c = builder.show();
    }

    public void b(final com.applovin.impl.sdk.ad.b bVar, final Runnable runnable) {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.gb$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(bVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        this.d.c();
    }

    public void a(a aVar) {
        this.d = aVar;
    }
}
