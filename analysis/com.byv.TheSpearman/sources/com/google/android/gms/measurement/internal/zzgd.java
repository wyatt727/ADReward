package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgd {
    public String zza;
    public Bundle zzb;
    private String zzc;
    private long zzd;

    public final zzbd zza() {
        return new zzbd(this.zza, new zzbc(new Bundle(this.zzb)), this.zzc, this.zzd);
    }

    public static zzgd zza(zzbd zzbdVar) {
        return new zzgd(zzbdVar.zza, zzbdVar.zzc, zzbdVar.zzb.zzb(), zzbdVar.zzd);
    }

    public final String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + String.valueOf(this.zzb);
    }

    private zzgd(String str, String str2, Bundle bundle, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzb = bundle == null ? new Bundle() : bundle;
        this.zzd = j;
    }
}
