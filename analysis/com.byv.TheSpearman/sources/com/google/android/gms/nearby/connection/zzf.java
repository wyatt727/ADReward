package com.google.android.gms.nearby.connection;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzf {
    private int zza;
    private int zzb;

    public final zzf zza(int i) {
        this.zza = i;
        return this;
    }

    public final zzf zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final zzg zzc() {
        return new zzg(this.zza, this.zzb, null);
    }
}
