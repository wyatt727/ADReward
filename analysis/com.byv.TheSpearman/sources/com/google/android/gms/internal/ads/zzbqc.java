package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbqc implements zzgdl {
    private final zzbpi zza;
    private final zzbpj zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzd;

    zzbqc(ListenableFuture listenableFuture, String str, zzbpj zzbpjVar, zzbpi zzbpiVar) {
        this.zzd = listenableFuture;
        this.zzb = zzbpjVar;
        this.zza = zzbpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgee.zzn(this.zzd, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzbqa
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbpd) obj2);
            }
        }, zzcbr.zzf);
    }

    final /* synthetic */ ListenableFuture zzc(Object obj, zzbpd zzbpdVar) throws Exception {
        zzcbw zzcbwVar = new zzcbw();
        com.google.android.gms.ads.internal.zzu.zzp();
        String string = UUID.randomUUID().toString();
        zzbkx.zzo.zzc(string, new zzbqb(this, zzcbwVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbpdVar.zzl(this.zzc, jSONObject);
        return zzcbwVar;
    }
}
