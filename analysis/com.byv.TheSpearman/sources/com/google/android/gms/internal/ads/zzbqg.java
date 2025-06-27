package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbqg {
    private static zzbqg zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbqg() {
    }

    public static zzbqg zza() {
        if (zza == null) {
            zza = new zzbqg();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqf
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbdz.zza(context2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzat)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzah)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzao)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcij) com.google.android.gms.ads.internal.util.client.zzq.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbqe
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.internal.util.client.zzo
                        public final Object zza(Object obj) {
                            return zzcii.zzb(obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbqd(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
