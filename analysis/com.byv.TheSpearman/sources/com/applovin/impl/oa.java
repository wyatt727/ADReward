package com.applovin.impl;

import android.text.TextUtils;
import com.json.t2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class oa {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f738a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long a(String str, String str2) throws NumberFormatException {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                kc.b("HttpUtil", "Unexpected Content-Length [" + str + t2.i.e);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f738a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) a1.a((Object) matcher.group(2))) - Long.parseLong((String) a1.a((Object) matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            kc.d("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + t2.i.e);
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            kc.b("HttpUtil", "Unexpected Content-Range [" + str2 + t2.i.e);
            return j;
        }
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) a1.a((Object) matcher.group(1)));
        }
        return -1L;
    }
}
