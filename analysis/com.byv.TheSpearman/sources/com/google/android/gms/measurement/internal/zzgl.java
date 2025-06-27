package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzgl {
    private final zzit zza;

    static zzgl zza(String str) {
        return new zzgl((TextUtils.isEmpty(str) || str.length() > 1) ? zzit.UNINITIALIZED : zziq.zza(str.charAt(0)));
    }

    final zzit zza() {
        return this.zza;
    }

    final String zzb() {
        return String.valueOf(zziq.zza(this.zza));
    }

    zzgl(zzit zzitVar) {
        this.zza = zzitVar;
    }
}
