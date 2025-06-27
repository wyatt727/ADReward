package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrd {
    private final Context zza;
    private final zzph zzb;
    private boolean zzc;
    private final zzrc zzd;
    private zzrf zze;
    private zzqv zzf;

    @Deprecated
    public zzrd() {
        this.zza = null;
        this.zzb = zzph.zza;
        this.zzd = zzrc.zza;
    }

    public final zzrr zzd() {
        zzek.zzf(!this.zzc);
        this.zzc = true;
        if (this.zze == null) {
            this.zze = new zzrf(new zzdt[0]);
        }
        if (this.zzf == null) {
            this.zzf = new zzqv(this.zza);
        }
        return new zzrr(this, null);
    }

    public zzrd(Context context) {
        this.zza = context;
        this.zzb = zzph.zza;
        this.zzd = zzrc.zza;
    }
}
