package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdob {
    private final Context zza;
    private final zzdnk zzb;
    private final zzawo zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbcx zzf;
    private final Executor zzg;
    private final zzbgt zzh;
    private final zzdot zzi;
    private final zzdri zzj;
    private final ScheduledExecutorService zzk;
    private final zzdqd zzl;
    private final zzduh zzm;
    private final zzfmt zzn;
    private final zzefd zzo;
    private final zzefo zzp;
    private final zzfgm zzq;

    public zzdob(Context context, zzdnk zzdnkVar, zzawo zzawoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbcx zzbcxVar, Executor executor, zzfgi zzfgiVar, zzdot zzdotVar, zzdri zzdriVar, ScheduledExecutorService scheduledExecutorService, zzduh zzduhVar, zzfmt zzfmtVar, zzefd zzefdVar, zzdqd zzdqdVar, zzefo zzefoVar, zzfgm zzfgmVar) {
        this.zza = context;
        this.zzb = zzdnkVar;
        this.zzc = zzawoVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbcxVar;
        this.zzg = executor;
        this.zzh = zzfgiVar.zzi;
        this.zzi = zzdotVar;
        this.zzj = zzdriVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzduhVar;
        this.zzn = zzfmtVar;
        this.zzo = zzefdVar;
        this.zzl = zzdqdVar;
        this.zzp = zzefoVar;
        this.zzq = zzfgmVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (jSONObjectOptJSONObject == null) {
            return zzfzn.zzm();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfzn.zzm();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzelVarZzr = zzr(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzelVarZzr != null) {
                arrayList.add(zzelVarZzr);
            }
        }
        return zzfzn.zzk(arrayList);
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgee.zzf(listenableFuture, Exception.class, new zzgdl(obj2) { // from class: com.google.android.gms.internal.ads.zzdnz
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgee.zzh(null);
            }
        }, zzcbr.zzf);
    }

    private static ListenableFuture zzm(boolean z, final ListenableFuture listenableFuture, Object obj) {
        return z ? zzgee.zzn(listenableFuture, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdoa
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj2) {
                return obj2 != null ? listenableFuture : zzgee.zzg(new zzekh(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcbr.zzf) : zzl(listenableFuture, null);
    }

    private final ListenableFuture zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzgee.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgee.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzgee.zzh(new zzbgr(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgee.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdnr
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return new zzbgr(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final ListenableFuture zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgee.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzgee.zzm(zzgee.zzd(arrayList), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdnw
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbgr zzbgrVar : (List) obj) {
                    if (zzbgrVar != null) {
                        arrayList2.add(zzbgrVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzffn zzffnVar, zzffq zzffqVar) {
        final ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzffnVar, zzffqVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgee.zzn(listenableFutureZzb, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdns
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) throws zzekh {
                zzcgm zzcgmVar = (zzcgm) obj;
                if (zzcgmVar == null || zzcgmVar.zzq() == null) {
                    throw new zzekh(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureZzb;
            }
        }, zzcbr.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(strOptString, strOptString2);
    }

    final /* synthetic */ zzbgo zza(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzq = zzq(jSONObject, "bg_color");
        Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbgo(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzffn zzffnVar, zzffq zzffqVar, String str, String str2, Object obj) throws Exception {
        zzcgm zzcgmVarZza = this.zzj.zza(zzqVar, zzffnVar, zzffqVar);
        final zzcbv zzcbvVarZza = zzcbv.zza(zzcgmVarZza);
        zzdqa zzdqaVarZzb = this.zzl.zzb();
        zzcgmVarZza.zzN().zzR(zzdqaVarZzb, zzdqaVarZzb, zzdqaVarZzb, zzdqaVarZzb, zzdqaVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzdqaVarZzb, null, null, null, null);
        zzcgmVarZza.zzae("/getNativeAdViewSignals", zzbkx.zzs);
        zzcgmVarZza.zzae("/getNativeClickMeta", zzbkx.zzt);
        zzcgmVarZza.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdnv
            @Override // com.google.android.gms.internal.ads.zzcia
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcbv zzcbvVar = zzcbvVarZza;
                if (z) {
                    zzcbvVar.zzb();
                    return;
                }
                zzcbvVar.zzd(new zzekh(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcgmVarZza.zzac(str, str2, null);
        return zzcbvVarZza;
    }

    final /* synthetic */ ListenableFuture zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzcgm zzcgmVarZza = zzcgz.zza(this.zza, zzcie.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzcbv zzcbvVarZza = zzcbv.zza(zzcgmVarZza);
        zzcgmVarZza.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdnx
            @Override // com.google.android.gms.internal.ads.zzcia
            public final void zza(boolean z, int i, String str2, String str3) {
                zzcbvVarZza.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeZ)).booleanValue()) {
            zzcgmVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zzcgmVarZza.loadData(str, "text/html", C.UTF8_NAME);
        }
        return zzcbvVarZza;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgee.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), zzgee.zzm(zzo(jSONArrayOptJSONArray, false, true), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdny
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return this.zza.zza(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str) {
        zzbgt zzbgtVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbgtVar.zzb, zzbgtVar.zzd);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, final zzffn zzffnVar, final zzffq zzffqVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjQ)).booleanValue()) {
            return zzgee.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgee.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgee.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzqVarZzk = zzk(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgee.zzh(null);
        }
        final ListenableFuture listenableFutureZzn = zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdnt
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzqVarZzk, zzffnVar, zzffqVar, strOptString, strOptString2, obj);
            }
        }, zzcbr.zze);
        return zzgee.zzn(listenableFutureZzn, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdnu
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) throws zzekh {
                if (((zzcgm) obj) != null) {
                    return listenableFutureZzn;
                }
                throw new zzekh(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcbr.zzf);
    }

    public final ListenableFuture zzh(JSONObject jSONObject, zzffn zzffnVar, zzffq zzffqVar) {
        ListenableFuture listenableFutureZza;
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbw.zzg(jSONObject, "html_containers", "instream");
        if (jSONObjectZzg != null) {
            return zzp(jSONObjectZzg, zzffnVar, zzffqVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgee.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjP)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                listenableFutureZza = this.zzi.zza(jSONObjectOptJSONObject);
            }
            return zzl(zzgee.zzo(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdI)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Required field 'vast_xml' or 'html' is missing");
            return zzgee.zzh(null);
        }
        listenableFutureZza = zzp(jSONObjectOptJSONObject, zzffnVar, zzffqVar);
        return zzl(zzgee.zzo(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdI)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }
}
