package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class nq {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f729a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
    private static final Random b = new Random(System.currentTimeMillis());

    public static gq c(bq bqVar) {
        if (b(bqVar) || a(bqVar)) {
            return null;
        }
        return gq.GENERAL_WRAPPER_ERROR;
    }

    public static boolean b(bq bqVar) {
        oq oqVarO1;
        List listF;
        return (bqVar == null || (oqVarO1 = bqVar.o1()) == null || (listF = oqVarO1.f()) == null || listF.isEmpty()) ? false : true;
    }

    public static boolean b(fs fsVar) {
        if (fsVar != null) {
            return fsVar.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        DateFormat dateFormat = f729a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    private static Set a(Set set, List list, fq fqVar, com.applovin.impl.sdk.k kVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lq lqVarA = lq.a((fs) it.next(), fqVar, kVar);
                if (lqVarA != null) {
                    set.add(lqVarA);
                }
            }
        }
        return set;
    }

    public static String a(fs fsVar, String str, String str2) {
        fs fsVarC = fsVar.c(str);
        if (fsVarC != null) {
            String strD = fsVarC.d();
            if (StringUtils.isValidString(strD)) {
                return strD;
            }
        }
        return str2;
    }

    public static void a(Set set, long j, Uri uri, gq gqVar, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Uri uriA = a(((lq) it.next()).b(), j, uri, gqVar, kVar);
                if (uriA != null) {
                    kVar.Z().a(com.applovin.impl.sdk.network.d.b().d(uriA.toString()).a(false).a(), false);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(Set set, gq gqVar, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, gqVar, kVar);
    }

    public static void a(Set set, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, gq.UNSPECIFIED, kVar);
    }

    private static String a(long j) {
        if (j <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j);
        long minutes = timeUnit.toMinutes(j);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j % timeUnit2.toSeconds(1L)));
    }

    public static String a(fq fqVar) {
        fs fsVarB;
        if (fqVar != null) {
            List listA = fqVar.a();
            int size = fqVar.a().size();
            if (size <= 0 || (fsVarB = ((fs) listA.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return fsVarB.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static void a(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, gq gqVar, int i, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
            }
            a(a(fqVar, kVar), gqVar, kVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    public static boolean a(bq bqVar) {
        eq eqVarE1;
        jq jqVarD;
        if (bqVar == null || (eqVarE1 = bqVar.e1()) == null || (jqVarD = eqVarE1.d()) == null) {
            return false;
        }
        return jqVarD.b() != null || StringUtils.isValidString(jqVarD.a());
    }

    public static boolean a(fs fsVar) {
        if (fsVar != null) {
            return fsVar.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static void a(fs fsVar, Map map, fq fqVar, com.applovin.impl.sdk.k kVar) {
        List<fs> listA;
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (fsVar == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        fs fsVarC = fsVar.c("TrackingEvents");
        if (fsVarC == null || (listA = fsVarC.a("Tracking")) == null) {
            return;
        }
        for (fs fsVar2 : listA) {
            String str = (String) fsVar2.a().get(NotificationCompat.CATEGORY_EVENT);
            if (StringUtils.isValidString(str)) {
                lq lqVarA = lq.a(fsVar2, fqVar, kVar);
                if (lqVarA != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(lqVarA);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(lqVarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("VastUtils", "Could not find event for tracking node = " + fsVar2);
                }
            }
        }
    }

    public static void a(List list, Set set, fq fqVar, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lq lqVarA = lq.a((fs) it.next(), fqVar, kVar);
            if (lqVarA != null) {
                set.add(lqVarA);
            }
        }
    }

    public static Uri a(String str, long j, Uri uri, gq gqVar, com.applovin.impl.sdk.k kVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String string = Integer.toString(gqVar.b());
                String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                kVar.B().a("VastUtils", th);
                return null;
            }
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static Set a(fq fqVar, com.applovin.impl.sdk.k kVar) {
        if (fqVar == null) {
            return null;
        }
        List<fs> listA = fqVar.a();
        Set hashSet = new HashSet(listA.size());
        for (fs fsVar : listA) {
            fs fsVarB = fsVar.b("Wrapper");
            if (fsVarB == null) {
                fsVarB = fsVar.b("InLine");
            }
            if (fsVarB != null) {
                hashSet = a(hashSet, fsVarB.a("Error"), fqVar, kVar);
            } else {
                hashSet = a(hashSet, fsVar.a("Error"), fqVar, kVar);
            }
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static String a() {
        return Integer.toString(b.nextInt(89999999) + 10000000);
    }
}
