package com.mbridge.msdk.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MBDNSManager.java */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f2506a;
    private HashMap<String, f> b;

    private e() {
        this.f2506a = 6;
        this.b = new HashMap<>();
    }

    public static e a() {
        return a.f2507a;
    }

    public final int a(String str) {
        HashMap<String, f> map;
        f fVar;
        if (TextUtils.isEmpty(str) || (map = this.b) == null || !map.containsKey(str) || (fVar = this.b.get(str)) == null) {
            return 0;
        }
        int i = fVar.c() ? 1 : fVar.a() >= this.f2506a ? 2 : 0;
        fVar.a(false);
        return i;
    }

    public final String b(String str) {
        HashMap<String, f> map;
        f fVar;
        if (TextUtils.isEmpty(str) || (map = this.b) == null || !map.containsKey(str) || (fVar = this.b.get(str)) == null || fVar.a() >= this.f2506a) {
            return "";
        }
        String strB = fVar.b();
        if (!TextUtils.isEmpty(strB)) {
            fVar.a(true);
        }
        return strB;
    }

    public final void c(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.b == null) {
                this.b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.b.put(next, fVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void d(String str) {
        HashMap<String, f> map;
        f fVar;
        if (TextUtils.isEmpty(str) || (map = this.b) == null || !map.containsKey(str) || (fVar = this.b.get(str)) == null || fVar.a() >= this.f2506a) {
            return;
        }
        fVar.a(fVar.a() + 1);
    }

    public final void e(String str) {
        HashMap<String, f> map;
        f fVar;
        if (TextUtils.isEmpty(str) || (map = this.b) == null || !map.containsKey(str) || (fVar = this.b.get(str)) == null || fVar.a() >= this.f2506a) {
            return;
        }
        fVar.a(0);
    }

    /* compiled from: MBDNSManager.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f2507a = new e();
    }
}
