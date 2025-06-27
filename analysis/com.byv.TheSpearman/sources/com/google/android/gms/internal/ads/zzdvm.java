package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.json.id;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdvm {
    private final zzblx zza;

    zzdvm(zzblx zzblxVar) {
        this.zza = zzblxVar;
    }

    private final void zzs(zzdvl zzdvlVar) throws JSONException, RemoteException {
        String strZza = zzdvl.zza(zzdvlVar);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching AFMA event on publisher webview: ".concat(strZza));
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdvl(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = id.f;
        this.zza.zzb(zzdvl.zza(zzdvlVar));
    }

    public final void zzc(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = id.g;
        zzs(zzdvlVar);
    }

    public final void zzd(long j, int i) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdFailedToLoad";
        zzdvlVar.zzd = Integer.valueOf(i);
        zzs(zzdvlVar);
    }

    public final void zze(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = id.j;
        zzs(zzdvlVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdvlVar);
    }

    public final void zzg(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = id.c;
        zzs(zzdvlVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("creation", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "nativeObjectCreated";
        zzs(zzdvlVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("creation", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "nativeObjectNotCreated";
        zzs(zzdvlVar);
    }

    public final void zzj(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = id.f;
        zzs(zzdvlVar);
    }

    public final void zzk(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdClosed";
        zzs(zzdvlVar);
    }

    public final void zzl(long j, zzbyg zzbygVar) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onUserEarnedReward";
        zzdvlVar.zze = zzbygVar.zzf();
        zzdvlVar.zzf = Integer.valueOf(zzbygVar.zze());
        zzs(zzdvlVar);
    }

    public final void zzm(long j, int i) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdFailedToLoad";
        zzdvlVar.zzd = Integer.valueOf(i);
        zzs(zzdvlVar);
    }

    public final void zzn(long j, int i) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdFailedToShow";
        zzdvlVar.zzd = Integer.valueOf(i);
        zzs(zzdvlVar);
    }

    public final void zzo(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdImpression";
        zzs(zzdvlVar);
    }

    public final void zzp(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdLoaded";
        zzs(zzdvlVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdvlVar);
    }

    public final void zzr(long j) throws JSONException, RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdOpened";
        zzs(zzdvlVar);
    }
}
