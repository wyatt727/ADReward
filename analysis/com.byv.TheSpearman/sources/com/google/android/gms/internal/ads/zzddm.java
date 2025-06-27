package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzddm implements zzdbl {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbg)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final synchronized void zzdo(zzffz zzffzVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbh)).booleanValue()) {
            try {
                this.zza = zzffzVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }
}
