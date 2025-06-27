package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.json.t2;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhu {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str, String str2) throws NumberFormatException {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                zzfe.zzc("HttpUtil", "Unexpected Content-Length [" + str + t2.i.e);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String strGroup = matcher.group(2);
            Objects.requireNonNull(strGroup);
            long j2 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            Objects.requireNonNull(strGroup2);
            long j3 = (j2 - Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j3;
            }
            if (j == j3) {
                return j;
            }
            zzfe.zzf("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + t2.i.e);
            return Math.max(j, j3);
        } catch (NumberFormatException unused2) {
            zzfe.zzc("HttpUtil", "Unexpected Content-Range [" + str2 + t2.i.e);
            return j;
        }
    }

    public static long zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        return Long.parseLong(strGroup);
    }
}
