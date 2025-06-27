package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.json.mediationsdk.metadata.a;
import com.json.mediationsdk.utils.c;
import com.json.t2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzr {
    private final zzcik zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final zzfgi zzd;
    private final Executor zze;
    private final String zzf;
    private final zzflh zzg;
    private final zzfgx zzh;
    private final zzduc zzi;

    public zzdzr(zzcik zzcikVar, Context context, VersionInfoParcel versionInfoParcel, zzfgi zzfgiVar, Executor executor, String str, zzflh zzflhVar, zzduc zzducVar) {
        this.zza = zzcikVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = zzfgiVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzflhVar;
        this.zzh = zzcikVar.zzx();
        this.zzi = zzducVar;
    }

    private final ListenableFuture zzc(final String str, final String str2) {
        zzfkw zzfkwVarZza = zzfkv.zza(this.zzb, zzflo.CUI_NAME_ADREQUEST_PARSERESPONSE);
        zzfkwVarZza.zzi();
        final zzbpg zzbpgVarZza = com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzb, this.zzc, this.zza.zzz()).zza("google.afma.response.normalize", zzbpn.zza, zzbpn.zza);
        ListenableFuture listenableFutureZzn = zzgee.zzn(zzgee.zzn(zzgee.zzn(zzgee.zzh(""), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzo
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put(AdActivity.REQUEST_KEY_EXTRA, jSONObject2);
                    jSONObject.put(c.Y1, jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgee.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzp
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzbpgVarZza.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzflg.zzb(listenableFutureZzn, this.zzg, zzfkwVarZza);
        return listenableFutureZzn;
    }

    private final String zzd(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final ListenableFuture zza() throws JSONException, UnsupportedEncodingException {
        String strZzb = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(strZzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzha)).booleanValue()) {
                String strZze = zze(strZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhl)).booleanValue() && strZze.isEmpty()) {
                    int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                    strZze = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strZze)) {
                    return zzgee.zzg(new zzekh(15, "Invalid ad string."));
                }
                String strZzb2 = this.zza.zzo().zzb(strZze, this.zzi);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhl)).booleanValue()) {
                    zzduc zzducVar = this.zzi;
                    if (!TextUtils.isEmpty(strZzb2)) {
                        Boolean bool = new JSONObject(strZzb2).optString("is_gbid").equals(a.g);
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strZzb.lastIndexOf(t2.i.c);
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strZze.getBytes(C.UTF8_NAME);
                                    try {
                                        string = new JSONObject(strZzb2).getString("arek");
                                    } catch (JSONException e) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strZzb = zzfgx.zzb(bArrDecode, bytes, string, zzducVar);
                                } catch (UnsupportedEncodingException e2) {
                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strZzb2)) {
                    return zzc(strZzb, zzd(strZzb2));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zzd.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgY)).booleanValue()) {
                String str = zzcVar.zza;
                String str2 = zzcVar.zzb;
                String strZze2 = zze(str);
                String strZze3 = zze(str2);
                if (TextUtils.isEmpty(strZze3) || !strZze2.equals(strZze3)) {
                    this.zzi.zzb().put("ridmm", a.g);
                } else {
                    this.zza.zzo().zzf(strZze2);
                    this.zzi.zzb().put("request_id", strZze2);
                }
            }
            return zzc(zzcVar.zza, zzd(zzcVar.zzb));
        }
        return zzgee.zzg(new zzekh(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ListenableFuture zzb(JSONObject jSONObject) throws Exception {
        return zzgee.zzh(new zzffz(new zzffw(this.zzd), zzffy.zza(new StringReader(jSONObject.toString()), null)));
    }
}
