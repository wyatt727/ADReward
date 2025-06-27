package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcoj implements zzcoa {
    private final zzegh zza;

    zzcoj(zzegh zzeghVar) {
        this.zza = zzeghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkd)).booleanValue()) {
            zzgee.zzf(zzgdv.zzu(this.zza.zza(true)), Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcoi
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                    return zzgee.zzh(new GetTopicsResponse(zzfzn.zzm()));
                }
            }, zzcbr.zza);
        }
    }
}
