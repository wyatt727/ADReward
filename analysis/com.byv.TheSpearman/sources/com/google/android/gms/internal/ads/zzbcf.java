package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcf {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbcb(this);
    private final Object zzc = new Object();
    private zzbci zzd;
    private Context zze;
    private zzbcl zzf;

    static /* bridge */ /* synthetic */ void zzh(zzbcf zzbcfVar) {
        synchronized (zzbcfVar.zzc) {
            zzbci zzbciVar = zzbcfVar.zzd;
            if (zzbciVar == null) {
                return;
            }
            if (zzbciVar.isConnected() || zzbcfVar.zzd.isConnecting()) {
                zzbcfVar.zzd.disconnect();
            }
            zzbcfVar.zzd = null;
            zzbcfVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbci zzbciVarZzd = zzd(new zzbcd(this), new zzbce(this));
                this.zzd = zzbciVarZzd;
                zzbciVarZzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbcj zzbcjVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzbcjVar);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzbcg zzb(zzbcj zzbcjVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbcg();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbcjVar);
                }
                return this.zzf.zzf(zzbcjVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to call into cache service.", e);
                return new zzbcg();
            }
        }
    }

    protected final synchronized zzbci zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbci(this.zze, com.google.android.gms.ads.internal.zzu.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeh)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeg)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzb().zzc(new zzbcc(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzei)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcbr.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzej)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
