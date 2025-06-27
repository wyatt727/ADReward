package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbdf {
    zzazt zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbdf() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public zzbdf(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbda
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeQ)).booleanValue();
                zzbdf zzbdfVar = this.zza;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        zzbdfVar.zza = (zzazt) com.google.android.gms.ads.internal.util.client.zzq.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbdb
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.ads.internal.util.client.zzo
                            public final Object zza(Object obj) {
                                return zzazs.zzb(obj);
                            }
                        });
                        zzbdfVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbdfVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
