package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import com.applovin.impl.h0;
import com.applovin.impl.h8;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, h8 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f915a;
    private h0 b;
    private boolean c;
    private c d;

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f915a = new Bundle();
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && a() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdB;
        if ((obj instanceof c) && (appLovinAdB = ((c) obj).b()) != null) {
            obj = appLovinAdB;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    public c getDummyAd() {
        return this.d;
    }

    public Bundle getMAXAdValues() {
        return this.f915a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String string;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.h8
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return a() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.L();
        if (!t.a()) {
            return false;
        }
        this.sdk.L().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.d = cVar;
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        this.c = true;
    }

    public void setHasShown(boolean z) {
        try {
            ql qlVar = this.synchronizedAdObject;
            if (qlVar != null) {
                qlVar.a("shown", (Object) Boolean.valueOf(z));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f915a);
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", Boolean.FALSE);
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"" + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(final String str, final String str2) {
        ql qlVar = this.synchronizedAdObject;
        return qlVar != null ? (String) qlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.AppLovinAdImpl$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return AppLovinAdImpl.a(str, str2, (ql) obj);
            }
        }) : JsonUtils.getString(getJsonObjectFromAdObject("ad_values", new JSONObject()), str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(String str, String str2, ql qlVar) {
        return JsonUtils.getString(qlVar.a("ad_values", new JSONObject()), str, str2);
    }

    private long a() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(oj.p1)).longValue());
    }

    public h0 getAdZone() {
        h0 h0Var = this.b;
        if (h0Var != null) {
            if (h0Var.f() != null && this.b.g() != null) {
                return this.b;
            }
            if (getSize() == null && getType() == null) {
                return this.b;
            }
        }
        h0 h0VarA = h0.a(getSize(), getType(), getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.b = h0VarA;
        return h0VarA;
    }
}
