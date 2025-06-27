package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class bn extends xl {
    private final AppLovinAdLoadListener h;
    private final a i;

    bn(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (fqVar != null) {
            this.h = appLovinAdLoadListener;
            this.i = (a) fqVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    protected fs b(String str) {
        try {
            return gs.a(str, this.f1179a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Failed to process VAST response", th);
            }
            a(gq.XML_PARSING);
            return null;
        }
    }

    protected void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f1179a.a(oj.i5)), 1).iterator();
        while (it.hasNext()) {
            fs fsVarB = b("<VAST>" + it.next() + "</VAST>");
            if (fsVarB != null) {
                this.i.a(fsVarB);
            }
        }
    }

    void a(fs fsVar) {
        int iD = this.i.d();
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Finished parsing XML at depth " + iD);
        }
        this.i.a(fsVar);
        if (nq.b(fsVar)) {
            int iIntValue = ((Integer) this.f1179a.a(oj.Q4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "VAST response is wrapper. Resolving...");
                }
                this.f1179a.l0().a(new in(this.i, this.h, this.f1179a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(gq.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (nq.a(fsVar)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "VAST response is inline. Rendering ad...");
            }
            this.f1179a.l0().a(new dn(this.i, this.h, this.f1179a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "VAST response is an error");
        }
        a(gq.NO_WRAPPER_RESPONSE);
    }

    public static bn a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static bn a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static bn a(fs fsVar, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(fsVar, fqVar, appLovinAdLoadListener, kVar);
    }

    void a(gq gqVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Failed to process VAST response due to VAST error code " + gqVar);
        }
        nq.a(this.i, this.h, gqVar, -6, this.f1179a);
    }

    private static final class c extends bn {
        private final JSONObject j;

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.j, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "No VAST response received.");
                }
                a(gq.NO_WRAPPER_RESPONSE);
                return;
            }
            if (string.length() >= ((Integer) this.f1179a.a(oj.P4)).intValue()) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "VAST response is over max length");
                }
                a(gq.XML_PARSING);
                return;
            }
            fs fsVarB = b(string);
            if (fsVarB != null) {
                a(fsVarB);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to process XML: " + string);
            }
            c(string);
            a(gq.XML_PARSING);
        }

        c(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            this.j = fqVar.b();
        }
    }

    private static final class b extends bn {
        private final String j;

        b(String str, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            this.j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            fs fsVarB = b(this.j);
            if (fsVarB != null) {
                a(fsVarB);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to process XML: " + this.j);
            }
            c(this.j);
            a(gq.XML_PARSING);
        }
    }

    private static final class d extends bn {
        private final fs j;

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Processing VAST Wrapper response...");
            }
            a(this.j);
        }

        d(fs fsVar, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            if (fsVar == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (fqVar == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener != null) {
                this.j = fsVar;
                return;
            }
            throw new IllegalArgumentException("No callback specified.");
        }
    }

    private static final class a extends fq {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        void a(fs fsVar) {
            if (fsVar != null) {
                this.b.add(fsVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }
}
