package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcti implements zzdae, zzczk {
    private final Context zza;
    private final zzcgm zzb;
    private final zzffn zzc;
    private final VersionInfoParcel zzd;
    private zzfmy zze;
    private boolean zzf;

    public zzcti(Context context, zzcgm zzcgmVar, zzffn zzffnVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzcgmVar;
        this.zzc = zzffnVar;
        this.zzd = versionInfoParcel;
    }

    private final synchronized void zza() {
        zzege zzegeVar;
        zzegd zzegdVar;
        if (this.zzc.zzU && this.zzb != null) {
            if (com.google.android.gms.ads.internal.zzu.zzA().zzj(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfgl zzfglVar = this.zzc.zzW;
                String strZza = zzfglVar.zza();
                if (zzfglVar.zzb() == 1) {
                    zzegdVar = zzegd.VIDEO;
                    zzegeVar = zzege.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzffn zzffnVar = this.zzc;
                    zzegd zzegdVar2 = zzegd.HTML_DISPLAY;
                    zzegeVar = zzffnVar.zzf == 1 ? zzege.ONE_PIXEL : zzege.BEGIN_TO_RENDER;
                    zzegdVar = zzegdVar2;
                }
                zzfmy zzfmyVarZza = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzb.zzG(), "", "javascript", strZza, zzegeVar, zzegdVar, this.zzc.zzam);
                this.zze = zzfmyVarZza;
                Object obj = this.zzb;
                if (zzfmyVarZza != null) {
                    com.google.android.gms.ads.internal.zzu.zzA().zzh(this.zze, (View) obj);
                    this.zzb.zzaq(this.zze);
                    com.google.android.gms.ads.internal.zzu.zzA().zzi(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final synchronized void zzr() {
        zzcgm zzcgmVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcgmVar = this.zzb) == null) {
            return;
        }
        zzcgmVar.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final synchronized void zzs() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
