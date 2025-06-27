package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpo implements zzcyt {
    private final zzffq zza;
    private final zzffz zzb;
    private final zzfmp zzc;
    private final zzfmt zzd;

    public zzcpo(zzffz zzffzVar, zzfmt zzfmtVar, zzfmp zzfmpVar) {
        this.zzb = zzffzVar;
        this.zzd = zzfmtVar;
        this.zzc = zzfmpVar;
        this.zza = zzffzVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, list));
    }
}
