package com.google.android.gms.internal.ads;

import com.json.mediationsdk.utils.c;
import com.vungle.ads.internal.ui.AdActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzecs implements zzbpj {
    zzecs() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzect zzectVar = (zzect) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjh)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzectVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzectVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzectVar.zzd.zzd());
        jSONObject2.put("signals", zzectVar.zzc);
        jSONObject3.put("body", zzectVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zzb().zzj(zzectVar.zzb.zzb));
        jSONObject3.put("response_code", zzectVar.zzb.zza);
        jSONObject3.put("latency", zzectVar.zzb.zzd);
        jSONObject.put(AdActivity.REQUEST_KEY_EXTRA, jSONObject2);
        jSONObject.put(c.Y1, jSONObject3);
        jSONObject.put("flags", zzectVar.zzd.zzi());
        return jSONObject;
    }
}
