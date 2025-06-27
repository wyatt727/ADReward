package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbpr implements zzcca {
    final /* synthetic */ zzbow zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcbw zzc;
    final /* synthetic */ zzbpu zzd;

    zzbpr(zzbpu zzbpuVar, zzbow zzbowVar, Object obj, zzcbw zzcbwVar) {
        this.zza = zzbowVar;
        this.zzb = obj;
        this.zzc = zzcbwVar;
        this.zzd = zzbpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcbw zzcbwVar = this.zzc;
        zzbpu.zzd(this.zzd, this.zza, (zzbpd) obj, obj2, zzcbwVar);
    }
}
