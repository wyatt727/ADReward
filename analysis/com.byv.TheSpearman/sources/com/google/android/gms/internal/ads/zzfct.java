package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfct implements zzfde {
    private zzcxx zza;

    @Override // com.google.android.gms.internal.ads.zzfde
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxx zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdf zzfdfVar, zzfdd zzfddVar, Object obj) {
        return zzb(zzfdfVar, zzfddVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfdf zzfdfVar, zzfdd zzfddVar, zzcxx zzcxxVar) {
        zzcvd zzcvdVarZzb;
        if (zzcxxVar != null) {
            this.zza = zzcxxVar;
        } else {
            this.zza = (zzcxx) zzfddVar.zza(zzfdfVar.zzb).zzh();
        }
        zzcvdVarZzb = this.zza.zzb();
        return zzcvdVarZzb.zzi(zzcvdVarZzb.zzj());
    }
}
