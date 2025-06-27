package com.mbridge.msdk.newreward.function.d.b;

import com.mbridge.msdk.e.a.m;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.a.u;
import com.mbridge.msdk.e.a.y;
import com.mbridge.msdk.e.a.z;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: RewardSettingRequest.java */
/* loaded from: classes4.dex */
public final class g extends p<JSONObject> implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public static int f3350a = 0;
    public static int b = 1;
    private e c;
    private HashMap<String, String> d;
    private Map<String, String> e;

    @Override // com.mbridge.msdk.e.a.p
    protected final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        e eVar = this.c;
        if (eVar == null) {
            return;
        }
        try {
            if (jSONObject2 == null) {
                eVar.a(this, new d(-1));
            } else {
                eVar.a(jSONObject2, this);
            }
        } catch (Exception e) {
            ad.a("RewardSettingRequest", "onError Exception: ", e);
        }
    }

    public g(String str) {
        super(0, str);
    }

    public final void a(e eVar) {
        this.c = eVar;
    }

    public final void a(Map<String, String> map) {
        if (this.d == null) {
            this.d = new HashMap<>();
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        this.d.putAll(map);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        if (this.d == null) {
            this.d = new HashMap<>();
        }
        return this.d;
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final r<JSONObject> a(m mVar) {
        if (mVar != null) {
            try {
                if (mVar.b != null && mVar.b.length != 0) {
                    return r.a(new JSONObject(new String(mVar.b, com.mbridge.msdk.e.a.a.e.a(mVar.c))), com.mbridge.msdk.e.a.a.e.a(mVar));
                }
            } catch (UnsupportedEncodingException e) {
                ad.a("RewardSettingRequest", "parseNetworkResponse UnsupportedEncodingException: ", e);
                return r.a(new com.mbridge.msdk.e.a.g(e));
            } catch (Exception e2) {
                ad.a("RewardSettingRequest", "parseNetworkResponse Exception: ", e2);
                return r.a(new y(e2));
            }
        }
        return r.a(new u());
    }

    public final void a(String str, String str2) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(str, str2);
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        Map<String, String> map = this.e;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        this.e = map2;
        return map2;
    }

    @Override // com.mbridge.msdk.e.a.r.a
    public final void a(z zVar) {
        this.c.a(this, new d(-1, zVar.getMessage()));
    }
}
