package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdju implements zzbky {
    private final WeakReference zza;

    /* synthetic */ zzdju(zzdjv zzdjvVar, zzdjt zzdjtVar) {
        this.zza = new WeakReference(zzdjvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        zzdjv zzdjvVar = (zzdjv) this.zza.get();
        if (zzdjvVar == null) {
            return;
        }
        zzdjvVar.zzg.zza();
    }
}
