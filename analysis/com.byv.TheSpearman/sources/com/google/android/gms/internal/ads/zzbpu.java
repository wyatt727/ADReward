package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbpu implements zzbpg {
    private final zzbpi zza;
    private final zzbpj zzb;
    private final zzbpc zzc;
    private final String zzd;

    zzbpu(zzbpc zzbpcVar, String str, zzbpj zzbpjVar, zzbpi zzbpiVar) {
        this.zzc = zzbpcVar;
        this.zzd = str;
        this.zzb = zzbpjVar;
        this.zza = zzbpiVar;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbpu zzbpuVar, zzbow zzbowVar, zzbpd zzbpdVar, Object obj, zzcbw zzcbwVar) throws JSONException {
        try {
            com.google.android.gms.ads.internal.zzu.zzp();
            String string = UUID.randomUUID().toString();
            zzbkx.zzo.zzc(string, new zzbpt(zzbpuVar, zzbowVar, zzcbwVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzbpuVar.zzb.zzb(obj));
            zzbpdVar.zzl(zzbpuVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcbwVar.zzd(e);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbowVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final ListenableFuture zzb(Object obj) {
        zzcbw zzcbwVar = new zzcbw();
        zzbow zzbowVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbowVarZzb.zzj(new zzbpr(this, zzbowVarZzb, obj, zzcbwVar), new zzbps(this, zzcbwVar, zzbowVarZzb));
        return zzcbwVar;
    }
}
