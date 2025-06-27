package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalw {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzalw(int i, int i2, int i3, int i4, int i5) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzalw zza(java.lang.String r12) {
        /*
            java.lang.String r0 = "Format:"
            boolean r0 = r12.startsWith(r0)
            com.google.android.gms.internal.ads.zzek.zzd(r0)
            r0 = 7
            java.lang.String r12 = r12.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r12 = android.text.TextUtils.split(r12, r0)
            r0 = 0
            r1 = -1
            r2 = r0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        L1b:
            int r8 = r12.length
            if (r2 >= r8) goto L6f
            r3 = r12[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfvx.zza(r3)
            int r8 = r3.hashCode()
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r8) {
                case 100571: goto L51;
                case 3556653: goto L47;
                case 109757538: goto L3d;
                case 109780401: goto L33;
                default: goto L32;
            }
        L32:
            goto L5b
        L33:
            java.lang.String r8 = "style"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L5b
            r3 = r10
            goto L5c
        L3d:
            java.lang.String r8 = "start"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L5b
            r3 = r0
            goto L5c
        L47:
            java.lang.String r8 = "text"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L5b
            r3 = r9
            goto L5c
        L51:
            java.lang.String r8 = "end"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L5b
            r3 = r11
            goto L5c
        L5b:
            r3 = r1
        L5c:
            if (r3 == 0) goto L6b
            if (r3 == r11) goto L69
            if (r3 == r10) goto L67
            if (r3 == r9) goto L65
            goto L6c
        L65:
            r7 = r2
            goto L6c
        L67:
            r6 = r2
            goto L6c
        L69:
            r5 = r2
            goto L6c
        L6b:
            r4 = r2
        L6c:
            int r2 = r2 + 1
            goto L1b
        L6f:
            if (r4 == r1) goto L7c
            if (r5 == r1) goto L7c
            if (r7 == r1) goto L7c
            com.google.android.gms.internal.ads.zzalw r12 = new com.google.android.gms.internal.ads.zzalw
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            return r12
        L7c:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalw.zza(java.lang.String):com.google.android.gms.internal.ads.zzalw");
    }
}
