package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzexn implements zzewq {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfto zzc;

    public zzexn(AdvertisingIdClient.Info info, String str, zzfto zzftoVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzftoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewq
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbw.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectZzf.put("pdid", str);
                    jSONObjectZzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzf.put("rdid", this.zza.getId());
            jSONObjectZzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            jSONObjectZzf.put("idtype", "adid");
            zzfto zzftoVar = this.zzc;
            if (zzftoVar.zzc()) {
                jSONObjectZzf.put("paidv1_id_android_3p", zzftoVar.zzb());
                jSONObjectZzf.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
