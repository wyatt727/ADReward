package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeyi implements zzewr {
    private final Context zza;
    private final String zzb;
    private final zzgep zzc;

    public zzeyi(zzbxf zzbxfVar, Context context, String str, zzgep zzgepVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzgepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeyj(new JSONObject());
            }
        });
    }
}
