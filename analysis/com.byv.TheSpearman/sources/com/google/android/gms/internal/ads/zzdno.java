package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdno {
    private final zzgep zza;
    private final zzdob zzb;
    private final zzdog zzc;

    public zzdno(zzgep zzgepVar, zzdob zzdobVar, zzdog zzdogVar) {
        this.zza = zzgepVar;
        this.zzb = zzdobVar;
        this.zzc = zzdogVar;
    }

    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        ListenableFuture listenableFutureZzn;
        final ListenableFuture listenableFutureZzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdnm
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzekh {
                zzdky zzdkyVar = new zzdky();
                JSONObject jSONObject2 = jSONObject;
                zzdkyVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdkyVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                zzffz zzffzVar2 = zzffzVar;
                zzdkyVar.zzV(strOptString);
                zzfgi zzfgiVar = zzffzVar2.zza.zza;
                if (!zzfgiVar.zzg.contains(Integer.toString(zzdkyVar.zzc()))) {
                    throw new zzekh(1, "Invalid template ID: " + zzdkyVar.zzc());
                }
                if (zzdkyVar.zzc() == 3) {
                    if (zzdkyVar.zzA() == null) {
                        throw new zzekh(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfgiVar.zzh.contains(zzdkyVar.zzA())) {
                        throw new zzekh(1, "Unexpected custom template id in the response.");
                    }
                }
                zzffn zzffnVar2 = zzffnVar;
                zzdkyVar.zzY(jSONObject2.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (zzffnVar2.zzN) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    strOptString2 = com.google.android.gms.ads.internal.util.zzt.zzy() + " : " + strOptString2;
                }
                zzdkyVar.zzZ("headline", strOptString2);
                zzdkyVar.zzZ("body", jSONObject2.optString("body", null));
                zzdkyVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdkyVar.zzZ("store", jSONObject2.optString("store", null));
                zzdkyVar.zzZ("price", jSONObject2.optString("price", null));
                zzdkyVar.zzZ(t2.h.F0, jSONObject2.optString(t2.h.F0, null));
                return zzdkyVar;
            }
        });
        final ListenableFuture listenableFutureZzf = this.zzb.zzf(jSONObject, "images");
        zzffq zzffqVar = zzffzVar.zzb.zzb;
        zzdob zzdobVar = this.zzb;
        final ListenableFuture listenableFutureZzg = zzdobVar.zzg(jSONObject, "images", zzffnVar, zzffqVar);
        final ListenableFuture listenableFutureZze = zzdobVar.zze(jSONObject, "secondary_image");
        final ListenableFuture listenableFutureZze2 = zzdobVar.zze(jSONObject, "app_icon");
        final ListenableFuture listenableFutureZzd = zzdobVar.zzd(jSONObject, "attribution");
        final ListenableFuture listenableFutureZzh = this.zzb.zzh(jSONObject, zzffnVar, zzffzVar.zzb.zzb);
        final ListenableFuture listenableFutureZza = this.zzc.zza(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                listenableFutureZzn = zzgee.zzh(null);
            } else {
                final zzdob zzdobVar2 = this.zzb;
                listenableFutureZzn = zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdnq
                    @Override // com.google.android.gms.internal.ads.zzgdl
                    public final ListenableFuture zza(Object obj) {
                        return zzdobVar2.zzc(strOptString, obj);
                    }
                }, zzcbr.zze);
            }
        } else {
            listenableFutureZzn = zzgee.zzh(null);
        }
        final ListenableFuture listenableFuture = listenableFutureZzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(listenableFutureZzb);
        arrayList.add(listenableFutureZzf);
        arrayList.add(listenableFutureZzg);
        arrayList.add(listenableFutureZze);
        arrayList.add(listenableFutureZze2);
        arrayList.add(listenableFutureZzd);
        arrayList.add(listenableFutureZzh);
        arrayList.add(listenableFutureZza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
            arrayList.add(listenableFuture);
        }
        return zzgee.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdnn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdky zzdkyVar = (zzdky) listenableFutureZzb.get();
                zzdkyVar.zzP((List) listenableFutureZzf.get());
                zzdkyVar.zzM((zzbhe) listenableFutureZze2.get());
                zzdkyVar.zzQ((zzbhe) listenableFutureZze.get());
                zzdkyVar.zzJ((zzbgx) listenableFutureZzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdkyVar.zzS(zzdob.zzj(jSONObject2));
                zzdkyVar.zzL(zzdob.zzi(jSONObject2));
                zzcgm zzcgmVar = (zzcgm) listenableFutureZzh.get();
                if (zzcgmVar != null) {
                    zzdkyVar.zzad(zzcgmVar);
                    zzdkyVar.zzac(zzcgmVar.zzF());
                    zzdkyVar.zzab(zzcgmVar.zzq());
                }
                zzcgm zzcgmVar2 = (zzcgm) listenableFutureZzg.get();
                if (zzcgmVar2 != null) {
                    zzdkyVar.zzO(zzcgmVar2);
                    zzdkyVar.zzae(zzcgmVar2.zzF());
                }
                ListenableFuture listenableFuture2 = listenableFuture;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
                    zzdkyVar.zzU(listenableFuture2);
                    zzdkyVar.zzX(new zzcbw());
                } else {
                    zzcgm zzcgmVar3 = (zzcgm) listenableFuture2.get();
                    if (zzcgmVar3 != null) {
                        zzdkyVar.zzT(zzcgmVar3);
                    }
                }
                for (zzdof zzdofVar : (List) listenableFutureZza.get()) {
                    if (zzdofVar.zza != 1) {
                        zzdkyVar.zzN(zzdofVar.zzb, zzdofVar.zzd);
                    } else {
                        zzdkyVar.zzZ(zzdofVar.zzb, zzdofVar.zzc);
                    }
                }
                return zzdkyVar;
            }
        }, this.zza);
    }
}
