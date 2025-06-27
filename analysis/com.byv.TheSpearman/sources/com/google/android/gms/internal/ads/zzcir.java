package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcir implements zzhiv {
    private final zzcin zza;

    public zzcir(zzcin zzcinVar) {
        this.zza = zzcinVar;
    }

    public final WeakReference zza() {
        WeakReference weakReferenceZzg = this.zza.zzg();
        zzhjd.zzb(weakReferenceZzg);
        return weakReferenceZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* synthetic */ Object zzb() {
        WeakReference weakReferenceZzg = this.zza.zzg();
        zzhjd.zzb(weakReferenceZzg);
        return weakReferenceZzg;
    }
}
