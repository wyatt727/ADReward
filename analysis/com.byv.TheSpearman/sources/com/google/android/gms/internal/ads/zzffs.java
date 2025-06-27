package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzffs {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzffs(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
        this.zzd = jSONObjectZzh;
        this.zza = jSONObjectZzh.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.zzb = jSONObjectZzh.optString("ad_base_url", null);
        this.zzc = jSONObjectZzh.optJSONObject("ad_json");
    }
}
