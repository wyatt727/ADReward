package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzdgz;
import com.google.android.gms.internal.ads.zzduc;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzd implements zzdgz {
    private final zzduc zza;
    private final zzc zzb;
    private final String zzc;

    public zzd(zzduc zzducVar, zzc zzcVar, String str) {
        this.zza = zzducVar;
        this.zzb = zzcVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzd(zzap zzapVar) {
        if (zzapVar != null) {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzha)).booleanValue()) {
                this.zzb.zzd(this.zzc, zzapVar.zzb, this.zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zze(String str) {
    }
}
