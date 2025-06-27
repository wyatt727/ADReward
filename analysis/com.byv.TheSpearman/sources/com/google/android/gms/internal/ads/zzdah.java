package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdah implements zzhiv {
    private final zzhjm zza;

    public zzdah(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    public static zzdag zzc(Set set) {
        return new zzdag(set);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdag zzb() {
        return new zzdag(((zzhjj) this.zza).zzb());
    }
}
