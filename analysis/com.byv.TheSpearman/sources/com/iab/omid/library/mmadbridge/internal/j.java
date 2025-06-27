package com.iab.omid.library.mmadbridge.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class j {
    private static j d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f1595a;
    private boolean b = false;
    private boolean c = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z = jVar.c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z = jVar.c;
                z2 = false;
            }
            jVar.a(z2, z);
            j.this.b = z2;
        }
    }

    public static j b() {
        return d;
    }

    public void a() {
        Context context = this.f1595a.get();
        if (context == null) {
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        boolean zIsDeviceLocked = Build.VERSION.SDK_INT >= 22 ? keyguardManager.isDeviceLocked() : keyguardManager.inKeyguardRestrictedInputMode();
        a(this.b, zIsDeviceLocked);
        this.c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f1595a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z2 || z);
        }
    }
}
