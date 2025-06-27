package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhc implements zzgu {
    private final Context zza;
    private final zzgu zzb;

    public zzhc(Context context) {
        zzhe zzheVar = new zzhe();
        this.zza = context.getApplicationContext();
        this.zzb = zzheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final /* bridge */ /* synthetic */ zzgv zza() {
        return new zzhd(this.zza, ((zzhe) this.zzb).zza());
    }
}
