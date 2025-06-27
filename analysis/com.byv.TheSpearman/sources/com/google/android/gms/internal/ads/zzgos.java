package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgos {
    private final Map zza;
    private final List zzb;
    private final zzgoq zzc;
    private final Class zzd;
    private final zzgrs zze;

    /* synthetic */ zzgos(Map map, List list, zzgoq zzgoqVar, zzgrs zzgrsVar, Class cls, zzgor zzgorVar) {
        this.zza = map;
        this.zzb = list;
        this.zzc = zzgoqVar;
        this.zzd = cls;
        this.zze = zzgrsVar;
    }

    public static zzgoo zza(Class cls) {
        return new zzgoo(cls, null);
    }

    @Nullable
    public final zzgoq zzb() {
        return this.zzc;
    }

    public final zzgrs zzc() {
        return this.zze;
    }

    public final Class zzd() {
        return this.zzd;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf(byte[] bArr) {
        List list = (List) this.zza.get(zzgxm.zzb(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzg() {
        return !this.zze.zza().isEmpty();
    }
}
