package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgcd {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(int r5, int r6, java.math.RoundingMode r7) {
        /*
            java.util.Objects.requireNonNull(r7)
            int r6 = r5 / 8
            int r0 = r6 * 8
            int r0 = r5 - r0
            if (r0 != 0) goto Lc
            goto L53
        Lc:
            r1 = 8
            r5 = r5 ^ r1
            int[] r2 = com.google.android.gms.internal.ads.zzgcc.zza
            int r3 = r7.ordinal()
            r2 = r2[r3]
            int r5 = r5 >> 31
            r3 = 1
            r5 = r5 | r3
            r4 = 0
            switch(r2) {
                case 1: goto L50;
                case 2: goto L53;
                case 3: goto L48;
                case 4: goto L4e;
                case 5: goto L45;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r0 = java.lang.Math.abs(r0)
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 - r0
            int r0 = r0 - r1
            if (r0 != 0) goto L42
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r7 == r0) goto L4c
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r0) goto L3b
            r7 = r3
            goto L3c
        L3b:
            r7 = r4
        L3c:
            r0 = r6 & 1
            r7 = r7 & r0
            if (r7 == 0) goto L4b
            goto L4c
        L42:
            if (r0 <= 0) goto L4b
            goto L4c
        L45:
            if (r5 <= 0) goto L4b
            goto L4c
        L48:
            if (r5 >= 0) goto L4b
            goto L4c
        L4b:
            r3 = r4
        L4c:
            if (r3 == 0) goto L53
        L4e:
            int r6 = r6 + r5
            return r6
        L50:
            com.google.android.gms.internal.ads.zzgcg.zzb(r4)
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcd.zza(int, int, java.math.RoundingMode):int");
    }
}
