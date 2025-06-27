package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzlv implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzbd zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzld zzf;

    zzlv(zzld zzldVar, boolean z, zzo zzoVar, boolean z2, zzbd zzbdVar, String str) {
        this.zza = z;
        this.zzb = zzoVar;
        this.zzc = z2;
        this.zzd = zzbdVar;
        this.zze = str;
        this.zzf = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzfs zzfsVar = this.zzf.zzb;
        if (zzfsVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            this.zzf.zza(zzfsVar, this.zzc ? null : this.zzd, this.zzb);
        } else {
            try {
                if (TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzfsVar.zza(this.zzd, this.zzb);
                } else {
                    zzfsVar.zza(this.zzd, this.zze, this.zzf.zzj().zzx());
                }
            } catch (RemoteException e) {
                this.zzf.zzj().zzg().zza("Failed to send event to the service", e);
            }
        }
        this.zzf.zzaq();
    }
}
