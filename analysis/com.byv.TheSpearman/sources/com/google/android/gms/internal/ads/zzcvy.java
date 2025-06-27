package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcvy implements com.google.android.gms.ads.internal.client.zza {
    private final zzcwc zza;
    private final zzfgi zzb;

    zzcvy(zzcwc zzcwcVar, zzfgi zzfgiVar) {
        this.zza = zzcwcVar;
        this.zzb = zzfgiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
