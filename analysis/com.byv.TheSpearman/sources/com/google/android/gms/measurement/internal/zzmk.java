package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzmo;
import com.json.t2;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmk<T extends Context & zzmo> {
    private final T zza;

    public final int zza(final Intent intent, int i, final int i2) throws IllegalStateException {
        final zzfz zzfzVarZzj = zzhm.zza(this.zza, null, null).zzj();
        if (intent == null) {
            zzfzVarZzj.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzfzVarZzj.zzp().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmm
                @Override // java.lang.Runnable
                public final void run() throws IllegalStateException {
                    this.zza.zza(i2, zzfzVarZzj, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder zza(Intent intent) throws IllegalStateException {
        if (intent == null) {
            zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzhq(zzni.zza(this.zza));
        }
        zzc().zzu().zza("onBind received unknown action", action);
        return null;
    }

    private final zzfz zzc() {
        return zzhm.zza(this.zza, null, null).zzj();
    }

    public zzmk(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    final /* synthetic */ void zza(int i, zzfz zzfzVar, Intent intent) throws IllegalStateException {
        if (this.zza.zza(i)) {
            zzfzVar.zzp().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzc().zzp().zza("Completed wakeful intent.");
            this.zza.zza(intent);
        }
    }

    final /* synthetic */ void zza(zzfz zzfzVar, JobParameters jobParameters) throws IllegalStateException {
        zzfzVar.zzp().zza("AppMeasurementJobService processed last upload request.");
        this.zza.zza(jobParameters, false);
    }

    public final void zza() throws IllegalStateException {
        zzhm.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    public final void zzb() throws IllegalStateException {
        zzhm.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzb(Intent intent) throws IllegalStateException {
        if (intent == null) {
            zzc().zzg().zza("onRebind called with null intent");
        } else {
            zzc().zzp().zza("onRebind called. action", intent.getAction());
        }
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        zzni zzniVarZza = zzni.zza(this.zza);
        zzniVarZza.zzl().zzb(new zzml(this, zzniVarZza, runnable));
    }

    public final boolean zza(final JobParameters jobParameters) throws IllegalStateException {
        final zzfz zzfzVarZzj = zzhm.zza(this.zza, null, null).zzj();
        String string = jobParameters.getExtras().getString(t2.h.h);
        zzfzVarZzj.zzp().zza("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmj
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException {
                this.zza.zza(zzfzVarZzj, jobParameters);
            }
        });
        return true;
    }

    public final boolean zzc(Intent intent) throws IllegalStateException {
        if (intent == null) {
            zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzp().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
