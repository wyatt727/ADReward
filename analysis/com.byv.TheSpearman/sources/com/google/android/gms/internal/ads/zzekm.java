package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzekm {
    private zzekd zza;

    zzekm() {
    }

    private zzekm(zzekd zzekdVar) {
        this.zza = zzekdVar;
    }

    public static zzekm zzb(zzekd zzekdVar) {
        return new zzekm(zzekdVar);
    }

    public final zzekd zza(Clock clock, zzekf zzekfVar, zzego zzegoVar, zzfmt zzfmtVar) {
        zzekd zzekdVar = this.zza;
        return zzekdVar != null ? zzekdVar : new zzekd(clock, zzekfVar, zzegoVar, zzfmtVar);
    }
}
