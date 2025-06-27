package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzecu extends zzbwl {
    private final Context zza;
    private final zzgep zzb;
    private final zzedm zzc;
    private final zzcnx zzd;
    private final ArrayDeque zze;
    private final zzflk zzf;
    private final zzbxm zzg;
    private final zzedj zzh;

    public zzecu(Context context, zzgep zzgepVar, zzbxm zzbxmVar, zzcnx zzcnxVar, zzedm zzedmVar, ArrayDeque arrayDeque, zzedj zzedjVar, zzflk zzflkVar) {
        zzbdz.zza(context);
        this.zza = context;
        this.zzb = zzgepVar;
        this.zzg = zzbxmVar;
        this.zzc = zzedmVar;
        this.zzd = zzcnxVar;
        this.zze = arrayDeque;
        this.zzh = zzedjVar;
        this.zzf = zzflkVar;
    }

    private final synchronized zzecr zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzecr zzecrVar = (zzecr) it.next();
            if (zzecrVar.zzc.equals(str)) {
                it.remove();
                return zzecrVar;
            }
        }
        return null;
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, zzfkn zzfknVar, zzbpq zzbpqVar, zzflh zzflhVar, zzfkw zzfkwVar) {
        zzbpg zzbpgVarZza = zzbpqVar.zza("AFMA_getAdDictionary", zzbpn.zza, new zzbpi() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // com.google.android.gms.internal.ads.zzbpi
            public final Object zza(JSONObject jSONObject) {
                return new zzbxg(jSONObject);
            }
        });
        zzflg.zze(listenableFuture, zzfkwVar);
        zzfjs zzfjsVarZza = zzfknVar.zzb(zzfkh.BUILD_URL, listenableFuture).zzf(zzbpgVarZza).zza();
        zzflg.zzd(zzfjsVarZza, zzflhVar, zzfkwVar);
        return zzfjsVarZza;
    }

    private static ListenableFuture zzm(final zzbxd zzbxdVar, zzfkn zzfknVar, final zzexp zzexpVar) {
        zzgdl zzgdlVar = new zzgdl() { // from class: com.google.android.gms.internal.ads.zzecg
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzexpVar.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbxdVar.zzm);
            }
        };
        return zzfknVar.zzb(zzfkh.GMS_SIGNALS, zzgee.zzh(zzbxdVar.zza)).zzf(zzgdlVar).zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzecr zzecrVar) {
        zzo();
        this.zze.addLast(zzecrVar);
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) zzbfz.zzc.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(ListenableFuture listenableFuture, zzbww zzbwwVar, zzbxd zzbxdVar) {
        zzgee.zzr(zzgee.zzn(listenableFuture, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(zzfhj.zza((InputStream) obj));
            }
        }, zzcbr.zza), new zzecq(this, zzbwwVar, zzbxdVar), zzcbr.zzf);
    }

    public final ListenableFuture zzb(final zzbxd zzbxdVar, int i) {
        if (!((Boolean) zzbfz.zza.zze()).booleanValue()) {
            return zzgee.zzg(new Exception("Split request is disabled."));
        }
        zzfid zzfidVar = zzbxdVar.zzi;
        if (zzfidVar == null) {
            return zzgee.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfidVar.zzc == 0 || zzfidVar.zzd == 0) {
            return zzgee.zzg(new Exception("Caching is disabled."));
        }
        zzbpq zzbpqVarZzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzexp zzexpVarZzr = this.zzd.zzr(zzbxdVar, i);
        zzfkn zzfknVarZzc = zzexpVarZzr.zzc();
        final ListenableFuture listenableFutureZzm = zzm(zzbxdVar, zzfknVarZzc, zzexpVarZzr);
        zzflh zzflhVarZzd = zzexpVarZzr.zzd();
        final zzfkw zzfkwVarZza = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_BUILDURL);
        final ListenableFuture listenableFutureZzl = zzl(listenableFutureZzm, zzfknVarZzc, zzbpqVarZzb, zzflhVarZzd, zzfkwVarZza);
        return zzfknVarZzc.zza(zzfkh.GET_URL_AND_CACHE_KEY, listenableFutureZzm, listenableFutureZzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzj(listenableFutureZzl, listenableFutureZzm, zzbxdVar, zzfkwVarZza);
            }
        }).zza();
    }

    public final ListenableFuture zzc(final zzbxd zzbxdVar, int i) {
        zzfjs zzfjsVarZza;
        zzbpq zzbpqVarZzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzexp zzexpVarZzr = this.zzd.zzr(zzbxdVar, i);
        zzbpg zzbpgVarZza = zzbpqVarZzb.zza("google.afma.response.normalize", zzect.zza, zzbpn.zzb);
        zzecr zzecrVarZzk = null;
        if (((Boolean) zzbfz.zza.zze()).booleanValue()) {
            zzecrVarZzk = zzk(zzbxdVar.zzh);
            if (zzecrVarZzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbxdVar.zzj;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfkw zzfkwVarZza = zzecrVarZzk == null ? zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_BUILDURL) : zzecrVarZzk.zze;
        zzflh zzflhVarZzd = zzexpVarZzr.zzd();
        zzflhVarZzd.zze(zzbxdVar.zza.getStringArrayList("ad_types"));
        zzedl zzedlVar = new zzedl(zzbxdVar.zzg, zzflhVarZzd, zzfkwVarZza);
        zzedi zzediVar = new zzedi(this.zza, zzbxdVar.zzb.afmaVersion, this.zzg, i);
        zzfkn zzfknVarZzc = zzexpVarZzr.zzc();
        zzfkw zzfkwVarZza2 = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_PARSERESPONSE);
        if (zzecrVarZzk == null) {
            final ListenableFuture listenableFutureZzm = zzm(zzbxdVar, zzfknVarZzc, zzexpVarZzr);
            final ListenableFuture listenableFutureZzl = zzl(listenableFutureZzm, zzfknVarZzc, zzbpqVarZzb, zzflhVarZzd, zzfkwVarZza);
            zzfkw zzfkwVarZza3 = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_REQUEST);
            final zzfjs zzfjsVarZza2 = zzfknVarZzc.zza(zzfkh.HTTP, listenableFutureZzl, listenableFutureZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeci
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbxd zzbxdVar2;
                    Bundle bundle;
                    zzbxg zzbxgVar = (zzbxg) listenableFutureZzl.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = (zzbxdVar2 = zzbxdVar).zzm) != null) {
                        bundle.putLong(zzdtq.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbxgVar.zzc());
                        zzbxdVar2.zzm.putLong(zzdtq.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbxgVar.zzb());
                    }
                    return new zzedk((JSONObject) listenableFutureZzm.get(), zzbxgVar);
                }
            }).zze(zzedlVar).zze(new zzflc(zzfkwVarZza3)).zze(zzediVar).zza();
            zzflg.zzb(zzfjsVarZza2, zzflhVarZzd, zzfkwVarZza3);
            zzflg.zze(zzfjsVarZza2, zzfkwVarZza2);
            zzfjsVarZza = zzfknVarZzc.zza(zzfkh.PRE_PROCESS, listenableFutureZzm, listenableFutureZzl, zzfjsVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = zzbxdVar.zzm) != null) {
                        bundle.putLong(zzdtq.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                    }
                    return new zzect((zzedh) zzfjsVarZza2.get(), (JSONObject) listenableFutureZzm.get(), (zzbxg) listenableFutureZzl.get());
                }
            }).zzf(zzbpgVarZza).zza();
        } else {
            zzedk zzedkVar = new zzedk(zzecrVarZzk.zzb, zzecrVarZzk.zza);
            zzfkw zzfkwVarZza4 = zzfkv.zza(this.zza, zzflo.CUI_NAME_ADREQUEST_REQUEST);
            final zzfjs zzfjsVarZza3 = zzfknVarZzc.zzb(zzfkh.HTTP, zzgee.zzh(zzedkVar)).zze(zzedlVar).zze(new zzflc(zzfkwVarZza4)).zze(zzediVar).zza();
            zzflg.zzb(zzfjsVarZza3, zzflhVarZzd, zzfkwVarZza4);
            final ListenableFuture listenableFutureZzh = zzgee.zzh(zzecrVarZzk);
            zzflg.zze(zzfjsVarZza3, zzfkwVarZza2);
            zzfjsVarZza = zzfknVarZzc.zza(zzfkh.PRE_PROCESS, zzfjsVarZza3, listenableFutureZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzedh zzedhVar = (zzedh) zzfjsVarZza3.get();
                    ListenableFuture listenableFuture = listenableFutureZzh;
                    return new zzect(zzedhVar, ((zzecr) listenableFuture.get()).zzb, ((zzecr) listenableFuture.get()).zza);
                }
            }).zzf(zzbpgVarZza).zza();
        }
        zzflg.zzb(zzfjsVarZza, zzflhVarZzd, zzfkwVarZza2);
        return zzfjsVarZza;
    }

    public final ListenableFuture zzd(final zzbxd zzbxdVar, int i) {
        zzbpq zzbpqVarZzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbge.zza.zze()).booleanValue()) {
            return zzgee.zzg(new Exception("Signal collection disabled."));
        }
        zzexp zzexpVarZzr = this.zzd.zzr(zzbxdVar, i);
        final zzewu zzewuVarZza = zzexpVarZzr.zza();
        zzbpg zzbpgVarZza = zzbpqVarZzb.zza("google.afma.request.getSignals", zzbpn.zza, zzbpn.zzb);
        zzfkw zzfkwVarZza = zzfkv.zza(this.zza, zzflo.CUI_NAME_SCAR_SIGNALS);
        zzfjs zzfjsVarZza = zzexpVarZzr.zzc().zzb(zzfkh.GET_SIGNALS, zzgee.zzh(zzbxdVar.zza)).zze(new zzflc(zzfkwVarZza)).zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeco
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) throws JSONException {
                return zzewuVarZza.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbxdVar.zzm);
            }
        }).zzb(zzfkh.JS_SIGNALS).zzf(zzbpgVarZza).zza();
        zzflh zzflhVarZzd = zzexpVarZzr.zzd();
        zzflhVarZzd.zze(zzbxdVar.zza.getStringArrayList("ad_types"));
        zzflg.zzc(zzfjsVarZza, zzflhVarZzd, zzfkwVarZza);
        if (((Boolean) zzbft.zzg.zze()).booleanValue()) {
            zzedm zzedmVar = this.zzc;
            Objects.requireNonNull(zzedmVar);
            zzfjsVarZza.addListener(new zzecl(zzedmVar), this.zzb);
        }
        return zzfjsVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(zzbxd zzbxdVar, zzbww zzbwwVar) {
        zzp(zzb(zzbxdVar, Binder.getCallingUid()), zzbwwVar, zzbxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(zzbxd zzbxdVar, zzbww zzbwwVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = zzbxdVar.zzm) != null) {
            bundle.putLong(zzdtq.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        zzp(zzd(zzbxdVar, Binder.getCallingUid()), zzbwwVar, zzbxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(zzbxd zzbxdVar, zzbww zzbwwVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = zzbxdVar.zzm) != null) {
            bundle.putLong(zzdtq.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzc = zzc(zzbxdVar, Binder.getCallingUid());
        zzp(listenableFutureZzc, zzbwwVar, zzbxdVar);
        if (((Boolean) zzbft.zze.zze()).booleanValue()) {
            zzedm zzedmVar = this.zzc;
            Objects.requireNonNull(zzedmVar);
            listenableFutureZzc.addListener(new zzecl(zzedmVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh(String str, zzbww zzbwwVar) {
        zzp(zzi(str), zzbwwVar, null);
    }

    public final ListenableFuture zzi(String str) {
        if (((Boolean) zzbfz.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzgee.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgee.zzh(new zzecp(this));
        }
        return zzgee.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzj(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbxd zzbxdVar, zzfkw zzfkwVar) throws Exception {
        String strZze = ((zzbxg) listenableFuture.get()).zze();
        zzn(new zzecr((zzbxg) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbxdVar.zzh, strZze, zzfkwVar));
        return new ByteArrayInputStream(strZze.getBytes(zzfwd.zzc));
    }
}
