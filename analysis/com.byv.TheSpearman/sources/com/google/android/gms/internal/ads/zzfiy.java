package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfiy {
    private final zzfir zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfiy(final zzfhw zzfhwVar, final zzfiq zzfiqVar, final zzfir zzfirVar) {
        this.zza = zzfirVar;
        this.zzb = zzgee.zzf(zzgee.zzn(zzfiqVar.zza(zzfirVar), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfiw
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzfiqVar, zzfhwVar, zzfirVar, (zzfif) obj);
            }
        }, zzfirVar.zzb()), Exception.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfix
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfiqVar, (Exception) obj);
            }
        }, zzfirVar.zzb());
    }

    public final synchronized ListenableFuture zza(zzfir zzfirVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfirVar.zza() != null && this.zza.zza().equals(zzfirVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    final /* synthetic */ ListenableFuture zzb(zzfiq zzfiqVar, zzfhw zzfhwVar, zzfir zzfirVar, zzfif zzfifVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfiqVar.zzb(zzfifVar);
            if (this.zzc) {
                return zzgee.zzh(new zzfip(zzfifVar, zzfirVar));
            }
            zzfhwVar.zzd(zzfirVar.zza(), zzfifVar);
            return zzgee.zzh(null);
        }
    }

    final /* synthetic */ ListenableFuture zzc(zzfiq zzfiqVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgea zzgeaVar) {
        zzgee.zzr(zzgee.zzn(this.zzb, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfiv
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzi();
            }
        }, this.zza.zzb()), zzgeaVar, this.zza.zzb());
    }
}
