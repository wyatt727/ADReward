package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzelu implements zzczz {
    boolean zza = false;
    final /* synthetic */ zzegm zzb;
    final /* synthetic */ zzcbw zzc;
    final /* synthetic */ zzelv zzd;

    zzelu(zzelv zzelvVar, zzegm zzegmVar, zzcbw zzcbwVar) {
        this.zzb = zzegmVar;
        this.zzc = zzcbwVar;
        this.zzd = zzelvVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfu)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzegn(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzelv.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzelv.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
