package com.google.android.gms.internal.ads;

import com.google.ads.mediation.mintegral.MintegralConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdsd {
    private final Map zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdsd(Executor executor) {
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzf() {
        JSONObject jSONObjectZzf;
        Map map;
        this.zzd = true;
        zzcbb zzcbbVarZzg = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg();
        if (zzcbbVarZzg != null && (jSONObjectZzf = zzcbbVarZzg.zzf()) != null) {
            this.zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdW)).booleanValue() ? jSONObjectZzf.optJSONObject("common_settings") : null;
            this.zze = jSONObjectZzf.optJSONObject("ad_unit_patterns");
            JSONArray jSONArrayOptJSONArray = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString(MintegralConstants.AD_UNIT_ID);
                        String strOptString2 = jSONObjectOptJSONObject.optString("format");
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                        if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                            if (this.zza.containsKey(strOptString2)) {
                                map = (Map) this.zza.get(strOptString2);
                            } else {
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                this.zza.put(strOptString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(strOptString, jSONObjectOptJSONObject2);
                        }
                    }
                }
            }
        }
    }

    @CheckForNull
    public final JSONObject zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdW)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    @CheckForNull
    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdV)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzf();
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strZza = zzdsf.zza(this.zze, str, str2);
        if (strZza != null) {
            return (JSONObject) map.get(strZza);
        }
        return null;
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzp(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }

    final /* synthetic */ void zze() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }
}
