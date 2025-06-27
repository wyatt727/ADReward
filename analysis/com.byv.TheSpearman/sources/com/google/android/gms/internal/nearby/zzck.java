package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionInfo;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzck extends ConnectionLifecycleCallback {
    final /* synthetic */ zzcn zza;
    private final ConnectionLifecycleCallback zzb;

    zzck(zzcn zzcnVar, ConnectionLifecycleCallback connectionLifecycleCallback) {
        this.zza = zzcnVar;
        this.zzb = connectionLifecycleCallback;
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onConnectionInitiated(String str, ConnectionInfo connectionInfo) {
        if (connectionInfo.isIncomingConnection()) {
            this.zza.zzf(str);
        }
        this.zzb.onConnectionInitiated(str, connectionInfo);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onConnectionResult(String str, ConnectionResolution connectionResolution) {
        if (!connectionResolution.getStatus().isSuccess()) {
            this.zza.zzg(str);
        }
        this.zzb.onConnectionResult(str, connectionResolution);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onDisconnected(String str) {
        this.zza.zzg(str);
        this.zzb.onDisconnected(str);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void zza(String str, com.google.android.gms.nearby.connection.zzg zzgVar) {
        this.zzb.zza(str, zzgVar);
    }
}
