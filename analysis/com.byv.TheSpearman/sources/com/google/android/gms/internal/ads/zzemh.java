package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzemh implements zzegj {
    private final zzbeu zza;
    private final zzgep zzb;
    private final zzfkn zzc;
    private final zzemq zzd;

    public zzemh(zzfkn zzfknVar, zzgep zzgepVar, zzbeu zzbeuVar, zzemq zzemqVar) {
        this.zzc = zzfknVar;
        this.zzb = zzgepVar;
        this.zza = zzbeuVar;
        this.zzd = zzemqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(zzffz zzffzVar, zzffn zzffnVar) {
        zzcbw zzcbwVar = new zzcbw();
        zzemm zzemmVar = new zzemm();
        zzemmVar.zzd(new zzemg(this, zzcbwVar, zzffzVar, zzffnVar, zzemmVar));
        zzffs zzffsVar = zzffnVar.zzt;
        final zzbep zzbepVar = new zzbep(zzemmVar, zzffsVar.zzb, zzffsVar.zza);
        zzfkh zzfkhVar = zzfkh.CUSTOM_RENDER_SYN;
        return zzfjx.zzd(new zzfjr() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzfjr
            public final void zza() throws Exception {
                this.zza.zzc(zzbepVar);
            }
        }, this.zzb, zzfkhVar, this.zzc).zzb(zzfkh.CUSTOM_RENDER_ACK).zzd(zzcbwVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        zzffs zzffsVar;
        return (this.zza == null || (zzffsVar = zzffnVar.zzt) == null || zzffsVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbep zzbepVar) throws Exception {
        this.zza.zze(zzbepVar);
    }
}
