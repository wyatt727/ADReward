package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeiw implements zzegl {
    private final zzdry zza;

    public zzeiw(zzdry zzdryVar) {
        this.zza = zzdryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final zzegm zza(String str, JSONObject jSONObject) throws zzfgp {
        return new zzegm(this.zza.zzc(str, jSONObject), new zzeif(), str);
    }
}
