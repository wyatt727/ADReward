package com.applovin.impl;

import android.net.Uri;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bq extends com.applovin.impl.sdk.ad.b {
    private final String l;
    private final String m;
    private final kq n;
    private final long o;
    private final oq p;
    private final eq q;
    private final String r;
    private final dq s;
    private final og t;
    private final Set u;
    private final Set v;

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void J0() {
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.l + "', adDescription='" + this.m + "', systemInfo=" + this.n + ", videoCreative=" + this.p + ", companionAd=" + this.q + ", adVerifications=" + this.s + ", impressionTrackers=" + this.u + ", errorTrackers=" + this.v + AbstractJsonLexerKt.END_OBJ;
    }

    private bq(b bVar) {
        super(bVar.f301a, bVar.b, bVar.c);
        this.l = bVar.e;
        this.n = bVar.g;
        this.m = bVar.f;
        this.p = bVar.h;
        this.q = bVar.i;
        this.s = bVar.j;
        this.u = bVar.k;
        this.v = bVar.l;
        this.t = new og(this);
        Uri uriS0 = s0();
        if (uriS0 != null) {
            this.r = uriS0.toString();
        } else {
            this.r = "";
        }
        this.o = bVar.d;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listF;
        oq oqVar = this.p;
        return (oqVar == null || (listF = oqVar.f()) == null || listF.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean G0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    public void s1() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String P() {
        return this.r;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.s != null;
    }

    public boolean w1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    public long l1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public c i1() {
        if ("companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad"))) {
            return c.COMPANION_AD;
        }
        return c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public og getAdEventTracker() {
        return this.t;
    }

    public boolean r1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri s0() {
        pq pqVarP1 = p1();
        if (pqVarP1 != null) {
            return pqVarP1.d();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j() {
        oq oqVar = this.p;
        if (oqVar != null) {
            return oqVar.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j0() {
        return j();
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean F0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && j() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List F() {
        List listA;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new Function() { // from class: com.applovin.impl.bq$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.w((ql) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = zp.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, j1(), Q(), Q0(), this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List w(ql qlVar) {
        return zp.a(qlVar.a("vimp_urls", new JSONObject()), getClCode(), null, j1(), Q(), Q0(), this.sdk);
    }

    private String j1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public kq m1() {
        return this.n;
    }

    public oq o1() {
        return this.p;
    }

    public pq p1() {
        Long lF = c4.f(this.sdk);
        return this.p.a(lF != null ? lF.longValue() : 0L);
    }

    public eq e1() {
        return this.q;
    }

    public hq k1() {
        oq oqVar = this.p;
        if (oqVar != null) {
            return oqVar.e();
        }
        return null;
    }

    public boolean q1() {
        return k1() != null;
    }

    public boolean v1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public void b(String str) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public String g1() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri h1() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean t1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public dq d1() {
        return this.s;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.o;
    }

    private Set n1() {
        oq oqVar = this.p;
        if (oqVar != null) {
            return oqVar.a();
        }
        return Collections.emptySet();
    }

    private Set f1() {
        eq eqVar = this.q;
        if (eqVar != null) {
            return eqVar.a();
        }
        return Collections.emptySet();
    }

    private Set a(c cVar, String[] strArr) {
        eq eqVar;
        oq oqVar;
        if (strArr != null && strArr.length > 0) {
            Map mapC = null;
            if (cVar == c.VIDEO && (oqVar = this.p) != null) {
                mapC = oqVar.d();
            } else if (cVar == c.COMPANION_AD && (eqVar = this.q) != null) {
                mapC = eqVar.c();
            }
            HashSet hashSet = new HashSet();
            if (mapC != null && !mapC.isEmpty()) {
                for (String str : strArr) {
                    if (mapC.containsKey(str)) {
                        hashSet.addAll((Collection) mapC.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq) || !super.equals(obj)) {
            return false;
        }
        bq bqVar = (bq) obj;
        String str = this.l;
        if (str == null ? bqVar.l != null : !str.equals(bqVar.l)) {
            return false;
        }
        String str2 = this.m;
        if (str2 == null ? bqVar.m != null : !str2.equals(bqVar.m)) {
            return false;
        }
        kq kqVar = this.n;
        if (kqVar == null ? bqVar.n != null : !kqVar.equals(bqVar.n)) {
            return false;
        }
        oq oqVar = this.p;
        if (oqVar == null ? bqVar.p != null : !oqVar.equals(bqVar.p)) {
            return false;
        }
        eq eqVar = this.q;
        if (eqVar == null ? bqVar.q != null : !eqVar.equals(bqVar.q)) {
            return false;
        }
        dq dqVar = this.s;
        if (dqVar == null ? bqVar.s != null : !dqVar.equals(bqVar.s)) {
            return false;
        }
        Set set = this.u;
        if (set == null ? bqVar.u != null : !set.equals(bqVar.u)) {
            return false;
        }
        Set set2 = this.v;
        Set set3 = bqVar.v;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.l;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.m;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        kq kqVar = this.n;
        int iHashCode4 = (iHashCode3 + (kqVar != null ? kqVar.hashCode() : 0)) * 31;
        oq oqVar = this.p;
        int iHashCode5 = (iHashCode4 + (oqVar != null ? oqVar.hashCode() : 0)) * 31;
        eq eqVar = this.q;
        int iHashCode6 = (iHashCode5 + (eqVar != null ? eqVar.hashCode() : 0)) * 31;
        dq dqVar = this.s;
        int iHashCode7 = (iHashCode6 + (dqVar != null ? dqVar.hashCode() : 0)) * 31;
        Set set = this.u;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.v;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f301a;
        private JSONObject b;
        private com.applovin.impl.sdk.k c;
        private long d;
        private String e;
        private String f;
        private kq g;
        private oq h;
        private eq i;
        private dq j;
        private Set k;
        private Set l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b a(String str) {
            this.f = str;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f301a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b b(Set set) {
            this.k = set;
            return this;
        }

        public b a(dq dqVar) {
            this.j = dqVar;
            return this;
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b a(eq eqVar) {
            this.i = eqVar;
            return this;
        }

        public b a(long j) {
            this.d = j;
            return this;
        }

        public b a(Set set) {
            this.l = set;
            return this;
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(kq kqVar) {
            this.g = kqVar;
            return this;
        }

        public b a(oq oqVar) {
            this.h = oqVar;
            return this;
        }

        public bq a() {
            return new bq(this);
        }
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.sdk.L().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.u;
        }
        if (dVar == d.VIDEO_CLICK) {
            return n1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return f1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return k1().a();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return k1().e();
        }
        if (dVar == d.ERROR) {
            return this.v;
        }
        this.sdk.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.sdk.L().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }
}
