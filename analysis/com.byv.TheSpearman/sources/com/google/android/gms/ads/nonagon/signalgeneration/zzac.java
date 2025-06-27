package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzawo;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzciq;
import com.google.android.gms.internal.ads.zzcjc;
import com.google.android.gms.internal.ads.zzdum;
import com.google.android.gms.internal.ads.zzfgm;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzgep;
import com.google.android.gms.internal.ads.zzhiv;
import com.google.android.gms.internal.ads.zzhjd;
import com.google.android.gms.internal.ads.zzhjm;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzac implements zzhiv {
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
    private final zzhjm zzk;

    public zzac(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6, zzhjm zzhjmVar7, zzhjm zzhjmVar8, zzhjm zzhjmVar9, zzhjm zzhjmVar10, zzhjm zzhjmVar11) {
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
        this.zzk = zzhjmVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcik zzcikVar = (zzcik) this.zza.zzb();
        Context contextZza = ((zzciq) this.zzb).zza();
        zzawo zzawoVar = (zzawo) this.zzc.zzb();
        zzfhh zzfhhVar = (zzfhh) this.zzd.zzb();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzab(zzcikVar, contextZza, zzawoVar, zzfhhVar, zzgepVar, (ScheduledExecutorService) this.zzf.zzb(), (zzdum) this.zzg.zzb(), (zzfmt) this.zzh.zzb(), ((zzcjc) this.zzi).zza(), ((zzbfb) this.zzj).zzb(), (zzfgm) this.zzk.zzb());
    }
}
