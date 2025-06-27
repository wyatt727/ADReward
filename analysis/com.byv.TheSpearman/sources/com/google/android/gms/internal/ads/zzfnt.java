package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfnt {
    private final zzfpg zza;
    private final String zzb;
    private final zzfnf zzc;
    private final String zzd = "Ad overlay";

    public zzfnt(View view, zzfnf zzfnfVar, String str) {
        this.zza = new zzfpg(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfnfVar;
    }

    public final zzfnf zza() {
        return this.zzc;
    }

    public final zzfpg zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
