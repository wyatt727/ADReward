package com.json;

import android.content.Context;
import android.util.Pair;
import com.json.f7;
import com.json.k7;
import com.json.o4;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class n7 {
    public static f7.e a(t3 t3Var, f7.e eVar) {
        return (t3Var == null || t3Var.g() == null || t3Var.g().get("rewarded") == null) ? eVar : Boolean.parseBoolean(t3Var.g().get("rewarded")) ? f7.e.RewardedVideo : f7.e.Interstitial;
    }

    public static k7 a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        k7.b bVar = new k7.b();
        if (map != null && map.containsKey("sessionid")) {
            bVar.c(map.get("sessionid"));
        }
        bVar.a(context);
        return bVar.d(str).a(str2).a();
    }

    public static o4 a(JSONObject jSONObject) {
        return new o4.a(jSONObject.optString(m4.q)).b().b(jSONObject.optBoolean(m4.r)).a(new l7()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", m4.K));
        arrayList.add(new Pair<>(m4.L, m4.M));
        return arrayList;
    }

    public static boolean a(t3 t3Var) {
        if (t3Var == null || t3Var.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(t3Var.g().get("inAppBidding"));
    }
}
