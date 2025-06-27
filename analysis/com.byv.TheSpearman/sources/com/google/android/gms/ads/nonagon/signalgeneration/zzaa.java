package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzgea;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.mediationsdk.metadata.a;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
final class zzaa implements zzgea {
    final /* synthetic */ zzab zza;

    zzaa(zzab zzabVar) {
        this.zza = zzabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzh.zzc(this.zza.zzq, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair(FirebaseAnalytics.Param.AD_FORMAT, AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", a.g), new Pair("sgi_rn", Integer.toString(this.zza.zzI.get())));
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzjC)).booleanValue() || this.zza.zzH.get() || this.zza.zzI.getAndIncrement() >= ((Integer) zzba.zzc().zza(zzbdz.zzjD)).intValue()) {
            return;
        }
        this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzba.zzc().zza(zzbdz.zzjC)).booleanValue()) {
            zzh.zzc(this.zza.zzq, null, "sgs", new Pair("se", "query_g"), new Pair(FirebaseAnalytics.Param.AD_FORMAT, AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", a.g), new Pair("sgi_rn", Integer.toString(this.zza.zzI.get())));
            this.zza.zzH.set(true);
        }
    }
}
