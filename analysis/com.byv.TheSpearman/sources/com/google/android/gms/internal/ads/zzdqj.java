package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdqj implements zzblp {
    private final zzczx zza;
    private final zzbyc zzb;
    private final String zzc;
    private final String zzd;

    public zzdqj(zzczx zzczxVar, zzffn zzffnVar) {
        this.zza = zzczxVar;
        this.zzb = zzffnVar.zzm;
        this.zzc = zzffnVar.zzk;
        this.zzd = zzffnVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    @ParametersAreNonnullByDefault
    public final void zza(zzbyc zzbycVar) {
        int i;
        String str;
        zzbyc zzbycVar2 = this.zzb;
        if (zzbycVar2 != null) {
            zzbycVar = zzbycVar2;
        }
        if (zzbycVar != null) {
            str = zzbycVar.zza;
            i = zzbycVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbxn(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzc() {
        this.zza.zzf();
    }
}
