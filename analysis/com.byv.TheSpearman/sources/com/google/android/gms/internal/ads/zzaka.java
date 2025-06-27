package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaka {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzaej zza(zzadg zzadgVar) throws IOException {
        return zzc(zzadgVar, true, false);
    }

    public static zzaej zzb(zzadg zzadgVar, boolean z) throws IOException {
        return zzc(zzadgVar, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return com.google.android.gms.internal.ads.zzajq.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0120, code lost:
    
        if (r11 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0124, code lost:
    
        return com.google.android.gms.internal.ads.zzajw.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0127, code lost:
    
        if (r24 == r8) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0129, code lost:
    
        if (r8 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0130, code lost:
    
        return com.google.android.gms.internal.ads.zzajq.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0131, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzaej zzc(com.google.android.gms.internal.ads.zzadg r23, boolean r24, boolean r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaka.zzc(com.google.android.gms.internal.ads.zzadg, boolean, boolean):com.google.android.gms.internal.ads.zzaej");
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
