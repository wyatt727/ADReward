package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcs;
import com.json.t2;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzget extends zzgcs.zzi implements Runnable {
    private final Runnable zza;

    public zzget(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    protected final String zza() {
        return "task=[" + this.zza.toString() + t2.i.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }
}
