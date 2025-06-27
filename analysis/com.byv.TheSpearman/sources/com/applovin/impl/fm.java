package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fm extends xl {
    private final com.applovin.impl.sdk.network.e h;
    private final AppLovinPostbackListener i;
    private final sm.b j;

    public fm(com.applovin.impl.sdk.network.e eVar, sm.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar != null) {
            this.h = eVar;
            this.i = appLovinPostbackListener;
            this.j = bVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!StringUtils.isValidString(this.h.f())) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.d(this.b, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.i;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.h.f(), AppLovinErrorCodes.INVALID_URL);
                return;
            }
            return;
        }
        if (this.h.u()) {
            b().u0().a(this.h, new a());
        } else {
            e();
        }
    }

    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (fm.this.i != null) {
                fm.this.i.onPostbackSuccess(fm.this.h.f());
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            fm.this.e();
        }
    }

    class b extends en {
        final String n;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.n = fm.this.h.f();
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, Object obj, int i) {
            if (obj instanceof String) {
                for (String str2 : this.f1179a.c(oj.F0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                c4.c(jSONObject, this.f1179a);
                                c4.b(jSONObject, this.f1179a);
                                c4.a(jSONObject, this.f1179a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (fm.this.i != null) {
                fm.this.i.onPostbackSuccess(this.n);
            }
            if (fm.this.h.t()) {
                this.f1179a.o().a(fm.this.h.s(), this.n, i, obj, null, true);
            }
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, Object obj) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Failed to dispatch postback. Error code: " + i + " URL: " + this.n);
            }
            if (fm.this.i != null) {
                fm.this.i.onPostbackFailure(this.n, i);
            }
            if (fm.this.h.t()) {
                this.f1179a.o().a(fm.this.h.s(), this.n, i, obj, str2, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.h, b());
        bVar.a(this.j);
        b().l0().a(bVar);
    }
}
