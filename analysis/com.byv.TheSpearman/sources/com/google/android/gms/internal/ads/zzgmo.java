package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgmo {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgmo() {
    }

    public final zzgmo zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzgmq zzb() {
        return new zzgmq(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzgmo(zzgmn zzgmnVar) {
    }
}
