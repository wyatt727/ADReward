package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfcq implements zzfde {
    private final zzfhw zza;
    private final Executor zzb;
    private final zzgea zzc = new zzfco(this);

    public zzfcq(zzfhw zzfhwVar, Executor executor) {
        this.zza = zzfhwVar;
        this.zzb = executor;
    }

    final /* synthetic */ ListenableFuture zza(zzcxx zzcxxVar, zzfcz zzfczVar) throws Exception {
        zzfhw zzfhwVar = this.zza;
        zzfig zzfigVar = zzfczVar.zzb;
        zzbxd zzbxdVar = zzfczVar.zza;
        zzfif zzfifVarZzb = zzfhwVar.zzb(zzfigVar);
        if (zzfifVarZzb != null && zzbxdVar != null) {
            zzgee.zzr(zzcxxVar.zzb().zzh(zzbxdVar), this.zzc, this.zzb);
        }
        return zzgee.zzh(new zzfcp(zzfigVar, zzbxdVar, zzfifVarZzb));
    }

    public final ListenableFuture zzb(zzfdf zzfdfVar, zzfdd zzfddVar, final zzcxx zzcxxVar) {
        return zzgee.zze(zzgee.zzn(zzgdv.zzu(new zzfda(this.zza, zzcxxVar, this.zzb).zzc()), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zza(zzcxxVar, (zzfcz) obj);
            }
        }, this.zzb), Exception.class, new zzfcn(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdf zzfdfVar, zzfdd zzfddVar, Object obj) {
        return zzb(zzfdfVar, zzfddVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
