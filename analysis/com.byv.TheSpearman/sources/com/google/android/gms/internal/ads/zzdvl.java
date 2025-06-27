package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.json.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdvl {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* synthetic */ zzdvl(String str, zzdvk zzdvkVar) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdvl zzdvlVar) throws JSONException {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjO);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdvlVar.zza);
            jSONObject.put("eventCategory", zzdvlVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdvlVar.zzc);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, zzdvlVar.zzd);
            jSONObject.putOpt("rewardType", zzdvlVar.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, zzdvlVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
