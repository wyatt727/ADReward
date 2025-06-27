package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbpz {
    private final zzbpc zza;
    private ListenableFuture zzb;

    zzbpz(zzbpc zzbpcVar) {
        this.zza = zzbpcVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcbw zzcbwVar = new zzcbw();
            this.zzb = zzcbwVar;
            this.zza.zzb(null).zzj(new zzcca() { // from class: com.google.android.gms.internal.ads.zzbpw
                @Override // com.google.android.gms.internal.ads.zzcca
                public final void zza(Object obj) {
                    zzcbwVar.zzc((zzbpd) obj);
                }
            }, new zzcby() { // from class: com.google.android.gms.internal.ads.zzbpx
                @Override // com.google.android.gms.internal.ads.zzcby
                public final void zza() {
                    zzcbwVar.zzd(new zzbpf("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbqc zza(String str, zzbpj zzbpjVar, zzbpi zzbpiVar) {
        zzd();
        return new zzbqc(this.zzb, "google.afma.activeView.handleUpdate", zzbpjVar, zzbpiVar);
    }

    public final void zzb(final String str, final zzbky zzbkyVar) {
        zzd();
        this.zzb = zzgee.zzn(this.zzb, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzbpy
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                zzbpd zzbpdVar = (zzbpd) obj;
                zzbpdVar.zzq(str, zzbkyVar);
                return zzgee.zzh(zzbpdVar);
            }
        }, zzcbr.zzf);
    }

    public final void zzc(final String str, final zzbky zzbkyVar) {
        this.zzb = zzgee.zzm(this.zzb, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbpv
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                zzbpd zzbpdVar = (zzbpd) obj;
                zzbpdVar.zzr(str, zzbkyVar);
                return zzbpdVar;
            }
        }, zzcbr.zzf);
    }
}
