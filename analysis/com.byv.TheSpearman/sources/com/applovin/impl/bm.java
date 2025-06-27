package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.am;
import com.applovin.impl.e1;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class bm extends am {
    private final com.applovin.impl.sdk.ad.a r;
    private boolean s;
    private boolean t;

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (zp.h(com.applovin.impl.sdk.k.k())) {
            str = zp.b(str);
        }
        return this.r.isOpenMeasurementEnabled() ? this.f1179a.Y().a(str) : str;
    }

    private void m() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Caching HTML resources...");
        }
        this.r.b(d(a(a(this.r.e1(), this.r.f1(), this.r.m1(), this.r.X(), this.r.n1()), this.r.X(), this.r)));
        this.r.b(true);
        a(this.r);
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Finish caching non-video resources for ad #" + this.r.getAdIdNumber());
        }
        this.c.f(this.b, "Ad updated with cachedHTML = " + this.r.e1());
    }

    private d1 o() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Caching HTML resources...");
        }
        return a(this.r.e1(), this.r.X(), new b());
    }

    public bm(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.r = aVar;
    }

    public void c(boolean z) {
        this.s = z;
    }

    public void b(boolean z) {
        this.t = z;
    }

    @Override // com.applovin.impl.am, java.lang.Runnable
    public void run() {
        super.run();
        boolean zG0 = this.r.G0();
        boolean z = this.t;
        if (!zG0 && !z) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Begin processing for non-streaming ad #" + this.r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f1179a.a(oj.c1)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!x3.f()) {
                    arrayList.addAll(e());
                }
                d1 d1VarO = o();
                if (d1VarO != null) {
                    arrayList.add(d1VarO);
                }
                e1 e1VarP = p();
                if (e1VarP != null) {
                    arrayList.add(e1VarP);
                }
                a(arrayList);
                f();
            } else {
                j();
                m();
                n();
                f();
            }
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Begin caching for streaming ad #" + this.r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f1179a.a(oj.c1)).booleanValue()) {
                if (!x3.f()) {
                    a(e());
                }
                ArrayList arrayList2 = new ArrayList();
                if (zG0) {
                    if (this.s) {
                        f();
                        d1 d1VarO2 = o();
                        if (d1VarO2 != null) {
                            arrayList2.add(d1VarO2);
                        }
                        e1 e1VarP2 = p();
                        if (e1VarP2 != null) {
                            arrayList2.add(e1VarP2);
                        }
                    } else {
                        d1 d1VarO3 = o();
                        if (d1VarO3 != null) {
                            a(Arrays.asList(d1VarO3));
                        }
                        f();
                        e1 e1VarP3 = p();
                        if (e1VarP3 != null) {
                            arrayList2.add(e1VarP3);
                        }
                    }
                } else {
                    f();
                    d1 d1VarO4 = o();
                    if (d1VarO4 != null) {
                        arrayList2.add(d1VarO4);
                    }
                }
                a(arrayList2);
                f();
            } else {
                j();
                if (zG0) {
                    if (this.s) {
                        f();
                    }
                    m();
                    if (!this.s) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        }
        k();
    }

    private void n() {
        Uri uriC;
        if (l() || (uriC = c(this.r.j1())) == null) {
            return;
        }
        if (this.r.I0()) {
            this.r.b(this.r.e1().replaceFirst(this.r.h1(), uriC.toString()));
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Replaced video URL with cached video URI in HTML for web video ad");
            }
        }
        this.r.l1();
        this.r.d(uriC);
    }

    class a implements e1.a {
        a() {
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                if (bm.this.r.I0()) {
                    bm.this.r.b(bm.this.r.e1().replaceFirst(bm.this.r.h1(), uri.toString()));
                    com.applovin.impl.sdk.t tVar = bm.this.c;
                    if (com.applovin.impl.sdk.t.a()) {
                        bm bmVar = bm.this;
                        bmVar.c.a(bmVar.b, "Replaced video URL with cached video URI in HTML for web video ad");
                    }
                }
                bm.this.r.l1();
                bm.this.r.d(uri);
            }
        }
    }

    private e1 p() {
        return b(this.r.j1(), new a());
    }

    class b implements am.e {
        b() {
        }

        @Override // com.applovin.impl.am.e
        public void a(String str) {
            bm.this.r.b(bm.this.d(str));
            bm.this.r.b(true);
            com.applovin.impl.sdk.t tVar = bm.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                bm bmVar = bm.this;
                bmVar.c.a(bmVar.b, "Finish caching non-video resources for ad #" + bm.this.r.getAdIdNumber());
            }
            bm bmVar2 = bm.this;
            bmVar2.c.f(bmVar2.b, "Ad updated with cachedHTML = " + bm.this.r.e1());
        }
    }
}
