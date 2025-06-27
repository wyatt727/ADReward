package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.json.t2;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeoa implements AppEventListener, zzdbl, zzdae, zzcyt, zzczk, com.google.android.gms.ads.internal.client.zza, zzcyq, zzdbb, zzczg, zzdgn {
    final zzduh zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziL)).intValue());

    public zzeoa(zzduh zzduhVar) {
        this.zza = zzduhVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final Pair pair : this.zzb) {
                zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenl
                    @Override // com.google.android.gms.internal.ads.zzfcr
                    public final void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
            return;
        }
        zzfcs.zza(this.zzc, zzeny.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzfcs.zza(this.zzd, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzens
                @Override // com.google.android.gms.internal.ads.zzfcr
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("The queue for app events is full, dropping the new event.");
            zzduh zzduhVar = this.zza;
            if (zzduhVar != null) {
                zzdug zzdugVarZza = zzduhVar.zza();
                zzdugVarZza.zzb(t2.h.h, "dae_action");
                zzdugVarZza.zzb("dae_name", str);
                zzdugVarZza.zzb("dae_data", str2);
                zzdugVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zza() {
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzeni
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
            }
        });
        zzfcs.zza(this.zzg, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenj
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzb() {
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzc() {
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenv
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzj();
            }
        });
        zzfcs.zza(this.zzg, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenw
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzf();
            }
        });
        zzfcs.zza(this.zzg, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenx
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzf(zzeVar);
            }
        });
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zze(zzeVar.zza);
            }
        });
        zzfcs.zza(this.zzf, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzeno
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdG() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
            zzfcs.zza(this.zzc, zzeny.zza);
        }
        zzfcs.zza(this.zzg, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenk
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdf() {
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenu
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzds(zzbxq zzbxqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzf() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzg() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfcs.zza(this.zze, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcb zzi() {
        return (com.google.android.gms.ads.internal.client.zzcb) this.zzd.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzc.set(zzbhVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.set(zzbkVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zze.set(zzdgVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zzd.set(zzcbVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzg.set(zzciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfcs.zza(this.zzg, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzd(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final synchronized void zzs() {
        zzfcs.zza(this.zzc, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenp
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
            }
        });
        zzfcs.zza(this.zzf, new zzfcr() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // com.google.android.gms.internal.ads.zzfcr
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }
}
