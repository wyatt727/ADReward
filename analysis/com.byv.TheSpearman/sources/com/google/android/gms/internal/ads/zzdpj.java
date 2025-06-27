package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdpj implements zzbky {
    private final zzbii zza;
    private final zzdpx zzb;
    private final zzhip zzc;

    public zzdpj(zzdlj zzdljVar, zzdky zzdkyVar, zzdpx zzdpxVar, zzhip zzhipVar) {
        this.zza = zzdljVar.zzc(zzdkyVar.zzA());
        this.zzb = zzdpxVar;
        this.zzc = zzhipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbhy) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
