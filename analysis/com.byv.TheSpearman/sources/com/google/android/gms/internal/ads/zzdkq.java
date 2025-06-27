package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdkq implements zzazy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdkt zzb;

    zzdkq(zzdkt zzdktVar, String str) {
        this.zza = str;
        this.zzb = zzdktVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzdp(zzazx zzazxVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbJ)).booleanValue()) {
            if (zzazxVar.zzj) {
                zzdkt zzdktVar = this.zzb;
                zzdktVar.zzy.put(this.zza, true);
                zzdkt zzdktVar2 = this.zzb;
                zzdktVar2.zzA(zzdktVar2.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzazxVar.zzj) {
                zzdkt zzdktVar3 = this.zzb;
                if (zzdktVar3.zzo == null) {
                    return;
                }
                zzdktVar3.zzy.put(this.zza, true);
                zzdkt zzdktVar4 = this.zzb;
                zzdktVar4.zzA(zzdktVar4.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
            }
        }
    }
}
