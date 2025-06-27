package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzca extends zzb {
    private final com.google.android.gms.ads.internal.util.client.zzr zza;
    private final String zzb;

    public zzca(Context context, String str, String str2) {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzr(com.google.android.gms.ads.internal.zzu.zzp().zzc(context, str));
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.zza.zza(this.zzb);
    }
}
