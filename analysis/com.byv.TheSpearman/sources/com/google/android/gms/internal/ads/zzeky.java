package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeky implements zzegl {
    private final Map zza = new HashMap();
    private final zzdry zzb;

    public zzeky(zzdry zzdryVar) {
        this.zzb = zzdryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final zzegm zza(String str, JSONObject jSONObject) throws zzfgp {
        zzegm zzegmVar;
        synchronized (this) {
            zzegmVar = (zzegm) this.zza.get(str);
            if (zzegmVar == null) {
                zzegmVar = new zzegm(this.zzb.zzc(str, jSONObject), new zzeig(), str);
                this.zza.put(str, zzegmVar);
            }
        }
        return zzegmVar;
    }
}
