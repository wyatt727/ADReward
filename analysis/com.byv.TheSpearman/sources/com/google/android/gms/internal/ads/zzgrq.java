package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgrq {
    private HashMap zza = new HashMap();

    public final zzgrs zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgrs zzgrsVar = new zzgrs(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgrsVar;
    }
}
