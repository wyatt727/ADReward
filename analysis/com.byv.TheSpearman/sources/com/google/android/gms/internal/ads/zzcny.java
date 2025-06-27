package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcny {
    private final Map zza;
    private final Map zzb;

    zzcny(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzffz zzffzVar) throws Exception {
        for (zzffx zzffxVar : zzffzVar.zzb.zzc) {
            if (this.zza.containsKey(zzffxVar.zza)) {
                ((zzcob) this.zza.get(zzffxVar.zza)).zza(zzffxVar.zzb);
            } else if (this.zzb.containsKey(zzffxVar.zza)) {
                zzcoa zzcoaVar = (zzcoa) this.zzb.get(zzffxVar.zza);
                JSONObject jSONObject = zzffxVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzcoaVar.zza(map);
            }
        }
    }
}
