package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeai implements zzeak {
    private final Map zza;
    private final zzgep zzb;
    private final zzdbj zzc;

    public zzeai(Map map, zzgep zzgepVar, zzdbj zzdbjVar) {
        this.zza = map;
        this.zzb = zzgepVar;
        this.zzc = zzdbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeak
    public final ListenableFuture zzb(final zzbxd zzbxdVar) {
        this.zzc.zzdn(zzbxdVar);
        ListenableFuture listenableFutureZzg = zzgee.zzg(new zzdyi(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzih)).split(",")) {
            final zzhjm zzhjmVar = (zzhjm) this.zza.get(str.trim());
            if (zzhjmVar != null) {
                listenableFutureZzg = zzgee.zzf(listenableFutureZzg, zzdyi.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeag
                    @Override // com.google.android.gms.internal.ads.zzgdl
                    public final ListenableFuture zza(Object obj) {
                        return ((zzeak) zzhjmVar.zzb()).zzb(zzbxdVar);
                    }
                }, this.zzb);
            }
        }
        zzgee.zzr(listenableFutureZzg, new zzeah(this), zzcbr.zzf);
        return listenableFutureZzg;
    }
}
