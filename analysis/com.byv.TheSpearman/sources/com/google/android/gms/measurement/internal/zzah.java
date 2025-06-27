package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zziq;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzah {
    private final EnumMap<zziq.zza, zzak> zza;

    public final zzak zza(zziq.zza zzaVar) {
        zzak zzakVar = this.zza.get(zzaVar);
        return zzakVar == null ? zzak.UNSET : zzakVar;
    }

    public static zzah zza(String str) {
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        if (str.length() >= zziq.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zziq.zza[] zzaVarArrValues = zziq.zza.values();
                int length = zzaVarArrValues.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) zzaVarArrValues[i], (zziq.zza) zzak.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new zzah(enumMap);
            }
        }
        return new zzah();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zziq.zza zzaVar : zziq.zza.values()) {
            zzak zzakVar = this.zza.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.UNSET;
            }
            sb.append(zzakVar.zzl);
        }
        return sb.toString();
    }

    zzah() {
        this.zza = new EnumMap<>(zziq.zza.class);
    }

    private zzah(EnumMap<zziq.zza, zzak> enumMap) {
        EnumMap<zziq.zza, zzak> enumMap2 = new EnumMap<>(zziq.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.measurement.internal.zziq.zza r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.zzak r0 = com.google.android.gms.measurement.internal.zzak.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.zzak r0 = com.google.android.gms.measurement.internal.zzak.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.zzak r0 = com.google.android.gms.measurement.internal.zzak.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.zzak r0 = com.google.android.gms.measurement.internal.zzak.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.zzak r0 = com.google.android.gms.measurement.internal.zzak.TCF
        L20:
            java.util.EnumMap<com.google.android.gms.measurement.internal.zziq$zza, com.google.android.gms.measurement.internal.zzak> r4 = r2.zza
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzah.zza(com.google.android.gms.measurement.internal.zziq$zza, int):void");
    }

    public final void zza(zziq.zza zzaVar, zzak zzakVar) {
        this.zza.put((EnumMap<zziq.zza, zzak>) zzaVar, (zziq.zza) zzakVar);
    }
}
