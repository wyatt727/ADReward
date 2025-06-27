package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rq {

    /* renamed from: a, reason: collision with root package name */
    private final int f868a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f868a + ", heightPercentOfScreen=" + this.b + ", margin=" + this.c + ", gravity=" + this.d + ", tapToFade=" + this.e + ", tapToFadeDurationMillis=" + this.f + ", fadeInDurationMillis=" + this.g + ", fadeOutDurationMillis=" + this.h + ", fadeInDelay=" + this.i + ", fadeOutDelay=" + this.j + AbstractJsonLexerKt.END_OBJ;
    }

    public rq(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f868a = JsonUtils.getInt(jSONObject, "width", 64);
        this.b = JsonUtils.getInt(jSONObject, "height", 7);
        this.c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public int i() {
        return this.f868a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public boolean j() {
        return this.e;
    }

    public long h() {
        return this.f;
    }

    public long b() {
        return this.g;
    }

    public long d() {
        return this.h;
    }

    public float a() {
        return this.i;
    }

    public float c() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rq rqVar = (rq) obj;
        return this.f868a == rqVar.f868a && this.b == rqVar.b && this.c == rqVar.c && this.d == rqVar.d && this.e == rqVar.e && this.f == rqVar.f && this.g == rqVar.g && this.h == rqVar.h && Float.compare(rqVar.i, this.i) == 0 && Float.compare(rqVar.j, this.j) == 0;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f868a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
        float f = this.i;
        int iFloatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.j;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
