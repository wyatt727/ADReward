package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class en extends xl implements b4.e {
    private final com.applovin.impl.sdk.network.a h;
    private final b4.e i;
    private sm.b j;
    private oj k;
    private oj l;
    protected b4.b m;

    public abstract void a(String str, int i, String str2, Object obj);

    public abstract void a(String str, Object obj, int i);

    public en(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    class a implements b4.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f393a;

        a(com.applovin.impl.sdk.k kVar) {
            this.f393a = kVar;
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, int i, String str2, Object obj) {
            long millis;
            boolean z = false;
            boolean z2 = i < 200 || i >= 500;
            boolean z3 = i == 429;
            boolean z4 = i != -1009 || en.this.h.q();
            boolean z5 = (i == -900 || i == -1000) ? false : true;
            if (z4 && z5 && (z2 || z3 || en.this.h.p())) {
                String strA = en.this.h.a();
                if (en.this.h.j() <= 0) {
                    if (strA != null && strA.equals(en.this.h.f())) {
                        en enVar = en.this;
                        enVar.a(enVar.l);
                    } else {
                        en enVar2 = en.this;
                        enVar2.a(enVar2.k);
                    }
                    en enVar3 = en.this;
                    enVar3.a(enVar3.h.f(), i, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.t tVar = en.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    en enVar4 = en.this;
                    enVar4.c.k(enVar4.b, "Unable to send request due to server failure (code " + i + "). " + en.this.h.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(en.this.h.k()) + " seconds...");
                }
                int iJ = en.this.h.j() - 1;
                en.this.h.a(iJ);
                if ((((Boolean) this.f393a.a(oj.F)).booleanValue() && en.this.h.f().endsWith("4.0/ad")) || iJ == 0) {
                    en enVar5 = en.this;
                    enVar5.a(enVar5.k);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.t tVar2 = en.this.c;
                        if (com.applovin.impl.sdk.t.a()) {
                            en enVar6 = en.this;
                            enVar6.c.d(enVar6.b, "Switching to backup endpoint " + strA);
                        }
                        en.this.h.a(strA);
                        z = true;
                    }
                }
                if (((Boolean) this.f393a.a(oj.p3)).booleanValue() && z) {
                    millis = 0;
                } else {
                    millis = en.this.h.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, en.this.h.c())) : en.this.h.k();
                }
                sm smVarL0 = this.f393a.l0();
                en enVar7 = en.this;
                smVarL0.a(enVar7, enVar7.j, millis);
                return;
            }
            en enVar8 = en.this;
            enVar8.a(enVar8.h.f(), i, str2, obj);
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, Object obj, int i) {
            en.this.h.a(0);
            en.this.a(str, obj, i);
        }
    }

    public en(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z) {
        super("TaskRepeatRequest", kVar, z);
        this.j = sm.b.OTHER;
        this.k = null;
        this.l = null;
        if (aVar != null) {
            a(aVar.f());
            this.h = aVar;
            this.m = new b4.b();
            this.i = new a(kVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    @Override // java.lang.Runnable
    public void run() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        b4 b4VarR = b().r();
        if (!b().A0() && !b().y0()) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.h.f(), -22, null, null);
        } else if (StringUtils.isValidString(this.h.f()) && this.h.f().length() >= 4) {
            if (TextUtils.isEmpty(this.h.h())) {
                this.h.b(this.h.b() != null ? "POST" : "GET");
            }
            b4VarR.a(this.h, this.m, this.i);
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Task has an invalid or null request endpoint.");
            }
            a(this.h.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        }
    }

    public void c(oj ojVar) {
        this.k = ojVar;
    }

    public void b(oj ojVar) {
        this.l = ojVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(oj ojVar) {
        if (ojVar != null) {
            b().h0().a(ojVar, ojVar.a());
        }
    }

    public void a(sm.b bVar) {
        this.j = bVar;
    }
}
