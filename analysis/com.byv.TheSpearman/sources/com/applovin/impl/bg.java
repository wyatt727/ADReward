package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.vi;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.google.firebase.sessions.BuildConfig;
import com.json.t2;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bg extends vi {
    private final String e;
    private final String f;
    private final String g;
    private String h;

    public bg(String str, String str2, String str3, com.applovin.impl.sdk.k kVar) {
        super("NimbusApiService", kVar);
        this.e = str;
        this.h = UUID.randomUUID().toString().toLowerCase(Locale.US);
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a(this.b, "Initializing Nimbus with apiKey=" + str + ", pubId=" + str2 + ", sessionId=" + this.h);
        }
        this.f = "https://" + str2 + "." + (StringUtils.isValidString(str3) ? str3 : "adsbynimbus.com/rta/v1");
        qj qjVar = rj.S;
        String string = (String) kVar.a(qjVar, (Object) null, this.c);
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            kVar.b(qjVar, string, this.c);
        }
        this.g = string;
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a(this.b, "Setting Nimbus instanceId=" + string);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        a((MaxAdapterParameters) maxAdapterInitializationParameters);
    }

    class a extends en {
        final /* synthetic */ MaxAdapterResponseParameters n;
        final /* synthetic */ MaxAdFormat o;
        final /* synthetic */ AppLovinAdLoadListener p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinAdLoadListener appLovinAdLoadListener) {
            super(aVar, kVar);
            this.n = maxAdapterResponseParameters;
            this.o = maxAdFormat;
            this.p = appLovinAdLoadListener;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) throws JSONException {
            if (jSONObject != null && "No Bid".equalsIgnoreCase(JsonUtils.getString(jSONObject, "message", null))) {
                Object object = JsonUtils.getObject(jSONObject, "nbr", null);
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "Nimbus request for " + this.n.getThirdPartyAdPlacementId() + " returned with no fill code: " + object);
                }
                this.p.failedToReceiveAd(204);
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to fetch " + this.n.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i);
            }
            this.p.failedToReceiveAd(i);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200 && jSONObject != null) {
                this.f1179a.l0().a(new ym(jSONObject, this.n, this.o, bg.this.h, this.p, this.f1179a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to fetch " + this.n.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i);
            }
            this.p.failedToReceiveAd(i);
        }
    }

    public void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinAdLoadListener appLovinAdLoadListener) throws JSONException {
        Map mapL;
        this.f1096a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f1096a.L().a(this.b, "Loading Nimbus " + maxAdFormat.getLabel() + " ad with position: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        }
        a(maxAdapterResponseParameters);
        if (this.f1096a.y() != null) {
            mapL = this.f1096a.y().d();
        } else {
            mapL = this.f1096a.x().l();
        }
        HashMap map = new HashMap();
        map.put("x-openrtb-version", "2.5");
        map.put("Nimbus-Api-Key", this.e);
        map.put("Nimbus-Sdkv", BuildConfig.VERSION_NAME);
        map.put("Nimbus-Instance-Id", this.g);
        map.put("User-Agent", String.valueOf(mapL.get(com.json.i5.R)));
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session_id", this.h);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, t2.h.L, maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.f1096a.l0().a(new a(a(this.f, UUID.randomUUID().toString().toLowerCase(Locale.US), maxAdapterResponseParameters, maxAdFormat, vi.a.a().a(jSONObject).c(a()).b(jSONObject2).d(b()).a(), map, true, this.f1096a), this.f1096a, maxAdapterResponseParameters, maxAdFormat, appLovinAdLoadListener));
    }

    private void a(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("session_id");
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isValidString(str)) {
                this.f1096a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f1096a.L().a(this.b, "Updating Nimbus sessionId to " + obj);
                }
                this.h = str;
            }
        }
    }
}
