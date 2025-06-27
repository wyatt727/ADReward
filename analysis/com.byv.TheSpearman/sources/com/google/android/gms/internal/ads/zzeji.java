package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeji extends zzbsg {
    final /* synthetic */ zzejj zza;
    private final zzegm zzb;

    /* synthetic */ zzeji(zzejj zzejjVar, zzegm zzegmVar, zzejh zzejhVar) {
        this.zza = zzejjVar;
        this.zzb = zzegmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zze(String str) throws RemoteException {
        ((zzeif) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeif) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzg(zzbrd zzbrdVar) throws RemoteException {
        this.zza.zzc = zzbrdVar;
        ((zzeif) this.zzb.zzc).zzo();
    }
}
