package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbke implements zzbky {
    zzbke() {
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzcgm zzcgmVar = (zzcgm) obj;
        zzbgs zzbgsVarZzK = zzcgmVar.zzK();
        if (zzbgsVarZzK == null || (jSONObjectZzb = zzbgsVarZzK.zzb()) == null) {
            zzcgmVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcgmVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
