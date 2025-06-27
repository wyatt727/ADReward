package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbce implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbcf zza;

    zzbce(zzbcf zzbcfVar) {
        this.zza = zzbcfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzbcf zzbcfVar = this.zza;
            if (zzbcfVar.zzd != null) {
                zzbcfVar.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
