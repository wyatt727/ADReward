package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccp implements Runnable {
    final /* synthetic */ zzccr zza;

    zzccp(zzccr zzccrVar) {
        this.zza = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccr zzccrVar = this.zza;
        if (zzccrVar.zzq != null) {
            if (!zzccrVar.zzr) {
                zzccrVar.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
