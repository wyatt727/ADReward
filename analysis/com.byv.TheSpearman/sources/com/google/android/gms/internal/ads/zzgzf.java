package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgzf {
    static final zzgzf zza = new zzgzf(true);
    private static volatile boolean zzb = false;
    private static volatile zzgzf zzc;
    private final Map zzd;

    zzgzf() {
        this.zzd = new HashMap();
    }

    public static zzgzf zza() {
        return zza;
    }

    public final zzgzt zzc(zzhbl zzhblVar, int i) {
        return (zzgzt) this.zzd.get(new zzgze(zzhblVar, i));
    }

    zzgzf(boolean z) {
        this.zzd = Collections.emptyMap();
    }

    public static zzgzf zzb() {
        zzgzf zzgzfVar = zzc;
        if (zzgzfVar != null) {
            return zzgzfVar;
        }
        synchronized (zzgzf.class) {
            zzgzf zzgzfVar2 = zzc;
            if (zzgzfVar2 != null) {
                return zzgzfVar2;
            }
            zzgzf zzgzfVarZzb = zzgzn.zzb(zzgzf.class);
            zzc = zzgzfVarZzb;
            return zzgzfVarZzb;
        }
    }
}
