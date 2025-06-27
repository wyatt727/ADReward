package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzbnu {
    public static void zza(zzbnv zzbnvVar, String str, Map map) {
        try {
            zzbnvVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbnv zzbnvVar, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbnvVar.zza(sb.toString());
    }

    public static void zzc(zzbnv zzbnvVar, String str, String str2) {
        zzbnvVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbnv zzbnvVar, String str, JSONObject jSONObject) {
        zzbnvVar.zzb(str, jSONObject.toString());
    }
}
