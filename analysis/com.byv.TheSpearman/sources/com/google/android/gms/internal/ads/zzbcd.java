package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbcd implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbcf zza;

    zzbcd(zzbcf zzbcfVar) {
        this.zza = zzbcfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbcf zzbcfVar;
        synchronized (this.zza.zzc) {
            try {
                zzbcfVar = this.zza;
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                zzbcf.zzh(this.zza);
            }
            if (zzbcfVar.zzd != null) {
                zzbcfVar.zzf = zzbcfVar.zzd.zzq();
                this.zza.zzc.notifyAll();
            } else {
                this.zza.zzc.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
