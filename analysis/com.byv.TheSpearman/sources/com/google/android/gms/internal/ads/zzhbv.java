package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbv {
    private static final zzhbv zza = new zzhbv();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzhch zzb = new zzhbd();

    private zzhbv() {
    }

    public static zzhbv zza() {
        return zza;
    }

    public final zzhcg zzb(Class cls) {
        zzhai.zzc(cls, "messageType");
        zzhcg zzhcgVarZza = (zzhcg) this.zzc.get(cls);
        if (zzhcgVarZza == null) {
            zzhcgVarZza = this.zzb.zza(cls);
            zzhai.zzc(cls, "messageType");
            zzhcg zzhcgVar = (zzhcg) this.zzc.putIfAbsent(cls, zzhcgVarZza);
            if (zzhcgVar != null) {
                return zzhcgVar;
            }
        }
        return zzhcgVarZza;
    }
}
