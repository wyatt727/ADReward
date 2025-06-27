package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdot {
    private final zzfgi zza;
    private final Executor zzb;
    private final zzdri zzc;
    private final zzdqd zzd;
    private final Context zze;
    private final zzduh zzf;
    private final zzfmt zzg;
    private final zzefd zzh;

    public zzdot(zzfgi zzfgiVar, Executor executor, zzdri zzdriVar, Context context, zzduh zzduhVar, zzfmt zzfmtVar, zzefd zzefdVar, zzdqd zzdqdVar) {
        this.zza = zzfgiVar;
        this.zzb = executor;
        this.zzc = zzdriVar;
        this.zze = context;
        this.zzf = zzduhVar;
        this.zzg = zzfmtVar;
        this.zzh = zzefdVar;
        this.zzd = zzdqdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzh(zzcgm zzcgmVar) {
        zzj(zzcgmVar);
        zzcgmVar.zzae("/video", zzbkx.zzl);
        zzcgmVar.zzae("/videoMeta", zzbkx.zzm);
        zzcgmVar.zzae("/precache", new zzcez());
        zzcgmVar.zzae("/delayPageLoaded", zzbkx.zzp);
        zzcgmVar.zzae("/instrument", zzbkx.zzn);
        zzcgmVar.zzae("/log", zzbkx.zzg);
        zzcgmVar.zzae("/click", new zzbjw(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcgmVar.zzN().zzE(true);
            zzcgmVar.zzae("/open", new zzblk(null, null, null, null, null));
        } else {
            zzcgmVar.zzN().zzE(false);
        }
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(zzcgmVar.getContext())) {
            zzcgmVar.zzae("/logScionEvent", new zzble(zzcgmVar.getContext()));
        }
    }

    private final void zzi(zzcgm zzcgmVar, zzcbv zzcbvVar) {
        if (this.zza.zza != null && zzcgmVar.zzq() != null) {
            zzcgmVar.zzq().zzs(this.zza.zza);
        }
        zzcbvVar.zzb();
    }

    private static final void zzj(zzcgm zzcgmVar) {
        zzcgmVar.zzae("/videoClicked", zzbkx.zzh);
        zzcgmVar.zzN().zzG(true);
        zzcgmVar.zzae("/getNativeAdViewSignals", zzbkx.zzs);
        zzcgmVar.zzae("/getNativeClickMeta", zzbkx.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject) {
        return zzgee.zzn(zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdok
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zze(obj);
            }
        }, this.zzb), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcgm) obj);
            }
        }, this.zzb);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzffn zzffnVar, final zzffq zzffqVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdoi
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzqVar, zzffnVar, zzffqVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzcgm zzcgmVar) throws Exception {
        final zzcbv zzcbvVarZza = zzcbv.zza(zzcgmVar);
        if (this.zza.zzb != null) {
            zzcgmVar.zzah(zzcie.zzd());
        } else {
            zzcgmVar.zzah(zzcie.zze());
        }
        zzcgmVar.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdol
            @Override // com.google.android.gms.internal.ads.zzcia
            public final void zza(boolean z, int i, String str, String str2) {
                this.zza.zzf(zzcgmVar, zzcbvVarZza, z, i, str, str2);
            }
        });
        zzcgmVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcbvVarZza;
    }

    final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzffn zzffnVar, zzffq zzffqVar, String str, String str2, Object obj) throws Exception {
        final zzcgm zzcgmVarZza = this.zzc.zza(zzqVar, zzffnVar, zzffqVar);
        final zzcbv zzcbvVarZza = zzcbv.zza(zzcgmVarZza);
        if (this.zza.zzb != null) {
            zzh(zzcgmVarZza);
            zzcgmVarZza.zzah(zzcie.zzd());
        } else {
            zzdqa zzdqaVarZzb = this.zzd.zzb();
            zzcgmVarZza.zzN().zzR(zzdqaVarZzb, zzdqaVarZzb, zzdqaVarZzb, zzdqaVarZzb, zzdqaVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzh, this.zzg, this.zzf, null, zzdqaVarZzb, null, null, null, null);
            zzj(zzcgmVarZza);
        }
        zzcgmVarZza.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.internal.ads.zzcia
            public final void zza(boolean z, int i, String str3, String str4) {
                this.zza.zzg(zzcgmVarZza, zzcbvVarZza, z, i, str3, str4);
            }
        });
        zzcgmVarZza.zzac(str, str2, null);
        return zzcbvVarZza;
    }

    final /* synthetic */ ListenableFuture zze(Object obj) throws Exception {
        zzcgm zzcgmVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcbv zzcbvVarZza = zzcbv.zza(zzcgmVarZza);
        zzh(zzcgmVarZza);
        zzcgmVarZza.zzN().zzH(new zzcib() { // from class: com.google.android.gms.internal.ads.zzdon
            @Override // com.google.android.gms.internal.ads.zzcib
            public final void zza() {
                zzcbvVarZza.zzb();
            }
        });
        zzcgmVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdH));
        return zzcbvVarZza;
    }

    final /* synthetic */ void zzf(zzcgm zzcgmVar, zzcbv zzcbvVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdR)).booleanValue()) {
            zzi(zzcgmVar, zzcbvVar);
            return;
        }
        if (z) {
            zzi(zzcgmVar, zzcbvVar);
            return;
        }
        zzcbvVar.zzd(new zzekh(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void zzg(zzcgm zzcgmVar, zzcbv zzcbvVar, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.zza.zza != null && zzcgmVar.zzq() != null) {
                zzcgmVar.zzq().zzs(this.zza.zza);
            }
            zzcbvVar.zzb();
            return;
        }
        zzcbvVar.zzd(new zzekh(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
