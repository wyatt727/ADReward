package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.json.mediationsdk.metadata.a;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbxg {
    private final List zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final String zzh;
    private final String zzi;
    private final int zzj;
    private final JSONObject zzk;
    private final String zzl;
    private final String zzm;
    private final long zzn;
    private final long zzo;

    public zzbxg(JSONObject jSONObject) {
        this.zzi = jSONObject.optString("url");
        this.zzb = jSONObject.optString("base_uri");
        this.zzc = jSONObject.optString("post_parameters");
        this.zze = zzm(jSONObject.optString("drt_include"));
        this.zzf = zzm(jSONObject.optString("cookies_include", a.g));
        this.zzg = jSONObject.optString("request_id");
        this.zzd = jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.zza = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.zzj = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.zzh = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.zzk = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.zzl = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzm = jSONObject.optString("pool_key");
        this.zzn = zzl(jSONObject.optString("start_time")).longValue();
        this.zzo = zzl(jSONObject.optString("end_time")).longValue();
    }

    private static Long zzl(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static boolean zzm(String str) {
        return str != null && (str.equals("1") || str.equals(a.g));
    }

    public final int zza() {
        return this.zzj;
    }

    public final long zzb() {
        return this.zzo;
    }

    public final long zzc() {
        return this.zzn;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzm;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzi;
    }

    public final List zzh() {
        return this.zza;
    }

    public final JSONObject zzi() {
        return this.zzk;
    }

    public final boolean zzj() {
        return this.zzf;
    }

    public final boolean zzk() {
        return this.zze;
    }
}
