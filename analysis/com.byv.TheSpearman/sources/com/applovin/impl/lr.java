package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lr {

    /* renamed from: a, reason: collision with root package name */
    private final String f634a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final List f;

    public String a() {
        return this.f634a;
    }

    public String b() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public List c() {
        return this.e;
    }

    public List d() {
        return this.f;
    }

    public lr(JSONObject jSONObject) {
        this.f634a = JsonUtils.getString(jSONObject, "user_type", TtmlNode.COMBINE_ALL);
        this.b = JsonUtils.getString(jSONObject, "device_type", TtmlNode.COMBINE_ALL);
        this.c = JsonUtils.getString(jSONObject, "min_age", null);
        this.d = JsonUtils.getString(jSONObject, "max_age", null);
        this.e = JsonUtils.getList(jSONObject, AndroidBridgeConstants.SEGMENT_GENDER, null);
        this.f = JsonUtils.getList(jSONObject, "keywords", null);
    }
}
