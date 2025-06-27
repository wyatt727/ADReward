package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdhv implements zzhiv {
    private final zzdhp zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;

    public zzdhv(zzdhp zzdhpVar, zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4) {
        this.zza = zzdhpVar;
        this.zzb = zzhjmVar;
        this.zzc = zzhjmVar2;
        this.zzd = zzhjmVar3;
        this.zze = zzhjmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzcjc) this.zzc).zza();
        final zzffn zzffnVarZza = ((zzcum) this.zzd).zza();
        final zzfgi zzfgiVarZza = ((zzcyh) this.zze).zza();
        return new zzdgf(new zzdae() { // from class: com.google.android.gms.internal.ads.zzdhn
            @Override // com.google.android.gms.internal.ads.zzdae
            public final void zzs() {
                com.google.android.gms.ads.internal.zzu.zzs().zzn(context, versionInfoParcelZza.afmaVersion, zzffnVarZza.zzD.toString(), zzfgiVarZza.zzf);
            }
        }, zzcbr.zzf);
    }
}
