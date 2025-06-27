package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcol implements zzcob {
    private final zzdxf zza;

    zzcol(zzdxf zzdxfVar) {
        this.zza = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcob
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzje)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
