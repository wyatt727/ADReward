package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbas {
    private final Object zza = new Object();
    private zzbaq zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzbaq zzbaqVar = this.zzb;
            if (zzbaqVar == null) {
                return null;
            }
            return zzbaqVar.zza();
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzbaq zzbaqVar = this.zzb;
            if (zzbaqVar == null) {
                return null;
            }
            return zzbaqVar.zzb();
        }
    }

    public final void zzc(zzbar zzbarVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzbaq();
            }
            this.zzb.zzf(zzbarVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzbaq();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzbar zzbarVar) {
        synchronized (this.zza) {
            zzbaq zzbaqVar = this.zzb;
            if (zzbaqVar == null) {
                return;
            }
            zzbaqVar.zzh(zzbarVar);
        }
    }
}
