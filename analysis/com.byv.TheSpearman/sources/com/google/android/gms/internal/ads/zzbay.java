package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbay {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    public zzbay(float f, float f2, float f3, float f4, int i) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f + f3;
        this.zzd = f2 + f4;
        this.zze = i;
    }

    final float zza() {
        return this.zzd;
    }

    final float zzb() {
        return this.zza;
    }

    final float zzc() {
        return this.zzc;
    }

    final float zzd() {
        return this.zzb;
    }

    final int zze() {
        return this.zze;
    }
}
