package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadp {
    public static zzadr zzb(zzfo zzfoVar) {
        zzfoVar.zzL(1);
        int iZzo = zzfoVar.zzo();
        long jZzd = zzfoVar.zzd();
        long j = iZzo;
        int i = iZzo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jZzt = zzfoVar.zzt();
            if (jZzt == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzt;
            jArrCopyOf2[i2] = zzfoVar.zzt();
            zzfoVar.zzL(2);
            i2++;
        }
        zzfoVar.zzL((int) ((jZzd + j) - zzfoVar.zzd()));
        return new zzadr(jArrCopyOf, jArrCopyOf2);
    }

    public static zzby zza(zzadg zzadgVar, boolean z) throws IOException {
        zzby zzbyVarZza = new zzadx().zza(zzadgVar, z ? null : zzahc.zza);
        if (zzbyVarZza == null || zzbyVarZza.zza() == 0) {
            return null;
        }
        return zzbyVarZza;
    }
}
