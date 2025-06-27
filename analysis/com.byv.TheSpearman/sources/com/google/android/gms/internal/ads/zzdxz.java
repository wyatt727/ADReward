package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdxz extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdyc zzb;

    zzdxz(zzdyc zzdycVar, String str) {
        this.zza = str;
        this.zzb = zzdycVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzm(zzdyc.zzl(loadAdError), this.zza);
    }
}
