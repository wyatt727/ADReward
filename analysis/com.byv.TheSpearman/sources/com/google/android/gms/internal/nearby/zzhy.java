package com.google.android.gms.internal.nearby;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public abstract class zzhy<T> implements Serializable {
    zzhy() {
    }

    public static <T> zzhy<T> zzc() {
        return zzhx.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();

    public static <T> zzhy<T> zzd(T t) {
        Objects.requireNonNull(t);
        return new zzia(t);
    }
}
