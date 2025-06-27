package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdg;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdsh implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;

    public zzdsh(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzciq) this.zza).zza();
        final String strZzb = ((zzdza) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcjc) this.zzc).zza();
        final zzbdg.zza.EnumC0145zza enumC0145zza = (zzbdg.zza.EnumC0145zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbcx zzbcxVar = new zzbcx(new zzbdf(contextZza));
        zzbdg.zzar.zza zzaVarZzd = zzbdg.zzar.zzd();
        zzaVarZzd.zzg(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzd.zzi(versionInfoParcelZza.clientJarVersion);
        zzaVarZzd.zzh(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final zzbdg.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        zzbcxVar.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzbcw
            public final void zza(zzbdg.zzt.zza zzaVar) {
                zzbdg.zza.zzb zzbVarZzcZ = zzaVar.zze().zzcZ();
                zzbVarZzcZ.zzH(enumC0145zza);
                zzaVar.zzG(zzbVarZzcZ);
                zzbdg.zzm.zza zzaVarZzcZ = zzaVar.zzg().zzcZ();
                zzaVarZzcZ.zzm(strZzb);
                zzaVarZzcZ.zzw(zzarVarZzbr);
                zzaVar.zzK(zzaVarZzcZ);
                zzaVar.zzO(str);
            }
        });
        return zzbcxVar;
    }
}
