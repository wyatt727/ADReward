package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeyx implements zzewr {
    final zzgep zza;
    final Context zzb;
    final zzbcm zzc;

    public zzeyx(zzbcm zzbcmVar, zzgep zzgepVar, Context context) {
        this.zzc = zzbcmVar;
        this.zza = zzgepVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeyy(new JSONObject());
            }
        });
    }
}
