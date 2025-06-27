package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public class zzji {
    static final zzji zza = new zzji(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private static volatile zzji zzd;
    private final Map<zza, zzjv.zzd<?, ?>> zze;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    private static final class zza {
        private final Object zza;
        private final int zzb;

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }

        zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
        }
    }

    public static zzji zza() {
        zzji zzjiVar = zzd;
        if (zzjiVar != null) {
            return zzjiVar;
        }
        synchronized (zzji.class) {
            zzji zzjiVar2 = zzd;
            if (zzjiVar2 != null) {
                return zzjiVar2;
            }
            zzji zzjiVarZza = zzju.zza(zzji.class);
            zzd = zzjiVarZza;
            return zzjiVarZza;
        }
    }

    public final <ContainingType extends zzli> zzjv.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzjv.zzd) this.zze.get(new zza(containingtype, i));
    }

    zzji() {
        this.zze = new HashMap();
    }

    private zzji(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
