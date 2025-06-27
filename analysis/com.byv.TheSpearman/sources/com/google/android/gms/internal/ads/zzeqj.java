package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeqj implements zzewr {
    private final zzgep zza;
    private final zzfgi zzb;
    private final VersionInfoParcel zzc;
    private final zzcbl zzd;

    public zzeqj(zzgep zzgepVar, zzfgi zzfgiVar, VersionInfoParcel versionInfoParcel, zzcbl zzcblVar) {
        this.zza = zzgepVar;
        this.zzb = zzfgiVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzcblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzeqk zzc() throws Exception {
        return new zzeqk(this.zzb.zzj, this.zzc, this.zzd.zzm());
    }
}
