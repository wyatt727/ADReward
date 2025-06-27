package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.json.mediationsdk.utils.IronSourceConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdwt implements zzcyt, zzdbl, zzdai {
    private final zzdxf zza;
    private final String zzb;
    private final String zzc;
    private zzcyj zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdws zze = zzdws.AD_REQUESTED;

    zzdwt(zzdxf zzdxfVar, zzfgi zzfgiVar, String str) {
        this.zza = zzdxfVar;
        this.zzc = str;
        this.zzb = zzfgiVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzh(zzeVar2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcyj zzcyjVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcyjVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcyjVar.zzc());
        jSONObject.put("responseId", zzcyjVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjf)).booleanValue()) {
            String strZzd = zzcyjVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzji)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzu zzuVar : zzcyjVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjg)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzuVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzh(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdai
    public final void zza(zzctv zzctvVar) {
        if (this.zza.zzq()) {
            this.zzf = zzctvVar.zzl();
            this.zze = zzdws.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjm)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzffn.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjm)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcyj zzcyjVar = this.zzf;
        JSONObject jSONObjectZzi = null;
        if (zzcyjVar != null) {
            jSONObjectZzi = zzi(zzcyjVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcyj zzcyjVar2 = (zzcyj) iBinder;
                jSONObjectZzi = zzi(zzcyjVar2);
                if (zzcyjVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObjectZzi.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObjectZzi);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = zzdws.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjm)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjm)).booleanValue() || !this.zza.zzq()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) {
        if (this.zza.zzq()) {
            if (!zzffzVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzffn) zzffzVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzffzVar.zzb.zzb.zzk)) {
                this.zzh = zzffzVar.zzb.zzb.zzk;
            }
            if (!TextUtils.isEmpty(zzffzVar.zzb.zzb.zzl)) {
                this.zzi = zzffzVar.zzb.zzb.zzl;
            }
            if (zzffzVar.zzb.zzb.zzo.length() > 0) {
                this.zzl = zzffzVar.zzb.zzb.zzo;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzji)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzffzVar.zzb.zzb.zzm)) {
                    this.zzj = zzffzVar.zzb.zzb.zzm;
                }
                if (zzffzVar.zzb.zzb.zzn.length() > 0) {
                    this.zzk = zzffzVar.zzb.zzb.zzn;
                }
                zzdxf zzdxfVar = this.zza;
                JSONObject jSONObject = this.zzk;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdxfVar.zzk(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzdws.AD_REQUESTED;
    }
}
