package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzlh implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzo zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdi zze;
    private final /* synthetic */ zzld zzf;

    zzlh(zzld zzldVar, String str, String str2, zzo zzoVar, boolean z, com.google.android.gms.internal.measurement.zzdi zzdiVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzoVar;
        this.zzd = z;
        this.zze = zzdiVar;
        this.zzf = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        Bundle bundle = new Bundle();
        try {
            zzfs zzfsVar = this.zzf.zzb;
            if (zzfsVar == null) {
                this.zzf.zzj().zzg().zza("Failed to get user properties; not connected to service", this.zza, this.zzb);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            Bundle bundleZza = zzny.zza(zzfsVar.zza(this.zza, this.zzb, this.zzd, this.zzc));
            this.zzf.zzaq();
            this.zzf.zzq().zza(this.zze, bundleZza);
        } catch (RemoteException e) {
            this.zzf.zzj().zzg().zza("Failed to get user properties; remote exception", this.zza, e);
        } finally {
            this.zzf.zzq().zza(this.zze, bundle);
        }
    }
}
