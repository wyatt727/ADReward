package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgw implements ServiceConnection {
    final /* synthetic */ zzgt zza;
    private final String zzb;

    zzgw(zzgt zzgtVar, String str) {
        this.zza = zzgtVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws IllegalStateException {
        if (iBinder == null) {
            this.zza.zza.zzj().zzu().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzby zzbyVarZza = com.google.android.gms.internal.measurement.zzcb.zza(iBinder);
            if (zzbyVarZza == null) {
                this.zza.zza.zzj().zzu().zza("Install Referrer Service implementation was not found");
            } else {
                this.zza.zza.zzj().zzp().zza("Install Referrer Service connected");
                this.zza.zza.zzl().zzb(new zzgv(this, zzbyVarZza, this));
            }
        } catch (RuntimeException e) {
            this.zza.zza.zzj().zzu().zza("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws IllegalStateException {
        this.zza.zza.zzj().zzp().zza("Install Referrer Service disconnected");
    }
}
