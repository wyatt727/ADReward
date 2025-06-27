package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaxx implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzaxy zza;

    zzaxx(zzaxy zzaxyVar) {
        this.zza = zzaxyVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzaxy zzaxyVar = this.zza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzaxyVar.zzc > 0) {
            zzaxy zzaxyVar2 = this.zza;
            if (jCurrentTimeMillis >= zzaxyVar2.zzc) {
                zzaxyVar2.zzd = jCurrentTimeMillis - zzaxyVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
