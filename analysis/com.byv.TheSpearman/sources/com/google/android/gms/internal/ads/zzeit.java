package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeit extends zzbsd {
    private final zzegm zza;

    @Override // com.google.android.gms.internal.ads.zzbse
    public final void zze(String str) throws RemoteException {
        ((zzeif) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbse
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeif) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbse
    public final void zzg() throws RemoteException {
        ((zzeif) this.zza.zzc).zzo();
    }
}
