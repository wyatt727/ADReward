package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzcsz implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcsz(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzctb.zzi(this.zza);
    }
}
