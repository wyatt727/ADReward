package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import com.json.mediationsdk.utils.c;
import com.mbridge.msdk.foundation.entity.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejd implements zzeix {
    private final zzdji zza;
    private final zzgep zzb;
    private final zzdno zzc;
    private final zzfhh zzd;
    private final zzdqd zze;

    public zzejd(zzdji zzdjiVar, zzgep zzgepVar, zzdno zzdnoVar, zzfhh zzfhhVar, zzdqd zzdqdVar) {
        this.zza = zzdjiVar;
        this.zzb = zzgepVar;
        this.zzc = zzdnoVar;
        this.zzd = zzfhhVar;
        this.zze = zzdqdVar;
    }

    private final ListenableFuture zzg(final zzffz zzffzVar, final zzffn zzffnVar, final JSONObject jSONObject) {
        zzdno zzdnoVar = this.zzc;
        final ListenableFuture listenableFutureZza = this.zzd.zza();
        final ListenableFuture listenableFutureZza2 = zzdnoVar.zza(zzffzVar, zzffnVar, jSONObject);
        return zzgee.zzc(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(listenableFutureZza2, listenableFutureZza, zzffzVar, zzffnVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        return zzgee.zzn(zzgee.zzn(this.zzd.zza(), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeja
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zze(zzffnVar, (zzdpx) obj);
            }
        }, this.zzb), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzejb
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzf(zzffzVar, zzffnVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        zzffs zzffsVar = zzffnVar.zzt;
        return (zzffsVar == null || zzffsVar.zzc == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdkt zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzffz zzffzVar, zzffn zzffnVar, JSONObject jSONObject) throws Exception {
        zzdky zzdkyVar = (zzdky) listenableFuture.get();
        zzdpx zzdpxVar = (zzdpx) listenableFuture2.get();
        zzdkz zzdkzVarZzd = this.zza.zzd(new zzcul(zzffzVar, zzffnVar, null), new zzdlk(zzdkyVar), new zzdjx(jSONObject, zzdpxVar));
        zzdkzVarZzd.zzh().zzb();
        zzdkzVarZzd.zzk().zza(zzdpxVar);
        zzdkzVarZzd.zzg().zza(zzdkyVar.zzs());
        zzdkzVarZzd.zzl().zza(this.zze, zzdkyVar.zzq());
        return zzdkzVarZzd.zza();
    }

    final /* synthetic */ ListenableFuture zzd(zzdpx zzdpxVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzgee.zzh(zzdpxVar));
        if (jSONObject.optBoolean("success")) {
            return zzgee.zzh(jSONObject.getJSONObject("json").getJSONArray(b.JSON_KEY_ADS));
        }
        throw new zzbpf("process json failed");
    }

    final /* synthetic */ ListenableFuture zze(zzffn zzffnVar, final zzdpx zzdpxVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziB)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(c.Y1, zzffnVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgee.zzn(zzdpxVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzdpxVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzf(zzffz zzffzVar, zzffn zzffnVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzgee.zzg(new zzdyi(3));
        }
        if (zzffzVar.zza.zza.zzk <= 1) {
            return zzgee.zzm(zzg(zzffzVar, zzffnVar, jSONArray.getJSONObject(0)), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzejc
                @Override // com.google.android.gms.internal.ads.zzfwf
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgee.zzh((zzdkt) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzffzVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzffzVar.zza.zza.zzk);
        for (int i = 0; i < zzffzVar.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzffzVar, zzffnVar, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzgee.zzg(new zzdyi(3)));
            }
        }
        return zzgee.zzh(arrayList);
    }
}
