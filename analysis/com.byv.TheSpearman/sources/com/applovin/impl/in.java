package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
class in extends xl {
    private final fq h;
    private final AppLovinAdLoadListener i;

    in(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.i = appLovinAdLoadListener;
        this.h = fqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = nq.a(this.h);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Resolving VAST ad with depth " + this.h.d() + " at " + strA);
            }
            try {
                this.f1179a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.f1179a).b(strA).c("GET").a(fs.f).a(((Integer) this.f1179a.a(oj.U4)).intValue()).c(((Integer) this.f1179a.a(oj.V4)).intValue()).a(false).a(), this.f1179a));
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Unable to resolve VAST wrapper", th);
                }
                a(-1);
                return;
            }
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        nq.a(this.h, this.i, i == -1001 ? gq.TIMED_OUT : gq.GENERAL_WRAPPER_ERROR, i, this.f1179a);
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, fs fsVar, int i) {
            this.f1179a.l0().a(bn.a(fsVar, in.this.h, in.this.i, in.this.f1179a));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, fs fsVar) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            in.this.a(i);
        }
    }
}
