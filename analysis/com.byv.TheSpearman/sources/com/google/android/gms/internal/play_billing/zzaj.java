package com.google.android.gms.internal.play_billing;

import com.json.t2;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzaj {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzaj(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + t2.i.b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + t2.i.b + String.valueOf(obj));
    }
}
