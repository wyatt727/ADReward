package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    int f4232a = 1;
    int b = -1;

    i() {
    }

    public void a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.f4232a = 1;
            this.b = -1;
            return;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
        this.f4232a = intentRegisterReceiver.getIntExtra("status", 1);
        if (intExtra < 0 || intExtra2 <= 0) {
            this.b = -1;
        } else {
            this.b = (intExtra * 100) / intExtra2;
        }
    }

    public void a(s0 s0Var, Context context) {
        s0Var.f(this.f4232a);
        int i = this.b;
        if (i >= 0) {
            s0Var.e(i);
        }
    }

    public void b(Context context) {
    }
}
