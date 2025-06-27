package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeac extends zzdzw {
    private String zzg;
    private int zzh = 1;

    zzeac(Context context) {
        this.zzf = new zzbwa(context, com.google.android.gms.ads.internal.zzu.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdzw, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeal(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    try {
                        int i = this.zzh;
                        if (i == 2) {
                            this.zzf.zzp().zze(this.zze, new zzdzv(this));
                        } else if (i == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzdzv(this));
                        } else {
                            this.zza.zzd(new zzeal(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeal(1));
                    }
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzeal(1));
                }
            }
        }
    }

    public final ListenableFuture zzb(zzbxd zzbxdVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzgee.zzg(new zzeal(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbxdVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaa
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzcbr.zzf);
            return this.zza;
        }
    }

    public final ListenableFuture zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzgee.zzg(new zzeal(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeab
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzcbr.zzf);
            return this.zza;
        }
    }
}
