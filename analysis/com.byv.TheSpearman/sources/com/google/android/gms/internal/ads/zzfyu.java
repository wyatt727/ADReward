package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfyu extends zzfyh {
    final /* synthetic */ zzfyw zza;
    private final Object zzb;
    private int zzc;

    zzfyu(zzfyw zzfywVar, int i) {
        this.zza = zzfywVar;
        this.zzb = zzfyw.zzg(zzfywVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfwl.zza(this.zzb, zzfyw.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfyw.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfyw zzfywVar = this.zza;
        Object objZzj = zzfyw.zzj(zzfywVar, i);
        zzfyw.zzn(zzfywVar, this.zzc, obj);
        return objZzj;
    }
}
