package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfeq implements OnAdMetadataChangedListener, zzdae, zzcyt, zzcyq, zzczg, zzdbb, zzfdb, zzdgn {
    private final zzfhs zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfeq(zzfhs zzfhsVar) {
        this.zza = zzfhsVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfcs.zza(this.zzb, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfee
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zza() {
        this.zza.zza();
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfem
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbym) obj).zzg();
            }
        });
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfen
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzb() {
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfeo
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzc() {
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfdy
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbym) obj).zzj();
            }
        });
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfdz
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zzj();
            }
        });
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfea
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbym) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfej
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbyq) obj).zzf(zzeVar);
            }
        });
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfek
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbyq) obj).zze(i);
            }
        });
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfel
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zzg(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdG() {
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfef
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbym) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzds(final zzbxq zzbxqVar, final String str, final String str2) {
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfep
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                zzbxq zzbxqVar2 = zzbxqVar;
                ((zzbym) obj).zzk(new zzbza(zzbxqVar2.zzc(), zzbxqVar2.zzb()));
            }
        });
        zzfcs.zza(this.zzf, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfdv
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                zzbxq zzbxqVar2 = zzbxqVar;
                ((zzbyr) obj).zze(new zzbza(zzbxqVar2.zzc(), zzbxqVar2.zzb()), str, str2);
            }
        });
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zze(zzbxqVar);
            }
        });
        zzfcs.zza(this.zzg, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfdx
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxr) obj).zze(zzbxqVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zze() {
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfei
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzf() {
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfdu
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zzl();
            }
        });
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfcs.zza(this.zzh, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfeb
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
            }
        });
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzj(zzbym zzbymVar) {
        this.zzd.set(zzbymVar);
    }

    public final void zzk(zzbyq zzbyqVar) {
        this.zzc.set(zzbyqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzl(zzfdb zzfdbVar) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzbxw zzbxwVar) {
        this.zze.set(zzbxwVar);
    }

    @Deprecated
    public final void zzn(zzbxr zzbxrVar) {
        this.zzg.set(zzbxrVar);
    }

    public final void zzo(zzbyr zzbyrVar) {
        this.zzf.set(zzbyrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfeg
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbym) obj).zzi(zzeVar);
            }
        });
        zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfeh
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbym) obj).zzh(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfec
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbyq) obj).zzg();
            }
        });
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzfed
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zzi();
            }
        });
    }
}
