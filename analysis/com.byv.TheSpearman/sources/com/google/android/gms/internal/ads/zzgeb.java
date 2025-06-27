package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgeb implements Runnable {
    final Future zza;
    final zzgea zzb;

    zzgeb(Future future, zzgea zzgeaVar) {
        this.zza = future;
        this.zzb = zzgeaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Object obj = this.zza;
        if ((obj instanceof zzgfh) && (thZza = zzgfi.zza((zzgfh) obj)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgee.zzp(this.zza));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfwj zzfwjVarZza = zzfwk.zza(this);
        zzfwjVarZza.zza(this.zzb);
        return zzfwjVarZza.toString();
    }
}
