package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.am;
import com.applovin.impl.bq;
import com.applovin.impl.e1;
import com.applovin.impl.jq;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class cm extends am {
    private final bq r;

    public cm(bq bqVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", bqVar, kVar, appLovinAdLoadListener);
        this.r = bqVar;
    }

    @Override // com.applovin.impl.am, java.lang.Runnable
    public void run() {
        super.run();
        boolean zG0 = this.r.G0();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.c;
            String str = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append("Begin caching for VAST ");
            sb.append(zG0 ? "streaming " : "");
            sb.append("ad #");
            sb.append(this.h.getAdIdNumber());
            sb.append("...");
            tVar.a(str, sb.toString());
        }
        if (zG0) {
            if (((Boolean) this.f1179a.a(oj.c1)).booleanValue()) {
                if (!x3.f()) {
                    a(e());
                }
                if (this.r.r1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    c1 c1VarP = p();
                    if (c1VarP != null) {
                        arrayList.add(c1VarP);
                    }
                    d1 d1VarQ = q();
                    if (d1VarQ != null) {
                        arrayList.add(d1VarQ);
                    }
                    e1 e1VarR = r();
                    if (e1VarR != null) {
                        arrayList.add(e1VarR);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.r.i1() == bq.c.COMPANION_AD) {
                        c1 c1VarP2 = p();
                        if (c1VarP2 != null) {
                            arrayList2.add(c1VarP2);
                        }
                        d1 d1VarQ2 = q();
                        if (d1VarQ2 != null) {
                            arrayList2.add(d1VarQ2);
                        }
                        a(arrayList2);
                        f();
                        e1 e1VarR2 = r();
                        if (e1VarR2 != null) {
                            arrayList3.add(e1VarR2);
                        }
                        a(arrayList3);
                    } else {
                        e1 e1VarR3 = r();
                        if (e1VarR3 != null) {
                            arrayList2.add(e1VarR3);
                        }
                        a(arrayList2);
                        f();
                        c1 c1VarP3 = p();
                        if (c1VarP3 != null) {
                            arrayList3.add(c1VarP3);
                        }
                        d1 d1VarQ3 = q();
                        if (d1VarQ3 != null) {
                            arrayList3.add(d1VarQ3);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.r.r1()) {
                    f();
                }
                bq.c cVarI1 = this.r.i1();
                bq.c cVar = bq.c.COMPANION_AD;
                if (cVarI1 == cVar) {
                    m();
                    n();
                    a(this.r);
                } else {
                    o();
                }
                if (!this.r.r1()) {
                    f();
                }
                if (this.r.i1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.r);
                }
            }
        } else if (((Boolean) this.f1179a.a(oj.c1)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!x3.f()) {
                arrayList4.addAll(e());
            }
            c1 c1VarP4 = p();
            if (c1VarP4 != null) {
                arrayList4.add(c1VarP4);
            }
            e1 e1VarR4 = r();
            if (e1VarR4 != null) {
                arrayList4.add(e1VarR4);
            }
            d1 d1VarQ4 = q();
            if (d1VarQ4 != null) {
                arrayList4.add(d1VarQ4);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.r);
            f();
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Finished caching VAST ad #" + this.r.getAdIdNumber());
        }
        this.r.s1();
        k();
    }

    private void m() {
        if (l()) {
            return;
        }
        if (this.r.t1()) {
            eq eqVarE1 = this.r.e1();
            if (eqVarE1 != null) {
                jq jqVarD = eqVarE1.d();
                if (jqVarD != null) {
                    Uri uriB = jqVarD.b();
                    String string = uriB != null ? uriB.toString() : "";
                    String strA = jqVarD.a();
                    if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strA)) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    if (jqVarD.c() == jq.a.STATIC) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.c.a(this.b, "Caching static companion ad at " + string + "...");
                        }
                        Uri uriA = a(string, Collections.emptyList(), false);
                        if (uriA != null) {
                            jqVarD.a(uriA);
                            this.r.b(true);
                            return;
                        } else {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.c.b(this.b, "Failed to cache static companion ad");
                                return;
                            }
                            return;
                        }
                    }
                    if (jqVarD.c() == jq.a.HTML) {
                        if (StringUtils.isValidString(string)) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.c.a(this.b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                            }
                            String strD = d(string, null, false);
                            if (StringUtils.isValidString(strD)) {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.c.a(this.b, "HTML fetched. Caching HTML now...");
                                }
                                jqVarD.a(a(strD, Collections.emptyList(), this.r));
                                this.r.b(true);
                                return;
                            }
                            if (com.applovin.impl.sdk.t.a()) {
                                this.c.b(this.b, "Unable to load companion ad resources from " + string);
                                return;
                            }
                            return;
                        }
                        if (com.applovin.impl.sdk.t.a()) {
                            this.c.a(this.b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strA);
                        }
                        if (((Boolean) this.f1179a.a(oj.g5)).booleanValue()) {
                            strA = d(strA);
                        }
                        jqVarD.a(a(strA, Collections.emptyList(), this.r));
                        this.r.b(true);
                        return;
                    }
                    if (jqVarD.c() == jq.a.IFRAME && com.applovin.impl.sdk.t.a()) {
                        this.c.a(this.b, "Skip caching of iFrame resource...");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Companion ad caching disabled. Skipping...");
        }
    }

    private void o() {
        pq pqVarP1;
        Uri uriD;
        if (l()) {
            return;
        }
        if (this.r.u1()) {
            if (this.r.o1() == null || (pqVarP1 = this.r.p1()) == null || (uriD = pqVarP1.d()) == null) {
                return;
            }
            Uri uriC = c(uriD.toString(), Collections.emptyList(), false);
            if (uriC != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Video file successfully cached into: " + uriC);
                }
                pqVarP1.a(uriC);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Failed to cache video file: " + pqVarP1);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Video caching disabled. Skipping...");
        }
    }

    private void n() {
        String strG1;
        if (l() || !nq.a(this.r)) {
            return;
        }
        if (this.r.h1() != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Begin caching HTML template. Fetching from " + this.r.h1() + "...");
            }
            strG1 = b(this.r.h1().toString(), this.r.X(), true);
        } else {
            strG1 = this.r.g1();
        }
        if (StringUtils.isValidString(strG1)) {
            String strA = a(strG1, this.r.X(), this.h);
            if (this.r.isOpenMeasurementEnabled()) {
                strA = this.f1179a.Y().a(strA);
            }
            this.r.b(strA);
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Finish caching HTML template " + this.r.g1() + " for ad #" + this.r.getAdIdNumber());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Unable to load HTML template");
        }
    }

    private String d(String str) {
        String strReplace = str;
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f1179a.a(oj.h5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (this.h.shouldCancelHtmlCachingIfShown() && this.h.hasShown()) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.a(this.b, "Cancelling HTML JavaScript caching due to ad being shown already");
                    }
                    this.i.c();
                    return str;
                }
                Uri uriA = a(str2, Collections.emptyList(), false);
                if (uriA != null) {
                    strReplace = strReplace.replace(str2, uriA.toString());
                    this.h.a(uriA);
                    this.i.b();
                } else {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.b(this.b, "Failed to cache JavaScript resource: " + str2);
                    }
                    this.i.a();
                }
            }
        }
        return strReplace;
    }

    private c1 p() {
        if (!this.r.t1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        eq eqVarE1 = this.r.e1();
        if (eqVarE1 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        jq jqVarD = eqVarE1.d();
        if (jqVarD == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriB = jqVarD.b();
        String string = uriB != null ? uriB.toString() : "";
        String strA = jqVarD.a();
        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
            }
        } else {
            if (jqVarD.c() == jq.a.STATIC) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Caching static companion ad at " + string + "...");
                }
                return new e1(string, this.r, Collections.emptyList(), false, this.i, this.f1179a, new a(jqVarD));
            }
            if (jqVarD.c() == jq.a.HTML) {
                if (StringUtils.isValidString(string)) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.a(this.b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                    }
                    String strD = d(string, null, false);
                    if (StringUtils.isValidString(strD)) {
                        if (com.applovin.impl.sdk.t.a()) {
                            this.c.a(this.b, "HTML fetched. Caching HTML now...");
                        }
                        return a(strD, Collections.emptyList(), new b(jqVarD));
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.b(this.b, "Unable to load companion ad resources from " + string);
                    }
                } else {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.a(this.b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strA);
                    }
                    return a(strA, Collections.emptyList(), new c(jqVarD));
                }
            } else if (jqVarD.c() == jq.a.IFRAME && com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Skip caching of iFrame resource...");
            }
        }
        return null;
    }

    class a implements e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ jq f334a;

        a(jq jqVar) {
            this.f334a = jqVar;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f334a.a(uri);
                cm.this.r.b(true);
                return;
            }
            com.applovin.impl.sdk.t tVar = cm.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar = cm.this;
                cmVar.c.b(cmVar.b, "Failed to cache static companion ad");
            }
        }
    }

    class b implements am.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ jq f335a;

        b(jq jqVar) {
            this.f335a = jqVar;
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            this.f335a.a(str);
            cm.this.r.b(true);
        }
    }

    class c implements am.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ jq f336a;

        c(jq jqVar) {
            this.f336a = jqVar;
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            this.f336a.a(str);
            cm.this.r.b(true);
        }
    }

    protected e1 r() {
        pq pqVarP1;
        Uri uriD;
        if (!this.r.u1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.r.o1() == null || (pqVarP1 = this.r.p1()) == null || (uriD = pqVarP1.d()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Caching video file " + pqVarP1 + " creative...");
        }
        return a(uriD.toString(), Collections.emptyList(), false, (e1.a) new d(pqVarP1));
    }

    class d implements e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pq f337a;

        d(pq pqVar) {
            this.f337a = pqVar;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.t tVar = cm.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    cm cmVar = cm.this;
                    cmVar.c.a(cmVar.b, "Video file successfully cached into: " + uri);
                }
                this.f337a.a(uri);
                return;
            }
            com.applovin.impl.sdk.t tVar2 = cm.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar2 = cm.this;
                cmVar2.c.b(cmVar2.b, "Failed to cache video file: " + this.f337a);
            }
        }
    }

    protected d1 q() {
        if (TextUtils.isEmpty(this.r.g1())) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.c.a(this.b, "Unable to load HTML template");
            return null;
        }
        return a(this.r.g1(), this.r.X(), new e());
    }

    class e implements am.e {
        e() {
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            if (cm.this.r.isOpenMeasurementEnabled()) {
                str = cm.this.f1179a.Y().a(str);
            }
            cm.this.r.b(str);
            com.applovin.impl.sdk.t tVar = cm.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                cm cmVar = cm.this;
                cmVar.c.a(cmVar.b, "Finish caching HTML template " + cm.this.r.g1() + " for ad #" + cm.this.r.getAdIdNumber());
            }
        }
    }

    @Override // com.applovin.impl.am
    void f() {
        this.r.getAdEventTracker().h();
        super.f();
    }

    @Override // com.applovin.impl.am
    void a(int i) {
        this.r.getAdEventTracker().f();
        super.a(i);
    }
}
