package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.o5;
import com.my.target.q;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class o<T extends q> {
    public static JSONObject a(String str, o5.a aVar, o5 o5Var, List<String> list, n nVar) {
        m mVar;
        if (str != null) {
            str = str.trim();
        }
        if (str == null || "".equals(str)) {
            ba.a("AdResponseParser: Parsing ad response: empty data");
            mVar = m.j;
        } else {
            ba.a("AdResponseParser: Converting to JSON...");
            try {
                JSONObject jSONObject = new JSONObject(str);
                b(jSONObject);
                if (!a(jSONObject)) {
                    ba.a("AdResponseParser: Invalid json version");
                    nVar.a(m.k);
                    return null;
                }
                a(list, jSONObject);
                boolean zOptBoolean = jSONObject.optBoolean("sdk_ms", false);
                aVar.a(zOptBoolean);
                o5Var.a(zOptBoolean);
                ba.a("AdResponseParser: Done");
                return jSONObject;
            } catch (Throwable th) {
                ba.a("AdResponseParser: Parsing ad response error: " + th.getMessage());
                mVar = m.k;
            }
        }
        nVar.a(mVar);
        return null;
    }

    public static void a(List<String> list, JSONObject jSONObject) {
        if (list == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("hosts");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i, null);
                    if (TextUtils.isEmpty(strOptString)) {
                        ba.a("AdResponseParser: Invalid host-string at position " + i);
                    } else {
                        list.add(strOptString);
                    }
                }
            }
        } catch (Throwable unused) {
            ba.a("AdResponseParser Error: Exception while handling hosts");
        }
    }

    public static boolean a(String str) {
        String str2;
        String str3;
        if (str == null) {
            str2 = "AdResponseParser: Null data";
        } else {
            String strTrim = str.trim();
            if (strTrim.length() != 0) {
                if (isVast(strTrim)) {
                    str3 = "AdResponseParser: Vast is received";
                } else if (strTrim.startsWith("{") && strTrim.endsWith("}")) {
                    str3 = "AdResponseParser: JSON is received";
                } else {
                    str2 = "AdResponseParser: Unsupported data is received";
                }
                ba.a(str3);
                return true;
            }
            str2 = "AdResponseParser: Empty data";
        }
        ba.a(str2);
        return false;
    }

    public static boolean a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("version");
            ba.a("AdResponseParser: JSON version " + string);
            int iIndexOf = string.indexOf(".");
            if (iIndexOf > 0) {
                if (Integer.parseInt(string.substring(0, iIndexOf), 10) == 2) {
                    return true;
                }
            }
        } catch (Throwable th) {
            ba.a("AdResponseParser Error: Check version failed - " + th.getMessage());
        }
        return false;
    }

    public static void b(JSONObject jSONObject) {
        if (!ba.f3930a && jSONObject.optBoolean("sdk_debug_mode", false)) {
            ba.f3930a = true;
        }
    }

    public static boolean isVast(String str) {
        String strTrim = str.trim();
        return strTrim.startsWith("<VAST") || strTrim.startsWith("<?xml");
    }

    public abstract T a(String str, s sVar, T t, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context);
}
