package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzd implements zzhiv {
    public static zzdzd zza() {
        return zzdzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String string = UUID.randomUUID().toString();
        zzhjd.zzb(string);
        return string;
    }
}
