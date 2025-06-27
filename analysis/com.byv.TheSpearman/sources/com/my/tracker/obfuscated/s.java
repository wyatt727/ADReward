package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    boolean f4255a = false;
    boolean b = true;
    String c;

    s() {
    }

    public void a(Context context) {
        if (this.f4255a) {
            return;
        }
        b(context);
        this.f4255a = true;
    }

    public void a(s0 s0Var, Context context) {
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        s0Var.a(this.c, this.b);
    }

    void b(Context context) {
        z0.a("get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.c = advertisingIdInfo.getId();
            z0.a("AId: " + this.c);
            this.b = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            z0.a("AId ad tracking enabled: " + this.b);
        } catch (Throwable th) {
            z0.b("failed to get google AId", th);
        }
    }

    public void c(Context context) {
    }
}
