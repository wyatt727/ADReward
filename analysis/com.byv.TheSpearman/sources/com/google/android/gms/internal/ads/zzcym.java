package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcym implements zzhiv {
    private final zzcyl zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;

    public zzcym(zzcyl zzcylVar, zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4) {
        this.zza = zzcylVar;
        this.zzb = zzhjmVar;
        this.zzc = zzhjmVar2;
        this.zzd = zzhjmVar3;
        this.zze = zzhjmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcjc) this.zzc).zza();
        zzffn zzffnVarZza = ((zzcum) this.zzd).zza();
        zzbzk zzbzkVar = new zzbzk();
        zzbzl zzbzlVar = zzffnVarZza.zzB;
        if (zzbzlVar == null) {
            return null;
        }
        zzffs zzffsVar = zzffnVarZza.zzt;
        return new zzbzj(context, versionInfoParcelZza, zzbzlVar, zzffsVar == null ? null : zzffsVar.zzb, zzbzkVar);
    }
}
