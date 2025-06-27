package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzlw {
    private static final zzlw zza = new zzlw();
    private final ConcurrentMap<Class<?>, zzma<?>> zzc = new ConcurrentHashMap();
    private final zzlz zzb = new zzkw();

    public static zzlw zza() {
        return zza;
    }

    public final <T> zzma<T> zza(Class<T> cls) {
        zzjy.zza(cls, "messageType");
        zzma<T> zzmaVar = (zzma) this.zzc.get(cls);
        if (zzmaVar != null) {
            return zzmaVar;
        }
        zzma<T> zzmaVarZza = this.zzb.zza(cls);
        zzjy.zza(cls, "messageType");
        zzjy.zza(zzmaVarZza, "schema");
        zzma<T> zzmaVar2 = (zzma) this.zzc.putIfAbsent(cls, zzmaVarZza);
        return zzmaVar2 != null ? zzmaVar2 : zzmaVarZza;
    }

    public final <T> zzma<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzlw() {
    }
}
