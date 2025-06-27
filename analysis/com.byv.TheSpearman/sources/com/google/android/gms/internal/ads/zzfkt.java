package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfkt implements zzdfs, zzczg, zzdfw {
    private final zzflh zza;
    private final zzfkw zzb;

    zzfkt(Context context, zzflh zzflhVar) {
        this.zza = zzflhVar;
        this.zzb = zzfkv.zza(context, zzflo.CUI_NAME_ADSHOW);
    }

    @Override // com.google.android.gms.internal.ads.zzdfw
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfw
    public final void zzb() {
        if (((Boolean) zzbfm.zzd.zze()).booleanValue()) {
            zzflh zzflhVar = this.zza;
            zzfkw zzfkwVar = this.zzb;
            zzfkwVar.zzg(true);
            zzflhVar.zza(zzfkwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfs
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfs
    public final void zzl() {
        if (((Boolean) zzbfm.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbfm.zzd.zze()).booleanValue()) {
            zzflh zzflhVar = this.zza;
            zzfkw zzfkwVar = this.zzb;
            zzfkwVar.zzc(zzeVar.zza().toString());
            zzfkwVar.zzg(false);
            zzflhVar.zza(zzfkwVar);
        }
    }
}
