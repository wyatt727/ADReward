package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzax implements zzaq {
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return zzaq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzax;
    }
}
