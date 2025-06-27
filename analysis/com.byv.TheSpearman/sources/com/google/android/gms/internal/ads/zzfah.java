package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfah implements zzewq {
    private final String zza;

    public zzfah(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzewq
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbw.zzf(jSONObject, "pii").put("adsid", this.zza);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed putting trustless token.", e);
        }
    }
}
