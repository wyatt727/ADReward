package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbss implements MediationAdLoadCallback {
    final /* synthetic */ zzbsb zza;
    final /* synthetic */ zzbqu zzb;

    zzbss(zzbta zzbtaVar, zzbsb zzbsbVar, zzbqu zzbquVar) {
        this.zza = zzbsbVar;
        this.zzb = zzbquVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd != null) {
            try {
                this.zza.zzg(ObjectWrapper.wrap(mediationBannerAd.getView()));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            }
            return new zzbtb(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
