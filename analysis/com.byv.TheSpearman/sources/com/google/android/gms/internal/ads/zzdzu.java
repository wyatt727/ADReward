package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzu extends zzdzw {
    public zzdzu(Context context) {
        this.zzf = new zzbwa(context, com.google.android.gms.ads.internal.zzu.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzdzv(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzeal(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zzd(new zzeal(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzw, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeal(1));
    }
}
