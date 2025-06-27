package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzln implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdi zzb;
    private final /* synthetic */ zzld zzc;

    zzln(zzld zzldVar, zzo zzoVar, com.google.android.gms.internal.measurement.zzdi zzdiVar) {
        this.zza = zzoVar;
        this.zzb = zzdiVar;
        this.zzc = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        try {
            if (!this.zzc.zzk().zzn().zzj()) {
                this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzm().zza((String) null);
                this.zzc.zzk().zze.zza(null);
                return;
            }
            zzfs zzfsVar = this.zzc.zzb;
            if (zzfsVar == null) {
                this.zzc.zzj().zzg().zza("Failed to get app instance id");
                return;
            }
            Preconditions.checkNotNull(this.zza);
            String strZzb = zzfsVar.zzb(this.zza);
            if (strZzb != null) {
                this.zzc.zzm().zza(strZzb);
                this.zzc.zzk().zze.zza(strZzb);
            }
            this.zzc.zzaq();
            this.zzc.zzq().zza(this.zzb, strZzb);
        } catch (RemoteException e) {
            this.zzc.zzj().zzg().zza("Failed to get app instance id", e);
        } finally {
            this.zzc.zzq().zza(this.zzb, (String) null);
        }
    }
}
