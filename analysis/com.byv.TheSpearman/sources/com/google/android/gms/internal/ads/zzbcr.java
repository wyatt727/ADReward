package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbcr implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbcj zza;
    final /* synthetic */ zzcbw zzb;
    final /* synthetic */ zzbct zzc;

    zzbcr(zzbct zzbctVar, zzbcj zzbcjVar, zzcbw zzcbwVar) {
        this.zza = zzbcjVar;
        this.zzb = zzcbwVar;
        this.zzc = zzbctVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzbct zzbctVar = this.zzc;
            if (zzbctVar.zzb) {
                return;
            }
            zzbctVar.zzb = true;
            final zzbci zzbciVar = this.zzc.zza;
            if (zzbciVar == null) {
                return;
            }
            zzgep zzgepVar = zzcbr.zza;
            final zzbcj zzbcjVar = this.zza;
            final zzcbw zzcbwVar = this.zzb;
            final ListenableFuture listenableFutureZza = zzgepVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbco
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    zzbcr zzbcrVar = this.zza;
                    zzbci zzbciVar2 = zzbciVar;
                    zzcbw zzcbwVar2 = zzcbwVar;
                    try {
                        zzbcl zzbclVarZzq = zzbciVar2.zzq();
                        boolean zZzp = zzbciVar2.zzp();
                        zzbcj zzbcjVar2 = zzbcjVar;
                        zzbcg zzbcgVarZzg = zZzp ? zzbclVarZzq.zzg(zzbcjVar2) : zzbclVarZzq.zzf(zzbcjVar2);
                        if (!zzbcgVarZzg.zze()) {
                            zzcbwVar2.zzd(new RuntimeException("No entry contents."));
                            zzbct.zze(zzbcrVar.zzc);
                            return;
                        }
                        zzbcq zzbcqVar = new zzbcq(zzbcrVar, zzbcgVarZzg.zzc(), 1);
                        int i = zzbcqVar.read();
                        if (i == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbcqVar.unread(i);
                        zzcbwVar2.zzc(zzbcv.zzb(zzbcqVar, zzbcgVarZzg.zzd(), zzbcgVarZzg.zzg(), zzbcgVarZzg.zza(), zzbcgVarZzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                        zzcbwVar2.zzd(e);
                        zzbct.zze(zzbcrVar.zzc);
                    }
                }
            });
            final zzcbw zzcbwVar2 = this.zzb;
            zzcbwVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcp
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzbcr.zzd;
                    if (zzcbwVar2.isCancelled()) {
                        listenableFutureZza.cancel(true);
                    }
                }
            }, zzcbr.zzf);
        }
    }
}
