package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f4218a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final boolean f;
    private final long g;
    private JSONObject h;
    private Long i;

    d(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, long j) {
        this.b = str;
        this.f4218a = jSONObject;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = z;
        this.g = j;
    }

    public static d a(String str, String str2, String str3, int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            if (!TextUtils.isEmpty(strOptString)) {
                return new d(jSONObject, str2, str3, strOptString, i, jSONObject.has("priceType") && jSONObject.getInt("priceType") == 2, j);
            }
            z0.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            z0.b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    public d a(long j) {
        this.i = Long.valueOf(j);
        return this;
    }

    public d a(JSONObject jSONObject) {
        this.h = jSONObject;
        return this;
    }

    public String a() {
        return this.b;
    }

    public Long b() {
        return this.i;
    }

    public String c() {
        return this.d;
    }

    public JSONObject d() {
        return this.h;
    }

    public JSONObject e() {
        return this.f4218a;
    }

    public String f() {
        return this.c;
    }

    public int g() {
        return this.e;
    }

    public long h() {
        return this.g;
    }
}
