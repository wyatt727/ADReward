package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalz {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd = Pattern.compile(String.format(Locale.US, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    private static final Pattern zze = Pattern.compile(String.format(Locale.US, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    private static final Pattern zzf = Pattern.compile("\\\\an(\\d+)");
    public final int zza;
    public final PointF zzb;

    private zzalz(int i, PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:5|35|6|(2:(1:9)|10)(1:(1:12)(8:19|(1:21)|37|22|41|(3:24|25|26)(1:28)|(3:40|30|44)(1:43)|42))|13|14|15|16|17|(0)|37|22|41|(0)(0)|(0)(0)|42|3) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[Catch: RuntimeException -> 0x000a, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:22:0x0082, B:24:0x008e, B:26:0x0095), top: B:37:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzalz zza(java.lang.String r12) throws java.lang.NumberFormatException {
        /*
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzalz.zzc
            java.util.regex.Matcher r12 = r0.matcher(r12)
            r0 = 0
            r1 = -1
            r3 = r0
            r2 = r1
        La:
            boolean r4 = r12.find()
            if (r4 == 0) goto La0
            r4 = 1
            java.lang.String r5 = r12.group(r4)
            java.util.Objects.requireNonNull(r5)
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.zzalz.zzd     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Pattern r7 = com.google.android.gms.internal.ads.zzalz.zze     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Matcher r7 = r7.matcher(r5)     // Catch: java.lang.RuntimeException -> L82
            boolean r8 = r6.find()     // Catch: java.lang.RuntimeException -> L82
            boolean r9 = r7.find()     // Catch: java.lang.RuntimeException -> L82
            r10 = 2
            if (r8 == 0) goto L55
            if (r9 == 0) goto L4c
            java.lang.String r7 = "SsaStyle.Overrides"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L82
            r8.<init>()     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r9 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L82
            r8.append(r5)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r9 = "'"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r8 = r8.toString()     // Catch: java.lang.RuntimeException -> L82
            com.google.android.gms.internal.ads.zzfe.zze(r7, r8)     // Catch: java.lang.RuntimeException -> L82
        L4c:
            java.lang.String r7 = r6.group(r4)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r6 = r6.group(r10)     // Catch: java.lang.RuntimeException -> L82
            goto L62
        L55:
            if (r9 == 0) goto L7e
            java.lang.String r6 = r7.group(r4)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r7 = r7.group(r10)     // Catch: java.lang.RuntimeException -> L82
            r11 = r7
            r7 = r6
            r6 = r11
        L62:
            android.graphics.PointF r8 = new android.graphics.PointF     // Catch: java.lang.RuntimeException -> L82
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = r7.trim()     // Catch: java.lang.RuntimeException -> L82
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.RuntimeException -> L82
            java.util.Objects.requireNonNull(r6)
            java.lang.String r6 = r6.trim()     // Catch: java.lang.RuntimeException -> L82
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.RuntimeException -> L82
            r8.<init>(r7, r6)     // Catch: java.lang.RuntimeException -> L82
            goto L7f
        L7e:
            r8 = r0
        L7f:
            if (r8 == 0) goto L82
            r3 = r8
        L82:
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.zzalz.zzf     // Catch: java.lang.RuntimeException -> La
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> La
            boolean r6 = r5.find()     // Catch: java.lang.RuntimeException -> La
            if (r6 == 0) goto L9a
            java.lang.String r4 = r5.group(r4)     // Catch: java.lang.RuntimeException -> La
            java.util.Objects.requireNonNull(r4)
            int r4 = com.google.android.gms.internal.ads.zzama.zza(r4)     // Catch: java.lang.RuntimeException -> La
            goto L9b
        L9a:
            r4 = r1
        L9b:
            if (r4 == r1) goto La
            r2 = r4
            goto La
        La0:
            com.google.android.gms.internal.ads.zzalz r12 = new com.google.android.gms.internal.ads.zzalz
            r12.<init>(r2, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalz.zza(java.lang.String):com.google.android.gms.internal.ads.zzalz");
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
