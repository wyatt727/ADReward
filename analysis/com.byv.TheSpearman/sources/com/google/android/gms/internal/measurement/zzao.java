package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzao implements zzaq {
    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return AbstractJsonLexerKt.NULL;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return zzaq.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzao;
    }
}
