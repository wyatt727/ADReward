package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzemc implements zzegj {
    private final Context zza;
    private final zzcsm zzb;
    private final zzbeu zzc;
    private final zzgep zzd;
    private final zzfkn zze;

    public zzemc(Context context, zzcsm zzcsmVar, zzfkn zzfknVar, zzgep zzgepVar, zzbeu zzbeuVar) {
        this.zza = context;
        this.zzb = zzcsmVar;
        this.zze = zzfknVar;
        this.zzd = zzgepVar;
        this.zzc = zzbeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(zzffz zzffzVar, zzffn zzffnVar) {
        zzema zzemaVar = new zzema(this, new View(this.zza), null, new zzctt() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // com.google.android.gms.internal.ads.zzctt
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzffo) zzffnVar.zzv.get(0));
        zzcrn zzcrnVarZza = this.zzb.zza(new zzcul(zzffzVar, zzffnVar, null), zzemaVar);
        zzemb zzembVarZzk = zzcrnVarZza.zzk();
        zzffs zzffsVar = zzffnVar.zzt;
        final zzbep zzbepVar = new zzbep(zzembVarZzk, zzffsVar.zzb, zzffsVar.zza);
        zzfkh zzfkhVar = zzfkh.CUSTOM_RENDER_SYN;
        return zzfjx.zzd(new zzfjr() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzfjr
            public final void zza() throws Exception {
                this.zza.zzc(zzbepVar);
            }
        }, this.zzd, zzfkhVar, this.zze).zzb(zzfkh.CUSTOM_RENDER_ACK).zzd(zzgee.zzh(zzcrnVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        zzffs zzffsVar;
        return (this.zzc == null || (zzffsVar = zzffnVar.zzt) == null || zzffsVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbep zzbepVar) throws Exception {
        this.zzc.zze(zzbepVar);
    }
}
