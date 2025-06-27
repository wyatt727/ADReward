package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcpj implements zzgea {
    final /* synthetic */ zzfmt zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcpk zzc;

    zzcpj(zzcpk zzcpkVar, zzfmt zzfmtVar, String str) {
        this.zza = zzfmtVar;
        this.zzb = str;
        this.zzc = zzcpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(final Throwable th) {
        zzgep zzgepVar = this.zzc.zzg;
        final zzfmt zzfmtVar = this.zza;
        final String str = this.zzb;
        zzgepVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcph
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkc)).booleanValue();
                zzcpj zzcpjVar = this.zza;
                Throwable th2 = th;
                if (zBooleanValue) {
                    zzcpk zzcpkVar = zzcpjVar.zzc;
                    zzcpkVar.zzb = zzbvs.zzc(zzcpkVar.zzc);
                    zzcpjVar.zzc.zzb.zzg(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcpk zzcpkVar2 = zzcpjVar.zzc;
                    zzcpkVar2.zza = zzbvs.zza(zzcpkVar2.zzc);
                    zzcpjVar.zzc.zza.zzg(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                zzfmtVar.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpk zzcpkVar = this.zzc;
        final zzfmt zzfmtVar = this.zza;
        final String str = (String) obj;
        zzcpkVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpi
            @Override // java.lang.Runnable
            public final void run() {
                zzfmtVar.zzc(str, null);
            }
        });
    }
}
