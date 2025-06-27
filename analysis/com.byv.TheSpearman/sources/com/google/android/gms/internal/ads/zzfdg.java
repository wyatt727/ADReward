package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfdg implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzfdg(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfde zzb() {
        Context context = (Context) this.zza.zzb();
        zzfhs zzfhsVar = (zzfhs) this.zzb.zzb();
        zzfik zzfikVar = (zzfik) this.zzc.zzb();
        zzcbb zzcbbVarZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgu)).booleanValue() ? com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg() : com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh();
        boolean z = false;
        if (zzcbbVarZzg != null && zzcbbVarZzg.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgK)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgt)).booleanValue() || z) {
                zzfij zzfijVarZza = zzfikVar.zza(zzfia.AppOpen, context, zzfhsVar, new zzfci(new zzfcf()));
                return new zzfck(new zzfcu(new zzfct()), new zzfcq(zzfijVarZza.zza, zzcbr.zza), zzfijVarZza.zzb, zzfijVarZza.zza.zza().zzf, zzcbr.zza);
            }
        }
        return new zzfct();
    }
}
