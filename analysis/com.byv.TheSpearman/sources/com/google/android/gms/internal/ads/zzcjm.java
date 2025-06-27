package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcjm implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzcjm(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbwx zzb() {
        Context contextZza = ((zzciq) this.zza).zza();
        zzflk zzflkVar = (zzflk) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzu.zzf().zzb(contextZza, VersionInfoParcel.forPackage(), zzflkVar).zza("google.afma.request.getAdDictionary", zzbpn.zza, zzbpn.zza);
        zzbpq zzbpqVarZzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(contextZza, VersionInfoParcel.forPackage(), zzflkVar);
        zzbpk zzbpkVar = zzbpn.zza;
        return new zzbwz(contextZza, zzbpqVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbpkVar, zzbpkVar), VersionInfoParcel.forPackage());
    }
}
