package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcrq implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;
    private final zzhjm zzf;
    private final zzhjm zzg;
    private final zzhjm zzh;
    private final zzhjm zzi;
    private final zzhjm zzj;

    public zzcrq(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6, zzhjm zzhjmVar7, zzhjm zzhjmVar8, zzhjm zzhjmVar9, zzhjm zzhjmVar10) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
        this.zzf = zzhjmVar6;
        this.zzg = zzhjmVar7;
        this.zzh = zzhjmVar8;
        this.zzi = zzhjmVar9;
        this.zzj = zzhjmVar10;
    }

    public static zzcrp zzc(zzctu zzctuVar, Context context, zzffo zzffoVar, View view, zzcgm zzcgmVar, zzctt zzcttVar, zzdlj zzdljVar, zzdgp zzdgpVar, zzhip zzhipVar, Executor executor) {
        return new zzcrp(zzctuVar, context, zzffoVar, view, zzcgmVar, zzcttVar, zzdljVar, zzdgpVar, zzhipVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcrp zzb() {
        return new zzcrp(((zzcwf) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcrw) this.zzc).zza(), ((zzcrv) this.zzd).zza(), ((zzcsi) this.zze).zza(), ((zzcrx) this.zzf).zza(), ((zzdjg) this.zzg).zza(), (zzdgp) this.zzh.zzb(), zzhiu.zza(zzhjg.zza(this.zzi)), (Executor) this.zzj.zzb());
    }
}
