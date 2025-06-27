package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.json.t2;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcaf {
    static Uri zza(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + t2.i.b + str3 + t2.i.c + str.substring(i));
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzu.zzn().zzp(context)) {
            return uri.toString();
        }
        String strZza = com.google.android.gms.ads.internal.zzu.zzn().zza(context);
        if (strZza == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzae);
        String string = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzad)).booleanValue() && string.contains(str)) {
            com.google.android.gms.ads.internal.zzu.zzn().zzj(context, strZza);
            return zzd(string, context).replace(str, strZza);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        String string2 = zza(zzd(string, context), "fbs_aeid", strZza).toString();
        com.google.android.gms.ads.internal.zzu.zzn().zzj(context, strZza);
        return string2;
    }

    public static String zzc(String str, Context context, boolean z) {
        String strZza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzal)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzu.zzn().zzp(context) || TextUtils.isEmpty(str) || (strZza = com.google.android.gms.ads.internal.zzu.zzn().zza(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzae);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzad)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzu.zzp().zzi(str)) {
                com.google.android.gms.ads.internal.zzu.zzn().zzj(context, strZza);
                return zzd(str, context).replace(str2, strZza);
            }
            if (!com.google.android.gms.ads.internal.zzu.zzp().zzj(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzu.zzn().zzk(context, strZza);
            return zzd(str, context).replace(str2, strZza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzu.zzp().zzi(str)) {
            com.google.android.gms.ads.internal.zzu.zzn().zzj(context, strZza);
            return zza(zzd(str, context), "fbs_aeid", strZza).toString();
        }
        if (!com.google.android.gms.ads.internal.zzu.zzp().zzj(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzu.zzn().zzk(context, strZza);
        return zza(zzd(str, context), "fbs_aeid", strZza).toString();
    }

    private static String zzd(String str, Context context) {
        String strZzd = com.google.android.gms.ads.internal.zzu.zzn().zzd(context);
        String strZzb = com.google.android.gms.ads.internal.zzu.zzn().zzb(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzd)) {
            str = zza(str, "gmp_app_id", strZzd).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzb)) ? str : zza(str, "fbs_aiid", strZzb).toString();
    }
}
