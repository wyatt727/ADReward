package com.mbridge.msdk.e.a.a;

import com.google.common.net.HttpHeaders;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.e.a.aa;
import com.mbridge.msdk.e.a.b;
import com.mbridge.msdk.e.a.m;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* compiled from: HttpHeaderParser.java */
/* loaded from: classes4.dex */
public final class e {
    public static b.a a(m mVar) throws NumberFormatException {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = mVar.c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long jA2 = str3 != null ? a(str3) : 0L;
        String str4 = map.get(HttpHeaders.LAST_MODIFIED);
        long jA3 = str4 != null ? a(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j4 = jCurrentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (jA <= 0 || jA2 < jA) {
                j4 = 0;
            } else {
                j4 = jCurrentTimeMillis + (jA2 - jA);
                j3 = j4;
            }
        }
        b.a aVar = new b.a();
        aVar.f2700a = mVar.b;
        aVar.b = str5;
        aVar.f = j4;
        aVar.e = j3;
        aVar.c = jA;
        aVar.d = jA3;
        aVar.g = map;
        aVar.h = mVar.d;
        return aVar;
    }

    private static long a(String str) {
        try {
            Date date = b("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                aa.a("Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                aa.a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    static String a(long j) {
        return b("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    static List<com.mbridge.msdk.e.a.i> a(List<com.mbridge.msdk.e.a.i> list, b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.mbridge.msdk.e.a.i> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (aVar.h != null) {
            if (!aVar.h.isEmpty()) {
                for (com.mbridge.msdk.e.a.i iVar : aVar.h) {
                    if (!treeSet.contains(iVar.a())) {
                        arrayList.add(iVar);
                    }
                }
            }
        } else if (!aVar.g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.mbridge.msdk.e.a.i(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static String a(Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("Content-Type")) != null) {
            String[] strArrSplit = str.split(";", 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split(t2.i.b, 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals(m4.L)) {
                    return strArrSplit2[1];
                }
            }
        }
        return "ISO-8859-1";
    }
}
