package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzblu extends zzblw {
    private final OnH5AdsEventListener zza;

    public zzblu(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
