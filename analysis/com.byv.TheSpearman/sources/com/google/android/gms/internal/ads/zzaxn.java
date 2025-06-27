package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaxn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzaxp zzb;

    zzaxn(zzaxp zzaxpVar, int i, boolean z) {
        this.zza = i;
        this.zzb = zzaxpVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzaud zzaudVarZza;
        int i = this.zza;
        zzaxp zzaxpVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzaxpVar.zza.getPackageManager().getPackageInfo(zzaxpVar.zza.getPackageName(), 0);
            Context context = zzaxpVar.zza;
            zzaudVarZza = zzfpx.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzaudVarZza = null;
        }
        this.zzb.zzm = zzaudVarZza;
        if (this.zza < 4) {
            if (zzaudVarZza != null && zzaudVarZza.zzar() && !zzaudVarZza.zzi().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaudVarZza.zzas() && zzaudVarZza.zzg().zze() && zzaudVarZza.zzg().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
