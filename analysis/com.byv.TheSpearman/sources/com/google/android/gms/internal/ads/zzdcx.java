package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdcx implements AppEventListener, OnAdMetadataChangedListener, zzcyq, com.google.android.gms.ads.internal.client.zza, zzdbb, zzczk, zzdap, com.google.android.gms.ads.internal.overlay.zzp, zzczg, zzdgn {
    private final zzdcv zza = new zzdcv(this, null);

    @Nullable
    private zzeoa zzb;

    @Nullable
    private zzeoe zzc;

    @Nullable
    private zzfbl zzd;

    @Nullable
    private zzfeq zze;

    private static void zzn(Object obj, zzdcw zzdcwVar) {
        if (obj != null) {
            zzdcwVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbn
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbo
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoe) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbt
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbz
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zza() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcs
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).zza();
            }
        });
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdct
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzb() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcl
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).zzb();
            }
        });
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcm
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzc() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbu
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).zzc();
            }
        });
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbv
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdG() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdci
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).zzdG();
            }
        });
        zzn(this.zzc, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcn
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoe) obj).zzdG();
            }
        });
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdco
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zzdG();
            }
        });
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcp
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfbl) obj).zzdG();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcg
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdf() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdca
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).zzdf();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbs
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcf
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfbl) obj).zzdq();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcb
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfbl) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzds(final zzbxq zzbxqVar, final String str, final String str2) {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbw
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdby
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zzds(zzbxqVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdch
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfbl) obj).zzdt();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(final int i) {
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcj
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfbl) obj).zzdu(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zze() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbm
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbx
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzf() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbp
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbq
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzg() {
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdck
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfbl) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcc
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).zzh(zzsVar);
            }
        });
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zzh(zzsVar);
            }
        });
        zzn(this.zzd, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdce
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfbl) obj).zzh(zzsVar);
            }
        });
    }

    public final zzdcv zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcq
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzfeq) obj).zzq(zzeVar);
            }
        });
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdcr
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).zzq(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        zzn(this.zzb, new zzdcw() { // from class: com.google.android.gms.internal.ads.zzdbr
            @Override // com.google.android.gms.internal.ads.zzdcw
            public final void zza(Object obj) {
                ((zzeoa) obj).zzr();
            }
        });
    }
}
