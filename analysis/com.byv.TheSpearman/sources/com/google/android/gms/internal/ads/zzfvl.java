package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfvl extends zzfvh {
    final /* synthetic */ zzfvr zza;

    zzfvl(zzfvr zzfvrVar) {
        this.zza = zzfvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zza() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0 && this.zza.zzl.decrementAndGet() > 0) {
                this.zza.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzfvr zzfvrVar = this.zza;
            if (zzfvrVar.zzn != null) {
                zzfvrVar.zzc.zzc("Unbind from service.", new Object[0]);
                zzfvr zzfvrVar2 = this.zza;
                zzfvrVar2.zzb.unbindService(zzfvrVar2.zzm);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
