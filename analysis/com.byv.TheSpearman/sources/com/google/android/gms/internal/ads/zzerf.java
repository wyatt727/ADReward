package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzerf implements zzewq {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;

    public zzerf(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = i6;
        this.zzi = f;
        this.zzj = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzewq
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.zza);
        bundle.putBoolean("ma", this.zzb);
        bundle.putBoolean("sp", this.zzc);
        bundle.putInt("muv", this.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkE)).booleanValue()) {
            bundle.putInt("muv_min", this.zze);
            bundle.putInt("muv_max", this.zzf);
        }
        bundle.putInt("rm", this.zzg);
        bundle.putInt("riv", this.zzh);
        bundle.putFloat("android_app_volume", this.zzi);
        bundle.putBoolean("android_app_muted", this.zzj);
    }
}
