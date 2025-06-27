package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzclx implements zzfds {
    private final zzckh zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* synthetic */ zzclx(zzckh zzckhVar, zzclw zzclwVar) {
        this.zza = zzckhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfds
    public final /* synthetic */ zzfds zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfds
    public final /* synthetic */ zzfds zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfds
    public final /* synthetic */ zzfds zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfds
    public final zzfdt zzd() {
        zzhjd.zzc(this.zzb, Context.class);
        zzhjd.zzc(this.zzc, String.class);
        zzhjd.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzclz(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
