package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqh {
    private final Executor zza;

    public zzaqh(Handler handler) {
        this.zza = new zzaqf(this, handler);
    }

    public final void zza(zzaqq zzaqqVar, zzaqz zzaqzVar) {
        zzaqqVar.zzm("post-error");
        ((zzaqf) this.zza).zza.post(new zzaqg(zzaqqVar, zzaqw.zza(zzaqzVar), null));
    }

    public final void zzb(zzaqq zzaqqVar, zzaqw zzaqwVar, Runnable runnable) {
        zzaqqVar.zzq();
        zzaqqVar.zzm("post-response");
        ((zzaqf) this.zza).zza.post(new zzaqg(zzaqqVar, zzaqwVar, runnable));
    }
}
