package com.json;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f5 {
    public static final String b = "userId";
    private static f5 c;

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f1771a = new JSONObject();

    private f5() {
    }

    public static synchronized f5 a() {
        if (c == null) {
            c = new f5();
        }
        return c;
    }

    public synchronized String a(String str) {
        return this.f1771a.optString(str);
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f1771a.put(str, obj);
        } catch (Exception unused) {
        }
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized JSONObject b() {
        return this.f1771a;
    }
}
