package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzapk {
    public final int zza;
    public final long zzb;

    private zzapk(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzapk zza(zzadg zzadgVar, zzfo zzfoVar) throws IOException {
        ((zzact) zzadgVar).zzm(zzfoVar.zzM(), 0, 8, false);
        zzfoVar.zzK(0);
        return new zzapk(zzfoVar.zzg(), zzfoVar.zzs());
    }
}
