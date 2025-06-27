package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzawv extends zzauy {
    public long zza;
    public long zzb;

    public zzawv() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzawv(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapZza = zza(str);
        if (mapZza != null) {
            this.zza = ((Long) mapZza.get(0)).longValue();
            this.zzb = ((Long) mapZza.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    protected final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }
}
