package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzs implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;
    private final zzhjm zzf;
    private final zzhjm zzg;
    private final zzhjm zzh;

    public zzdzs(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6, zzhjm zzhjmVar7, zzhjm zzhjmVar8) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
        this.zzf = zzhjmVar6;
        this.zzg = zzhjmVar7;
        this.zzh = zzhjmVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzr zzb() {
        zzcik zzcikVar = (zzcik) this.zza.zzb();
        Context contextZza = ((zzciq) this.zzb).zza();
        VersionInfoParcel versionInfoParcelZza = ((zzcjc) this.zzc).zza();
        zzfgi zzfgiVarZza = ((zzcyh) this.zzd).zza();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzdzr(zzcikVar, contextZza, versionInfoParcelZza, zzfgiVarZza, zzgepVar, (String) this.zzf.zzb(), (zzflh) this.zzg.zzb(), (zzduc) this.zzh.zzb());
    }
}
