package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeon {
    private final zzdlj zza;
    private final zzeoa zzb;
    private final zzcyt zzc;

    public zzeon(zzdlj zzdljVar, zzduh zzduhVar) {
        this.zza = zzdljVar;
        final zzeoa zzeoaVar = new zzeoa(zzduhVar);
        this.zzb = zzeoaVar;
        final zzbnr zzbnrVarZzg = zzdljVar.zzg();
        this.zzc = new zzcyt() { // from class: com.google.android.gms.internal.ads.zzeom
            @Override // com.google.android.gms.internal.ads.zzcyt
            public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeoaVar.zzdB(zzeVar);
                zzbnr zzbnrVar = zzbnrVarZzg;
                if (zzbnrVar != null) {
                    try {
                        zzbnrVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbnrVar != null) {
                    try {
                        zzbnrVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzcyt zza() {
        return this.zzc;
    }

    public final zzdae zzb() {
        return this.zzb;
    }

    public final zzdjd zzc() {
        return new zzdjd(this.zza, this.zzb.zzg());
    }

    public final zzeoa zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzj(zzbhVar);
    }
}
