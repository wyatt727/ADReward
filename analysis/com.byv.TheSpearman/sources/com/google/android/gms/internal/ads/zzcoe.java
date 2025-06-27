package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcoe implements zzcoa {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcoe(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zza(Map map) {
        this.zza.zzy(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
