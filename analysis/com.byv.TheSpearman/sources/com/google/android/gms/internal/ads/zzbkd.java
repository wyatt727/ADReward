package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkd implements zzbky {
    zzbkd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        zzcgm zzcgmVar = (zzcgm) obj;
        zzbgs zzbgsVarZzK = zzcgmVar.zzK();
        if (zzbgsVarZzK == null || (jSONObjectZza = zzbgsVarZzK.zza()) == null) {
            zzcgmVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcgmVar.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
