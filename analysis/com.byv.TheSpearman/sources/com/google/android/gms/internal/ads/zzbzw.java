package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbzw {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcad zzd;

    private zzbzw() {
    }

    /* synthetic */ zzbzw(zzbzv zzbzvVar) {
    }

    public final zzbzw zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbzw zzb(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzbzw zzc(Clock clock) {
        Objects.requireNonNull(clock);
        this.zzb = clock;
        return this;
    }

    public final zzbzw zzd(zzcad zzcadVar) {
        this.zzd = zzcadVar;
        return this;
    }

    public final zzcae zze() {
        zzhjd.zzc(this.zza, Context.class);
        zzhjd.zzc(this.zzb, Clock.class);
        zzhjd.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhjd.zzc(this.zzd, zzcad.class);
        return new zzbzy(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
