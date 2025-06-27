package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzexs implements zzewr {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcay zzd;

    public zzexs(zzcay zzcayVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zzd = zzcayVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return zzgee.zzf(zzgee.zzm(zzgee.zzh(this.zzb), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzexq
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return new zzext((String) obj);
            }
        }, this.zza), Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzexr
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        return zzgee.zzh(new zzext(this.zzb));
    }
}
