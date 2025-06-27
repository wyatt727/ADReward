package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzalb {
    public static void zza(zzalc zzalcVar, zzalg zzalgVar, zzep zzepVar) {
        for (int i = 0; i < zzalcVar.zza(); i++) {
            long jZzb = zzalcVar.zzb(i);
            List listZzc = zzalcVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzalcVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                zzepVar.zza(new zzakz(listZzc, jZzb, zzalcVar.zzb(i + 1) - zzalcVar.zzb(i)));
            }
        }
    }
}
