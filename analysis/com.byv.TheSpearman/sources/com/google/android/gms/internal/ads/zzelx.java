package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzelx extends zzbqt {
    private final zzcyo zza;
    private final zzdgl zzb;
    private final zzczi zzc;
    private final zzczx zzd;
    private final zzdac zze;
    private final zzddk zzf;
    private final zzdaw zzg;
    private final zzdhi zzh;
    private final zzddg zzi;
    private final zzczd zzj;

    public zzelx(zzcyo zzcyoVar, zzdgl zzdglVar, zzczi zzcziVar, zzczx zzczxVar, zzdac zzdacVar, zzddk zzddkVar, zzdaw zzdawVar, zzdhi zzdhiVar, zzddg zzddgVar, zzczd zzczdVar) {
        this.zza = zzcyoVar;
        this.zzb = zzdglVar;
        this.zzc = zzcziVar;
        this.zzd = zzczxVar;
        this.zze = zzdacVar;
        this.zzf = zzddkVar;
        this.zzg = zzdawVar;
        this.zzh = zzdhiVar;
        this.zzi = zzddgVar;
        this.zzj = zzczdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdG();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzf() {
        this.zzg.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfhk.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzp() {
        this.zzg.zzdr();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzr(zzbhy zzbhyVar, String str) {
    }

    public void zzs(zzbyc zzbycVar) {
    }

    public void zzt(zzbyg zzbygVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
