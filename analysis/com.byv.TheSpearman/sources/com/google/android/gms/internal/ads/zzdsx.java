package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdg;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdsx implements zzdbl, zzdae, zzcyt, zzczk, com.google.android.gms.ads.internal.client.zza, zzddx {
    private final zzbcx zza;
    private boolean zzb = false;

    public zzdsx(zzbcx zzbcxVar, @Nullable zzfdi zzfdiVar) {
        this.zza = zzbcxVar;
        zzbcxVar.zzb(zzbcz.AD_REQUEST);
        if (zzfdiVar != null) {
            zzbcxVar.zzb(zzbcz.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzb(zzbcz.AD_SUBSEQUENT_CLICK);
        } else {
            this.zza.zzb(zzbcz.AD_FIRST_CLICK);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzb(zzbcz.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                break;
            case 2:
                this.zza.zzb(zzbcz.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                break;
            case 3:
                this.zza.zzb(zzbcz.AD_FAILED_TO_LOAD_NO_FILL);
                break;
            case 4:
                this.zza.zzb(zzbcz.AD_FAILED_TO_LOAD_TIMEOUT);
                break;
            case 5:
                this.zza.zzb(zzbcz.AD_FAILED_TO_LOAD_CANCELLED);
                break;
            case 6:
                this.zza.zzb(zzbcz.AD_FAILED_TO_LOAD_NO_ERROR);
                break;
            case 7:
                this.zza.zzb(zzbcz.AD_FAILED_TO_LOAD_NOT_FOUND);
                break;
            default:
                this.zza.zzb(zzbcz.AD_FAILED_TO_LOAD);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(final zzffz zzffzVar) {
        this.zza.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzdst
            @Override // com.google.android.gms.internal.ads.zzbcw
            public final void zza(zzbdg.zzt.zza zzaVar) {
                zzbdg.zza.zzb zzbVarZzcZ = zzaVar.zze().zzcZ();
                zzbdg.zzi.zza zzaVarZzcZ = zzaVar.zze().zzad().zzcZ();
                zzaVarZzcZ.zzo(zzffzVar.zzb.zzb.zzb);
                zzbVarZzcZ.zzT(zzaVarZzcZ);
                zzaVar.zzG(zzbVarZzcZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzh() {
        this.zza.zzb(zzbcz.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzi(final zzbdg.zzb zzbVar) {
        this.zza.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzdsw
            @Override // com.google.android.gms.internal.ads.zzbcw
            public final void zza(zzbdg.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzb(zzbcz.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzj(final zzbdg.zzb zzbVar) {
        this.zza.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzdsu
            @Override // com.google.android.gms.internal.ads.zzbcw
            public final void zza(zzbdg.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzb(zzbcz.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzl(boolean z) {
        this.zza.zzb(z ? zzbcz.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : zzbcz.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzm(final zzbdg.zzb zzbVar) {
        this.zza.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzdsv
            @Override // com.google.android.gms.internal.ads.zzbcw
            public final void zza(zzbdg.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzb(zzbcz.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzn(boolean z) {
        this.zza.zzb(z ? zzbcz.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : zzbcz.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final synchronized void zzr() {
        this.zza.zzb(zzbcz.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        this.zza.zzb(zzbcz.AD_LOADED);
    }
}
