package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhji {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhji(int i, int i2, zzhjh zzhjhVar) {
        this.zza = zzhis.zzc(i);
        this.zzb = zzhis.zzc(i2);
    }

    public final zzhji zza(zzhje zzhjeVar) {
        this.zzb.add(zzhjeVar);
        return this;
    }

    public final zzhji zzb(zzhje zzhjeVar) {
        this.zza.add(zzhjeVar);
        return this;
    }

    public final zzhjj zzc() {
        return new zzhjj(this.zza, this.zzb, null);
    }
}
