package com.json;

import android.util.Log;
import com.json.hc;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class m7 {
    private static m7 b;

    /* renamed from: a, reason: collision with root package name */
    private t4 f1892a;

    private m7() {
    }

    private static m7 a() {
        if (b == null) {
            b = new m7();
        }
        return b;
    }

    public static void a(hc.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(hc.a aVar, Map<String, Object> map) {
        t4 t4Var = a().f1892a;
        if (t4Var == null) {
            Log.d(m4.f1889a, m4.T);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        t4Var.a(aVar.f1802a, map);
    }

    public static void a(o4 o4Var, k7 k7Var) {
        if (o4Var != null) {
            try {
                a().f1892a = new t4(o4Var, k7Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
