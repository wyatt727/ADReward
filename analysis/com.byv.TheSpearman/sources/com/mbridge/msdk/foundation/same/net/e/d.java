package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonObjectRequest.java */
/* loaded from: classes4.dex */
public class d extends e<JSONObject> {
    private static final String c = "d";

    public d(int i, String str, String str2, com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        super(i, str, str2, eVar);
    }

    public d(int i, String str, String str2, com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar, boolean z) {
        super(i, str, str2, eVar, z);
    }

    @Override // com.mbridge.msdk.foundation.same.net.i
    protected final k<JSONObject> a(com.mbridge.msdk.foundation.same.net.f.c cVar) {
        try {
            String str = new String(cVar.f2886a, com.mbridge.msdk.foundation.same.net.g.b.a(cVar.b));
            if (cVar.d == 204) {
                return k.a(new JSONObject(), cVar);
            }
            return k.a(new JSONObject(str), cVar);
        } catch (UnsupportedEncodingException e) {
            ad.b(c, e.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        } catch (JSONException e2) {
            ad.b(c, e2.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        }
    }
}
