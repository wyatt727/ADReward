package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdpu implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcgz zzb;
    private final Context zzc;
    private final zzduh zzd;
    private final zzefd zze;
    private final Executor zzf;
    private final zzawo zzg;
    private final VersionInfoParcel zzh;
    private final zzfmt zzi;
    private final zzefo zzj;
    private final zzfgm zzk;

    public zzdpu(Context context, Executor executor, zzawo zzawoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcgz zzcgzVar, zzefd zzefdVar, zzfmt zzfmtVar, zzduh zzduhVar, zzefo zzefoVar, zzfgm zzfgmVar) {
        this.zzc = context;
        this.zzf = executor;
        this.zzg = zzawoVar;
        this.zzh = versionInfoParcel;
        this.zza = zzaVar;
        this.zzb = zzcgzVar;
        this.zze = zzefdVar;
        this.zzi = zzfmtVar;
        this.zzd = zzduhVar;
        this.zzj = zzefoVar;
        this.zzk = zzfgmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdpx zzdpxVar = new zzdpx(this);
        zzdpxVar.zzk();
        return zzdpxVar;
    }
}
