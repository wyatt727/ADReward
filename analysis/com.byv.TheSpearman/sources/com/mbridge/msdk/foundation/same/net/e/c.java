package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: JsonArrayRequest.java */
/* loaded from: classes4.dex */
public class c extends e<JSONArray> {
    private static final String c = "c";

    public c(int i, String str, String str2, com.mbridge.msdk.foundation.same.net.e<JSONArray> eVar) {
        super(i, str, str2, eVar);
    }

    @Override // com.mbridge.msdk.foundation.same.net.i
    protected final k<JSONArray> a(com.mbridge.msdk.foundation.same.net.f.c cVar) {
        try {
            return k.a(new JSONArray(new String(cVar.f2886a, com.mbridge.msdk.foundation.same.net.g.b.a(cVar.b))), cVar);
        } catch (UnsupportedEncodingException e) {
            ad.b(c, e.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        } catch (JSONException e2) {
            ad.b(c, e2.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        }
    }
}
