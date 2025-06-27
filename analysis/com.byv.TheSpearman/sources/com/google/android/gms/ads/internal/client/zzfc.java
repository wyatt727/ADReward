package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzfc extends zzbyi {
    private static void zzr(final zzbyq zzbyqVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                zzbyq zzbyqVar2 = zzbyqVar;
                if (zzbyqVar2 != null) {
                    try {
                        zzbyqVar2.zze(1);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzdn zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzbyg zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzf(zzl zzlVar, zzbyq zzbyqVar) throws RemoteException {
        zzr(zzbyqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzg(zzl zzlVar, zzbyq zzbyqVar) throws RemoteException {
        zzr(zzbyqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzi(zzdd zzddVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzk(zzbym zzbymVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzl(zzbyx zzbyxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzp(zzbyr zzbyrVar) throws RemoteException {
    }
}
