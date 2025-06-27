package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcbd extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcbh zza;

    zzcbd(zzcbh zzcbhVar) {
        this.zza = zzcbhVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcbh zzcbhVar = this.zza;
        zzbec zzbecVar = new zzbec(zzcbhVar.zze, zzcbhVar.zzf.afmaVersion);
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.ads.internal.zzu.zze();
                zzbef.zza(this.zza.zzh, zzbecVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
