package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class fq {
    private static final List f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", MimeTypes.VIDEO_MATROSKA);

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f440a;
    private final JSONObject c;
    private final JSONObject d;
    protected List b = new ArrayList();
    private final long e = System.currentTimeMillis();

    public fq(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f440a = kVar;
        this.c = jSONObject;
        this.d = jSONObject2;
    }

    public int d() {
        return this.b.size();
    }

    public List a() {
        return this.b;
    }

    public JSONObject b() {
        return this.c;
    }

    public JSONObject e() {
        return this.d;
    }

    public long c() {
        return this.e;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f;
    }

    public int g() {
        return zp.a(JsonUtils.getInt(this.c, "video_completion_percent", -1));
    }
}
