package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfbl implements zzcyt, zzdap, zzfdb, com.google.android.gms.ads.internal.overlay.zzp, zzdbb, zzczg, zzdgn {
    private final zzfhs zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfbl zzh = null;

    public zzfbl(zzfhs zzfhsVar) {
        this.zza = zzfhsVar;
    }

    public static zzfbl zzi(zzfbl zzfblVar) {
        zzfbl zzfblVar2 = new zzfbl(zzfblVar.zza);
        zzfblVar2.zzh = zzfblVar;
        return zzfblVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdG() {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzdG();
        } else {
            zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbc
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) throws RemoteException {
                    ((zzbby) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdf() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzdq();
        } else {
            zzfcs.zza(this.zzf, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfaz
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdq();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzdr();
            return;
        }
        zzfcs.zza(this.zzf, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdr();
            }
        });
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfax
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbby) obj).zzf();
            }
        });
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfay
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbby) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzdt();
        } else {
            zzfcs.zza(this.zzf, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbj
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdt();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(final int i) {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzdu(i);
        } else {
            zzfcs.zza(this.zzf, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbf
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdu(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzg() {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzg();
        } else {
            zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbi
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) {
                    ((zzdap) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzh(zzsVar);
        } else {
            zzfcs.zza(this.zzg, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfaw
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
                }
            });
        }
    }

    public final void zzj() {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzj();
            return;
        }
        this.zza.zza();
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbd
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbbv) obj).zza();
            }
        });
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbe
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbby) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzl(zzfdb zzfdbVar) {
        this.zzh = (zzfbl) zzfdbVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzp zzpVar) {
        this.zzf.set(zzpVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzg.set(zzdgVar);
    }

    public final void zzo(zzbbu zzbbuVar) {
        this.zzb.set(zzbbuVar);
    }

    public final void zzp(zzbby zzbbyVar) {
        this.zzd.set(zzbbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzq(zzeVar);
        } else {
            zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfba
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) throws RemoteException {
                    ((zzbby) obj).zzd(zzeVar);
                }
            });
        }
    }

    public final void zzk(final zzbbr zzbbrVar) {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzk(zzbbrVar);
        } else {
            zzfcs.zza(this.zzb, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbb
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) throws RemoteException {
                    ((zzbbu) obj).zzd(zzbbrVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfbl zzfblVar = this.zzh;
        if (zzfblVar != null) {
            zzfblVar.zzdB(zzeVar);
        } else {
            zzfcs.zza(this.zzb, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbg
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) throws RemoteException {
                    ((zzbbu) obj).zzc(zzeVar);
                }
            });
            zzfcs.zza(this.zzb, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfbh
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) throws RemoteException {
                    ((zzbbu) obj).zzb(zzeVar.zza);
                }
            });
        }
    }
}
