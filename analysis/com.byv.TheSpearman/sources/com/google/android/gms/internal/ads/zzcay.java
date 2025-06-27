package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcay {
    public final ListenableFuture zza(Context context, int i) {
        zzcbw zzcbwVar = new zzcbw();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu(context)) {
            zzcbr.zza.execute(new zzcax(this, context, zzcbwVar));
        }
        return zzcbwVar;
    }
}
