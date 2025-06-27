package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzy extends zzdzw {
    zzdzy(Context context) {
        this.zzf = new zzbwa(context, com.google.android.gms.ads.internal.zzu.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdzv(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzeal(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzeal(1));
                }
            }
        }
    }

    public final ListenableFuture zzb(zzbxd zzbxdVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbxdVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzcbr.zzf);
            return this.zza;
        }
    }
}
