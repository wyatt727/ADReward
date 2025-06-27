package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcxu {
    private final zzfkn zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhip zzg;
    private final String zzh;
    private final zzewu zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfgi zzk;
    private final zzddz zzl;

    public zzcxu(zzfkn zzfknVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhip zzhipVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzewu zzewuVar, zzfgi zzfgiVar, zzddz zzddzVar) {
        this.zza = zzfknVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhipVar;
        this.zzh = str2;
        this.zzi = zzewuVar;
        this.zzj = zzgVar;
        this.zzk = zzfgiVar;
        this.zzl = zzddzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzbxd zza(ListenableFuture listenableFuture, Bundle bundle) throws Exception {
        Bundle bundle2 = (Bundle) listenableFuture.get();
        String str = (String) ((ListenableFuture) this.zzg.zzb()).get();
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhk)).booleanValue() && this.zzj.zzO();
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbxd(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z, this.zzk.zzb(), bundle);
    }

    public final ListenableFuture zzb(Bundle bundle) {
        this.zzl.zza();
        return zzfjx.zzc(this.zzi.zza(new Bundle(), bundle), zzfkh.SIGNALS, this.zza).zza();
    }

    public final ListenableFuture zzc() {
        Bundle bundle;
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue() && (bundle = this.zzk.zzr) != null) {
            bundle2.putAll(bundle);
        }
        final ListenableFuture listenableFutureZzb = zzb(bundle2);
        return this.zza.zza(zzfkh.REQUEST_PARCEL, listenableFutureZzb, (ListenableFuture) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcxt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(listenableFutureZzb, bundle2);
            }
        }).zza();
    }
}
