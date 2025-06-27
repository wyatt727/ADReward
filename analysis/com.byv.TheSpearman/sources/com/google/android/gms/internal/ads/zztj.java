package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zztj {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (zzb(r7, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60)) != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            java.util.List r3 = r3.getSupportedPerformancePoints()
            r0 = 0
            if (r3 == 0) goto L9b
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto L9b
        Lf:
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r7 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            r7.<init>(r4, r5, r6)
            int r3 = zzb(r3, r7)
            r4 = 1
            if (r3 != r4) goto L9a
            java.lang.Boolean r5 = com.google.android.gms.internal.ads.zztk.zzb()
            if (r5 != 0) goto L9a
            com.google.android.gms.internal.ads.zzak r5 = new com.google.android.gms.internal.ads.zzak     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            r5.<init>()     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            java.lang.String r6 = "video/avc"
            r5.zzW(r6)     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            com.google.android.gms.internal.ads.zzam r5 = r5.zzac()     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            java.lang.String r6 = r5.zzm     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            if (r6 == 0) goto L88
            com.google.android.gms.internal.ads.zztq r6 = com.google.android.gms.internal.ads.zztq.zzb     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            java.util.List r5 = com.google.android.gms.internal.ads.zzuc.zzf(r6, r5, r0, r0)     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            r6 = r0
        L3b:
            int r7 = r5.size()     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            if (r6 >= r7) goto L88
            java.lang.Object r7 = r5.get(r6)     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            com.google.android.gms.internal.ads.zzti r7 = (com.google.android.gms.internal.ads.zzti) r7     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.zzd     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            if (r7 == 0) goto L85
            java.lang.Object r7 = r5.get(r6)     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            com.google.android.gms.internal.ads.zzti r7 = (com.google.android.gms.internal.ads.zzti) r7     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.zzd     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            if (r7 == 0) goto L85
            java.lang.Object r7 = r5.get(r6)     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            com.google.android.gms.internal.ads.zzti r7 = (com.google.android.gms.internal.ads.zzti) r7     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.zzd     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            java.util.List r7 = r7.getSupportedPerformancePoints()     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            if (r7 == 0) goto L85
            boolean r1 = r7.isEmpty()     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            if (r1 != 0) goto L85
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            r6 = 1280(0x500, float:1.794E-42)
            r1 = 720(0x2d0, float:1.009E-42)
            r2 = 60
            r5.<init>(r6, r1, r2)     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            int r5 = zzb(r7, r5)     // Catch: com.google.android.gms.internal.ads.zztw -> L88
            if (r5 != r4) goto L83
            goto L88
        L83:
            r4 = r0
            goto L88
        L85:
            int r6 = r6 + 1
            goto L3b
        L88:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.google.android.gms.internal.ads.zztk.zzc(r4)
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zztk.zzb()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L9a
            return r0
        L9a:
            return r3
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztj.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
