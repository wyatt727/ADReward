package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcxb implements zzdbl, zzdgz {
    private final Context zza;
    private final zzfgi zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdwk zze;
    private final zzflk zzf;

    public zzcxb(Context context, zzfgi zzfgiVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdwk zzdwkVar, zzflk zzflkVar) {
        this.zza = context;
        this.zzb = zzfgiVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzdwkVar;
        this.zzf = zzflkVar;
    }

    private final void zzc() throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdT)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfgi zzfgiVar = this.zzb;
            zzflk zzflkVar = this.zzf;
            com.google.android.gms.ads.internal.zzu.zza().zzc(context, versionInfoParcel, zzfgiVar.zzf, zzgVar.zzg(), zzflkVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdU)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) throws JSONException {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zze(String str) {
    }
}
