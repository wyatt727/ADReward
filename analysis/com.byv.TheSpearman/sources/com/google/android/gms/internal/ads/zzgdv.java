package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzgdv extends zzgef {
    zzgdv() {
    }

    public static zzgdv zzu(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgdv ? (zzgdv) listenableFuture : new zzgdw(listenableFuture);
    }
}
