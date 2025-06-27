package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbrs extends zzbqt {
    private final Adapter zza;
    private final zzbyb zzb;

    zzbrs(Adapter adapter, zzbyb zzbybVar) {
        this.zza = adapter;
        this.zzb = zzbybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zze() throws RemoteException {
        zzbyb zzbybVar = this.zzb;
        if (zzbybVar != null) {
            zzbybVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzf() throws RemoteException {
        zzbyb zzbybVar = this.zzb;
        if (zzbybVar != null) {
            zzbybVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzg(int i) throws RemoteException {
        zzbyb zzbybVar = this.zzb;
        if (zzbybVar != null) {
            zzbybVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzo() throws RemoteException {
        zzbyb zzbybVar = this.zzb;
        if (zzbybVar != null) {
            zzbybVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzp() throws RemoteException {
        zzbyb zzbybVar = this.zzb;
        if (zzbybVar != null) {
            zzbybVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzr(zzbhy zzbhyVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzs(zzbyc zzbycVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzt(zzbyg zzbygVar) throws RemoteException {
        zzbyb zzbybVar = this.zzb;
        if (zzbybVar != null) {
            zzbybVar.zzm(ObjectWrapper.wrap(this.zza), new zzbyc(zzbygVar.zzf(), zzbygVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzu() throws RemoteException {
        zzbyb zzbybVar = this.zzb;
        if (zzbybVar != null) {
            zzbybVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzy() throws RemoteException {
        zzbyb zzbybVar = this.zzb;
        if (zzbybVar != null) {
            zzbybVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
