package com.google.android.gms.internal.games;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzfe {
    private final AtomicReference<zzfd> zzha = new AtomicReference<>();

    protected abstract zzfd zzag();

    public final void flush() {
        zzfd zzfdVar = this.zzha.get();
        if (zzfdVar != null) {
            zzfdVar.flush();
        }
    }

    public final void zzb(String str, int i) {
        zzfd zzfdVarZzag = this.zzha.get();
        if (zzfdVarZzag == null) {
            zzfdVarZzag = zzag();
            if (!this.zzha.compareAndSet(null, zzfdVarZzag)) {
                zzfdVarZzag = this.zzha.get();
            }
        }
        zzfdVarZzag.zze(str, i);
    }
}
