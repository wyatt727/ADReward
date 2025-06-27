package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzlk implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzld zzd;

    zzlk(zzld zzldVar, AtomicReference atomicReference, zzo zzoVar, boolean z) {
        this.zza = atomicReference;
        this.zzb = zzoVar;
        this.zzc = z;
        this.zzd = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfs zzfsVar;
        synchronized (this.zza) {
            try {
                try {
                    zzfsVar = this.zzd.zzb;
                } catch (RemoteException e) {
                    this.zzd.zzj().zzg().zza("Failed to get all user properties; remote exception", e);
                }
                if (zzfsVar == null) {
                    this.zzd.zzj().zzg().zza("Failed to get all user properties; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzfsVar.zza(this.zzb, this.zzc));
                this.zzd.zzaq();
                this.zza.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
