package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdmw implements zzgea {
    final /* synthetic */ zzdmx zza;

    zzdmw(zzdmx zzdmxVar) {
        this.zza = zzdmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfd)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcgm zzcgmVar = (zzcgm) list.get(0);
            if (zzcgmVar != null) {
                this.zza.zzb(zzcgmVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfd)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "omid native display exp");
            }
        }
    }
}
