package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfda {
    private final zzfhw zza;
    private final zzcxx zzb;
    private final Executor zzc;
    private zzfcz zzd;

    public zzfda(zzfhw zzfhwVar, zzcxx zzcxxVar, Executor executor) {
        this.zza = zzfhwVar;
        this.zzb = zzcxxVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfig zze() {
        zzfgi zzfgiVarZzg = this.zzb.zzg();
        return this.zza.zzc(zzfgiVarZzg.zzd, zzfgiVarZzg.zzf, zzfgiVarZzg.zzj);
    }

    public final ListenableFuture zzc() {
        ListenableFuture listenableFutureZze;
        zzfcz zzfczVar = this.zzd;
        if (zzfczVar != null) {
            return zzgee.zzh(zzfczVar);
        }
        if (((Boolean) zzbfz.zza.zze()).booleanValue()) {
            listenableFutureZze = zzgee.zze(zzgee.zzm(zzgdv.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfcx(this), this.zzc), zzeal.class, new zzfcw(this), this.zzc);
        } else {
            zzfcz zzfczVar2 = new zzfcz(null, zze(), null);
            this.zzd = zzfczVar2;
            listenableFutureZze = zzgee.zzh(zzfczVar2);
        }
        return zzgee.zzm(listenableFutureZze, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return (zzfcz) obj;
            }
        }, this.zzc);
    }
}
