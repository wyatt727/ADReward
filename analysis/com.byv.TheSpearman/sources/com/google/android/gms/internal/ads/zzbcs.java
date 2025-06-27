package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbcs implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcbw zza;
    final /* synthetic */ zzbct zzb;

    zzbcs(zzbct zzbctVar, zzcbw zzcbwVar) {
        this.zza = zzcbwVar;
        this.zzb = zzbctVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
