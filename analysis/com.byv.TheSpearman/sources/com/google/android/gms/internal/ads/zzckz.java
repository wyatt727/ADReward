package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzckz implements zzfcb {
    private final zzckh zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* synthetic */ zzckz(zzckh zzckhVar, zzcky zzckyVar) {
        this.zza = zzckhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcb
    public final /* synthetic */ zzfcb zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcb
    public final /* synthetic */ zzfcb zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcb
    public final /* synthetic */ zzfcb zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcb
    public final zzfcc zzd() {
        zzhjd.zzc(this.zzb, Context.class);
        zzhjd.zzc(this.zzc, String.class);
        zzhjd.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzclb(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
