package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzebo {
    private final zzgep zza;
    private final zzebj zzb;
    private final zzfkn zzc;

    zzebo(zzgep zzgepVar, zzebj zzebjVar, zzfkn zzfknVar) {
        this.zza = zzgepVar;
        this.zzb = zzebjVar;
        this.zzc = zzfknVar;
    }

    public final ListenableFuture zza(final zzbxd zzbxdVar) {
        zzfke zzfkeVarZzb = this.zzc.zzb(zzfkh.GMS_SIGNALS, zzgee.zzm(zzgee.zzh(null), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzebl
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                zzbxd zzbxdVar2 = zzbxdVar;
                return new zzbwe(zzbxdVar2.zzc, zzbxdVar2.zzd, zzbxdVar2.zzf, zzfxg.zzc(zzbxdVar2.zza.getString("ms")), -1, zzbxdVar2.zzh, zzbxdVar2.zze, zzbxdVar2.zzk, zzbxdVar2.zzl);
            }
        }, this.zza));
        final zzebj zzebjVar = this.zzb;
        Objects.requireNonNull(zzebjVar);
        return zzgee.zzm(zzfkeVarZzb.zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzebm
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzebjVar.zzb((zzbwe) obj);
            }
        }).zza(), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbxdVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(bundle);
                    try {
                        com.google.android.gms.ads.internal.client.zzay.zzb().zzl(jSONObject, jSONObjectZzi);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectZzi;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.zza);
    }
}
