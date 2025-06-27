package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class oq {
    private List b;
    private int c;
    private Uri d;
    private hq f;

    /* renamed from: a, reason: collision with root package name */
    private List f766a = Collections.emptyList();
    private final Set e = new HashSet();
    private final Map g = new HashMap();

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f766a + ", durationSeconds=" + this.c + ", destinationUri=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.g + ", industryIcon=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    private oq(fq fqVar) {
        this.b = Collections.emptyList();
        this.b = fqVar.f();
    }

    public static oq a(fs fsVar, oq oqVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        fs fsVarC;
        hq hqVarA;
        List listA;
        fs fsVarC2;
        List listA2;
        fs fsVarC3;
        int iA;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (fqVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (kVar != null) {
            if (oqVar == null) {
                try {
                    oqVar = new oq(fqVar);
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastVideoCreative", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastVideoCreative", th);
                    return null;
                }
            }
            if (oqVar.c == 0 && (fsVarC3 = fsVar.c("Duration")) != null && (iA = a(fsVarC3.d(), kVar)) > 0) {
                oqVar.c = iA;
            }
            fs fsVarC4 = fsVar.c("MediaFiles");
            if (fsVarC4 != null && (listA2 = a(fsVarC4, kVar)) != null && listA2.size() > 0) {
                List list = oqVar.f766a;
                if (list != null) {
                    listA2.addAll(list);
                }
                oqVar.f766a = listA2;
            }
            fs fsVarC5 = fsVar.c("VideoClicks");
            if (fsVarC5 != null) {
                if (oqVar.d == null && (fsVarC2 = fsVarC5.c("ClickThrough")) != null) {
                    String strD = fsVarC2.d();
                    if (StringUtils.isValidString(strD)) {
                        oqVar.d = Uri.parse(strD);
                    }
                }
                nq.a(fsVarC5.a("ClickTracking"), oqVar.e, fqVar, kVar);
            }
            fs fsVarC6 = fsVar.c("Icons");
            if (fsVarC6 != null && (hqVarA = hq.a((fsVarC = fsVarC6.c("Icon")), kVar)) != null) {
                fs fsVarC7 = fsVarC.c("IconClicks");
                if (fsVarC7 != null && (listA = fsVarC7.a("IconClickTracking")) != null) {
                    nq.a(listA, hqVarA.f509a, fqVar, kVar);
                }
                List listA3 = fsVarC.a("IconViewTracking");
                if (listA3 != null) {
                    nq.a(listA3, hqVarA.b, fqVar, kVar);
                }
                oqVar.f = hqVarA;
            }
            nq.a(fsVar, oqVar.g, fqVar, kVar);
            return oqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public List f() {
        return this.f766a;
    }

    public int c() {
        return this.c;
    }

    public Uri b() {
        return this.d;
    }

    public Map d() {
        return this.g;
    }

    public hq e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        if (this.c != oqVar.c) {
            return false;
        }
        List list = this.f766a;
        if (list == null ? oqVar.f766a != null : !list.equals(oqVar.f766a)) {
            return false;
        }
        Uri uri = this.d;
        if (uri == null ? oqVar.d != null : !uri.equals(oqVar.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? oqVar.e != null : !set.equals(oqVar.e)) {
            return false;
        }
        Map map = this.g;
        Map map2 = oqVar.g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        List list = this.f766a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.c) * 31;
        Uri uri = this.d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public Set a() {
        return this.e;
    }

    public pq a(long j) {
        List list = this.f766a;
        pq pqVar = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<pq> arrayList = new ArrayList(3);
        for (String str : this.b) {
            for (pq pqVar2 : this.f766a) {
                String strB = pqVar2.b();
                if (StringUtils.isValidString(strB) && str.equalsIgnoreCase(strB)) {
                    arrayList.add(pqVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f766a;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.applovin.impl.oq$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return oq.a((pq) obj, (pq) obj2);
            }
        });
        for (pq pqVar3 : arrayList) {
            if (pqVar3.a() > j) {
                break;
            }
            pqVar = pqVar3;
        }
        return pqVar != null ? pqVar : (pq) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(pq pqVar, pq pqVar2) {
        return Long.compare(pqVar.a(), pqVar2.a());
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            if (CollectionUtils.explode(str, ":").size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        List listA = fsVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) kVar.a(oj.S4));
        List<String> listExplode2 = CollectionUtils.explode((String) kVar.a(oj.R4));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            pq pqVarA = pq.a((fs) it.next(), kVar);
            if (pqVarA != null) {
                try {
                    String strB = pqVarA.b();
                    if (StringUtils.isValidString(strB) && !listExplode.contains(strB)) {
                        arrayList.add(pqVarA);
                    } else {
                        if (((Boolean) kVar.a(oj.T4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(pqVarA.d().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(pqVarA);
                            }
                        }
                        kVar.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            kVar.L().k("VastVideoCreative", "Video file not supported: " + pqVarA);
                        }
                    }
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastVideoCreative", "Failed to validate video file: " + pqVarA, th);
                    }
                }
            }
        }
        return arrayList;
    }
}
