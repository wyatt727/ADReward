package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdvt implements zzdvh {
    private final long zza;
    private final zzeoi zzb;

    zzdvt(long j, Context context, zzdvm zzdvmVar, zzcik zzcikVar, String str) {
        this.zza = j;
        zzfds zzfdsVarZzv = zzcikVar.zzv();
        zzfdsVarZzv.zzc(context);
        zzfdsVarZzv.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzfdsVarZzv.zzb(str);
        zzeoi zzeoiVarZza = zzfdsVarZzv.zzd().zza();
        this.zzb = zzeoiVarZza;
        zzeoiVarZza.zzD(new zzdvs(this, zzdvmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
