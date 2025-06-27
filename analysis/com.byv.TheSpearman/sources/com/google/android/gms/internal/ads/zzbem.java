package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes3.dex */
public final class zzbem {
    private final Map zza = new HashMap();
    private final zzbeo zzb;

    public zzbem(zzbeo zzbeoVar) {
        this.zzb = zzbeoVar;
    }

    public final zzbeo zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbel zzbelVar) {
        this.zza.put(str, zzbelVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbel zzbelVar = (zzbel) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbelVar != null) {
            this.zzb.zze(zzbelVar, j, strArr);
        }
        this.zza.put(str, new zzbel(j, null, null));
    }
}
