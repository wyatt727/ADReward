package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzla<K, V> {
    static <K, V> int zza(zzkz<K, V> zzkzVar, K k, V v) {
        return zzjl.zza(zzkzVar.zza, 1, k) + zzjl.zza(zzkzVar.zzc, 2, v);
    }

    static <K, V> void zza(zzjc zzjcVar, zzkz<K, V> zzkzVar, K k, V v) throws IOException {
        zzjl.zza(zzjcVar, zzkzVar.zza, 1, k);
        zzjl.zza(zzjcVar, zzkzVar.zzc, 2, v);
    }
}
