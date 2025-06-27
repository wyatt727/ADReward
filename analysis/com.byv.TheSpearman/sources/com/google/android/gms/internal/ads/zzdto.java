package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.webkit.WebViewFeature;
import com.json.t2;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdto implements zzdbl, zzdae, zzcyt, zzdgz {
    private final zzduc zza;
    private final zzdum zzb;

    public zzdto(zzduc zzducVar, zzdum zzdumVar) {
        this.zza = zzducVar;
        this.zzb = zzdumVar;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzc(str, String.valueOf(j));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzf(Bundle bundle, zzfzn zzfznVar) {
        int size = zzfznVar.size();
        for (int i = 0; i < size; i++) {
            zzdtr zzdtrVar = (zzdtr) zzfznVar.get(i);
            long j = bundle.getLong(zzdtrVar.zza().zza(), -1L);
            long j2 = bundle.getLong(zzdtrVar.zzb().zza(), -1L);
            if (j > 0 && j2 > 0) {
                this.zza.zzc(zzdtrVar.zzc(), String.valueOf(j2 - j));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar) {
        String str;
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhd)).booleanValue()) {
            if (zzapVar == null) {
                this.zza.zzb().put(t2.h.h, "sgs");
                this.zza.zzb().put("request_id", "-1");
                this.zzb.zzf(this.zza.zzb());
                return;
            }
            zzbxd zzbxdVar = zzapVar.zzc;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && zzbxdVar != null && (bundle = zzbxdVar.zzm) != null) {
                bundle.putLong(zzdtq.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                zzf(bundle, zzdtr.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzapVar.zzb);
                this.zza.zzb().put(t2.h.h, "sgs");
                Map mapZzb = this.zza.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjA)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error retrieving JSONObject from the requestJson, ", e);
                    }
                } else {
                    str = "na";
                }
                mapZzb.put("tpc", str);
                zzbxd zzbxdVar2 = zzapVar.zzc;
                if (zzbxdVar2 != null) {
                    this.zza.zze(zzbxdVar2.zza);
                }
                this.zzb.zzf(this.zza.zzb());
            } catch (JSONException unused) {
                this.zza.zzb().put(t2.h.h, "sgf");
                this.zza.zzb().put("sgf_reason", "request_invalid");
                this.zzb.zzf(this.zza.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put(t2.h.h, "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
        this.zza.zze(zzbxdVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) {
        this.zza.zzd(zzffzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhd)).booleanValue()) {
            this.zza.zzb().put(t2.h.h, "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzf(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        this.zza.zzb().put(t2.h.h, t2.h.r);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue()) {
            this.zza.zza().putLong(zzdtq.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzf(this.zza.zza(), zzdtr.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzmj)).booleanValue()) {
            this.zza.zzb().put("mafe", true != WebViewFeature.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzf(this.zza.zzb());
    }
}
