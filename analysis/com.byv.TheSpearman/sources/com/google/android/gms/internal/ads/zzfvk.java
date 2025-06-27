package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfvk extends zzfvh {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfvh zzb;
    final /* synthetic */ zzfvr zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvk(zzfvr zzfvrVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfvh zzfvhVar) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zzfvhVar;
        this.zzc = zzfvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zza() {
        synchronized (this.zzc.zzg) {
            zzfvr.zzn(this.zzc, this.zza);
            if (this.zzc.zzl.getAndIncrement() > 0) {
                this.zzc.zzc.zzc("Already connected to the service.", new Object[0]);
            }
            zzfvr.zzp(this.zzc, this.zzb);
        }
    }
}
