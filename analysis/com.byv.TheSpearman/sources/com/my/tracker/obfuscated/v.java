package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f4266a;
    private final String b;
    private final String c;
    private final boolean d;
    private final long e;
    private JSONObject f;
    private Long g;

    v(JSONObject jSONObject, String str, String str2, boolean z, long j) {
        this.b = str;
        this.f4266a = jSONObject;
        this.c = str2;
        this.d = z;
        this.e = j;
    }

    public static v a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
                return a(jSONObject, str2, j);
            }
            z0.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            z0.b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    public static v a(JSONObject jSONObject, String str, long j) {
        return new v(jSONObject, str, jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), jSONObject.has("autoRenewing"), j);
    }

    public v a(long j) {
        this.g = Long.valueOf(j);
        return this;
    }

    public v a(JSONObject jSONObject) {
        this.f = jSONObject;
        return this;
    }

    public String a() {
        return this.b;
    }

    public Long b() {
        return this.g;
    }

    public String c() {
        return this.c;
    }

    public JSONObject d() {
        return this.f4266a;
    }

    public JSONObject e() {
        return this.f;
    }

    public long f() {
        return this.e;
    }

    public boolean g() {
        return this.d;
    }
}
