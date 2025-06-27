package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzut {
    private final zzadm zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzgu zze;
    private final zzalf zzf;

    public zzut(zzadm zzadmVar, zzalf zzalfVar) {
        this.zza = zzadmVar;
        this.zzf = zzalfVar;
    }

    public final void zza(zzgu zzguVar) {
        if (zzguVar != this.zze) {
            this.zze = zzguVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
