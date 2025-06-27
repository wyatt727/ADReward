package com.applovin.impl;

import com.applovin.impl.bq;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* loaded from: classes.dex */
class dn extends xl {
    private final fq h;
    private final AppLovinAdLoadListener i;

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Rendering VAST ad...");
        }
        int size = this.h.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        kq kqVarA = null;
        oq oqVarA = null;
        eq eqVarA = null;
        dq dqVarA = null;
        String strA2 = "";
        for (fs fsVar : this.h.a()) {
            fs fsVarB = fsVar.b(nq.b(fsVar) ? "Wrapper" : "InLine");
            if (fsVarB != null) {
                fs fsVarB2 = fsVarB.b("AdSystem");
                if (fsVarB2 != null) {
                    kqVarA = kq.a(fsVarB2, kqVarA, this.f1179a);
                }
                strA = nq.a(fsVarB, "AdTitle", strA);
                strA2 = nq.a(fsVarB, "Description", strA2);
                nq.a(fsVarB.a("Impression"), hashSet, this.h, this.f1179a);
                fs fsVarC = fsVarB.c("ViewableImpression");
                if (fsVarC != null) {
                    nq.a(fsVarC.a("Viewable"), hashSet, this.h, this.f1179a);
                }
                fs fsVarB3 = fsVarB.b("AdVerifications");
                if (fsVarB3 != null) {
                    dqVarA = dq.a(fsVarB3, dqVarA, this.h, this.f1179a);
                }
                nq.a(fsVarB.a("Error"), hashSet2, this.h, this.f1179a);
                fs fsVarC2 = fsVarB.c("Creatives");
                if (fsVarC2 != null) {
                    for (fs fsVar2 : fsVarC2.b()) {
                        fs fsVarC3 = fsVar2.c("Linear");
                        if (fsVarC3 != null) {
                            oqVarA = oq.a(fsVarC3, oqVarA, this.h, this.f1179a);
                        } else {
                            fs fsVarB4 = fsVar2.b("CompanionAds");
                            if (fsVarB4 != null) {
                                fs fsVarB5 = fsVarB4.b("Companion");
                                if (fsVarB5 != null) {
                                    eqVarA = eq.a(fsVarB5, eqVarA, this.h, this.f1179a);
                                }
                            } else if (com.applovin.impl.sdk.t.a()) {
                                this.c.b(this.b, "Received and will skip rendering for an unidentified creative: " + fsVar2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Did not find wrapper or inline response for node: " + fsVar);
            }
        }
        bq bqVarA = new bq.b().a(this.f1179a).a(this.h.b()).b(this.h.e()).a(this.h.c()).b(strA).a(strA2).a(kqVarA).a(oqVarA).a(eqVarA).a(dqVarA).b(hashSet).a(dqVarA).a(hashSet2).a();
        gq gqVarC = nq.c(bqVarA);
        if (gqVarC != null) {
            nq.a(this.h, this.i, gqVarC, -6, this.f1179a);
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Finished rendering VAST ad: " + bqVarA);
        }
        bqVarA.getAdEventTracker().e();
        this.f1179a.l0().a((xl) new cm(bqVarA, this.f1179a, this.i), sm.b.CACHING);
    }

    dn(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.i = appLovinAdLoadListener;
        this.h = fqVar;
    }
}
