package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzcrt {
    private final zzctt zza;
    private final View zzb;
    private final zzffo zzc;
    private final zzcgm zzd;

    public zzcrt(View view, zzcgm zzcgmVar, zzctt zzcttVar, zzffo zzffoVar) {
        this.zzb = view;
        this.zzd = zzcgmVar;
        this.zza = zzcttVar;
        this.zzc = zzffoVar;
    }

    public static final zzdgf zzf(final Context context, final VersionInfoParcel versionInfoParcel, final zzffn zzffnVar, final zzfgi zzfgiVar) {
        return new zzdgf(new zzdae() { // from class: com.google.android.gms.internal.ads.zzcrr
            @Override // com.google.android.gms.internal.ads.zzdae
            public final void zzs() {
                com.google.android.gms.ads.internal.zzu.zzs().zzn(context, versionInfoParcel.afmaVersion, zzffnVar.zzD.toString(), zzfgiVar.zzf);
            }
        }, zzcbr.zzf);
    }

    public static final Set zzg(zzctk zzctkVar) {
        return Collections.singleton(new zzdgf(zzctkVar, zzcbr.zzf));
    }

    public static final zzdgf zzh(zzcti zzctiVar) {
        return new zzdgf(zzctiVar, zzcbr.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcgm zzb() {
        return this.zzd;
    }

    public final zzctt zzc() {
        return this.zza;
    }

    public zzdac zzd(Set set) {
        return new zzdac(set);
    }

    public final zzffo zze() {
        return this.zzc;
    }
}
