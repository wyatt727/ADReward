package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgdr extends zzgdd {

    @CheckForNull
    private zzgdq zza;

    zzgdr(zzfzi zzfziVar, boolean z, Executor executor, Callable callable) {
        super(zzfziVar, z, false);
        this.zza = new zzgdp(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    final void zzf(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    protected final void zzq() {
        zzgdq zzgdqVar = this.zza;
        if (zzgdqVar != null) {
            zzgdqVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    final void zzu() {
        zzgdq zzgdqVar = this.zza;
        if (zzgdqVar != null) {
            zzgdqVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
