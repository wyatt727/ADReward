package com.google.android.gms.internal.ads;

import com.json.mediationsdk.d;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbqi {
    public final List zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final List zzf;
    public final String zzg;
    public final String zzh;

    public zzbqi(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzbqh zzbqhVar = new zzbqh(jSONArray.getJSONObject(i2));
                AdFormat.BANNER.equalsIgnoreCase(zzbqhVar.zzv);
                arrayList.add(zzbqhVar);
                if (i < 0) {
                    Iterator it = zzbqhVar.zzc.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        this.zzg = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(d.g);
        if (jSONObjectOptJSONObject == null) {
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzh = null;
            return;
        }
        jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzb = zzbqj.zza(jSONObjectOptJSONObject, "click_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzc = zzbqj.zza(jSONObjectOptJSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzd = zzbqj.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zze = zzbqj.zza(jSONObjectOptJSONObject, "nofill_urls");
        com.google.android.gms.ads.internal.zzu.zzg();
        this.zzf = zzbqj.zza(jSONObjectOptJSONObject, "remote_ping_urls");
        jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        jSONObjectOptJSONObject.optLong(ToolBar.REFRESH, -1L);
        zzbyc zzbycVarZza = zzbyc.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (zzbycVarZza == null) {
            this.zzh = null;
        } else {
            this.zzh = zzbycVarZza.zza;
        }
        jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
