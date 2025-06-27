package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcjc implements zzhiv {
    private final zzcin zza;

    public zzcjc(zzcin zzcinVar) {
        this.zza = zzcinVar;
    }

    public final VersionInfoParcel zza() {
        VersionInfoParcel versionInfoParcelZze = this.zza.zze();
        zzhjd.zzb(versionInfoParcelZze);
        return versionInfoParcelZze;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcelZze = this.zza.zze();
        zzhjd.zzb(versionInfoParcelZze);
        return versionInfoParcelZze;
    }
}
