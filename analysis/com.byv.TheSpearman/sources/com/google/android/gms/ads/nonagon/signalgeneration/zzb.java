package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
final class zzb extends LinkedHashMap {
    final /* synthetic */ zzc zza;

    zzb(zzc zzcVar) {
        this.zza = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.zza) {
            int size = size();
            zzc zzcVar = this.zza;
            if (size <= zzcVar.zza) {
                return false;
            }
            zzcVar.zzf.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            return size() > this.zza.zza;
        }
    }
}
