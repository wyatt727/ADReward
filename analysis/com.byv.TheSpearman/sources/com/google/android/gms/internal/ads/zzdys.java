package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdys implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzdys(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzawo zzawoVar = (zzawo) this.zza.zzb();
        final Context contextZza = ((zzciq) this.zzb).zza();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        ListenableFuture listenableFutureZzb = zzgepVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzawoVar.zzc().zzg(contextZza);
            }
        });
        zzhjd.zzb(listenableFutureZzb);
        return listenableFutureZzb;
    }
}
