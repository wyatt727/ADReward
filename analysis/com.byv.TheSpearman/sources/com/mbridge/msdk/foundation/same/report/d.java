package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import android.util.Log;
import com.json.m4;
import com.json.t2;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: EventLibraryDecorate.java */
/* loaded from: classes4.dex */
public final class d implements com.mbridge.msdk.e.d {
    @Override // com.mbridge.msdk.e.d
    public final Map<String, String> a(com.mbridge.msdk.e.m mVar, List<com.mbridge.msdk.e.i> list, JSONObject jSONObject) {
        HashMap map;
        if (list != null && list.size() != 0) {
            c.a(jSONObject);
            if (jSONObject == null) {
                map = null;
            } else {
                map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, String.valueOf(jSONObject.opt(next)));
                }
            }
            if (map == null) {
                map = new HashMap();
            }
            try {
                map.put("data", a(list).toString());
                return map;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static StringBuilder a(List<com.mbridge.msdk.e.i> list) {
        com.mbridge.msdk.e.e eVarC;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.e.i iVar = list.get(i);
            if (iVar != null && (eVarC = iVar.c()) != null) {
                JSONObject jSONObjectD = eVarC.d();
                c.a(jSONObjectD);
                if (jSONObjectD == null) {
                    jSONObjectD = new JSONObject();
                }
                try {
                    try {
                        jSONObjectD.put("ts", eVarC.f());
                        int iD = iVar.d() - 1;
                        if (iD >= 1) {
                            jSONObjectD.put("retryed", iD);
                        }
                        long jG = eVarC.g();
                        if (jG > 0) {
                            jSONObjectD.put("duration", jG);
                        }
                    } catch (Exception e) {
                        if (com.mbridge.msdk.e.a.f2688a) {
                            Log.e("TrackManager", "decorateRequestParams: ", e);
                        }
                    }
                    sb.append(a(jSONObjectD));
                    if (i < list.size() - 1) {
                        sb.append("\n");
                    }
                } catch (Throwable th) {
                    sb.append(a(jSONObjectD));
                    throw th;
                }
            }
        }
        return sb;
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            i++;
            if (i <= jSONObject.length() - 1) {
                sb.append(next);
                sb.append(t2.i.b);
                sb.append(a(String.valueOf(jSONObject.opt(next))));
                sb.append(t2.i.c);
            } else {
                sb.append(next);
                sb.append(t2.i.b);
                sb.append(a(String.valueOf(jSONObject.opt(next))));
            }
        }
        return sb.toString();
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, m4.M);
        } catch (Exception unused) {
            return str;
        }
    }
}
