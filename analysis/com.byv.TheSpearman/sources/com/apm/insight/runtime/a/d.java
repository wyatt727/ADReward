package com.apm.insight.runtime.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.runtime.p;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private int f125a;

    private class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    d.this.f125a = (int) ((intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100));
                }
            } catch (Throwable unused) {
            }
        }
    }

    d(final Context context) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.a.d.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    d.this.a(context);
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public int a() {
        return this.f125a;
    }
}
