package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzebj {
    private final zzgep zza;
    private final zzgep zzb;
    private final zzecb zzc;

    zzebj(zzgep zzgepVar, zzgep zzgepVar2, zzecb zzecbVar) {
        this.zza = zzgepVar;
        this.zzb = zzgepVar2;
        this.zzc = zzecbVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbwe zzbweVar) throws Exception {
        return this.zzc.zza(zzbweVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzll)).longValue());
    }

    public final ListenableFuture zzb(final zzbwe zzbweVar) {
        ListenableFuture listenableFutureZzf;
        String str = zzbweVar.zzb;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            listenableFutureZzf = zzgee.zzg(new zzeal(1, "Ads signal service force local"));
        } else {
            listenableFutureZzf = zzgee.zzf(zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.internal.ads.zzebf
                @Override // com.google.android.gms.internal.ads.zzgdk
                public final ListenableFuture zza() {
                    return this.zza.zza(zzbweVar);
                }
            }, this.zza), ExecutionException.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzebg
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    ExecutionException executionException = (ExecutionException) obj;
                    Throwable cause = executionException.getCause();
                    Throwable cause2 = executionException;
                    if (cause != null) {
                        cause2 = executionException.getCause();
                    }
                    return zzgee.zzg(cause2);
                }
            }, this.zzb);
        }
        return zzgee.zzn(zzgee.zzf(zzgdv.zzu(listenableFutureZzf), zzeal.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzebh
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(null);
            }
        }, this.zzb), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzgee.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzt.zzN(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzgee.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
