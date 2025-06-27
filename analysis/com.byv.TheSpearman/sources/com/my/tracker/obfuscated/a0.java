package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes4.dex */
public final class a0 {
    String b;

    /* renamed from: a, reason: collision with root package name */
    boolean f4209a = false;
    boolean c = true;

    public void a(Context context) {
        if (this.f4209a) {
            return;
        }
        this.f4209a = true;
        b(context);
    }

    public void a(s0 s0Var, Context context) {
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        s0Var.b(this.b, this.c);
    }

    void b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.b = advertisingIdInfo.getId();
            z0.a("HuaweiAIdDataProvider: oaid: " + this.b);
            this.c = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            z0.a("HuaweiAIdDataProvider: oaid tracking enabled: " + this.c);
        } catch (Throwable unused) {
        }
    }

    public void c(Context context) {
    }
}
