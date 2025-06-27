package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcln implements zzdvq {
    private final zzckh zza;
    private Context zzb;
    private zzblx zzc;

    /* synthetic */ zzcln(zzckh zzckhVar, zzclm zzclmVar) {
        this.zza = zzckhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq
    public final /* synthetic */ zzdvq zza(zzblx zzblxVar) {
        Objects.requireNonNull(zzblxVar);
        this.zzc = zzblxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq
    public final /* synthetic */ zzdvq zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq
    public final zzdvr zzc() {
        zzhjd.zzc(this.zzb, Context.class);
        zzhjd.zzc(this.zzc, zzblx.class);
        return new zzclp(this.zza, this.zzb, this.zzc, null);
    }
}
